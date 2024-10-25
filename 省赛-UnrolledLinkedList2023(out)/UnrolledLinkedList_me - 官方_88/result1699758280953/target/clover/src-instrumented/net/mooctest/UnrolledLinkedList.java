/* $$ This file has been instrumented by Clover 4.4.1#2019101123313948 $$ *//*
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
 * An unrolled linked list implemetation of the
 * {@link java.util.List List} interface. It offers better performance
 * than the {{@link java.util.LinkedList LinkedList} class.
 *
 * <p><strong>Note that this implementation is not synchronized.</strong>
 * If multiple threads access a linked list concurrently, and at least
 * one of the threads modifies the list structurally, it <i>must</i> be
 * synchronized externally.  (A structural modification is any operation
 * that adds or deletes one or more elements; merely setting the value of
 * an element is not a structural modification.)  This is typically
 * accomplished by synchronizing on some object that naturally
 * encapsulates the list.
 *
 * If no such object exists, the list should be "wrapped" using the
 * {@link java.util.Collections#synchronizedList Collections.synchronizedList}
 * method.  This is best done at creation time, to prevent accidental
 * unsynchronized access to the list:<pre>
 *   List list = Collections.synchronizedList(new LinkedList(...));</pre>
 *
 * <p>The iterators returned by this class's <tt>iterator</tt> and
 * <tt>listIterator</tt> methods are <i>fail-fast</i>: if the list is
 * structurally modified at any time after the iterator is created, in
 * any way except through the Iterator's own <tt>remove</tt> or
 * <tt>add</tt> methods, the iterator will throw a {@link
 * ConcurrentModificationException}.  Thus, in the face of concurrent
 * modification, the iterator fails quickly and cleanly, rather than
 * risking arbitrary, non-deterministic behavior at an undetermined
 * time in the future.
 *
 * @param <E> the type of elements held in this collection
 * @see <a href="http://en.wikipedia.org/wiki/Unrolled_linked_list">Unrolled_linked_list</a>
 */

// TODO: Implement the java.util.List.addAll(int index, Collection<? extends E> c)
//       method in a more efficient way. The current implementation is inherited
//       from the java.util.AbstractList class.
// TODO: Testing

