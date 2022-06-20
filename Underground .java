
import java.util.HashMap;
import java.util.Map;

// Система подземной железной дороги отслеживает время в пути клиентов между различными станциями.
// Они используют эти данные для расчета среднего времени, необходимого для перехода от одной станции к другой.
//Реализовать класс подземной системы:                      

//Реализовать UndergroundSystem класс:

// void checkIn(int id, string stationName, int t)
// Клиент с идентификатором карты, равным id, регистрируется на станции в указанное stationNameвремя t.
// Клиент может быть зарегистрирован только в одном месте за раз.
// void checkOut(int id, string stationName, int t)
// Клиент с идентификатором карты, равным id, выписывается со станции stationNameв указанное время t.
// double getAverageTime(string startStation, string endStation)
// Возвращает среднее время, необходимое для путешествия из startStationв endStation.
// Среднее время вычисляется из всех предыдущих раз в пути от startStationдо endStation, 
//которые произошли непосредственно , что означает регистрацию в startStation, за которой следует 
//выезд из endStation.
// Время, необходимое для путешествия от startStationдо endStation , может отличаться от времени, 
//необходимого для путешествия от endStationдо startStation.
// Будет по крайней мере один клиент, который путешествовал от startStationдо 
//endStationдо getAverageTimeвызова.
// Вы можете предположить, что все вызовы методов и согласованы checkIn. checkOut
//Если клиент регистрируется вовремя , а затем вовремя уходит , то . 
//Все события происходят в хронологическом порядке.t1t2t1 < t2

// _____________________________  решение с MAP___________________


class CheckIn {
  public String stationName;
  public int time;

  public CheckIn(String stationName, int time) {
    this.stationName = stationName;
    this.time = time;
  }
}

class CheckOut {
  public int numTrips;
  public int totalTime;

  public CheckOut(int numTrips, int totalTime) {
    this.numTrips = numTrips;
    this.totalTime = totalTime;
  }
}

class Underground {

  public void checkIn(int id, String stationName, int t) {
    checkIns.put(id, new CheckIn(stationName, t));
  }

  public void checkOut(int id, String stationName, int t) {
    CheckIn checkIn = checkIns.get(id);
    checkIns.remove(id);
    String route = checkIn.stationName + "->" + stationName;
    checkOuts.put(route, new CheckOut(0, 0));
    ++checkOuts.get(route).numTrips;
    checkOuts.get(route).totalTime += t - checkIn.time;
  }

  public double getAverageTime(String startStation, String endStation) {
    CheckOut checkOut = checkOuts.get(startStation + "->" + endStation);
    return checkOut.totalTime / (double) checkOut.numTrips;
  }

  private Map<Integer, CheckIn> checkIns = new HashMap<>(); // {id: (stationName, time)}
  private Map<String, CheckOut> checkOuts = new HashMap<>(); // {route: (numTrips, totalTime)}

  public static void main(String[] args) {

    Underground undergroundSystem = new Underground();
        undergroundSystem.checkIn(10, "Leyton", 3);
        undergroundSystem.checkOut(10, "Paradise", 8); 
        // Customer 10 "Leyton" -> "Paradise" in 8-3 = 5

        // return 5.00000, (5) / 1 = 5
        System.out.println(undergroundSystem.getAverageTime("Leyton", "Paradise"));
        undergroundSystem.checkIn(15, "Leyton", 10);
        undergroundSystem.checkOut(15, "Paradise", 16); 
        // Customer 5 "Leyton" -> "Paradise" in 16-10 = 6

        // return 5.50000, (5 + 6) / 2 = 5.5
        System.out.println(undergroundSystem.getAverageTime("Leyton", "Paradise"));

        undergroundSystem.checkIn(2, "Leyton", 21);
        undergroundSystem.checkOut(2, "Paradise", 30); 
        // Customer 2 "Leyton" -> "Paradise" in 30-21 = 9

        // return 6.66667, (5 + 6 + 9) / 3 = 6.66667
        System.out.println(undergroundSystem.getAverageTime("Leyton", "Paradise"));

  }


}