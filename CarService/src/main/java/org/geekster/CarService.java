package org.geekster;
import java.util.HashMap;
public interface CarService {
    HashMap<String, Pair> getServicePrices();


    public int basicService();

    public int engineFixing();

    public int clutchFixing();

    public int brakeFixing();

    public int gearFixing();

}
