import java.util.ArrayList;
import java.util.List;

public class Festival {

    private String festivalName;
    private List<Band> artists;
    private double maxIncome;
    private double expenses;
    private int numberOfSoldTickets;

    public Festival(String festivalName) {
        this.festivalName = festivalName;
        this.artists = new ArrayList<>();
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

    public List<Band> getArtists() {
        return artists;
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

}
