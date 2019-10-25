/*Set variables for each place
 pass parameters to one method
 method
 	take in values (x1,y1, x2, y2)
 	calculate distance using math.pow and math.sqrt
 */

public class Equestria {

	public static void main(String[] args) {
		double place1x = 31;							/*sets the x and y values for each place without using specific names of places*/
		double place1y = 15;
		double place2x = 35;
		double place2y = 9;
		double distance = distanceCalc(place1x, place1y, place2x, place2y);						/*passes the values to the distanceCalc method*/
		System.out.println("The distance between these two places is " + distance + " units.");				/*prints out value*/
	}
	
	public static double distanceCalc(double x1, double y1, double x2, double y2) {
		double place1 = Math.pow((x2-x1),2);						/*does (x2-X1) squared and (y2-y1)squared*/
		double place2 = Math.pow((y2-y1),2);
		double positive = Math.abs((place1 + place2));				/*finds the positive (since negative won't square root) value of the part that needs to be square rooted */
		double d = Math.sqrt(positive);								/*square roots the entire function*/
		return d;													/*passes the value of d to a double named distance*/
	}

}
