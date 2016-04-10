package ru.sgu.acm.solutions.labs.io.tasks;

import ru.sgu.acm.solutions.labs.io.FilePathUtils;
import ru.sgu.acm.solutions.labs.io.tasks.task4.Person;

import java.io.*;
import java.util.Arrays;
import java.util.List;

/*
 4. Создайте сериализуемый класс Person, включающий
 в себя ФИО и коллекцию детей – List<Person>.  Соз
 -дайте объект Person, заполните ему строковые поля
 и детей, сериализуйте полученную структуру в файл.
 Десериализуйте структуру из файла и убедитесь, что
 в  полях сохранились прежние значения.
*/
public class Task4 {

    public void execute() {
        Person person1 = new Person("FirstName", "SecName", "LastName");
        Person childPerson1 = new Person("child 1 FirstName", "child 1 SecName", "child 1 LastName");
        Person childPerson2 = new Person("child 2 FirstName", "child 2 SecName", "child 2 LastName");
        List<Person> children = Arrays.asList(childPerson1, childPerson2);
        person1.setChildren(children);
        final String root = System.getProperty("user.home") + FilePathUtils.createPath("IdeaProjects", "ExamplesProject\\src\\main\\java\\ru\\sgu\\acm\\solutions\\labs\\io\\tasks\\task4");// "SolutionEx", "src", "main", "java");
        final String defaultInFilePath = root + "forSerialize.txt";
        File file = new File(defaultInFilePath);
        serializePerson(person1, file);
        Person deserializedPerson = deserializePerson(file);
        System.out.println(deserializedPerson);
        for (Person child : deserializedPerson.getChildren()) {
            System.out.println(child);
        }
    }

    private void serializePerson(Person person1, File file) {
        try {
            FileOutputStream fileOutputStream = new FileOutputStream(file);
            ObjectOutputStream objectOutputStream = new ObjectOutputStream(fileOutputStream);
            objectOutputStream.writeObject(person1);
            objectOutputStream.close();
            fileOutputStream.close();
        }  catch (IOException e) {
            e.printStackTrace();
        }
    }

    private Person deserializePerson(File file) {
        Person person = null;
        try {
            ObjectInputStream objectInputStream = new ObjectInputStream(new FileInputStream(file));
            person = (Person) objectInputStream.readObject();
            objectInputStream.close();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return person;
    }
}