public class UnrolledLinkedList<E> extends AbstractList<E> implements List<E>, Serializable {public static class __CLR4_4_100louw6v9o{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_4_1();if(2019101123313948L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.4.1#2019101123313948,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u0043\u003a\u005c\u005c\u006d\u006f\u006f\u0063\u0074\u0065\u0073\u0074\u005c\u005c\u0070\u0072\u006f\u006a\u0065\u0063\u0074\u0073\u005c\u005c\u0038\u0030\u0035\u0038\u005c\u005c\u0031\u0032\u0036\u0035\u0038\u0031\u005c\u005c\u0055\u006e\u0072\u006f\u006c\u006c\u0065\u0064\u004c\u0069\u006e\u006b\u0065\u0064\u004c\u0069\u0073\u0074\u0032\u0030\u0032\u0033\u005c\u005c\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1699758275043L,8589935092L,475,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_4_1_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    /**
     * The maximum number of elements that can be stored in a single node.
     */
    public int nodeCapacity;

    /**
     * The current size of this list.
     */
    public int size = 0;

    /**
     * The first node of this list.
     */
    public Node firstNode;

    /**
     * The last node of this list.
     */
    public Node lastNode;

    /**
     * Constructs an empty list with the specified
     * {@link UnrolledLinkedList#nodeCapacity nodeCapacity}. For performance
     * reasons <tt>nodeCapacity</tt> must be greater than or equal to 8.
     *
     * @param nodeCapacity The maximum number of elements
     *        that can be stored in a single node.
     * @throws IllegalArgumentException if <tt>nodeCapacity</tt> is less than 8
     */
    public UnrolledLinkedList(int nodeCapacity) throws IllegalArgumentException {try{__CLR4_4_100louw6v9o.R.inc(0);

        __CLR4_4_100louw6v9o.R.inc(1);if ((((nodeCapacity < 8)&&(__CLR4_4_100louw6v9o.R.iget(2)!=0|true))||(__CLR4_4_100louw6v9o.R.iget(3)==0&false))) {{
            __CLR4_4_100louw6v9o.R.inc(4);throw new IllegalArgumentException("nodeCapacity < 8");
        }
        }__CLR4_4_100louw6v9o.R.inc(5);this.nodeCapacity = nodeCapacity;
        __CLR4_4_100louw6v9o.R.inc(6);firstNode = new Node();
        __CLR4_4_100louw6v9o.R.inc(7);lastNode = firstNode;

    }finally{__CLR4_4_100louw6v9o.R.flushNeeded();}}

    /**
     * Constructs an empty list with
     * {@link UnrolledLinkedList#nodeCapacity nodeCapacity} of 16.
     */
    public UnrolledLinkedList() {

        this(16);__CLR4_4_100louw6v9o.R.inc(9);try{__CLR4_4_100louw6v9o.R.inc(8);

    }finally{__CLR4_4_100louw6v9o.R.flushNeeded();}}

    /**
     * Returns the number of elements in this list.
     *
     * @return the number of elements in this list
     */
    public int size() {try{__CLR4_4_100louw6v9o.R.inc(10);

        __CLR4_4_100louw6v9o.R.inc(11);return size;

    }finally{__CLR4_4_100louw6v9o.R.flushNeeded();}}

    /**
     * Returns <tt>true</tt> if this list contains no elements.
     *
     * @return <tt>true</tt> if this list contains no elements
     */
    @Override
    public boolean isEmpty() {try{__CLR4_4_100louw6v9o.R.inc(12);

        __CLR4_4_100louw6v9o.R.inc(13);return (size == 0);

    }finally{__CLR4_4_100louw6v9o.R.flushNeeded();}}

    /**
     * Returns <tt>true</tt> if this list contains the specified element.
     * More formally, returns <tt>true</tt> if and only if this list contains
     * at least one element <tt>e</tt> such that
     * <tt>(o==null&nbsp;?&nbsp;e==null&nbsp;:&nbsp;o.equals(e))</tt>.
     *
     * @param o element whose presence in this list is to be tested
     * @return <tt>true</tt> if this list contains the specified element
     */
    @Override
    public boolean contains(Object o) {try{__CLR4_4_100louw6v9o.R.inc(14);

        __CLR4_4_100louw6v9o.R.inc(15);return (indexOf(o) != -1);

    }finally{__CLR4_4_100louw6v9o.R.flushNeeded();}}

    /**
     * Returns an iterator over the elements in this list in proper sequence.
     *
     * @return an iterator over the elements in this list in proper sequence
     */
    @Override
    public Iterator<E> iterator() {try{__CLR4_4_100louw6v9o.R.inc(16);

        __CLR4_4_100louw6v9o.R.inc(17);return new ULLIterator(firstNode, 0, 0);

    }finally{__CLR4_4_100louw6v9o.R.flushNeeded();}}

    /**
     * Returns an array containing all of the elements in this list
     * in proper sequence (from first to last element).
     *
     * <p>The returned array will be "safe" in that no references to it are
     * maintained by this list.  (In other words, this method must allocate
     * a new array).  The caller is thus free to modify the returned array.
     *
     * <p>This method acts as bridge between array-based and collection-based
     * APIs.
     *
     * @return an array containing all of the elements in this list
     *         in proper sequence
     */
    @Override
    public Object[] toArray() {try{__CLR4_4_100louw6v9o.R.inc(18);

        __CLR4_4_100louw6v9o.R.inc(19);Object[] array = new Object[size];
        __CLR4_4_100louw6v9o.R.inc(20);int p = 0;
        __CLR4_4_100louw6v9o.R.inc(21);for (Node node = firstNode; (((node != null)&&(__CLR4_4_100louw6v9o.R.iget(22)!=0|true))||(__CLR4_4_100louw6v9o.R.iget(23)==0&false)); node = node.next) {{
            __CLR4_4_100louw6v9o.R.inc(24);for (int i = 0; (((i < node.numElements)&&(__CLR4_4_100louw6v9o.R.iget(25)!=0|true))||(__CLR4_4_100louw6v9o.R.iget(26)==0&false)); i++) {{
                __CLR4_4_100louw6v9o.R.inc(27);array[p] = node.elements[i];
                __CLR4_4_100louw6v9o.R.inc(28);p++;
            }
        }}
        }__CLR4_4_100louw6v9o.R.inc(29);return array;

    }finally{__CLR4_4_100louw6v9o.R.flushNeeded();}}

    /**
     * Returns an array containing all of the elements in this list
     * in proper sequence (from first to last element).
     *
     * <p>The returned array will be "safe" in that no references to it are
     * maintained by this list.  (In other words, this method must allocate
     * a new array).  The caller is thus free to modify the returned array.
     *
     * <p>This method acts as bridge between array-based and collection-based
     * APIs.
     *
     * @return an array containing all of the elements in this list
     *         in proper sequence
     */
    @Override
    public <T> T[] toArray(T[] a) {try{__CLR4_4_100louw6v9o.R.inc(30);

        __CLR4_4_100louw6v9o.R.inc(31);if ((((a.length < size)&&(__CLR4_4_100louw6v9o.R.iget(32)!=0|true))||(__CLR4_4_100louw6v9o.R.iget(33)==0&false))) {{
            __CLR4_4_100louw6v9o.R.inc(34);a = (T[]) java.lang.reflect.Array.newInstance(
                    a.getClass().getComponentType(), size);
        }
        }__CLR4_4_100louw6v9o.R.inc(35);Object[] result = a;
        __CLR4_4_100louw6v9o.R.inc(36);int p = 0;
        __CLR4_4_100louw6v9o.R.inc(37);for (Node node = firstNode; (((node != null)&&(__CLR4_4_100louw6v9o.R.iget(38)!=0|true))||(__CLR4_4_100louw6v9o.R.iget(39)==0&false)); node = node.next) {{
            __CLR4_4_100louw6v9o.R.inc(40);for (int i = 0; (((i < node.numElements)&&(__CLR4_4_100louw6v9o.R.iget(41)!=0|true))||(__CLR4_4_100louw6v9o.R.iget(42)==0&false)); i++) {{
                __CLR4_4_100louw6v9o.R.inc(43);result[p] = node.elements[i];
                __CLR4_4_100louw6v9o.R.inc(44);p++;
            }
        }}
        }__CLR4_4_100louw6v9o.R.inc(45);return a;

    }finally{__CLR4_4_100louw6v9o.R.flushNeeded();}}

    /**
     * Appends the specified element to the end of this list.
     *
     * @param e element to be appended to this list
     * @return <tt>true</tt> (as specified by {@link Collection#add})
     */
    @Override
    public boolean add(E e) {try{__CLR4_4_100louw6v9o.R.inc(46);

        __CLR4_4_100louw6v9o.R.inc(47);insertIntoNode(lastNode, lastNode.numElements, e);
        __CLR4_4_100louw6v9o.R.inc(48);return true;

    }finally{__CLR4_4_100louw6v9o.R.flushNeeded();}}

    /**
     * Removes the first occurrence of the specified element from this list,
     * if it is present.  If this list does not contain the element, it is
     * unchanged.  More formally, removes the element with the lowest index
     * <tt>i</tt> such that
     * <tt>(o==null&nbsp;?&nbsp;get(i)==null&nbsp;:&nbsp;o.equals(get(i)))</tt>
     * (if such an element exists).  Returns <tt>true</tt> if this list
     * contained the specified element (or equivalently, if this list
     * changed as a result of the call).
     *
     * @param o element to be removed from this list, if present
     * @return <tt>true</tt> if this list contained the specified element
     */
    @Override
    public boolean remove(Object o) {try{__CLR4_4_100louw6v9o.R.inc(49);

        __CLR4_4_100louw6v9o.R.inc(50);int index = 0;
        __CLR4_4_100louw6v9o.R.inc(51);Node node = firstNode;
        __CLR4_4_100louw6v9o.R.inc(52);if ((((o == null)&&(__CLR4_4_100louw6v9o.R.iget(53)!=0|true))||(__CLR4_4_100louw6v9o.R.iget(54)==0&false))) {{
            __CLR4_4_100louw6v9o.R.inc(55);while ((((node != null)&&(__CLR4_4_100louw6v9o.R.iget(56)!=0|true))||(__CLR4_4_100louw6v9o.R.iget(57)==0&false))) {{
                __CLR4_4_100louw6v9o.R.inc(58);for (int ptr = 0; (((ptr < node.numElements)&&(__CLR4_4_100louw6v9o.R.iget(59)!=0|true))||(__CLR4_4_100louw6v9o.R.iget(60)==0&false)); ptr++) {{
                    __CLR4_4_100louw6v9o.R.inc(61);if ((((node.elements[ptr] == null)&&(__CLR4_4_100louw6v9o.R.iget(62)!=0|true))||(__CLR4_4_100louw6v9o.R.iget(63)==0&false))) {{
                        __CLR4_4_100louw6v9o.R.inc(64);removeFromNode(node, ptr);
                        __CLR4_4_100louw6v9o.R.inc(65);return true;
                    }
                }}
                }__CLR4_4_100louw6v9o.R.inc(66);index += node.numElements;
                __CLR4_4_100louw6v9o.R.inc(67);node = node.next;
            }
        }} }else {{
            __CLR4_4_100louw6v9o.R.inc(68);while ((((node != null)&&(__CLR4_4_100louw6v9o.R.iget(69)!=0|true))||(__CLR4_4_100louw6v9o.R.iget(70)==0&false))) {{
                __CLR4_4_100louw6v9o.R.inc(71);for (int ptr = 0; (((ptr < node.numElements)&&(__CLR4_4_100louw6v9o.R.iget(72)!=0|true))||(__CLR4_4_100louw6v9o.R.iget(73)==0&false)); ptr++) {{
                    __CLR4_4_100louw6v9o.R.inc(74);if ((((o.equals(node.elements[ptr]))&&(__CLR4_4_100louw6v9o.R.iget(75)!=0|true))||(__CLR4_4_100louw6v9o.R.iget(76)==0&false))) {{
                        __CLR4_4_100louw6v9o.R.inc(77);removeFromNode(node, ptr);
                        __CLR4_4_100louw6v9o.R.inc(78);return true;
                    }
                }}
                }__CLR4_4_100louw6v9o.R.inc(79);index += node.numElements;
                __CLR4_4_100louw6v9o.R.inc(80);node = node.next;
            }
        }}
        }__CLR4_4_100louw6v9o.R.inc(81);return false;

    }finally{__CLR4_4_100louw6v9o.R.flushNeeded();}}

    /**
     * Returns <tt>true</tt> if this list contains all of the elements of the
     * specified collection.
     *
     * @param  c collection to be checked for containment in this list
     * @return <tt>true</tt> if this list contains all of the elements of the
     *         specified collection
     * @throws NullPointerException if the specified collection is null
     * @see #contains(Object)
     */
    @Override
    public boolean containsAll(Collection<?> c) {try{__CLR4_4_100louw6v9o.R.inc(82);

        __CLR4_4_100louw6v9o.R.inc(83);if ((((c == null)&&(__CLR4_4_100louw6v9o.R.iget(84)!=0|true))||(__CLR4_4_100louw6v9o.R.iget(85)==0&false))) {{
            __CLR4_4_100louw6v9o.R.inc(86);throw new NullPointerException();
        }
        }__CLR4_4_100louw6v9o.R.inc(87);Iterator<?> it = c.iterator();
        __CLR4_4_100louw6v9o.R.inc(88);while ((((it.hasNext())&&(__CLR4_4_100louw6v9o.R.iget(89)!=0|true))||(__CLR4_4_100louw6v9o.R.iget(90)==0&false))) {{
            __CLR4_4_100louw6v9o.R.inc(91);if ((((!contains(it.next()))&&(__CLR4_4_100louw6v9o.R.iget(92)!=0|true))||(__CLR4_4_100louw6v9o.R.iget(93)==0&false))) {{
                __CLR4_4_100louw6v9o.R.inc(94);return false;
            }
        }}
        }__CLR4_4_100louw6v9o.R.inc(95);return true;

    }finally{__CLR4_4_100louw6v9o.R.flushNeeded();}}

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
    public boolean addAll(Collection<? extends E> c) {try{__CLR4_4_100louw6v9o.R.inc(96);

        __CLR4_4_100louw6v9o.R.inc(97);if ((((c == null)&&(__CLR4_4_100louw6v9o.R.iget(98)!=0|true))||(__CLR4_4_100louw6v9o.R.iget(99)==0&false))) {{
            __CLR4_4_100louw6v9o.R.inc(100);throw new NullPointerException();
        }
        }__CLR4_4_100louw6v9o.R.inc(101);boolean changed = false;
        __CLR4_4_100louw6v9o.R.inc(102);Iterator<? extends E> it = c.iterator();
        __CLR4_4_100louw6v9o.R.inc(103);while ((((it.hasNext())&&(__CLR4_4_100louw6v9o.R.iget(104)!=0|true))||(__CLR4_4_100louw6v9o.R.iget(105)==0&false))) {{
            __CLR4_4_100louw6v9o.R.inc(106);add(it.next());
            __CLR4_4_100louw6v9o.R.inc(107);changed = true;
        }
        }__CLR4_4_100louw6v9o.R.inc(108);return changed;

    }finally{__CLR4_4_100louw6v9o.R.flushNeeded();}}

    /**
     * Removes from this list all of its elements that are contained in the
     * specified collection.
     *
     * @param c collection containing elements to be removed from this list
     * @return <tt>true</tt> if this list changed as a result of the call
     * @throws NullPointerException if the specified collection is null
     * @see #remove(Object)
     * @see #contains(Object)
     */
    @Override
    public boolean removeAll(Collection<?> c) {try{__CLR4_4_100louw6v9o.R.inc(109);

        __CLR4_4_100louw6v9o.R.inc(110);if ((((c == null)&&(__CLR4_4_100louw6v9o.R.iget(111)!=0|true))||(__CLR4_4_100louw6v9o.R.iget(112)==0&false))) {{
            __CLR4_4_100louw6v9o.R.inc(113);throw new NullPointerException();
        }
        }__CLR4_4_100louw6v9o.R.inc(114);Iterator<?> it = c.iterator();
        __CLR4_4_100louw6v9o.R.inc(115);boolean changed = false;
        __CLR4_4_100louw6v9o.R.inc(116);while ((((it.hasNext())&&(__CLR4_4_100louw6v9o.R.iget(117)!=0|true))||(__CLR4_4_100louw6v9o.R.iget(118)==0&false))) {{
            __CLR4_4_100louw6v9o.R.inc(119);if ((((remove(it.next()))&&(__CLR4_4_100louw6v9o.R.iget(120)!=0|true))||(__CLR4_4_100louw6v9o.R.iget(121)==0&false))) {{
                __CLR4_4_100louw6v9o.R.inc(122);changed = true;
            }
        }}
        }__CLR4_4_100louw6v9o.R.inc(123);return changed;

    }finally{__CLR4_4_100louw6v9o.R.flushNeeded();}}

    /**
     * Retains only the elements in this list that are contained in the
     * specified collection.  In other words, removes
     * from this list all the elements that are not contained in the specified
     * collection.
     *
     * @param c collection containing elements to be retained in this list
     * @return <tt>true</tt> if this list changed as a result of the call
     * @throws NullPointerException if the specified collection is null
     * @see #remove(Object)
     * @see #contains(Object)
     */
    @Override
    public boolean retainAll(Collection<?> c) {try{__CLR4_4_100louw6v9o.R.inc(124);

        __CLR4_4_100louw6v9o.R.inc(125);if ((((c == null)&&(__CLR4_4_100louw6v9o.R.iget(126)!=0|true))||(__CLR4_4_100louw6v9o.R.iget(127)==0&false))) {{
            __CLR4_4_100louw6v9o.R.inc(128);throw new NullPointerException();
        }
        }__CLR4_4_100louw6v9o.R.inc(129);boolean changed = false;
        __CLR4_4_100louw6v9o.R.inc(130);for (Node node = firstNode; (((node != null)&&(__CLR4_4_100louw6v9o.R.iget(131)!=0|true))||(__CLR4_4_100louw6v9o.R.iget(132)==0&false)); node = node.next) {{
            __CLR4_4_100louw6v9o.R.inc(133);for (int i = 0; (((i < node.numElements)&&(__CLR4_4_100louw6v9o.R.iget(134)!=0|true))||(__CLR4_4_100louw6v9o.R.iget(135)==0&false)); i++) {{
                __CLR4_4_100louw6v9o.R.inc(136);if ((((!c.contains(node.elements[i]))&&(__CLR4_4_100louw6v9o.R.iget(137)!=0|true))||(__CLR4_4_100louw6v9o.R.iget(138)==0&false))) {{
                    __CLR4_4_100louw6v9o.R.inc(139);removeFromNode(node, i);
                    __CLR4_4_100louw6v9o.R.inc(140);i--;
                    __CLR4_4_100louw6v9o.R.inc(141);changed = true;
                }
            }}
        }}
        }__CLR4_4_100louw6v9o.R.inc(142);return changed;

    }finally{__CLR4_4_100louw6v9o.R.flushNeeded();}}

    /**
     * Removes all of the elements from this list.
     */
    @Override
    public void clear() {try{__CLR4_4_100louw6v9o.R.inc(143);

        __CLR4_4_100louw6v9o.R.inc(144);Node node = firstNode.next;
        __CLR4_4_100louw6v9o.R.inc(145);while ((((node != null)&&(__CLR4_4_100louw6v9o.R.iget(146)!=0|true))||(__CLR4_4_100louw6v9o.R.iget(147)==0&false))) {{
            __CLR4_4_100louw6v9o.R.inc(148);Node next = node.next;
            __CLR4_4_100louw6v9o.R.inc(149);node.next = null;
            __CLR4_4_100louw6v9o.R.inc(150);node.previous = null;
            __CLR4_4_100louw6v9o.R.inc(151);node.elements = null;
            __CLR4_4_100louw6v9o.R.inc(152);node = next;
        }
        }__CLR4_4_100louw6v9o.R.inc(153);lastNode = firstNode;
        __CLR4_4_100louw6v9o.R.inc(154);for (int ptr = 0; (((ptr < firstNode.numElements)&&(__CLR4_4_100louw6v9o.R.iget(155)!=0|true))||(__CLR4_4_100louw6v9o.R.iget(156)==0&false)); ptr++) {{
            __CLR4_4_100louw6v9o.R.inc(157);firstNode.elements[ptr] = null;
        }
        }__CLR4_4_100louw6v9o.R.inc(158);firstNode.numElements = 0;
        __CLR4_4_100louw6v9o.R.inc(159);firstNode.next = null;
        __CLR4_4_100louw6v9o.R.inc(160);size = 0;

    }finally{__CLR4_4_100louw6v9o.R.flushNeeded();}}

    /**
     * Returns the element at the specified position in this list.
     *
     * @param index index of the element to return
     * @return the element at the specified position in this list
     * @throws IndexOutOfBoundsException {@inheritDoc}
     */
    public E get(int index) throws IndexOutOfBoundsException {try{__CLR4_4_100louw6v9o.R.inc(161);

        __CLR4_4_100louw6v9o.R.inc(162);if ((((index < 0 || index >= size)&&(__CLR4_4_100louw6v9o.R.iget(163)!=0|true))||(__CLR4_4_100louw6v9o.R.iget(164)==0&false))) {{
            __CLR4_4_100louw6v9o.R.inc(165);throw new IndexOutOfBoundsException();
        }
        }__CLR4_4_100louw6v9o.R.inc(166);Node node;
        __CLR4_4_100louw6v9o.R.inc(167);int p = 0;
        __CLR4_4_100louw6v9o.R.inc(168);if ((((size - index > index)&&(__CLR4_4_100louw6v9o.R.iget(169)!=0|true))||(__CLR4_4_100louw6v9o.R.iget(170)==0&false))) {{
            __CLR4_4_100louw6v9o.R.inc(171);node = firstNode;
            __CLR4_4_100louw6v9o.R.inc(172);while ((((p <= index - node.numElements)&&(__CLR4_4_100louw6v9o.R.iget(173)!=0|true))||(__CLR4_4_100louw6v9o.R.iget(174)==0&false))) {{
                __CLR4_4_100louw6v9o.R.inc(175);p += node.numElements;
                __CLR4_4_100louw6v9o.R.inc(176);node = node.next;
            }
        }} }else {{
            __CLR4_4_100louw6v9o.R.inc(177);node = lastNode;
            __CLR4_4_100louw6v9o.R.inc(178);p = size;
            __CLR4_4_100louw6v9o.R.inc(179);while (((((p -= node.numElements) > index)&&(__CLR4_4_100louw6v9o.R.iget(180)!=0|true))||(__CLR4_4_100louw6v9o.R.iget(181)==0&false))) {{
                __CLR4_4_100louw6v9o.R.inc(182);node = node.previous;
            }
        }}
        }__CLR4_4_100louw6v9o.R.inc(183);return (E) node.elements[index - p];

    }finally{__CLR4_4_100louw6v9o.R.flushNeeded();}}

    /**
     * Replaces the element at the specified position in this list with the
     * specified element.
     *
     * @param index index of the element to replace
     * @param element element to be stored at the specified position
     * @return the element previously at the specified position
     * @throws IndexOutOfBoundsException {@inheritDoc}
     */
    @Override
    public E set(int index, E element) {try{__CLR4_4_100louw6v9o.R.inc(184);

        __CLR4_4_100louw6v9o.R.inc(185);if ((((index < 0 || index >= size)&&(__CLR4_4_100louw6v9o.R.iget(186)!=0|true))||(__CLR4_4_100louw6v9o.R.iget(187)==0&false))) {{
            __CLR4_4_100louw6v9o.R.inc(188);throw new IndexOutOfBoundsException();
        }
        }__CLR4_4_100louw6v9o.R.inc(189);E el = null;
        __CLR4_4_100louw6v9o.R.inc(190);Node node;
        __CLR4_4_100louw6v9o.R.inc(191);int p = 0;
        __CLR4_4_100louw6v9o.R.inc(192);if ((((size - index > index)&&(__CLR4_4_100louw6v9o.R.iget(193)!=0|true))||(__CLR4_4_100louw6v9o.R.iget(194)==0&false))) {{
            __CLR4_4_100louw6v9o.R.inc(195);node = firstNode;
            __CLR4_4_100louw6v9o.R.inc(196);while ((((p <= index - node.numElements)&&(__CLR4_4_100louw6v9o.R.iget(197)!=0|true))||(__CLR4_4_100louw6v9o.R.iget(198)==0&false))) {{
                __CLR4_4_100louw6v9o.R.inc(199);p += node.numElements;
                __CLR4_4_100louw6v9o.R.inc(200);node = node.next;
            }
        }} }else {{
            __CLR4_4_100louw6v9o.R.inc(201);node = lastNode;
            __CLR4_4_100louw6v9o.R.inc(202);p = size;
            __CLR4_4_100louw6v9o.R.inc(203);while (((((p -= node.numElements) > index)&&(__CLR4_4_100louw6v9o.R.iget(204)!=0|true))||(__CLR4_4_100louw6v9o.R.iget(205)==0&false))) {{
                __CLR4_4_100louw6v9o.R.inc(206);node = node.previous;
            }
        }}
        }__CLR4_4_100louw6v9o.R.inc(207);el = (E) node.elements[index - p];
        __CLR4_4_100louw6v9o.R.inc(208);node.elements[index - p] = element;
        __CLR4_4_100louw6v9o.R.inc(209);return el;

    }finally{__CLR4_4_100louw6v9o.R.flushNeeded();}}

    /**
     * Inserts the specified element at the specified position in this list.
     * Shifts the element currently at that position (if any) and any
     * subsequent elements to the right (adds one to their indices).
     *
     * @param index index at which the specified element is to be inserted
     * @param element element to be inserted
     * @throws IndexOutOfBoundsException {@inheritDoc}
     */
    @Override
    public void add(int index, E element) throws IndexOutOfBoundsException {try{__CLR4_4_100louw6v9o.R.inc(210);

        __CLR4_4_100louw6v9o.R.inc(211);if ((((index < 0 || index > size)&&(__CLR4_4_100louw6v9o.R.iget(212)!=0|true))||(__CLR4_4_100louw6v9o.R.iget(213)==0&false))) {{
            __CLR4_4_100louw6v9o.R.inc(214);throw new IndexOutOfBoundsException();
        }
        }__CLR4_4_100louw6v9o.R.inc(215);Node node;
        __CLR4_4_100louw6v9o.R.inc(216);int p = 0;
        __CLR4_4_100louw6v9o.R.inc(217);if ((((size - index > index)&&(__CLR4_4_100louw6v9o.R.iget(218)!=0|true))||(__CLR4_4_100louw6v9o.R.iget(219)==0&false))) {{
            __CLR4_4_100louw6v9o.R.inc(220);node = firstNode;
            __CLR4_4_100louw6v9o.R.inc(221);while ((((p <= index - node.numElements)&&(__CLR4_4_100louw6v9o.R.iget(222)!=0|true))||(__CLR4_4_100louw6v9o.R.iget(223)==0&false))) {{
                __CLR4_4_100louw6v9o.R.inc(224);p += node.numElements;
                __CLR4_4_100louw6v9o.R.inc(225);node = node.next;
            }
        }} }else {{
            __CLR4_4_100louw6v9o.R.inc(226);node = lastNode;
            __CLR4_4_100louw6v9o.R.inc(227);p = size;
            __CLR4_4_100louw6v9o.R.inc(228);while (((((p -= node.numElements) > index)&&(__CLR4_4_100louw6v9o.R.iget(229)!=0|true))||(__CLR4_4_100louw6v9o.R.iget(230)==0&false))) {{
                __CLR4_4_100louw6v9o.R.inc(231);node = node.previous;
            }
        }}
        }__CLR4_4_100louw6v9o.R.inc(232);insertIntoNode(node, index - p, element);

    }finally{__CLR4_4_100louw6v9o.R.flushNeeded();}}

    /**
     * Removes the element at the specified position in this list.  Shifts any
     * subsequent elements to the left (subtracts one from their indices).
     * Returns the element that was removed from the list.
     *
     * @param index the index of the element to be removed
     * @return the element previously at the specified position
     * @throws IndexOutOfBoundsException {@inheritDoc}
     */
    @Override
    public E remove(int index) throws IndexOutOfBoundsException {try{__CLR4_4_100louw6v9o.R.inc(233);

        __CLR4_4_100louw6v9o.R.inc(234);if ((((index < 0 || index >= size)&&(__CLR4_4_100louw6v9o.R.iget(235)!=0|true))||(__CLR4_4_100louw6v9o.R.iget(236)==0&false))) {{
            __CLR4_4_100louw6v9o.R.inc(237);throw new IndexOutOfBoundsException();
        }
        }__CLR4_4_100louw6v9o.R.inc(238);E element = null;
        __CLR4_4_100louw6v9o.R.inc(239);Node node;
        __CLR4_4_100louw6v9o.R.inc(240);int p = 0;
        __CLR4_4_100louw6v9o.R.inc(241);if ((((size - index > index)&&(__CLR4_4_100louw6v9o.R.iget(242)!=0|true))||(__CLR4_4_100louw6v9o.R.iget(243)==0&false))) {{
            __CLR4_4_100louw6v9o.R.inc(244);node = firstNode;
            __CLR4_4_100louw6v9o.R.inc(245);while ((((p <= index - node.numElements)&&(__CLR4_4_100louw6v9o.R.iget(246)!=0|true))||(__CLR4_4_100louw6v9o.R.iget(247)==0&false))) {{
                __CLR4_4_100louw6v9o.R.inc(248);p += node.numElements;
                __CLR4_4_100louw6v9o.R.inc(249);node = node.next;
            }
        }} }else {{
            __CLR4_4_100louw6v9o.R.inc(250);node = lastNode;
            __CLR4_4_100louw6v9o.R.inc(251);p = size;
            __CLR4_4_100louw6v9o.R.inc(252);while (((((p -= node.numElements) > index)&&(__CLR4_4_100louw6v9o.R.iget(253)!=0|true))||(__CLR4_4_100louw6v9o.R.iget(254)==0&false))) {{
                __CLR4_4_100louw6v9o.R.inc(255);node = node.previous;
            }
        }}
        }__CLR4_4_100louw6v9o.R.inc(256);element = (E) node.elements[index - p];
        __CLR4_4_100louw6v9o.R.inc(257);removeFromNode(node, index - p);
        __CLR4_4_100louw6v9o.R.inc(258);return element;

    }finally{__CLR4_4_100louw6v9o.R.flushNeeded();}}

    /**
     * Returns the index of the first occurrence of the specified element
     * in this list, or -1 if this list does not contain the element.
     * More formally, returns the lowest index <tt>i</tt> such that
     * <tt>(o==null&nbsp;?&nbsp;get(i)==null&nbsp;:&nbsp;o.equals(get(i)))</tt>,
     * or -1 if there is no such index.
     *
     * @param o element to search for
     * @return the index of the first occurrence of the specified element in
     *         this list, or -1 if this list does not contain the element
     */
    @Override
    public int indexOf(Object o) {try{__CLR4_4_100louw6v9o.R.inc(259);

        __CLR4_4_100louw6v9o.R.inc(260);int index = 0;
        __CLR4_4_100louw6v9o.R.inc(261);Node node = firstNode;
        __CLR4_4_100louw6v9o.R.inc(262);if ((((o == null)&&(__CLR4_4_100louw6v9o.R.iget(263)!=0|true))||(__CLR4_4_100louw6v9o.R.iget(264)==0&false))) {{
            __CLR4_4_100louw6v9o.R.inc(265);while ((((node != null)&&(__CLR4_4_100louw6v9o.R.iget(266)!=0|true))||(__CLR4_4_100louw6v9o.R.iget(267)==0&false))) {{
                __CLR4_4_100louw6v9o.R.inc(268);for (int ptr = 0; (((ptr < node.numElements)&&(__CLR4_4_100louw6v9o.R.iget(269)!=0|true))||(__CLR4_4_100louw6v9o.R.iget(270)==0&false)); ptr++) {{
                    __CLR4_4_100louw6v9o.R.inc(271);if ((((node.elements[ptr] == null)&&(__CLR4_4_100louw6v9o.R.iget(272)!=0|true))||(__CLR4_4_100louw6v9o.R.iget(273)==0&false))) {{
                        __CLR4_4_100louw6v9o.R.inc(274);return index + ptr;
                    }
                }}
                }__CLR4_4_100louw6v9o.R.inc(275);index += node.numElements;
                __CLR4_4_100louw6v9o.R.inc(276);node = node.next;
            }
        }} }else {{
            __CLR4_4_100louw6v9o.R.inc(277);while ((((node != null)&&(__CLR4_4_100louw6v9o.R.iget(278)!=0|true))||(__CLR4_4_100louw6v9o.R.iget(279)==0&false))) {{
                __CLR4_4_100louw6v9o.R.inc(280);for (int ptr = 0; (((ptr < node.numElements)&&(__CLR4_4_100louw6v9o.R.iget(281)!=0|true))||(__CLR4_4_100louw6v9o.R.iget(282)==0&false)); ptr++) {{
                    __CLR4_4_100louw6v9o.R.inc(283);if ((((o.equals(node.elements[ptr]))&&(__CLR4_4_100louw6v9o.R.iget(284)!=0|true))||(__CLR4_4_100louw6v9o.R.iget(285)==0&false))) {{
                        __CLR4_4_100louw6v9o.R.inc(286);return index + ptr;
                    }
                }}
                }__CLR4_4_100louw6v9o.R.inc(287);index += node.numElements;
                __CLR4_4_100louw6v9o.R.inc(288);node = node.next;
            }
        }}
        }__CLR4_4_100louw6v9o.R.inc(289);return -1;

    }finally{__CLR4_4_100louw6v9o.R.flushNeeded();}}

    /**
     * Returns the index of the last occurrence of the specified element
     * in this list, or -1 if this list does not contain the element.
     * More formally, returns the highest index <tt>i</tt> such that
     * <tt>(o==null&nbsp;?&nbsp;get(i)==null&nbsp;:&nbsp;o.equals(get(i)))</tt>,
     * or -1 if there is no such index.
     *
     * @param o element to search for
     * @return the index of the last occurrence of the specified element in
     *         this list, or -1 if this list does not contain the element
     */
    @Override
    public int lastIndexOf(Object o) {try{__CLR4_4_100louw6v9o.R.inc(290);

        __CLR4_4_100louw6v9o.R.inc(291);int index = size;
        __CLR4_4_100louw6v9o.R.inc(292);Node node = lastNode;
        __CLR4_4_100louw6v9o.R.inc(293);if ((((o == null)&&(__CLR4_4_100louw6v9o.R.iget(294)!=0|true))||(__CLR4_4_100louw6v9o.R.iget(295)==0&false))) {{
            __CLR4_4_100louw6v9o.R.inc(296);while ((((node != null)&&(__CLR4_4_100louw6v9o.R.iget(297)!=0|true))||(__CLR4_4_100louw6v9o.R.iget(298)==0&false))) {{
                __CLR4_4_100louw6v9o.R.inc(299);index -= node.numElements;
                __CLR4_4_100louw6v9o.R.inc(300);for (int i = node.numElements - 1; (((i >= 0)&&(__CLR4_4_100louw6v9o.R.iget(301)!=0|true))||(__CLR4_4_100louw6v9o.R.iget(302)==0&false)); i--) {{
                    __CLR4_4_100louw6v9o.R.inc(303);if ((((node.elements[i] == null)&&(__CLR4_4_100louw6v9o.R.iget(304)!=0|true))||(__CLR4_4_100louw6v9o.R.iget(305)==0&false))) {{
                        __CLR4_4_100louw6v9o.R.inc(306);return (index + i);
                    }
                }}
                }__CLR4_4_100louw6v9o.R.inc(307);node = node.previous;
            }
        }} }else {{
            __CLR4_4_100louw6v9o.R.inc(308);while ((((node != null)&&(__CLR4_4_100louw6v9o.R.iget(309)!=0|true))||(__CLR4_4_100louw6v9o.R.iget(310)==0&false))) {{
                __CLR4_4_100louw6v9o.R.inc(311);index -= node.numElements;
                __CLR4_4_100louw6v9o.R.inc(312);for (int i = node.numElements - 1; (((i >= 0)&&(__CLR4_4_100louw6v9o.R.iget(313)!=0|true))||(__CLR4_4_100louw6v9o.R.iget(314)==0&false)); i--) {{
                    __CLR4_4_100louw6v9o.R.inc(315);if ((((o.equals(node.elements[i]))&&(__CLR4_4_100louw6v9o.R.iget(316)!=0|true))||(__CLR4_4_100louw6v9o.R.iget(317)==0&false))) {{
                        __CLR4_4_100louw6v9o.R.inc(318);return (index + i);
                    }
                }}
                }__CLR4_4_100louw6v9o.R.inc(319);node = node.previous;
            }
        }}
        }__CLR4_4_100louw6v9o.R.inc(320);return -1;

    }finally{__CLR4_4_100louw6v9o.R.flushNeeded();}}

    /**
     * Returns a list iterator over the elements in this list (in proper
     * sequence).
     *
     * @return a list iterator over the elements in this list (in proper
     *         sequence)
     */
    @Override
    public ListIterator<E> listIterator() {try{__CLR4_4_100louw6v9o.R.inc(321);

        __CLR4_4_100louw6v9o.R.inc(322);return new ULLIterator(firstNode, 0, 0);

    }finally{__CLR4_4_100louw6v9o.R.flushNeeded();}}

    /**
     * Returns a list-iterator of the elements in this list (in proper
     * sequence), starting at the specified position in the list.
     * Obeys the general contract of <tt>List.listIterator(int)</tt>.<p>
     *
     * The list-iterator is <i>fail-fast</i>: if the list is structurally
     * modified at any time after the Iterator is created, in any way except
     * through the list-iterator's own <tt>remove</tt> or <tt>add</tt>
     * methods, the list-iterator will throw a
     * <tt>ConcurrentModificationException</tt>.  Thus, in the face of
     * concurrent modification, the iterator fails quickly and cleanly, rather
     * than risking arbitrary, non-deterministic behavior at an undetermined
     * time in the future.
     *
     * @param index index of the first element to be returned from the
     *              list-iterator (by a call to <tt>next</tt>)
     * @return a ListIterator of the elements in this list (in proper
     *         sequence), starting at the specified position in the list
     * @throws IndexOutOfBoundsException {@inheritDoc}
     * @see List#listIterator(int)
     */
    @Override
    public ListIterator<E> listIterator(int index) {try{__CLR4_4_100louw6v9o.R.inc(323);

        __CLR4_4_100louw6v9o.R.inc(324);if ((((index < 0 || index > size)&&(__CLR4_4_100louw6v9o.R.iget(325)!=0|true))||(__CLR4_4_100louw6v9o.R.iget(326)==0&false))) {{
            __CLR4_4_100louw6v9o.R.inc(327);throw new IndexOutOfBoundsException();
        }
        }__CLR4_4_100louw6v9o.R.inc(328);Node node;
        __CLR4_4_100louw6v9o.R.inc(329);int p = 0;
        __CLR4_4_100louw6v9o.R.inc(330);if ((((size - index > index)&&(__CLR4_4_100louw6v9o.R.iget(331)!=0|true))||(__CLR4_4_100louw6v9o.R.iget(332)==0&false))) {{
            __CLR4_4_100louw6v9o.R.inc(333);node = firstNode;
            __CLR4_4_100louw6v9o.R.inc(334);while ((((p <= index - node.numElements)&&(__CLR4_4_100louw6v9o.R.iget(335)!=0|true))||(__CLR4_4_100louw6v9o.R.iget(336)==0&false))) {{
                __CLR4_4_100louw6v9o.R.inc(337);p += node.numElements;
                __CLR4_4_100louw6v9o.R.inc(338);node = node.next;
            }
        }} }else {{
            __CLR4_4_100louw6v9o.R.inc(339);node = lastNode;
            __CLR4_4_100louw6v9o.R.inc(340);p = size;
            __CLR4_4_100louw6v9o.R.inc(341);while (((((p -= node.numElements) > index)&&(__CLR4_4_100louw6v9o.R.iget(342)!=0|true))||(__CLR4_4_100louw6v9o.R.iget(343)==0&false))) {{
                __CLR4_4_100louw6v9o.R.inc(344);node = node.previous;
            }
        }}
        }__CLR4_4_100louw6v9o.R.inc(345);return new ULLIterator(node, index - p, index);

    }finally{__CLR4_4_100louw6v9o.R.flushNeeded();}}

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
         * The number of elements stored in this node.
         */
        int numElements = 0;

        /**
         * The array in which the elements are stored.
         */
        Object[] elements;

        /**
         * Constructs a new node.
         */
        Node() {try{__CLR4_4_100louw6v9o.R.inc(346);

            __CLR4_4_100louw6v9o.R.inc(347);elements = new Object[nodeCapacity];

        }finally{__CLR4_4_100louw6v9o.R.flushNeeded();}}

    }

