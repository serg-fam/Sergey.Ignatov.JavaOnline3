package MusicShop;

import java.util.*;

/**
 * Created by Serg-fam on 10.06.2016 on 17:47.
 */
public class Runner {

    public static void main(String[] args) {
        MusicShop musicShop = new MusicShop(30);


        System.out.println("Store assortment:");
        musicShop.getInstrumentsCount();


        Map<String, Integer> newOrder = new HashMap<>();
        newOrder.put("Guitar", 2);
        newOrder.put("Piano", 3);
        newOrder.put("Tube", 4);


        List<MusicInstrument> orderedInstruments = musicShop.prepareInstrument(newOrder);


        System.out.print(orderedInstruments.size() != 0 ? "Order is executed: " : "Order isn't executed!");
        for (MusicInstrument instrument : orderedInstruments) {
            System.out.print(instrument + " ");
        }


        System.out.println("\nAfter order:");
        musicShop.getInstrumentsCount();
    }

}
