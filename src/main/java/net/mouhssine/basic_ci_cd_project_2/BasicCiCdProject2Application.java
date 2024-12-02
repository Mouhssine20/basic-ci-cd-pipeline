package net.mouhssine.basic_ci_cd_project_2;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@SpringBootApplication
public class BasicCiCdProject2Application {

    public static void main(String[] args) {
        SpringApplication.run(BasicCiCdProject2Application.class, args);
    }

    @GetMapping("/welcome")
    public String print(){
        return "welcom ci cd 2";
    }

}
