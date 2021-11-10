import java.lang.Math;
public class Vector2D implements IVector{
    protected double x;
    protected double y;
    Vector2D(double x, double y)
    {
        this.x=x;
        this.y=y;
    }
    public double abs()
    {
        return Math.sqrt(this.y*this.y+this.x*this.x);
    }
    public double cdot(IVector param)
    {
        double[] params=param.getComponents();
        return this.x* params[0]+this.y*params[1];
    }
    public double[] getComponents()
    {
        double [] components= {this.x,this.y};
        return components;
    }
}
