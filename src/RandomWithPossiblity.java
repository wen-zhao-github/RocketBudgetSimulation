import java.util.Random;
public class RandomWithPossiblity {
    private static Random random = new Random();

    public static boolean getRandomBoolean(double p){

        return !(random.nextFloat() < p);
    }
}
