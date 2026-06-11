import java.util.HashMap;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        HashMap<String, Stock> market = new HashMap<>();

        market.put("TCS", new Stock("TCS", "Tata Consultancy", 4200));
        market.put("INFY", new Stock("INFY", "Infosys", 1600));
        market.put("RELI", new Stock("RELI", "Reliance", 2900));

        User user = new User("Investor", 100000);

        while (true) {

            System.out.println("\n===== STOCK TRADING PLATFORM =====");
            System.out.println("1. View Market");
            System.out.println("2. Buy Stock");
            System.out.println("3. Sell Stock");
            System.out.println("4. Portfolio");
            System.out.println("5. Exit");

            System.out.print("Enter Choice: ");
            int choice = sc.nextInt();

            switch (choice) {

                case 1:
                    System.out.println("\nMarket Data");

                    for (Stock stock : market.values()) {
                        System.out.println(
                                stock.getSymbol() + " - " +
                                stock.getName() +  " - Rs."  +
                                stock.getPrice());
                    }
                    break;

                case 2:
                    System.out.print("Stock Symbol: ");
                    String buySymbol = sc.next();

                    System.out.print("Quantity: ");
                    int buyQty = sc.nextInt();

                    if (market.containsKey(buySymbol))
                        user.buyStock(market.get(buySymbol), buyQty);
                    else
                        System.out.println("Invalid Stock!");

                    break;

                case 3:
                    System.out.print("Stock Symbol: ");
                    String sellSymbol = sc.next();

                    System.out.print("Quantity: ");
                    int sellQty = sc.nextInt();

                    if (market.containsKey(sellSymbol))
                        user.sellStock(market.get(sellSymbol), sellQty);
                    else
                        System.out.println("Invalid Stock!");

                    break;

                case 4:
                    user.displayPortfolio(market);
                    break;

                case 5:
                    System.out.println("Thank You!");
                    System.exit(0);

                default:
                    System.out.println("Invalid Choice!");
            }
        }
    }
}