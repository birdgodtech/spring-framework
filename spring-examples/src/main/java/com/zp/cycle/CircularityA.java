package com.zp.cycle;

public class CircularityA {

    private CircularityB circularityB;

    public CircularityA() {
    }

    public CircularityA(CircularityB circularityB) {
        this.circularityB = circularityB;
    }

    public void setCircularityB(CircularityB circularityB) {
        this.circularityB = circularityB;
    }

    public void a() {
        circularityB.b();
    }
}
