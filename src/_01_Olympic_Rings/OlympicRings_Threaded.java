package _01_Olympic_Rings;

import java.awt.Color;

import org.jointheleague.graphical.robot.Robot;

public class OlympicRings_Threaded {
	// Make A Program that uses Threads and robots to draw the Olympic rings. One robot should draw one ring simultaneously with the other 4 robots.
	public static void main(String[] args) {
		Robot blue = new Robot(300, 300);
		Robot yellow = new Robot(400, 450);
		Robot black = new Robot(500, 300);
		Robot green = new Robot(600, 450);
		Robot red = new Robot(700, 300);
		
		blue.setSpeed(10);
		yellow.setSpeed(10);
		black.setSpeed(10);
		green.setSpeed(10);
		red.setSpeed(10);
		
		blue.penDown();
		yellow.penDown();
		black.penDown();
		green.penDown();
		red.penDown();
		
		blue.setPenColor(Color.BLUE);
		yellow.setPenColor(Color.YELLOW);
		black.setPenColor(Color.BLACK);
		green.setPenColor(Color.green);
		red.setPenColor(Color.RED);
		
		blue.setPenWidth(10);
		yellow.setPenWidth(10);
		black.setPenWidth(10);
		green.setPenWidth(10);
		red.setPenWidth(10);
		
		Thread r1 = new Thread( ()-> {
			for (int i = 0; i < 100; i++) {
				blue.move(10);
				blue.turn(5);
			}
		});
		Thread r2 = new Thread( ()-> {
			for (int i = 0; i < 100; i++) {
				yellow.move(10);
				yellow.turn(5);
			}
		});
		Thread r3 = new Thread( ()-> {
			for (int i = 0; i < 100; i++) {
				black.move(10);
				black.turn(5);
			}
		});
		Thread r4 = new Thread( ()-> {
			for (int i = 0; i < 100; i++) {
				green.move(10);
				green.turn(5);
			}
		});
		Thread r5 = new Thread( ()-> {
			for (int i = 0; i < 100; i++) {
				red.move(10);
				red.turn(5);
			}
		});
		
		r1.start();
		r2.start();
		r3.start();
		r4.start();
		r5.start();
	}
	
	public void drawRing(Robot rob) {
		
	}
}

