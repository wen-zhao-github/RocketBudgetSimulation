import java.util.ArrayList;
import java.io.File;
import java.util.List;

public class Main{
    public static void main (String args[]){
        Simulation simulation = new Simulation();
        //System.out.println(new File(".").getAbsolutePath());
        String phase1 = "phase-1.txt";

        String phase2 = "phase-2.txt";

        ArrayList<Item> phaseOneItems = simulation.loadItem(phase1);
       // ArrayList<Item> phaseTwoItems = simulation.loadItem(phase2);

        //List<? extends Rocket> uOnesPhase1;

        /*ArrayList<UOne> uOnesPhase1 = simulation.loadUOne(phaseOneItems);
        ArrayList<Rocket> uOnesPhase1Rocket = new ArrayList<>();
        for (UOne uone : uOnesPhase1){
            uOnesPhase1Rocket.add(uone);
        }*/
        ArrayList<UTwo> uTwosPhase1 = simulation.loadUTwo(phaseOneItems);
        ArrayList<Rocket> uOnesPhase1Rocket = new ArrayList<>();
        for (UTwo utwo : uTwosPhase1){
            uOnesPhase1Rocket.add(utwo);
        }

        //ArrayList<UOne> uOnesPhase2 = simulation.loadUOne(phaseTwoItems);

       // ArrayList<UTwo> uTwosPhase1 = simulation.loadUTwo(phaseOneItems);
       // ArrayList<UTwo> uTwosPhase2 = simulation.loadUTwo(phaseTwoItems);
       // int totalCost = simulation.runSimulation(uOnesPhase1Rocket);
        //System.out.println("total cost for U1 in phrase 1 is: " + totalCost);
        int totalCost2 = simulation.runSimulation(uOnesPhase1Rocket);
        System.out.println("total cost for U2 in phrase 1 is: " + totalCost2);

    }
}
