package org.example.calculator;

import org.example.model.ShapeType;

import java.util.EnumMap;
import java.util.Map;

public class ShapeCalculatorProvider {
    private final Map<ShapeType, ShapeCalculator> shapeCalculatorActions;

    public ShapeCalculatorProvider(
            final ShapeCalculatorTwoDots shapeCalculatorTwoDots,
            final ShapeCalculatorTriangle shapeCalculatorTriangle,
            final ShapeCalculatorRectangle shapeCalculatorRectangle
    ) {
        shapeCalculatorActions = new EnumMap<>(ShapeType.class);
        shapeCalculatorActions.put(ShapeType.TWO_DOTS, shapeCalculatorTwoDots);
        shapeCalculatorActions.put(ShapeType.TRIANGLE, shapeCalculatorTriangle);
        shapeCalculatorActions.put(ShapeType.RECTANGLE, shapeCalculatorRectangle);
    }

    public ShapeCalculator getShapeCalculator(int coordinateCnt) {
        ShapeType shapeType = ShapeType.parseIntToShapeType(coordinateCnt);
        return shapeCalculatorActions.get(shapeType);
    }
}
