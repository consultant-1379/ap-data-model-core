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
package com.ericsson.oss.services.ap.model.event;

import com.ericsson.oss.itpf.modeling.annotation.EModel;
import com.ericsson.oss.itpf.modeling.annotation.EModelAttribute;
import com.ericsson.oss.itpf.modeling.annotation.eventtype.EventAttribute;
import com.ericsson.oss.itpf.modeling.annotation.eventtype.EventTypeDefinition;
import com.ericsson.oss.mediation.sdk.event.MediationTaskRequest;

/**
 * Event that is sent to trigger the mediation flow to apply NETCONF configuration file to node.
 */
@EModel(namespace = "provisioning", name = "ApplyNetconfFileEvent", version = "1.0.0", description = "Kick off apply NETCONF configuration file flow in mediation")
@EventTypeDefinition(channelUrn = "//global/ClusteredEventBasedMediationClient")
public class ApplyNetconfFileEvent extends MediationTaskRequest {
    private static final long serialVersionUID = 6173101258412000217L;

    @EModelAttribute(mandatory = true, description = "Netconf configuration file contents to apply")
    @EventAttribute(filterable = true)
    private String netconfFileContents;

    @EModelAttribute(mandatory = true, description = "AP node FDN that response to")
    @EventAttribute(filterable = true)
    private String apNodeFdn;

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

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = super.hashCode();
        result = prime * result + ((netconfFileContents == null) ? 0 : netconfFileContents.hashCode());
        result = prime * result + ((apNodeFdn == null) ? 0 : apNodeFdn.hashCode());

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

        final ApplyNetconfFileEvent other = (ApplyNetconfFileEvent) obj;
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

        return true;
    }
}
