/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package PersonDAO;

/**
 *
 * @author sydra
 */
import java.io.FileOutputStream;
import java.io.ObjectOutputStream;

public class SerializePerson {

    public static void main(String[] args) {

        Person person = new Person(1, "Indra");

        try {

            FileOutputStream file =
                new FileOutputStream("person.ser");

            ObjectOutputStream out =
                new ObjectOutputStream(file);

            out.writeObject(person);

            out.close();
            file.close();

            System.out.println(
                "Object berhasil diserialize"
            );

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}