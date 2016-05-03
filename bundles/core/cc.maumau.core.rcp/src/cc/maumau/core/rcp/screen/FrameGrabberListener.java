package cc.maumau.core.rcp.screen;

import org.bytedeco.javacv.Frame;

public interface FrameGrabberListener {

	void onFrame(Frame frame);
}
