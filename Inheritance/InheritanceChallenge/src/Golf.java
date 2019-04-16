public class Golf extends Car {

    private int roadServiceMonths;

    public Golf(int roadServiceMonths) {
        super("Golf", "4WD", 5, 5, 6, true);
        this.roadServiceMonths = roadServiceMonths;
    }

    public void accelerate(int rate) {

        int newVelocity = getCurrentVelocity() + rate;
        if (newVelocity == 0) {
            stop();
            changetGear(1);
        } else if (newVelocity > 0 && newVelocity <= 10) {
            changetGear(1);
        } else if (newVelocity > 10 && newVelocity <= 20)
            changetGear(2);
        else if (newVelocity > 20 && newVelocity <= 20)
            changetGear(3);
        else changetGear(4);

        if (newVelocity > 0)
            changeVelocity(newVelocity, getCurrentDirection());
    }
}
