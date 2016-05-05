
    public static int[] insertionSort(int[] list) {
        for (int i = 1; i < list.length; i++) {
            for (int j = i - 1; j >= 0; j--) {
                if (list[i] > list[j]) {
                    int temp = list[i];
                    list[i] = list[j];
                    list[j] = temp;
                }
                else {
                    break;
                }
            }
        }
        return list;
    }