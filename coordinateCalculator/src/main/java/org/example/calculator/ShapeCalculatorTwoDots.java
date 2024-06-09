package org.example.calculator;

import org.example.model.CalculationResult;
import org.example.model.Point;

import java.util.List;

public class ShapeCalculatorTwoDots implements ShapeCalculator {

    /**
     * 계산 유형 문자열과 결과값 반환
     */
    @Override
    public CalculationResult calculationShape(List<Point> coordinateList) {
        CalculationResult calculationResult = new CalculationResult();
        calculationResult.setShapeType("두 점 사이의 거리");

        Point point = coordinateList.get(0);
        double result = point.calculatingDistanceTwoPoints(coordinateList.get(0), coordinateList.get(1));
        calculationResult.setCalculatorResult(result);

        return calculationResult;
    }
}
