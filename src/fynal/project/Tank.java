package fynal.project;

/**
 *
 * @author Usuario
 */
public class Tank extends Vehicles{
    
    public Tank(int attack, int defending, int aim){
        super(attack,defending,aim);
        super.setAttack(10);
        super.setDefending(6);
        super.setAim(60);
    }
}
