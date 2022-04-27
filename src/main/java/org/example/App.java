package org.example;
import static spark.Spark.*;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import spark.ModelAndView;
import spark.template.handlebars.HandlebarsTemplateEngine;

public class App {
    public static void main(String[] args) {
        get("/", (request, response) -> {
            Rectangle rectangle1 = new Rectangle(12, 7);
            Rectangle rectangle2 = new Rectangle(6, 6);
            Rectangle  rectangle3 = new Rectangle(0, -2);

            Map<String, ArrayList<Rectangle>> model = new HashMap<>();
            ArrayList myRectangleArrayList = Rectangle.getAll();

            model.put("myRectangles", myRectangleArrayList );

            return new ModelAndView(model, "index.hbs");
        }, new HandlebarsTemplateEngine());

        get("/welcome", (request, response) -> {
            Map<String, Object> model = new HashMap<String, Object>();
            model.put("username", request.session().attribute("username"));
            return new ModelAndView(model, "welcome.hbs");
        }, new HandlebarsTemplateEngine());

        post("/welcome", (request, response) -> {
            Map<String, Object> model = new HashMap<String, Object>();

            String inputtedUserName = request.queryParams("username");
            request.session().attribute("username", inputtedUserName);
            model.put("username", inputtedUserName);

            return new ModelAndView(model, "welcome.hbs");
        }, new HandlebarsTemplateEngine());

        post("/rectangles", (request, response) -> {
            Map<String, ArrayList<Rectangle>> model = new HashMap<>();

            int inputtedHeight = Integer.parseInt(request.params("height"));
            int inputtedWidth = Integer.parseInt(request.params("width"));
            Rectangle newRectangle = new Rectangle(inputtedHeight, inputtedWidth);
//            response.redirect("/");
            return new ModelAndView(model, "index.hbs");
        }, new HandlebarsTemplateEngine());
    }
}
