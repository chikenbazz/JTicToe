package GameConfiguration.Modal;
/* TIC TOE SOLO PLAYER */
public class TSP extends TTCM {
    public TSP () {
        System.out.println("A message from TSP gameModal`");
    }

    @Override
    public boolean takePosition(Integer integer) {
         int i = integer;
         if(turn){ gameData[i] = 1;}else {
             gameData[i] = 2;
         }
         NextsTurn();
         return true;


    }
    public void NextsTurn(){
        if(!turn){turn = true;}else {turn = false;}}
    public boolean getTurn(){return turn;}
    public boolean isAllBoxFilled(){return false;}
}
