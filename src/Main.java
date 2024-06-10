import java.util.ArrayList;
import java.util.List;
public class Main {
    public static void main(String[] args) {

        Festival festival = new Festival("Summer Fest");

        festival.sellTicketByTypeWithQuantity("bronze", 10);
        festival.sellTicketByTypeWithQuantity("silver", 10);
        festival.sellTicketByTypeWithQuantity("gold", 10);

        MexicanBand losCogelones = new MexicanBand("Los Cogelones");
        MexicanBand losLobos = new MexicanBand("Los Lobos");

        FinnBand bomfunkMc = new FinnBand("Bomfunk MC's");
        FinnBand him = new FinnBand("HIM");

        festival.addBand(losCogelones);
        festival.addBand(losLobos);
        festival.addBand(bomfunkMc);
        festival.addBand(him);

        festival.deleteBandFromFestival("Los Cogelones");

        List<Band> sortedBands = festival.getNamesOfArtistsByOrder();
        System.out.println("Performers in order:");
        for (Band band : sortedBands) {
            System.out.println(band.getName());
        }

        System.out.println("Bronze tickets sold: " + festival.getBronzeTicketSold());
        System.out.println("Silver tickets sold: " + festival.getSilverTicketSold());
        System.out.println("Gold tickets sold: " + festival.getGoldTicketSold());
        System.out.println("Total tickets sold: " + festival.getNumberOfSoldTickets());

        System.out.println("ticket sold by price: " + festival.ticketSoldByPrice("bronze"));
        System.out.println("ticket sold by price: " + festival.ticketSoldByPrice("silver"));
        System.out.println("ticket sold by price: " + festival.ticketSoldByPrice("gold"));
        System.out.println("Max income: " + festival.countMaxIncome());

        losLobos.setDiedInGangWar(true);
        boolean diedInGangWarLosLobos = losLobos.getDiedInGangWar();
        System.out.println("Los Lobos members died in gang war: " + diedInGangWarLosLobos);

        him.setAlcoholConsumedOnAccount(500.0);
        double himAlcoholConsumedOnAccount = him.getAlcoholConsumedOnAccount();
        System.out.println("HIM members alcohol account: " + himAlcoholConsumedOnAccount);

        losLobos.setTotalIncome(4000.0);
        bomfunkMc.setTotalIncome(7500.0);
        him.setTotalIncome(15000.0);

        System.out.println("Top Band: " + festival.getTopEarningBand());
    }
}