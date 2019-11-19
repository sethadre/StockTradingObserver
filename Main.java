public class Main {
    public static void main(String[] args) {
        StockSubject MSFT = new StockSubject();
        StockSubject NFLX = new StockSubject();
        StockSubject AAPL = new StockSubject();

        TraderObserver Michael = new TraderObserver(MSFT);
        TraderObserver Jim = new TraderObserver(AAPL);
        TraderObserver Pam = new TraderObserver(NFLX);
        TraderObserver Oscar = new TraderObserver(MSFT);
        //String stockTrader,String transaction, double amount, String Stock
        MSFT.submitTrade(new Trade("Michael","buy",160.00,"MSFT"));
        MSFT.submitTrade(new Trade("Oscar","buy",149.00,"MSFT"));
        MSFT.submitTrade(new Trade("Michael","sell",165.00,"MSFT"));
        MSFT.submitTrade(new Trade("Oscar","sell",165.00,"MSFT"));
        AAPL.submitTrade(new Trade("Jim","buy",89.50,"AAPL"));
        AAPL.submitTrade(new Trade("Jim","sell",45.00,"AAPL"));
        NFLX.submitTrade(new Trade("Pam","buy",27.00,"NFLX"));
        NFLX.submitTrade(new Trade("Pam","sell",210.00,"NFLX"));

        MSFT.removeObserver(Michael);
        AAPL.removeObserver(Jim);


    }
}
