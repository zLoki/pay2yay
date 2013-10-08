package com.in6k.paysys;

import org.apache.log4j.Logger;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.sql.*;

public class Pay2Yay extends HttpServlet {
    private static final Logger logger = Logger.getLogger (Pay2Yay.class);

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        resp.setContentType("text/html");
        String sender = req.getParameter("sender");
        String receiver = req.getParameter("receiver");
        String amount = req.getParameter("amount");

        Transaction t = new Transaction(sender, receiver, Integer.parseInt(amount));
        TransactionLog tl = new TransactionLog();

        try {
//            tl.addTransaction(t);
//            tl.getTransactions();
            tl.getLargestTransaction();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (SQLException e) {
            e.printStackTrace();
        }

//        for (Transaction transaction : tl.getTransactions()) {
//            logger.warn(sender);
//            logger.warn(receiver);
//            logger.warn(amount);
//            logger.warn(date);
//        }

        req.getRequestDispatcher("/WEB-INF/transactioncomplete.jsp").include(req, resp);

    }
}
