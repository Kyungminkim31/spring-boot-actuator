package org.gaval.actuator;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;

@SpringBootApplication
@RestController
public class ActuatorApplication {

    Logger logger = LoggerFactory.getLogger(ActuatorApplication.class);

    @GetMapping(path="/")
    public ResponseEntity<String> getIndex(HttpServletRequest req){
        logger.info("Requesting from remote : " + req.getRemoteHost());
        return ResponseEntity.ok("{ \"msg\": \"Hello, world\" }");
    }

    public static void main(String[] args) {
        SpringApplication.run(ActuatorApplication.class, args);
    }

}
