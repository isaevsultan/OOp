public class Circle {
    private float pi;
    private float radius;

    Circle(float pi,float radius){
      this.pi = pi;
      this.radius = radius;
    }
    public float getPi(){
        return pi;
    }
    public void setPi(float pi){
        this.pi = pi;
    }

    public float getRadius() {
        return radius;
    }

    public void setRadius(float radius) {
        this.radius = radius;
    }

    @Override
    public String toString() {
        return "Circle{" +
                "pi=" + pi +
                ", radius=" + radius +
                '}';
    }
    public static  void getArea(float pi,float radius){
        System.out.println("area: "+pi*(radius*radius));
        System.out.println("circumferen: "+pi*2*radius);
    }

}
