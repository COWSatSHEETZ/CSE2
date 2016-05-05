    //--------------------------------------------------------------------------//
    //  Using this method:                                                      //
    //                                                                          //
    //      If the target value was found, the first value in the returned      //
    //      array is 1 for true. The second value is the index in the input     //
    //      array where the target value is located. The third value is the     //
    //      number of iterations it took to find the target value.              //
    //                                                                          //
    //      If the target value was not found, the first vaule in the returned  //
    //      array is 0 for false, the second value is the index in the input    //
    //      array of the next smallest value, and the third value is the number //
    //      of iterations it took to determine that the target number was not   //
    //      present. If the target value is smaller than every value in the     //
    //      input array, the second value is set equal to 0.                    //
    //                                                                          //
    //      ONLY USABLE WITH SORTED ARRAYS                                      //
    //--------------------------------------------------------------------------//
    public static int[] binarySearch(int list[], int target) {
        int first = 0, last = list.length - 1, middle;
        middle = (list.length - 1)/2;
        int i = 1;
        if (target < list[0]) {
            int[] result = {0, 0, 1};
            return result;
        }
        else if (target > list[list.length - 1]) {
            int[] result = {0, last, 1};
            return result;
        }
        else {
            while (first <= last) {
                if (list[middle] < target) {
                    first = middle + 1;
                }
                else if (list[middle] == target) {
                    int result[] = {1, middle, i};
                    return result;
                }
                else {
                    last = middle - 1;
                }
                middle = (first + last)/2;
                i++;
            }
        }
        int result[] = {0, middle, i};
        return result;
    }