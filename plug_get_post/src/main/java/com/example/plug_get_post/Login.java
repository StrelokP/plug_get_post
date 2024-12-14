package com.example.plug_get_post;

import lombok.Getter;
import lombok.Setter;

import javax.validation.constraints.NotBlank;

import javax.validation.constraints.Size;
import java.util.Random;

public class Login {


    public static class User {

        @NotBlank(message = "Login не может быть пустым")
        @Size(min = 3, max = 20, message = "Login от 3 до 20 символов")
        private String login;


        @NotBlank(message = "Password не может быть пустым")
        @Size(min = 3, max = 20, message = "Password от 3 до 20 символов")
        private String password;

        private String timestamp;


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

        public String getTimestamp() {
            return timestamp;
        }

        public User(String login, String password, String timestamp) {
            this.login = login;
            this.password = password;
            this.timestamp = timestamp;
        }

        public User(String login, String password) {
            this.login = login;
            this.password = password;
        }
    }

    public static void sleepRandom() throws InterruptedException {
        Random rand = new Random();
        int randomInt = 1000 + rand.nextInt(1001);
        Thread.sleep(randomInt);

    }


//    public static class LoginResponse {
//        private String login;
//        private String password;
//        private String timestamp;
//
//        public String getTimestamp() {
//            return timestamp;
//        }
//
//        public String getPassword() {
//            return password;
//        }
//
//        public String getLogin() {
//            return login;
//        }
//
//        public LoginResponse(String login, String password, String timestamp) {
//            this.login = login;
//            this.password = password;
//            this.timestamp = timestamp;
//        }
//
//    }

}
