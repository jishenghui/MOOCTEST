package net.mooctest;

/**
 * Created by Krietallo on 4/27/2017.
 */
public class AVLNode<T> {

    private static final int ALLOWED_IMBALANCE = 1; //Difference between left and right subtrees
    private T element; // The data in the node
    private AVLNode<T> left; // Left child
    private AVLNode<T> right; // Right child


    public AVLNode(T theElement) {
        this(theElement, null, null);
    }

    public AVLNode(T theElement, AVLNode<T> lt, AVLNode<T> rt) {
        element = theElement;
        left = lt;
        right = rt;
    }

    private static AVLNode balance(AVLNode t) {
        if (t == null)
            return t;

        if (t.getLeftHeight() - t.getRightHeight() > ALLOWED_IMBALANCE)
            if ((t.left == null ? 0 : t.left.getLeftHeight()) >= (t.left == null ? 0 : t.left.getRightHeight()))
                t = rotateWithLeftChild(t);
            else
                t = doubleWithLeftChild(t);
        else if (t.getRightHeight() - t.getLeftHeight() > ALLOWED_IMBALANCE)
            if ((t.right == null ? 0 : t.right.getRightHeight()) >= (t.right == null ? 0 : t.right.getLeftHeight()))
                t = rotateWithRightChild(t);
            else
                t = doubleWithRightChild(t);

        return t;
    }

    private static AVLNode rotateWithRightChild(AVLNode k1) {
        AVLNode k2 = k1.right;
        k1.right = k2.left;
        k2.left = k1;
        return k2;
    }

    private static AVLNode rotateWithLeftChild(AVLNode k2) {
        AVLNode k1 = k2.left;
        k2.left = k1.right;
        k1.right = k2;
        return k1;
    }

    private static AVLNode doubleWithRightChild(AVLNode k1) {
        k1.right = rotateWithLeftChild(k1.right);
        return rotateWithRightChild(k1);
    }

    private static AVLNode doubleWithLeftChild(AVLNode k3) {
        k3.left = rotateWithRightChild(k3.left);
        return rotateWithLeftChild(k3);
    }

    private int getLeftHeight() {
        return this.left == null ? 0 : this.left.getHeight();
    }

    private int getRightHeight() {
        return this.right == null ? 0 : this.right.getHeight();
    }

    private static AVLNode remove(Object x, AVLNode source) {
        int compareResult = x.toString().compareTo(source.element.toString());

        if (compareResult < 0) {
            if (source.left == null)
                return null;
            source.left = remove(x, source.left);
        } else if (compareResult > 0) {
            if (source.right == null)
                return null;
            source.right = remove(x, source.right);
        } else if (source.left != null && source.right != null) {
            // Two children
            source.element = source.findMin(source.right).element;
            source.right = remove(source.element, source.right);
        } else
            source = source.left != null ? source.left : source.right;
        return balance(source);
    }

    public T getElement() {
        return element;
    }

    public AVLNode<T> getLeft() {
        return left;
    }

    public AVLNode<T> getRight() {
        return right;
    }

    public int getHeight() {
        return 1 + Math.max(this.left == null ? 0 : this.left.getHeight(), this.right == null ? 0 : this.right.getHeight());
    }

    public AVLNode<T> insert(T x) throws Exception {
        int compareResult = x.toString().compareTo(this.element.toString());
        if (compareResult < 0) {
            if (this.left != null) {
                this.left = this.left.insert(x);
            } else {
                this.left = new AVLNode<T>(x);
            }
        } else if (compareResult > 0) {
            if (this.right != null) {
                this.right = this.right.insert(x);
            } else {
                this.right = new AVLNode<T>(x);
            }
        } else {
            throw new Exception("Duplicate");
        }
        return balance(this);
    }

    public AVLNode<T> findMin(AVLNode<T> t) {
        while (t.left != null)
            t = t.left;

        return t;
    }

    public boolean search(T x) {
        int compareResult = x.toString().compareTo(this.getElement().toString());
        boolean found = true;
        if (compareResult < 0) {
            if (this.left == null)
                return false;
            found = this.left.search(x);
        } else if (compareResult > 0) {
            if (this.right == null)
                return false;
            found = this.right.search(x);
        }
        return found;

    }

    public AVLNode<T> delete(T x) {
        if (search(x))
            return remove(x, this);

        return null;
    }
}
