package slipperytoes.zootracker;

import java.util.GregorianCalendar;

/**
 * Created by Thomas on 29/06/2016.
 */
public abstract class Animal
{
    private String name;
    private GregorianCalendar dateOfBirth;



    private Enclosure enclosure;



    private double weight;
    private Carer carer;
    private Diet diet;
    private double temperatureMax;
    private double temperatureMin;
    private BloodType bloodType;
    private Location location;
    private boolean predator;
    private Endangered endangered;
    public Animal()
    {

    }
    public Animal(String inName, Enclosure inEnclosure, double inWeight, Carer inCarer, Diet inDiet, double inTemperatureMax, double inTemperatureMin, BloodType inBloodType, Location inLocation, boolean inPredator, Endangered inEndangered)
    {
        name = inName;
        enclosure = inEnclosure;
        carer = inCarer;
        weight = inWeight;
        diet = inDiet;
        temperatureMax = inTemperatureMax;
        temperatureMin = inTemperatureMin;
        bloodType = inBloodType;
        location = inLocation;
        predator = inPredator;
        endangered = inEndangered;
    }

    public boolean validateEnclosure(Enclosure inEnclosure)
    {
        boolean valid = false;
        if (inEnclosure.getTemperatureMin() >= this.getTemperatureMin() && inEnclosure.getTempertureMax() <= this.getTemperatureMax())
        {
            valid = true;
        }
        return valid;
    }


    public String getName()
    {
        return name;
    }

    public GregorianCalendar getDateOfBirth()
    {
        return dateOfBirth;
    }

    public Enclosure getEnclosure()
    {
        return enclosure;
    }

    public double getWeight()
    {
        return weight;
    }

    public Carer getCarer()
    {
        return carer;
    }

    public Diet getDiet()
    {
        return diet;
    }

    public double getTemperatureMax()
    {
        return temperatureMax;
    }

    public double getTemperatureMin()
    {
        return temperatureMin;
    }

    public BloodType getBloodType()
    {
        return bloodType;
    }

    public Location getLocation()
    {
        return location;
    }

    public boolean isPredator()
    {
        return predator;
    }

    public Endangered getEndangered()
    {
        return endangered;
    }


}
