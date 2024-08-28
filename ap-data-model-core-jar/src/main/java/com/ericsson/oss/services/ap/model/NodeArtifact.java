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

/**
 * Class for NodeArtifact MOs.
 */
@EModel(namespace = "ap", description = "Auto Provisioning Node Artifact", name = "NodeArtifact", version = ApVersion.PROJECT_VERSION)
@PrimaryTypeDefinition
@Hierarchical(parentMoTypeUrn = "//ap/NodeArtifactContainer/*")
@OnReadWrite(onRead = ReadBehavior.READ_FROM_PERSISTENT_STORAGE, onWrite = WriteBehavior.WRITE_TO_PERSISTENT_STORAGE_ONLY)
public class NodeArtifact implements Serializable {

    private static final long serialVersionUID = -746722946041839701L;

    @PrimaryTypeAttribute
    @EModelAttribute(description = "The ID of the NodeArtifact MO", key = true, immutable = true, mandatory = true)
    @NotNull
    public String NodeArtifactId;

    @EModelAttribute(description = "The name of the artifact")
    @PrimaryTypeAttribute
    @NotNull
    public String name;

    @EModelAttribute(description = "The description of the artifact")
    @PrimaryTypeAttribute
    public String description;

    @EModelAttribute(description = "The location of the raw artifact (supplied as part of the AP project)")
    @PrimaryTypeAttribute
    public String rawLocation;

    @EModelAttribute(description = "The location of the generated artifact (generated during the order phase)")
    @PrimaryTypeAttribute
    public String generatedLocation;

    @EModelAttribute(description = "Indicates if the artifact may be exported")
    @PrimaryTypeAttribute
    @DefaultValue(value = "false")
    public boolean exportable;

    @EModelAttribute(description = "Indicates if the artifact is encryted")
    @PrimaryTypeAttribute
    @DefaultValue(value = "false")
    public boolean encrypted;

    @EModelAttribute(description = "The type of the artifact")
    @PrimaryTypeAttribute
    @NotNull
    public String type;

    @EModelAttribute(description = "The import progress of the artifact")
    @PrimaryTypeAttribute
    @DefaultValue(value = "NOT_STARTED")
    public ArtifactImportProgress importProgress;

    @EModelAttribute(description = "The import error message of the artifact")
    @PrimaryTypeAttribute
    public transient List<String> importErrorMessage;

    @EModelAttribute(description = "The configuration node name that the artifact applied to")
    @PrimaryTypeAttribute
    public String configurationNodeName;

    @EModelAttribute(description = "The file format of the artifact")
    @PrimaryTypeAttribute
    @DefaultValue(value = "UNKNOWN")
    public ArtifactFileFormat fileFormat;

    @EModelAttribute(description = "Indicates if the import errors in this artifact is ignored")
    @PrimaryTypeAttribute
    @DefaultValue(value = "false")
    public boolean ignoreError;
}
