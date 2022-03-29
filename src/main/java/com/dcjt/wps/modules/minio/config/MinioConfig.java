package com.dcjt.wps.modules.minio.config;

import com.dcjt.wps.modules.minio.props.MinioProperties;
import io.minio.MinioClient;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * 描述信息
 *
 * @author 杨祎
 * @date 2020/9/21
 */
@Configuration
public class MinioConfig {


    @Bean
    public static MinioClient template(MinioProperties properties) {
        MinioClient minioClient = MinioClient.builder().endpoint(properties.getEndpoint()).credentials(properties.getAccessKey(), properties.getSecretKey()).build();
        return minioClient;
    }

}
