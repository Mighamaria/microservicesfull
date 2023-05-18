package com.ust.BookServices.controller;

import com.ust.BookServices.entity.Book;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/book")
public class BookRestController {
    @Autowired
    Environment environment;
    @GetMapping("/data")
    public  String getBookData(){
        return "data of BOOK-SERVICE,Running on port :" +environment.getProperty("local.server.port");
    }
    @GetMapping("/{id}")
    public Book getBookById(@PathVariable Integer id){
        return new Book(id,"Head first java",500.75);
    }
    @GetMapping("/all")
    public List<Book> getAll(){
        return List.of(
                new Book(502,"head first of java",439.67),
                new Book(503,"spring in action",639.67),
                new Book(506,"hibernate in action",678.67)
        );
    }

    @GetMapping("/entity")
    public ResponseEntity<String> getEntityData(){
        return  new ResponseEntity<String>("hello from BookRestController", HttpStatus.OK);
    }

}
