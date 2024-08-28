/*------------------------------------------------------------------------------
 *******************************************************************************
 * COPYRIGHT Ericsson 2016
 *
 * The copyright to the computer program(s) herein is the property of
 * Ericsson Inc. The programs may be used and/or copied only with written
 * permission from Ericsson Inc. or in accordance with the terms and
 * conditions stipulated in the agreement/contract under which the
 * program(s) have been supplied.
 *******************************************************************************
 *----------------------------------------------------------------------------*/
package com.ericsson.oss.services.ap.model;

import java.io.Serializable;

import com.ericsson.oss.itpf.datalayer.dps.modeling.annotation.OnReadWrite;
import com.ericsson.oss.itpf.datalayer.dps.modeling.annotation.PrimaryTypeAttribute;
import com.ericsson.oss.itpf.datalayer.dps.modeling.annotation.PrimaryTypeDefinition;
import com.ericsson.oss.itpf.datalayer.dps.modeling.annotation.WriteBehavior;
import com.ericsson.oss.itpf.modeling.annotation.EModel;
import com.ericsson.oss.itpf.modeling.annotation.EModelAttribute;
import com.ericsson.oss.itpf.modeling.annotation.LifeCycle;
import com.ericsson.oss.itpf.modeling.annotation.LifeCycleState;

/**
 * Defines the Auto Provisioning capacity licensing data PO.
 *
 * @deprecated Auto Provisioning no longer implements capacity licensing
 */
@EModel(namespace = "ap", description = "Auto Provisioning Licensing Data", name = "CapacityLicensing", version = ApVersion.PROJECT_VERSION)
@PrimaryTypeDefinition()
@LifeCycle(value = LifeCycleState.DEPRECATED, lifeCycleDescription = "Capacity license no longer used by Auto Provisioning")
@OnReadWrite(onWrite = WriteBehavior.WRITE_TO_PERSISTENT_STORAGE_ONLY)
@Deprecated
public class CapacityLicensing implements Serializable {

    private static final long serialVersionUID = 1L;

    @EModelAttribute(description = "Current capacity tokens used (encoded value)", mandatory = false, immutable = false)
    @PrimaryTypeAttribute
    public Integer tokensUsed;
}
