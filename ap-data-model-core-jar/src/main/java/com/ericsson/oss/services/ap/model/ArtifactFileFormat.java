/*------------------------------------------------------------------------------
 *******************************************************************************
 * COPYRIGHT Ericsson 2020
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
 * The Enum class that represents the artifact file formats.
 */
@EModel(namespace = "ap", name = "ArtifactFileFormat", version = ApVersion.PROJECT_VERSION, description = "Artifact File Format")
@EdtDefinition
public enum ArtifactFileFormat {

    @EdtMember(value = 0, description = "Unknown")
    UNKNOWN,
    @EdtMember(value = 1, description = "BULK_3GPP")
    BULK_3GPP,
    @EdtMember(value = 2, description = "NETCONF")
    NETCONF,
    @EdtMember(value = 3, description = "AMOS_SCRIPT")
    AMOS_SCRIPT,
    @EdtMember(value = 4, description = "JSON")
    JSON;
}
