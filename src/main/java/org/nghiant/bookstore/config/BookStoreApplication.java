/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package org.nghiant.bookstore.config;

import jakarta.ws.rs.ApplicationPath;
import org.glassfish.jersey.server.ResourceConfig;

/**
 *
 * @author nghia
 */
@ApplicationPath("/api")
public class BookStoreApplication extends ResourceConfig {

    public BookStoreApplication() {
        
        packages("org.nghiant.bookstore.resources");
    }
    
}
