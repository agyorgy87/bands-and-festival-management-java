import java.util.List;

public interface Band {
     void albumRelease(String albumName);
     String getName();
     List<String> getAlbums();
     double getTotalIncome();
}
