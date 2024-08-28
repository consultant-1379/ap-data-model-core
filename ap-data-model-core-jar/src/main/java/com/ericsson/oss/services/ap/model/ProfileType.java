/*------------------------------------------------------------------------------
 *******************************************************************************
 * COPYRIGHT Ericsson 2021
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
 * Defines the ProfileTypes supported by Auto Provisioning.
 */

@EModel(namespace = "ap", name = "ProfileType", version = ApVersion.PROJECT_VERSION, description = "AP Profile Type")
@EdtDefinition
@Deprecated
public enum ProfileType {
    @EdtMember(value = 1, description = "Integration Profile")
    INTEGRATION,

    @EdtMember(value = 2, description = "Expansion Profile")
    EXPANSION
}