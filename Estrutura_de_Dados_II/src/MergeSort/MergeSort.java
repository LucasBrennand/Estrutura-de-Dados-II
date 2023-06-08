package MergeSort;

public class MergeSort {
    public void mergeSort(int[] vetor){
        int tamanho = vetor.length;

        if(tamanho<2){
            return;
        }
        int meio = tamanho/2;
        int[] esq = new int[meio];
        int[] dir = new int[tamanho - meio];

        for (int i=0; i<meio; i++){
            esq[i] = vetor[i];
        }
        for (int i=meio; i< tamanho; i++){
            dir[i - meio] = vetor[i];
        }
        mergeSort(esq);
        mergeSort(dir);

        merge(vetor,esq,dir);
    }

    private void merge(int[] vetor, int[] esq, int[] dir){
        int esqTamanho = esq.length;
        int dirTamanho = dir.length;

        int i = 0, j = 0, k = 0;
        while (i < esqTamanho && j < dirTamanho){
            if(esq[i] <= dir[j]){
                vetor[k] = esq[i];
                i++;
            }
            else {
                vetor[k] = dir[j];
                j++;
            }
            k++;
        }
        while (i < esqTamanho){
            vetor[k] = esq[i];
            i++;
            k++;
        }
        while (j < dirTamanho){
            vetor[k] = dir[j];
            j++;
            k++;
        }
    }
    public void imprimir(int[] vetor){
        for (int i = 0; i < vetor.length; i++){
            System.out.print(vetor[i]+" ");
        }
    }
}
