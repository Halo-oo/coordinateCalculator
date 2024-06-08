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

    public boolean notAllowedRangeCheck(int coordinate) {
        return MIN_COORDINATE_VALUE > coordinate || coordinate > MAX_COORDINATE_VALUE;
    }
}
