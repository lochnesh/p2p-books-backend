package models;

import java.util.*;

public class Book {

  private String title;
  private String author;
  private String publisher;
  private double listPrice;
  
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

}
  
