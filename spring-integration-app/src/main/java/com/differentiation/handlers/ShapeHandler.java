package com.differentiation.handlers;

import com.differentiation.LoggingDefinitions;
import com.differentiation.model.Shape;
import lombok.extern.slf4j.Slf4j;
import org.springframework.integration.core.GenericHandler;
import org.springframework.messaging.MessageHeaders;

/**
 * {@code GenericHandler} for {@code Shape}.
 *
 * @author Soh Xin Wei
 */
@Slf4j
public class ShapeHandler implements GenericHandler<Shape> {
    @Override
    public Object handle(Shape payload, MessageHeaders headers) {
        String message = String.format(LoggingDefinitions.INFO_SHAPE_TYPE_AND_AREA_FORMAT,
                payload.getTypeName(), payload.getArea());
        log.info(message);
        return null;
    }
}
