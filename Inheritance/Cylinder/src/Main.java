public class Main {

    public static void main(String[] args) {
        Circle Povrsina = new Circle(2);
        Cylinder Volumen = new Cylinder(2, 2);

        System.out.println("Povrsina je : " + Povrsina.getArea());
        System.out.println("Volumen je: " + Volumen.getVolume());
    }
}
