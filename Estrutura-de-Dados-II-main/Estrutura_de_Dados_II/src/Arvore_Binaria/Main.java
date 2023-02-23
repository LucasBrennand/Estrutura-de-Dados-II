package Arvore_Binaria;
public class Main {

    public static void main(String[] args) {
        BinaryTree<Integer> arvore = new BinaryTree();

        arvore.insert(500);
        arvore.insert(100);
        arvore.insert(300);
        arvore.insert(900);
        arvore.insert(100);
        arvore.insert(600);
        arvore.insert(200);
        arvore.insert(800);
        arvore.insert(250);
        arvore.insert(700);
        System.out.println("Valores da árvore em ordem: ");
        arvore.emOrdem();
        System.out.println("Valor encontrado: " + arvore.find(100));
        System.out.println("Valor encontrado: " + arvore.find(50));
    }

}