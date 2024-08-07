import java.util.ArrayList;
import java.util.List;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class MexicanBand implements Band {

    private String name;
    private List<String> albums;
    private double totalIncome;
    private boolean diedInGangWar;

    public MexicanBand(String name) {
        this.name = name;
        this.albums = new ArrayList<>();
        this.totalIncome = 0.0;
        this.diedInGangWar = false;
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

    public boolean getDiedInGangWar() {
        return diedInGangWar;
    }

    public void setDiedInGangWar(boolean diedInGangWar) {
        this.diedInGangWar = diedInGangWar;
    }

    public void albumRelease(String albumName) {
        albums.add(albumName);
    }

    public static List<Band> parseAll(String filename) {
        List<Band> bands = new ArrayList<>();
        // try with resource
        try (BufferedReader reader = new BufferedReader(new FileReader(filename))) {
            String line;
            while ((line = reader.readLine()) != null) {
                String[] parts = line.split(";");
                if (parts.length == 4) {
                    String name = parts[0];
                    String album = parts[1];
                    double totalIncome = Double.parseDouble(parts[2]);
                    boolean diedInGangWar = Boolean.parseBoolean(parts[3]);

                    MexicanBand band = new MexicanBand(name);
                    band.albumRelease(album);
                    band.setTotalIncome(totalIncome);
                    band.setDiedInGangWar(diedInGangWar);
                    bands.add(band);
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return bands;
    }

    @Override
    public String toString() {
        return name;
    }
}
