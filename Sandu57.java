package elenaneacsu;
import robocode.*;
import java.awt.Color;

// API help : http://robocode.sourceforge.net/docs/robocode/robocode/Robot.html

/**
 * Sandu57 - a robot by (your name here)
 */
public class Sandu57 extends Robot
{
	/**
	 * run: Sandu57's default behavior
	 */
	public void run() {

		setColors(Color.green,Color.blue,Color.green); // body,gun,radar

		
		while(true) {
			moveInSquare(200);
			
		}
	}
	
	public void moveInSquare(int lengthOfSide){
	int count = 0;
		int i=0;
		while(true) {
			ahead(lengthOfSide);
			turnRight(90);
			i++;
			if(i == 4){
			count++;
				out.println(count);
			}
		}
	}

	/**
	 * onScannedRobot: What to do when you see another robot
	 */
	public void onScannedRobot(ScannedRobotEvent e) {
		// Replace the next line with any behavior you would like
		fire(1);
	}
	
	

	/**
	 * onHitByBullet: What to do when you're hit by a bullet
	 */
	public void onHitByBullet(HitByBulletEvent e) {
		// Replace the next line with any behavior you would like
		back(10);
	}
	
	/**
	 * onHitWall: What to do when you hit a wall
	 */
	public void onHitWall(HitWallEvent e) {
		// Replace the next line with any behavior you would like
		back(20);
	}	
}
