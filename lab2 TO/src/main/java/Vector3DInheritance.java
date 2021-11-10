public class Vector3DInheritance extends Vector2D{
    private double z;
    Vector3DInheritance (double x, double y,double z)
    {
        super(x,y);
        this.z=z;
    }
    public double abs()
    {
        return Math.sqrt(this.y*this.y+this.x*this.x+this.z*this.z);
    }
    public double cdot(IVector param)
    {
        double [] params = param.getComponents();
        double x= params[0];
        double y = params[1];
        double z;
        if(params.length<3)
            z=0;
        else
            z=params[2];
        return this.x*x+this.y*y + this.z*z;
    }
    public double[] getComponents()
    {
        double [] components={this.x,this.y,this.z};
        return components;
    }
    public IVector cross(IVector param)
    {
        double [] params1 = this.getComponents();
        double [] params2 = new double[3];
        double [] params = param.getComponents();
        params2[0]=params[0];
        params2[1]=params[1];
        if (params.length <3)
            params2[2]=0;
        else
           params2[2]=params[2];

        double x = params1[1] * params2[2] - params1[2] * params2[1];
        double y = params1[2] * params2[0] - params1[0] * params2[2];
        double z = params1[0] * params2[1] - params1[1] * params2[0];
        return new Vector3DDecorator(new Vector2D(x, y), z);
    }

    public IVector getSrcV()
    {
        return new Vector2D(this.x,this.y);
    }

}
