package com.sample.eureka.config;

import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;
import org.springframework.context.annotation.Configuration;

/**
 * http://호스트:포트/eureka/apps/[어플리케이션ID]를 통해
 * 연결된 어플리케이션 정보를 확인 할 수 있다.
 * 포스트맨으로도 볼수 있음(Header - Accept:application/json
 *
 * http://localhost:5002/eureka/apps/sampleGateWay
 *
 * @author smoh
 *
 */
@EnableEurekaServer
@Configuration
public class EurekaConfiguration {

}
