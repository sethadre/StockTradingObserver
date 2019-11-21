public class StockMarket {
    public static void main(String[] args) {
        //Stocks available in market
        StockSubject MSFT = new StockSubject();
        StockSubject NFLX = new StockSubject();
        StockSubject AAPL = new StockSubject();
        StockSubject DE   = new StockSubject();  

        //traders in market
        TraderObserver Micheal = new TraderObserver();
        TraderObserver Jim = new TraderObserver();
        TraderObserver Dwight = new TraderObserver();
        TraderObserver Pam = new TraderObserver();
        TraderObserver Oscar = new TraderObserver();

        //add respcetive traders to markets
        MSFT.addObserver(Micheal);
        AAPL.addObserver(Jim);
        AAPL.addObserver(Oscar);
        NFLX.addObserver(Pam);
        DE.addObserver(Dwight);
        //Begin first round trading
        System.out.println("\nFirst Round trading\n");
        MSFT.submitTrade(new Trade("Michael","buy",160.00,"MSFT"));
        AAPL.submitTrade(new Trade("Oscar","buy",350.00,"AAPL"));
        AAPL.submitTrade(new Trade("Jim","buy",250.00,"AAPL"));
        NFLX.submitTrade(new Trade("Pam","buy",150.00,"NFLX"));
        DE.submitTrade(new Trade("Dwight","buy",700.00,"DE"));;
        //Second round trading
        System.out.println("\nSecond Round trading\n");
        DE.addObserver(Jim);
        MSFT.submitTrade(new Trade("Micheal","buy",350.00,"MSFT"));
        AAPL.submitTrade(new Trade("Oscar","sell",150.00,"AAPL"));
        DE.submitTrade(new Trade("Jim","buy",900.00,"DE"));
        DE.submitTrade(new Trade("Dwight","buy",1200.00,"DE"));
        NFLX.submitTrade(new Trade("Pam","buy",100.00,"NFLX"));
        //third round trading
        System.out.println("\nThird Round trading\n");
        MSFT.addObserver(Oscar);
        MSFT.submitTrade(new Trade("Oscar","buy",500.00,"MSFT"));
        MSFT.submitTrade(new Trade("Micheal","buy",1500.00,"MSFT"));
        DE.submitTrade(new Trade("Jim","buy",2100.00,"DE"));
        DE.submitTrade(new Trade("Dwight","buy",5000.00,"DE"));
        NFLX.submitTrade(new Trade("Pam","sell",250.00,"NFLX"));
        //final round trading
        System.out.println("\nFinal Round trading\n");
        MSFT.submitTrade(new Trade("Micheal","buy",2000.00,"MSFT"));
        MSFT.submitTrade(new Trade("Oscar","sell",750.00,"MSFT"));
        MSFT.removeObserver(Oscar);
        AAPL.submitTrade(new Trade("Oscar","buy",750.00,"AAPL"));
        DE.submitTrade(new Trade("Dwight","buy",10000.00,"DE"));
        DE.submitTrade(new Trade("Jim","sell",3000.00,"DE"));
        DE.removeObserver(Jim);
        AAPL.submitTrade(new Trade("Jim","buy",250.00,"AAPL"));
        NFLX.submitTrade(new Trade("Pam","buy",1000.00,"NFLX"));


    }
}
