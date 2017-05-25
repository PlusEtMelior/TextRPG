
/**
 * Write a description of class Location here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
import java.util.*;
public class Setting extends GameplayElement
{
    private ArrayList<Mobile> contents; //the moveable elements in the Setting
    public Setting(String name, String description) //constructs it with no contents
    {
        super(name, description);
        contents = new ArrayList<Mobile>();
    }
    public Setting(String name, String description, Mobile[] mobiles) //constructs with a list of mobiles
    {
        super(name, description);
        //contents = new ArrayList<Mobile>(mobiles); I need to check if ArrayLists can use arrays as args
    }
    public Mobile getMobile() //returns the first element in the list
    {
        return contents.get(0);
    }
    public Mobile getMobile(int i) //returns the element at position i
    {
        return contents.get(i);
    }
}
