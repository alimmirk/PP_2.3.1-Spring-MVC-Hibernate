package web.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import web.service.CarsService;

@Controller
public class CarsController {
    @Autowired
    private CarsService carsService;

    @GetMapping("/cars")
    public String getCars(@RequestParam(value = "count", required = false, defaultValue = "5")
                          int count,  Model model ) {
        model.addAttribute("cars", carsService.getCars(count));

        return "cars";
    }
}
