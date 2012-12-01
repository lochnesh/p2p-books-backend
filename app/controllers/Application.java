package controllers;

import play.*;
import play.mvc.*;

import static play.libs.Json.toJson;

import views.html.*;
import models.*;

public class Application extends Controller {
  
  public static Result index() {
    return ok(index.render("Your new application is ready."));
  }

  public static Result books() {
    Book book = new Book();
    book.setTitle("Our Book");
    book.setAuthor("Dwolla Dwolla");
    book.setListPrice(100.00);
    book.setPublisher("Testing Publisher");
    return ok(toJson(book));
  }
  
}
