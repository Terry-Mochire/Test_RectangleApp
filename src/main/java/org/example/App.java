package org.example;
import static spark.Spark.*;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import spark.ModelAndView;
import spark.template.handlebars.HandlebarsTemplateEngine;

public class App {
    public static void main(String[] args) {
        port(8080);
        get("/", (request, response) -> {
            Rectangle rectangle1 = new Rectangle(12, 7);
            Rectangle rectangle2 = new Rectangle(6, 6);
            Rectangle  rectangle3 = new Rectangle(0, -2);

            Map<String, ArrayList<Rectangle>> model = new HashMap<>();
            ArrayList myRectangleArrayList = Rectangle.getAll();
            model.put("myRectangles", myRectangleArrayList );
            return new ModelAndView(model, "index.hbs");
        }, new HandlebarsTemplateEngine());
    }
}
