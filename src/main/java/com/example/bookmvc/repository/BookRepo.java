package com.example.bookmvc.repository;

import com.example.bookmvc.entity.Book;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BookRepo extends JpaRepository<Book,Long> {
    @Override
    <S extends Book> S save(S entity);
}
