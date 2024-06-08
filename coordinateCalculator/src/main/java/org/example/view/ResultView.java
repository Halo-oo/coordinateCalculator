package org.example.view;

public class ResultView {

    /**
     * (기본) message 출력
     */
    public void plainMessageOutput(String message) {
        System.out.println(message);
    }

    /**
     * (경고) message 출력
     */
    public void warningMessageOutput(String message) {
        System.out.println("[!주의] " + message);
    }
}
