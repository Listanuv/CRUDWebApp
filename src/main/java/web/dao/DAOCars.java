package web.dao;

import org.springframework.stereotype.Component;
import web.controller.CarsController;
import web.model.Cars;

import java.util.ArrayList;
import java.util.List;
@Component
public class DAOCars {
    private List<Cars> cars;
    {
        cars=new ArrayList<>();
        cars.add(new Cars(0,"Ferrari","red"));
        cars.add(new Cars(1,"Lada","blue"));
        cars.add(new Cars(2,"Lamborghini","white"));
        cars.add(new Cars(3,"Chevrolet","gray"));
        cars.add(new Cars(4,"Toyota","yellow"));
    }
    public List<Cars> getAllCars(int index){
        if(index>cars.size()){index=cars.size();}
        List<Cars> carsList=new ArrayList<>();
        for(int i=0;i<index;i++){
            carsList.add(cars.get(i));
        }
        return carsList;
    }
}
