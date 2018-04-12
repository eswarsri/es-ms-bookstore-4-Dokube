package com.esspring.ms.bookstore.repository;
 

import org.springframework.data.jpa.repository.JpaRepository;

import com.esspring.ms.bookstore.entity.Book; 
 
public interface BookRepository extends JpaRepository<Book, Long> { 
} 