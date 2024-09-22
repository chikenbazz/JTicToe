package tools;

import java.util.Objects;

public class Analyzer {


    public static int winnerID;
    public int[] diagonals = {1, 3,  7, 9};
    public int[] edges   = {2, 4, 6, 8};

    public static boolean analyze(Integer[] data){
        /* FOR HORIZONTAL CROSSES*/
        for (int i = 1; i <8; i += 3) {
            if (Objects.equals(data[i], data[i + 1]) && data[i+2] != 0 && Objects.equals(data[i], data[i + 2])){
                winnerID = data[i];
                return true;}
        }
        /* FOR VERTICAL CROSS */
        for (int j = 1; j < 4; j++) {
            if (Objects.equals(data[j], data[j + 3]) && data[j + 6] != 0 && Objects.equals(data[j + 3], data[j + 6])) {
                winnerID = data[j];
                return true;
            }
        }
        /* FOR DIAGONAL CROSS **/
        if ((Objects.equals(data[1], data[5]) && data[9] != 0 && data[9].equals(data[1]))){
            winnerID = data[1];
            return true;
        }else if(Objects.equals(data[3], data[5]) && data[8] !=0 && data[8].equals(data[5])){
            winnerID = data[5];
            return true;
        }

        return false;

    }
    public static int getWinnerId(){
        return winnerID;

    }
/* *
    private void checkInRow(){
        if(!putted){
            for (int i = 1; i < 8; i += 3) {
                if ((data[i] == data[i + 1] && data[i] == 2) || (data[i] == data[i + 2] && data[i] == 2) || (data[i + 1] == data[i + 2] && data[i + 1] == 2)) {
                    for (int j = 0; j < 3; j++) {
                        if (data[i + j] == 0) {
                            put(i + j, false);

                            break;
                        }

                    }
                }
                if (putted){break;}
            }}

    }
    private void checkInColumn(){
        /* FOR VERTICAL CROSS */ /* *
        if (!putted){for (int j = 1; j < 4; j++) {
            if (data[j] == data[j + 3] && data[j] == 2 || data[j] == data[j + 6] && data[j + 6] == 2 || data[6] == data[j + 3] && data[j + 6] == 2) {
                for (int i = 0; i < 7; i += 3) {
                    if (data[i + j] == 0) {
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
    public void checkInDiagonal(){
        if(!putted) {
            if ((data[1] == data[5] && data[1] == 2) || ( data[1] == data[9] && data[1] == 2) || (data[5] == data[9] && data[5] == 2 )) {
                if(data[1] == 0){
                    put(1, false);
                } else if (data[5] == 0) {
                    put(5, false);
                } else if (data[9]==0) {
                    put(9, false);
                }
            } else if ((data[3] == data[5] && data[3] == 2 )|| (data[3] == data[7] && data[3] == 2 )|| (data[5] == data[7] && data[7] == 2)) {
                if(data[3] == 0){
                    put(3, false);
                } else if (data[5] == 0) {
                    put(5, false);
                } else if (data[7]==0) {
                    put(7, false);
                }
            }
        }

    } **/

//    public void analyze2 (){
//        for (int i = 0; i <8 ; i=+3) {
//            for (int j = 1; j <4 ; j++) {
//
//            }
//
//        }
//    }
}
