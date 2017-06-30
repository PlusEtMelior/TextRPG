This is in the "Processes" branch of the project (assuming I didn't fuck up with git). Its
purpose is to design the process, action, and parser interfaces and classes and to design
how Gamestate uses them.

One current problem is what data structures Gamestate should use to hold processes and events.
I think processes can be held in a heap, which could either be implemented with a large array
or a singly linked list. (I prefer the list implementation because I have no sense of how
many or few processes there would be.) The actions should be held in a data structure conducive
to sorting; perhaps a tree would work best.