package com.csc205.project2;

public class Tetrahedron extends Shape{

    private double length;

    public Tetrahedron() {
        super();
        this.length = 0.0;
    }

    public Tetrahedron(double l) {
        super();
        this.length = l;
    }

    public double getLength() {

        return length;

    }

    public void setLength(double length) {

        this.length = length;

    }

    public double surfaceArea() {

        return (Math.sqrt(3.0) * Math.pow(length, 2));

    }

    public double volume() {

        return ((Math.pow(length, 3))/(6*Math.sqrt(2)));

    }

    @Override
    public String toString() {

        final StringBuilder sb = new StringBuilder("Tetrahedron {\n");
        sb.append(" length= ").append(length);
        sb.append(",\n surface area= ").append(surfaceArea());
        sb.append(",\n volume= ").append(volume());
        sb.append("\n}");
        return sb.toString();

    }

}
