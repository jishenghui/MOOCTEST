/*
 * This source code is placed in the public domain. This means you can use it
 * without any restrictions.
 */

package net.mooctest;

import java.util.AbstractList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.NoSuchElementException;
import java.io.Serializable;
import java.util.ConcurrentModificationException;

/**
 * 一个展开的链表实现
 * {@link java.util.List List} 接口。它提供更好的性能
 * 而不是 {{@link java.util.LinkedList LinkedList} 类。
 *
 * <p><strong>请注意，此 implementation 不会同步。</strong>
 * 如果多个线程同时访问链表，并且至少是
 * 其中一个线程在结构上修改了列表，它<i>必须是</i>
 * 外部同步。 （结构修改是任何操作
 * 添加或删除一个或多个元素的 *;只需设置
 * 元素不是结构修饰。 这通常是
 * 通过同步自然
 * 封装列表。
 * <p>
 * 如果不存在此类对象，则应使用
 * {@link java.util.Collections# synchronizedList Collections.synchronizedList}
 * 方法。 最好在创建时执行此操作，以防止意外
 * 对列表的非同步访问：<pre>
 * 列表列表 = Collections.synchronizedList（new LinkedList（...））;</pre>
 *
 * <p>此类的<tt>迭代器</tt>返回的迭代器，并且
 * <tt>* listIterator</tt> 方法是<i>快速失败</i>的：如果列表是
 * 在创建迭代器后的任何时间进行结构修改，在
 * 除了通过 Iterator 自己的 <tt>remove</tt> 或
 * <tt>* add</tt> 方法，则迭代器将抛出一个 {@link
 * ConcurrentModificationException} 的 Fragment AtionException。 因此，面对并发
 * 修改后，迭代器会快速而干净地失败，而不是
 * 冒着在未确定的
 * 未来的时间。
 *
 * @param <E> 此集合中保存的元素类型
 * @see <a href=“http://en.wikipedia.org/wiki/Unrolled_linked_list”>Unrolled_linked_list</a>
 */

//TODO：实现 java.util.List.addAll（int index， Collection<？ extends E> c）
//方法。当前实现是继承的
//从 java.util.AbstractList 类中。
//TODO： 测试

public class UnrolledLinkedList<E> extends AbstractList<E> implements List<E>, Serializable {

    /**
     * 单个节点中可以存储的最大元素数。
     */
    public int nodeCapacity;

    /**
     * 此列表的当前大小。
     */
    public int size = 0;

    /**
     * 此列表的第一个节点。
     */
    public Node firstNode;

    /**
     * 此列表的最后一个节点。
     */
    public Node lastNode;

    /**
     * 使用指定的
     * {@link UnrolledLinkedList#nodeCapacity nodeCapacity} 的性能
     * 原因 <tt>nodeCapacity</tt> 必须大于或等于 8。
     *
     * @param nodeCapacity 最大元素数
     *                     可以存储在单个节点中。
     * @throws <tt>nodeCapacity</tt> 小于 8，则 @throws IllegalArgumentException
     */
    public UnrolledLinkedList(int nodeCapacity) throws IllegalArgumentException {

        if (nodeCapacity < 8) {
            throw new IllegalArgumentException("nodeCapacity < 8");
        }
        this.nodeCapacity = nodeCapacity;
        firstNode = new Node();
        lastNode = firstNode;

    }

    /**
     * 构造一个空列表
     * {@link UnrolledLinkedList#nodeCapacity nodeCapacity} 为 16。
     */
    public UnrolledLinkedList() {

        this(16);

    }

    /**
     * 返回此列表中的元素数。
     *
     * @return此列表中的元素数
     */
    public int size() {

        return size;

    }

    /**
     * 如果此列表不包含任何元素，则返回 <tt>true</tt>。
     *
     * @return 如果此列表不包含任何元素，则为 <tt>true</tt>@return
     */
    @Override
    public boolean isEmpty() {

        return (size == 0);

    }

