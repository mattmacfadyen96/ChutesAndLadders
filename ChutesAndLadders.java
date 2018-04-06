import java.io.*;
import java.util.*;
/**
 * This is the ChutesAndLadders class it will be used to simulate the board game Chute and Ladders.
 * It will construct Chutes and Ladders objects that will be able to use the methods implemented below. 
 * Some of these methods inclue running the simulation of chutes and ladders, returning the most landed on 
 * space in a given number of simulations, the average number of chutes and ladders for the simluation and 
 * the average number of spins it takes to complete a game in the given number of simulations. An array
 * will be used to keep track of the number of times a space is "landed" on. A space has been landed on
 * after all movement has been done. So this means after falling down a chute or climbing up a ladder. 
 * 
 * @author Matthew MacFadyen
 * @version February 3nd, 2017 
 */
public class ChutesAndLadders
{
    // instance variables are set up here for the ChutesAndLadders  
    private int board[] = new int[101];
    private int numSpin;
    private int simulationNum;
    private int numChutes;
    private int numLadders;
    private int mostCommonSpace;
    private ArrayList<Integer> spins_game = new ArrayList<Integer>();
    private ArrayList<Integer> chutes_game = new ArrayList<Integer>();
    private ArrayList<Integer> ladders_game = new ArrayList<Integer>();

    /**
     *This is a constructor for the objects of the ChutesAndLadders class 
     */
    public ChutesAndLadders()
    {
        // initialise instance variables
    }

    /**
     * This method will simulate the game Chutes and Ladders by creating an object from the Random class.
     * It will mostly be inside of a for loop that will increment until it reaches the desired number of
     * games to be played. The inner while loop will simulate a piece moving along the 100 space board and 
     * it will stop once it reached the length of the array minus one because space 0 in the array is off the 
     * board. ALl of the cases to handle the chutes and the ladders will be done in if statements and then the 
     * data will be held onto for further manipulation 
     * 
     * @param int simulationCount the number of games that are to be played 
     *  
     */
    public void runSimulation(int simulationCount)
    {
        // create random object to simulate the spinner 
        Random rand = new Random();

        //variable to keep track of the current space on the board
        int currentSpace = 0; 

        // start from zero and loop until it reachs number of simulations
        for(int i = 0; i < simulationCount; i++)
        {
            // keep looping until space 100 is reached and the game is won
            while(currentSpace < board.length-1)
            {

                // spin the wheel and move your piece that many spaces

                int spinNum = rand.nextInt(6) + 1;

                currentSpace = currentSpace + spinNum; 
                //increment the spin number to keep track of spins 
                numSpin++;
                
                // check to make sure that the game has been won if not keep going 
                if(currentSpace != 100)
                {
                    // make sure that the spin does does not exceed space number 100 
                    if(currentSpace > 100)
                    {
                        // if it does then send the piece back to its original position
                        currentSpace = currentSpace - spinNum;
                    }
                    // climb the ladder to space 14
                    else if(currentSpace == 4)
                    {
                        //change the space number because the ladder has been climbed 
                        currentSpace = 14;

                        // tally that the space has been landed on for manipulation later 
                        board[currentSpace]++;

                        //increment the ladder count
                        numLadders++;
                    }
                    // climb the ladder to space 31 
                    else if(currentSpace == 9)
                    {

                        //change the space number because the ladder has been climbed
                        currentSpace = 31;

                        // tally that the space has been landed on for manipulation later
                        board[currentSpace]++;

                        //increment the ladder count
                        numLadders++;
                    }
                    // fall down the cute back to space 6
                    else if(currentSpace == 16)
                    {
                        // change the current space 
                        currentSpace = 6;
                        
                        // increment the land count 
                        board[currentSpace]++;
                        
                        //increment the chute count
                        numChutes++;
                    }
                    // climb the ladder to space 38
                    else if(currentSpace == 20)
                    {
                        // change the current space
                        currentSpace = 38;

                        board[currentSpace]++;

                        numLadders++;
                    }
                    // climb the ladder to space 42 
                    else if(currentSpace == 21)
                    {

                        currentSpace = 42;

                        board[currentSpace]++;

                        numLadders++;
                    }
                    // climb the ladder to space 84
                    else if(currentSpace == 28)
                    {

                        currentSpace = 84;

                        board[currentSpace]++;

                        numLadders++;
                    }
                    // climb the ladder to space 44 
                    else if(currentSpace == 36)
                    {

                        currentSpace = 44;

                        board[currentSpace]++;
                        
                        numLadders++;
                    }
                    // fall down the chute to space 26
                    else if(currentSpace == 48)
                    {

                        currentSpace = 26;

                        board[currentSpace]++;
                        numChutes++;
                    }
                    // fall down the chute to space 11
                    else if(currentSpace == 49)
                    {

                        currentSpace = 11;

                        board[currentSpace]++;

                        numChutes++;
                    }
                    // climb the ladder to space 67
                    else if(currentSpace == 51)
                    {

                        currentSpace = 67;

                        board[currentSpace]++;
                        numLadders++;
                    }
                    // fall down the chute to space 53
                    else if(currentSpace == 56)
                    {

                        currentSpace = 53;

                        board[currentSpace]++;
                        numChutes++;
                    }
                    // fall down the chute to space 19
                    else if(currentSpace == 62)
                    {

                        currentSpace = 19;
                        board[currentSpace]++;
                        numChutes++;
                    }
                    // fall down the chute to space 60
                    else if(currentSpace == 64)
                    {

                        currentSpace = 60;

                        board[currentSpace]++;

                        numChutes++;
                    }
                    // climb the ladder to space 91
                    else if(currentSpace == 71)
                    {

                        currentSpace = 91;

                        board[currentSpace]++;

                        numLadders++;
                    }
                    // this ladder takes you to space 100 so not tally it because the game has been won 
                    else if (currentSpace == 80)
                    {

                        currentSpace = 100; 
                        numLadders++;
                    }
                    // fall down the chtue to space 24
                    else if(currentSpace == 87)
                    {

                        currentSpace = 24; 
                        board[currentSpace]++;
                        numChutes++;
                    }
                    // fall down the chute to space 73
                    else if(currentSpace == 93)
                    {

                        currentSpace = 73;

                        board[currentSpace]++;

                        numChutes++;
                    }
                    // fall down the chute to space 75
                    else if(currentSpace == 95)
                    {

                        currentSpace = 75;

                        board[currentSpace]++;

                        numChutes++;
                    }
                    // fall down the chute to space 78
                    else if(currentSpace == 98)
                    {

                        currentSpace = 78; 

                        board[currentSpace]++;

                        numChutes++;
                    }
                    // if it does not land on any chutes or ladders and it is just a regular space 
                    else {
                        board[currentSpace]++;
                    }    
                }
            }

            //add the number of spins from that game to the array list 
            spins_game.add(numSpin);

            // add the number of chutes from the game to the chutes array list 
            chutes_game.add(numChutes); 

            // add the number of ladders to the ladders array list 
            ladders_game.add(numLadders);

            //reset the number of spins back to zero for the next game simulation 
            numSpin = 0; 

            // reset the number of chutes back to zero for the next simulation
            numChutes = 0;

            // reset the number of ladders back to zero for the next simulation 
            numLadders = 0;

            // increment the game count
            simulationNum++; 

            //set the current space back to zero
            currentSpace = 0;
        }
    }

