package springContainer

import org.springframework.boot.CommandLineRunner
import org.springframework.boot.SpringApplication
import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.context.annotation.Bean
import springContainer.entity.Director
import springContainer.entity.Orchestra
import springContainer.entity.Musician

@SpringBootApplication
class Application {
    @Bean
    fun init(d: Director) = CommandLineRunner {
        d.orchestra = Orchestra(listOf(Musician("Ringo", "Drums"),
                Musician("Paul", "Bass"),
                Musician("George", "Guitar"),
                Musician("John", "Guitar")))
    }
}

fun main(args: Array<String>) {
    SpringApplication.run(Application::class.java, *args)
    val orchestra: Orchestra = Orchestra(listOf())
    val director: Director = Director()
    val noise: String = director.makePerfectNoise()
    println(noise)
}