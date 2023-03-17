package Arvore_Binaria;

public class BinaryTree<T extends Comparable<T>> {

    private Node<T> raiz;

    public boolean isEmpty() {
        if (this.raiz == null) {
            return true;
        } else {
            return false;
        }
    }

    public void insert(T value) {
        if (this.isEmpty() == true) {
            this.raiz = new Node(value);
        } else {
            this.raiz.insertNode(value);
        }
    }

    public void emOrdem() {
        if (this.isEmpty() == true) {
            System.out.println("Árvore vazia");
        } else {
            this.percorrerEmOrdem(this.raiz);
        }
    }

    public void preOrdem() {
        if (this.isEmpty() == true) {
            System.out.println("Árvore vazia");
        } else {
            this.percorrerPreOrdem(this.raiz);
        }
    }

    public void posOrdem() {
        if (this.isEmpty() == true) {
            System.out.println("Árvore vazia");
        } else {
            this.percorrerPosOrdem(this.raiz);
        }
    }

    private void percorrerEmOrdem(Node<T> r) {
        if (r != null) {
            percorrerEmOrdem(r.getLeft());
            System.out.println(r.getInfo());
            percorrerEmOrdem(r.getRight());
        }
    }

    private void percorrerPreOrdem (Node<T> r) {
        if (r != null) {
            System.out.println(r.getInfo());
            percorrerPreOrdem (r.getLeft());
            percorrerPreOrdem (r.getRight());
        }
    }

    private void percorrerPosOrdem (Node<T> r) {
        if (r != null) {
            percorrerPosOrdem (r.getLeft());
            percorrerPosOrdem (r.getRight());
            System.out.println(r.getInfo());
        }
    }

    public T find(T value) {
        if (this.isEmpty() == true) {
            return null;
        } else {
            return raiz.findNode(value);
        }
    }
}
