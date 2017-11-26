package springContainer.entity

import org.springframework.beans.factory.annotation.Autowired
import org.springframework.stereotype.Component


@Component
class Orchestra @Autowired constructor(val musicians: List<Musician>)