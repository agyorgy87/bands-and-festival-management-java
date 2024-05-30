import java.util.ArrayList;
import java.util.List;

public class Publisher {

    private String name;

    private List<Band> bands;

    public Publisher(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public List<Band> getBands() {
        return bands;
    }

    public void pickupBand(Band band) {
        bands.add(band);
    }

    /*
    public boolean deleteBandByName(String bandName) {
        for(Band band : bands) {
            if(band.)
        }
    }
     */
}
