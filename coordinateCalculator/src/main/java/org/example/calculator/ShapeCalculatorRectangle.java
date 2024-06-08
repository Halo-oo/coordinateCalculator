package org.example.calculator;

import org.example.model.CalculationResult;
import org.example.model.Point;

import java.util.List;

public class ShapeCalculatorRectangle implements ShapeCalculator {

    @Override
    public CalculationResult calculationShape(List<Point> coordinateList) {
        CalculationResult calculationResult = new CalculationResult();
        System.out.println("## 사각형 넓이 구하기");
        return calculationResult;
    }
}
