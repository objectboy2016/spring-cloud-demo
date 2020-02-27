package eurekaprovider;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController
{
    @GetMapping("/user/getuser")
    public String getUser(){
        return  "111111111111111111111";
    }
}
