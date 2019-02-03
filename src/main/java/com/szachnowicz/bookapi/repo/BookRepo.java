package com.szachnowicz.bookapi.repo;

import com.szachnowicz.bookapi.model.Book;
import com.szachnowicz.bookapi.model.User;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Options;
import org.apache.ibatis.annotations.Select;

import java.util.List;
import java.util.Optional;

@Mapper
public interface BookRepo {
    @Insert("INSERT INTO BOOK(id,title,author) values(#{id},#{title},#{author})")
    @Options(useGeneratedKeys = true, keyProperty = "id", keyColumn = "id")
    void insertBook(Book book);


    @Select("SELECT * FROM BOOK")
     List<Book> findAll();

}
