package springContainer.entity

import javax.persistence.Entity
import javax.persistence.GeneratedValue
import javax.persistence.GenerationType
import javax.persistence.Id

/**
 * https://kotlinlang.org/docs/reference/data-classes.html
 * data classes documentation
 *
 * https://blog.codecentric.de/en/2017/06/kotlin-spring-working-jpa-data-classes/
 * jpa data tutorial
 */
@Entity
data class Musician(private val name: String, private val instrument: String) {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    val id: Long? = null

    constructor() : this("", "")

    fun soundCheck(): String {
        return "musician $name make noice on $instrument instrument"
    }
}