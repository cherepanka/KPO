package com.company;

import java.sql.*;

public class Main {


    public static class PreparedStatementDemo {
        static final String JDBC_DRIVER = "com.mysql.jdbc.Driver";
        static final String DATABASE_URL = "jdbc:mysql://127.0.0.1:3306/db?useUnicode=true&useJDBCCompliantTimezoneShift=true&useLegacyDatetimeCode=false&serverTimezone=UTC";
        static final String USER = "root";
        static final String PASSWORD = "admin";
        private static final String SQL = "CREATE TABLE IF NOT EXISTS subject(name VARCHAR(50) , time TEXT NOT NULL)";
        private static final String SQL1 = "CREATE TABLE IF NOT EXISTS audience(name VARCHAR(50) PRIMARY KEY, audience VARCHAR(50) NOT NULL)";
        private static final String SQL2 = "CREATE TABLE IF NOT EXISTS teacher(name VARCHAR(50) , subject VARCHAR(50) NOT NULL)";
        private static final String SQL3 = "CREATE TABLE IF NOT EXISTS number_of_pairs(name VARCHAR(50) PRIMARY KEY,  number_of_pairs INTEGER not NULL)";
        private static final String SQL4 = "CREATE TABLE IF NOT EXISTS number_of_students(name VARCHAR(50) PRIMARY KEY, number_of_students INTEGER not NULL)";
        private static final String SQL5 = "CREATE TABLE IF NOT EXISTS audience_at_the_time(audience VARCHAR(50) PRIMARY KEY,  time TEXT NOT NULL)";
        private static final String SQL6 = "CREATE TABLE IF NOT EXISTS teacher_at_the_time(name VARCHAR(50) PRIMARY KEY, subject VARCHAR(50) NOT NULL , number_of_pairs INTEGER not NULL)";



        public static void main(String[] args) throws ClassNotFoundException, SQLException {
            Connection connection = null;
            Statement statement = null;
            PreparedStatement preparedStatement = null;
            System.out.println("Registering JDBC driver...");
            Class.forName(JDBC_DRIVER);
            System.out.println("Creating connection...");
            connection = DriverManager.getConnection(DATABASE_URL, USER, PASSWORD);
            System.out.println("Creating table in selected database...");
            statement = connection.createStatement();
            statement.executeUpdate(SQL);
            statement.executeUpdate(SQL1);
            statement.executeUpdate(SQL2);
            statement.executeUpdate(SQL3);
            statement.executeUpdate(SQL4);
            statement.executeUpdate(SQL5);
            statement.executeUpdate(SQL6);
            System.out.println("Table successfully created...");
            connection.close();


        }
    }
}