package fynal.project;

/**
 *
 * @author Usuario
 */
public class Tank extends Vehicles{

    /**
     * Agregar carcateristicas de un tanque que me serviran para instanciar 
     * y reducir mientras es la batalla
     * @param attack
     * @param defending
     * @param aim
     * @param destroyed
     * @param destroyer 
     */
    public Tank(int attack, int defending, int aim,int destroyed,int destroyer){
        super(attack,defending,aim,destroyed,destroyer);
        super.setAttack(10);
        super.setDefending(6);
        super.setAim(60);
        super.setDestroyed(0);
        super.setDestroyer(0); 
    }
}
