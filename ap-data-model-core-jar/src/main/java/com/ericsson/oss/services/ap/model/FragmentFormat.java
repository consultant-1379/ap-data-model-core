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

import com.ericsson.oss.itpf.modeling.annotation.EModel;
import com.ericsson.oss.itpf.modeling.annotation.LifeCycle;
import com.ericsson.oss.itpf.modeling.annotation.LifeCycleState;
import com.ericsson.oss.itpf.modeling.annotation.edt.EdtDefinition;
import com.ericsson.oss.itpf.modeling.annotation.edt.EdtMember;

/**
 * Defines the NetworkElement types supported by Auto Provisioning.
 *
 * @deprecated Auto Provisioning does not use FragmentFormat
 */
@EModel(namespace = "ap", name = " FragmentFormat ", version = "1.0.0", description = "AP Fragment Format")
@EdtDefinition
@LifeCycle(value = LifeCycleState.DEPRECATED, lifeCycleDescription = "FragmentFormat not used by Auto Provisioning")
@Deprecated
public enum FragmentFormat {
    @EdtMember(value = 1, description = "File format")
    FILE
}
