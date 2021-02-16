package guru.springframework.spring5webapp.repositories;

import org.springframework.data.repository.CrudRepository;

import guru.springframework.spring5webapp.domain.Publisher;

/**
 * PublisherRepository
 *
 * @author Florian Popa fpopa1991@gmail.com
 */
public interface PublisherRepository extends CrudRepository<Publisher, Long> {

}
