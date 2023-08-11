package _01_Olympic_Rings;

import org.jointheleague.graphical.robot.Robot;

public class OlympicRings_Threaded {
	// Make A Program that uses Threads and robots to draw the Olympic rings. One robot should draw one ring simultaneously with the other 4 robots.
	public static void main(String[] args) {
		Robot blue = new Robot(300, 300);
		Robot yellow = new Robot(500, 600);
		Robot black = new Robot(700, 300);
		Robot green = new Robot(900, 600);
		Robot red = new Robot(1100, 300);
		
		blue.setSpeed(10);
		yellow.setSpeed(10);
		black.setSpeed(10);
		green.setSpeed(10);
		red.setSpeed(10);
		
		timmy.move(400);
		tammy.move(400);
		sammy.move(400);
		
		timmy.moveTo(400, 700);
		tammy.moveTo(800, 700);
		sammy.moveTo(1200, 700);
		
		Thread r1 = new Thread(()->(blue.move(400) , blue.turn(0)));
		Thread r2 = new Thread(()->yellow.move(400));
		Thread r3 = new Thread(()->black.move(400));
		Thread r4 = new Thread(()->green.move(400));
		Thread r5 = new Thread(()->red.move(400));
		
		r1.start();
		r2.start();
		r3.start();
		r4.start();
		r5.start();
	}
	
	public void drawRing(Robot rob) {
		
	}
}

