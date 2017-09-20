import java.util.ArrayList;

public class Rocket implements Spaceship {
    private int cost;
    private int selfWeight;
    private int maxWeight;
    private int currentWeight;
    private ArrayList<Item> cargo;



    public Rocket(int cost, int selfWeight,int maxWeight) {
        this.cost = cost;
        this.selfWeight = selfWeight;
        this.maxWeight = maxWeight;
        this.currentWeight = this.selfWeight;
        this.cargo = new ArrayList<>();
    }

    @Override
    public boolean launch() {
        return true;
    }

    @Override
    public boolean land() {
        return true;
    }

    @Override
    public boolean canCarry(Item item) {
        if ((item.getWeight()+this.currentWeight)<this.maxWeight){
            return true;
        }else{
            return false;
        }
    }

    @Override
    public void carry(Item item) {
        this.currentWeight += item.getWeight();
        cargo.add(item);
        }

    public ArrayList<Item> getCargo() {
        return cargo;
    }

    public int getCost() {
        return cost;
    }

    public int getMaxWeight() {
        return maxWeight;
    }
    public double cargoCarried (){
        return (this.currentWeight-this.selfWeight)/(this.maxWeight-this.selfWeight);
    }
}
