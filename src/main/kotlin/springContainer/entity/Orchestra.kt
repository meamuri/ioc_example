package springContainer.entity

import org.springframework.data.repository.CrudRepository

interface Orchestra: CrudRepository<Musician, Long>