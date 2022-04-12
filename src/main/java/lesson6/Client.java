package lesson6;

import java.util.Optional;


public class Client {

    public static void main(final String...args) {

        final StudentDataMapper mapper = new StudentDataMapperImpl();

        Student student = new Student(1, "Max", 5);

        mapper.insert(student);

        final Optional< Student > studentToBeFound = mapper.find(student.getStudentId());

        student = new Student(student.getStudentId(), "MaxUpdated", 5);

        mapper.update(student);
        mapper.delete(student);
    }

}
