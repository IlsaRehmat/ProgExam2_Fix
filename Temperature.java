import java.util.ArrayList;
import java.util.Collections;
// /**
 // * Write a description of class Temperature here.
 // *
 // * @author (your name)
 // * @version (a version number or a date)
 // */
// public class Temperature{
    // ArrayList<Double> temperatures = new ArrayList<Doubble>();    //25
    
// }
/**
 * Write a description of class Temperature here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Temperature{
    ArrayList<Double> temperatures = new ArrayList<Double>();
    //25
    public void analyzeTemperatures(ArrayList<Double> temperatures){
        int feverCount = 0;
        double maxTemperature = temperatures.get(0);
        for(double temperature : temperatures){
            if(temperature > 37.5){
                feverCount++;
            }
            if(temperature > maxTemperature){
                maxTemperature = temperature;
            }
        }
        System.out.println("Number of fevers: " + feverCount);
        System.out.println("Maximum temperature:" + maxTemperature);
    }
    
    //26
    public void printMaxTemperature(ArrayList<Double> temperatures){
        double maxTemperature = Collections.max(temperatures);
        System.out.println("Maximum temperature:" + maxTemperature);
    }
    
    //27
    public void printMaxTemperatureSorted(ArrayList<Double> temperatures){
        Collections.sort(temperatures);
        System.out.println("Maximum temperature:" + temperatures.getLast());
           
    }
}
