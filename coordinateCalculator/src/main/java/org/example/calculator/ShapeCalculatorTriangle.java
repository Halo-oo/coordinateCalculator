package org.example.calculator;

import org.example.model.CalculationResult;
import org.example.model.Point;

import java.util.List;

public class ShapeCalculatorTriangle implements ShapeCalculator {

    @Override
    public CalculationResult calculationShape(List<Point> coordinateList) {
        CalculationResult calculationResult = new CalculationResult();
        calculationResult.setShapeType("삼각형의 넓이");

        double result = calculatingTriangleArea(coordinateList.get(0), coordinateList.get(1), coordinateList.get(2));
        calculationResult.setCalculatorResult(result);

        return calculationResult;
    }

    /**
     * 삼각형 넓이 계산 (refer. 헤론의 공식)
     */
    public double calculatingTriangleArea(Point p1, Point p2, Point p3) {
        Point point = p1;

        // 세 변의 길이 계산
        double aSideLength = point.calculatingDistanceTwoPoints(p1, p2);
        double bSideLength = point.calculatingDistanceTwoPoints(p2, p3);
        double cSideLength = point.calculatingDistanceTwoPoints(p3, p1);

        // 삼각형 넓이
        double halfCircumference = (aSideLength + bSideLength + cSideLength) / 2;
        double area = Math.sqrt(halfCircumference * (halfCircumference-aSideLength) * (halfCircumference-bSideLength) * (halfCircumference-cSideLength));

        return area;
    }
}
