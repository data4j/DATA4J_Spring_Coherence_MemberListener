package org.data4j.listener;


import org.apache.log4j.Logger;

import com.tangosol.net.MemberEvent;
import com.tangosol.net.MemberListener;

/**
 * TestMemberListener Class listens cluster' s member events
 * 
 * @author data4j.org
 * @since 16 Oct 2013
 * @version 1.0.0
 *
 */
public class ClusterMemberListener implements MemberListener {

	private static final Logger logger = Logger.getLogger(ClusterMemberListener.class);
	
	/**
     * This method is invoked when member is joined to cluster...
     *
     * @param MapEvent me
     */
	@Override
	public void memberJoined(MemberEvent me) {
		logger.debug("Member is joined to cluster => " + me.getMember());
	}

	/**
     * This method is invoked when member is leaving from cluster...
     *
     * @param MapEvent me
     */
	@Override
	public void memberLeaving(MemberEvent me) {
		logger.debug("Member is leaving from cluster => " + me.getMember());
	}

	/**
     * This method is invoked when member is left from cluster...
     *
     * @param MapEvent me
     */
	@Override
	public void memberLeft(MemberEvent me) {
		logger.debug("Member is left from cluster => " + me.getMember());
	}	
}
