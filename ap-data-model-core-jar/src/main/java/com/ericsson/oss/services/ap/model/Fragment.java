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
import com.ericsson.oss.itpf.datalayer.dps.modeling.annotation.PrimaryTypeChangeEventBehavior;
import com.ericsson.oss.itpf.datalayer.dps.modeling.annotation.PrimaryTypeChangeEventHandling;
import com.ericsson.oss.itpf.datalayer.dps.modeling.annotation.PrimaryTypeDefinition;
import com.ericsson.oss.itpf.datalayer.dps.modeling.annotation.ReadBehavior;
import com.ericsson.oss.itpf.datalayer.dps.modeling.annotation.WriteBehavior;
import com.ericsson.oss.itpf.modeling.annotation.EModel;
import com.ericsson.oss.itpf.modeling.annotation.EModelAttribute;
import com.ericsson.oss.itpf.modeling.annotation.LifeCycle;
import com.ericsson.oss.itpf.modeling.annotation.LifeCycleState;
import com.ericsson.oss.itpf.modeling.annotation.constraints.NotNull;

/**
 * Defines Configuration Fragment model
 *
 * @deprecated Auto Provisioning does not use Fragment
 */
@EModel(description = "AP Configuration Fragment", namespace = "ap", name = "Fragment", version = ApVersion.PROJECT_VERSION)
@PrimaryTypeDefinition
@Hierarchical(parentMoTypeUrn = "//ap/NodeDefinition/*", canBeRoot = CanBeRoot.FALSE)
@OnReadWrite(onRead = ReadBehavior.READ_FROM_PERSISTENT_STORAGE, onWrite = WriteBehavior.WRITE_TO_PERSISTENT_STORAGE_ONLY)
@PrimaryTypeChangeEventHandling(onDeletePo = { PrimaryTypeChangeEventBehavior.NAMES,
        PrimaryTypeChangeEventBehavior.VALUES }, channelUrn = "//global/FragmentNotificationChannel")
@LifeCycle(value = LifeCycleState.DEPRECATED, lifeCycleDescription = "Fragment not used by Auto Provisioning")
@Deprecated
public class Fragment implements Serializable {

    private static final long serialVersionUID = -7514162564111413218L;

    @EModelAttribute(description = "The id of the Fragment MO", key = true, mandatory = true, immutable = true)
    @PrimaryTypeAttribute
    @NotNull
    public String id;

    @EModelAttribute(description = "The name of configuration fragment", mandatory = true)
    @PrimaryTypeAttribute
    @NotNull
    public String name;

    @EModelAttribute(description = "The storage format of the Fragment (e.g. File or ConfigurationTemplate)", immutable = true, mandatory = true)
    @PrimaryTypeAttribute
    @NotNull
    public FragmentFormat fragmentFormat;

    @EModelAttribute(description = "The type of configuration fragment e.g. Equipment", mandatory = true, immutable = true)
    @PrimaryTypeAttribute
    @NotNull
    public String type;
}
