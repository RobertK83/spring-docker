package de.rk.spring.angular;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@SpringBootApplication
@RestController
public class Application
{
    List<String> heroes = new ArrayList<>();

    @RequestMapping("/heroes/a")
    @ResponseBody
    @CrossOrigin(origins = "http://localhost:4200")
    public List<String> heroes(){
        heroes.add("Adam Warlock");
        heroes.add("Americop");
        heroes.add("Ant-Man");
        heroes.add("Anti-Venom");

        return heroes;

    }

    public static void main( String[] args )
    {
        SpringApplication.run(Application.class, args);
    }
}
