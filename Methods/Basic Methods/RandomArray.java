    //--------------------------------------------------------------------------//
    //  Using this method:                                                      //
    //                                                                          //
    //      Create an array of any size whose members are populated by a random //
    //      number of your choice.                                              //
    //--------------------------------------------------------------------------//    
    public static int[] randomArray() {
        Random rand = new Random();
        int[] random = new int[10];
        for (int i = 0; i < random.length; i++) {
            random[i] = rand.nextInt(101);
        }
        return random;
    }