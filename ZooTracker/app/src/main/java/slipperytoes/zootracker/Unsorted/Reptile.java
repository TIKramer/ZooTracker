package slipperytoes.zootracker.Unsorted;

/**
 * Created by Thomas on 29/06/2016.
 */
public abstract class Reptile extends Animal
{
    private double length;


    public Reptile(String inName, Enclosure inEnclosure, double inWeight, Carer inCarer, Diet inDiet, double inTemperatureMax, double inTemperatureMin, Location inLocation, boolean inPredator, Endangered inEndangered, double inLength)
    {
        super(inName, inEnclosure, inWeight, inCarer, inDiet, inTemperatureMax, inTemperatureMin, BloodType.COLD_BLOODED, inLocation, inPredator, inEndangered);
        length = inLength;
    }


}
