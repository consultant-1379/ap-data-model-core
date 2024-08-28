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
 * Defines a CIQ associated with a Profile.
 */
@EModel(namespace = "ap", name = "CIQ", version = ApVersion.PROJECT_VERSION, description = "Stores the CIQ data of a Profile")
@CdtDefinition
public class CIQ implements Serializable {

    private static final long serialVersionUID = -2169050408477447585L;

    @EModelAttribute(description = "The CIQ location")
    @CdtAttribute
    public String ciqLocation;

}