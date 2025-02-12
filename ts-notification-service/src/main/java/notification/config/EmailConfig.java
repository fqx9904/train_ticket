package notification.config;

/**
 * Created by Wenyi on 2017/6/19.
 */
import java.util.Properties;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.mail.javamail.JavaMailSenderImpl;
import org.springframework.stereotype.Component;

@Component
@Configuration
public class EmailConfig {

    @Autowired
    EmailProperties emailProperties;


//    @Bean(name = "emailConfig")
//    public JavaMailSender getMailSender() {
//        JavaMailSenderImpl mailSender = new JavaMailSenderImpl();
//
//        mailSender.setHost(emailProperties.getHost());
////        mailSender.setPort(Integer.parseInt(emailProperties.getPort()));
//        mailSender.setUsername(emailProperties.getUsername());
//        mailSender.setPassword(emailProperties.getPassword());
//
//        Properties javaMailProperties = new Properties();
//        javaMailProperties.put("mail.smtp.starttls.enable", "true");
//        javaMailProperties.put("mail.smtp.auth", "true");
//        javaMailProperties.put("mail.smtp.timeout", "25000");
//        javaMailProperties.put("mail.transport.protocol", "smtp");
//        javaMailProperties.put("mail.debug", "true");
//
//        mailSender.setJavaMailProperties(javaMailProperties);
//        return mailSender;
//    }


}
