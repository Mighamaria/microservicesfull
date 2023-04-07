package com.UST.cloudgateway;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FallBackMethodController {
    @GetMapping("/userServiceFallBackMethod")
    public String userServiceFallBackMethod(){
        return "Hi user,our service is taking a time.Please wait";
    }
    @GetMapping("/departmentServiceFallBackMethod")
    public String departmentServiceFallBackMethod(){
        return "Hi user,our service is taking a time.Please wait";
    }

}
