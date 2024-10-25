package net.mooctest;

import java.util.Queue;
import java.util.LinkedList;

/**
 *
 * @author juraj67
 * @param <T>
 */
public class Pairing_Heap <T extends Comparable<T>>  {

    private Heap_Item<T> root;

    /**
     * Constructor creates an empty Pairing_Heap
     */
    public Pairing_Heap() {
    }

    /**
     * Constructor creates new Pairing_Heap with root
     * @param root
     */
    public Pairing_Heap(Heap_Item<T> root) {
        this.root = root;
    }

    /**
     * Copy constructor makes a copy of Pairing_Heap
     * @param heap_toCopy
     */
    public Pairing_Heap(Pairing_Heap<T> heap_toCopy) {
        this.root = heap_toCopy.getRoot();
    }

    /**
     * Method returns the root of the pairing heap
     * @return
     */
    public Heap_Item<T> getRoot() {
        return this.root;
    }

    /**
     * Method returns the root data
     * @return
     */
    public T peek() {
        return this.root.getData();
    }

    /**
     * Method inserts a new heap item into the pairing heap
     * @param to_insert
     * @return
     */
    public Heap_Item<T> push(Heap_Item<T> to_insert) {
        if(this.root == null) {
            this.root = to_insert;
            return this.root;
        } else {
            this.root = pair(this, new Pairing_Heap(to_insert)).getRoot();
            return to_insert;
        }
    }

    /**
     * Method removes the root of the pairing heap and also returns heap data
     * @return
     */
    public T pop() {
        return (this.root == null) ? null : this.pop_heap_item().getData();
    }

    /**
     * Method removes the root of the pairing heap, finds the new root and returns the heap item
     * @return
     */
    private Heap_Item<T> pop_heap_item() {
        if(this.root == null) {                                  //if the heap is empty
            return null;// 无用的,唯一使用就判定了!=null
        } else {
            Heap_Item<T> old_root = this.root;
            this.root = null;
            if(!old_root.hasLeftSon()) {                    //if the heap contains only the root
                return old_root;
            } else {                                        //if the heap contains more items
                if(!old_root.getLeftSon().hasRightSon()) {  //if the heap consists of one heap
                    old_root.getLeftSon().setAncestor(null);
                    this.root = old_root.getLeftSon();
                    return old_root;
                } else {                                    //if the heap consists of multiple heaps
                    Heap_Item<T> help_item = old_root.getLeftSon();
                    help_item.setAncestor(null);
                    this.root = multi_heaps_merge(help_item).getRoot(); //returns the heap and sets root
                    return old_root;
                }
            }
        }
    }

    /**
     * Multi-pass pairing heap
     * Method pairs all heaps that remain after the root has been removed
     * @param paLeftSonOfRoot
     * @return
     */
    private Pairing_Heap<T> multi_heaps_merge(Heap_Item paLeftSonOfRoot) {
        Queue<Pairing_Heap<T>> fifo = new LinkedList<>();

        //fills the queue with all heaps
        Heap_Item<T> help_item = null;
        do {
            help_item = paLeftSonOfRoot.getRightSon();
            paLeftSonOfRoot.removeRightSon();
            paLeftSonOfRoot.setAncestor(null);
            if(paLeftSonOfRoot.hasLeftSon()) {
                paLeftSonOfRoot.getLeftSon().setAncestor(paLeftSonOfRoot);
            }
            fifo.add(new Pairing_Heap<>(paLeftSonOfRoot));
            paLeftSonOfRoot = help_item;
        } while(help_item != null);

        //pairs two heaps and put them in a queue until only one heap is in queue
        while(fifo.size() != 1) {
            fifo.add(pair(fifo.remove(),fifo.remove()));
        }
        //returns last pairing heap that remains in the queue
        return fifo.remove();
    }



