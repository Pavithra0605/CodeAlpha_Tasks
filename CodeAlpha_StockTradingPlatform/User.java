import java.util.Map;
import java.util.HashMap;

public class User {

    private String name;
    private double balance;
    private Portfolio portfolio;

    public User(String name, double balance) {
        this.name = name;
        this.balance = balance;
        this.portfolio = new Portfolio();
    }

    public void buyStock(Stock stock, int qty) {

        double cost = stock.getPrice() * qty;

        if (cost <= balance) {

            balance -= cost;
            portfolio.buyStock(stock.getSymbol(), qty);

            System.out.println("Stock Purchased Successfully!");
        } else {
            System.out.println("Insufficient Balance!");
        }
    }

    public void sellStock(Stock stock, int qty) {

        Map<String, Integer> holdings = portfolio.getHoldings();

        if (holdings.containsKey(stock.getSymbol()) &&
                holdings.get(stock.getSymbol()) >= qty) {

            portfolio.sellStock(stock.getSymbol(), qty);

            balance += stock.getPrice() * qty;

            System.out.println("Stock Sold Successfully!");
        } else {
            System.out.println("Not enough shares!");
        }
    }

    public void displayPortfolio(HashMap<String, Stock> market) {

        System.out.println("\n===== PORTFOLIO =====");

        double totalValue = balance;

        for (String symbol : portfolio.getHoldings().keySet()) {

            int qty = portfolio.getHoldings().get(symbol);

            Stock stock = market.get(symbol);

            double value = qty * stock.getPrice();

            totalValue += value;

            System.out.println(symbol +
                    " | Qty: " + qty +
                   " | Value: Rs." + value);
        }

        System.out.println("Cash Balance: Rs." + balance);
        System.out.println("Total Portfolio Value: Rs." + totalValue);
    }
}