    public class ULLIterator implements ListIterator<E> {

        Node currentNode;
        int ptr;
        int index;

        public int expectedModCount = modCount;

        ULLIterator(Node node, int ptr, int index) {try{__CLR4_4_100louw6v9o.R.inc(348);

            __CLR4_4_100louw6v9o.R.inc(349);this.currentNode = node;
            __CLR4_4_100louw6v9o.R.inc(350);this.ptr = ptr;
            __CLR4_4_100louw6v9o.R.inc(351);this.index = index;

        }finally{__CLR4_4_100louw6v9o.R.flushNeeded();}}

        @Override
        public boolean hasNext() {try{__CLR4_4_100louw6v9o.R.inc(352);

            __CLR4_4_100louw6v9o.R.inc(353);return (index < size - 1);

        }finally{__CLR4_4_100louw6v9o.R.flushNeeded();}}

        @Override
        public E next() {try{__CLR4_4_100louw6v9o.R.inc(354);

            __CLR4_4_100louw6v9o.R.inc(355);ptr++;
            __CLR4_4_100louw6v9o.R.inc(356);if ((((ptr >= currentNode.numElements)&&(__CLR4_4_100louw6v9o.R.iget(357)!=0|true))||(__CLR4_4_100louw6v9o.R.iget(358)==0&false))) {{
                __CLR4_4_100louw6v9o.R.inc(359);if ((((currentNode.next != null)&&(__CLR4_4_100louw6v9o.R.iget(360)!=0|true))||(__CLR4_4_100louw6v9o.R.iget(361)==0&false))) {{
                    __CLR4_4_100louw6v9o.R.inc(362);currentNode = currentNode.next;
                    __CLR4_4_100louw6v9o.R.inc(363);ptr = 0;
                } }else {{
                    __CLR4_4_100louw6v9o.R.inc(364);throw new NoSuchElementException();
                }
            }}
            }__CLR4_4_100louw6v9o.R.inc(365);index++;
            __CLR4_4_100louw6v9o.R.inc(366);checkForModification();
            __CLR4_4_100louw6v9o.R.inc(367);return (E) currentNode.elements[ptr];

        }finally{__CLR4_4_100louw6v9o.R.flushNeeded();}}

