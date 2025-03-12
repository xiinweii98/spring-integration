package com.differentiation.model;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

/**
 * Represents a "shape".
 *
 * @author Soh Xin Wei
 */
@Getter
@Setter
@ToString
public abstract class Shape {
    private double area;

    public Shape(double area) {
        this.area = area;
    }

    public abstract String getTypeName();
}
