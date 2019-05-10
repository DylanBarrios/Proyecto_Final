/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fynal.project;

import java.io.Serializable;
import java.util.ArrayList;

/**
 *
 * @author Usuario
 */
public class Players implements Serializable{
    private String First_Player;
    private String Second_Player;
    private ArrayList<String> player =new ArrayList<>();
    
    public Players(String First_Player, String Second_Player){
        this.First_Player = First_Player;
        this.Second_Player = Second_Player;
    }

    public String getFirst_Player() {
        return First_Player;
    }

    public void setFirst_Player(String First_Player) {
        this.First_Player = First_Player;
    }

    public String getSecond_Player() {
        return Second_Player;
    }

    public void setSecond_Player(String Second_Player) {
        this.Second_Player = Second_Player;
    }

    
    public void addPlayer(String player){
        this.player.add(player);
    }
    
    public ArrayList<String> addArray(){
        return player;
    }
}
