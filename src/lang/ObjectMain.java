package lang;

public class ObjectMain {
    public static void main(String[] args) {
        Child child = new Child();
        child.childMethod();
        child.childMethod();

        String string = child.toString();
        System.out.println(string);
    }
}
