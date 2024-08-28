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

import java.io.Serializable;

import com.ericsson.oss.itpf.datalayer.dps.modeling.annotation.CanBeRoot;
import com.ericsson.oss.itpf.datalayer.dps.modeling.annotation.Hierarchical;
import com.ericsson.oss.itpf.datalayer.dps.modeling.annotation.OnReadWrite;
import com.ericsson.oss.itpf.datalayer.dps.modeling.annotation.PrimaryTypeAttribute;
import com.ericsson.oss.itpf.datalayer.dps.modeling.annotation.PrimaryTypeDefinition;
import com.ericsson.oss.itpf.datalayer.dps.modeling.annotation.WriteBehavior;
import com.ericsson.oss.itpf.modeling.annotation.EModel;
import com.ericsson.oss.itpf.modeling.annotation.EModelAttribute;
import com.ericsson.oss.itpf.modeling.annotation.constraints.NotNull;

/**
 * Defines Auto Provisioning Accounts.
 */
@EModel(namespace = "ap", description = "Auto Provisioning Accounts", name = "AutoProvisioningAccounts", version = ApVersion.ACCOUNTS_VERSION)
@PrimaryTypeDefinition()
@Hierarchical(canBeRoot = CanBeRoot.TRUE, parentMoTypeUrn = "")
@OnReadWrite(onWrite = WriteBehavior.WRITE_TO_PERSISTENT_STORAGE_ONLY)
public class AutoProvisioningAccounts implements Serializable {

    private static final long serialVersionUID = 1L;

    @PrimaryTypeAttribute
    @EModelAttribute(description = "The ID of the AutoProvisioningAccounts MO", key = true, immutable = true, mandatory = true)
    @NotNull
    public String AutoProvisioningAccountsId;

}
