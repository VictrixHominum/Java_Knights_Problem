import java.io.*;
import java.util.*;

public class KnightChecker {
    public static void main( String[] args )    {        
        String s = "";
        String snippet = "";

        String[] t = { "4", "-1", "5", "-1", "3" };

        for( int i = 0; i < 5; i++ )
        {
            if( i == 0 ) {
                {
                	int xr[] = {}, yr[] = {};
                    s = "" + Knight.numMoves( 3, 0, 0, 2, 2, xr, yr );
                }
                snippet = "{\n	int xr[] = {}, yr[] = {};\n    s = \"\" + Knight.numMoves( 3, 0, 0, 2, 2, xr, yr );\n}";
            }
            if( i == 1 ) {
                {
                	int xr[] = { 0 }, yr[] = { 0 };
                    s = "" + Knight.numMoves( 10, 0, 0, 8, 8, xr, yr );
                }
                snippet = "{\n	int xr[] = { 0 }, yr[] = { 0 };\n    s = \"\" + Knight.numMoves( 10, 0, 0, 8, 8, xr, yr );\n}";
            }
            if( i == 2 ) {
                {
                	int xr[] = { 1 }, yr[] = { 2 };
                    s = "" + Knight.numMoves( 10, 0, 0, 7, 6, xr, yr );
                }
                snippet = "{\n	int xr[] = { 1 }, yr[] = { 2 };\n    s = \"\" + Knight.numMoves( 10, 0, 0, 7, 6, xr, yr );\n}";
            }
            if( i == 3 ) {
                {
                	int xr[] = { 1, 2 }, yr[] = { 2, 1 };
                    s = "" + Knight.numMoves( 9, 0, 0, 2, 2, xr, yr );
                }
                snippet = "{\n	int xr[] = { 1, 2 }, yr[] = { 2, 1 };\n    s = \"\" + Knight.numMoves( 9, 0, 0, 2, 2, xr, yr );\n}";
            }
            if( i == 4 ) {
                {
                	int xr[] = { 0, 0, 0, 1, 1, 2, 2, 2 }, yr[] = { 0, 1, 2, 0, 2, 0, 1, 2 };
                    s = "" + Knight.numMoves( 8, 1, 1, 5, 4, xr, yr );
                }
                snippet = "{\n	int xr[] = { 0, 0, 0, 1, 1, 2, 2, 2 }, yr[] = { 0, 1, 2, 0, 2, 0, 1, 2 };\n    s = \"\" + Knight.numMoves( 8, 1, 1, 5, 4, xr, yr );\n}";
            }


            if( !s.equals( t[i]))
            {
                System.out.println( "---- On code snippet:" );
                System.out.println( snippet );
                System.out.println( "---- Expected value of String s:" );
                System.out.println( t[i] );
                System.out.println( "---- Actual value of String s:" );
                System.out.println( s );
                return;
            }
        }
        System.out.println( "Passed all tests." );
      
    }
}