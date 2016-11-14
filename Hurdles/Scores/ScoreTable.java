/**
 * This interface models the score table in game.
 * @author Nitinkumar Gove
 * @version 1.0
 *
 */
public interface ScoreTable {
	
	public void addEntry();
	public Score fetchEntry(String userid);
	public void updateEntry(String userid, int newscore);
}
