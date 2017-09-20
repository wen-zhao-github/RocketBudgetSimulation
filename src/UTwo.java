
public class UTwo extends Rocket{
    public static final double UTWO_LAUNCH_RATE = 0.04;
    public static final double UTWO_LANDING_RATE  = 0.08;

    public UTwo(){
        super(120, 18, 29);
    }
    public boolean launch(){
        double chance = UTWO_LAUNCH_RATE * this.cargoCarried();
        return RandomWithPossiblity.getRandomBoolean(chance);
    }

    @Override
    public boolean land() {
        double chance = UTWO_LANDING_RATE*this.cargoCarried();
        return RandomWithPossiblity.getRandomBoolean(chance);
    }

}
