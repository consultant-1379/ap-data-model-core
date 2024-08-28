/*------------------------------------------------------------------------------
 *******************************************************************************
 * COPYRIGHT Ericsson 2013
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
 * Defines the NetworkElement types supported by Auto Provisioning.
 */
@EModel(namespace = "ap", name = "NodeType", version = ApVersion.PROJECT_VERSION, description = "AP Node Type")
@EdtDefinition
public enum NodeType {

    @EdtMember(value = 1, description = "ERbs Node Type")
    ERBS,

    @EdtMember(value = 2, description = "MSRBS_V1 Node Type")
    MSRBS_V1,

    @EdtMember(value = 3, description = "Radio Node Type")
    RadioNode,

    @EdtMember(value = 6, description = "vPP Node Type")
    vPP,

    @EdtMember(value = 8, description = "vSD Node Type")
    vSD,

    @EdtMember(value = 11, description = "Router6672 Node Type")
    Router6672,

    @EdtMember(value = 12, description = "Router6675 Node Type")
    Router6675,

    @EdtMember(value = 13, description = "vRM Node Type")
    vRM,

    @EdtMember(value = 14, description = "Router6x71 Node Type")
    Router6x71,

    @EdtMember(value = 15,description ="vRSM Node Type")
    vRSM,

    @EdtMember(value = 16, description ="vTIF Node Type")
    vTIF, //NOSONAR

    @EdtMember(value = 17, description ="Controller6610 Node Type")
    Controller6610, //NOSONAR

    @EdtMember(value = 18, description = "Router6673 Node Type")
    Router6673,

    @EdtMember(value = 19, description = "Fronthaul6000 Node Type")
    FRONTHAUL6000,

    @EdtMember(value = 20, description = "Router6676 or Router6000-2 Node Type")
    Router60002,

    @EdtMember(value = 21, description = "Shared-CNF Node Type")
    SharedCNF
}