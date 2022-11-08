import java.util.Scanner;

public class Answer1 {

    public static void main(String[] args) {

        char userInput;
        int invoiceCount = 0;
        double avgDiscount = 0.0, avgInvoice = 0.0, invoiceTotal = 0.0, discountPercent = 0.0, discountAmount = 0.0;
        float amount;

        Scanner scanner = new Scanner(System.in);
        System.out.println("Welcome to the Invoice Total Calculator");

        do {

            System.out.print("Enter subtotal: ");
            String stringAmount = scanner.next();
            amount = Float.parseFloat(stringAmount);

            System.out.print("Discount percent: ");
            discountPercent = scanner.nextDouble();

            discountAmount = amount * discountPercent;
            avgDiscount += discountAmount;
            invoiceTotal = amount - discountAmount;
            avgInvoice += invoiceTotal;

            System.out.println("Discount amount: " + discountAmount);
            System.out.println("Invoice total: " + (invoiceTotal));

            System.out.print("Continue? (y/n) : ");
            userInput = scanner.next().charAt(0);

            invoiceCount++;

        } while (userInput != 'n');

        System.out.println(String.format("Number of invoices: %s", invoiceCount));
        System.out.println(String.format("Average invoice: %s", avgInvoice / invoiceCount));
        System.out.println(String.format("Average Discount: %s", avgDiscount / invoiceCount));

    }

}
