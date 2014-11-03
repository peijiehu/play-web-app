package models;

import play.data.validation.Constraints;
import play.db.ebean.Model;

import javax.persistence.Id;

/**
 * Created by phu on 11/3/14.
 */
public class Person extends Model {
    @Constraints.Required
    public String name;
    @Id
    @Constraints.Required
    public String email;

    public String getName(){return name;}
    public void setName(String name){this.name = name;}

    public String getEmail(){return email;}
    public void setEmail(String email){this.email = email;}
}
