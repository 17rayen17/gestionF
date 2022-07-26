package com.example.gestionF;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/admin")
public class Controller {

    @Autowired
    private Services service;

    /*public Controller(Services service){
        this.service=service;
    }*/

    @GetMapping(value = {"","/"})
    public List<Cycle> cl(){
        return service.insert();
    }





    @GetMapping("/{id}")
    public Cycle getCycle(@PathVariable int id){
        return service.getcycle(id);
    }

    @PostMapping("/")
    public Cycle cl(@RequestBody Cycle cl){
        return service.addcycle(cl);

    }

    @RequestMapping (method = RequestMethod.PUT, value="/{id}")
    public void updatecycle(@RequestBody Cycle cl,@PathVariable int id){
        service.updatecl(cl,id);


    }

    @DeleteMapping("/{id}")
    public void removecycle(@PathVariable int id){
        service.removecycle(id);
    }

}
