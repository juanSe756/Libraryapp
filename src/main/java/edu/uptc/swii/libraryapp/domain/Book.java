package edu.uptc.swii.libraryapp.domain;

import jakarta.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import jakarta.persistence.ManyToOne;

import jakarta.persistence.Id;

@Entity
public class Book {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private String name;
    private String description;
    private String imagenUrl;

    @ManyToOne
    private Editorial editorial;

    
    public Book() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getImagenUrl() {
        return imagenUrl;
    }

    public void setImagenUrl(String imagenUrl) {
        this.imagenUrl = imagenUrl;
    }
    

    @Override
    public String toString() {
        return "Book [name=" + name + ", description=" + description + ", imagenUrl=" + imagenUrl + "]";
    }

    public Editorial getEditorial() {
        return editorial;
    }

    public void setEditorial(Editorial editorial) {
        this.editorial = editorial;
    }

}
