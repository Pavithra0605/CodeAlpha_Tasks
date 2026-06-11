import java.util.HashMap;

public class Portfolio {

    private HashMap<String, Integer> holdings;

    public Portfolio() {
        holdings = new HashMap<>();
    }

    public void buyStock(String symbol, int quantity) {
        holdings.put(symbol, holdings.getOrDefault(symbol, 0) + quantity);
    }

    public void sellStock(String symbol, int quantity) {

        if (holdings.containsKey(symbol)) {

            int current = holdings.get(symbol);

            if (current >= quantity) {

                current -= quantity;

                if (current == 0)
                    holdings.remove(symbol);
                else
                    holdings.put(symbol, current);
            }
        }
    }

    public HashMap<String, Integer> getHoldings() {
        return holdings;
    }
}