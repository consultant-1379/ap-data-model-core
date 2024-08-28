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
import java.util.List;

import com.ericsson.oss.itpf.datalayer.dps.modeling.annotation.Hierarchical;
import com.ericsson.oss.itpf.datalayer.dps.modeling.annotation.OnReadWrite;
import com.ericsson.oss.itpf.datalayer.dps.modeling.annotation.PrimaryTypeAttribute;
import com.ericsson.oss.itpf.datalayer.dps.modeling.annotation.PrimaryTypeDefinition;
import com.ericsson.oss.itpf.datalayer.dps.modeling.annotation.ReadBehavior;
import com.ericsson.oss.itpf.datalayer.dps.modeling.annotation.WriteBehavior;
import com.ericsson.oss.itpf.modeling.annotation.EModel;
import com.ericsson.oss.itpf.modeling.annotation.EModelAttribute;
import com.ericsson.oss.itpf.modeling.annotation.constraints.NotNull;

/**
 * Defines the Auto Provisioning Node Dhcp MO.
 */
@EModel(namespace = "ap", description = "Auto Provisioning Dhcp configuration of the Node", name = "NodeDhcp", version = ApVersion.PROJECT_VERSION)
@PrimaryTypeDefinition()
@Hierarchical(parentMoTypeUrn = "//ap/Node/*")
@OnReadWrite(onRead = ReadBehavior.READ_FROM_PERSISTENT_STORAGE, onWrite = WriteBehavior.WRITE_TO_PERSISTENT_STORAGE_ONLY)
public class NodeDhcp implements Serializable {

    private static final long serialVersionUID = -6715204071006197717L;

    @PrimaryTypeAttribute
    @EModelAttribute(description = "The ID of the MO", key = true, immutable = true, mandatory = true)
    @NotNull
    public String nodeDhcpId;

    @EModelAttribute(description = "Initial ip address")
    @PrimaryTypeAttribute
    public String initialIpAddress;

    @EModelAttribute(description = "Default router ip address")
    @PrimaryTypeAttribute
    public String defaultRouter;

    @EModelAttribute(description = "A list of the NTP server ip addresses")
    @PrimaryTypeAttribute
    public transient List<String> ntpServer;

    @EModelAttribute(description = "A list of the DNS server ip addresses")
    @PrimaryTypeAttribute
    public transient List<String> dnsServer;
}
