package com.github.oneyx.streamhello;

import org.springframework.cloud.stream.annotation.Output;
import org.springframework.messaging.MessageChannel;

/**
 * @author Yipd
 * @date 2018/2/27
 */
public interface SinkSender {
    String OUTPUT = "input";

    @Output(SinkSender.OUTPUT)
    MessageChannel output();
}
