package QuickSort;

public class MainQuickSort {
    public static void main(String[] args) {
        int[] vetor = {9, 25, 10, 18, 5, 7, 15, 3};
        QuickSort quick = new QuickSort();

        System.out.println("Antes: ");
        quick.imprimir(vetor);
        quick.quicksort(vetor);
        System.out.println("");
        System.out.println("Depois: ");
        quick.imprimir(vetor);

    }
}
