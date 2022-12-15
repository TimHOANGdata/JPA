/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package poe20221107.poe20221107.demojpa.clientOrder;


import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/clientorder")
public class AffichageServlet extends HttpServlet {

  @Override
  public void doGet(HttpServletRequest request, HttpServletResponse response)
            throws IOException, ServletException{
      List<Client> clients = ClientDAO.findAll();
      List<Order> orders = OrderDAO.findAll();
      request.setAttribute("clients",clients);
      request.setAttribute("orders",orders);
      request.getRequestDispatcher("WEB-INF/affichage.jsp").forward(request,response);
  }
}
