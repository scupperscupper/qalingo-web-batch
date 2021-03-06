/**
 * Most of the code in the Qalingo project is copyrighted Hoteia and licensed
 * under the Apache License Version 2.0 (release version 0.8.0)
 *         http://www.apache.org/licenses/LICENSE-2.0
 *
 *                   Copyright (c) Hoteia, 2012-2014
 * http://www.hoteia.com - http://twitter.com/hoteia - contact@hoteia.com
 *
 */
package org.hoteia.qalingo.app.cmssync.job.cmscontent;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.batch.item.ItemWriter;
import org.springframework.beans.factory.InitializingBean;

import org.hoteia.qalingo.core.domain.CmsContent;


/**
 * 
 */
public class CmsContentItemWriter implements ItemWriter<CmsContent>, InitializingBean {
	
	private final Logger logger = LoggerFactory.getLogger(getClass());
	
	public final void afterPropertiesSet() throws Exception {
	}
	
	public void write(List<? extends CmsContent> processIndicatorItemWrapperList) throws Exception {
		for (CmsContent targetCmsContent : processIndicatorItemWrapperList) {
			
	        
		}
	}

}
