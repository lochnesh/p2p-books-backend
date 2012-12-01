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

  public static Result booksByTitle(String title) {
    return ok(toJson(getBooksByTitle(title)));
  }

  public static Result searchBooks(String query) {
    return ok(toJson(findBooks(query)));
  }

  public static Result booksByCampus(String campus) {
    return ok(toJson(getBooksByCampus(campus)));
  }

  private static List<Book> getBooksByCampus(String campus) {
    List<Book> booksAtCampus = new ArrayList<Book>();
    for(User user : getAllUsers()) {
      if(user.getCampus().equalsIgnoreCase(campus)) {
        booksAtCampus.addAll(user.getBooks());
      }
    }
    return booksAtCampus;
  }

  private static List<User> getAllUsers() {
    List<User> users = new ArrayList<User>();
    User user = new User();
    user.setCampus("Drake");
    user.setBooks(getBooks());
    users.add(user);

    User isuUser = new User();
    isuUser.setCampus("Iowa State");
    isuUser.setBooks(getBooks());
    users.add(isuUser);

    return users;
  }

  private static List<Book> getBooks() {
    List<Book> booksList = new ArrayList<Book>();
    Book book = new Book();
    book.setTitle("Our Book");
    book.setAuthor("Dwolla Dwolla");
    book.setListPrice(100.00);
    book.setPublisher("Testing Publisher");
    book.setIsbn("0-13-708107-3");
    booksList.add(book);
    booksList.add(book);
    return booksList;
  }

  private static List<Book> getBooksByTitle(String title) {
    List<Book> books = getBooks();
    List<Book> returnedBooks = new ArrayList<Book>();
    for (Book book : books) {
      if(book.getTitle().indexOf(title) != -1) {
        returnedBooks.add(book);
      }
    }
    return returnedBooks;
  }

  private static List<Book> findBooks(String query) {
    List<Book> books = getBooks();
    List<Book> returnedBooks = new ArrayList<Book>();
    for (Book book : books) {
      if(book.getTitle().indexOf(query) != -1) {
        returnedBooks.add(book);
      }
    }
    for (Book book : books) {
      if(book.getAuthor().indexOf(query) != -1) {
        returnedBooks.add(book);
      }
    }
    for (Book book : books) {
      if(book.getIsbn().indexOf(query) != -1) {
        returnedBooks.add(book);
      }
    }
    return returnedBooks;
  }
}
