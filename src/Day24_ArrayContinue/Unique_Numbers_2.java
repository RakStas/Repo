package Day24_ArrayContinue;




    public class Unique_Numbers_2 {

        public static void main(String[] args) {
            int[] a = {1, 2, 3, 4};
            int[] b = {4, 16, 1, 2, 3, 22};
            int[] c = new int[a.length + b.length];
            int count = 0;
            for (int i = 0; i < a.length; i++) {
                c[i] = a[i];
                count++;
            }
            for (int j = 0; j < b.length; j++) {
                c[count++] = b[j];
            }
            for (int i = 0; i < c.length; i++)
                System.out.print(c[i] + " ");

            int max = c[0];
            int min = c[0];
            for (int i = 0; i <= c.length - 1; i++) {

                if (c[i] > max) {
                    max = c[i];
                }
                if (c[i] < min) {
                    min = c[i];
                }



            }
            System.out.println();
            System.out.println("max is " + max);
            System.out.println("min is " + min);
        }
    }