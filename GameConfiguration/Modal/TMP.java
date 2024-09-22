package GameConfiguration.Modal;
/* MultiPlayer Tic-Toe */
public class TMP extends TTCM  {
    public TMP () {


        System.out.println("A message from TMP gameModal`");
    }


    @Override
    public boolean takePosition(Integer integer) {
        int i = integer;
        if(turn){ gameData[i] = 1;}else {
            gameData[i] = 2;
        }
        Analyze();
        if(win){

            System.out.println(win + " <inside: Win> "+ winnerId);
            newGame();


            return true;

        }else {
            System.out.println(win + " <inside: not Win> "+ winnerId);
            NextsTurn();return false;
        }



    }
    public void NextsTurn(){
        if(!turn){turn = true;}else {turn = false;}}
    public boolean getTurn(){
        return turn;
    }
    public boolean isAllBoxFilled(){
        for (int i = 1; i < gameData.length; i++) {
            if(gameData[i] == 0){return false;}

        }
        return true;
    }
}
