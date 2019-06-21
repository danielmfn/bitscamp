package br.com.bitscamp.chatbot.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class UsuarioResource {

    @RequestMapping("cadastrarusuario")
    public String form() {
        return "formUsuario";
    }

}