public class Trade {
    private String stockTrader;
    private String Stock;
    private double amount;
    private String transaction;

    public Trade(String stockTrader,String transaction, double amount, String Stock){
        this.stockTrader = stockTrader;
        this.Stock = Stock;
        this.amount = amount;
        this.transaction = transaction;
    }

    public String toString(){
        return "The latest trade is Trader: "+stockTrader+" "+transaction+" $"+amount+": "+Stock;
    }
}
