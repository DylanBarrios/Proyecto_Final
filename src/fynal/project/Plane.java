package fynal.project;

/**
 *
 * @author Usuario
 */
public class Plane extends Vehicles{
    
    private int speedPlane;
    
    public Plane(int attack, int defending, int aim){
        super(attack,defending,aim);
        super.setAttack(7);
        super.setDefending(3);
        super.setAim(70);
        speedPlane = 1;
    }

    public int getSpeedPlane() {
        return speedPlane;
    }

    public void setSpeedPlane(int speedPlane) {
        this.speedPlane = speedPlane;
    }
    
}
