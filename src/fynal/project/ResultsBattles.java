/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fynal.project;

import java.time.LocalDateTime;

/**
 *
 * @author Usuario
 */
public class ResultsBattles{
   
    private Armas winner;
    private Armas loser;
    
    public ResultsBattles(Armas firstPlayer, Armas secondPlayer) {
		if (firstPlayer.getHP() > secondPlayer.getHP()) {
			this.winner = firstPlayer;
			this.loser = secondPlayer;
		} else {
			this.winner = secondPlayer;
			this.loser = firstPlayer;
		}
	}

	public Armas getWinner() {
		return winner;
	}

	public Armas getLoser() {
		return loser;
	}

	public LocalDateTime getDate() {
            LocalDateTime gameDate = LocalDateTime.now();
            return gameDate;
	}
}