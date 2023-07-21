/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package org.nghiant.bookstore.resources.v1;

import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;
import java.util.ArrayList;
import java.util.List;
import org.nghiant.bookstore.dto.Book;

/**
 *
 * @author nghia
 */
@Path("v1/books")
public class BookResource {

//    @GET
//    @Produces(MediaType.APPLICATION_JSON)
//    public Book getAbook() {
//
//        return new Book("2018-1", "doi ngan dung ngu dai", "japan", 2018);
//    }
    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public List<Book> getAbook() {
        List<Book> books = new ArrayList();
        books.add(new Book("2018-1", "doi ngan dung ngu dai", "japan", 2018));
        books.add(new Book("2018-2", "tuoi tre dang gia bao nhieu", "vietnam", 2019));

        return books;
    }

}
