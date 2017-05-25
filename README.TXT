------------------------------------------------------------------------
This is the project README file. Here, you should describe your project.
Tell the reader (someone who does not know anything about this project)
all he/she needs to know. The comments should usually include at least:
------------------------------------------------------------------------

PROJECT TITLE:
PURPOSE OF PROJECT:
VERSION or DATE:
HOW TO START THIS PROJECT:
AUTHORS:
USER INSTRUCTIONS:

I need to figure out how to handle objects of commands. It could be that each command is class that records
both itself and the objects it can take. I also need some way to store how commands are interpreted. I think
that the main question right now is whether to have several lists that work in conjunction or to have a few
lists that contain elements with a lot of information. The latter is probably easier, but it might be more
computationally expensive. I am not sure. I know that it will be more memory expensive, but I can simply
allocate more heap space.

Another question is how to store the gamestate. I *think* I will do this through another class.

The Settings will be linked in a graph. This is logical because in a simple dungeon crawl, rooms are
connected to other rooms or not connected. Each room has certain rooms that they link to and those rooms
*usually* link back. I know that there are many ways of implementing graphs, so I need to do some reading
connecting the Settings.

The main issue that I am facing right now is how to store and define commands. I know that stuff will follow
a [command] [object] [modifiers] format, but what *is* a command? This way, it sounds like a method that
potentially alters game elements and returns a string to show to the user. So where are these methods?
Maybe there is a class with a bunch of static methods that holds the commands? How does this get mutated?

Another question is how to *organize* commands. They can be in a tree, organizing them by category. They
could just be stored in whatever format is easiest to search efficiently. Hmmm…

Text RPG Project

Interface Description (Goal): The player will input text commands for a character into a console.
The console will respond with the result of the commands in text form. Sometimes, a JPanel window will
pop up to enhance the ability of the text console.

Gameplay Abstract: The player’s character explores a fantasy world without a specific goal, mostly
crawling through dungeons. Difficulty will arise from combat, from resource management, and from puzzles.