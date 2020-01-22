package zhou.culminating;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;

import hsafx.Console;
import hsafx.ConsoleView;
import javafx.scene.image.Image;
import javafx.scene.paint.Color;

/** Escape_Game.java
 * <p> This is the final project for Semester 1, ICS3U, 2019-2020 taught by C. Kemp.
 * <p> This program runs a puzzle game in which the user must solve challenges in order to escape.
 * <b> Date created: January 13, 2019
 * @author Sarah Zhou
 */

public class Escape_Game extends ConsoleView{

	Image[] backgrounds = new Image[6];
	Image[] items = new Image[2];
	boolean[] challenges = new boolean[3];
	Console c;

	// *****************************************
	public static void main(String[] args) {
		launch(args);
	}

	/*
	 * This method runs the game.
	 */
	@Override
	public void run() {

		int screen = 1;
		int box = 1;

		c = new Console (800, 600, 20,"Game", this);

		try {
			loadImages();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}

		c.autoRefreshOff();

		/*
		 * The game will constantly loop the following:
		 * Checking for screens and boxes to click-able areas.
		 * Check if the room is complete.
		 */
		while(true) {

			c.clear();
			drawScreen(screen, box);

			if(c.getMouseButton(0)) {

				// The safe clicking areas
				if (screen == 1 && box == 2) {
					if ((c.getMouseX() > 200 && c.getMouseX() < 600) && (c.getMouseY() > 100 && c.getMouseY() < 350)) {
						drawScreen(screen, ++box);
					}
				}
				else if (screen == 5 && (box == 3 || box == 5 || box == 10)) {
					if ((c.getMouseX() > 200 && c.getMouseX() < 600) && (c.getMouseY() > 100 && c.getMouseY() < 350)) {
						drawScreen(screen, ++box);
					}
				}
				// For the walls that can be inspected. If they are clicked, they will go into a challenge (screen).
				else if (screen == 1 && box == 8 ) {

					if (checkRoom()) {
						screen = 5;
						box = 1;
						drawScreen(screen, box);
					}

					// Left wall clicking area
					if ((c.getMouseX() > 25 && c.getMouseX() < 160) && (c.getMouseY() > 190 && c.getMouseY() < 380)) {

						// If the challenge is already complete, then box == 0 is shown, if not, it displays the beginning of the challenge.
						if (challenges[0]) {
							screen = 2;
							box = 0;
							drawScreen(screen, box);
						}
						else {
							screen = 2;
							box = 1;
							drawScreen(screen, box);
						}

					}

					// Center wall clicking area
					if ((c.getMouseX() > 165 && c.getMouseX() < 605) && (c.getMouseY() > 190 && c.getMouseY() < 380)) {

						// If the challenge is already complete, then box == 0 is shown, if not, it displays the beginning of the challenge.
						if (challenges[1]) {
							screen = 3;
							box = 0;
							drawScreen(screen, box);
						}
						else {
							screen = 3;
							box = 1;
							drawScreen(screen, box);
						}
					}

					//Right wall clicking area
					if ((c.getMouseX() > 625 && c.getMouseX() < 775) && (c.getMouseY() > 190 && c.getMouseY() < 380)) {

						// If the challenge is already complete, then box == 0 is shown, if not, it displays the beginning of the challenge.
						if (challenges[2]) {
							screen = 4;
							box = 0;
							drawScreen(screen, box);
						}
						else {
							screen = 4;
							box = 1;
							drawScreen(screen, box);
						}
					}
				}

				// Challenge 1
				else if (screen == 2 && box == 2) {
					if ((c.getMouseX() > 55 && c.getMouseX() < 775) && (c.getMouseY() > 430 && c.getMouseY() < 450)) {
						challenges[0] = true;

						screen =2;
						box = -1;
					}
					if ((c.getMouseX() > 55 && c.getMouseX() < 775) && (c.getMouseY() > 430 && c.getMouseY() < 590)){
						screen = 2;
						box = -1;
						drawScreen(screen, box);
					}
				}
				// Challenge 1
				else if (challenges[0] == false && screen == 2 && box == -1) {
					screen = 2;
					box = -2;
					drawScreen(screen, box);
				}
				// challenge 1
				else if ((screen == 2 && box == 0) || (screen == 2 && box == -2)) {
					if (c.getMouseX() > 50 && c.getMouseX()  < 550 && c.getMouseY()  > 400 && c.getMouseY()  < 750) {
						screen = 1;
						box = 8;
						drawScreen(screen, box);
					}
				}

				//Challenge 2
				else if (screen == 3 && box == 3) {
					if ((c.getMouseX() > 55 && c.getMouseX() < 775) && (c.getMouseY() > 550 && c.getMouseY() < 580)) {
						challenges[1] = true;

						screen = 3;
						box = -1;

					}
					if ((c.getMouseX() > 55 && c.getMouseX() < 775) && ((c.getMouseY() > 400 && c.getMouseY() < 540))){
						screen = 3;
						box = -1;
						drawScreen(screen, box);
					}
				}
				// Challenge 2
				else if (challenges[1] == false && screen == 3 && box == -1) {
					screen = 3;
					box = -2;
					drawScreen(screen, box);
				}
				// challenge 2
				else if ((screen == 3 && box == 0) || (screen == 3 && box == -2)) {
					if (c.getMouseX() > 50 && c.getMouseX()  < 550 && c.getMouseY()  > 400 && c.getMouseY()  < 750) {
						screen = 1;
						box = 8;
						drawScreen(screen, box);
					}
				}

				// Challenge 3
				else if (screen == 4 && box == 2) {
					if ((c.getMouseX() > 55 && c.getMouseX() < 775) && (c.getMouseY() > 530 && c.getMouseY() < 555)) {
						challenges[2] = true;
						screen = 4;
						box = -1;
					}
					else {
						screen = 4;
						box = -1;
						drawScreen(screen, box);
					}
				}

				else if (challenges[2] == false && screen == 4 && box == -1) {
					screen = 4;
					box = -2;
					drawScreen(screen, box);
				}
				// Challenge 3
				else if ((screen == 4 && box == 0) || (screen == 4 && box == -2)) {
					if (c.getMouseX() > 50 && c.getMouseX()  < 550 && c.getMouseY()  > 400 && c.getMouseY()  < 750) {
						screen = 1;
						box = 8;
						drawScreen(screen, box);
					}
				}

				// When the End box is clicked, nothing happens.
				else if (screen == 5 && box == 21) {
					screen = 5;
					box = 21;
					drawScreen(screen, box);
				}
				// The textbox that is usually at the bottom of the screen.
				else if (c.getMouseX() > 50 && c.getMouseX()  < 550 && c.getMouseY()  > 400 && c.getMouseY()  < 750) {
					drawScreen(screen, ++box);
				}


				c.sleep(100);

			}
			c.refresh();
			c.sleep(30);
		}
	}

