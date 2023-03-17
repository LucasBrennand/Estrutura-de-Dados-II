package Arvore_AVL;

public class Node <T extends Comparable<T>> {
    private Node<T> left;
    private Node<T> right;
    private T info;
    int value;
    int height;
    public Node (T value) {
        this.info = value;
        this.height = 1;
    }

    public Node<T> getLeft() {
        return left;
    }

    public void setLeft(Node<T> left) {
        this.left = left;
    }

    public Node<T> getRight() {
        return right;
    }

    public void setRight(Node<T> right) {
        this.right = right;
    }

    public T getInfo() {
        return info;
    }

    public void setInfo(T info) {
        this.info = info;
    }
    public void insertNode (T value){
        if (value.compareTo(this.getInfo()) == 0) {
            System.out.println("Valor repetido");
        }
        else if (value.compareTo(this.getInfo()) < 0) {
            if (this.left == null){
                this.left = new Node<>(value);
            }
            else {
                this.left.insertNode (value);
            }
        }
        else {
            if (this.right == null){
                this.right = new Node<>(value);
            }
            else {
                this.right.insertNode (value);
            }
        }
    }
    private Node<T> removeNode (Node<T> r, T value) {
        if (r != null) {
            if (value.compareTo( r.getInfo()) == 0) {
            }
            else if (value.compareTo( r.getInfo()) < 0) {
                r.setLeft(removeNode (r.getLeft(), value));
            }
            else {
                r.setRight(removeNode (r.getRight(), value));
            }
        }
        return r;
    }
    public T findNode (T value) {
        if (value.compareTo(this.info) == 0) {
            return this.info;
        }
        else if (value.compareTo(this.info) < 0) {
            if (this.left == null){
                return null;
            }
            else {
                return this.left.findNode (value);
            }
        }
        else {
            if (this.right == null){
                return null;
            }
            else {
                return this.right.findNode (value);
            }
        }
    }

}

