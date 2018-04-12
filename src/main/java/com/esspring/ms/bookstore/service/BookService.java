package com.esspring.ms.bookstore.service;
 

import java.util.List;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;

import com.esspring.ms.bookstore.entity.Book; 
 
public interface BookService { 
    Book saveBook(@NotNull @Valid final Book book); 
    List<Book> getList(); 
    Book getBook(Long bookId); 
    void deleteBook(final Long bookId); 
} 