    /**
     * Method pairs two pairing heaps
     * @param paHeap1
     * @param paHeap2
     * @return
     */
    private Pairing_Heap<T> pair(Pairing_Heap<T> paHeap1, Pairing_Heap<T> paHeap2) {
        if(paHeap1.getRoot() == null) {
            return paHeap2;
        }
        if(paHeap2.getRoot() == null) {
            return paHeap1;
        }
        if(paHeap1.getRoot().getData().compareTo(paHeap2.getRoot().getData()) <= 0) { //if 2 has a worse priority then 1
            if(paHeap1.getRoot().hasLeftSon()) {
                Heap_Item<T> help_item = paHeap1.getRoot().getLeftSon();
                paHeap1.getRoot().setLeftSon(paHeap2.getRoot());
                paHeap2.getRoot().setAncestor(paHeap1.getRoot());
                paHeap2.getRoot().setRightSon(help_item);
                help_item.setAncestor(paHeap2.getRoot());
                return paHeap1;
            } else {
                paHeap1.getRoot().setLeftSon(paHeap2.getRoot());
                paHeap2.getRoot().setAncestor(paHeap1.getRoot());
                return paHeap1;
            }
        } else {                                                                //if 2 has a better priority then 1
            if(paHeap2.getRoot().hasLeftSon()) {
                Heap_Item<T> help_item = paHeap2.getRoot().getLeftSon();
                paHeap2.getRoot().setLeftSon(paHeap1.getRoot());
                paHeap1.getRoot().setAncestor(paHeap2.getRoot());
                paHeap1.getRoot().setRightSon(help_item);
                help_item.setAncestor(paHeap1.getRoot());
                return paHeap2;
            } else {
                paHeap2.getRoot().setLeftSon(paHeap1.getRoot());
                paHeap1.getRoot().setAncestor(paHeap2.getRoot());
                return paHeap2;
            }
        }
    }

    /**
     * Method checks if the positions of the items are correct after the priority change
     * @param paNode
     */
    public void checkPriority(Heap_Item<T> paNode) {
        //increasing - checking if the paNode has better priority as his ancestor in multi-way form
        if(paNode.getAncestor() != null && paNode.getMultiWayAncestor().getData().compareTo(paNode.getData()) > 0) {
            paNode.getAncestor().replaceChild(paNode.getData(), null);                  //removes item from heap
            paNode.setAncestor(null);
            if(paNode.hasRightSon()) {
                paNode = this.multi_heaps_merge(paNode).getRoot();
            }
            this.root = this.pair(this, new Pairing_Heap(paNode)).getRoot();               //pairing with root
            return;
        }
        //decreasing - checking if the paNode has a worse priority then his sons in multi-way form
        if(paNode.hasLeftSon()) {
            Heap_Item<T> son_of_node = paNode.getLeftSon();
            do {
                if(paNode.getData().compareTo(son_of_node.getData()) > 0) {
                    son_of_node = paNode.getLeftSon();
                    paNode.removeLeftSon();                                             //removes all sons from heap
                    son_of_node.setAncestor(null);
                    Pairing_Heap<T> merged_heap = this.multi_heaps_merge(son_of_node);  //merging sons

                    Heap_Item<T> right_sonof_node = paNode.getRightSon();
                    Heap_Item<T> anchestor_of_node = paNode.getAncestor();
                    if(right_sonof_node != null) {
                        right_sonof_node.setAncestor(null);
                        paNode.removeRightSon();
                    }
                    merged_heap = this.pair(merged_heap, new Pairing_Heap(paNode));     //pairs and sets new root
                    //puts a new subtree with a new root at the originally location
                    if(anchestor_of_node != null) {                                     //if the item was root
                        anchestor_of_node.replaceChild(paNode.getData(),merged_heap.getRoot());
                        merged_heap.getRoot().setRightSon(right_sonof_node);
                        merged_heap.getRoot().setAncestor(anchestor_of_node);
                        if(right_sonof_node != null) {                                  //if the item has right son
                            right_sonof_node.setAncestor(merged_heap.getRoot());
                        }
                    } else {
                        this.root = merged_heap.getRoot();
                    }
                    break;
                }
                son_of_node = son_of_node.getRightSon();
            } while(son_of_node != null);
        }
    }
}
