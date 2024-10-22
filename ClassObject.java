class Student {
    int id;
    String name;
}

public class ClassObject {
    public static void main(String[] args){
        Student obj1 = new Student();
        obj1.id = 68;
        obj1.name = "Ashif";
        System.out.println(obj1.id);
        System.out.println(obj1.name);
    }
}
