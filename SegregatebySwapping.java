public class SegregatebySwapping {
    public static void main(String[] args) {
        int arr[] = new int[] { 0, 1, 0, 1, 1, 1, 1, 0, 0, 1 };
        int res[] = Segregatebyswapping(arr);
        for (int i : res) {
            System.out.print(i + ",");
        }
    }

    private static int[] Segregatebyswapping(int[] arr) {
        int i = 0;
        int j = arr.length - 1;
        while (i < j) {
            if (arr[i] == 0)
                i++;
            else if (arr[j] == 1)
                j--;
            if (arr[i] == 1 && arr[j] == 0) {
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
                i++;
                j--;
            }
        }
        return arr;
    }
}
