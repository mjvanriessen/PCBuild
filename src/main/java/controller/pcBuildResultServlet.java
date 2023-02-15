package controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import model.PCBuilder;

/**
 * Servlet implementation class pcBuildResultServlet
 */
@WebServlet("/pcBuildResultServlet")
public class pcBuildResultServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public pcBuildResultServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String memory = request.getParameter("desiredRAM");
		String powerSource = request.getParameter("desiredPS");
		
		PCBuilder pcBuilder = (PCBuilder) request.getSession().getAttribute("userPCBuild");
		
		pcBuilder.setMemorySize(memory);
		pcBuilder.setPowerSourceCapacity(powerSource);
		
		
		PrintWriter writer = response.getWriter();
		writer.println("FINAL BUILD: ");
		writer.println(pcBuilder.toString());
		writer.close();
		
	}

}
