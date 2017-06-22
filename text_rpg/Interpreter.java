
/**
 * Write a description of class Interpreter here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
  
package text_rpg;
import java.util.*;
public class Interpreter extends ProgramElement
{
    //some data structure holding commands
    public String takeInput() //I need some way of taking string input that includes whitespace characters
    {
        return null;
    }
    public String respond(String input) //used to respond to the user's commands
    {
        /**Note: input is probably not the right arg for currCommand 
         * It should be a new String that is the substring up to the first whitespace character
         */
        Command currCommand = matchCommand(input); //matches the input to the command
        if(currCommand != null) //stand-in for what it does understand
        {
        }
        return "I do not understand."; //if it cannot parse the input, it falls down to this and returns
    }
    private Command matchCommand(String input) //returns the command that matches the string
    {
        return null;
    }
}