    /**
     * 如果此列表包含指定的元素，则返回 <tt>true</tt>。
     * 更正式地说<tt>，当且</tt>仅当此列表包含
     * 至少一个元素 <tt>e</tt>，使得
     * <tt>（o==null&nbsp;？&nbsp;e==null&nbsp;：&nbsp;o.equals（e）））.</tt>
     *
     * @param o 要测试其在此列表中的 o 元素
     *          如果此列表包含指定的元素，@return则为 true，则为 <tt>true</tt>。
     */
    @Override
    public boolean contains(Object o) {

        return (indexOf(o) != -1);

    }

    /**
     * 以正确的顺序返回此列表中元素的迭代器。
     *
     * @return 按适当的顺序在此列表中的元素上@return迭代器
     */
    @Override
    public Iterator<E> iterator() {

        return new ULLIterator(firstNode, 0, 0);

    }

    /**
     * 返回包含此列表中所有元素的数组
     * 按正确的顺序（从第一个元素到最后一个元素）。
     *
     * <p>返回的数组将是“安全的”，因为对它的引用都不是
     * 由此列表维护。 （换句话说，此方法必须分配
     * 一个新数组）。 因此，调用方可以自由修改返回的数组。
     *
     * <p>此方法充当基于数组和基于集合之间的桥梁
     * 蜜蜂属。
     *
     * @return 包含此列表中所有元素的数组
     * 按适当的顺序
     */
    @Override
    public Object[] toArray() {

        Object[] array = new Object[size];
        int p = 0;
        for (Node node = firstNode; node != null; node = node.next) {
            for (int i = 0; i < node.numElements; i++) {
                array[p] = node.elements[i];
                p++;
            }
        }
        return array;

    }

    /**
     * 返回包含此列表中所有元素的数组
     * 按正确的顺序（从第一个元素到最后一个元素）。
     *
     * <p>返回的数组将是“安全的”，因为对它的引用都不是
     * 由此列表维护。 （换句话说，此方法必须分配
     * 一个新数组）。 因此，调用方可以自由修改返回的数组。
     *
     * <p>此方法充当基于数组和基于集合之间的桥梁
     * 蜜蜂属。
     *
     * @return 包含此列表中所有元素的数组
     * 按适当的顺序
     */
    @Override
    public <T> T[] toArray(T[] a) {

        if (a.length < size) {
            a = (T[]) java.lang.reflect.Array.newInstance(
                    a.getClass().getComponentType(), size);
        }
        Object[] result = a;
        int p = 0;
        for (Node node = firstNode; node != null; node = node.next) {
            for (int i = 0; i < node.numElements; i++) {
                result[p] = node.elements[i];
                p++;
            }
        }
        return a;

    }

    /**
     * Appends the specified element to the end of this list.
     *
     * @param e element to be appended to this list
     * @return <tt>true</tt> (as specified by {@link Collection#add})
     */
    @Override
    public boolean add(E e) {

        insertIntoNode(lastNode, lastNode.numElements, e);
        return true;

    }

    /**
     * 从此列表中删除指定元素的第一个匹配项，
     * 如果存在。 如果此列表不包含元素，则为
     * 变。 更正式地说，删除索引最低的元素
     * <tt>i</tt> 这样
     * <tt>（o==null&nbsp;？&nbsp;get（i）==null&nbsp;：&nbsp;o.equals（get（i）））</tt>
     * （如果存在此类元素）。 <tt>如果此</tt>列表
     * 包含指定的元素（或者等效地，如果此列表
     * 因调用而更改）。
     * <p>
     * 要从此列表中删除的 @param o 元素（如果存在）
     * 如果此列表包含指定的元素，则@return <tt>true</tt>
     */
    @Override
    public boolean remove(Object o) {

        int index = 0;
        Node node = firstNode;
        if (o == null) {
            while (node != null) {
                for (int ptr = 0; ptr < node.numElements; ptr++) {
                    if (node.elements[ptr] == null) {
                        removeFromNode(node, ptr);
                        return true;
                    }
                }
                index += node.numElements;
                node = node.next;
            }
        } else {
            while (node != null) {
                for (int ptr = 0; ptr < node.numElements; ptr++) {
                    if (o.equals(node.elements[ptr])) {
                        removeFromNode(node, ptr);
                        return true;
                    }
                }
                index += node.numElements;
                node = node.next;
            }
        }
        return false;

    }

