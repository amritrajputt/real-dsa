public class Segregatezerosandones {
    public static void main(String[] args) {
        int arr[] = new int[] { 0, 1, 0, 0, 1, 1, 1, 0 };
        int res[] = segregate(arr);
        // for (int i : res) {
        //     System.out.print(i + ",");
        // }
        int res2[] = segregateTwo(arr);
        for (int i : res2) {
            System.out.print(i + ",");
        }
    }

    private static int[] segregate(int[] arr) {
        int zero = 0;
        int one = 0;
        for (int i : arr) {
            if (i == 0) {
                zero++;
            } else
                one++;
        }
        for (int i = 0; i < arr.length; i++) {
            if (zero > 0) {
                arr[i] = 0;
                zero--;
            } else if (one > 0) {
                arr[i] = 1;
                one--;
            }
        }
        return arr;
    }

    private static int[] segregateTwo(int[] arr) {
        int len = arr.length;
        int i = 0;
        int j = len - 1;
        for (int k = 0; k < arr.length; k++) {
                if (arr[k] == 0) {
                    arr[i] = 0;
                    i++;
                } else {
                    arr[j] = 1;
                    j--;
                }
            }
        return arr;
    }
}
