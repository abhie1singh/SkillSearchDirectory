/**
 * 
 */
package com.ssd.web;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author abhimanyu
 *
 */
@Controller
public class UserWebController {
	
	@RequestMapping("/login")
    public String login(Model model) {
        return "site.login";
    }
	
	@RequestMapping("/reset")
    public String resetPassword(Model model) {
        return "site.reset";
    }
	
	@RequestMapping("/forgot")
    public String forgotPassword(Model model) {
        return "site.forgot";
    }
	
	@RequestMapping("/user")
    public String viewUserProfile(Model model) {
        return "site.user";
    }
	
	@RequestMapping("/project")
    public String viewProject(Model model) {
        return "site.project";
    }
	
	@RequestMapping("/searchresults")
    public String viewSearchResults(Model model) {
        return "site.searchresults";
    }

}
