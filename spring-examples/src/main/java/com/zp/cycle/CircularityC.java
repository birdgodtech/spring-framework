package com.zp.cycle;

public class CircularityC {

    private CircularityA circularityA;

    public CircularityC() {
    }

    public CircularityC(CircularityA circularityA) {
        this.circularityA = circularityA;
    }

    public void setCircularityA(CircularityA circularityA) {
        this.circularityA = circularityA;
    }

    public void c() {
        circularityA.a();
    }
}
