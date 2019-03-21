package lab3.cw5;

public class QuickSort {
    int partition(int arr[], int low, int high)
    {
        int pivot = arr[high];
        int i = (low-1); // index of smaller element
        for (int j=low; j<high; j++)
        {
            // If current element is smaller than or
            // equal to pivot
            if (arr[j] <= pivot)
            {
                i++;

                // swap arr[i] and arr[j]
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }

        // swap arr[i+1] and arr[high] (or pivot)
        int temp = arr[i+1];
        arr[i+1] = arr[high];
        arr[high] = temp;

        return i+1;
    }
    /* The main function that implements QuickSort()
      arr[] --> Array to be sorted,
      low  --> Starting index,
      high  --> Ending index */
    void quickSort(int arr[], int low, int high)
    {
        if (low < high)
        {
            /* pi is partitioning index, arr[pi] is
              now at right place */
            int pi = partition(arr, low, high);

            // Recursively sort elements before
            // partition and after partition
            quickSort(arr, low, pi-1);
            quickSort(arr, pi+1, high);
        }
    }

    public static void quick(int[] real, int[] opt, int[] pes) {
        //SORT REAL
        long tStart = System.currentTimeMillis();
// uruchom sortowanie.
        QuickSort ob = new QuickSort();
        ob.quickSort(real,0,real.length-1);

        long tEnd = System.currentTimeMillis();
        long tDelta = tEnd - tStart;
        double elapsedSeconds = tDelta / 1000.0;
        System.out.println("Realistic case: " + elapsedSeconds + "s passed");

//SORT OPT
        tStart = System.currentTimeMillis();
// uruchom sortowanie.
        ob = new QuickSort();
        ob.quickSort(opt,0,opt.length-1);

        tEnd = System.currentTimeMillis();
        tDelta = tEnd - tStart;
        elapsedSeconds = tDelta / 1000.0;
        System.out.println("Optimistic case: " + elapsedSeconds + "s passed");

//SORT PES
        tStart = System.currentTimeMillis();
// uruchom sortowanie.
        ob = new QuickSort();
        ob.quickSort(pes,0,pes.length-1);

        tEnd = System.currentTimeMillis();
        tDelta = tEnd - tStart;
        elapsedSeconds = tDelta / 1000.0;
        System.out.println("Pesimistic case: " + elapsedSeconds + "s passed");
    }
}