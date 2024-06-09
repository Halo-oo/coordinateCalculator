package org.example.calculator;

import org.example.model.CalculationResult;
import org.example.model.Point;
import org.example.view.ResultView;

import java.util.List;

public class ShapeCalculatorRectangle implements ShapeCalculator {
    private final String NOT_RECTANGLE_ERROR_MSG = "해당 좌표는 직사각형이 아닙니다.";

    @Override
    public CalculationResult calculationShape(List<Point> coordinateList) {
        CalculationResult calculationResult = new CalculationResult();
        calculationResult.setShapeType("사각형의 넓이");

        boolean isRectangle = isRectangle(coordinateList.get(0), coordinateList.get(1), coordinateList.get(2), coordinateList.get(3));
        if (!isRectangle) {
            ResultView resultView = new ResultView();
            resultView.warningMessageOutput(NOT_RECTANGLE_ERROR_MSG);

            throw new IllegalArgumentException(NOT_RECTANGLE_ERROR_MSG);
        }

        double result = calculationRectangleArea(coordinateList);
        calculationResult.setCalculatorResult(result);

        return calculationResult;
    }

    /**
     * 직사각형 여부 확인
     * (특징) 세 점의 내각은 = 직각
     */
    public boolean isRectangle(Point p1, Point p2, Point p3, Point p4) {
        Point[] points = {p1, p2, p3, p4};

        // 각 점을 기준으로 세 점이 직각인지 확인
        for(int i = 0; i < 4; i++) {
            Point a = points[i];
            Point b = points[(i+1) % 4];
            Point c = points[(i+2) % 4];

            if (!is90Degrees(a, b, c)) return false;
        }
        return true;
    }

    /**
     * 세 점의 각도가 90도인지 확인
     */
    public boolean is90Degrees(Point p1, Point p2, Point p3) {
        double o1 = Math.atan((p1.getY() - p2.getY()) / (p1.getX() - p2.getX()));
        double o2 = Math.atan((p3.getY() - p2.getY()) / (p3.getX() - p2.getX()));

        double degrees = Math.abs((o1-o2) * 180 / Math.PI);
        if (degrees == 90.0) return true;
        return false;
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
