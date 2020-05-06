package Jdbc;
import java.sql.*;

public class MainJdbcClass {

    /*CREATE TABLE students (
            id    INTEGER PRIMARY KEY AUTOINCREMENT,
            name  STRING,
            score INTEGER NOT NULL
    );*/

    private static Connection connection;
    private static Statement statement;
    private static PreparedStatement preparedStatement;

    public static void main(String[] args) {
        try {
            connect();
            performDropDB();
            performCreateDB();
            //prepareStatements();
            //performInsert5Students();
            //performUpdateDb();
            //performDeleteDb();

            statement.executeUpdate("INSERT INTO students (name, score) values ('student1', 10);");

            Savepoint savepoint = connection.setSavepoint();

            statement.executeUpdate("CALL procedure()");

            connection.rollback(savepoint);

            statement.executeUpdate("INSERT INTO students (name, score) values ('student3', 30);");

//            selectFromDB();
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            disconnect();
        }
    }

    private static void performDeleteDb() throws SQLException {
        statement.executeUpdate("DELETE FROM students where id = 1");
    }

    private static void performUpdateDb() throws SQLException {
        statement.executeUpdate("UPDATE students SET score = 100, name = 'student' WHERE id = 5");
    }

    private static void performInsert5Students() throws SQLException {
        for (int i = 1; i <= 5 ; i++) {
            statement.executeUpdate("INSERT INTO students (name, score) VALUES ('student" + i +  "', " + i*10 % 100 + ");");
        }
    }


    private static void performInsertDB() throws SQLException {
        connection.setAutoCommit(false);
        for (int i = 1; i <= 100000000 ; i++) {
            statement.executeUpdate("INSERT INTO students (name, score) VALUES ('student" + i +  "', " + i*10 % 100 + ");");
            if (i % 10000 == 0) {
                connection.commit();
            }
        }
        connection.commit();
    }

    private static void performCreateDB() throws SQLException {
        statement.executeUpdate("CREATE TABLE IF NOT EXISTS students (\n" +
                "            id    INTEGER PRIMARY KEY AUTOINCREMENT,\n" +
                "            name  STRING,\n" +
                "            score INTEGER NOT NULL\n" +
                "    );");
    }

    private static void performDropDB() throws SQLException {
        statement.executeUpdate("DROP TABLE IF EXISTS students");
    }


    private static void selectFromDB() throws SQLException {
        ResultSet resultSet = statement.executeQuery("SELECT id, name, score FROM students");
        boolean hasNext = resultSet.next();
        if (!hasNext) {
            System.out.println("RS is empty");
            return;
        }
        do {
            System.out.println(
                    resultSet.getInt(1) + " | " +
                            resultSet.getString("name") + " | " +
                            resultSet.getInt(3)
            );
        } while (resultSet.next());


    }

    private static void connect() throws ClassNotFoundException, SQLException {
        Class.forName("org.sqlite.JDBC");
        connection = DriverManager.getConnection("jdbc:sqlite:main.db");
        statement = connection.createStatement();
    }

    private static void prepareStatements() throws SQLException {
        preparedStatement = connection.prepareStatement("INSERT INTO students (name, score) VALUES (?, ?)");
    }

    private static void disconnect() {
        try {
            statement.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        try {
            connection.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }


}

