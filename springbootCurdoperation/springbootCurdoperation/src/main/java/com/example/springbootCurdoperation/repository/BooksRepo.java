package com.example.springbootCurdoperation.repository;

import com.example.springbootCurdoperation.models.Books;
import org.springframework.data.jpa.repository.JpaRepository;
                                                       //primary key
public interface BooksRepo extends JpaRepository<Books,Integer> {

}