    /**
     * <tt>如果此</tt>列表包含
     * 指定集合。
     *
     * @param c 集合将检查是否包含在此列表中
     *          <tt>@return如果此</tt>列表包含
     *          指定集合
     *          如果指定的集合为 null，则@throws NullPointerException
     * @see #contains（对象）
     */
    @Override
    public boolean containsAll(Collection<?> c) {

        if (c == null) {
            throw new NullPointerException();
        }
        Iterator<?> it = c.iterator();
        while (it.hasNext()) {
            if (!contains(it.next())) {
                return false;
            }
        }
        return true;

    }

    /**
     * Appends all of the elements in the specified collection to the end of
     * this list, in the order that they are returned by the specified
     * collection's iterator.  The behavior of this
     * operation is undefined if the specified collection is modified while
     * the operation is in progress.  (Note that this will occur if the
     * specified collection is this list, and it's nonempty.)
     *
     * @param c collection containing elements to be added to this list
     * @return <tt>true</tt> if this list changed as a result of the call
     * @throws NullPointerException if the specified collection is null
     * @see #add(Object)
     */
    @Override
    public boolean addAll(Collection<? extends E> c) {

        if (c == null) {
            throw new NullPointerException();
        }
        boolean changed = false;
        Iterator<? extends E> it = c.iterator();
        while (it.hasNext()) {
            add(it.next());
            changed = true;
        }
        return changed;

    }

    /**
     * 从此列表中删除
     * 指定集合。
     *
     * @param c 包含要从此列表中删除的元素的集合
     * @return 如果此列表因调用而更改，则 <tt>true</tt>
     * @throws NullPointerException 如果指定的集合为 null，则 NullPointerException
     * @see #remove（对象）
     * @see #contains（对象）
     */
    @Override
    public boolean removeAll(Collection<?> c) {

        if (c == null) {
            throw new NullPointerException();
        }
        Iterator<?> it = c.iterator();
        boolean changed = false;
        while (it.hasNext()) {
            if (remove(it.next())) {
                changed = true;
            }
        }
        return changed;

    }

    /**
     * 仅保留此列表中包含在
     * 指定集合。 换句话说，移除
     * 从此列表中不包含在指定
     * 收集。
     *
     * @param c 包含要保留在此列表中的元素的集合
     * @return 如果此列表因调用而更改，则@return <tt>true</tt>
     * @throws NullPointerException 如果指定的集合为 null，则@throws NullPointerException
     * @see #remove（对象）
     * @see #contains（对象）
     */
    @Override
    public boolean retainAll(Collection<?> c) {

        if (c == null) {
            throw new NullPointerException();
        }
        boolean changed = false;
        for (Node node = firstNode; node != null; node = node.next) {
            for (int i = 0; i < node.numElements; i++) {
                if (!c.contains(node.elements[i])) {
                    removeFromNode(node, i);
                    i--;
                    changed = true;
                }
            }
        }
        return changed;

    }

    /**
     * 从此列表中删除所有元素。
     */
    @Override
    public void clear() {

        Node node = firstNode.next;
        while (node != null) {
            Node next = node.next;
            node.next = null;
            node.previous = null;
            node.elements = null;
            node = next;
        }
        lastNode = firstNode;
        for (int ptr = 0; ptr < firstNode.numElements; ptr++) {
            firstNode.elements[ptr] = null;
        }
        firstNode.numElements = 0;
        firstNode.next = null;
        size = 0;

    }

    /**
     * 返回此列表中指定位置的元素。
     *
     * @param index 要返回的元素的索引索引
     * @return 在此列表中的指定位置@return元素
     * @throws IndexOutOfBoundsException {@inheritDoc}
     */
    public E get(int index) throws IndexOutOfBoundsException {

        if (index < 0 || index >= size) {
            throw new IndexOutOfBoundsException();
        }
        Node node;
        int p = 0;
        if (size - index > index) {
            node = firstNode;
            while (p <= index - node.numElements) {
                p += node.numElements;
                node = node.next;
            }
        } else {
            node = lastNode;
            p = size;
            while ((p -= node.numElements) > index) {
                node = node.previous;
            }
        }
        return (E) node.elements[index - p];

    }

