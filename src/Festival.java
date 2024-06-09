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
    private int bronzeTicketSold;
    private int silverTicketSold;
    private int goldTicketSold;
    private double bronzeTicketPrice = 100.0;
    private double silverTicketPrice = 200.0;
    private double goldTicketPrice = 300.0;


    public Festival(String festivalName) {
        this.festivalName = festivalName;
        this.performersList = new ArrayList<>();
        this.maxIncome = 0.0;
        this.expenses = 0.0;
        this.numberOfSoldTickets = 0;
        this.bronzeTicketSold = 0;
        this.silverTicketSold = 0;
        this.goldTicketSold = 0;
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

    public int getBronzeTicketSold() { return bronzeTicketSold; }

    public void setBronzeTicketSold(int bronzeTicketSold) { this.bronzeTicketSold = bronzeTicketSold; }

    public int getSilverTicketSold() { return silverTicketSold; }

    public void setSilverTicketSold(int silverTicketSold) { this.silverTicketSold = silverTicketSold; }

    public int getGoldTicketSold() { return goldTicketSold; }

    public void setGoldTicketSold(int goldTicketSold) { this.goldTicketSold = bronzeTicketSold; }

    public double getBronzeTicketPrice() { return bronzeTicketPrice; }

    public void setBronzeTicketPrice(double bronzeTicketPrice) { this.bronzeTicketPrice = bronzeTicketPrice; }

    public double getSilverTicketPrice() { return silverTicketPrice; }

    public void setSilverTicketPrice(double silverTicketPrice) { this.silverTicketPrice = silverTicketPrice; }

    public double getGoldTicketPrice() { return goldTicketPrice; }

    public void setGoldTicketPriceTicketPrice(double goldTicketPrice) { this.goldTicketPrice = goldTicketPrice; }



    public void addBand(Band band) {
       performersList.add(band);
   }

    public boolean deleteBandFromFestival(String bandName) {
        return performersList.removeIf(band -> band.getName().equals(bandName));
    }

    public List<Band> getNamesOfArtistsByOrder() {
        List<Band> bandsCopyList = new ArrayList<>(performersList);
        Collections.sort(bandsCopyList, Comparator.comparing(Band::getName));
        return bandsCopyList;
    }

    public void sellTicketByTypeWithQuantity(String ticketType, int quantity) {
        switch(ticketType.toLowerCase()) {
            case "bronze":
                bronzeTicketSold += quantity;
                break;
            case "silver":
                silverTicketSold += quantity;
                break;
            case "gold":
                goldTicketSold += quantity;
                break;
            default:
                System.out.println("Invalid ticket type!");
                return;
        }
        numberOfSoldTickets += quantity;
    }

    public void countMaxIncome() {
        maxIncome = (bronzeTicketPrice * bronzeTicketSold) +
                    (silverTicketPrice + silverTicketSold) +
                    (goldTicketPrice + goldTicketSold);
    }
}
