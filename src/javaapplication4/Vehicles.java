/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication4;

/**
 *
 * @author Usuario
 */
public class Vehicles {
    private int HP;
    private int PP;
    private int level;
    private int experience;
    private Armas arma;
    
    public Vehicles(){
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

    public void setArma(Armas arma) {
        this.arma = arma;
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
