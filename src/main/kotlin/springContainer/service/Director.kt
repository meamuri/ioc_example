package springContainer.service

import org.springframework.beans.factory.annotation.Autowired
import org.springframework.stereotype.Service
import springContainer.entity.Orchestra

interface IDirector {
    fun makePerfectNoise(): String
}

@Service
class Director: IDirector {
    @Autowired
    lateinit var orchestra: Orchestra

    override fun makePerfectNoise(): String {
        val sounds: List<String> = orchestra.findAll().map { m -> m.soundCheck() }
        return sounds.joinToString(",\n")
    }
} // .. class Director