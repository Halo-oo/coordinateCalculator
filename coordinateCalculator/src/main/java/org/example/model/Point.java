package org.example.model;

import org.example.view.ResultView;

public class Point {
    private final int MIN_COORDINATE_VALUE = 1;
    private final int MAX_COORDINATE_VALUE = 24;
    private final String NOT_ALLOWED_RANGE_ERROR_MSG = "좌표값은 최대 " + MAX_COORDINATE_VALUE + "까지 입력할 수 있습니다.";

    private int x;
    private int y;

    public Point(String x, String y) {
        int intX = Integer.parseInt(x);
        int intY = Integer.parseInt(y);

        /* (validation) 입력한 좌표의 범위 유효성 확인 */
        if (notAllowedRangeCheck(intX) || notAllowedRangeCheck(intY)) {
            ResultView resultView = new ResultView();
            resultView.warningMessageOutput(NOT_ALLOWED_RANGE_ERROR_MSG);

            throw new IllegalArgumentException(NOT_ALLOWED_RANGE_ERROR_MSG);
        }

        this.x = intX;
        this.y = intY;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    /* 좌표 값에 대한 최소 ↔️ 최대 범위 확인 */
    public boolean notAllowedRangeCheck(int coordinate) {
        return MIN_COORDINATE_VALUE > coordinate || coordinate > MAX_COORDINATE_VALUE;
    }

    /* 두 좌표(Point)에 대한 거리 계산 */
    public double calculatingDistanceTwoPoints(Point p1, Point p2) {
        double X = Math.pow(p1.getX() - p2.getX(), 2);
        double Y = Math.pow(p1.getY() - p2.getY(), 2);

        return Math.sqrt(X + Y);
    }
}
