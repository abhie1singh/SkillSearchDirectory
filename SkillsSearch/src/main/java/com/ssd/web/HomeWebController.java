/**
 * 
 */
package com.ssd.web;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.ssd.entity.User;

/**
 * @author abhimanyu
 *
 */
@Controller
public class HomeWebController {
	
	@RequestMapping("/home")
    public ModelAndView viewLandingPage(HttpServletRequest request, HttpServletResponse response, Model model) {
		HttpSession session = request.getSession();
		User user = (User) session.getAttribute("user");
		ModelAndView view = new ModelAndView("site.home", "user", user);
        return view;
    }

}
