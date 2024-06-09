package org.example.calculator;

import org.example.model.CalculationResult;
import org.example.model.Point;

import java.util.List;

public class ShapeCalculatorRectangle implements ShapeCalculator {

    @Override
    public CalculationResult calculationShape(List<Point> coordinateList) {
        CalculationResult calculationResult = new CalculationResult();
        calculationResult.setShapeType("사각형의 넓이");

        double result = calculationRectangleArea(coordinateList);
        calculationResult.setCalculatorResult(result);

        return calculationResult;
    }

    /**
     * 사각형 넓이 계산
     */
    public double calculationRectangleArea(List<Point> coordinateList) {
        double width = 0;
        double height = 0;

        // 가로 x 세로 값 구하기
        Point firstPoint = coordinateList.get(0);
        double minX = firstPoint.getX();
        double minY = firstPoint.getY();
        double maxX = firstPoint.getX();
        double maxY = firstPoint.getY();

        for (int i = 1; i < coordinateList.size(); i++) {
            Point point = coordinateList.get(i);

            minX = Math.min(minX, point.getX());
            minY = Math.min(minY, point.getY());
            maxX = Math.max(maxX, point.getX());
            maxY = Math.max(maxY, point.getY());
        }
        width = maxX - minX;
        height = maxY - minY;

        // 사각형 넓이
        return width * height;
    }
}
