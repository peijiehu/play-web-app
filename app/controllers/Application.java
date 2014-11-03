package controllers;

import models.Person;
import play.mvc.*;
import views.html.*;
import static play.data.Form.form;

public class Application extends Controller {

    public static Result index() {
        return ok(index.render());
    }

    /**
     * Handles the form submission.
     */
    public static Result submit() {
        Person person = form(Person.class).bindFromRequest().get();
        return ok("Sucessfully submitted " + person.name + " " + person.email);
    }

}
