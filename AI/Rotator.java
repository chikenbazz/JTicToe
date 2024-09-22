package AI;

public class  Rotator {
    static int[] dataGrid;
    static int[] toRotate;

    static int rotationState = 0;
/* Rotation State is not Working it will be fixed on later if we need*/
    public static void setData(int[] toRotate) {
        Rotator.rotationState = 0;
        Rotator.dataGrid = new int[toRotate.length];
//        toRotate = toRotateMatrix;
//        toRotate = toRotateMatrix.;
        Rotator.toRotate = toRotate;
        System.arraycopy(toRotate, 0, Rotator.dataGrid, 0, toRotate.length);

    }

    public static void rotateZero() {




    }

    public static void rotate() {

//        toRotate = rr;
        int tempRow;
        int jR = 0;
        int kR = 1;
        int jC = 0;
        int kC = 3;

        for (int i = 0; i < 3; i++) {
            for (int j = 1; j < 4; j++) {
//                tempColumn = dataGrid[kC + jC]; System.out.println("temp Column: "+tempColumn);
                tempRow = dataGrid[kR + jR];

//                System.out.println("data[kR + jR] = tempColumn;  "+data[kR+jR]);
               toRotate[kC + jC] = tempRow;   /* COLUMN */
//               System.out.println("data[kC + jC] = tempRow; "+data[kC +jC ]+"\n");
//                System.out.println("\n\n");
                jC += 3;
                kR++;
            }
            jC = 0;jR += 3;kR = 1;kC--;


        }

        for (int i = 0; i < toRotate.length; i++) {
            Rotator.dataGrid[i] = Rotator.toRotate[i];
        }
        if (Rotator.rotationState == 3) {
            Rotator.rotationState = 0;
        } else {
            Rotator.rotationState += 1;
        }

    }

    public static void reverseRotate() {
//        if(rotationState==0){rotate();
//        rotate();
//        rotate();}else if(rotationState==1){rotate();rotate();}

            Rotator.rotate();
            Rotator.rotate();
            Rotator.rotate();

        if (Rotator.rotationState == -3) {
            Rotator.rotationState = 0;
        } else {
            Rotator.rotationState += -1;
        }


    }
}
