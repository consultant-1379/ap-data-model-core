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

import com.ericsson.oss.itpf.modeling.annotation.EModel;
import com.ericsson.oss.itpf.modeling.annotation.EModelAttribute;
import com.ericsson.oss.itpf.modeling.annotation.cdt.CdtAttribute;
import com.ericsson.oss.itpf.modeling.annotation.cdt.CdtDefinition;

/**
 * Defines Version information associated with a Profile.
 */
@EModel(namespace = "ap", name = "Version", version = ApVersion.PROJECT_VERSION, description = "Version information associated with a profile")
@CdtDefinition
public class Version implements Serializable {

    private static final long serialVersionUID = -8510480988303435359L;

    @EModelAttribute(description = "The Product Number")
    @CdtAttribute
    public String productNumber;

    @EModelAttribute(description = "The Product Release")
    @CdtAttribute
    public String productRelease;
}