    //--------------------------------------------------------------------------//
    //  Using this method:                                                      //
    //                                                                          //
    //      Ensures that the user's input is an integer and perpetually prompts //
    //      the user for an integer until one is provided. The integer is then  //
    //      returned.                                                           //
    //--------------------------------------------------------------------------//
    public static int intCheck() {
        Scanner sc = new Scanner(System.in);
        int input = 0;
        while (true) {
            if (sc.hasNextInt()) {
                input = sc.nextInt();
                if (input >= 0) {
                    return input;
                }
                else {
                    System.out.println("Input is not between XXX and XXX. Try again.");
                    sc.nextLine();
                }
            }
            else {
                System.out.println("Input is not an integer. Try again.");
                sc.next();
            }
        }
    }