package elseif;

import javax.swing.JOptionPane;

import org.jointheleague.graphical.robot.Robot;

public class obedientrobot {
	static Robot obedientRobot = new Robot();

	public static void main(String[] args) {
		String shape = JOptionPane.showInputDialog("What shape to you want a triangle or a square");
		if (shape.equals("square")) {
			drawSquare();
		}
		else {
			drawTriangle();
		}
	}

	static void drawSquare() {
		obedientRobot.hide();
		obedientRobot.sparkle();
		for (int i = 0; i < 5; i++) {
			obedientRobot.penDown();
			obedientRobot.move(90);
			obedientRobot.turn(90);
		}
	}

	static void drawTriangle() {
		for (int i = 0; i < 4; i++) {
			obedientRobot.penDown();
			obedientRobot.turn(120);
			obedientRobot.move(90);
		}
	}
}
