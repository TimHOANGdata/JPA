
package poe20221107.poe20221107.demojpa.tigre;

import poe20221107.poe20221107.demojpa.*;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/tigre")
public class TigreServlet extends HttpServlet {
  List<Tigre> tigres = new ArrayList<>();
  @Override
  public void doGet(HttpServletRequest request, HttpServletResponse response)
            throws IOException, ServletException{
      request.getSession().setAttribute("tigres",tigres);
      request.getRequestDispatcher("WEB-INF/tigre.jsp").forward(request,response);
  }
  @Override
  public void doPost(HttpServletRequest request, HttpServletResponse response)
            throws IOException, ServletException{
        try{
            String country = request.getParameter("country");
            String name = request.getParameter("name");
            String ageString = request.getParameter("age");
            int ageInt = Integer.parseInt(ageString);
            if (ageInt < 0) {
            request.setAttribute("error", "age must be positif");
            }else{
                if(name != null && country!= null && ageString!=null){
                    Tigre tigre;
                
                    tigre = new Tigre(name, country, ageInt);
                  
                    TigreDAO.create(tigre);
                    
                }
            }
            Long id1 = (Long) request.getSession().getAttribute("idLong");
            TigreDAO.deleteById(id1);
        tigres = TigreDAO.findAll();
        request.getSession().setAttribute("tigres",tigres);
        doGet(request,response);
        }catch(Exception e){
            request.setAttribute("error", "erreur de saisir dans le formulaire");
            
        }
  }

}
