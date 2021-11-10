public class Polar2DAdapter implements IVector, IPolar2D{
    private final Vector2D srcVector;

    Polar2DAdapter(IVector vector)
    {
        double params[]= vector.getComponents();
        this.srcVector = new Vector2D(params[0],params[1] );
    }

    public double getAngle()
    {
        double [] params= this.srcVector.getComponents();
        double x= params[0];
        double y= params[1];
        if (x > 0)
        {
            if (y >= 0)
                return Math.atan(y / x);
            else
                return Math.atan(y / x) + 2*Math.PI;
        }

        if (x < 0)
            return Math.atan(y/x) + Math.PI;
        else
        {
            if(y > 0)
                return Math.PI/2;
            else
                return 3*Math.PI/2;

        }
    }
    public double abs()
    {
        return this.srcVector.abs();
    }
    public double cdot(IVector param)
    {
        return this.srcVector.cdot(param);
    }
    public double[] getComponents()
    {
        return this.srcVector.getComponents();
    }
}
