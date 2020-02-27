package eurekaconsumer;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
public class UserConsumerController {
    @Autowired
    private RestTemplate restTemplate;

    @GetMapping("/notLoadBalanced/consumer/getuser")
    public String getUser() {
        return restTemplate.getForObject("http://localhost:8081/user/getuser", String.class);
    }

    @GetMapping("/addLoadBalanced/consumer/getuser")
    public String getAddLoadBalancedUser() {
        return restTemplate.getForObject("http://eurekaprovider/user/getuser", String.class);
    }
    @GetMapping("/user/hello")
    public String hello(){
        return restTemplate.getForObject("http://localhost:8081/user/getuser", String.class);
    }
}
