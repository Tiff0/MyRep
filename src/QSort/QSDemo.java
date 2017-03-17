package QSort;

import static java.lang.System.out;

public class QSDemo {
    public static void main(String args[]){
        char a[] = {'d', 'x', 'a', 'r', 'p', 'j', 'i'};
        int i;

        out.print("Basic array: ");
        for (i = 0; i < a.length; i++)
            out.print(a[i]);

        out.println();

        // Sort array
        QuickSort.qsort(a);

        out.print("Aray after sorting: ");
        for(i = 0; i < a.length; i++)
            out.print(a[i]);
    }
}