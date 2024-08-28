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
package com.ericsson.oss.services.ap.model;

import java.io.Serializable;

import com.ericsson.oss.itpf.datalayer.dps.modeling.annotation.Hierarchical;
import com.ericsson.oss.itpf.datalayer.dps.modeling.annotation.OnReadWrite;
import com.ericsson.oss.itpf.datalayer.dps.modeling.annotation.PrimaryTypeAttribute;
import com.ericsson.oss.itpf.datalayer.dps.modeling.annotation.PrimaryTypeDefinition;
import com.ericsson.oss.itpf.datalayer.dps.modeling.annotation.ReadBehavior;
import com.ericsson.oss.itpf.datalayer.dps.modeling.annotation.WriteBehavior;
import com.ericsson.oss.itpf.modeling.annotation.EModel;
import com.ericsson.oss.itpf.modeling.annotation.EModelAttribute;
import com.ericsson.oss.itpf.modeling.annotation.LifeCycle;
import com.ericsson.oss.itpf.modeling.annotation.LifeCycleState;
import com.ericsson.oss.itpf.modeling.annotation.constraints.NotNull;

/**
 * Defines the Auto Provisioning Node User Credentials MO.
 */
@EModel(namespace = "ap", description = "Node Credentials. Usernames and passwords created during Order and used for accessing the node after integration", name = "NodeUserCredentials", version = ApVersion.PROJECT_VERSION)
@PrimaryTypeDefinition()
@Hierarchical(parentMoTypeUrn = "//ap/Node/*")
@OnReadWrite(onRead = ReadBehavior.READ_FROM_PERSISTENT_STORAGE, onWrite = WriteBehavior.WRITE_TO_PERSISTENT_STORAGE_ONLY)
public class NodeUserCredentials implements Serializable {

    private static final long serialVersionUID = -2169050408477447585L;

    @PrimaryTypeAttribute
    @EModelAttribute(description = "The ID of the MO", key = true, immutable = true, mandatory = true)
    @NotNull
    public String NodeUserCredentialsId;

    @EModelAttribute(description = "Secure username")
    @PrimaryTypeAttribute
    public String secureUserName;

    @EModelAttribute(description = "Secure password")
    @PrimaryTypeAttribute
    public byte[] securePassword;

    @EModelAttribute(description = "Unsecure username")
    @PrimaryTypeAttribute
    @LifeCycle(value = LifeCycleState.OBSOLETE, lifeCycleDescription = "This attribute is no longer used'")
    public String unsecureUserName;

    @EModelAttribute(description = "Unsecure password")
    @PrimaryTypeAttribute
    @LifeCycle(value = LifeCycleState.OBSOLETE, lifeCycleDescription = "This attribute is no longer used")
    public byte[] unsecurePassword;
}
