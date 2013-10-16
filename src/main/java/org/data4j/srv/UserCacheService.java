package org.data4j.srv;

import javax.annotation.PostConstruct;

import org.apache.log4j.Logger;
import org.data4j.listener.ClusterMemberListener;
import org.springframework.stereotype.Service;

import com.tangosol.net.CacheFactory;
import com.tangosol.net.NamedCache;

/**
 * CacheService Class is implementation of ICacheService Interface
 * 
 * @author data4j.org
 * @since 16 Oct 2013
 * @version 1.0.0
 *
 */
@Service("userCacheService")
public class UserCacheService implements IUserCacheService {
	
	private static final Logger logger = Logger.getLogger(UserCacheService.class);
	private static final String USER_MAP = "user-map";
	
	private NamedCache userCache = null;	
	
	@SuppressWarnings("unused")
	@PostConstruct
	private void initialize() {
		setUserCache(CacheFactory.getCache(USER_MAP));
		
		while(true) {
			try {
				Thread.sleep(5_000);
			} catch (InterruptedException e) {
				logger.error(e);
			}
		}
	}

	/**
     * Gets user cache
     *
     * @retun NamedCache Coherence named cache
     */
	public NamedCache getUserCache() {
		return userCache;
	}

	public void setUserCache(NamedCache userCache) {
		this.userCache = userCache;
	}
			
}
