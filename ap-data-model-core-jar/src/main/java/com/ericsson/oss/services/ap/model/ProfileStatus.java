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

import java.io.Serializable;
import java.util.List;

import com.ericsson.oss.itpf.modeling.annotation.DefaultValue;
import com.ericsson.oss.itpf.modeling.annotation.EModel;
import com.ericsson.oss.itpf.modeling.annotation.EModelAttribute;
import com.ericsson.oss.itpf.modeling.annotation.cdt.CdtAttribute;
import com.ericsson.oss.itpf.modeling.annotation.cdt.CdtDefinition;

/**
 * Defines the Status of a Profile.
 */
@EModel(namespace = "ap", name = "ProfileStatus", version = ApVersion.PROJECT_VERSION, description = "The general status of a profile")
@CdtDefinition
public class ProfileStatus implements Serializable {

    private static final long serialVersionUID = -2169050408477447585L;

    @EModelAttribute(description = "Specifies if the profile is valid or not")
    @CdtAttribute
    @DefaultValue(value = "false")
    public boolean isValid;

    @EModelAttribute(description = "A List of status details for the profile")
    @CdtAttribute
    public transient List<String> profileDetails;
}