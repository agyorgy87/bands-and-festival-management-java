import java.util.ArrayList;
import java.util.List;

public class FinnBand implements Band {

    private String name;

    private List<String> albums;

    private double totalIncome;

    private double alcoholConsumedOnAccount;

    private double ticketPrice;

    public FinnBand(String name) {
        this.name = name;
        this.albums = new ArrayList<>();
        this.totalIncome = 0.0;
        this.alcoholConsumedOnAccount = 0.0;
        this.ticketPrice = 200;
    }

    public String getName() {
        return name;
    }

    public List<String> getAlbums() {
        return albums;
    }

    public double getTotalIncome() {
        return totalIncome;
    }

    public void setTotalIncome(double totalIncome) {
        this.totalIncome = totalIncome;
    }

    public double getAlcoholConsumedOnAccount() {
        return alcoholConsumedOnAccount;
    }

    public void setAlcoholConsumedOnAccount(double alcoholConsumedOnAccount) {
        this.alcoholConsumedOnAccount = alcoholConsumedOnAccount;
    }

    public double getTicketPrice() { return ticketPrice; }



    public void albumRelease(String albumName) {
        albums.add(albumName);
    }

}
