package slipperytoes.zootracker.Unsorted;

/**
 * Created by Thomas on 29/06/2016.
 */
public class Diet {

    private String name;
    private  String[] foods;
    private int count;

    public Diet(String inName, String[] inFoods)
    {
        foods = new String[inFoods.length];
        for(int i = 0; i < inFoods.length; i++)
        {
            foods[i] = new String(inFoods[i]);
        }
        name = inName;
    }
}
