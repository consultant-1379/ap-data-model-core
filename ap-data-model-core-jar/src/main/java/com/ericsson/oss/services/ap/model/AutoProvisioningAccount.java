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

import com.ericsson.oss.itpf.datalayer.dps.modeling.annotation.Hierarchical;
import com.ericsson.oss.itpf.datalayer.dps.modeling.annotation.OnReadWrite;
import com.ericsson.oss.itpf.datalayer.dps.modeling.annotation.PrimaryTypeAttribute;
import com.ericsson.oss.itpf.datalayer.dps.modeling.annotation.PrimaryTypeDefinition;
import com.ericsson.oss.itpf.datalayer.dps.modeling.annotation.WriteBehavior;
import com.ericsson.oss.itpf.modeling.annotation.EModel;
import com.ericsson.oss.itpf.modeling.annotation.EModelAttribute;
import com.ericsson.oss.itpf.modeling.annotation.constraints.NotNull;

/**
 * Defines an Auto Provisioning Account.
 */
@EModel(namespace = "ap", description = "Auto Provisioning Account", name = "AutoProvisioningAccount", version = ApVersion.ACCOUNTS_VERSION)
@PrimaryTypeDefinition()
@Hierarchical(parentMoTypeUrn = "//ap/AutoProvisioningAccounts/*")
@OnReadWrite(onWrite = WriteBehavior.WRITE_TO_PERSISTENT_STORAGE_ONLY)
public class AutoProvisioningAccount implements Serializable {

    private static final long serialVersionUID = 1L;

    @PrimaryTypeAttribute
    @EModelAttribute(description = "The ID of the AutoProvisioningAccount MO", key = true, immutable = true, mandatory = true)
    @NotNull
    public String AutoProvisioningAccountId;

    @EModelAttribute(description = "Node Type. E.g. MSRBS_V1", mandatory = false, immutable = true)
    @PrimaryTypeAttribute
    @NotNull
    public NodeType nodeType;

    @EModelAttribute(description = "AP Account Type. E.g. LDAP", mandatory = true, immutable = true)
    @PrimaryTypeAttribute
    @NotNull
    public AccountType accountType;

    @EModelAttribute(description = "The User Name of the AP Account", mandatory = true, immutable = true)
    @PrimaryTypeAttribute
    @NotNull
    public String userName;

    @EModelAttribute(description = "The Password for the AP Account", mandatory = true, immutable = false)
    @PrimaryTypeAttribute
    @NotNull
    public String password;

    @EModelAttribute(description = "Node Name", mandatory = true, immutable = true)
    @PrimaryTypeAttribute
    @NotNull
    public String nodeName;
}
