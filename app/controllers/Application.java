package controllers;

import controllers.*;
import play.*;
import play.mvc.*;

import views.html.*;

public class Application extends Controller {

    public Result index() {
        return ok(index.render("Your new application is ready."));
    }

    public Result echo(String msg) {
        return ok("echoing : " + msg);
    }

    public Result helloRedirect() {
        return redirect(controllers.routes.Application.echo("redirect"));
    }
}
