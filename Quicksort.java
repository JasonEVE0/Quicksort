/**
 * Quicksort algorithm with random pivot
 * Feel free to use, modify, distribute this work however you wish.
 */
public class Quicksort {

    /**
     * Sorts the given array in ascending order.
     * @param array the array to be sorted.
     * @param low the minimum index of the array.
     * @param high the maxiumum index of the array.
     */
    public void quicksort(int[] array, int low, int high){
        if (low < high){
            int pivot = partition(array, low, high);

            quicksort(array, low, pivot - 1);
            quicksort(array, pivot + 1, high);
        }
    }

    /**
     * Partitions the array.
     * @param array the array to be sorted.
     * @param low the minimum index of the array.
     * @param high the maxiumum index of the array.
     * @return the index which has been placed in its correct position is returned.
     */
    private int partition(int[] array, int low, int high){
        int i = low;
        int pivot = (int) Math.floor(Math.random() * (high-low)) + low;

        swap(array, pivot, high);

        for (int j = low; j < high; j++){
            if (array[j] < array[high]){
                swap(array, i, j);
                i++;
            }
        }

        swap(array, i, high);
        return i;
    }

    /**
     * Swaps the positions of the argumented indices.
     * @param array the array which the swap is performed on.
     * @param x1 the first element to be swapped.
     * @param x2 the second element to be swapped.
     */
    private void swap(int[] array, int x1, int x2){
        int temp = array[x1];
        array[x1] = array[x2];
        array[x2] = temp;
    }

}