	/**
	 * This method stores all of the contends of the screens and boxes used in the game.
	 * Every time a text box / item is clicked, the box number increases and will display new content.
	 * @param screen- an integer that corresponds to the screen that will be displayed in the game.
	 * @param box- an integer that corresponds to the content that will be displayed in the game.
	 */
	public void drawScreen(int screen, int box) {

		if (screen == 1) {

			c.drawImage(backgrounds[1], 0, 0, 800, 600);

			c.strokeRect(50, 400, 700 , 150); // x-co, y-co, width, height
			c.setFill(Color.LIGHTSTEELBLUE);
			c.fillRect(50, 400, 700, 150);

			if (box == 1) {

				c.setFill(Color.BLACK);
				c.fillText("You wake up in a white room.", 60, 430);
			}

			if (box == 2) {
				c.setFill(Color.BLACK);
				c.fillText("There is something in the center of the room \n... \n"
						+ "It appears to be a safe. \n! \n There is a note one top of it."
						+ "\n\n[Click on the safe to inspect it]", 60, 430);
				c.drawImage(items[1], 200, 100, 400, 250);

				if ((c.getMouseX() > 200 && c.getMouseX() < 600) && (c.getMouseY() > 100 && c.getMouseY() < 350)) {
					c.setStroke(Color.BLACK);
					c.strokeRect(200, 100, 400, 250);
				}
			}

			if (box == 3) {
				c.setFill(Color.BLACK);
				c.fillText("The note reads: \n"
						+ "Hello! Sorry for chloroforming you earlier, Ó-Ò\n I can't have the authorities finding out about me, after all! (´~')"
						+ "\nMaybe you can try though? (^-^)"
						+ "\nThe way out of this room is locked in this safe.\n Gooood Luuucckk! (0 w 0) ", 60, 430);

				c.drawImage(items[1], 200, 100, 400, 250);

			}

			if (box == 4) {
				c.setFill(Color.BLACK);
				c.fillText("Yours truly,\nTCT \nP.S. Try checking the walls.", 60, 430);

				c.drawImage(items[1], 200, 100, 400, 250);
			}

			if (box == 5) {
				c.setFill(Color.BLACK);
				c.fillText("So... \nIt looks like you'll have to try and get out of here, and maybe catch whoever 'TCT' is?"
						+ "\nWhere do you even start?", 60, 430);

				c.drawImage(items[1], 200, 100, 400, 250);
			}
			if (box == 6) {
				c.setFill(Color.BLACK);

				c.fillText("The room seems empty, except for the safe and note. \n...", 60, 430);
				c.drawImage(items[1], 200, 100, 400, 250);
			}

			if (box == 7) {
				c.setFill(Color.BLACK);
				c.fillText("Better look for more clues.", 60, 430);
			}

			if (box == 8) {

				if ((c.getMouseX() > 25 && c.getMouseX() < 160) && (c.getMouseY() > 190 && c.getMouseY() < 380)) {

					c.setStroke(Color.BLACK);
					c.strokeRect(25, 190, 135, 190);

					c.setFill(Color.BLACK);
					c.fillText("Check the left wall.",60 , 430);
				}

				if ((c.getMouseX() > 165 && c.getMouseX() < 605) && (c.getMouseY() > 190 && c.getMouseY() < 380)) {

					c.setStroke(Color.BLACK);
					c.strokeRect(165, 190, 450, 190);

					c.setFill(Color.BLACK);

					c.setFill(Color.BLACK);
					c.fillText("Check the center wall.", 60, 430);
				}
				if ((c.getMouseX() > 625 && c.getMouseX() < 775) && (c.getMouseY() > 190 && c.getMouseY() < 380)) {
					c.setStroke(Color.BLACK);
					c.strokeRect(625, 190, 150, 190);

					c.setFill(Color.BLACK);
					c.fillText("Check the right wall.", 60, 430);
				}
			}
		}

		/*
		 * The contents belonging to screen == 2 is the first challenge, corresponding to the left wall.
		 */
		if (screen == 2) {

			c.drawImage(backgrounds[screen], 0, 0, 800, 600);
			c.strokeRect(50, 400, 700 , 150);
			c.setFill(Color.LIGHTSTEELBLUE);
			c.fillRect(50, 400, 700, 150);

			if (box == -2) {
				c.setFill(Color.BLACK);
				c.fillText("It's incorrect!!", 60, 430);
			}

			if (box == -1) {
				c.setFill(Color.BLACK);
				c.fillText("You try entering the letter in the safe...", 60, 430);
			}

			if (box == 0) {
				c.setFill(Color.BLACK);
				c.fillText("You have cleared this challenge!! \nThe passcode inside says: FETHI", 60, 430);
			}

			if (box == 1) {
				c.setFill(Color.BLACK);
				c.fillText("There is a note on the wall... And another safe.",60,430);

			}

			if (box == 2) {
				c.drawImage(backgrounds[2], 0, 0, 800, 600);
				c.setFill(Color.BLACK);
				c.fillText("Have you figured it out?", 60, 430);


				// The options will be outlined depending on which is hovered over.
				c.fillText("A. The German.", 65, 450);
				if ((c.getMouseX() > 55 && c.getMouseX() < 775) && (c.getMouseY() > 430 && c.getMouseY() < 450)) {
					c.strokeRect(55, 430, 610, 30);
				}

				c.fillText("B. The Dane.", 65, 480);
				if ((c.getMouseX() > 55 && c.getMouseX() < 775) && (c.getMouseY() > 460 && c.getMouseY() < 480)) {
					c.strokeRect(55, 460, 610, 30);
				}

				c.fillText("C. The Norwegian.", 65, 510);
				if ((c.getMouseX() > 55 && c.getMouseX() < 775) && (c.getMouseY() > 490 && c.getMouseY() < 510)) {
					c.strokeRect(55, 490, 610, 30);
				}

				c.fillText("D. The Brit.", 65, 540);
				if ((c.getMouseX() > 55 && c.getMouseX() < 775) && (c.getMouseY() > 535 && c.getMouseY() < 550)) {
					c.strokeRect(55, 520, 610, 30);
				}
				c.fillText("E. The Swede.", 65, 570);
				if ((c.getMouseX() > 55 && c.getMouseX() < 775) && (c.getMouseY() > 550 && c.getMouseY() < 580)) {
					c.strokeRect(55, 550, 610, 30);
				}
			}

		}

		/*
		 * The contends belonging to screen == 3 is the second challenge, corresponding to the center wall.
		 */
		if (screen == 3) {

			c.drawImage(backgrounds[1], 0, 0, 800, 600);

			c.strokeRect(50, 400, 700 , 150);
			c.setFill(Color.LIGHTSTEELBLUE);
			c.fillRect(50, 400, 700, 150);

			if (box == -2) {
				c.setFill(Color.BLACK);
				c.fillText("The box doens't open!", 60, 430);
			}

			if (box == -1) {
				c.setFill(Color.BLACK);
				c.fillText("You try using the corresponding key to open the box...", 60, 430);
			}

			if (box == 0) {
				c.setFill(Color.BLACK);
				c.fillText("The box opened! You have cleared this challenge!! \nThe passcode inside says: HTEC", 60, 430);
			}

			if (box == 1) {
				c.setFill(Color.BLACK);
				c.fillText("There appears to be nothing special about the wall.", 60, 430);
			}

			if (box == 2) {
				c.setFill(Color.BLACK);
				c.fillText("... \n There's a locked box in the corner and a loop with 5 keys. \nEach key is labeled with a different letter."
						+ "\n There's a note here too.", 60, 430);
			}

			if (box == 3) {
				c.drawImage(backgrounds[3], 0, 0, 800, 600);
				c.setFill(Color.BLACK);

				// The options will be outlined depending on which is hovered over.
				c.fillText("A. Gingerbready is the culprit!", 65, 450);
				if ((c.getMouseX() > 55 && c.getMouseX() < 775) && (c.getMouseY() > 430 && c.getMouseY() < 450)) {
					c.strokeRect(55, 430, 610, 30);
				}

				c.fillText("B. Bubbleston is the culprit!", 65, 480);
				if ((c.getMouseX() > 55 && c.getMouseX() < 775) && (c.getMouseY() > 460 && c.getMouseY() < 480)) {
					c.strokeRect(55, 460, 610, 30);
				}

				c.fillText("C. Churroni is the culprit!", 65, 510);
				if ((c.getMouseX() > 55 && c.getMouseX() < 775) && (c.getMouseY() > 490 && c.getMouseY() < 510)) {
					c.strokeRect(55, 490, 610, 30);
				}

				c.fillText("D. Dumbledwarf is the culprit!", 65, 540);
				if ((c.getMouseX() > 55 && c.getMouseX() < 775) && (c.getMouseY() > 535 && c.getMouseY() < 550)) {
					c.strokeRect(55, 520, 610, 30);
				}
				c.fillText("E. Floofenstein is the culprit!", 65, 570);
				if ((c.getMouseX() > 55 && c.getMouseX() < 775) && (c.getMouseY() > 550 && c.getMouseY() < 580)) {
					c.strokeRect(55, 550, 610, 30);
				}

			}
		}

		/*
		 * The contends belonging to screen == 4 is the third challenge, corresponding to the right wall.
		 */
		if (screen == 4) {

			c.drawImage((backgrounds[screen]), 0, 0, 800, 600);
			c.strokeRect(50, 400, 700 , 150);
			c.setFill(Color.LIGHTSTEELBLUE);
			c.fillRect(50, 400, 700, 150);

			if (box == -2) {
				c.setFill(Color.BLACK);
				c.fillText("It's incorrect!!", 60, 430);
			}

			if (box == -1) {
				c.setFill(Color.BLACK);
				c.fillText("You try entering the letter in the safe...", 60, 430);
			}

			if (box == 0) {
				c.setFill(Color.BLACK);
				c.fillText("You have cleared this challenge!! \nThe passcode inside says: RIHA", 60, 430);
			}

			if (box == 1) {
				c.setFill(Color.BLACK);
				c.fillText("The right wall has words written on it. \nLo and behold, there's another note and safe as well.", 60, 430);
			}

			if (box == 2) {

				c.drawImage(backgrounds[4], 0, 0, 800, 600);
				c.setFill(Color.BLACK);

				c.fillText("What is the missing word?", 60, 420);


				// The options will be outlined depending on which is hovered over.
				c.fillText("A. ORANGE", 65, 450);
				if ((c.getMouseX() > 55 && c.getMouseX() < 775) && (c.getMouseY() > 430 && c.getMouseY() < 450)) {
					c.strokeRect(55, 430, 610, 30);
				}

				c.fillText("B. CANCEL", 65, 480);
				if ((c.getMouseX() > 55 && c.getMouseX() < 775) && (c.getMouseY() > 460 && c.getMouseY() < 480)) {
					c.strokeRect(55, 460, 610, 30);
				}

				c.fillText("C. FIRST", 65, 510);
				if ((c.getMouseX() > 55 && c.getMouseX() < 775) && (c.getMouseY() > 490 && c.getMouseY() < 510)) {
					c.strokeRect(55, 490, 610, 30);
				}

				c.fillText("D. ICE", 65, 540);
				if ((c.getMouseX() > 55 && c.getMouseX() < 775) && (c.getMouseY() > 535 && c.getMouseY() < 550)) {
					c.strokeRect(55, 520, 610, 30);
				}
				c.fillText("E. JAVA", 65, 570);
				if ((c.getMouseX() > 55 && c.getMouseX() < 775) && (c.getMouseY() > 550 && c.getMouseY() < 580)) {
					c.strokeRect(55, 550, 610, 30);
				}

			}
		}

		/*
		 * When all of the challenges are complete, checking by using the method checkRoom(),
		 * the contents of screen == 5 is shown.
		 */
		if (screen == 5) {
			c.drawImage(backgrounds[1], 0, 0, 800, 600);
			c.strokeRect(50, 400, 700 , 150);
			c.setFill(Color.LIGHTSTEELBLUE);
			c.fillRect(50, 400, 700, 150);

			if (box ==1) {
				c.setFill(Color.BLACK);
				c.fillText("You make your way back to the safe.", 60, 430);
			}

			if (box == 2) {
				c.drawImage(items[1], 200, 100, 400, 250);
				c.setFill(Color.BLACK);
				c.fillText("The pass codes you collected- 'FETHI', 'HTEC', and 'RIHA'- what do they mean?"
						+ "\nDo they form a word? A phrase? Or is it just random?", 60, 430);
			}

			if (box == 3) {
				c.drawImage(items[1], 200, 100, 400, 250);
				c.setFill(Color.BLACK);
				c.fillText("[Try putting them in separately]", 60, 430);

				if ((c.getMouseX() > 200 && c.getMouseX() < 600) && (c.getMouseY() > 100 && c.getMouseY() < 350)) {
					c.setStroke(Color.BLACK);
					c.strokeRect(200, 100, 400, 250);
				}
			}

			if (box == 4) {
				c.drawImage(items[1], 200, 100, 400, 250);
				c.setFill(Color.BLACK);
				c.fillText("Nothing happened...", 60, 430);
			}

			if (box == 5) {
				c.drawImage(items[1], 200, 100, 400, 250);
				c.setFill(Color.BLACK);
				c.fillText("[Try putting them in altogether.]", 60, 430);

				if ((c.getMouseX() > 200 && c.getMouseX() < 600) && (c.getMouseY() > 100 && c.getMouseY() < 350)) {
					c.setStroke(Color.BLACK);
					c.strokeRect(200, 100, 400, 250);
				}
			}

			if (box == 6) {
				c.drawImage(items[1], 200, 100, 400, 250);
				c.setFill(Color.BLACK);
				c.fillText("Nothing happened again...", 60, 430);
			}

			if (box == 7) {
				c.drawImage(items[1], 200, 100, 400, 250);
				c.setFill(Color.BLACK);
				c.fillText("The pass code must be mixed up. \n\n...", 60, 430);
			}

			if (box == 8) {
				c.drawImage(items[1], 200, 100, 400, 250);
				c.setFill(Color.BLACK);
				c.fillText("...", 60, 430);
			}

			if (box == 9) {
				c.drawImage(items[1], 200, 100, 400, 250);
				c.setFill(Color.BLACK);
				c.fillText("This 'TCT' person likes flaunting that they can't be caught... \n... They like chairs too?", 60, 430);
			}

			if (box ==10) {
				c.drawImage(items[1], 200, 100, 400, 250);
				c.setFill(Color.BLACK);
				c.fillText("[Input: THECHAIRTHIEF]", 60, 430);

				if ((c.getMouseX() > 200 && c.getMouseX() < 600) && (c.getMouseY() > 100 && c.getMouseY() < 350)) {
					c.setStroke(Color.BLACK);
					c.strokeRect(200, 100, 400, 250);
				}
			}

			if (box == 11) {
				c.drawImage(items[1], 200, 100, 400, 250);
				c.setFill(Color.BLACK);
				c.fillText("The safe opensed, revealing a key. \n You use it to open the door to the room , and run outside.", 60, 430);
			}

			if (box == 12) {
				c.drawImage(backgrounds[5], 0, 0, 800, 600);
				c.strokeRect(50, 400, 700 , 150);
				c.setFill(Color.LIGHTSTEELBLUE);
				c.fillRect(50, 400, 700, 150);

				c.setFill(Color.BLACK);
				c.fillText("...", 60, 430);
			}

			if (box == 13) {
				c.drawImage(backgrounds[5], 0, 0, 800, 600);
				c.strokeRect(50, 400, 700 , 150);
				c.setFill(Color.LIGHTSTEELBLUE);
				c.fillRect(50, 400, 700, 150);

				c.setFill(Color.BLACK);
				c.fillText("What?!", 60, 430);
			}

			if (box == 14) {
				c.drawImage(backgrounds[5], 0, 0, 800, 600);
				c.strokeRect(50, 400, 700 , 150);
				c.setFill(Color.LIGHTSTEELBLUE);
				c.fillRect(50, 400, 700, 150);

				c.setFill(Color.BLACK);
				c.fillText("You end up on the sidewalk. \n\n...", 60, 430);
			}

			if (box == 15) {
				c.drawImage(backgrounds[5], 0, 0, 800, 600);
				c.strokeRect(50, 400, 700 , 150);
				c.setFill(Color.LIGHTSTEELBLUE);
				c.fillRect(50, 400, 700, 150);

				c.setFill(Color.BLACK);
				c.fillText("The thought slowly comes back to you.", 60, 430);
			}

			if (box == 16) {
				c.drawImage(backgrounds[5], 0, 0, 800, 600);
				c.strokeRect(50, 400, 700 , 150);
				c.setFill(Color.LIGHTSTEELBLUE);
				c.fillRect(50, 400, 700, 150);

				c.setFill(Color.BLACK);
				c.fillText("This was the last place you remembered being!", 60, 430);
			}

			if (box == 17) {
				c.drawImage(backgrounds[5], 0, 0, 800, 600);
				c.strokeRect(50, 400, 700 , 150);
				c.setFill(Color.LIGHTSTEELBLUE);
				c.fillRect(50, 400, 700, 150);

				c.setFill(Color.BLACK);
				c.fillText("You look behind you, from where you came from, but there is nothing.", 60, 430);
			}

			if (box == 18) {
				c.drawImage(backgrounds[5], 0, 0, 800, 600);
				c.strokeRect(50, 400, 700 , 150);
				c.setFill(Color.LIGHTSTEELBLUE);
				c.fillRect(50, 400, 700, 150);

				c.setFill(Color.BLACK);
				c.fillText("... You feel your phone in your pocket, and check the time.", 60, 430);
			}

			if (box == 19) {
				c.drawImage(backgrounds[5], 0, 0, 800, 600);
				c.strokeRect(50, 400, 700 , 150);
				c.setFill(Color.LIGHTSTEELBLUE);
				c.fillRect(50, 400, 700, 150);

				c.setFill(Color.BLACK);
				c.fillText("!! \n No time has passed at all?!", 60, 430);
			}

			if (box == 20) {
				c.drawImage(backgrounds[5], 0, 0, 800, 600);
				c.strokeRect(50, 400, 700 , 150);
				c.setFill(Color.LIGHTSTEELBLUE);
				c.fillRect(50, 400, 700, 150);

				c.setFill(Color.BLACK);
				c.fillText("You slowly shrug it off. \nMaybe you hadn't gotten enough sleep the night before.", 60, 430);

			}

			if (box == 21) {
				c.setBackground(Color.BLACK);
				c.clear();
				c.setFill(Color.WHITE);
				c.setFont("Times New Roman", 24);
				c.fillText("THE END...?", 100, 250);

			}

		}
	}

