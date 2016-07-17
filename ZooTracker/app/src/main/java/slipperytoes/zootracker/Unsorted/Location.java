package slipperytoes.zootracker.Unsorted;

/**
 * Created by Thoma on 29/06/2016.
 */
public class Location {
    private String country;
    private String state;

    public Location(String country, String state) {
        this.country = country;
        this.state = state;
    }

    public String toString()
    {
        return "This animal is from: " + country + ", " + state;
    }
}
