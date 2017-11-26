package springContainer

import org.springframework.boot.CommandLineRunner
import org.springframework.boot.SpringApplication
import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.context.annotation.Bean
import springContainer.service.Director

@SpringBootApplication
class Application {
    @Bean
    fun init(d: Director) = CommandLineRunner {
    }
}

fun main(args: Array<String>) {
    SpringApplication.run(Application::class.java, *args)
    val director = Director()
//    val noise: String = director.makePerfectNoise()
//    println(noise)
}