    //--------------------------------------------------------------------------//
    //  Using this method:                                                      //
    //                                                                          //
    //      Method returns a 4 index double array where the 0th index contains  //
    //      the minimum value in the input array, the 1st index contains the    //
    //      maximum value, the 2nd index contains the mean of the array, and    //
    //      the 3rd index contains the mode.                                    //
    //--------------------------------------------------------------------------//
    public static double[] minMaxMeanMode(int[] list) {
        double[] minMaxMeanMode = new double[4];
        minMaxMeanMode[0] = list[0];
        minMaxMeanMode[1] = list[0];
        int sum = list[0];
        for (int i = 1; i < list.length; i++) {
            sum += list[i];
            if (list[i] < minMaxMeanMode[0]) {
                minMaxMeanMode[0] = list[i];
            }
            else if (list[i] > minMaxMeanMode[1]) {
                minMaxMeanMode[1] = list[i];
            }
        }
        minMaxMeanMode[2] = (double) sum/list.length;
        int maxCount = 0;
        for (int i = 0; i < list.length; i++) {
            int count = 0;
            for (int j = 0; j < list.length; j++) {
                if (list[j] == list[i]) count++;
            }
            if (count > maxCount) {
                maxCount = count;
                minMaxMeanMode[3] = list[i];
            }
        }
        return minMaxMeanMode;
    }