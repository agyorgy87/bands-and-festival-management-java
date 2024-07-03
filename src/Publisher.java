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
            if(band.getName().equals(bandName)) {
                double updatedIncome = band.getTotalIncome() + amount;
                band.setTotalIncome(updatedIncome);
                return true;
            }
        }
        return false;
    }

    public double fullIncome() throws InvalidDoubleException{
        double total = 0.0;
        if(total <= 0.0) {
            throw new InvalidDoubleException("The value is not positive double");
        }
        for(Band band : bands) {
            if( band instanceof FinnBand) {
               total += band.getTotalIncome() - ((FinnBand) band).getAlcoholConsumedOnAccount();//ClassCastException
            }else{
                total += band.getTotalIncome();
            }
        }
        return total;
    }

    public Band mostSuccessfullBand() throws EmptyListException {
        if(bands.isEmpty()) {
            throw new EmptyListException("The bands list is empty.");
        }
        Band topBand = bands.get(0);
        double maxIncome = bands.get(0).getTotalIncome();
        for(Band band : bands) {
            double actuallyTotalIncome = band.getTotalIncome();
            if(actuallyTotalIncome > maxIncome) {
                maxIncome = actuallyTotalIncome;
                topBand = band;
            }
        }
        return topBand;
    }
}
