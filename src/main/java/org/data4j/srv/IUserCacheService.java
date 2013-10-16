package org.data4j.srv;

import com.tangosol.net.NamedCache;

/**
 * IUserCacheService Interface exposes User Cache operations
 * 
 * @author data4j.org
 * @since 16 Oct 2013
 * @version 1.0.0
 *
 */
public interface IUserCacheService {

	/**
     * Gets user cache
     *
     * @retun NamedCache Coherence named cache
     */
	NamedCache getUserCache();
	
}
