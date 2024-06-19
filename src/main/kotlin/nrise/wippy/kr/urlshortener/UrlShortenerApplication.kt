package nrise.wippy.kr.urlshortener

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.context.properties.ConfigurationPropertiesScan
import org.springframework.boot.runApplication
import org.springframework.context.annotation.ComponentScan
import java.util.*

@ConfigurationPropertiesScan
@ComponentScan(basePackages = ["nrise.wippy.kr"])
@SpringBootApplication
class UrlShortenerApplication

fun main(args: Array<String>) {
    runApplication<UrlShortenerApplication>(*args)
}