        @Override
        public boolean hasPrevious() {try{__CLR4_4_100louw6v9o.R.inc(368);

            __CLR4_4_100louw6v9o.R.inc(369);return (index > 0);

        }finally{__CLR4_4_100louw6v9o.R.flushNeeded();}}

        @Override
        public E previous() {try{__CLR4_4_100louw6v9o.R.inc(370);

            __CLR4_4_100louw6v9o.R.inc(371);ptr--;
            __CLR4_4_100louw6v9o.R.inc(372);if ((((ptr < 0)&&(__CLR4_4_100louw6v9o.R.iget(373)!=0|true))||(__CLR4_4_100louw6v9o.R.iget(374)==0&false))) {{
                __CLR4_4_100louw6v9o.R.inc(375);if ((((currentNode.previous != null)&&(__CLR4_4_100louw6v9o.R.iget(376)!=0|true))||(__CLR4_4_100louw6v9o.R.iget(377)==0&false))) {{
                    __CLR4_4_100louw6v9o.R.inc(378);currentNode = currentNode.previous;
                    __CLR4_4_100louw6v9o.R.inc(379);ptr = currentNode.numElements - 1;
                } }else {{
                    __CLR4_4_100louw6v9o.R.inc(380);throw new NoSuchElementException();
                }
            }}
            }__CLR4_4_100louw6v9o.R.inc(381);index--;
            __CLR4_4_100louw6v9o.R.inc(382);checkForModification();
            __CLR4_4_100louw6v9o.R.inc(383);return (E) currentNode.elements[ptr];

        }finally{__CLR4_4_100louw6v9o.R.flushNeeded();}}

