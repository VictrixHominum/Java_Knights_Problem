// 13708535
// jholli05@dcs.bbk.ac.uk

import java.io.*;
import java.util.*;

public class Knight {

    public static int numMoves( int dim, int xstart, int ystart, int xtarget, int ytarget, int[] xrock, int[] yrock ) {

        // checks that the start and target spaces aren't blocked by a rock
        if (isRock(xstart, ystart, xrock, yrock) || isRock(xtarget, ytarget, xrock, yrock)) {
            return -1;
        }

        // Initialise starting co-ords and target co-ords, and all knight moves.
        int moves = 0;
        ArrayList<Integer> knight = new ArrayList<Integer>();
        knight.add(xstart);
        knight.add(ystart);
        knight.add(0);
        int[] targetPos = {xtarget, ytarget};
        int[] dx = {-2, -2, -1, -1, 1, 1, 2, 2};
        int[] dy = {-1, 1, -2, 2, -2, 2, -1, 1};

        // Initialise array of knights, adds the start knight
        ArrayList<ArrayList<Integer>> knights = new ArrayList<ArrayList<Integer>>();
        knights.add(knight);

        // Initialise board and set to not visited, apart from starting co-ord.
        boolean visited[][] = new boolean[dim + 1][dim + 1];
        for (int i = 1; i <= dim; i++) {
            for (int j = 1; j <= dim; j++) {
                visited[i][j] = false;
            }

        }
        // Sets starting co-ord to visited
        visited[knight.get(0)][knight.get(1)] = true;

        // Iterates through knights in the Arraylist of knights
        for (int j = 0; j < knights.size(); j++) {
            // Iterates through all possible single moves
            for (int i = 0; i < 8; i++) {
                // Checks that new position is not off the board or a rock or has been visited
                if (isInside(dim, knights.get(j).get(0) + dx[i], knights.get(j).get(1) + dy[i]) && !(isRock(knights.get(j).get(0) + dx[i], knights.get(j).get(1) + dy[i], xrock, yrock)) && !visited[knights.get(j).get(0) + dx[i]][knights.get(j).get(1) + dy[i]]) {
                    // If all tests passed, adds new knight to knights list
                    ArrayList<Integer> newKnight = new ArrayList<Integer>(knights.get(j));
                    newKnight.set(0, knights.get(j).get(0) + dx[i]);
                    newKnight.set(1, knights.get(j).get(1) + dy[i]);
                    newKnight.set(2, knights.get(j).get(2) + 1);
                    visited[newKnight.get(0)][newKnight.get(1)] = true;
                    // If new knight is at the target, returns the number of moves, else adds newKnight to knights
                    if (newKnight.get(0) == targetPos[0] && newKnight.get(1) == targetPos[1]) {
                        return newKnight.get(2);
                    }
                    knights.add(newKnight);
                }

            }

        }
    return -1;
    }

    // Checks that any given point is inside the board boundaries
    public static boolean isInside(int dim, int x, int y) {
        return x <= dim-1 && y <= dim-1 && x >= 0 && y >= 0;
    }

    // Checks that any given point is not occupied by a rock
    public static boolean isRock(int x, int y, int[] xrock, int[] yrock) {
        for (int i=0; i < xrock.length; i++) {
            if ((x == xrock[i]) & (y == yrock[i])) {
                return true;
            }
        }
        return false;
    }

    public static void main( String[] args )
    {
 

    }

}