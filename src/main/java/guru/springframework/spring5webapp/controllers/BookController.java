package guru.springframework.spring5webapp.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import guru.springframework.spring5webapp.repositories.AuthorRepository;
import guru.springframework.spring5webapp.repositories.BookRepository;

/**
 * BookController
 *
 * @author Florian Popa fpopa1991@gmail.com
 */
@Controller
public class BookController {

  private final BookRepository bookRepository;
  private final AuthorRepository authorRepository;

  public BookController(BookRepository bookRepository, AuthorRepository authorRepository) {
    this.bookRepository = bookRepository;
    this.authorRepository = authorRepository;
  }

  @RequestMapping("/books")
  public String getBooks(Model model) {

    model.addAttribute("books", bookRepository.findAll());

    return "books/list";
  }

  @RequestMapping("/authors")
  public String getAuthors(Model model) {

    model.addAttribute("authors", authorRepository.findAll());

    return "authors/list";
  }
}
