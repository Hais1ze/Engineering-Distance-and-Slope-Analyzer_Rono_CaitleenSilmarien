package distance.and.slope.analyzer;
public class EngineeringPoint {
  private double x1;
  private double y1;
    EngineeringPoint (double x1, double y1){
        this.x1=x1;
        this.y1=y1;
    }
    void set_x1 (double x){
        this.x1=x1;
    }
    double get_x1(){
        return x1;
    }
    
    void set_y1(double y){
        this.y1=y1;
    }
    double get_y1(){
        return y1;
    }
    public double solve(EngineeringPoint point){
        double ans=point.get_x1()-x1;
        double ans2=point.get_y1()-y1;
        return Math.sqrt((ans*ans)+(ans2*ans2));
    }
    public double solve2(EngineeringPoint Point){
        double waw=Point.get_y1()-y1;
        double waw2=Point.get_x1()-x1;
        return waw/waw2;
    }
}
