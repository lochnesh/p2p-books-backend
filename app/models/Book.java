package models;

import java.util.*;
import models.*;

public class Book {

  private String title;
  private String author;
  private String publisher;
  private double listPrice;
  private User user;
  private String isbn;
  private long id;

  public void setId(long theId) {id = theId;}
 
  public long getId() {return id;}  
 
  public void setTitle(String theTitle) {
    title = theTitle;
  }

  public void setAuthor(String theAuthor) {
    author = theAuthor;
  }

  public void setPublisher(String thePublisher) {
    publisher = thePublisher;
  }

  public void setListPrice(double theListPrice) {
    listPrice = theListPrice;
  }
 
  public String getTitle() {
    return title;
  }

  public String getAuthor() {
    return author;
  }

  public String getPublisher() {
    return publisher;
  }

  public double getListPrice() {
    return listPrice;
  }

  public void setUser(User theUser) {user = theUser;}

  public User getUser() {return user;}

  public void setIsbn(String theIsbn) { isbn = theIsbn; }
  
  public String getIsbn() {return isbn;}

}
  
