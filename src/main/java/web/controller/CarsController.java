package web.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import web.dao.DAOCars;

import javax.servlet.http.HttpServletRequest;

@Controller
@RequestMapping(value = "/cars")
public class CarsController {
    private final DAOCars daoCars;
    @Autowired
    public CarsController(DAOCars daoCars) {
        this.daoCars = daoCars;
    }

    @GetMapping()
    public String getAllCars(Model model,@RequestParam(required = false , name = "count") String count){
        if(count==null) {
            model.addAttribute("cars", daoCars.getAllCars(5));
        }
        else{
            model.addAttribute("cars", daoCars.getAllCars(Integer.parseInt(count)));
        }

    return "cars";
    }

}
