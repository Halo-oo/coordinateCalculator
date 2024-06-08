package org.example.calculator;

import org.example.model.CalculationResult;
import org.example.model.Point;

import java.util.List;

public interface ShapeCalculator {

    CalculationResult calculationShape(List<Point> coordinateList);
}
