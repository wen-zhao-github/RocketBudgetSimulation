import java.util.ArrayList;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.util.ListIterator;

public class Simulation {
    public ArrayList<Item> loadItem (String filepath){
        File file = new File(filepath);
        ArrayList<Item> items = new ArrayList<>();
        try{
            Scanner scanner = new Scanner (file);
            while(scanner.hasNextLine()){
                String [] temp = scanner.nextLine().split("=");
                items.add(new Item(temp[0].trim(),Integer.valueOf(temp[1])/1000)); //change from kg to ton
            }

        }catch (FileNotFoundException e){
            System.out.println("Can not find the file!");
        }
        for (Item item : items){
            System.out.println(item.getItemName()+" = "+ item.getWeight());
        }
        return items;

    }
    public ArrayList<UOne> loadUOne (ArrayList<Item> items){
        ArrayList<UOne> uOnes = new ArrayList<>();
        ListIterator litr = items.listIterator();
        UOne currentUOne = new UOne();
        uOnes.add(currentUOne);
        while (litr.hasNext()){
            Item current = (Item)litr.next();
            if (currentUOne.canCarry(current)){
                currentUOne.carry(current);
            }else {
                currentUOne = new UOne();
                uOnes.add(currentUOne);
                currentUOne.carry(current);
            }

        }
        for (UOne temp: uOnes){
            System.out.println("rocket current weight: ");
        }

        return uOnes;
    }
    public ArrayList<UTwo> loadUTwo (ArrayList<Item> items){
        ArrayList<UTwo> uTwos = new ArrayList<>();
        ListIterator litr = items.listIterator();
        UTwo currentUTwo = new UTwo();
        uTwos.add(currentUTwo);
        while (litr.hasNext()){
            Item current = (Item)litr.next();
            if (currentUTwo.canCarry(current)){
                currentUTwo.carry(current);
            }else {
                currentUTwo = new UTwo();
                uTwos.add(currentUTwo);
                currentUTwo.carry(current);
            }

        }
        for (UTwo temp: uTwos){
            System.out.println("rocket current weight: ");
        }
        return uTwos;
    }
    public int runSimulation (ArrayList<Rocket> rockets){
        int sum = 0;
        for (Rocket rocket: rockets){
            sum += rocket.getCost();
            while (!(rocket.launch() && rocket.land())){
                sum += rocket.getCost();
            }
        }

        return sum;
    }
}
