//Trevor Hayes
//CSE002
//hw2-Arithmetic

//

public class Arithmetic {
    public static void main(String[] args) {
        //input data
        int numPants = 3; //Number of pairs of pants
        double pantsPrice = 34.98; //Cost per pair of pants
        int numShirts = 2; //Number of sweatshirts
        double shirtPrice = 24.99; //Cost per shirt
        int numBelts = 1; //Number of belts
        double beltCost = 33.99; //cost per box of envelopes
        double paSalesTax = 0.06; //the tax rate
        //output data
        double totalPantsPrice = numPants*pantsPrice; //calculates the total price of pants
        double totalShirtsPrice = numShirts*shirtPrice; //calculates the total price of shirts
        double totalBeltsPrice = numBelts*beltCost; //calculates the total price of belts
        double taxPants = paSalesTax*totalPantsPrice; //calculates tax for pants
        double taxShirts = paSalesTax*totalShirtsPrice; //calculates tax for shirts
        double taxBelts = paSalesTax*totalBeltsPrice; //calculates tax for belts
        double totalPrice = totalPantsPrice+totalShirtsPrice+totalBeltsPrice; //calculates total price of all items
        double totalTax = taxPants+taxShirts+taxBelts; //calculates total amount of tax
        double totalCost = totalTax+totalPrice; //calcualtes total cost
        //displays prices and taxes for individual categories
        System.out.printf("Total price of pants: $%.2f\n",totalPantsPrice);
        System.out.printf("Tax for pants: $%.2f\n\n",taxPants);
        System.out.printf("Total price of shirts: $%.2f\n",totalShirtsPrice);
        System.out.printf("Tax for shirts: $%.2f\n\n",taxShirts);
        System.out.printf("Total price of belts: $%.2f\n",totalBeltsPrice);
        System.out.printf("Tax for belts: $%.2f\n\n",taxBelts);
        //displays final price, tax, and total cost
        System.out.printf("Total cost of items, pre-tax: $%.2f\n",totalPrice);
        System.out.printf("Total sales tax: $%.2f\n",totalTax);
        System.out.printf("Total cost of items, tax included: $%.2f\n",totalCost);
    }
}