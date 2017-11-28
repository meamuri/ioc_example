package springContainer

import org.springframework.boot.CommandLineRunner
import org.springframework.boot.SpringApplication
import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.context.annotation.Bean
import springContainer.entity.Musician
import springContainer.entity.Orchestra
import springContainer.service.Director

@SpringBootApplication
class Application {
    @Bean
    fun init(repository: Orchestra) = CommandLineRunner {
        repository.save(Musician("Ringo", "Drums"))
        repository.save(Musician("Paul", "Bass"))
        repository.save(Musician("George", "Guitar"))
        repository.save(Musician("John", "Guitar"))
        println(repository.count())

        val director = Director()
        val noise: String = director.makePerfectNoise()
        println(noise)
    }

}

fun main(args: Array<String>) {
    SpringApplication.run(Application::class.java, *args)
}