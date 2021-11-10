public class Vector3DDecorator implements IVector{
    private IVector srcVector;
    private double z;

    Vector3DDecorator (IVector srcVector, double z)
    {
        this.srcVector=srcVector;
        this.z=z;
    }
    public double abs()
    {
        double [] params = this.srcVector.getComponents();
        double x=params[0];
        double y=params[1];
        return Math.sqrt(y*y+x*x+this.z*this.z);
    }
    public double cdot(IVector param)
    {
        double [] params = param.getComponents();
        double z=params[2];
        return this.srcVector.cdot(param) + this.z*z;
    }
    public double[] getComponents()
    {
        double [] params = this.srcVector.getComponents();
        double [] components= new double[3];
        components[0]=params[0];
        components[1]=params[1];
        components[2]=this.z;
        return components;
    }
    public IVector cross(IVector param)
    {
        double [] params1 = this.getComponents();
        double [] params2 = new double [3];
        params2[0]=param.getComponents()[0];
        params2[1]=param.getComponents()[1];
        if (param.getComponents().length <3)
            params2[3]=0;
        else
            params2[2]=param.getComponents()[2];

        double x = params1[1] * params2[2] - params1[2] * params2[1];
        double y = params1[2] * params2[0] - params1[0] * params2[2];
        double z = params1[0] * params2[1] - params1[1] * params2[0];
        return new Vector3DDecorator(new Vector2D(x, y), z);
    }

    public IVector getSrcV()
    {
        return this.srcVector;
    }

}

