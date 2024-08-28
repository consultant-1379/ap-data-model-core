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
import com.ericsson.oss.itpf.modeling.annotation.EModelAttribute;
import com.ericsson.oss.itpf.modeling.annotation.cdt.CdtAttribute;
import com.ericsson.oss.itpf.modeling.annotation.cdt.CdtDefinition;

import java.io.Serializable;

/**
 * Defines the Auto Provisioning geographic node location attributes.
 */
@EModel(namespace = "ap", name = "NodeLocation", description = "Auto Provisioning geographic node location attributes", version = ApVersion.PROJECT_VERSION)
@CdtDefinition
public class NodeLocation implements Serializable {

    private static final long serialVersionUID = 1L;

    @CdtAttribute
    @EModelAttribute(description = "The latitude location of the node", mandatory = true)
    public String latitude;

    @CdtAttribute
    @EModelAttribute(description = "The longitude location of the node",  mandatory = true)
    public String longitude;

}