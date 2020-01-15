package zhou.culminating;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;

import hsafx.Console;
import hsafx.ConsoleView;
import javafx.scene.image.Image;
import javafx.scene.paint.Color;

public class Escape_Game extends ConsoleView{

	Image[] backgrounds = new Image[20];
	Image[] items = new Image[20];
	boolean[] challenges = new boolean[10];
	Console c;

	// *****************************************
	public static void main(String[] args) {
		launch(args);
	}

	@Override
	public void run() {
		int screen = 1;
		int box = 2;
		c = new Console (800, 600, 12,"Game", this);

		try {
			loadImages();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}

		c.autoRefreshOff();
		drawScreen(screen, box);

		c.setOnMouseMoved(e->{
			//	System.out.println("Here");
			if (e.getX() > 50 && e.getX() < 100 && e.getY() > 50 && e.getY() < 100) {
				c.setStroke(Color.BLUE);
				c.strokeRect(50, 50, 50, 50);
			}
		});

		c.setOnMouseClicked(e->{
			int boxy = 1;
			if (e.getX() > 50 && e.getX() < 550 && e.getY() > 400 && e.getY() < 750) {
				drawScreen(screen, boxy++);
			}
		});

		c.refresh();
		c.sleep(30);


	}

	public void drawScreen(int screen, int box) {

		if (screen == 1) {

			c.drawImage(backgrounds[1], 0, 0, 800, 600);

			// c.strokeText("Hello", 100, 200);
			c.strokeRect(50, 400, 700 , 150); // x-co, y-co, width, height
			c.setFill(Color.LIGHTSTEELBLUE);
			c.fillRect(50, 400, 700, 150);

			if (box == 1) {
				c.setFont("Times New Roman", 16);
				c.setFill(Color.BLACK);
				c.fillText("You wake up in a white room.", 60, 430);
			}

			if (box == 2) {
				c.setFont("Times New Roman", 16);
				c.setFill(Color.BLACK);
				c.fillText("Wow! What do you think that is over there? \n... \n"
						+ "It appears to be a safe. \n! \n There is a note next to it.", 60, 430);
				c.drawImage(items[1], 200, 100, 400, 250);
			}
		}

		if (screen == 2) {
			c.drawImage(backgrounds[screen], 0, 0);
			c.strokeRect(50, 300, 700 , 250);
			c.setFill(Color.ANTIQUEWHITE);
			c.fillRect(50, 300, 700, 250);

		}

		if (screen == 3) {

		}

		//		c.setFill(Color.GREENYELLOW);
		//		c.fillRect(50, 50, 50, 50);
	}

	public boolean checkRoom(int room) {
		if (room == 1) {
			if (challenges[0] && challenges [1] && challenges[2]) {
				return true;

			}
		}

		if (room == 2) {
			if (challenges[3]) {
				// drawScreen(10)
			}
		}
		return false;
	}

	public void loadImages() throws FileNotFoundException {

		InputStream oneBackground = new FileInputStream(new File("src/zhou/culminating/images/white_room.jpg"));
		backgrounds[1] = new Image(oneBackground, 1000, 800, true, true);

		InputStream oneItem = new FileInputStream(new File("src/zhou/culminating/images/safe.jpg"));
		items[1] = new Image(oneItem, 800, 600, false, true);

	}

}
