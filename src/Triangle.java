public class Triangle extends Shape
{
    public Triangle(Vector2 p1, Vector2 p2, Vector2 p3) throws Exception
    {
        super();
        setVertices(p1, p2, p3);
    }

    public Triangle(Vector2[] vertices) throws Exception
    {
        super();
        if(vertices.length >= 3)
        {
            setVertices(vertices[0], vertices[1], vertices[2]);
        }
        else
        {
            throw new Exception("ERROR: Triangle constructed with less than 3 vertices");
        }
    }

    public void setVertices(Vector2 p1, Vector2 p2, Vector2 p3) throws Exception
    {
        Vector2[] vertices = { p1, p2, p3};

        // check if any of the Vector2s are the same
        if((p1.equals(p2)) || (p1.equals(p3) || (p2.equals(p3))))
        {
            throw new Exception("ERROR: Triangle constructed with at least one vertex that is the same as another one");
        }
        else
        {
            super.setVertices(vertices);
        }
    }

}
