package guru.springframework.spring5webapp.repositories;

import org.springframework.data.repository.CrudRepository;

import guru.springframework.spring5webapp.domain.Author;

/**
 * AuthorRepository
 *
 * @author Florian Popa fpopa1991@gmail.com
 */
public interface AuthorRepository extends CrudRepository<Author, Long> {

}
