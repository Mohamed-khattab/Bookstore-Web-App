package com.store.services;

import com.store.entity.Book;
import com.store.entity.MyBookList;
import com.store.repository.MyBookRepository;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MyBookService {
    @Autowired
    private MyBookRepository myBookRepository ;

    public void saveMyBooks(MyBookList myBookList){
        myBookRepository.save(myBookList) ;
    }

    @Transactional
    public List<MyBookList> getAllBooks() {
        return myBookRepository.findAll();
    }

    @Transactional
    public void delete(MyBookList myBookList) {
        myBookRepository.delete(myBookList);
    }
    @Transactional
    public void deleteById(int id ){
        myBookRepository.deleteById(id);
    }
}
