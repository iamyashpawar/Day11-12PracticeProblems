import java.util.Scanner;

public class StockReport {
    public StockReport(String name, int numShares, double sharePrice) {
    }

    public static void main(String[] args) {


        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the number of stocks: ");
        int numStocks = scanner.nextInt();
        scanner.nextLine();

        Stock[] stocks = new Stock[numStocks];

        for (int i = 0; i < numStocks; i++) {
            System.out.println("Enter details of stock " + (i + 1) + ":");
            System.out.print("Name: ");
            String name = scanner.nextLine();
            System.out.print("Number of shares: ");
            int numShares = scanner.nextInt();
            System.out.print("Share price: ");
            double sharePrice = scanner.nextDouble();
            scanner.nextLine();

            stocks[i] = new Stock(name, numShares, (int) sharePrice);
        }
        System.out.println("Stock Report:");
        System.out.println("------------------------------------------------");
        System.out.println("Stock Name" + "Number of Shares"+ "Share Price"+ "Total Value");

    }
}
