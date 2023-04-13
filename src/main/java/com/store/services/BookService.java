package com.store.services;

import com.store.entity.Book;
import com.store.repository.BookRepository;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BookService {
    @Autowired
    private  BookRepository bRepo ;
    public BookService(BookRepository bRepo) {
        this.bRepo = bRepo;
    }

    public void save(Book book ) {
//        System.out.println("good-service");
        bRepo.save(book) ;
    }


    @Transactional
    public Book findById(int id) {
        return bRepo.findById(id).get() ;
    }

    @Transactional
    public List<Book> getAllBooks() {
        return bRepo.findAll();
    }

    @Transactional
    public void update(Book book) {
        bRepo.save(book);
    }

    @Transactional
    public void deleteById(int id )
    {
        bRepo.deleteById(id);
    }



}
