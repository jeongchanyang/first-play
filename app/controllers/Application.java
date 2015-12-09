package controllers;

import controllers.*;
import play.*;
import play.mvc.*;

import views.html.*;

public class Application extends Controller {

    private final java.util.Map<Integer,String> productMap = new java.util.HashMap<Integer,String>();

    public Application() {
        productMap.put(1,"Keyboard");
        productMap.put(2,"Mouse");
        productMap.put(3,"Monitor");
    }
    public Result index() {
        return ok(index.render("Your new application is ready."));
    }

    public Result echo(String msg) {
        return ok("echoing : " + msg);
    }

    public Result helloRedirect() {
        return redirect(controllers.routes.Application.echo("redirect"));
    }
    public Result listProducts() {
        return ok(products.render(productMap.values()));
    }
    public Result listProductsAsXML(){return ok(views.xml.products.render(productMap));}
    public Result listProductsAsTXT(){return ok(views.txt.products.render(productMap));}
}
