package com.yunfang.secondbook.repository;

import com.yunfang.secondbook.entity.Book;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface BookRepository extends MongoRepository <Book, Long> {
}
