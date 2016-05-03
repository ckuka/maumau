package cc.maumau.core.rcp.screen;

import java.util.ArrayList;
import java.util.List;

import org.bytedeco.javacv.FFmpegFrameGrabber;
import org.bytedeco.javacv.Frame;
import org.bytedeco.javacv.FrameGrabber.Exception;

public class FrameGrabber extends Thread {

	private final FFmpegFrameGrabber frameGrabber;
	private final List<FrameGrabberListener> listeners = new ArrayList<>();

	public FrameGrabber(int x, int y, int w, int h) {
		frameGrabber = new FFmpegFrameGrabber(":0.0+" + x + "," + y);
		frameGrabber.setFormat("x11grab");
		frameGrabber.setImageWidth(w);
		frameGrabber.setImageHeight(h);
		frameGrabber.setFrameRate(3);
		setPriority(Thread.MIN_PRIORITY);
	}

	public void addListener(FrameGrabberListener listener) {
		listeners.add(listener);
	}

	public void run() {
		try {
			frameGrabber.start();
			while (!FrameGrabber.interrupted()) {
				Frame frame = frameGrabber.grab();
				for (FrameGrabberListener listener : listeners) {
					listener.onFrame(frame);
				}
			}
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				frameGrabber.stop();
			} catch (Exception e) {
				// Ignore exception
			}
		}
	}
}
