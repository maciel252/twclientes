package br.com.treinaweb.twclientes.controller;

import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import br.com.treinaweb.twclientes.model.cliente;
import br.com.treinaweb.twclientes.repository.ClienteRepository;

@Controller
@RequestMapping(path ="/cliente")
@CrossOrigin("*")
public class ClienteController {

    @Autowired
    private ClienteRepository  clienteRepository;

    @PostMapping("/")
    public @ResponseBody Integer addCliente(@RequestBody cliente objU) {
        clienteRepository.save(objU);
        return objU.getId();
    }

    @GetMapping
    public <Cliente> ModelAndView listar(){
            ModelAndView modelAndView = new ModelAndView("cliente/listar.html");

            List<cliente> clientes = clienteRepository.findAll();
            modelAndView.addObject("Clientes", clientes);
            
            return modelAndView;
        }

              
          

        
           
    }
          
 