        @Override
        public int nextIndex() {try{__CLR4_4_100louw6v9o.R.inc(384);

            __CLR4_4_100louw6v9o.R.inc(385);return (index + 1);

        }finally{__CLR4_4_100louw6v9o.R.flushNeeded();}}

        @Override
        public int previousIndex() {try{__CLR4_4_100louw6v9o.R.inc(386);

            __CLR4_4_100louw6v9o.R.inc(387);return (index - 1);

        }finally{__CLR4_4_100louw6v9o.R.flushNeeded();}}

        @Override
        public void remove() {try{__CLR4_4_100louw6v9o.R.inc(388);

            __CLR4_4_100louw6v9o.R.inc(389);checkForModification();
            __CLR4_4_100louw6v9o.R.inc(390);removeFromNode(currentNode, ptr);

        }finally{__CLR4_4_100louw6v9o.R.flushNeeded();}}

        @Override
        public void set(E e) {try{__CLR4_4_100louw6v9o.R.inc(391);

            __CLR4_4_100louw6v9o.R.inc(392);checkForModification();
            __CLR4_4_100louw6v9o.R.inc(393);currentNode.elements[ptr] = e;

        }finally{__CLR4_4_100louw6v9o.R.flushNeeded();}}

        @Override
        public void add(E e) {try{__CLR4_4_100louw6v9o.R.inc(394);

            __CLR4_4_100louw6v9o.R.inc(395);checkForModification();
            __CLR4_4_100louw6v9o.R.inc(396);insertIntoNode(currentNode, ptr + 1, e);

        }finally{__CLR4_4_100louw6v9o.R.flushNeeded();}}

