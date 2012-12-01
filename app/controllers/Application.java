package controllers;

import play.*;
import play.mvc.*;

import views.html.*;
import models.*;

public class Application extends Controller {
  
  public static Result index() {
    return ok(index.render("Your new application is ready."));
  }

  public static Result books() {
    Book book = new Book();
    return ok("these are books");
  }
  
}
