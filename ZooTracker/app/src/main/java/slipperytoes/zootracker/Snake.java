package slipperytoes.zootracker;

/**
 * Created by Thomas on 29/06/2016.
 */
public class Snake extends Reptile
{
   private Vemenous vemenous;
    public Snake(String inName, Enclosure inEnclosure, Carer inCarer, double inWeight, Diet inDiet, double inTemperatureMax, double inTemperatureMin, Location inLocation, Endangered inEndangered, double inLength, Vemenous inVemenous){
        super(inName, inEnclosure,  inWeight, inCarer,  inDiet,  inTemperatureMax,  inTemperatureMin, inLocation, true,  inEndangered, inLength);
        vemenous = inVemenous;

    }
   // public Snake(String species){
       // super();
       //}

}
