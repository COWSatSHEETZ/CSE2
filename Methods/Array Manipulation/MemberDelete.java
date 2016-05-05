    //--------------------------------------------------------------------------//
    //  Using this method:                                                      //
    //                                                                          //
    //      The member of the input array corresponding to the specified index  //
    //      is deleted from the array and the newly formed array is returned.   //
    //--------------------------------------------------------------------------//
    public static int[] memberDelete(int[] list, int index) {
        int[] listDeleted = new int[list.length - 1];
        for (int i = 0; i < index; i++) {
            listDeleted[i] = list[i];
        } 
        for (int i = index + 1; i < listDeleted.length; i++) {
            listDeleted[i - 1] = list[i];
        }
        return listDeleted;
    }