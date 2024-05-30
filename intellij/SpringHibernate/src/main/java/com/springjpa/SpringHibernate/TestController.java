package com.springjpa.SpringHibernate;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {

    @RequestMapping("/")
    public String home(){
        return "<!DOCTYPE html>\n" +
                "<html lang='en'>\n" +
                "<head>\n" +
                "    <meta charset='UTF-8'>\n" +
                "    <meta name='viewport' content='width=device-width, initial-scale=1.0'>\n" +
                "    <title>Cities</title>\n" +
                "</head>\n" +
                "<body>\n" +
                "    <h2>Enter Country code</h2>\n" +
                "    <form action='http://localhost:8080/country' method='get'>\n" +
                "        <label for='textInput'>Enter text:</label>\n" +
                "        <input type='text' id='textInput' name='code' required>\n" +
                "        <br>\n" +
                "        <button type='submit'>Submit</button>\n" +
                "    </form>\n" +
                "</body>\n" +
                "</html>\n";
    }

    @RequestMapping("/test")
    public String test() {
        return "Hello World!";
    }
}
