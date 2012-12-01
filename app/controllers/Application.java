package controllers;

import play.*;
import play.mvc.*;

import static play.libs.Json.toJson;

import views.html.*;
import models.*;

import java.util.*;

public class Application extends Controller {
  
  public static Result index() {
    return ok(index.render("Your new application is ready."));
  }

  public static Result books() {
    return ok(toJson(getBooks()));
  }

  private static List<Book> getBooks() {
    List<Book> booksList = new ArrayList<Book>();
    Book book = new Book();
    book.setTitle("Our Book");
    book.setAuthor("Dwolla Dwolla");
    book.setListPrice(100.00);
    book.setPublisher("Testing Publisher");
    booksList.add(book);
    booksList.add(book);
    return booksList;
  }
    
  
}
