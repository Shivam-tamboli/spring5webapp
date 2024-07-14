package guru.springframework.spring5webapp.controller;

import org.springframework.ui.Model;
import guru.springframework.spring5webapp.domain.Author;
import guru.springframework.spring5webapp.repositories.AuthorRepository;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.StreamSupport;


@Controller
public class AuthorController {

    private final AuthorRepository authorRepository ;
    // Constructor for dependency injection.
    public AuthorController(AuthorRepository authorRepository){
        this.authorRepository = authorRepository;
    }

    // Get reuests for authors to the listAuthor method.
    @GetMapping("/authors")

    public String listAuthors(Model model){

     model.addAttribute("authors", authorRepository.findAll());
    //
    return "authors/list";



    }

}
