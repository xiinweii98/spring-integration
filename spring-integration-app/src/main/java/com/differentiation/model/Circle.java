package com.differentiation.model;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

/**
 * Represents a "circle".
 *
 * @author Soh Xin Wei
 */
@Getter
@Setter
@ToString
public class Circle extends Shape {
    private double radius;

    public Circle(double radius) {
        super(Math.PI * radius * radius);
        this.radius = radius;
    }

    @Override
    public String getTypeName() {
        return "Circle";
    }
}
