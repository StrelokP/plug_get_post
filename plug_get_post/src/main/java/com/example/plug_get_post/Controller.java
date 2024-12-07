package com.example.plug_get_post;




import org.springframework.web.bind.annotation.*;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;


@RestController
@RequestMapping("/api")
public class Controller {

    @GetMapping("/static")
    public String getJsonStatic() throws InterruptedException {
        Thread.sleep(2000);
        return "{\"key\": \"value\"}";
    }

    @PostMapping("/login")
    public LoginResponse postLogin(@RequestBody LoginRequest request) throws InterruptedException {
        String currentDate = LocalDate.now().format(DateTimeFormatter.ISO_LOCAL_DATE);
        Thread.sleep(1000);
        return new LoginResponse(request.getLogin(), request.getPassword(), currentDate);
    }



        public static class LoginRequest {

            private String login;
            private String password;

            public String getPassword() {
                return password;
            }

            public void setPassword(String password) {
                this.password = password;
            }

            public String getLogin() {
                return login;
            }

            public void setLogin(String login) {
                this.login = login;
            }
        }

        public static class LoginResponse {
            private String login;
            private String password;
            private String timestamp;

            public String getTimestamp() {
                return timestamp;
            }

            public String getPassword() {
                return password;
            }

            public String getLogin() {
                return login;
            }

            public LoginResponse(String login, String password, String timestamp) {
                this.login = login;
                this.password = password;
                this.timestamp = timestamp;
            }

        }


}
