package br.com.treinaweb.twclientes.controller;

import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import br.com.treinaweb.twclientes.model.cliente;
import br.com.treinaweb.twclientes.repository.ClienteRepository;

@Controller
@RequestMapping("/cliente")
public class ClienteController {

    @Autowired
    private ClienteRepository  clienteRepository;

    @GetMapping
    public <Cliente> ModelAndView listar(){
            ModelAndView modelAndView = new ModelAndView("cliente/listar.html");

            List<cliente> clientes = clienteRepository.findAll();
            modelAndView.addObject("Clientes", clientes);
            
            return modelAndView;
        }

              
          

        
           
    }
          
 



