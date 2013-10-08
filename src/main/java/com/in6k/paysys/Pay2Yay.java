package com.in6k.paysys;

import org.apache.log4j.Logger;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

public class Pay2Yay extends HttpServlet {
    private static final Logger logger = Logger.getLogger (Pay2Yay.class);

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        resp.setContentType("text/html");
        String sender = req.getParameter("sender");
        String receiver = req.getParameter("receiver");
        String amount = req.getParameter("amount");

        logger.info(sender);
        logger.warn(receiver);
        logger.error(amount);

        req.getRequestDispatcher("/WEB-INF/transactioncomplete.jsp").include(req, resp);
    }
}
