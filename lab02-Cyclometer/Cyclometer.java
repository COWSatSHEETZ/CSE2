//Trevor Hayes
//CSE002
//lab02-Cyclometer

//This program takes the inputs provided by the cyclometer over two separate trips and calculates the distance 
//traveled, outputting the length of each trip in time, the number of rotations of the wheel over a given time 
//period, the distance of each trip in question, and the total distance travelled in the two trips combined.

public class Cyclometer {
    //Main method; retreives the inputs from the cyclometer and performs calculations to manipulate them into 
    //the desired outputs
    public static void main(String[] args) {
        //input data
        double secsTrip1=480;  //length of the first trip in seconds
        double secsTrip2=3220;  //length of the second trip in seconds
        double countsTrip1=1561;  //number of wheel rotaitons in the first trip
        double countsTrip2=9037; //number of wheel rotations in the second trip
        //intermediate variables and output data
        double wheelDiameter=27.0;  //diameter of the wheel in inches
        double PI=3.14159; //defines pi
        double feetPerMile=5280;  //defines number of feet in a mile
        double inchesPerFoot=12;   //defines number of inches in a foot
        double secondsPerMinute=60;  //defines number of seconds in a minute
        double distanceTrip1, distanceTrip2,totalDistance;  //declares trhe various distances traveled without storing any values
        //Print time and rotation count
        System.out.println("Trip 1 took "+(secsTrip1/secondsPerMinute)+" minutes and had "+countsTrip1+" counts.");
        System.out.println("Trip 2 took "+(secsTrip2/secondsPerMinute)+" minutes and had "+countsTrip2+" counts.");
        
        distanceTrip1=countsTrip1*wheelDiameter*PI;
        //Above gives distance in inches
        //(for each count, a rotation of the wheel travels
        //the diameter in inches times PI)
        distanceTrip1/=inchesPerFoot*feetPerMile; // Gives distance in miles
        distanceTrip2=countsTrip2*wheelDiameter*PI/inchesPerFoot/feetPerMile;
        totalDistance=distanceTrip1+distanceTrip2;
        
        //Print out the output data.
        System.out.println("Trip 1 was "+distanceTrip1+" miles");
        System.out.println("Trip 2 was "+distanceTrip2+" miles");
        System.out.println("The total distance was "+totalDistance+" miles");


    }
}