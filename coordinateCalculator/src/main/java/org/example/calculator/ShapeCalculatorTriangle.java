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
     * 삼각형 넓이 계산
     */
    public double calculatingTriangleArea(Point firstPoint, Point secondPoint, Point thirdPoint) {
        Point point = firstPoint;

        // 세 변의 길이 계산
        double aSideLength = point.calculatingDistanceTwoPoints(firstPoint, secondPoint);
        double bSideLength = point.calculatingDistanceTwoPoints(secondPoint, thirdPoint);
        double cSideLength = point.calculatingDistanceTwoPoints(thirdPoint, firstPoint);

        // 삼각형 넓이
        double halfCircumference = (aSideLength + bSideLength + cSideLength) / 2;
        double area = Math.sqrt(halfCircumference * (halfCircumference-aSideLength) * (halfCircumference-bSideLength) * (halfCircumference-cSideLength));

        return area;
    }
}
