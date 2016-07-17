package slipperytoes.zootracker.Unsorted;

/**
 * Created by Thomas on 29/06/2016.
 */
public class Enclosure {
    private String name;



    private double size;
    private int numOfTrees;
    private int ammountOfWater;
    private double heightOfWalls;
    private double temperatureMin;
    private double tempertureMax;

    public Enclosure(String name, double size, int numOfTrees, int ammountOfWater, double heightOfWalls, double temperatureMin, double tempertureMax) {
        this.name = name;
        this.size = size;
        this.numOfTrees = numOfTrees;
        this.ammountOfWater = ammountOfWater;
        this.heightOfWalls = heightOfWalls;
        this.temperatureMin = temperatureMin;
        this.tempertureMax = tempertureMax;
    }

    public String toString()
    {

        return "" +name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getSize() {
        return size;
    }

    public void setSize(double size) {
        this.size = size;
    }

    public int getNumOfTrees() {
        return numOfTrees;
    }

    public void setNumOfTrees(int numOfTrees) {
        this.numOfTrees = numOfTrees;
    }

    public int getAmmountOfWater() {
        return ammountOfWater;
    }

    public void setAmmountOfWater(int ammountOfWater) {
        this.ammountOfWater = ammountOfWater;
    }

    public double getHeightOfWalls() {
        return heightOfWalls;
    }

    public void setHeightOfWalls(double heightOfWalls) {
        this.heightOfWalls = heightOfWalls;
    }

    public double getTemperatureMin() {
        return temperatureMin;
    }

    public void setTemperatureMin(double temperatureMin) {
        this.temperatureMin = temperatureMin;
    }

    public double getTempertureMax() {
        return tempertureMax;
    }

    public void setTempertureMax(double tempertureMax) {
        this.tempertureMax = tempertureMax;
    }

}
