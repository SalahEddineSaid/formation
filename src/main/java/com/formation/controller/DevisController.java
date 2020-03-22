package com.formation.controller;


import com.formation.dao.DevisRepository;
import com.formation.entitie.Devis;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Collection;

@RestController
@CrossOrigin("*")
public class DevisController {

    @Autowired
    DevisRepository devisRepository;
    @RequestMapping(value = "/getAllDevis", method = RequestMethod.GET)
    public Collection<Devis> getAllDevis() {
        // TODO Auto-generated method stub
        System.out.println("ee");
        return devisRepository.findAll();
    }


    @RequestMapping(value = "/getDevis/{idDevis}", method = RequestMethod.GET)
    public Devis getDevis(@PathVariable  Long idDevis){

        return devisRepository.findById(idDevis).orElse(null);
    }

    @RequestMapping(value = "/getDevisByClient/{idclient}", method = RequestMethod.GET)
    public Collection<Devis> getDevisByIdClient(@PathVariable  Long idclient){

        return devisRepository.findByClient_Id(idclient);
    }

    @RequestMapping(value = "/saveDevis", method = RequestMethod.POST)
    public Devis saveDevis(@RequestBody Devis devis) {
        System.out.println("devis==="+devis.getDesignation());
        System.out.println(devis.getClient().getId());
        return devisRepository.save(devis);
    }


    @RequestMapping(value = "/updateDevis", method = RequestMethod.PUT)
    public Devis updateDevis(@RequestBody Devis devis) {
        return devisRepository.save(devis);
    }

    @RequestMapping(value = "/deleteDevis/{idDevis}", method = RequestMethod.DELETE)
    public void deleteDevis(@PathVariable Long idDevis) {
        devisRepository.deleteById(idDevis);
    }
}
