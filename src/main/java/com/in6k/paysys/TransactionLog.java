package com.in6k.paysys;

import java.sql.*;
import java.util.Date;
import java.util.List;

public class TransactionLog {


    public void addTransaction(Transaction transaction) throws ClassNotFoundException, SQLException {
        String sqlQuery = "INSERT INTO transactions" + "(sender, receiver, amount, time_stamp) VALUES" + "(?, ?, ?, ?)";

        Class.forName("com.mysql.jdbc.Driver");

        Connection c = DriverManager.getConnection("jdbc:mysql://localhost:3306/foo", "root", "");
        PreparedStatement ps = c.prepareStatement(sqlQuery);

        ps.setString(1, transaction.getDebetAccount());
        ps.setString(2, transaction.getCreditAccount());
        ps.setInt(3, transaction.getAmount());
        ps.setTimestamp(4, new Timestamp(new Date().getTime()));
        ps.executeUpdate();

        ps.close();
        c.close();
    }

    public List<Transaction> getTransactions() throws ClassNotFoundException, SQLException {
        String sqlQuery = "SELECT * FROM transactions";

        Class.forName("com.mysql.jdbc.Driver");

        Connection c = DriverManager.getConnection("jdbc:mysql://localhost:3306/foo", "root", "");
        Statement s = c.createStatement();
        ResultSet rs = s.executeQuery(sqlQuery);

        while(rs.next()) {
            System.out.print("Sender: " + rs.getString("sender"));
            System.out.print(", Receiver: " + rs.getString("receiver"));
            System.out.print(", Amount: " + rs.getInt("amount"));
            System.out.println(", Date: " + rs.getTimestamp("time_stamp"));
        }
        rs.close();
        s.close();
        c.close();

        return null;
    }

    public Transaction getLargestTransaction() throws ClassNotFoundException, SQLException {
        String sqlQuery = "SELECT id, sender, receiver, amount, time_stamp FROM transactions " +
                          "WHERE amount=(SELECT MAX(amount) FROM transactions)";

        Class.forName("com.mysql.jdbc.Driver");

        Connection c = DriverManager.getConnection("jdbc:mysql://localhost:3306/foo", "root", "");
        Statement s = c.createStatement();
        ResultSet rs = s.executeQuery(sqlQuery);

        while(rs.next()) {
            System.out.print("Sender: " + rs.getString("sender"));
            System.out.print(", Receiver: " + rs.getString("receiver"));
            System.out.print(", Amount: " + rs.getInt("amount"));
            System.out.println(", Date: " + rs.getTimestamp("time_stamp"));
        }
        rs.close();
        s.close();
        c.close();
        return null;
    }
}
