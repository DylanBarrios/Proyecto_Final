package javaapplication4;

import java.time.LocalDateTime;

/**
 *
 * @author Dylann
 */
public class ResultsBattle {
   
    private Armas winner;
    private Armas loser;
    
    public ResultsBattle(Armas firstPlayer, Armas secondPlayer) {
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