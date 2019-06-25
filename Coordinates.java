package sources.deadman;

public class Coordinates {
    private int longitude;
    private int latitude;
    private int height;

    Coordinates(int longitude, int latitude, int height) {

    }

    public int getLongitude(){
        return longitude;
    }

    public int getLatitude() {
        return latitude;
    }

    public int getHeight() {
        return height;
    }

    public void setLongitude(int longitude) {
        if (_longitude < 0) {
            
        }
    }

    public void setLatitude(int latitude) {
        if (_latitude < 0) {
        }
    }

    public void setHeigt(int height) {
        if (_height < 0) {

        }
    }
}
