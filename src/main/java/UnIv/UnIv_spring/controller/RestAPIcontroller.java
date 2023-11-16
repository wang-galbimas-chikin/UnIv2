package UnIv.UnIv_spring.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class RestAPIcontroller {

    @GetMapping("/api/data")
    public String getData() {
        return "시각장애인버스정류장 BBS 입니다";
    }
}