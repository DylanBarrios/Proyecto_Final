package javaapplication4;

/**
 *
 * @author Dylan
 */
class Armas {
 
    String name;
    int ammunition;
    int HP;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAmmunition() {
        return ammunition;
    }

    public void setAmmunition(int ammunition) {
        this.ammunition = ammunition;
    }

    public int getHP() {
        return HP;
    }

    public void setHP(int HP) {
        this.HP = HP;
    }
    
    public Armas(String nombre,int ammunition){
        this.name = nombre;
        this.ammunition = ammunition;
        this.HP =0;
    }

    public int getMuniciones() {
        return ammunition;
    }

    public void setMuniciones(int municiones) {
        this.ammunition = ammunition;
    }
    
    public void substractAmmunition(int shot){
        this.ammunition -=shot;
    }
    
    public void addAmmunition(int bullets){
        this.ammunition -= bullets;
    }
}
