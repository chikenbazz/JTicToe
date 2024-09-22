package GameConfiguration.Modal;

import tools.Analyzer;

import java.util.ArrayList;

/* TIC-TOE CAT MODAL  (full game modal) */
public abstract class TTCM {
/** Make Array list in Place of it **/
    public static Integer[] gameData = new Integer[]{0,0,0,0,0,0,0,0,0,0};
    public static  int noOfPlayedGames = 0;
    public static  int noOfWins = 0;
    public static  String noOfGames = String.valueOf(noOfPlayedGames);
    public boolean win;
    public boolean turn = false;
    public int winnerId;

    public static String getNoOfWins(){
        return noOfGames;
    }
    public abstract boolean takePosition(Integer integer);

    public abstract boolean getTurn();/* **********

    public static boolean getTurn(){
        return turn;

    } */
    public abstract boolean isAllBoxFilled();
    public void newGame(){
        win = false;
        noOfPlayedGames+= 1;
        for (int i = 1; i <gameData.length ; i++) {
            gameData[i]=0;
        }
    }
    public void Analyze(){
        win = Analyzer.analyze(gameData);
        if (win){
            winnerId = Analyzer.getWinnerId();

        }
    }


}
