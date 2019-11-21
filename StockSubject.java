/*  William Murray, Adrian Seth
    November 22nd, 2019
    Purpose: Program is designed to emulate the Observer design with a StockMarket
    Traders are registered as Observers to Stock Subjects and any trades made are notifyied to each observer
*/
import java.util.ArrayList;
public class StockSubject implements Subject{
    private ArrayList<Observer> observers;
    private Trade latestTrade;

    /**
     * StockSubject 
     * default Constructor
     */
    public StockSubject(){
        observers = new ArrayList<Observer>();
    }

    /**
     * addObserver 
     * adds the argument Observer to the list of Observers
     * @param Observer - Observer to be added
     */
    @Override
    public void addObserver(Observer o) {
        observers.add(o);
    }

    /**
     * removeObserver 
     * removes the observer from the list of observers associated with this Subject
     * @param Observer - observer to be removed
     */
    @Override
    public void removeObserver(Observer o) {
        observers.remove(o);
    }

    /**
     * notifyObservers 
     * updates each observer of the newest trade to be made to this Stock
     */
    @Override
    public void notifyObservers() {
        for (int i = 0; i < observers.size(); i++) {
            Observer obs = observers.get(i);
            obs.update(latestTrade);
        }
    }

    /**
     * submitTrade 
     * submits argument trade to stock
     * @param latestTrade - trade to be registered to each observer
     */
    public void submitTrade(Trade latestTrade){
        this.latestTrade = latestTrade;
        System.out.print(this.toString());
        notifyObservers();
    }

    /**
     * toString 
     * builds string of the amount of observers to this stock
     * @return - string of the above
     */
    @Override
    public String toString() {
        StringBuilder builder = new StringBuilder();
        builder.append("Current number of Observers: "+observers.size()+"\n");
        builder.append("Notify all observers:\n");
        return builder.toString();
    }

}
