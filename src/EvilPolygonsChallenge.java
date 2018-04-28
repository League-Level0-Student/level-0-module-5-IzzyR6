import java.awt.Color;

import javax.swing.JOptionPane;

import org.jointheleague.graphical.robot.Robot;

public class EvilPolygonsChallenge {

	public static void main(String[] args) {

		// 1. Create a new Robot
		Robot robot = new Robot("batman");
		// 2. Set the speed to 100
		robot.setSpeed(100);
		int colorChoice = JOptionPane.showOptionDialog(null, "Choose A Color", "Color Choosing",
				JOptionPane.INFORMATION_MESSAGE, JOptionPane.DEFAULT_OPTION, null,
				new String[] { "Yellow", "Blue", "Green", "Red", "Cyan", "Orange", "Magenta", "Black", "White" }, 0);

		// 3. Use if statements to check the the value of colorChoice and set the pen
		// color accordingly
		if (colorChoice == 0) {
			robot.setPenColor(Color.YELLOW);
		}
		if (colorChoice == 1) {
			robot.setPenColor(Color.BLUE);
		}
		if (colorChoice == 2) {
			robot.setPenColor(Color.GREEN);
		}
		if (colorChoice == 3) {
			robot.setPenColor(Color.RED);
		}
		if (colorChoice == 4) {
			robot.setPenColor(Color.CYAN);
		}
		if (colorChoice == 5) {
			robot.setPenColor(Color.ORANGE);
		}
		if (colorChoice == 6) {
			robot.setPenColor(Color.MAGENTA);
		}
		if (colorChoice == 7) {
			robot.setPenColor(Color.BLACK);
		}
		if (colorChoice == 8) {
			robot.setPenColor(Color.WHITE);
		}
		// 4. Ask the user how many polygons they want to be drawn.
		String Num = JOptionPane.showInputDialog("How many polygons do you want to be drawn: 1 or 2?");
		// 5. Use the robot to draw the number of polygons the user requested.
		int num = Integer.parseInt(Num);
		if (num == 1) {
			robot.penDown();
			robot.setPenWidth(10);
			for (int i = 0; i < 4; i++) {
				robot.move(100);
				robot.turn(90);
			}
		}
		if (num == 2) {
			robot.penDown();
			robot.setPenWidth(10);
			for (int i = 0; i < 4; i++) {
				robot.move(100);
				robot.turn(90);
			}
			robot.penUp();
			robot.move(200);
			robot.penDown();
			for (int i = 0; i < 4; i++) {
				robot.move(100);
				robot.turn(90);
			}
		}
		// 6. Make it so your shapes do not overlap

		// 7. Challenge: add more colors to the Option Dialog.
	}
}
