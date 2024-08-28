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
import com.ericsson.oss.itpf.modeling.annotation.DefaultValue;
import com.ericsson.oss.itpf.modeling.annotation.EModel;
import com.ericsson.oss.itpf.modeling.annotation.EModelAttribute;
import com.ericsson.oss.itpf.modeling.annotation.constraints.NotNull;

/**
 * Class container for all NodeArtifacts.
 */
@EModel(namespace = "ap", description = "Auto Provisioning Node Artifact Container", name = "NodeArtifactContainer", version = ApVersion.PROJECT_VERSION)
@PrimaryTypeDefinition()
@Hierarchical(parentMoTypeUrn = "//ap/Node/*")
@OnReadWrite(onRead = ReadBehavior.READ_FROM_PERSISTENT_STORAGE, onWrite = WriteBehavior.WRITE_TO_PERSISTENT_STORAGE_ONLY)
public class NodeArtifactContainer implements Serializable {

    private static final long serialVersionUID = 2856311149101762792L;

    @PrimaryTypeAttribute
    @EModelAttribute(description = "The ID of the NodeArtifactContainer MO", key = true, immutable = true, mandatory = true)
    @NotNull
    public String NodeArtifactContainerId;

    @PrimaryTypeAttribute
    @EModelAttribute(description = "Indicates if the reconfiguration workflow config files may be suspended")
    @DefaultValue(value = "true")
    public boolean suspend;

    @PrimaryTypeAttribute
    @EModelAttribute(description = "Indicates if the configuration files should be applied in strict sequence as described by the user")
    @DefaultValue(value = "false")
    public boolean strict;
}
