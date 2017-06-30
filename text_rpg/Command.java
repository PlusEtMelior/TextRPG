
/**
 * Commands will be stored as objects of this class.
 */
package text_rpg; 
public class Command
{
    private String name; //To identify the command
    private Action instructions; //The result, if any of the command
    private Parser respond;
    /**
     * This gets a string to give to the user. It is separate from instructions because
     * it will be called after all the actions are resolved so that it references up-to-
     * date information.
     */
}
