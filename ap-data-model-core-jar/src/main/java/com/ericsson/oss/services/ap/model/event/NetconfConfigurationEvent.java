/*------------------------------------------------------------------------------
 *******************************************************************************
 * COPYRIGHT Ericsson 2022
 *
 * The copyright to the computer program(s) herein is the property of
 * Ericsson Inc. The programs may be used and/or copied only with written
 * permission from Ericsson Inc. or in accordance with the terms and
 * conditions stipulated in the agreement/contract under which the
 * program(s) have been supplied.
 *******************************************************************************
 *----------------------------------------------------------------------------*/
package com.ericsson.oss.services.ap.model.event;

import java.util.HashMap;
import java.util.Map;

import com.ericsson.oss.itpf.modeling.annotation.EModel;
import com.ericsson.oss.itpf.modeling.annotation.EModelAttribute;
import com.ericsson.oss.itpf.modeling.annotation.eventtype.EventAttribute;
import com.ericsson.oss.itpf.modeling.annotation.eventtype.EventTypeDefinition;
import com.ericsson.oss.mediation.sdk.event.MediationTaskRequest;
/**
 * Event that is sent to trigger the mediation flow to handle NETCONF configuration data with node.
 */
@EModel(namespace = "provisioning", name = "NetconfConfigurationEvent", version = "1.0.0", description = "Kick off NETCONF configuration handling flow in mediation")
@EventTypeDefinition(channelUrn = "//global/ClusteredEventBasedMediationClient")
public class NetconfConfigurationEvent extends MediationTaskRequest {
    private static final long serialVersionUID = -2080335833301590517L;

    @EModelAttribute(mandatory = true, description = "Netconf configuration file contents to apply")
    @EventAttribute(filterable = true)
    private String netconfFileContents;

    @EModelAttribute(mandatory = true, description = "AP node FDN that response to")
    @EventAttribute(filterable = true)
    private String apNodeFdn;

    @EModelAttribute(mandatory = true, description = "Node netconf configuration file path")
    @EventAttribute(filterable = true)
    private String nodeConfigurationFile;

    @EModelAttribute(mandatory = true, description = "Callback URI for mediation rest client to notify getConfig result")
    @EventAttribute(filterable = true)
    private String callbackUri;

    @EModelAttribute(description = "Required headers to configure callback request")
    @EventAttribute
    private Map<String, String> callbackHeaders;

    @EModelAttribute(description = "Profile Fdn for node configuration snapshot")
    @EventAttribute
    private String profileFdn;

    public String getNetconfFileContents() {
        return netconfFileContents;
    }

    public void setNetconfFileContents(final String netconfFileContents) {
        this.netconfFileContents = netconfFileContents;
    }

    public String getApNodeFdn() {
        return apNodeFdn;
    }

    public void setApNodeFdn(final String apNodeFdn) {
        this.apNodeFdn = apNodeFdn;
    }

    public String getNodeConfigurationFile() {
        return nodeConfigurationFile;
    }

    public void setNodeConfigurationFile(final String nodeConfigurationFile) {
        this.nodeConfigurationFile = nodeConfigurationFile;
    }

    public String getCallbackUri() {
        return callbackUri;
    }

    public void setCallbackUri(final String callbackUri) {
        this.callbackUri = callbackUri;
    }

    public Map<String, String> getCallbackHeaders() {
        if (callbackHeaders == null) {
            return null;
        }
        final Map<String, String> headersCopy = new HashMap<>();
        headersCopy.putAll(callbackHeaders);
        return headersCopy;
    }

    public void setCallbackHeaders(final Map<String, String> headers) {
        this.callbackHeaders = headers;
    }

    public String getProfileFdn() {
        return profileFdn;
    }

    public void setProfileFdn(final String profileFdn) {
        this.profileFdn = profileFdn;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = super.hashCode();
        result = prime * result + ((netconfFileContents == null) ? 0 : netconfFileContents.hashCode());
        result = prime * result + ((apNodeFdn == null) ? 0 : apNodeFdn.hashCode());
        result = prime * result + ((nodeConfigurationFile == null) ? 0 : nodeConfigurationFile.hashCode());
        result = prime * result + ((callbackUri == null) ? 0 : callbackUri.hashCode());
        result = prime * result + ((callbackHeaders == null) ? 0 : callbackHeaders.hashCode());
        result = prime * result + ((profileFdn == null) ? 0 : profileFdn.hashCode());

        return result;
    }

    @Override
    public boolean equals(final Object obj) {
        if (this == obj) {
            return true;
        }

        if (!super.equals(obj)) {
            return false;
        }

        if (getClass() != obj.getClass()) {
            return false;
        }

        final NetconfConfigurationEvent other = (NetconfConfigurationEvent) obj;
        if (netconfFileContents == null) {
            if (other.netconfFileContents != null) {
                return false;
            }
        } else if (!netconfFileContents.equals(other.netconfFileContents)) {
            return false;
        }

        if (apNodeFdn == null) {
            if (other.apNodeFdn != null) {
                return false;
            }
        } else if (!apNodeFdn.equals(other.apNodeFdn)) {
            return false;
        }

        if (nodeConfigurationFile == null) {
            if (other.nodeConfigurationFile != null) {
                return false;
            }
        } else if (!nodeConfigurationFile.equals(other.nodeConfigurationFile)) {
            return false;
        }

        if (callbackUri == null) {
            if (other.callbackUri != null) {
                return false;
            }
        } else if (!callbackUri.equals(other.callbackUri)) {
            return false;
        }

        if (callbackHeaders == null) {
            if (other.callbackHeaders != null) {
                return false;
            }
        } else if (!callbackHeaders.equals(other.callbackHeaders)) {
            return false;
        }

        if (profileFdn == null) {
            if (other.profileFdn != null) {
                return false;
            }
        } else if (!profileFdn.equals(other.profileFdn)) {
            return false;
        }

        return true;
    }
}
