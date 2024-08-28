/*------------------------------------------------------------------------------
 *******************************************************************************
 * COPYRIGHT Ericsson 2014
 *
 * The copyright to the computer program(s) herein is the property of
 * Ericsson Inc. The programs may be used and/or copied only with written
 * permission from Ericsson Inc. or in accordance with the terms and
 * conditions stipulated in the agreement/contract under which the
 * program(s) have been supplied.
 *******************************************************************************
 *----------------------------------------------------------------------------*/
package com.ericsson.oss.services.ap.model.cache;

import java.util.UUID;

import com.ericsson.oss.itpf.modeling.annotation.EModel;
import com.ericsson.oss.itpf.modeling.annotation.cache.CacheDefinition;
import com.ericsson.oss.itpf.modeling.annotation.cache.CacheMode;
import com.ericsson.oss.itpf.modeling.annotation.cache.EvictionStrategy;

/**
 * Replicated Cache used to temporarly store Instrumentation data based on a Unique usecase key. Allows for asyncronous execution metrics to be
 * recorded in a clustered environment.
 * <p>
 * Entries will be cached for a maximum period of 60 minutes after which time they will be removed.
 */
@EModel(description = "Replicated Cache data for Instrumentation execution times for asyncronous execution in clustered environment", name = "AutoProvisioningInstrumentationCache")
@CacheDefinition(cacheMode = CacheMode.REPLICATED_SYNC, evictionStrategy = EvictionStrategy.NONE, transactional = false, timeToLive = 3_600_000, keyClass = UUID.class, valueClass = Object.class)
public class AutoProvisioningInstrumentationCache {

}
