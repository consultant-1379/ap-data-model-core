/*------------------------------------------------------------------------------
 *******************************************************************************
 * COPYRIGHT Ericsson 2014
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

@EModel(namespace = "ap", name = "State", version = ApVersion.PROJECT_VERSION, description = "Node Integration State")
@EdtDefinition
public enum State {

    @EdtMember(value = 0, description = "Unknown")
    UNKNOWN,
    @EdtMember(value = 3, description = "Ready For Order")
    READY_FOR_ORDER,
    @EdtMember(value = 4, description = "Order Started")
    ORDER_STARTED,
    @EdtMember(value = 5, description = "Order Failed")
    ORDER_FAILED,
    @EdtMember(value = 6, description = "Order Completed")
    ORDER_COMPLETED,
    @EdtMember(value = 7, description = "Rollback failed after order failure")
    ORDER_ROLLBACK_FAILED,
    @EdtMember(value = 8, description = "Order Cancelled")
    ORDER_CANCELLED,
    @EdtMember(value = 11, description = "Delete Started")
    DELETE_STARTED,
    @EdtMember(value = 12, description = "Delete Failed")
    DELETE_FAILED,
    @EdtMember(value = 13, description = "Bind Started")
    BIND_STARTED,
    @EdtMember(value = 14, description = "Bind Failed")
    BIND_FAILED,
    @EdtMember(value = 15, description = "Bind Completed")
    BIND_COMPLETED,
    @EdtMember(value = 18, description = "Integration Started")
    INTEGRATION_STARTED,
    @EdtMember(value = 19, description = "Integration Failed")
    INTEGRATION_FAILED,
    @EdtMember(value = 20, description = "Integration Completed")
    INTEGRATION_COMPLETED,
    @EdtMember(value = 21, description = "Integration Completed with Warning")
    INTEGRATION_COMPLETED_WITH_WARNING,
    @EdtMember(value = 22, description = "Invalid Configuration")
    INVALID_CONFIGURATION,
    @EdtMember(value = 23, description = "Integration Cancelled")
    INTEGRATION_CANCELLED,
    @EdtMember(value = 24, description = "Hardware Replace Started")
    HARDWARE_REPLACE_STARTED,
    @EdtMember(value = 25, description = "Hardware Replace Failed")
    HARDWARE_REPLACE_FAILED,
    @EdtMember(value = 26, description = "Hardware Replace Rollback Failed")
    HARDWARE_REPLACE_ROLLBACK_FAILED,
    @EdtMember(value = 27, description = "Hardware Replace Completed")
    HARDWARE_REPLACE_COMPLETED,
    @EdtMember(value = 28, description = "Hardware Replace Bind Completed")
    HARDWARE_REPLACE_BIND_COMPLETED,
    @EdtMember(value = 29, description = "Reconfiguration Started")
    RECONFIGURATION_STARTED,
    @EdtMember(value = 30, description = "Reconfiguration Completed")
    RECONFIGURATION_COMPLETED,
    @EdtMember(value = 32, description = "Reconfiguration Cancelled")
    RECONFIGURATION_CANCELLED,
    @EdtMember(value = 33, description = "Reconfiguration Failed")
    RECONFIGURATION_FAILED,
    @EdtMember(value = 34, description = "Ready For Reconfiguration")
    READY_FOR_RECONFIGURATION,
    @EdtMember(value = 35, description = "Reconfiguration Suspended")
    RECONFIGURATION_SUSPENDED,
    @EdtMember(value = 36, description = "Expansion Started")
    EXPANSION_STARTED,
    @EdtMember(value = 37, description = "Expansion Completed")
    EXPANSION_COMPLETED,
    @EdtMember(value = 38, description = "Expansion Cancelled")
    EXPANSION_CANCELLED,
    @EdtMember(value = 39, description = "Expansion Failed")
    EXPANSION_FAILED,
    @EdtMember(value = 40, description = "Ready For Expansion")
    READY_FOR_EXPANSION,
    @EdtMember(value = 41, description = "Expansion Suspended")
    EXPANSION_SUSPENDED,
    @EdtMember(value = 42, description = "Order Suspended")
    ORDER_SUSPENDED,
    @EdtMember(value = 43, description = "Integration Suspended")
    INTEGRATION_SUSPENDED,
    @EdtMember(value = 44, description = "Hardware Replace Suspended")
    HARDWARE_REPLACE_SUSPENDED,
    @EdtMember(value = 45, description = "Ready For Hardware Replace")
    READY_FOR_HARDWARE_REPLACE,
    @EdtMember(value = 46, description = "Ready For Pre-Migration")
    READY_FOR_PRE_MIGRATION,
    @EdtMember(value = 47, description = "Pre Migration Started")
    PRE_MIGRATION_STARTED,
    @EdtMember(value = 48, description = "Pre Migration Failed")
    PRE_MIGRATION_FAILED,
    @EdtMember(value = 49, description = "Pre Migration Suspended")
    PRE_MIGRATION_SUSPENDED,
    @EdtMember(value = 50, description = "Pre Migration Cancelled")
    PRE_MIGRATION_CANCELLED,
    @EdtMember(value = 51, description = "Pre Migration Completed")
    PRE_MIGRATION_COMPLETED,
    @EdtMember(value = 52, description = "Migration Started")
    MIGRATION_STARTED,
    @EdtMember(value = 53, description = "Migration Suspended")
    MIGRATION_SUSPENDED,
    @EdtMember(value = 54, description = "Migration Cancelled")
    MIGRATION_CANCELLED,
    @EdtMember(value = 55, description = "Migration Completed")
    MIGRATION_COMPLETED,
    @EdtMember(value = 56, description = "Migration Completed with warning")
    MIGRATION_COMPLETED_WITH_WARNING,
    @EdtMember(value = 57, description = "Migration Failed")
    MIGRATION_FAILED,
    @EdtMember(value = 58, description = "Pre Migration Bind Started")
    PRE_MIGRATION_BIND_STARTED,
    @EdtMember(value = 59, description = "Pre Migration Bind Completed")
    PRE_MIGRATION_BIND_COMPLETED,
    @EdtMember(value = 60, description = "Integration Import Configuration Suspended")
    INTEGRATION_IMPORT_CONFIGURATION_SUSPENDED,
    @EdtMember(value = 61, description = "Expansion Import Configuration Suspended")
    EXPANSION_IMPORT_CONFIGURATION_SUSPENDED,
    @EdtMember(value = 62, description = "Pre Migration Import Configuration Suspended")
    PRE_MIGRATION_IMPORT_CONFIGURATION_SUSPENDED,
    @EdtMember(value = 63, description = "Migration Import Configuration Suspended")
    MIGRATION_IMPORT_CONFIGURATION_SUSPENDED,
    @EdtMember(value = 64, description = "Ready for EOI Integration")
    READY_FOR_EOI_INTEGRATION,
    @EdtMember(value = 65, description = "Eoi Integration Started")
    EOI_INTEGRATION_STARTED,
    @EdtMember(value = 66, description = "Eoi Integration Failed")
    EOI_INTEGRATION_FAILED,
    @EdtMember(value = 67, description = "Eoi Integration Completed")
    EOI_INTEGRATION_COMPLETED,
    @EdtMember(value = 68, description = "Eoi Integration Rollback Failed")
    EOI_INTEGRATION_ROLLBACK_FAILED;
}
