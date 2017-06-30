
/**
 * Write a description of class Gamestate here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
  
package text_rpg;
import java.util.*;
public class Gamestate extends ProgramElement
{
    private Setting currLocation; //The current room or area the character is in.
    public List processes; //a list of processes to check on
    private List actions; //a list of actions to be executed 
    public void update() //a function that changes information about the gamestate as neccessary
    {
        //first go through processes, adding any actions to the list then checking to remove them
        //then go through the actions an do them
    }
}
