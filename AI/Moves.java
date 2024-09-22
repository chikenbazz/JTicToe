package AI;

public class Moves {
    private final static int[] CORNERS_CONST = {1, 3, 7, 9 };
    private final static int[] EDGES_CONST   = {2, 4, 6, 8};
    private final static int[] CENTER_CONST = {5};

    private Integer[] CORNERS = {1, 3, 7, 9 };
    private Integer[] EDGES   = {2, 4, 6, 8};
    private Integer[] CENTER = {5};

    public int getFromCorners(int corner){
        return 0;
    }
    public int getFromEdges(int edge){
        return 0;
    }
    public int getCenter(){
        return 5;
    }
}