        public void checkForModification() {try{__CLR4_4_100louw6v9o.R.inc(397);

            __CLR4_4_100louw6v9o.R.inc(398);if ((((modCount != expectedModCount)&&(__CLR4_4_100louw6v9o.R.iget(399)!=0|true))||(__CLR4_4_100louw6v9o.R.iget(400)==0&false))) {{
                __CLR4_4_100louw6v9o.R.inc(401);throw new ConcurrentModificationException();
            }

        }}finally{__CLR4_4_100louw6v9o.R.flushNeeded();}}

    }

    /**
     * Insert an element into the specified node. If the node is already full,
     * a new node will be created and inserted into the list after
     * the specified node.
     *
     * @param node
     * @param ptr the position at which the element should be inserted
     *            into the <tt>node.elements<tt> array
     * @param element the element to be inserted
     */
    public void insertIntoNode(Node node, int ptr, E element) {try{__CLR4_4_100louw6v9o.R.inc(402);

        // if the node is full
        __CLR4_4_100louw6v9o.R.inc(403);if ((((node.numElements == nodeCapacity)&&(__CLR4_4_100louw6v9o.R.iget(404)!=0|true))||(__CLR4_4_100louw6v9o.R.iget(405)==0&false))) {{
            // create a new node
            __CLR4_4_100louw6v9o.R.inc(406);Node newNode = new Node();
            // move half of the elements to the new node
            __CLR4_4_100louw6v9o.R.inc(407);int elementsToMove = nodeCapacity / 2;
            __CLR4_4_100louw6v9o.R.inc(408);int startIndex = nodeCapacity - elementsToMove;
            __CLR4_4_100louw6v9o.R.inc(409);int i;
            __CLR4_4_100louw6v9o.R.inc(410);for (i = 0; (((i < elementsToMove)&&(__CLR4_4_100louw6v9o.R.iget(411)!=0|true))||(__CLR4_4_100louw6v9o.R.iget(412)==0&false)); i++) {{
                __CLR4_4_100louw6v9o.R.inc(413);newNode.elements[i] = node.elements[startIndex + i];
                __CLR4_4_100louw6v9o.R.inc(414);node.elements[startIndex + i] = null;
            }
            }__CLR4_4_100louw6v9o.R.inc(415);node.numElements -= elementsToMove;
            __CLR4_4_100louw6v9o.R.inc(416);newNode.numElements = elementsToMove;
            // insert the new node into the list
            __CLR4_4_100louw6v9o.R.inc(417);newNode.next = node.next;
            __CLR4_4_100louw6v9o.R.inc(418);newNode.previous = node;
            __CLR4_4_100louw6v9o.R.inc(419);if ((((node.next != null)&&(__CLR4_4_100louw6v9o.R.iget(420)!=0|true))||(__CLR4_4_100louw6v9o.R.iget(421)==0&false))) {{
                __CLR4_4_100louw6v9o.R.inc(422);node.next.previous = newNode;
            }
            }__CLR4_4_100louw6v9o.R.inc(423);node.next = newNode;

            __CLR4_4_100louw6v9o.R.inc(424);if ((((node == lastNode)&&(__CLR4_4_100louw6v9o.R.iget(425)!=0|true))||(__CLR4_4_100louw6v9o.R.iget(426)==0&false))) {{
                __CLR4_4_100louw6v9o.R.inc(427);lastNode = newNode;
            }

            // check whether the element should be inserted into
            // the original node or into the new node
            }__CLR4_4_100louw6v9o.R.inc(428);if ((((ptr > node.numElements)&&(__CLR4_4_100louw6v9o.R.iget(429)!=0|true))||(__CLR4_4_100louw6v9o.R.iget(430)==0&false))) {{
                __CLR4_4_100louw6v9o.R.inc(431);node = newNode;
                __CLR4_4_100louw6v9o.R.inc(432);ptr -= node.numElements;
            }
        }}
        }__CLR4_4_100louw6v9o.R.inc(433);for (int i = node.numElements; (((i > ptr)&&(__CLR4_4_100louw6v9o.R.iget(434)!=0|true))||(__CLR4_4_100louw6v9o.R.iget(435)==0&false)); i--) {{
            __CLR4_4_100louw6v9o.R.inc(436);node.elements[i] = node.elements[i - 1];
        }
        }__CLR4_4_100louw6v9o.R.inc(437);node.elements[ptr] = element;
        __CLR4_4_100louw6v9o.R.inc(438);node.numElements++;
        __CLR4_4_100louw6v9o.R.inc(439);size++;
        __CLR4_4_100louw6v9o.R.inc(440);modCount++;

    }finally{__CLR4_4_100louw6v9o.R.flushNeeded();}}

