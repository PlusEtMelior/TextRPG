
/**
 * Write a description of class Driver here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
package text_rpg;
public class Driver
{
    public static void main(String[] args)
    {
        Gamestate state = new Gamestate();
        Interpreter interp = new Interpreter();
        String inp = "";
        while(true)
        {
            //Take input
            interp.respond(inp);
        }
    }
}
