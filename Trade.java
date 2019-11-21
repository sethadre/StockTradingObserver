/*  William Murray, Adrian Seth
    November 22nd, 2019
    Purpose: Program is designed to emulate the Observer design with a StockMarket
    Traders are registered as Observers to Stock Subjects and any trades made are notifyied to each observer
*/
public class Trade {
    private String stockTrader;
    private String Stock;
    private double amount;
    private String transaction;

    /**
     * Trade 
     * non-default Constructor
     * @param stockTrader - name of trader
     * @param transaction - transcation type (buy or sell)
     * @param amount - cost of stock bought
     * @param Stock - which stock bought in ticket format
     */
    public Trade(String stockTrader,String transaction, double amount, String Stock){
        this.stockTrader = stockTrader;
        this.Stock = Stock;
        this.amount = amount;
        this.transaction = transaction;
    }

    /**
     * toString 
     * builds and returns string of trade in format of the latest trade made
     */
    public String toString(){
        return "The latest trade is Trader: "+stockTrader+" "+transaction+" $"+amount+": "+Stock;
    }
}
