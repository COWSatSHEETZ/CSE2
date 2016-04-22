    //--------------------------------------------------------------------------//
    //  Using this method:                                                      //
    //                                                                          //
    //      If the target value was found, the first value in the returned      //
    //      array is 1 for true. The second value is the index in the input     //
    //      array where the target value is located.                            //
    //                                                                          //
    //      If the target value was not found, the first vaule in the returned  //
    //      array is 0 for false, the second value is the value of the last     //
    //      index in the array, and the third value is the number of iterations //
    //      it took to determine that the target number was not present.        //
    //--------------------------------------------------------------------------//    
    public static int[] linearSearch(int[] list, int target) {
        for (int i = 0; i < list.length; i++) {
            if (list[i] == target) {
                int[] result = {1, i, i + 1};
                return result;
            }
        }
        int[] result = {0, list.length - 1, list.length};
        return result;
    }