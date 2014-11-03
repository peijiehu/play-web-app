package controllers;

import play.*;
import play.data.Form;
import play.data.validation.Constraints;
import play.mvc.*;

import views.html.*;

import static play.data.Form.form;

public class Application extends Controller {

    public static Result index() {
//        index._display_(form(Hello.class));
        return ok(index.render(form(Hello.class), "new form rendered"));
    }

    /**
     * Describes the hello form.
     */
    public static class Hello {
        @Constraints.Required
        public String name;
        @Constraints.Required
        @Constraints.Min(1) @Constraints.Max(100) public Integer repeat;
        public String color;
    }

    /**
     * Handles the form submission.
     */
    public static Result submit() {
        Form<Hello> form = form(Hello.class).bindFromRequest();
        if(form.hasErrors()) {
            return badRequest();
        } else {
            Hello data = form.get();
            return ok("Sucessfully submitted" + data.name + " " + data.color);
        }
    }

}
