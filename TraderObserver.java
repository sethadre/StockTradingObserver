/*  William Murray, Adrian Seth
    November 22nd, 2019
    Purpose: Program is designed to emulate the Observer design with a StockMarket
    Traders are registered as Observers to Stock Subjects and any trades made are notifyied to each observer
*/
public class TraderObserver implements Observer{

    /**
     * TraderObserver 
     * default Constructor
     */
    public TraderObserver() {};

    /**
     * TraderObserver 
     * non-defaul Constructor
     * @param stockTrade
     */
    public TraderObserver(Subject stockTrade){
        stockTrade.addObserver(this);
    }

    /**
     * update 
     * method to register state change
     */
    @Override
    public void update(Object newState) {
        Trade latestTrade = (Trade)newState;
        display(latestTrade);
    }

    /**
     * display 
     * prints the lastestTrade object
     * @param latestTrade - Trade to be completed last
     */
    public void display(Trade latestTrade){
        System.out.println(latestTrade);
    }

    /**
     * toString 
     * returns string of Observer object
     */
    @Override
    public String toString() {
        StringBuilder builder = new StringBuilder();
        builder.append("Trader");
        return builder.toString();
    }
}
