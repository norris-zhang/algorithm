package dogdull;

public class InsertionSort {
    public static void main(String[] args) {
        int[] a = {2,4,1,6,3,7,8};
        for (int i = 1; i < a.length; i++) {
            int key = a[i];
            int j = i;
            while (j > 0 && key < a[j-1]) {
                a[j] = a[j-1];
                j--;
            }
            a[j] = key;
        }
        print(a);
    }

    private static void print(int[] a) {
        for (int i : a) {
            System.out.print(i);
            System.out.print(", ");
        }
        System.out.println();
    }
}