    /**
     * 将此列表中指定位置的元素替换为
     * 指定元素。
     *
     * @param index   要替换的元素的索引索引
     * @param element 要存储在指定位置的元素
     * @return 将元素之前位于指定位置
     * @throws IndexOutOfBoundsException {@inheritDoc}
     */
    @Override
    public E set(int index, E element) {

        if (index < 0 || index >= size) {
            throw new IndexOutOfBoundsException();
        }
        E el = null;
        Node node;
        int p = 0;
        if (size - index > index) {
            node = firstNode;
            while (p <= index - node.numElements) {
                p += node.numElements;
                node = node.next;
            }
        } else {
            node = lastNode;
            p = size;
            while ((p -= node.numElements) > index) {
                node = node.previous;
            }
        }
        el = (E) node.elements[index - p];
        node.elements[index - p] = element;
        return el;

    }

    /**
     * 在此列表中的指定位置插入指定的元素。
     * 移动当前位于该位置的元素 （如果有） 和任何
     * 右侧的后续元素（在其索引中添加 1）。
     *
     * @param index 要插入指定元素的索引索引
     * @param element 要插入的元素
     * @throws IndexOutOfBoundsException {@inheritDoc}
     */
    @Override
    public void add(int index, E element) throws IndexOutOfBoundsException {

        if (index < 0 || index > size) {
            throw new IndexOutOfBoundsException();
        }
        Node node;
        int p = 0;
        if (size - index > index) {
            node = firstNode;
            while (p <= index - node.numElements) {
                p += node.numElements;
                node = node.next;
            }
        } else {
            node = lastNode;
            p = size;
            while ((p -= node.numElements) > index) {
                node = node.previous;
            }
        }
        insertIntoNode(node, index - p, element);

    }

    /**
     * 删除此列表中指定位置的元素。 移动任意
     * 左侧的后续元素（从其索引中减去 1）。
     * 返回从列表中删除的元素。
     *
     * @param index 为要删除的元素的索引编制索引
     * @return 之前位于指定位置的元素
     * @throws IndexOutOfBoundsException {@inheritDoc}
     */
    @Override
    public E remove(int index) throws IndexOutOfBoundsException {

        if (index < 0 || index >= size) {
            throw new IndexOutOfBoundsException();
        }
        E element = null;
        Node node;
        int p = 0;
        if (size - index > index) {
            node = firstNode;
            while (p <= index - node.numElements) {
                p += node.numElements;
                node = node.next;
            }
        } else {
            node = lastNode;
            p = size;
            while ((p -= node.numElements) > index) {
                node = node.previous;
            }
        }
        element = (E) node.elements[index - p];
        removeFromNode(node, index - p);
        return element;

    }

    /**
     * Returns the index of the first occurrence of the specified element
     * in this list, or -1 if this list does not contain the element.
     * More formally, returns the lowest index <tt>i</tt> such that
     * <tt>(o==null&nbsp;?&nbsp;get(i)==null&nbsp;:&nbsp;o.equals(get(i)))</tt>,
     * or -1 if there is no such index.
     *
     * @param o element to search for
     * @return the index of the first occurrence of the specified element in
     * this list, or -1 if this list does not contain the element
     */
    @Override
    public int indexOf(Object o) {

        int index = 0;
        Node node = firstNode;
        if (o == null) {
            while (node != null) {
                for (int ptr = 0; ptr < node.numElements; ptr++) {
                    if (node.elements[ptr] == null) {
                        return index + ptr;
                    }
                }
                index += node.numElements;
                node = node.next;
            }
        } else {
            while (node != null) {
                for (int ptr = 0; ptr < node.numElements; ptr++) {
                    if (o.equals(node.elements[ptr])) {
                        return index + ptr;
                    }
                }
                index += node.numElements;
                node = node.next;
            }
        }
        return -1;

    }

