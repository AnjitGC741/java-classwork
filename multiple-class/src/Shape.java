public class Shape {
    int width;
    int height;
    Shape(int w, int y){
        width = w;
        height = y;
    }
    public void area(){
        System.out.println(this.width * this.height);
    }

}