    /**
     * Removes an element from the specified node.
     *
     * @param node the node from which an element should be removed
     * @param ptr the index of the element to be removed within
     * the <tt>node.elements<tt> array
     */
    public void removeFromNode(Node node, int ptr) {try{__CLR4_4_100louw6v9o.R.inc(441);

        __CLR4_4_100louw6v9o.R.inc(442);node.numElements--;
        __CLR4_4_100louw6v9o.R.inc(443);for (int i = ptr; (((i < node.numElements)&&(__CLR4_4_100louw6v9o.R.iget(444)!=0|true))||(__CLR4_4_100louw6v9o.R.iget(445)==0&false)); i++) {{
            __CLR4_4_100louw6v9o.R.inc(446);node.elements[i] = node.elements[i + 1];
        }
        }__CLR4_4_100louw6v9o.R.inc(447);node.elements[node.numElements] = null;
        __CLR4_4_100louw6v9o.R.inc(448);if ((((node.next != null && node.next.numElements + node.numElements <= nodeCapacity)&&(__CLR4_4_100louw6v9o.R.iget(449)!=0|true))||(__CLR4_4_100louw6v9o.R.iget(450)==0&false))) {{
            __CLR4_4_100louw6v9o.R.inc(451);mergeWithNextNode(node);
        } }else {__CLR4_4_100louw6v9o.R.inc(452);if ((((node.previous != null && node.previous.numElements + node.numElements <= nodeCapacity)&&(__CLR4_4_100louw6v9o.R.iget(453)!=0|true))||(__CLR4_4_100louw6v9o.R.iget(454)==0&false))) {{
            __CLR4_4_100louw6v9o.R.inc(455);mergeWithNextNode(node.previous);
        }
        }}__CLR4_4_100louw6v9o.R.inc(456);size--;
        __CLR4_4_100louw6v9o.R.inc(457);modCount++;

    }finally{__CLR4_4_100louw6v9o.R.flushNeeded();}}

