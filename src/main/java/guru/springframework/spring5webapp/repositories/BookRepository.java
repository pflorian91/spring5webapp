package guru.springframework.spring5webapp.repositories;

import org.springframework.data.repository.CrudRepository;

import guru.springframework.spring5webapp.domain.Book;

/**
 * BookRepository
 *
 * @author Florian Popa fpopa1991@gmail.com
 */
public interface BookRepository extends CrudRepository<Book, Long> {

}
