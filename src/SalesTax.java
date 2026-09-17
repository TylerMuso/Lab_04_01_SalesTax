public class SalesTax {

    static void main() {

        // Pretend that we got this from the user as input
        double purchasePrice = 13.50;
        final double SALES_TAX_RATE = .05;
        double salesTax = 0;
        double total = 0;

        salesTax = purchasePrice * SALES_TAX_RATE;
        total = salesTax + purchasePrice;

        // Java 1.8 System.out.println
        // Modern Java 24+ IO.println

        IO.println("The sales tax on " + purchasePrice + " is " + salesTax);
        IO.println("The total cost is " + total);
    }
}
