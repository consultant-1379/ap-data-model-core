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

import java.io.Serializable;
import java.util.List;

import com.ericsson.oss.itpf.datalayer.dps.modeling.annotation.Hierarchical;
import com.ericsson.oss.itpf.datalayer.dps.modeling.annotation.OnReadWrite;
import com.ericsson.oss.itpf.datalayer.dps.modeling.annotation.PrimaryTypeAction;
import com.ericsson.oss.itpf.datalayer.dps.modeling.annotation.PrimaryTypeActionParameter;
import com.ericsson.oss.itpf.datalayer.dps.modeling.annotation.PrimaryTypeAttribute;
import com.ericsson.oss.itpf.datalayer.dps.modeling.annotation.PrimaryTypeDefinition;
import com.ericsson.oss.itpf.datalayer.dps.modeling.annotation.WriteBehavior;
import com.ericsson.oss.itpf.modeling.annotation.DefaultValue;
import com.ericsson.oss.itpf.modeling.annotation.EModel;
import com.ericsson.oss.itpf.modeling.annotation.EModelAttribute;
import com.ericsson.oss.itpf.modeling.annotation.IpAddress;
import com.ericsson.oss.itpf.modeling.annotation.LifeCycle;
import com.ericsson.oss.itpf.modeling.annotation.LifeCycleState;
import com.ericsson.oss.itpf.modeling.annotation.constraints.NotNull;

/**
 * Defines a node in an Auto Provisioning project.
 */
@EModel(namespace = "ap", description = "Auto Provisioning Node", name = "Node", version = ApVersion.PROJECT_VERSION)
@PrimaryTypeDefinition()
@Hierarchical(parentMoTypeUrn = "//ap/Project/*")
@OnReadWrite(onWrite = WriteBehavior.WRITE_TO_PERSISTENT_STORAGE_ONLY)
public class Node implements Serializable {

    private static final long serialVersionUID = 1L;
    @PrimaryTypeAttribute
    @EModelAttribute(description = "The ID of the Node MO, typically the name of the AP node", key = true, immutable = true, mandatory = true)
    @NotNull
    public String NodeId;

    @EModelAttribute(description = "Node's MIM Version")
    @PrimaryTypeAttribute
    @NotNull
    @LifeCycle(value = LifeCycleState.OBSOLETE, lifeCycleDescription = "This attribute has been replaced by 'nodeIdentifier'")
    public String mimVersion;

    @EModelAttribute(description = "Node's Identifier", mandatory = true)
    @PrimaryTypeAttribute
    @NotNull
    public String nodeIdentifier;

    @EModelAttribute(description = "Node's IP Address", mandatory = true)
    @PrimaryTypeAttribute
    @IpAddress
    public String ipAddress;

    @EModelAttribute(description = "Node type. E.g. ERBS", mandatory = true, immutable = true)
    @PrimaryTypeAttribute
    public NodeType nodeType;

    @EModelAttribute(description = "The geographic location of the node", mandatory = false)
    @PrimaryTypeAttribute
    public NodeLocation nodeLocation;

    @EModelAttribute(description = "An optional user defined label", mandatory = false)
    @PrimaryTypeAttribute
    public String userLabel;

    @EModelAttribute(description = "The SNMP user for the node", mandatory = true)
    @PrimaryTypeAttribute
    @DefaultValue(value = "UNDEFINED")
    public String snmpUser;

    @EModelAttribute(description = "The OSS prefix for the node", mandatory = false)
    @PrimaryTypeAttribute
    public String ossPrefix;

    @EModelAttribute(description = "The Work Order ID for the node", mandatory = false)
    @PrimaryTypeAttribute
    public String workOrderId;

    @EModelAttribute(description = "The Hardware Serial Number that binds a node to hardware for integration without laptop", mandatory = false)
    @PrimaryTypeAttribute
    public String hardwareSerialNumber;

    @EModelAttribute(description = "The ID of the BPMN workflow instance")
    @PrimaryTypeAttribute
    @LifeCycle(value = LifeCycleState.OBSOLETE, lifeCycleDescription = "This attribute has been replaced by 'workflowInstanceIdList'")
    public String workflowInstanceId;

    @EModelAttribute(description = "A list of the BPMN workflow instance IDs for a node")
    @PrimaryTypeAttribute
    public transient List<String> workflowInstanceIdList;

    @EModelAttribute(description = "The ID of the active BPMN workflow instance")
    @PrimaryTypeAttribute
    public String activeWorkflowInstanceId;

    @EModelAttribute(description = "Node's Site")
    @PrimaryTypeAttribute
    @LifeCycle(value = LifeCycleState.OBSOLETE, lifeCycleDescription = "This attribute is not used in AP")
    public String site;

    @EModelAttribute(description = "Specifies if the node is a hardware replace node")
    @PrimaryTypeAttribute
    @DefaultValue(value = "false")
    public boolean isHardwareReplaceNode;

    @EModelAttribute(description = "Specifies operation is a node migration")
    @PrimaryTypeAttribute
    @DefaultValue(value = "false")
    public boolean isNodeMigration;

    @EModelAttribute(description = "Specifies if rollback request is received")
    @PrimaryTypeAttribute
    @DefaultValue(value = "false")
    public boolean isRollback;

    @EModelAttribute(description = "Specifies the message waiting for during migration")
    @PrimaryTypeAttribute
    public String waitingForMessage;

    @EModelAttribute(description = "Specifies the backup name for hardware replace node", mandatory = false)
    @PrimaryTypeAttribute
    public String backupName;

    @EModelAttribute(description = "Specifies if it is reconfiguration of existing node")
    @PrimaryTypeAttribute
    @DefaultValue(value = "false")
    public boolean isReconfiguration;

    @EModelAttribute(description = "Specifies the deployment grouping the node is added to", mandatory = false)
    @PrimaryTypeAttribute
    public String deployment;

    @EModelAttribute(description = "The timeZone region in which the Managed Element resides", mandatory = false)
    @PrimaryTypeAttribute
    public String timeZone;

    @EModelAttribute(description = "The cnfType for SharedCnf Node", mandatory = false)
    @PrimaryTypeAttribute
    public String cnfType;

    @PrimaryTypeAction(description = "The actions causes the node up flow to be invoked")
    public void initializeNodeIntegration(@PrimaryTypeActionParameter(description = "Name of the node", name = "nodeName") final String nodeName,
        @PrimaryTypeActionParameter(description = "Security Checksum if needed", name = "checksum") final String checksum,
        @PrimaryTypeActionParameter(description = "ipAddress of the node", name = "ipAddress") final String ipAddress) {
        // No need for implementation, the MO action is defined by the method signature
    }
}