    /**
     * this method will be used to average in the numbers of spins it takes in a simulation to win the game 
     * it will loop through the array list of spins it took to complete a game which is held in an array 
     * list. It will add each element together to get the sum of spins per game and then it will divide by 
     * the number of simulations and then return that number which will be the average number of spins 
     * 
     * @return the average number of spins it takes for the number of simulations.  
     * 
     */
    public double getAverageSpins()
    {
        // initialize the average spin variable 
        double averageSpins = 0.0;

        //initialize a variable that will be used to add all the numSpins per game
        double sum = 0.0;

        //take all of the numSPins from each game and divide by the number of simulations 
        for(int i = 0; i < spins_game.size(); i++)
        {
            sum = sum + spins_game.get(i); 
        }

        // divide the sum of spins by the number of simulations
        averageSpins = sum / simulationNum;

        return averageSpins;
    }

    /**
     * gets the average number of chutes landed on in a given number of simulations. It will do this by 
     * iterating through the number of chutes landed on in the Array List of chutes per game. It will add 
     * each number to the sum and then after the loop it will take the sum and divide it by the number of 
     * simulations that were run. It will then return the average number of chutes. 
     * 
     * @return the average number of chutes landed on averaged in a given simulation 
     */
    public double getAverageChutes()
    {
        // initialize the average chutes variable 
        double averageChutes = 0.0;

        //initialize a variable that will be used to add all the numSpins per game
        double sum = 0.0;

        //take all of the numSPins from each game and divide by the number of simulations 
        for(int i = 0; i < chutes_game.size(); i++)
        {
            sum = sum + chutes_game.get(i); 
        }

        // divide the sum of spins by the number of simulations
        averageChutes = sum / simulationNum;

        return averageChutes;
    }

    /**
     * gets the average number of ladders landed on in a given number of simulations. It will loop through 
     * each games number of ladders landed on that was stored in an array list and add that to the sum of
     * ladders for the entire simulation. It will then take the sum and divide it by the number of simulations
     * that were run 
     * 
     * @return the number of ladders landed on in a simulation 
     */
    public double getAverageLadders()
    {
        double averageLadders = 0.0;

        //initialize a variable that will be used to add all the numSpins per game
        double sum = 0.0;

        //take all of the numSPins from each game and divide by the number of simulations 
        for(int i = 0; i < ladders_game.size(); i++)
        {
            sum = sum + ladders_game.get(i); 
        }

        // divide the sum of spins by the number of simulations
        averageLadders = sum / simulationNum;
        return averageLadders;
    }

    /**
     * this method will be used to find the most common space landed on ina given number of simulatations
     * It will loop through the entire array that I used to simulate the board and then it will find the
     * the element in the array with the greatest number of tallies that indicates which space was landed 
     * on the most
     * 
     * @return the most common space that was landed on in the given number of simulations
     */
    public int getMostCommonSpace()
    {
        // declare a temp to store the most common value
        int mostCommonSpace = 0;
        
        // a temp to be used to compare space values 
        int mostCommonSpaceValue = 0;

        // do not loop unti
        for(int i = 0; i < board.length-1; i++)
        {
            if(board[i] > mostCommonSpaceValue)
            {
                // put the new greatest value into a temp to be compared 
                mostCommonSpaceValue = board[i];
                
                // put that space into a variable that will be returned
                mostCommonSpace = i;
            }
        }

        return mostCommonSpace;
    }
}
