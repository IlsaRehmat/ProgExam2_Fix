
/**
 * Write a description of class Temperature here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Temperature
{
    
    //25
    public void analyzeTemperatures(ArrayList<Double>temperatures){
        int feverCount = 0;
        double maxTemperature = Double.Min_Value;
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
    public void printMaxTemperature(ArrayList<Double>temperatures){
        double maxTemperature = Collections.max(temperatures);
        System.out.println("Maximum temperature:" + maxTemperature);
    }
    
    //27
    public void printMaxTemperatureSorted(ArrayList<Double>temperatures){
        double maxTemperature = Collections.sort(temperatures);
        System.out.println("Maximum temperature:" + maxTemperature);
    }
}
