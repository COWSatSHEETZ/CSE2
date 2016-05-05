    //--------------------------------------------------------------------------//
    //  Using this method:                                                      //
    //                                                                          //
    //      Input an array of any type and convert it to a String for easy      //
    //      printing.                                                           //
    //--------------------------------------------------------------------------//
    public static String arrayToString(int[] list) {
        String array = "{";
        for (int i = 0; i < list.length; i++) {
            if (i > 0) {
                array += ", ";
            }
            array += list[i];
        }
        array += "}";
        return array;
    }