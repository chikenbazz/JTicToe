package AI;

import java.util.concurrent.Delayed;

public abstract class  AIPlayer {
    public Moves storage = new Moves();
    public int[] gameState = {0, 0, 0,0,0, 0,0,0,0, 0};
    public boolean gameOver;
    public int winnerID = 0;
    public boolean putted = false;
    public int[] diagonals = {1, 3,  7, 9};
    public int[] edges   = {2, 4, 6, 8};

    public void display(){
        for (int i = 1; i <gameState.length ; i++) {

            System.out.print(gameState[i] + " ");
            if(i==3||i==6){
                System.out.print("\n");
            }
            if(i==9){System.out.println("``````````````");}

        }
    }
    public void newGame(){


        for (int i = 1; i <gameState.length; i++) {
            gameState[i] = 0;
            putted = false;
            gameOver = false;
        }
        }

        public boolean analyze(){
            /* FOR HORIZONTAL CROSSES*/
        for (int i = 1; i <8; i += 3) {
            if (gameState[i]  == gameState[i+1] && gameState[i+2] != 0 && gameState[i] == gameState[i+2]){
                winnerID = gameState[i];
                return true;}
        }
        /* FOR VERTICAL CROSS */
        for (int j = 1; j < 4; j++) {
            if (gameState[j] == gameState[j + 3] && gameState[j + 6] != 0 && gameState[j+3]  == gameState[j+6]) {
                winnerID = gameState[j];
                return true;
            }
        }
        /* FOR DIAGONAL CROSS **/
        if ((gameState[1] == gameState[5] && gameState[9] != 0 && gameState[9] == gameState[1])){
            winnerID = gameState[1];
            return true;
        }else if( gameState[3] == gameState[5] && gameState[8] !=0 && gameState[8] == gameState[5]){
            winnerID = gameState[5];
            return true;
            }

        return false;

}
    public void put(int position, boolean itIsAUser){
        putted = false;
        if (gameState[position] == 0){
            if(itIsAUser){
                gameState[position] = 2;
                System.out.println("\nValue put by User");
                display();
            }else{
                gameState[position] = 1;
                putted = true;
                System.out.println("\nValue put by AI");

                display();
            }

        }else {
            System.out.println("Warning : You have already filled it (reset game to fill again)");
        }

    }
}
