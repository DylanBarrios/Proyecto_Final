package fynal.project;

import java.time.LocalDateTime;

/**
 *
 * @author Usuario
 */
public class ResultsBattles{

    //Crear instancias para saber quien gano y quien perdio
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