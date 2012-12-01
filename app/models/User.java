package models;

import models.*;
import java.util.*;

public class User {

  private String campus;
  private List<Book> books;

  public String getCampus() {return campus;}

  public List<Book> getBooks() {return books;}

  public void setCampus(String theCampus) {campus = theCampus;}
  
  public void setBooks(List<Book> theBooks) {books = theBooks;}

}
