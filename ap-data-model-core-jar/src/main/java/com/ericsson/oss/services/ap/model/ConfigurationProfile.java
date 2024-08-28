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
import com.ericsson.oss.itpf.modeling.annotation.DefaultValue;
import com.ericsson.oss.itpf.modeling.annotation.EModel;
import com.ericsson.oss.itpf.modeling.annotation.EModelAttribute;
import com.ericsson.oss.itpf.modeling.annotation.LifeCycle;
import com.ericsson.oss.itpf.modeling.annotation.LifeCycleState;
import com.ericsson.oss.itpf.modeling.annotation.constraints.NotNull;

/**
 * Defines a profile in an Auto Provisioning project.
 */
@EModel(namespace = "ap", description = "Auto Provisioning Configuration Profile", name = "ConfigurationProfile", version = ApVersion.PROJECT_VERSION)
@PrimaryTypeDefinition()
@Hierarchical(parentMoTypeUrn = "//ap/Project/*", canBeRoot = CanBeRoot.FALSE)
@OnReadWrite(onRead = ReadBehavior.READ_FROM_PERSISTENT_STORAGE, onWrite = WriteBehavior.WRITE_TO_PERSISTENT_STORAGE_ONLY)
public class ConfigurationProfile implements Serializable {

    private static final long serialVersionUID = -1075723300782151569L;

    @PrimaryTypeAttribute
    @EModelAttribute(description = "The id of the profile", key = true, mandatory = true, immutable = true)
    @NotNull
    public String profileId;

    @PrimaryTypeAttribute
    @EModelAttribute(description = "Node release", mandatory = false)
    @NotNull
    @LifeCycle(value = LifeCycleState.OBSOLETE, lifeCycleDescription = "This attribute is not used in AP")
    public String nodeRelease;

    @PrimaryTypeAttribute
    @EModelAttribute(description = "Version information for profile")
    public Version version;

    @PrimaryTypeAttribute
    @EModelAttribute(description = "The profile properties", mandatory = false)
    public String properties;

    @PrimaryTypeAttribute
    @EModelAttribute(description = "The location of the profile graphic", mandatory = false)
    public String graphicLocation;

    @PrimaryTypeAttribute
    @EModelAttribute(description = "The location of profile content", mandatory = false)
    public String profileContentLocation;

    @PrimaryTypeAttribute
    @EModelAttribute(description = "Data related to profile CIQ", mandatory = false)
    public CIQ ciq;

    @PrimaryTypeAttribute
    @EModelAttribute(description = "Status information for profile", mandatory = false)
    public ProfileStatus profileStatus;

    @PrimaryTypeAttribute
    @EModelAttribute(description = "The ossModelIdentity of the profile", mandatory = false)
    public String ossModelIdentity;

    @PrimaryTypeAttribute
    @EModelAttribute(description = "The upgradePackage name of the profile", mandatory = false)
    public String upgradePackageName;

    @PrimaryTypeAttribute
    @EModelAttribute(description = "The type of the profile", mandatory = false)
    @LifeCycle(value = LifeCycleState.OBSOLETE, lifeCycleDescription = "This attribute has been replaced by 'dataType'")
    public ProfileType profileType;

    @PrimaryTypeAttribute
    @EModelAttribute(description = "The type of the profile", mandatory = false)
    @DefaultValue(value = "INTEGRATION")
    public DataType dataType;

    @PrimaryTypeAttribute
    @EModelAttribute(description = "The general status of dumping the node configuration snapshot for REST query", mandatory = false)
    @DefaultValue(value = "NOT_STARTED")
    public ConfigSnapshotStatus configSnapshotStatus;

    @PrimaryTypeAttribute
    @EModelAttribute(description = "The timestamp of triggering node configuration snapshot dumping", mandatory = false)
    @DefaultValue(value = "0")
    public Long dumpTimeStamp;

    @PrimaryTypeAttribute
    @EModelAttribute(description = "The location of the profile filter", mandatory = false)
    public String filterLocation;
}