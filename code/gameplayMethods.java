/*
 * Names: Jacob and Jun
 * Teacher: Mr. A
 * Due Date: December 5th, 2019
 * Description: class containing methods to get the right feedback based on guesses
 */
public class gameplayMethods {
    final int NODENUM = 4;
    final int COLOURNUM = 6;
    public int[] getHint(int[] guess, int[] secretCode) { //Method for getting the hint and returns hint in an array
        //Determines whether a node in the code has been used already
        boolean isUsed[] = new boolean[NODENUM];
        boolean guessIsUsed[] = new boolean[NODENUM];
        int hint[] = new int[NODENUM];
        int counter = 0;
        //Set black pegs
        for (int i = 0; i < NODENUM; i++) {
            if (guess[i] == secretCode[i]) {
                isUsed[i] = true;
                guessIsUsed[i] = true;
                hint[counter] = 2;
                counter++;
            }
        }
        //Set white pegs
        for (int i = 0; i < NODENUM; i++) {
            if (!guessIsUsed[i]) {
                for (int j = 0; j < NODENUM; j++) {
                    if (guess[i] == secretCode[j] && !isUsed[j]) {
                        isUsed[j] = true;
                        guessIsUsed[i] = true;
                        hint[counter] = 1;
                        counter++;
                        break;
                    }
                }
            }
        }
        return hint;
    }
}