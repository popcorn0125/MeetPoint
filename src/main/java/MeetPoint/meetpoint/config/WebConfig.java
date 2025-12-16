package MeetPoint.meetpoint.config;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Configuration
public class WebConfig implements WebMvcConfigurer {

    /*******************
     * 날짜 : 2024.04.02
     * 이름 : 김준식
     * 내용 : CORS 허용
     * *****************/
    @Override
    public void addCorsMappings(CorsRegistry registry) {
        registry.addMapping("/**")   // 모든 경로에 대해 CORS 설정을 적용
                .allowedOrigins("http://localhost:1024")            // 모든 오리진(출처)에서의 요청을 허용
//                .allowedHeaders("*")            // 모든 헤더를 허용
                .allowCredentials(true)
                .allowedMethods("GET", "POST"); // 허용되는 HTTP 메서드를 지정(GET, POST)
    }

    /*******************
     * 날짜 : 2024.05.25
     * 이름 : 김준식
     * 내용 : 비밀 키
     * *****************/
    @Value("${aes.secret.key")
    private String secretKey;

    public String getSecretKey() {
        return secretKey;
    }
}
