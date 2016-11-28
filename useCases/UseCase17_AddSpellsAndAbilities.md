#Use Case 17 – Add Spells and Abilities


**Actor:** Player

**Main Path:**
1.	Player selects add spells and abilities to their character.
2.	Character handler program opens up the add spells and abilities method.
3.	The player is shown a list of spells and abilities available to their character.
4.	The player is also shown future spells and abilities that will become available to them when their character reaches the requirements.
5.	The player selects the desired spell or ability to add to their character.
6.	The character handler program adds the spell or ability to the first available slot of the character.
7.	The player chooses to exit the function.
8.	Character handler program returns to the main menu.


**Alternate paths:**
5.a	Player selects spell or ability that is not yet available to them.
  5.b	The character handler program displays a message telling the player that the selection is not yet available.
  5.c	The character handler program returns to the select spell and ability screen.
7.a	The player chooses to add another spell or ability to their character.
  7.b	The character handler program adds the spell or ability to the next available slot of the character.

**Author: Sean Healy**
