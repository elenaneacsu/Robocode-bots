package elenaneacsu;
import robocode.*;
import java.awt.Color;

// API help : http://robocode.sourceforge.net/docs/robocode/robocode/Robot.html

/**
 * Gigel58 - a robot by (your name here)
 */
public class Gigel58 extends Robot
{

	/**
	 * run: Gigel58's default behavior
	 */
	public void run() {
		 setColors(Color.red,Color.red,Color.green); // body,gun,radar

		while(true) {
			moveInSquare(125);
		}
	}


		public void moveInSquare(int lengthOfSide) {
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
		out.println("Robot " + e.getName() + " at distance "+ e.getDistance()+" with energy "+e.getEnergy());
		if(e.getDistance() > 5){
			fire(3);
		} else{
		fire(1);
		}
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
