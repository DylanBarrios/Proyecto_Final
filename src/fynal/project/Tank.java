package fynal.project;

/**
 *
 * @author Usuario
 */
public class Tank extends Vehicles{
    
    public Tank(int attack, int defending, int aim,int destroyed,int destroyer){
        super(attack,defending,aim,destroyed,destroyer);
        super.setAttack(10);
        super.setDefending(6);
        super.setAim(60);
        super.setDestroyed(0);
        super.setDestroyer(0); 
    }
}
