package pack;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.Controller;

public class MyController implements Controller {
		@Override	
		public ModelAndView handleRequest(HttpServletRequest request,HttpServletResponse response)
		{
			ModelAndView mv=new ModelAndView("Page1");
			
			String first=request.getParameter("first");
			String Second=request.getParameter("Second");
			int n1=Integer.parseInt(first);
			int n2=Integer.parseInt(Second);
			int ans=n1+n2;
			mv.addObject("msg",ans);
			 return mv;
			



		}
	
	
}