    /**
     * This method does merge the specified node with the next node.
     *
     * @param node the node which should be merged with the next node
     */
    public void mergeWithNextNode(Node node) {try{__CLR4_4_100louw6v9o.R.inc(458);

        __CLR4_4_100louw6v9o.R.inc(459);Node next = node.next;
        __CLR4_4_100louw6v9o.R.inc(460);for (int i = 0; (((i < next.numElements)&&(__CLR4_4_100louw6v9o.R.iget(461)!=0|true))||(__CLR4_4_100louw6v9o.R.iget(462)==0&false)); i++) {{
            __CLR4_4_100louw6v9o.R.inc(463);node.elements[node.numElements + i] = next.elements[i];
            __CLR4_4_100louw6v9o.R.inc(464);next.elements[i] = null;
        }
        }__CLR4_4_100louw6v9o.R.inc(465);node.numElements += next.numElements;
        __CLR4_4_100louw6v9o.R.inc(466);if ((((next.next != null)&&(__CLR4_4_100louw6v9o.R.iget(467)!=0|true))||(__CLR4_4_100louw6v9o.R.iget(468)==0&false))) {{
            __CLR4_4_100louw6v9o.R.inc(469);next.next.previous = node;
        }
        }__CLR4_4_100louw6v9o.R.inc(470);node.next = next.next;
        __CLR4_4_100louw6v9o.R.inc(471);if ((((next == lastNode)&&(__CLR4_4_100louw6v9o.R.iget(472)!=0|true))||(__CLR4_4_100louw6v9o.R.iget(473)==0&false))) {{
            __CLR4_4_100louw6v9o.R.inc(474);lastNode = node;
        }

    }}finally{__CLR4_4_100louw6v9o.R.flushNeeded();}}

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
