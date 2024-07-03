import java.util.List;
import java.util.logging.*;

public class Main {

    private static final Logger LOGGER = Logger.getLogger(Main.class.getName());
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

        Publisher novaRecord = new Publisher("Nova Record");
        novaRecord.pickupBand(him);
        novaRecord.pickupBand(bomfunkMc);
        novaRecord.pickupBand(losLobos);

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


        try{
            Band topBand = festival.getTopEarningBand();
            LOGGER.info("Number one band: " + topBand);
        }catch (Exception e) {
            System.out.println(e.getMessage());
        }

        him.setTotalIncome(1000.0);
        losLobos.setTotalIncome(700.0);
        bomfunkMc.setTotalIncome(900.0);

        try{
            double fullI = novaRecord.fullIncome();
            LOGGER.info("full income: " + fullI);
        }catch (Exception e) {
            System.out.println(e.getMessage());
        }


        try{
            Band mostSuccessfull = novaRecord.mostSuccessfullBand();
            LOGGER.info("most successfull: " + mostSuccessfull);
        }catch (Exception e) {
            System.out.println(e.getMessage());
        }

        /*
        novaRecord.deleteBandByName("bomfunkMc");
        Band novaRecordBands = novaRecord.getBands();
        System.out.println();
        */

        List<Band> bands = MexicanBand.parseAll("bandsFile.txt");
        System.out.println(bands);
    }
}