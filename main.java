package lesson9hw;

public class main {
    public static void main(String[] args) {
        //HW_Ar31
        //Дан массив размера N. Найти номера тех элементов массива, которые
        //больше своего левого соседа, и количество таких элементов. Найденные
        //номера выводить в порядке их убывания.
        /* int N = 11;
        int[] A = new int[N];
        for (int i = 0; i < N; i++) { //diaposon 10 21
            A[i] = (int) (Math.random() * 12) + 10;
            System.out.print(A[i] + " ");
        }
        System.out.println();
        int q = 0;
        for (int i = 1; i < N; i++) {
            if (A[i] > A[i - 1]) {
                q++;
                System.out.print(" Nomera " + i + " Chislo " + A[i]);
            }
        }
        System.out.println("\nKol-vo " + q);
                 */
        //HW Ar32
        //Array32. Дан массив размера N. Найти номер его первого локального минимума
        // (локальный минимум — это элемент, который меньше любого из своих соседей).
        /*int N = 12;
        int[] A = new int[N];
        for (int i = 0; i < N; i++) { //diap -10 10
            A[i] = (int) (Math.random()*21) - 10;
            System.out.print(A[i] + " ");
        }
        System.out.println();
        for (int i = 1; i < N-1; i++) {
            if (A[i] < A[i-1] && A[i] < A[i+1]) {
                System.out.print(" Lokaln minimum " + i + " Chislo " + A[i]);
                break;
            }
        }
                 */
        //Array33. Дан массив размера N. Найти номер его последнего локального максимума (локальный максимум — это элемент, который больше любого из
        //своих соседей).
        /*int N = 32;
        int[] A = new int[N];
        for (int i = 0; i < N; i++) { //13 do 17
            A[i] = (int) (Math.random()*5) + 13;
            System.out.print(A[i] + " ");
        }
        System.out.println();
        for (int i = 1; i < N-1; i++) {
            if (A[i] > A[i-1] && A[i] > A[i+1]) {
                System.out.print(" Loc max " + i + " Chislo " + A[i]);
            }
        }
                 */

    }
}
