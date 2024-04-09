package cn.liulingfengyu.oauthauthorizationclient;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.security.oauth2.client.EnableOAuth2Sso;

@SpringBootApplication
@EnableOAuth2Sso
public class OauthAuthorizationClientApplication {

    public static void main(String[] args) {
        SpringApplication.run(OauthAuthorizationClientApplication.class, args);
    }

}
