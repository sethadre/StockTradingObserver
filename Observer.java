/*  William Murray, Adrian Seth
    November 22nd, 2019
    Purpose: Program is designed to emulate the Observer design with a StockMarket
    Traders are registered as Observers to Stock Subjects and any trades made are notifyied to each observer
*/
public interface Observer {
    /**
     * update 
     * This method is called when the state of the subject
     * changes.
     * @param newState - the new state of the subject
     */
    public void update(Object newState);
}
