package com.cbt.configserver;

@SpringBootApplication
@EnableConfigServer
@EnableDiscoveryClient
public class ConfigserverApplication
{
    public static void main(String[] args)
    {
            SpringApplication.run(ConfigserverApplication.class);
    }
}
