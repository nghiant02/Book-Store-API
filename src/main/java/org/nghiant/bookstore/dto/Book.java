/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package org.nghiant.bookstore.dto;

import java.io.Serializable;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

/**
 *
 * @author nghia
 */
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@ToString
public class Book implements Serializable{
    
    private String isbn;
    private String title;
    private String author;
    private int publishedYear;
    
}
