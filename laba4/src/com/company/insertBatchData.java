package com.company;

import com.company.Main.PreparedStatementDemo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class insertBatchData extends PreparedStatementDemo {

        public static void main(String[] args) {
            try (Connection connection = DriverManager.getConnection(DATABASE_URL, USER, PASSWORD);
                 Statement statement = connection.createStatement()) {
            statement.addBatch("INSERT INTO teacher (name, subject) VALUES ('Sidorov', 'mathematics') ");
            statement.addBatch("INSERT INTO teacher (name, subject) VALUES ('Petrov', 'physics') ");
            statement.addBatch("INSERT INTO number_of_pairs (name, number_of_pairs) VALUES ('Sidorov', '4') ");
            statement.addBatch("INSERT INTO number_of_pairs (name, number_of_pairs) VALUES ('Petrov', '6') ");
            statement.addBatch("INSERT INTO subject (name, time) VALUES ('mathematics', 'Monday') ");
            statement.addBatch("INSERT INTO subject (name, time) VALUES ('physics', 'Wednesday') ");
            statement.addBatch("INSERT INTO audience (name, audience) VALUES ('mathematics', '412') ");
            statement.addBatch("INSERT INTO audience (name, audience) VALUES ('physics', '453') ");
            statement.addBatch("INSERT INTO number_of_students (name, number_of_students) VALUES ('mathematics', '21') ");
            statement.addBatch("INSERT INTO number_of_students (name, number_of_students) VALUES ('physics', '15') ");
            statement.addBatch("INSERT INTO audience_at_the_time (audience, time) VALUES ('412', 'Monday') ");
            statement.addBatch("INSERT INTO audience_at_the_time (audience, time) VALUES ('453', 'Wednesday') ");
            statement.addBatch("INSERT INTO teacher_at_the_time (name, subject,  number_of_pairs) VALUES ('Sidorov','mathematics', '4') ");
            statement.addBatch("INSERT INTO teacher_at_the_time (name, subject,  number_of_pairs) VALUES ('Petrov', 'physics', '6') ");
            statement.executeBatch();
            } catch (SQLException e) {
                System.out.println(e.getMessage());
            }
        }
    }
