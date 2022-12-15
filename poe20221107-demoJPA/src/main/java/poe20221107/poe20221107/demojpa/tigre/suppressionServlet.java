/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package poe20221107.poe20221107.demojpa.tigre;
import poe20221107.poe20221107.demojpa.*;
import java.io.IOException;
import java.util.List;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
@WebServlet("/delete")
public class suppressionServlet extends HttpServlet {
 public void doPost(HttpServletRequest request, HttpServletResponse response)
            throws IOException, ServletException {
        try {
            String idString = request.getParameter("idString");
            
            if(idString.equals("")){
                idString =(String) request.getSession().getAttribute("idString1");
            }else{
                request.getSession().setAttribute("idString1", idString);
                
            }
            Long id1 = Long.valueOf(idString);
            request.getSession().setAttribute("idLong", id1);
           
            List<Tigre> tigres = (List<Tigre>) request.getSession().getAttribute("tigres");
            request.setAttribute("tigres", tigres);
            request.getRequestDispatcher("WEB-INF/tigre.jsp").forward(request, response);
        
    }catch(Exception e){
        
    }
}
}
