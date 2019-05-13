package fynal.project;

/**
 *
 * @author Usuario
 */
public class Plane extends Vehicles{
    
    private int speedPlane;

    /**
     * Clase para configurar mis aviones y asignar valores para que me sirvan 
     * durante la batalla
     * @param attack
     * @param defending
     * @param aim
     * @param destroyed
     * @param destroyer 
     */
    public Plane(int attack, int defending, int aim,int destroyed,int destroyer){
        super(attack,defending,aim,destroyed,destroyer);
        super.setAttack(7);
        super.setDefending(3);
        super.setAim(70);
        super.setDestroyed(0);
        super.setDestroyer(0); 
        speedPlane = 1;
    }

    public int getSpeedPlane() {
        return speedPlane;
    }

    public void setSpeedPlane(int speedPlane) {
        this.speedPlane = speedPlane;
    }
    
}
