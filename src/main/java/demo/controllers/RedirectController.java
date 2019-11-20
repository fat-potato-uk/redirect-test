package demo.controllers;


import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;
import java.util.concurrent.atomic.AtomicLong;

@RestController
@Slf4j
public class RedirectController {


    @GetMapping("/**")
    public String redirector(@RequestHeader(value = "X-Forwarded-Host", defaultValue = "") String xForwardHeader) {
        log.info("The intended destination: https://{}", xForwardHeader);
        // TODO: secure connection to above URL
        return "TEST";
    }
}