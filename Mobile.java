
/**
 * This is a superclass of any moveable thing in the game. Maybe it should be an interface? I think not;
 * the common thread is actually the data below, not a method "move".
 */
public abstract class Mobile extends GameplayElement
{
    private Setting location; //Which room or location it is in.
    private int xCor; //Where in the room it is on the x axis
    private int yCor; //Where in the room it is on the y axis
}