    /**
     * 返回指定元素的最后一次出现的索引
     * ，如果此列表不包含元素，则为 -1。
     * 更正式地说，返回最高索引 <tt>i</tt>，使得
     * <tt>（o==null&nbsp;？&nbsp;get（i）==null&nbsp;：&nbsp;o.equals（get（i）））），</tt>
     * 或 -1（如果没有此类索引）。
     *
     * @param o 要搜索的 o 元素
     * @return 中指定元素最后一次出现的索引
     * 此列表，如果此列表不包含元素，则为 -1
     */
    @Override
    public int lastIndexOf(Object o) {

        int index = size;
        Node node = lastNode;
        if (o == null) {
            while (node != null) {
                index -= node.numElements;
                for (int i = node.numElements - 1; i >= 0; i--) {
                    if (node.elements[i] == null) {
                        return (index + i);
                    }
                }
                node = node.previous;
            }
        } else {
            while (node != null) {
                index -= node.numElements;
                for (int i = node.numElements - 1; i >= 0; i--) {
                    if (o.equals(node.elements[i])) {
                        return (index + i);
                    }
                }
                node = node.previous;
            }
        }
        return -1;

    }

    /**
     * Returns a list iterator over the elements in this list (in proper
     * sequence).
     *
     * @return a list iterator over the elements in this list (in proper
     * sequence)
     */
    @Override
    public ListIterator<E> listIterator() {

        return new ULLIterator(firstNode, 0, 0);

    }

    /**
     * 返回此列表中元素的列表迭代器（在适当的
     * 序列），从列表中的指定位置开始。
     * 遵守 <tt>List.listIterator（int）</tt> 的通用契约。<p>
     * <p>
     * 列表迭代器是 <i>fail-fast</i>：如果列表在结构上是
     * 在创建 Iterator 后的任何时间修改，除
     * 通过 List-Iterator 自己的 <tt>remove</tt> 或 <tt>add</tt>
     * 方法，列表迭代器将抛出一个
     * <tt>ConcurrentModificationException 的 Fragment Exception</tt>。 因此，面对
     * 并发修改，则迭代器会快速而干净地失败，而是
     * 比在未确定的
     * 未来的时间。
     *
     * @param index 要从
     * list-iterator （通过调用 <tt>next</tt>）
     * @return 此列表中元素的 ListIterator（在适当的
     * 序列），从列表中的指定位置开始
     * @throws IndexOutOfBoundsException {@inheritDoc}
     * @see List#listIterator（int）
     */
    @Override
    public ListIterator<E> listIterator(int index) {

        if (index < 0 || index > size) {
            throw new IndexOutOfBoundsException();
        }
        Node node;
        int p = 0;
        if (size - index > index) {
            node = firstNode;
            while (p <= index - node.numElements) {
                p += node.numElements;
                node = node.next;
            }
        } else {
            node = lastNode;
            p = size;
            while ((p -= node.numElements) > index) {
                node = node.previous;
            }
        }
        return new ULLIterator(node, index - p, index);

    }

    public static final long serialVersionUID = -674052309103045211L;

    public class Node {

        /**
         * The next node.
         */
        Node next;

        /**
         * The previous node.
         */
        Node previous;

        /**
         * 此节点中存储的元素数。
         */
        int numElements = 0;

        /**
         * The array in which the elements are stored.
         */
        Object[] elements;

        /**
         * Constructs a new node.
         */
        Node() {

            elements = new Object[nodeCapacity];

        }

    }

    public class ULLIterator implements ListIterator<E> {

        Node currentNode;
        int ptr;
        int index;

        public int expectedModCount = modCount;

        ULLIterator(Node node, int ptr, int index) {

            this.currentNode = node;
            this.ptr = ptr;
            this.index = index;

        }

        @Override
        public boolean hasNext() {

            return (index < size - 1);

        }

        @Override
        public E next() {

            ptr++;
            if (ptr >= currentNode.numElements) {
                if (currentNode.next != null) {
                    currentNode = currentNode.next;
                    ptr = 0;
                } else {
                    throw new NoSuchElementException();
                }
            }
            index++;
            checkForModification();
            return (E) currentNode.elements[ptr];

        }

        @Override
        public boolean hasPrevious() {

            return (index > 0);

        }

        @Override
        public E previous() {

            ptr--;
            if (ptr < 0) {
                if (currentNode.previous != null) {
                    currentNode = currentNode.previous;
                    ptr = currentNode.numElements - 1;
                } else {
                    throw new NoSuchElementException();
                }
            }
            index--;
            checkForModification();
            return (E) currentNode.elements[ptr];

        }

