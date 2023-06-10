package QuickSort;

public class QuickSort {
    public void quicksort(int[] vetor){
        quicksort(vetor, 0, vetor.length - 1);
    }
    public void quicksort(int[] vetor, int indexMenor, int indexMaior){
        if(indexMenor >= indexMaior){
            return;
        }
        int pivot = vetor[indexMaior];
        int apontaEsq = indexMenor;
        int apontaDir = indexMaior;

        while (apontaEsq < apontaDir){
            while(vetor[apontaEsq] <= pivot && apontaEsq < apontaDir){
                apontaEsq++;
            }
            while (vetor[apontaDir] >= pivot && apontaEsq < apontaDir){
                apontaDir--;
            }
            swap(vetor, apontaEsq, apontaDir);
        }
        swap(vetor, apontaEsq, indexMaior);
        quicksort(vetor, indexMenor, apontaEsq - 1);
        quicksort(vetor, apontaEsq + 1, indexMaior);
    }

    private static void swap(int[] vetor, int index1, int index2){
        int aux = vetor[index1];
        vetor[index1] = vetor[index2];
        vetor[index2] = aux;
    }

    public void imprimir(int[] vetor){
        for (int i = 0; i < vetor.length; i++){
            System.out.print(vetor[i]+" ");
        }
    }
}
