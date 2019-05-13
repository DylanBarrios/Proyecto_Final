/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fynal.project;

/**
 *
 * @author Usuario
 */
class Armas {
    /**
     * Metodo para asignar armas a los vehiculos mientras esten en batallas
     */
    String name;
    int ammunition;
    int HP;
/**
 * getName
 * @return String 
 */
    public String getName() {
        return name;
    }
/**
 * setName
 * @param name 
 */
    public void setName(String name) {
        this.name = name;
    }
/**
 * getAmmunition
 * @return int
 */
    public int getAmmunition() {
        return ammunition;
    }

    /**
     * setAmunition
     * @param ammunition 
     */
    public void setAmmunition(int ammunition) {
        this.ammunition = ammunition;
    }

    public int getHP() {
        return HP;
    }

    public void setHP(int HP) {
        this.HP = HP;
    }
    /**
     * Armas
     * @param nombre
     * @param ammunition 
     */
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
    /**
     * substarctAmmunition
     * @param shot 
     */
    public void substractAmmunition(int shot){
        this.ammunition -=shot;
    }
    /**
     * addAmunition
     * @param bullets 
     */
    public void addAmmunition(int bullets){
        this.ammunition -= bullets;
    }
}
