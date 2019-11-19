
public class TraderObserver implements Observer{
    private Subject stockTrade;

    public TraderObserver(Subject stockTrade){
        this.stockTrade = stockTrade;
        stockTrade.addObserver(this);
    }

    public void update(Object newState){
        Trade latestTrade = (Trade)newState;
        display(latestTrade);
    }

    public void display(Trade latestTrade){
        System.out.println("The latest trade is "+latestTrade);
    }

}
