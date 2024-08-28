/*------------------------------------------------------------------------------
 *******************************************************************************
 * COPYRIGHT Ericsson 2023
 *
 * The copyright to the computer program(s) herein is the property of
 * Ericsson Inc. The programs may be used and/or copied only with written
 * permission from Ericsson Inc. or in accordance with the terms and
 * conditions stipulated in the agreement/contract under which the
 * program(s) have been supplied.
 *******************************************************************************
 *----------------------------------------------------------------------------*/
package com.ericsson.oss.services.ap.model.configuration;

import com.ericsson.oss.itpf.modeling.annotation.DefaultValue;
import com.ericsson.oss.itpf.modeling.annotation.EModel;
import com.ericsson.oss.itpf.modeling.annotation.configparam.ConfParamDefinition;
import com.ericsson.oss.itpf.modeling.annotation.configparam.ConfParamDefinitions;
import com.ericsson.oss.itpf.modeling.annotation.configparam.Scope;
import com.ericsson.oss.itpf.modeling.annotation.constraints.NotNull;

@EModel(namespace = "ap_ecim", description = "Pib parameter for duplicateIpAddress support in ENM")
@ConfParamDefinitions

/**
 * This class is used to specify the pib parameter for duplicate IP address change
 */
public class DuplicateIpAddressNotification {

        @NotNull
        @ConfParamDefinition(description = "Flag to enable or disable duplicate IP address support in ENM", scope = Scope.GLOBAL)
        @DefaultValue("FALSE")
        public boolean SET_TO_UNDEFINED_ON_DUPLICATE_IPADDRESS_NOTIFICATION;
    }
