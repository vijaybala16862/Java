import java.io.*;

class Employee implements Serializable {
    String name;
    int id;

    Employee(String name, int id) {
        this.name = name;
        this.id = id;
    }
}

public class serialization {
    public static void main(String[] args) {
        Employee e = new Employee("Bala", 001);

        // Serialize
        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("emp.ser"))) {
            oos.writeObject(e);
            System.out.println("Serialized!");
        } catch (Exception ex) {
            System.err.println("Serialization failed: " + ex.getMessage());
        }

        // Deserialize
        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream("emp.ser"))) {
            Employee emp = (Employee) ois.readObject();
            System.out.println(emp.name + "  " + emp.id);
        } catch (Exception ex) {
            System.err.println("Deserialization failed: " + ex.getMessage());
        }
    }
}
