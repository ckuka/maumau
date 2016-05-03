package cc.maumau.core.rcp.screen;

import java.awt.AWTException;
import java.awt.Rectangle;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.image.BufferedImage;

/**
 *
 * @author Christian Kuka <christian@kuka.cc>
 *
 */
public class Screen {

	public static BufferedImage capture(int delay) throws AWTException {
		Robot robot = new Robot();
		robot.delay(delay);
		return robot.createScreenCapture(new Rectangle(Toolkit.getDefaultToolkit().getScreenSize()));
	}

}
