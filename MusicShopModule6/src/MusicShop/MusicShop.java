package MusicShop;


import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created by Serg-fam on 10.06.2016 on 17:41.
 */
public class MusicShop {

    private Map<String, Integer> store = new HashMap<>();

    public MusicShop(int maxEachInstrument) {

        store.put("Guitar", ((int) (Math.random() * maxEachInstrument)) + 1);
        store.put("Piano", ((int) (Math.random() * maxEachInstrument)) + 1);
        store.put("Tube", ((int) (Math.random() * maxEachInstrument)) + 1);

    }

    public void getInstrumentsCount() {
        for (String instrument : store.keySet()) {
            System.out.println(instrument + ": " + store.get(instrument) + " pcs");
        }
    }


    public List<MusicInstrument> prepareInstrument(Map<String, Integer> order) {

        List<MusicInstrument> preparedInstruments = new ArrayList<>();

        if(order == null){
            System.out.println("Order was lost!");
            return preparedInstruments;
        }

        /*Checking correctness of the order*/
        for (String instrInOrder : order.keySet()) {
            try {
                if (!store.containsKey(instrInOrder)) {
                    throw new UnknownInstrumentException("Unknown instrument - " + instrInOrder);
                }

                if (order.get(instrInOrder) == null || order.get(instrInOrder) <= 0) {
                    throw new IllegalStateException("Incorrect count in order. Instrument: "
                            + instrInOrder + ", count: " + order.get(instrInOrder));
                }

                if (store.get(instrInOrder) < order.get(instrInOrder)) {
                    throw new IllegalArgumentException("Not enough goods: " + instrInOrder);
                }
            } catch (UnknownInstrumentException | IllegalStateException | IllegalArgumentException e) {
                System.out.println(e.getMessage());
                return preparedInstruments;
            }
        }


        for (String instrOrder : order.keySet()) {
            for (int i = 0; i < order.get(instrOrder); i++) {
                switch (instrOrder) {
                    case "Guitar":
                        preparedInstruments.add(new Guitar());
                        store.put("Guitar", (store.get("Guitar")) - 1);
                        break;
                    case "Piano":
                        preparedInstruments.add(new Piano());
                        store.put("Piano", (store.get("Piano")) - 1);
                        break;
                    case "Tube":
                        preparedInstruments.add(new Tube());
                        store.put("Tube", (store.get("Tube")) - 1);
                }
            }
        }
        return preparedInstruments;
    }
}
