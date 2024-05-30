import java.util.ArrayList;
import java.util.List;

public class MexicanBand {

    private String name;
    private List<String> albums;
    private double totalIncome;
    private boolean diedInGangWar;

    public MexicanBand(String name) {
        this.name = name;
        this.albums = new ArrayList<>();
        this.totalIncome = 0;
        this.diedInGangWar = false;
    }

    public double getTotalIncome() {
        return totalIncome;
    }

    public void setTotalIncome(double totalIncome) {
        this.totalIncome = totalIncome;
    }

    public boolean getDiedInGangWar() {
        return diedInGangWar;
    }

    public void setDiedInGangWar(boolean diedInGangWar) {
        this.diedInGangWar = diedInGangWar;
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
