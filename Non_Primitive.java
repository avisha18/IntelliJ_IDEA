import java.util.ArrayList;
import java.util.HashMap;

class Student {
    String name;

    Student(String name) {
        this.name = name;
    }

    void display() {
        System.out.println("Student Name: " + name);
    }
}

interface Animal {
    void sound();
}

public class Non_Primitive{

    public static void main(String[] args) {

        // 1️⃣ String
        String str = "Hello Vaishnavi";
        System.out.println("String: " + str);

        // 2️⃣ Array
        int[] arr = {10, 20, 30};
        System.out.println("Array first element: " + arr[0]);

        // 3️⃣ Class Object
        Student s = new Student("Vaishnavi");
        s.display();

        // 4️⃣ Object Class
        Object obj = "I am Object Type";
        System.out.println("Object: " + obj);

        // 5️⃣ Interface (using anonymous class)
        Animal dog = new Animal() {
            public void sound() {
                System.out.println("Dog barks");
            }
        };
        dog.sound();

        // 6️⃣ Collection (ArrayList)
        ArrayList<String> list = new ArrayList<>();
        list.add("Java");
        list.add("Python");
        System.out.println("ArrayList: " + list);

        // 7️⃣ Collection (HashMap)
        HashMap<Integer, String> map = new HashMap<>();
        map.put(1, "One");
        map.put(2, "Two");
        System.out.println("HashMap: " + map);
    }
}
