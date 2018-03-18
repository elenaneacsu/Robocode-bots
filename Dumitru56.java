package elenaneacsu;
import robocode.*;
import java.awt.Color;

// API help : http://robocode.sourceforge.net/docs/robocode/robocode/Robot.html

/**
 * Dumitru56 - a robot by (your name here)
 */
public class Dumitru56 extends Robot
{
	/**
	 * run: Dumitru56's default behavior
	 */
	public void run() {
	
	    setColors(Color.red,Color.red,Color.red); // body,gun,radar
		
//cerinta 5.6
		int count = 0;
		int i=0;
		while(true) {
			out.println("currently travelling clockwise");
			ahead(150);
			turnRight(90);
			if(i % 4 == 0){
				turnRight(90);
				ahead(150);
				out.println("currently travelling counter-clockwise");
				turnLeft(90);
				ahead(150);
				out.println("currently travelling counter-clockwise");
				turnLeft(90);
				ahead(150);
				out.println("currently travelling counter-clockwise");
				turnLeft(90);
				ahead(150);
				out.println("currently travelling counter-clockwise");
				turnRight(180);
				i+=4;
			}
			
			i++;
			
			if(i % 4 == 0){
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
		back(25);
	}	
}
