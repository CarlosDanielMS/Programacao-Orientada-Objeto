package guarani;

import robocode.*;
import java.awt.Color;

public class guarani extends Robot {
 
    public void run() {
        setBodyColor(java.awt.Color.green);
        setGunColor(java.awt.Color.red);
        setRadarColor(java.awt.Color.green);


        while (true) {
            ahead(100); 
            turnGunRight(360); 
            back(100); 
            turnGunRight(360); 
        }
    }

    public void onScannedRobot(ScannedRobotEvent e) {
        double distancia = e.getDistance();
        if (distancia < 50) {
            fire(5);
        } else if (distancia < 200) {
            fire(3); 
        } else {
            fire(1);
        }
    }


    public void onHitByBullet(HitByBulletEvent e) {
        turnLeft(90);
        ahead(50); 
    }

    public void onHitWall(HitWallEvent e) {
        back(50);
        turnRight(90);
    }
}
