package org.example.model;

public enum ShapeType {
    /* 두 점 사이의 거리 */
    TWO_DOTS(2),

    /* 삼각형의 널이 */
    TRIANGLE(3),

    /* 사각형의 넓이 */
    RECTANGLE(4);

    private int requiredCoordinateCnt;

    ShapeType(int requiredCoordinateCnt) {
        this.requiredCoordinateCnt = requiredCoordinateCnt;
    }

    public int getRequiredCoordinateCnt() {
        return requiredCoordinateCnt;
    }

    /* int 형을 > ShapeType으로 변경 */
    public static ShapeType parseIntToShapeType(int coordinateCnt) {
        for (ShapeType shapeType : values()) {
            if (shapeType.getRequiredCoordinateCnt() == coordinateCnt) {
                return shapeType;
            }
        }

        return null;
    }
}
