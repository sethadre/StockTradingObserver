/*  William Murray, Adrian Seth
    November 22nd, 2019
    Purpose: Program is designed to emulate the Observer design with a StockMarket
    Traders are registered as Observers to Stock Subjects and any trades made are notifyied to each observer
*/
public interface Subject {

    /* allows an observer to register with the subject */
    public void addObserver( Observer o );

    /* removes an observer */
    public void removeObserver( Observer o );

    /* notifes all registered observers when its state changes */
    public void notifyObservers();
}
