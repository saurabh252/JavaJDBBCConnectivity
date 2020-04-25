//Java jdbc connection

import dao.Student;
import dao.StudentDAO;
import java.util.List;

/*1. import package--> java.sql
* 2. load and register the driver--> com.mysql.jdbc.Driver
* 3. create connection
* 4. create statement
* 5. execute query
* 6. process the result
* 7. close the connection
* */


public class Main {

    public static void main(String[] args) throws Exception {
        StudentDAO studentDAO = new StudentDAO();
        List<Student> student = studentDAO.getStudent();
        for (Student value : student) {
            System.out.println("id :" + value.getId() + " name :" + value.getName());
        }
    }

}
