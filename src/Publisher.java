import java.util.ArrayList;
import java.util.List;

public class Publisher {

    private String name;

    private List<Band> bands;

    public Publisher(String name) {
        this.name = name;
        this.bands = new ArrayList<>();
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

    public boolean deleteBandByName(String bandName) {
        return bands.removeIf(band -> band.getName().equals(bandName));
    }

    public boolean albumSales(double amount, String bandName) {
        for(Band band : bands) {
            if (band instanceof MexicanBand && ((MexicanBand) band).getName().equals(bandName)) {
                ((MexicanBand) band).setTotalIncome(((MexicanBand) band).getTotalIncome() + amount);
                return true;
            } else if (band instanceof FinnBand && ((FinnBand) band).getName().equals(bandName)) {
                ((FinnBand) band).setTotalIncome(((FinnBand) band).getTotalIncome() + amount);
                return true;
            }
        }
    }

    //totalIncome()

    //mostSuccessfullBand()
}
