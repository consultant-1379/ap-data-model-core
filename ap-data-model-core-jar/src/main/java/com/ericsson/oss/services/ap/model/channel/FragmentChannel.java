/*------------------------------------------------------------------------------
 *******************************************************************************
 * COPYRIGHT Ericsson 2018
 *
 * The copyright to the computer program(s) herein is the property of
 * Ericsson Inc. The programs may be used and/or copied only with written
 * permission from Ericsson Inc. or in accordance with the terms and
 * conditions stipulated in the agreement/contract under which the
 * program(s) have been supplied.
 *******************************************************************************
 *----------------------------------------------------------------------------*/
package com.ericsson.oss.services.ap.model.channel;

import com.ericsson.oss.itpf.modeling.annotation.EModel;
import com.ericsson.oss.itpf.modeling.annotation.channel.ChannelDefinition;
import com.ericsson.oss.itpf.modeling.annotation.channel.ChannelType;

/**
 * Defines Fragment Notification Channel
 */
@EModel(name = "FragmentNotificationChannel", description = "Channel used for Fragment notifications.")
@ChannelDefinition(channelURI = "jms:/queue/FragmentNotificationChannel", channelType = ChannelType.POINT_TO_POINT)
public class FragmentChannel {
}
