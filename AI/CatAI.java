package AI;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.nio.Buffer;
import java.util.Random;
import java.util.Scanner;
import java.util.random.*;

public class CatAI extends AIPlayer implements GameBehaviour{

    boolean Coin;

    Random  coin = new Random();
    Random rNum = new Random();
    Scanner input = new Scanner(System.in);


    public void DisplayInfo(){
        System.out.println("Hey, I am a Cat AI. Do You want to Play with me?");
        Coin = rNum.nextBoolean();
        Play();
    }
    private  boolean FirstMoverIsNotAUser(){
            if(Coin){return false;}else {return true;}
    }

    private boolean isGameStateIsZero(){
        for (int i = 1; i <gameState.length ; i++) {
            if(gameState[i] != 0){
                    return false;
            }

        }
        return true;

    }
    private boolean isDiagonalNotEmpty(){
        if(gameState[1] != 0 && gameState[3] != 0 && gameState[7] !=0 && gameState[9]!=0){
            return true;

        }
        return false;

    }
    private void checkInRow(){
        if(!putted){
            for (int i = 1; i < 8; i += 3) {
                if ((gameState[i] == gameState[i + 1] && gameState[i] == 2) || (gameState[i] == gameState[i + 2] && gameState[i] == 2) || (gameState[i + 1] == gameState[i + 2] && gameState[i + 1] == 2)) {
                    for (int j = 0; j < 3; j++) {
                        if (gameState[i + j] == 0) {
                            put(i + j, false);

                            break;
                        }

                    }
                }
                if (putted){break;}
            }}

    }
    private void checkInColumn(){
        /* FOR VERTICAL CROSS */
        if (!putted){for (int j = 1; j < 4; j++) {
            if (gameState[j] == gameState[j + 3] && gameState[j] == 2 || gameState[j] == gameState[j + 6] && gameState[j + 6] == 2 || gameState[6] == gameState[j + 3] && gameState[j + 6] == 2) {
                for (int i = 0; i < 7; i += 3) {
                    if (gameState[i + j] == 0) {
                        put(i + j, false);
                        break;
                    }
                }
            }
            if (putted) {
                break;
            }
        }}

    }
    public boolean OnlyDiagonalsOccupied(){
        if(gameState[2] == 0 && gameState[4] == 0 && gameState[6] ==0 && gameState[8]==0 && gameState[5]==0){
            return true;

        }
        return false;

    }
    public void checkInDiagonal(){
        if(!putted) {
            if ((gameState[1] == gameState[5] && gameState[1] == 2) || ( gameState[1] == gameState[9] && gameState[1] == 2) || (gameState[5] == gameState[9] && gameState[5] == 2 )) {
                if(gameState[1] == 0){
                    put(1, false);
                } else if (gameState[5] == 0) {
                    put(5, false);
                } else if (gameState[9]==0) {
                    put(9, false);
                }
            } else if ((gameState[3] == gameState[5] && gameState[3] == 2 )|| (gameState[3] == gameState[7] && gameState[3] == 2 )|| (gameState[5] == gameState[7] && gameState[7] == 2)) {
                if(gameState[3] == 0){
                    put(3, false);
                } else if (gameState[5] == 0) {
                    put(5, false);
                } else if (gameState[7]==0) {
                    put(7, false);
                }
            }
        }

    }
    private void catsChoice(){
        if(!putted){/* put in diagonals */if(isGameStateIsZero()){put(gameState[diagonals[rNum.nextInt(0,3)]], false);}
        }
        if(!putted){
            if (!isDiagonalNotEmpty()) {
                if(gameState[1]==1 && gameState[9] == 0){
                    put(9, false);
                } 
                else if (gameState[3] == 1 && gameState[7] == 0) {
                    put(7, false);
                } else if (gameState[7] ==1 && gameState[3] == 0) {
                    put(3, false);
                } else if (gameState[9]==1 && gameState[1] == 0) {
                    put(1, false);
                }


            }}
        if(!putted){
            if (isDiagonalNotEmpty()) {
                put(edges[rNum.nextInt(0, 3)], false);
            }}
        if(!putted){if (OnlyDiagonalsOccupied() && FirstMoverIsNotAUser()){
            int[] diagonal = {};
        }}
        //if(!putted){}

    }

    private void CatsPlay() {
        checkInColumn();
        checkInRow();
        checkInDiagonal();
        catsChoice();



//        if(Coin){put(edgePos[num.nextInt(0, 3)], false );



    }

    public void Play(){

        while(!gameOver){
            CatsPlay();
            int uTurn = input.nextInt();
            put(uTurn, true);
            gameOver = analyze();





        }
        System.out.println("Game Over! (Data preview)");
        for (int i = 1; i <gameState.length ; i++) {

                System.out.print(gameState[i] + " ");
                if(i==3||i==6){
                    System.out.print("\n");
                }
        }
        if(winnerID == 2){
            System.out.println("-----User got win  >>>>>>>>>>");
        } else if (winnerID ==0) {
            System.out.println("<++++++ D R A W  <<<<***>>>> D R A W ++++++++");
            
        }else {
            System.out.println("-----AI got win   >>>>>>>>>>");
        }
        newGame();

    }
}
