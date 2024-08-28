/*------------------------------------------------------------------------------
 *******************************************************************************
 * COPYRIGHT Ericsson 2021
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
 * Event that is sent to trigger the mediation flow to get NETCONF configuration from node.
 */
@EModel(namespace = "provisioning", name = "GetNetconfConfigurationEvent", version = "1.0.0", description = "Kick off retrieve node configuration flow in mediation")
@EventTypeDefinition(channelUrn = "//global/ClusteredEventBasedMediationClient")
public class GetNetconfConfigurationEvent extends MediationTaskRequest {

    private static final long serialVersionUID = -4777032849918015289L;

    @EModelAttribute(mandatory = true, description = "Node netconf configuration file path")
    @EventAttribute(filterable = true)
    private String nodeConfigurationFile;

    @EModelAttribute(mandatory = true, description = "Callback URI for mediation rest client to notify getConfig result")
    @EventAttribute(filterable = true)
    private String callbackUri;

    @EModelAttribute(description = "Required headers to configure callback request")
    @EventAttribute
    private Map<String, String> callbackHeaders;

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

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = super.hashCode();
        result = prime * result + ((nodeConfigurationFile == null) ? 0 : nodeConfigurationFile.hashCode());
        result = prime * result + ((callbackUri == null) ? 0 : callbackUri.hashCode());
        result = prime * result + ((callbackHeaders == null) ? 0 : callbackHeaders.hashCode());

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

        final GetNetconfConfigurationEvent other = (GetNetconfConfigurationEvent) obj;
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

        return true;
    }
}
