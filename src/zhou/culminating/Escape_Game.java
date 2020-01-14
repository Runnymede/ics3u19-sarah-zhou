package zhou.culminating;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;

import hsafx.Console;
import hsafx.ConsoleView;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;
import javafx.scene.paint.Color;

public class Escape_Game extends ConsoleView{

	Image[] backgrounds = new Image[20];
	boolean[] challenges = new boolean[10];

	BorderPane borderPane = new BorderPane();
	HBox hbox =  new HBox();
	//borderPane.setTop(hbox);

	Scene s = new Scene(borderPane, 800, 600);

	Console c;

	// *****************************************
	public static void main(String[] args) {
		launch(args);
	}

	@Override
	public void run() {
		int screen = 0;
		c = new Console (800, 600, 12,"Game", this);


		c.println("hey");

		//drawScreen(screen);
		//mouse();
	}

	public void drawScreen(int screen) {

		if (screen == 0) {
			c.drawImage(backgrounds[screen], 0, 0, 800, 600);

			// textbox at bottom.
			c.strokeRect(50, 300, 500 , 250);
			c.setFill(Color.ANTIQUEWHITE);
			c.fillRect(49, 299, 499, 249);

		}

		if (screen == 1) {
			c.drawImage(backgrounds[screen], 0, 0, 800, 600);
			c.strokeRect(50, 300, 500 , 250);
			c.setFill(Color.ANTIQUEWHITE);
			c.fillRect(49, 299, 499, 249);
		}

		if (screen == 2) {

		}
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

		InputStream zero = new FileInputStream(new File("scr/zhou/culminating/images/white_room.jpg"));
		backgrounds[0] = new Image(zero, 800, 600, false, true);
		// InputStream one = new FileInputStream(new File(""));
		// backgrounds[1] = new Image(one, 800, 600, false, true);

	}

	public void mouse() {

		if (c.getMouseDX() != 0 || c.getMouseDY() != 0) {
			double left = c.getMouseX() - c.getMouseDX();
			double right = c.getMouseX();
			double top = c.getMouseY() - c.getMouseDY();
			double bottom = c.getMouseY();
			if (left > right) {
				double temp = left;
				left = right;
				right = temp;
			}
			if (top > bottom) {
				double temp = top;
				top = bottom;
				bottom = temp;
			}
			c.strokeRect(left, top, right - left + 1, bottom - top + 1);
		}
		if (c.getMouseButton(0)) {
			c.setFill(Color.DARKRED);
			c.fillStar(c.getMouseX() - 10, c.getMouseY() - 10, 21, 21);
		} else {
			c.setStroke(Color.DARKRED);
			c.strokeStar(c.getMouseX() - 10, c.getMouseY() - 10, 21, 21);
		}
		c.refresh();
		c.sleep(30);
	}
}
