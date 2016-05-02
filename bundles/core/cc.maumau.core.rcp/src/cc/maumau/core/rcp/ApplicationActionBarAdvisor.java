package cc.maumau.core.rcp;

import org.eclipse.jface.action.IMenuManager;
import org.eclipse.ui.IWorkbenchWindow;
import org.eclipse.ui.application.ActionBarAdvisor;
import org.eclipse.ui.application.IActionBarConfigurer;

/**
 *
 * @author Christian Kuka <christian@kuka.cc>
 *
 */
public class ApplicationActionBarAdvisor extends ActionBarAdvisor {

	/**
	 * @param configurer
	 */
	public ApplicationActionBarAdvisor(IActionBarConfigurer configurer) {
		super(configurer);
	}

	/**
	 * 
	 * {@inheritDoc}
	 */
	@Override
	protected void makeActions(IWorkbenchWindow window) {
		// Nothing to do
	}

	/**
	 * 
	 * {@inheritDoc}
	 */
	@Override
	protected void fillMenuBar(IMenuManager menuBar) {
		// Nothing to do
	}

}
