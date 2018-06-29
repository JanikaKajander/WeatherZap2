package com.example.janika.weatherzap.Model;

public class Coord {
    private double lat;
    private double lng;

    public Coord(double lat, double lon) {
        this.lat = lat;
        this.lng = lon;
    }

    public double getLat() {
        return lat;
    }

    public void setLat(double lat) {
        this.lat = lat;
    }

    public double getLon() {
        return lng;
    }

    public void setLon(double lon) {
        this.lng = lon;
    }
}
