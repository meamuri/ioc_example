import org.junit.Assert
import org.junit.Test
import principleIoC.entity.Director
import principleIoC.entity.Musician
import principleIoC.entity.Orchestra

class OrchestraTest {
    private val musicians = listOf(
            Musician("Ringo", "Drums"),
            Musician("Paul", "Bass"),
            Musician("George", "Guitar"),
            Musician("John", "Guitar")
    )

    private val orchestra: Orchestra = Orchestra(musicians)

    @Test
    fun testOrchestraHasFourMusician(){
        Assert.assertEquals(4, orchestra.musicians.size)
    }

    @Test
    fun testEachRowContainSomeWords(){
        val director: Director = Director(orchestra)
        Assert.assertTrue(
                director
                        .makePerfectNoise()
                        .split("\n")
                        .all { s -> s.contains("instrument") }
        )
    }

    @Test
    fun testReportFromAllMusicians(){
        val director: Director = Director(orchestra)
        Assert.assertEquals(4,
                director
                        .makePerfectNoise()
                        .split("\n")
                        .count()
        )
    }

}