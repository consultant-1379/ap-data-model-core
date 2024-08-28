/*------------------------------------------------------------------------------
 *******************************************************************************
 * COPYRIGHT Ericsson 2022
 *
 * The copyright to the computer program(s) herein is the property of
 * Ericsson Inc. The programs may be used and/or copied only with written
 * permission from Ericsson Inc. or in accordance with the terms and
 * conditions stipulated in the agreement/contract under which the
 * program(s) have been supplied.
 *******************************************************************************
 *----------------------------------------------------------------------------*/
package com.ericsson.oss.services.ap.model;

import com.ericsson.oss.itpf.modeling.annotation.EModel;
import com.ericsson.oss.itpf.modeling.annotation.edt.EdtDefinition;
import com.ericsson.oss.itpf.modeling.annotation.edt.EdtMember;

/**
 * Defines the Status of the node configutaton snapshot generation.
 */
@EModel(namespace = "ap", name = "ConfigSnapshotStatus", version = ApVersion.PROJECT_VERSION, description = "The general status of dumping the node configuration snapshot for REST query")
@EdtDefinition
public enum ConfigSnapshotStatus {

    @EdtMember(value = 1, description = "Not Started")
    NOT_STARTED,

    @EdtMember(value = 2, description = "In Progress")
    IN_PROGRESS,

    @EdtMember(value = 3, description = "Completed")
    COMPLETED,

    @EdtMember(value = 4, description = "Failed")
    FAILED
}