	/**
	 * This method checks to see if the challenges in the room are completed or not.
	 * @return Returns a boolean, true if all of the challenges are complete, false if not.
	 */
	public boolean checkRoom() {
		if (challenges[0] && challenges [1] && challenges[2]) {
			return true;
		}
		return false;
	}

	/**
	 * This method loads all of the images used in the Escape_Game.java.
	 * @throws FileNotFoundException
	 */
	public void loadImages() throws FileNotFoundException {

		InputStream oneBackground = new FileInputStream(new File("src/zhou/culminating/images/white_room.jpg"));
		backgrounds[1] = new Image(oneBackground, 1000, 800, true, true);

		InputStream twoBackground = new FileInputStream(new File("src/zhou/culminating/images/Challenge1.png"));
		backgrounds[2] = new Image(twoBackground, 800, 600, true, true);

		InputStream threeBackground = new FileInputStream(new File("src/zhou/culminating/images/Challenge2.png"));
		backgrounds[3] = new Image(threeBackground, 800, 600, true, true);

		InputStream fourBackground = new FileInputStream(new File("src/zhou/culminating/images/Challenge3.png"));
		backgrounds[4] = new Image(fourBackground, 1000, 800, true, true);

		InputStream fiveBackground = new FileInputStream(new File("src/zhou/culminating/images/street.jpg"));
		backgrounds[5] = new Image(fiveBackground, 800, 600, true, true);

		InputStream oneItem = new FileInputStream(new File("src/zhou/culminating/images/safe.jpg"));
		items[1] = new Image(oneItem, 800, 600, false, true);

	}
}

