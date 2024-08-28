/*------------------------------------------------------------------------------
 *******************************************************************************
 * COPYRIGHT Ericsson 2018
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

import com.ericsson.oss.itpf.datalayer.dps.modeling.annotation.CanBeRoot;
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
import com.ericsson.oss.services.model.ned.NeType200;

/**
 * Defines Node Definition model
 *
 * @deprecated Auto Provisioning does not use NodeDefinition
 */
@EModel(description = "AP Node Definition", namespace = "ap", name = "NodeDefinition", version = ApVersion.PROJECT_VERSION)
@PrimaryTypeDefinition
@Hierarchical(parentMoTypeUrn = "//ap/ConfigurationProfile/*", canBeRoot = CanBeRoot.FALSE)
@OnReadWrite(onRead = ReadBehavior.READ_FROM_PERSISTENT_STORAGE, onWrite = WriteBehavior.WRITE_TO_PERSISTENT_STORAGE_ONLY)
@LifeCycle(value = LifeCycleState.DEPRECATED, lifeCycleDescription = "NodeDefinition no longer used by Auto Provisioning")
@Deprecated
public class NodeDefinition implements Serializable {

    private static final long serialVersionUID = -3894929211287428935L;

    @EModelAttribute(description = "The id of the Node Definition MO", key = true, mandatory = true, immutable = true)
    @PrimaryTypeAttribute
    @NotNull
    public String id;

    @EModelAttribute(description = "The type of Node. e.g. RadioNode", mandatory = true, immutable = true)
    @PrimaryTypeAttribute
    @NotNull
    public NeType200 nodeType;

    @EModelAttribute(description = "The version of Node", mandatory = true)
    @PrimaryTypeAttribute
    @NotNull
    public String nodeVersion;
}
