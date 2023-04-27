
/**
 * See instructions on Canvas for how to use the SoundPlayer.java.
 */
public class ExampleUsingSoundPlayer {
	
	
	
	public static void main(String[] args) {
		
		
		//Defining the names of the sound effects files as constants to make
		//things a bit easier.
		//NOTE: The play method requires JUST the name of the sound fx file,
		//  NOT the name and extension.
		String GAME_OVER_SFX = "game_over";
		String COIN_SFX = "coin2";
		
		
		//Play the first sound effect:
		SoundPlayer.play(GAME_OVER_SFX);
		SoundPlayer.play(COIN_SFX);
		
	}
}