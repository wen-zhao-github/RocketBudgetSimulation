
public class UOne extends Rocket{
    public static final double UONE_LAUNCH_RATE = 0.05;
    public static final double UONE_LANDING_RATE  = 0.01;

    public UOne(){
        super(100, 10, 18);
    }


    public boolean launch(){
        double chance = UONE_LAUNCH_RATE * this.cargoCarried();
        return RandomWithPossiblity.getRandomBoolean(chance);
    }

    @Override
    public boolean land() {
        double chance = UONE_LANDING_RATE*this.cargoCarried();
        return RandomWithPossiblity.getRandomBoolean(chance);
    }
}
