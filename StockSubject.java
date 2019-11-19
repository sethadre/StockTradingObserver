import java.util.ArrayList;
public class StockSubject implements Subject{
    private ArrayList<Observer> observers;
    private Trade latestTrade;

    public StockSubject(){
        observers = new ArrayList<Observer>();
    }

    public void addObserver(Observer o){
        observers.add(o);
    }

    public void removeObserver(Observer o){
        observers.remove(o);
    }

    public void notifyObservers(){
        for (int i = 0; i < observers.size(); i++) {
            Observer obs = observers.get(i);
            obs.update(latestTrade);
        }
    }

    public void submitTrade(Trade latestTrade){
        this.latestTrade = latestTrade;
        notifyObservers();
    }


}
