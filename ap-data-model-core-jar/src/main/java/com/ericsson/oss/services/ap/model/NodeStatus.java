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
import java.util.List;

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

@EModel(namespace = "ap", description = "The general status of a node", name = "NodeStatus", version = ApVersion.PROJECT_VERSION)
@PrimaryTypeDefinition()
@Hierarchical(parentMoTypeUrn = "//ap/Node/*")
@OnReadWrite(onRead = ReadBehavior.READ_FROM_PERSISTENT_STORAGE, onWrite = WriteBehavior.WRITE_TO_PERSISTENT_STORAGE_ONLY)
public class NodeStatus implements Serializable {

    private static final long serialVersionUID = -2169050408477447585L;

    @PrimaryTypeAttribute
    @EModelAttribute(description = "The ID of the mo.", key = true, immutable = true, mandatory = true)
    @NotNull
    public String NodeStatusId;

    @EModelAttribute(description = "The Node State")
    @PrimaryTypeAttribute
    @DefaultValue(value = "READY_FOR_ORDER")
    public State state;

    @EModelAttribute(description = "A List of status entries for a node")
    @PrimaryTypeAttribute
    public transient List<String> statusEntries;

    @EModelAttribute(description = "The date a node transitioned to an end state")
    @PrimaryTypeAttribute
    public String endStateDate;

}
