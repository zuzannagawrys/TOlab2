import java.io.*;
public class Main {
    public static void main(String[] args)
    {
        Vector2D vector1 = new Vector2D(3, 7);
        PolarInheritance2D vector2 = new PolarInheritance2D(1, 2);
        Vector3DInheritance vector3 = new Vector3DInheritance(6, 5, 4);
        System.out.println("Uklad kartezjanski wektor 1: [(0,0), (" + vector1.getComponents()[0]+" "+vector1.getComponents()[1] +")]");
        System.out.println("Uklad kartezjanski wektor 2: [(0,0), (" + vector2.getComponents()[0]+" "+vector2.getComponents()[1] +")]");
        System.out.println("Uklad kartezjanski wektor 3: [(0,0,0), (" + vector3.getComponents()[0]+" "+vector3.getComponents()[1] + " "+vector3.getComponents()[2]+")]");

        System.out.println("Uklad biegunowy wektor 1: "+ new Polar2DAdapter(vector1).abs() +" "+ new Polar2DAdapter(vector1).getAngle());
        System.out.println("Uklad biegunowy wektor 2: "+ vector2.abs() +" "+ vector2.getAngle());
        System.out.println("Uklad biegunowy wektor 3: "+ vector3.abs() +" "+ new Polar2DAdapter(vector3.getSrcV()).getAngle());

        System.out.println("Iloczyn skalarny " +"wektor 1 i wektor 2: " + vector1.cdot(vector2));
        System.out.println("Iloczyn skalarny "+ "wektor 2 i wektor 3: " +vector2.cdot(vector3));
        System.out.println("Iloczyn skalarny "+"wektor 3 i wektor 1: "+  vector3.cdot(vector1));

        double [] params =new Vector3DDecorator(vector1, 0).cross(new Vector3DDecorator(vector2, 0)).getComponents();
        System.out.println("Iloczyn wektorowy "+ "wektor 1 i wektor 2: " + params[0] + " "+ params[1] + " "+ params[2]);

        params = new Vector3DDecorator(vector2, 0).cross(vector3).getComponents();
        System.out.println("Iloczyn wektorowy "+ "wektor 2 i wektor 3: " + params[0] + " "+ params[1] + " "+ params[2]);

        params = vector3.cross(new Vector3DDecorator(vector1, 0)).getComponents();
        System.out.println("Iloczyn wektorowy "+ "wektor 3 i wektor 1: " + params[0] + " "+ params[1] + " "+ params[2]);

        params= new Vector3DDecorator(vector2, 0).cross(new Vector3DDecorator(vector1, 0)).getComponents();
        System.out.println("Iloczyn wektorowy "+ "wektor 2 i wektor 1: "+ params[0] + " "+ params[1] + " "+ params[2] );

        params =vector3.cross(new Vector3DDecorator(vector2, 0)).getComponents();
        System.out.println("Iloczyn wektorowy "+ "wektor 3 i wektor 2: "+ params[0] + " "+ params[1] + " "+ params[2]);

        params = new Vector3DDecorator(vector1, 0).cross(vector3).getComponents();
        System.out.println("Iloczyn wektorowy "+ "wektor 1 i wektor 3: "+ params[0] + " "+ params[1] + " "+ params[2]);
    }

}
