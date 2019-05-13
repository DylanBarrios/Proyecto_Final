package fynal.project;

/**
 *
 * @author Usuario
 */
public class Vehicles extends TypeField{
    private int attack;
    private int defending;
    private int aim;
    private int destroyed;
    private int destroyer;
    private int HP;
    private int PP;
    private int level;
    private int experience;
    private Armas arma;

   
    public Vehicles(int attack, int defending, int aim, int destroyed, int destroyer){
        this.attack = attack;
        this.defending = defending;
        this.aim = aim;
        this.destroyed = destroyed;
        this.destroyer = destroyer;
        this.HP = 50;
        this.PP = 5;
        this.level = 1;
        this.experience = 0;
    }
       public int getHP() {
        return HP;
    }

    public void setHP(int HP) {
        this.HP = HP;
    }

    public int getPP() {
        return PP;
    }

    public void setPP(int PP) {
        this.PP = PP;
    }

    public int getLevel() {
        return level;
    }

    public void setLevel(int level) {
        this.level = level;
    }

    public int getExperience() {
        return experience;
    }

    public void setExperience(int experience) {
        this.experience = experience;
    }

    public Armas getArma() {
        return arma;
    }

     public int getAttack() {
        return attack;
    }

    public void setAttack(int attack) {
        this.attack = attack;
    }

    public int getDefending() {
        return defending;
    }

    public void setDefending(int defending) {
        this.defending = defending;
    }

    public int getAim() {
        return aim;
    }

    public void setAim(int aim) {
        this.aim = aim;
    }
    
    public void setArma(Armas arma) {
        this.arma = arma;
    }

    public int getDestroyed() {
        return destroyed;
    }

    public void setDestroyed(int destroyed) {
        this.destroyed = destroyed;
    }

    public int getDestroyer() {
        return destroyer;
    }

    public void setDestroyer(int destroyer) {
        this.destroyer = destroyer;
    }

    
    public void addHP(int points) {
		this.HP += points;
	}
	
	public void substractHP(int points) {
		if (this.HP - points < 0) {
			this.HP = 0;
		} else {
			this.HP -= points;
		}
	}
    
}
