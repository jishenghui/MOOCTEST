package net.mooctest;

/**
 * 
 * @author juraj67
 * @param <T>
 */
public class Heap_Item <T extends Comparable<T>> {
    
    private Heap_Item ancestor;
    private Heap_Item leftSon;
    private Heap_Item rightSon;
    private T data;
    
    /**
     * Constructor creates an empty Heap_Item
     */
    public Heap_Item() {
    }
    
    /**
     * Constructor creates a new Heap_Item
     * @param data 
     */
    public Heap_Item(T data) {
        this.data = data;
    }
    
    /**
     * Copy constructor makes a copy of Heap_Item
     * @param paCopy_HeapItem 
     */
    public Heap_Item(Heap_Item<T> paCopy_HeapItem) {
        this.leftSon = paCopy_HeapItem.getLeftSon();
        this.rightSon = paCopy_HeapItem.getRightSon();
        this.data = paCopy_HeapItem.getData();
        this.ancestor = paCopy_HeapItem.getAncestor();
    }

    /**
     * Method returns the ancestor in binary form
     */
    public Heap_Item<T> getAncestor() {
        return ancestor;
    }
    
    /**
     * Method sets the ancestor of the heap (in binary form)
     * @param ancestor 
     */
    public void setAncestor(Heap_Item ancestor) {
        this.ancestor = ancestor;
    }
    
    /**
     * Method returns the ancestor of the multi-way pairing heap
     * @return 
     */
    public Heap_Item<T> getMultiWayAncestor() {
        if(this.ancestor != null) {
            if(this.ancestor.itIsLeftSon(this)) {
                return this.ancestor;
            } else {
                Heap_Item<T> node = this.ancestor;
                while(!node.getAncestor().itIsLeftSon(node)) {
                    node = node.getAncestor();
                }
                return node.getAncestor();
            }
        }
        return null;
    }
    
    /**
     * Method returns the left son of heap
     * @return 
     */
    public Heap_Item<T> getLeftSon() {
        return this.leftSon;
    }
    
    /**
     * Method returns the right son of heap
     * @return 
     */
    public Heap_Item<T> getRightSon() {
        return this.rightSon;
    }
    
    /**
     * Method returns heap data
     * @return 
     */
    public T getData() {
        return (this.data == null ? null : this.data);
    }
    
    /**
     * Method sets the heap data
     * @param data 
     */
    public void setData(T data) {
        this.data = data;
    }
    
    /**
     * Set left son of the heap 
     * @param leftSon 
     */
    public void setLeftSon(Heap_Item leftSon) {
        this.leftSon = leftSon;
    }
    
    /**
     * Set right son of the heap 
     * @param rightSon 
     */
    public void setRightSon(Heap_Item rightSon) {
        this.rightSon = rightSon;
    }
    
    /**
     * Method returns true if the heap has a left son
     * @return 
     */
    public boolean hasLeftSon() {
        return (this.leftSon != null);
    }
    
    /**
     * Method returns true if the heap has a right son
     * @return 
     */
    public boolean hasRightSon() {
        return (this.rightSon != null);
    }
    
    /**
     * Method removes the left son from the heap
     */
    public void removeLeftSon() {
        this.leftSon = null;
    }
    
    /**
     * Method removes the right son from the heap
     */
    public void removeRightSon() {
        this.rightSon = null;
    }
    
    /**
     * Method returns an item that matches the criteria
     * @param paCriterion
     * @return 
     */
    public Heap_Item<T> getSonByData(T paCriterion) {
        if(this.hasLeftSon() && this.leftSon.getData().compareTo(paCriterion) == 0) {
            return this.leftSon;
        } else if(this.hasRightSon() && this.rightSon.getData().compareTo(paCriterion) == 0) {
            return this.rightSon;
        } else {
            return null;
        }
    }
    
    /**
     * Method removes an item that matches the criteria
     * @param paCriterion 
     */
    public void removeChild(T paCriterion) {
        if(this.hasLeftSon() && this.leftSon.getData().compareTo(paCriterion) == 0) {
            this.leftSon = null;
            return;
        } 
        if(this.hasRightSon() && this.rightSon.getData().compareTo(paCriterion) == 0) {
            this.rightSon = null;
            return;
        }
    }
    
    /**
     * Method returns true, if the parameter matches the left son of the heap
     * @param paNode
     * @return 
     */
    public boolean itIsLeftSon(Heap_Item<T> paNode) {
        return (this.leftSon == paNode ? true : false);
    }
    
    /**
     * Method replaces a son who meets the criteria
     * @param paCriterion
     * @param paNode
     * @return 
     */
    public boolean replaceChild(T paCriterion, Heap_Item<T> paNode) {
        if(this.hasLeftSon() && this.leftSon.getData().compareTo(paCriterion) == 0) {
            this.leftSon = paNode;
            return true;
        } else if(this.hasRightSon()&& this.rightSon.getData().compareTo(paCriterion) == 0){
            this.rightSon = paNode;
            return true;
        } else { 
            return false;
        }
    }
}
