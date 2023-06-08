package MergeSort;

public class Main {
    public static void main(String[] args) {
        MergeSort num = new MergeSort();
        int[] vetor = {85,99,98,97,96,95,94,93,92,91,90,89, 87,86, 74};

        System.out.println("Antes: ");
        num.imprimir(vetor);

        num.mergeSort(vetor);
        System.out.println("");
        System.out.println("Depois: ");
        num.imprimir(vetor);
    }
}
