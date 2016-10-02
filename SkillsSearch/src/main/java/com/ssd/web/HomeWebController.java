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
public class HomeWebController {
	
	@RequestMapping("/home")
    public String greeting(Model model) {
        return "site.home";
    }

}
