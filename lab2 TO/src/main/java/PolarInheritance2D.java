import java.lang.Math;
public class PolarInheritance2D extends Vector2D {
    PolarInheritance2D (double x, double y)
    {
        super(x,y);
    }
    public double getAngle()
    {
        if (this.x > 0)
        {
            if (this.y >= 0)
                return Math.atan(this.y / this.x);
            else
                return Math.atan(this.y / this.x) + 2*Math.PI;
        }

        if (this.x < 0)
            return Math.atan(this.y/this.x) + Math.PI;
        else
        {
            if(this.y > 0)
                return Math.PI/2;
            else
                return 3*Math.PI/2;

        }

    }
}
