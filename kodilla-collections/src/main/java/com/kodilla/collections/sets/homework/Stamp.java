package com.kodilla.collections.sets.homework;

import java.util.Objects;

public class Stamp {
    private String stampName;
    private double height;
    private double width;
    private boolean stamped;

    public Stamp(String stampName, double height, double width, boolean stamped) {
        this.stampName = stampName;
        this.height = height;
        this.width = width;
        this.stamped = stamped;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Stamp stamp = (Stamp) o;
        return Double.compare(stamp.height, height) == 0 &&
                Double.compare(stamp.width, width) == 0 &&
                stamped == stamp.stamped &&
                Objects.equals(stampName, stamp.stampName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(stampName, height, width, stamped);
    }

    @Override
    public String toString() {
        return "Stamp{" +
                "stampName='" + stampName + '\'' +
                ", height=" + height +
                ", width=" + width +
                ", stamped=" + stamped +
                '}';
    }
}
