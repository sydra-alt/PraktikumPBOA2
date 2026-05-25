/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package PersonDAO;

/**
 *
 * @author sydra
 */
import java.io.FileInputStream;
import java.io.ObjectInputStream;

public class ReadSerializedPerson {

    public static void main(String[] args) {

        try {

            FileInputStream file =
                new FileInputStream("person.ser");

            ObjectInputStream in =
                new ObjectInputStream(file);

            Person person =
                (Person) in.readObject();

            in.close();
            file.close();

            System.out.println(
                person.getId()
            );

            System.out.println(
                person.getName()
            );

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}