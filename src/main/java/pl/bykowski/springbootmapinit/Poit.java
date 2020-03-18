package pl.bykowski.springbootmapinit;

public class Poit {

    private double lat;
    private double lon;
    private String text;

    public Poit() {
    }

    public Poit(double lat, double lon, String text) {
        this.lat = lat;
        this.lon = lon;
        this.text = text;
    }

    public double getLat() {
        return lat;
    }

    public void setLat(double lat) {
        this.lat = lat;
    }

    public double getLon() {
        return lon;
    }

    public void setLon(double lon) {
        this.lon = lon;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }
}
