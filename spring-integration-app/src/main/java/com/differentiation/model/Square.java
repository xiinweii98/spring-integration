package com.differentiation.model;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

/**
 * Represents a "square".
 *
 * @author Soh Xin Wei
 */
@Getter
@Setter
@ToString
public class Square extends Shape {
    private double length;

    public Square(double length) {
        super(length * length);
        this.length = length;
    }
}
