    //--------------------------------------------------------------------------//
    //  Using this method:                                                      //
    //                                                                          //
    //      The input array is scrambled randomly and then returned.            //
    //--------------------------------------------------------------------------//    
    public static int[] arrayScrambler(int[] list) {
        for (int i = 0; i < list.length; i++) {
            int target = (int) (list.length*Math.random());
            int temp = list[target];
            list[target] = list[i];
            list[i] = temp;
        }
        return list;
    }