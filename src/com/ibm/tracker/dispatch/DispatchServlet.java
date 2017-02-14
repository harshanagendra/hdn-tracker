/**
 * 
 */
package com.ibm.tracker.dispatch;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * @author harsha
 *
 */
@WebServlet(urlPatterns = { "/home", "/alaska", "/antarctica","/australia" })
public class DispatchServlet extends HttpServlet {

	/**
	 * 
	 * @param request
	 * @param response
	 */
	public void doGet(HttpServletRequest request, HttpServletResponse response) {
		String path = request.getRequestURI().substring(request.getContextPath().length());
		System.out.println("hello tracker");
		RequestDispatcher view = request.getRequestDispatcher(path + ".jsp");
		try {
			view.forward(request, response);
		} catch (ServletException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	/**
	 * 
	 * @param request
	 * @param response
	 */
	public void doPOST(HttpServletRequest request, HttpServletResponse response) {
		System.out.print("Somebody posted a message");
	}

}
