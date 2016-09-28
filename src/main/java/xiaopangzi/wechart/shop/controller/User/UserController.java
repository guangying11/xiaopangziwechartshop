package xiaopangzi.wechart.shop.controller.User;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller  
@RequestMapping("/user") 
public class UserController {
	
	@RequestMapping("/showInfo/{userId}")  
    public String showUserInfo(){  
        return "/user/showInfo";  
    } 
}
