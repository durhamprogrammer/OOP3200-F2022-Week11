public class Main {
    public static void main(String[] args)
    {

        Triangle triangle = null;

        Vector2[] verts = {new Vector2(0, 2), new Vector2(2, 2), new Vector2(3, 1)};

        try
        {
            //triangle = new Triangle(new Vector2(0, 1), new Vector2(2, 0), new Vector2());

            triangle = new Triangle(verts);
        }
        catch (Exception e)
        {
            System.out.println(e.getMessage());
        }

        System.out.println(triangle);
    }
}