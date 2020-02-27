package eurekahystrix;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
public class HomeController {
    @Autowired
    private RestTemplate restTemplate;

    @GetMapping("/home/callHello")
    @HystrixCommand(fallbackMethod = "defaultCallHello")
    public String callHello(){
        return restTemplate.getForObject("http://localhost:8088/user/hello",String.class) ;
    }

    public String defaultCallHello(){
        return "fail";
    }
}
