package Interface;
public class Rectangle implements Shape {

    int width;
    int height;
    Rectangle()
    {
        int width =10;
        int height =20;

    }
    Rectangle(int w, int h)
    {
        this.width = w;
        this.height = h;
    }
    public void getArea(){
        System.out.println(width * height);
    }

    public void getArea(int w, int h)
    {
        System.out.println(w * h);
    }
    public void getPerimeter(){
        System.out.println(2*(width*height));
    }
}
