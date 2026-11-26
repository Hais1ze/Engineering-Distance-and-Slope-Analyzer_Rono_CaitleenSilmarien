package distance.and.slope.analyzer;
public class DistanceAndSlopeAnalyzer {
    public static void main(String[] args) {
EngineeringPoint A = new EngineeringPoint(3, 4);
        EngineeringPoint B = new EngineeringPoint(9, 12);

        System.out.println("ENGINEERING DISTANCE AND SLOPE ANALYZER");

        System.out.println("Point A: " + A.get_x1() + ", " + A.get_y1());
        System.out.println("Point B: " + B.get_x1() + ", " + B.get_y1());

        System.out.println("Point A and B:");

        System.out.println("Distance: " + A.solve(B));
        System.out.println("Slope: " + A.solve2(B));


        
    }
    
}
