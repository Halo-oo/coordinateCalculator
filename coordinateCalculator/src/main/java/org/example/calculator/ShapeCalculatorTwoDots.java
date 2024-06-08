package org.example.calculator;

import org.example.model.Point;

import java.util.List;

public class ShapeCalculatorTwoDots implements ShapeCalculator {

    @Override
    public double calculationShape(List<Point> coordinateList) {
        return calculatingDistanceTwoPoints(coordinateList.get(0), coordinateList.get(1));
    }

    /**
     * 두 점 사이의 거리 계산
     */
    public double calculatingDistanceTwoPoints(Point firstPoint, Point secondPoint) {
        double X = Math.pow(firstPoint.getX() - secondPoint.getX(), 2);
        double Y = Math.pow(firstPoint.getY() - secondPoint.getY(), 2);
        return Math.sqrt(X + Y);
    }
}
