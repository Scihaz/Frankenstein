package com.example.blog

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.context.properties.ConfigurationPropertiesScan
import org.springframework.boot.context.properties.EnableConfigurationProperties
import org.springframework.boot.runApplication
import org.springframework.context.annotation.ComponentScan

@SpringBootApplication
@ConfigurationPropertiesScan(basePackages = ["com.example.*"])
class BlogApplication

fun main(args: Array<String>) {
	runApplication<BlogApplication>(*args)
}
