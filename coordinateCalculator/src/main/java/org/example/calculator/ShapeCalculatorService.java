package org.example.calculator;

import org.example.model.CalculationResult;
import org.example.model.Point;

import java.util.List;

public class ShapeCalculatorService {
    ShapeCalculatorTwoDots shapeCalculatorTwoDots = new ShapeCalculatorTwoDots();
    ShapeCalculatorTriangle shapeCalculatorTriangle = new ShapeCalculatorTriangle();
    ShapeCalculatorRectangle shapeCalculatorRectangle = new ShapeCalculatorRectangle();

    ShapeCalculatorProvider shapeCalculatorProvider = new ShapeCalculatorProvider(
            shapeCalculatorTwoDots, shapeCalculatorTriangle, shapeCalculatorRectangle
    );

    /**
     * 주어진 좌표 개수에 따른 모양(두 점, 삼각형, 사각형) 별 계산 진행
     */
    public CalculationResult calculationShape(List<Point> coordinateList) {
        final ShapeCalculator shapeCalculator = shapeCalculatorProvider.getShapeCalculator(coordinateList.size());
        return shapeCalculator.calculationShape(coordinateList);
    }
}
