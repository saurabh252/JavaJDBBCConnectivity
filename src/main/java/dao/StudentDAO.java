package dao;

import databse.DataBaseConnection;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class StudentDAO {

    private static String query = "select * from student";

    public List<Student> getStudent() throws Exception {
        Connection connection = DataBaseConnection.connectDataBase();
        assert connection != null;
        Statement statement = connection.createStatement();
        ResultSet resultSet = statement.executeQuery(query);
        List<Student> studentList = new ArrayList<Student>();
        while (resultSet.next()){
            Student student = new Student();
            student.setId(resultSet.getInt("id"));
            student.setName(resultSet.getString("name"));
            studentList.add(student);

        }
        statement.close();
        connection.close();
        return studentList;
    }


}

