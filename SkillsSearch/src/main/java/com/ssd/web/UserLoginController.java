/**
 * 
 */
package com.ssd.web;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.ssd.web.form.UserForm;

/**
 * @author abhimanyu
 *
 */
@Controller
public class UserLoginController {
	
	@RequestMapping(value = "/login", method = RequestMethod.GET)
	public String index(Model model) {
		return "redirect:/login";
	}
	
	@RequestMapping(method = RequestMethod.GET)
    public ModelAndView login() {
        return new ModelAndView("site.login", "userForm", new UserForm());
    }

}
