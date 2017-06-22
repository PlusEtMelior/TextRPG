
/**
 * This class is a parent class for any in-game object.
 */
package text_rpg;
public abstract class GameplayElement
{
    private String description;
    private String name;
    GameplayElement()
    {
        name = "nameless";
        description = "formless";
    }
    GameplayElement(String newName, String newDescription)
    {
        name = newName;
        description = newDescription;
    }
    public String getName()
    {
        return name;
    }
    public String getDescription()
    {
        return description;
    }
}
