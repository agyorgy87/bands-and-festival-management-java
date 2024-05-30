import java.util.ArrayList;
import java.util.List;

public class FinnBand implements Band {

    private String name;

    private List<String> albums;

    private double totalIncome;

    private double alcoholConsumedOnAccount;

    public FinnBand(String name, double, double totalIncome, double alcoholConsumedOnAccount) {
        this.name = name;
        this.albums = new ArrayList<>();
        this.totalIncome = totalIncome;
        this.alcoholConsumedOnAccount = alcoholConsumedOnAccount;
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

    public String getName() {
        return name;
    }

    public List<String> getAlbums() {
        return albums;
    }

    public void albumRelease(String albumName) {
        albums.add(albumName);
    }

}
