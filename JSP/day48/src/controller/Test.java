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
          
          //   ����ڰ� �Է��� �̸� Ű���� �� ��������.
          String pName = request.getParameter("pName");
          
          System.out.println("log : FilterSearchController.java : doAction : pName : " + pName);
          
          //   ����ڰ� �Է��� �̸� Ű���� ���� pVO ��ü�� set.
          pVO.setpName(pName);
          
          //   �̸� Ű���� ���� ������, DB ġ�� ������.
          pdatas = pDAO.selectAll(pVO);
          
          System.out.println("log : FilterSearchController.java : doAction : pdatas : " + pdatas);
          
          //   out ��ü�� ��Ƽ� View ���� ������.
          PrintWriter out = response.getWriter();
          
          //   View ���� pdatas ������ ������.
          out.print(pdatas);
       }
       
      protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
         doAction(request, response);
      }

      protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
         doAction(request, response);
      }


}
