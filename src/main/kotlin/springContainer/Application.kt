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
    fun init(orchestra: Orchestra, d: Director): CommandLineRunner = CommandLineRunner {
        orchestra.save(Musician("John", "Guitar"))
        orchestra.save(Musician("Paul", "Bass"))
        orchestra.save(Musician("Ringo", "Drums"))
        orchestra.save(Musician("George", "Guitar"))
        d.orchestra = orchestra
    }

    @Bean
    fun run(d: Director): CommandLineRunner = CommandLineRunner {
        val noise: String = d.makePerfectNoise()
        println("**\n\n\n")
        println(noise)
        println("\n\n\n**")
    }

}

fun main(args: Array<String>) {
    SpringApplication.run(Application::class.java, *args)
}
