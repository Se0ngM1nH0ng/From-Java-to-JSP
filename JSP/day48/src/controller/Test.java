package controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Test
 */
@WebServlet("/filterSearch.do")
public class Test extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Test() {
        super();
        // TODO Auto-generated constructor stub
    }
    private void doAction(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
          
          ArrayList<ProductVO> pdatas = new ArrayList<ProductVO>();
          
          ProductVO pVO = new ProductVO();
          ProductDAO pDAO = new ProductDAO();
          
          //   사용자가 입력한 이름 키워드 값 가져오기.
          String pName = request.getParameter("pName");
          
          System.out.println("log : FilterSearchController.java : doAction : pName : " + pName);
          
          //   사용자가 입력한 이름 키워드 값을 pVO 객체에 set.
          pVO.setpName(pName);
          
          //   이름 키워드 값을 가지고, DB 치고 나오기.
          pdatas = pDAO.selectAll(pVO);
          
          System.out.println("log : FilterSearchController.java : doAction : pdatas : " + pdatas);
          
          //   out 객체에 담아서 View 에게 보내기.
          PrintWriter out = response.getWriter();
          
          //   View 에게 pdatas 데이터 보내기.
          out.print(pdatas);
       }
       
      protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
         doAction(request, response);
      }

      protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
         doAction(request, response);
      }


}
