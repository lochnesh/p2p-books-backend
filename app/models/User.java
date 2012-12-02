package models;

import models.*;
import java.util.*;
import org.bson.types.ObjectId;
import com.google.code.morphia.annotations.*;

@Entity
public class User {

  @Id
  public ObjectId id;
  private String singlyId;
  private String facebookId;
  private String firstName;
  private String lastName;
  private String email;
  private String thumbnail;
  private String accessToken;
  //private String campus;
  private String dwollaId;
  private String dwollaAccessToken;  

  
   
  private String campus;
  private List<Book> books;

  public String getSinglyId() {return singlyId;}
  public String getFacebookId() {return facebookId;}
  public String getFirstName() {return firstName;}
  public String getLastName() {return lastName;}
  public String getEmail() {return email;}
  public String getThumbnail() {return thumbnail;}
  public String getAccessToken() {return accessToken;}
  public String getDwollaId() {return dwollaId;}
  public String getDwollaAccessToken() {return dwollaAccessToken;}

  public void setSinglyId(String si) {singlyId = si;}
  public void setFacebookId(String fi) {facebookId = fi;}
  public void setFirstName(String fn) {firstName = fn;}
  public void setLastName(String ln) {lastName = ln;}
  public void setEmail(String e) {email = e;}
  public void setThumbnail(String t) {thumbnail = t;}
  public void setAccessToken(String at) {accessToken = at;}
  public void setDwollaId(String did) {dwollaId = did;}
  public void setDwollaAccessToken(String dat) {dwollaAccessToken = dat;}

  public String getCampus() {return campus;}

  public List<Book> getBooks() {return books;}

  public void setCampus(String theCampus) {campus = theCampus;}
  
  public void setBooks(List<Book> theBooks) {books = theBooks;}

}
