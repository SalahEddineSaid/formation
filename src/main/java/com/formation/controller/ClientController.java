package com.formation.controller;


import com.formation.dao.ClientRepository;
import com.formation.entitie.Client;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Collection;

@RestController
@CrossOrigin("*")
public class ClientController {


    @Autowired
    private ClientRepository clientRepository;


    @RequestMapping(value = "/getAllClients", method = RequestMethod.GET)
    public Collection<Client> getAllClients(){

        System.out.println(clientRepository.findById(1L).orElse(null).toString());
        return clientRepository.findAll();

    }

    @RequestMapping(value = "/getClient/{idClient}", method = RequestMethod.GET)
    public Client getClient(@PathVariable Long idClient){

        return clientRepository.findById(idClient).orElse(null);
    }


    @RequestMapping(value = "/saveClient", method = RequestMethod.POST)
    public Client saveClient(@RequestBody Client client) {

        return clientRepository.save(client) ;
    }


    @RequestMapping(value = "/updateClient", method = RequestMethod.PUT)
    public Client updateClinet(@RequestBody Client client) {
        return clientRepository.save(client);
    }


    @RequestMapping(value = "/deleteClient/{idclient}", method = RequestMethod.DELETE)
    public void deleteClient(@PathVariable Long idclient){

        clientRepository.deleteById(idclient);
    }
}