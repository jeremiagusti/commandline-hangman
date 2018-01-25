package jeremiagusti;

public class Player {
	private int life; 
	
	public Player( int life) {
		this.life = life; 
	}
	
	public int getLife() {
		return life;
	}
	
	public void decreaseLife() {
		life--;
	}
}