        @Override
        public int nextIndex() {

            return (index + 1);

        }

        @Override
        public int previousIndex() {

            return (index - 1);

        }

        @Override
        public void remove() {

            checkForModification();
            removeFromNode(currentNode, ptr);

        }

        @Override
        public void set(E e) {

            checkForModification();
            currentNode.elements[ptr] = e;

        }

        @Override
        public void add(E e) {

            checkForModification();
            insertIntoNode(currentNode, ptr + 1, e);

        }

        public void checkForModification() {

            if (modCount != expectedModCount) {
                throw new ConcurrentModificationException();
            }

        }

    }

    /**
     * 将元素插入指定节点。如果节点已经满了，
     * 将创建一个新节点并将其插入到列表中
     * 指定的节点。
     *
     * @param ptr 元素应该插入的位置
     *            进入<tt>节点。elements<tt>数组
     * @param节点
     * @param element 元素要插入的元素
     */
    public void insertIntoNode(Node node, int ptr, E element) {

        // if the node is full
        if (node.numElements == nodeCapacity) {
            // create a new node
            Node newNode = new Node();
            // move half of the elements to the new node
            int elementsToMove = nodeCapacity / 2;
            int startIndex = nodeCapacity - elementsToMove;
            int i;
            for (i = 0; i < elementsToMove; i++) {
                newNode.elements[i] = node.elements[startIndex + i];
                node.elements[startIndex + i] = null;
            }
            node.numElements -= elementsToMove;
            newNode.numElements = elementsToMove;
            // insert the new node into the list
            newNode.next = node.next;
            newNode.previous = node;
            if (node.next != null) {
                node.next.previous = newNode;
            }
            node.next = newNode;

            if (node == lastNode) {
                lastNode = newNode;
            }

            // check whether the element should be inserted into
            // the original node or into the new node
            if (ptr > node.numElements) {
                node = newNode;
                ptr -= node.numElements;
            }
        }
        for (int i = node.numElements; i > ptr; i--) {
            node.elements[i] = node.elements[i - 1];
        }
        node.elements[ptr] = element;
        node.numElements++;
        size++;
        modCount++;

    }

    /**
     * 从指定节点中删除元素。
     *
     * @param node 应从中删除元素的节点
     * @param ptr 要删除的元素的索引
     * <tt>node.elements<tt> 数组
     */
    public void removeFromNode(Node node, int ptr) {

        node.numElements--;
        for (int i = ptr; i < node.numElements; i++) {
            node.elements[i] = node.elements[i + 1];
        }
        node.elements[node.numElements] = null;
        if (node.next != null && node.next.numElements + node.numElements <= nodeCapacity) {
            mergeWithNextNode(node);
        } else if (node.previous != null && node.previous.numElements + node.numElements <= nodeCapacity) {
            mergeWithNextNode(node.previous);
        }
        size--;
        modCount++;

    }

    /**
     * 该方法将指定节点与下一个节点合并。
     *
     * @param node 应与下一个节点合并的节点
     */
    public void mergeWithNextNode(Node node) {

        Node next = node.next;
        for (int i = 0; i < next.numElements; i++) {
            node.elements[node.numElements + i] = next.elements[i];
            next.elements[i] = null;
        }
        node.numElements += next.numElements;
        if (next.next != null) {
            next.next.previous = node;
        }
        node.next = next.next;
        if (next == lastNode) {
            lastNode = node;
        }

    }

    /*
    // DEBUG
    void print() {

        System.out.println("SIZE: " + size);
        for (Node n = firstNode; n != null; n = n.next) {
            printNode(n);
        }

    }

    void print2() {

        System.out.println("SIZE: " + size);
        for (Node n = lastNode; n != null; n = n.previous) {
            printNode(n);
        }

    }

    void printNode(Node n) {

        System.out.print(n.numElements + " { ");
        for (int i = 0; i < n.numElements; i++) {
            System.out.print(n.elements[i] + " ");
        }
        System.out.println("}");

    }
    */

}
