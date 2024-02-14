import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

//Система метрополитена отслеживает время в пути клиентов между различными станциями.
// Они используют эти данные для расчета среднего времени, необходимого
// для перехода от одной станции к другой.

class UndergroundSystem {
    Map<Integer, String> travelMapIn;
    Map<String, List<Integer>> travelMapOut;

    public UndergroundSystem() {
        travelMapIn = new HashMap<Integer, String>();
        travelMapOut = new HashMap<String, List<Integer>>();
    }

    public void checkIn(int id, String stationName, int t) {
        String value = stationName + ", " + t;
        travelMapIn.put(id, value);
    }

    public void checkOut(int id, String stationName, int t) {
        String prevValue = travelMapIn.get(id);
        String[] array = prevValue.split(", ");
        String startStation = array[0];
        int startTime = Integer.parseInt(array[1]);
        String trip = startStation + ", " + stationName;
        int duration = t - startTime;
        List<Integer> list = travelMapOut.getOrDefault(trip, new ArrayList<Integer>());
        list.add(duration);
        travelMapOut.put(trip, list);
        travelMapIn.remove(id);
    }

    public double getAverageTime(String startStation, String endStation) {
        String trip = startStation + ", " + endStation;
        List<Integer> list = travelMapOut.getOrDefault(trip, new ArrayList<Integer>()); 
        if (list.size() == 0) 
            return 0; 
        int size = list.size();
        double sum = 0;
        for (int time : list)
            sum += time;
        return sum / size;
    }

    public static void main(String[] args) {

        UndergroundSystem undergroundSystem = new UndergroundSystem();
        undergroundSystem.checkIn(45, "Leyton", 3);
        undergroundSystem.checkIn(32, "Paradise", 8);
        undergroundSystem.checkIn(27, "Leyton", 10);
        undergroundSystem.checkOut(45, "Waterloo", 15); // Customer 45 "Leyton" -> "Waterloo" in 15-3 = 12
        undergroundSystem.checkOut(27, "Waterloo", 20); // Customer 27 "Leyton" -> "Waterloo" in 20-10 = 10
        undergroundSystem.checkOut(32, "Cambridge", 20); // Customer 32 "Paradise" -> "Cambridge" in 22-8 = 14
        undergroundSystem.getAverageTime("Paradise", "Cambridge"); // return 14.00000. One trip "Paradise" ->
                                                                   // "Cambridge", (14) / 1 = 14
        undergroundSystem.getAverageTime("Leyton", "Waterloo"); // return 11.00000. Two trips "Leyton" -> "Waterloo",
                                                                // (10 + 12) / 2 = 11
        System.out.println(undergroundSystem.getAverageTime("Leyton", "Waterloo"));
        undergroundSystem.checkIn(10, "Leyton", 24);
        undergroundSystem.getAverageTime("Leyton", "Waterloo"); // return 11.00000
        undergroundSystem.checkOut(10, "Waterloo", 38); // Customer 10 "Leyton" -> "Waterloo" in 38-24 = 14
        undergroundSystem.getAverageTime("Leyton", "Waterloo"); // return 12.00000. Three trips "Leyton" -> "Waterloo",

        System.out.println(undergroundSystem.getAverageTime("Paradise", "Cambridge"));
        System.out.println(undergroundSystem.getAverageTime("Leyton", "Waterloo"));
    }
}