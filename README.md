# Code Breaker

![Title Screen](/code/Images/titleScreen.png?raw=true "Title Screen")

For my grade 12 Computer Science class, I had to make the game Code Breaker in Java built with its own GUI and Artificial Intelligence. This is the original project so there may be some improvements that I can make after another year of coding experience. 

Computer and player classes have been created to show the knowledge of how object oriented programming works (as was required in the rubric). This project also implements Knuth's Five-Guess Algorithm as the AI which uses Mini-max to deteremine the player's code in five or less guesses. To maintain integrity of the game, there is no option for the player to enter a code. Instead, the player must remember their own code and give honest feedback. For the GUI, we used Java's most basic library, Swing, which we learned in class. We also added a feature that saves game data in a file so that the user can see the results from their games with the computer. Overall, the project was a success and we were able to get a very high mark on the assignment.

![Computer Guessing](/code/Images/compGuess.png?raw=true "Computer Guessing")

This is what it looks like when the computer has guessed the code (5 or less guesses).

Note: 
-When player is entering hints, the hints must have all black hint nodes on the left, then all white hint nodes afterwards
-If the player does not order it in that way the player will have trouble setting the code

![Player Guessing](/code/Images/playerGuess.png?raw=true "Player Guessing")

This is what it looks like when the player is guessing. We made our own drag and drop to make gameplay more intuitive.
