package com.differentiation;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.integration.channel.DirectChannel;
import org.springframework.integration.channel.QueueChannel;
import org.springframework.messaging.MessageChannel;
import org.springframework.messaging.PollableChannel;

/**
 * Bean creation for {@code MessageChannel}.
 *
 * @author Soh Xin Wei
 */
@Configuration
public class MessageChannelConfiguration {
    @Bean
    public MessageChannel constantInputChannelA() {
        return new DirectChannel();
    }

    @Bean
    public MessageChannel constantInputChannelB() {
        return new DirectChannel();
    }

    @Bean
    public PollableChannel bufferedInputChannelA() {
        return new QueueChannel(DefaultsDefinitions.QUEUE_CHANNEL_MAX_CAPACITY);
    }

    @Bean
    public PollableChannel bufferedInputChannelB() {
        return new QueueChannel(DefaultsDefinitions.QUEUE_CHANNEL_MAX_CAPACITY);
    }

    @Bean
    public PollableChannel bufferedInternalChannelA() {
        return new QueueChannel(DefaultsDefinitions.QUEUE_CHANNEL_MAX_CAPACITY);
    }
}
