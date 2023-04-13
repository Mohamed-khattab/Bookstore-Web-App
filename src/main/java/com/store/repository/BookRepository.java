package com.store.repository;

import com.store.entity.Book;


import org.springframework.data.jpa.repository.JpaRepository;

import org.springframework.stereotype.Repository;
@Repository
public interface BookRepository extends JpaRepository<Book, Integer > {
//    @Bean
}
