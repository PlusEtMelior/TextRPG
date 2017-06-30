package text_rpg;


/**
 * Write a description of class Process here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public abstract class Process
{
    public abstract boolean isDone();
    /**
     * A method to determine if the process should be removed from the process list.
     * Gamestate will use it to determine if the process should be removed.
     */
    private Action instructions;
    /**
     * Does the ongoing thing. This may just be upping an iterator or it might *do*
     * something.
     */
}