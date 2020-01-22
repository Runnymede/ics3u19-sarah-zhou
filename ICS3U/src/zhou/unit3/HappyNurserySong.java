package zhou.unit3;

/** HappyNurserySong.java
 * <p> This program prints out lyrics of the song "If you're happy and you know it".
 * <br> Date created: November 25, 2019
 * @author Sarah Zhou
 *
 */

public class HappyNurserySong {

	/**
	 * This is the entry point to the program.
	 * @param args
	 */
	public static void main(String[] args) {

		// String array that stores various actions.
		String[] actions = {"clap your hands" , "stomp your feet" , "make your bed" , "brush your teeth" , "stop crying" , "make a salad"
				, "don't join robotics" , "play some games" , "watch a movie" , "take a nap"};

		// Outputs the lyrics of the song.
		for (int i = 0 ; i < actions.length; i++) {
			System.out.println("If you're happy and you know it " + actions[i] + ".");
			System.out.println("If you're happy and you know it " + actions[i] + ".");
			System.out.println("If you're happy and you know it and you really want to show it.");
			System.out.println("If you're happy and you know it " + actions[i] + ".");
			System.out.println();
		}

	}

}
