public class FillingAnArray {

        public static void main(String[] args) {

            int[] arr = new int[10];

            for (int i = 0; i < arr.length; i++) {
                arr[i] =  9-i;
            }

            for (int value : arr) {

                System.out.println(value);
            }
        }
    }

