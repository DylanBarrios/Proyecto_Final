package fynal.project;

/**
 *
 * @author Usuario
 */
public class Vehicles extends TypeField{
    /**
     *Declaracion de varibles globales 
     */
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

   /**
    * Vehicles
    * @param attack
    * @param defending
    * @param aim
    * @param destroyed
    * @param destroyer 
    */
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
    
    /**
     * getHP
     * @return int 
     */
       public int getHP() {
        return HP;
    }

       /**
        * setHP
        * @param HP 
        */
    public void setHP(int HP) {
        this.HP = HP;
    }

    /**
     * getPP
     * @return int
     */
    public int getPP() {
        return PP;
    }

    /**
     * setPP
     * @param PP 
     */
    public void setPP(int PP) {
        this.PP = PP;
    }

    /**
     * getLevel
     * @return 
     */
    public int getLevel() {
        return level;
    }

    /**
     * setLevel
     * @param level 
     */
    public void setLevel(int level) {
        this.level = level;
    }

    public int getExperience() {
        return experience;
    }

    /**
     * setExperiencie
     * @param experience 
     */
    public void setExperience(int experience) {
        this.experience = experience;
    }

    /**
     * getArma
     * @return Armas 
     */
    public Armas getArma() {
        return arma;
    }

    /**
     * getAttack
     * @return 
     */
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

    /**
     * getAim
     * @return  
     */
    public int getAim() {
        return aim;
    }

    /**
     * setAim
     * @param aim 
     */
    public void setAim(int aim) {
        this.aim = aim;
    }
    
    public void setArma(Armas arma) {
        this.arma = arma;
    }

    /**
     * getDestroyed
     * @return int
     */
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

    
    /**
     * Metodos para sumar y restar vida al atacar 
     * @param points 
     */
    public void addHP(int points) {
		this.HP += points;
	}

    /**
     * substactHP
     * @param points 
     */
    public void substractHP(int points) {
		if (this.HP - points < 0) {
			this.HP = 0;
		} else {
			this.HP -= points;
		}
	}
    
}
