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
 * Servlet implementation class pcBuildServlet
 */
@WebServlet("/pcBuildServlet")
public class pcBuildServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public pcBuildServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String gpuComponent = request.getParameter("gpuComponent");
		String cpuComponent = request.getParameter("cpuComponent");
		
		PCBuilder pcBuilder = new PCBuilder(cpuComponent, gpuComponent);
		
		request.setAttribute("userPCBuild", pcBuilder);
		
		getServletContext().getRequestDispatcher("/subResult.jsp").forward(request, response);
		
		request.getSession().setAttribute("userPCBuild", pcBuilder);
		request.getRequestDispatcher("/pcBuildResultServlet.java").forward(request, response);
		
		//PrintWriter writer = response.getWriter();
		//writer.println(pcBuilder.toString());
		//writer.close();
	}

}
