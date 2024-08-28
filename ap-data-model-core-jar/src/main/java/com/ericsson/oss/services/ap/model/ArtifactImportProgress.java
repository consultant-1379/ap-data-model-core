/*------------------------------------------------------------------------------
 *******************************************************************************
 * COPYRIGHT Ericsson 2019
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

@EModel(namespace = "ap", name = "ArtifactImportProgress", version = ApVersion.PROJECT_VERSION, description = "Artifact Import Progress")
@EdtDefinition
public enum ArtifactImportProgress {

    @EdtMember(value = 0, description = "Not Started")
    NOT_STARTED,
    @EdtMember(value = 1, description = "In Progress")
    IN_PROGRESS,
    @EdtMember(value = 2, description = "Completed")
    COMPLETED,
    @EdtMember(value = 3, description = "Failed")
    FAILED,
    @EdtMember(value = 4, description = "Skipped")
    SKIPPED;
}
