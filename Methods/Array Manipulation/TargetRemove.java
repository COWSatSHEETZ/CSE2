    //--------------------------------------------------------------------------//
    //  Using this method:                                                      //
    //                                                                          //
    //      Removes all instances of the target value from the input array and  //
    //      returns the shortened array.                                        //
    //--------------------------------------------------------------------------//
    public static int[] targetRemove(int[] list, int target) {
        int instances = 0;
            if (list[i] == target) {
                instances++;
            }
        }
        int[] listRemoved = new int[list.length - instances];
        int j = 0;
        for (int i = 0; i < listRemoved.length; i++) {
            if (list[j] == target) {
                do {
                    j++;
                } while (list[j] == target);
            }
            listRemoved[i] = list[j];
            j++;
        }
        return listRemoved;
    }