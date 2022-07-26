package com.example.gestionF;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.*;


@Service
public class Services {

    @Autowired
    private adminrepostory admin;



    public List<Cycle> insert(){
        List<Cycle> cl = new ArrayList<>();
        admin.findAll().forEach(cl1 -> cl.add(cl1));
        return cl;
    }


    public Cycle getcycle(int numa) {
        return admin.findById(numa).get();
    }

    public Cycle addcycle(Cycle cl){
        return admin.save(cl);
    }

    public void removecycle(int numa){
        admin.deleteById(numa);
    }


    public void updatecl(Cycle cl,int id){
        admin.save(cl);

    }
}
