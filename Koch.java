

/** Draws the Koch curve and the the Koch snowflake fractal. */
public class Koch {

	public static void main(String[] args) {

		//// Uncomment the first code block to test the curve function.
		//// Uncomment the second code block to test the snowflake function.
		//// Uncomment only one block in each test, and remember to compile
		//// the class whenever you change the test.

        /*
		// Tests the curve function:
		// Gets n, x1, y1, x2, y2,
		// and draws a Koch curve of depth n from (x1,y1) to (x2,y2).
		curve(Integer.parseInt(args[0]),
			  Double.parseDouble(args[1]), Double.parseDouble(args[2]), 
		      Double.parseDouble(args[3]), Double.parseDouble(args[4]));


			  curve(Integer.parseInt(args[0]),
			  Double.parseDouble(args[1]), Double.parseDouble(args[2]), 
		      Double.parseDouble(args[3]), Double.parseDouble(args[4]));
			  
		*/

		/*
		// Tests the snowflake function:
		// Gets n, and draws a Koch snowflake of n edges in the standard canvass.
		snowFlake(Integer.parseInt(args[0]));
		*/
		snowFlake(Integer.parseInt(args[0]));

	}

	/** Gets n, x1, y1, x2, y2,
     *  and draws a Koch curve of depth n from (x1,y1) to (x2,y2). */
	public static void curve(int n, double x1, double y1, double x2, double y2) {
		if( n == 0) return;
		StdDraw.line(x1, y1, x2, y2);

		double xx1 = (x2 - x1) / 3 + x1;
		double xx2 = ((x2 - x1) / 3) * 2 + x1;
		double yy1 = (y2 - y1) / 3 + y1;
		double yy2 = ((y2 - y1) / 3) * 2 + y1;
		StdDraw.setPenColor(StdDraw.WHITE);
		StdDraw.line(xx1, yy1, xx2 , yy2);
		
		double xx3 = 0.288675134594812882 * (y1 - y2) + 0.5 * (x1 + x2);
		double yy3 = 0.288675134594812882 * (x2 - x1) + 0.5 * (y1 + y2);

		StdDraw.setPenColor(StdDraw.BLACK);
		StdDraw.line(xx1, yy1, xx3, yy3);
		StdDraw.line(xx2, yy2, xx3, yy3);

		curve( n-1,  x1,  y1,  xx1,  yy1);
		curve( n-1,  xx1,  yy1,  xx3,  yy3);
		curve( n-1,  xx3,  yy3,  xx2,  yy2);
		curve( n-1,  xx2,  yy2,  x2,  y2);

		
		//// Write the rest of your code below.
	}

    /** Gets n, and draws a Koch snowflake of n edges in the standard canvass. */
	public static void snowFlake(int n) {
		// A little tweak that makes the drawing look better
		StdDraw.setYscale(0, 1.1);
		StdDraw.setXscale(0, 1.1);

		double x1 = 0.5;
		double y1 = 0.76;
		double x2 = 0.2;
		double y2 = 0.24;
		double xx3 = 0.8;
		double yy3 = 0.24;



		curve( n-1,  x2,  y2,  x1,  y1);
		curve( n-1,  x1,  y1,  xx3,  yy3);
		curve( n-1,  xx3,  yy3,  x2,  y2);
	
		// Draws a Koch snowflake of depth n
		//// Write the rest of your code below.
	}
}
