package org.globalplatform.contactless;

import javacard.framework.Shareable;

/**
 * An applet may implement this interface so that it can be
 * notified by the OPEN of changes occurring to its associated registry entry (parameters and/or life cycle). 
 * <p>
 * The applet will not receive notification of events generated by itself.
 * <p>
 * Such an applet shall expose the <code>CLApplet</code> interface object(s) through 
 * {@link javacard.framework.Applet#getShareableInterfaceObject(javacard.framework.AID, byte)}
 * only if the client AID is null, and the parameter is set to {@link GPCLSystem#GPCL_CL_APPLICATION}.
 */

public interface CLApplet extends Shareable 
{
/**
 * Applet receives notification on event affecting its registry entry.
 * <p>
 * If the Applet implementing the <code>CLApplet</code> returns from the notification
 * and initiated transaction in progress, then the OPEN automatically aborts the 
 * transaction.
 * 
 * @param event ({@link CLAppletEvent}) affecting the <code>target</code> application
 * 
 */
public void notifyCLEvent(short event);
}