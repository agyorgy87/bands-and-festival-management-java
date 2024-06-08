import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Festival {

    private String festivalName;
    private List<Band> performersList;
    private double maxIncome;
    private double expenses;
    private int numberOfSoldTickets;

    public Festival(String festivalName) {
        this.festivalName = festivalName;
        this.performersList = new ArrayList<>();
        //this.artistOrBandName = artistOrBandName;???
        this.maxIncome = 0.0;
        this.expenses = 0.0;
        this.numberOfSoldTickets = 0;
    }

    public String getFestivalName() {
        return festivalName;
    }

    public void setFestivalName(String festivalName) {
        this.festivalName = festivalName;
    }

    public List<Band> performersList() {
        return performersList;
    }

    public double getMaxIncome() {
        return maxIncome;
    }

    public void setMaxIncome(double maxIncome) {
        this.maxIncome = maxIncome;
    }

    public double getExpenses() {
        return expenses;
    }

    public void setExpenses(double expenses) {
        this.expenses = expenses;
    }

    public int getNumberOfSoldTickets() {
        return numberOfSoldTickets;
    }

   public void setNumberOfSoldTickets(int numberOfSoldTickets) {
        this.numberOfSoldTickets = numberOfSoldTickets;
   }

   public void addBand(Band band) {
       performersList.add(band);
   }

   public boolean deleteBandFromFestival(String bandName) {
        return performersList.removeIf(band -> band.getName().equals(bandName));
   }

   //ticket sold function

   public List<Band> getNamesOfArtistsByOrder() {
        List<Band> bandsCopyList = new ArrayList<>(performersList);
        Collections.sort(bandsCopyList, Comparator.comparing(Band::getName));
        return bandsCopyList;
    }
}
