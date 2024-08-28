/*------------------------------------------------------------------------------
 *******************************************************************************
 * COPYRIGHT Ericsson 2016
 *
 * The copyright to the computer program(s) herein is the property of
 * Ericsson Inc. The programs may be used and/or copied only with written
 * permission from Ericsson Inc. or in accordance with the terms and
 * conditions stipulated in the agreement/contract under which the
 * program(s) have been supplied.
 *******************************************************************************
 *----------------------------------------------------------------------------*/
package com.ericsson.oss.services.ap.model;

/**
 * Defines Auto Provisioning Account Types.
 *
 */
import com.ericsson.oss.itpf.modeling.annotation.EModel;
import com.ericsson.oss.itpf.modeling.annotation.edt.EdtDefinition;
import com.ericsson.oss.itpf.modeling.annotation.edt.EdtMember;

@EModel(namespace = "ap", name = "AccountType", version = ApVersion.ACCOUNTS_VERSION, description = "AP Account Type")
@EdtDefinition
public enum AccountType {

    @EdtMember(value = 1, description = "LDAP Account Type")
    LDAP
}