package br.com.bitscamp.chatbot.controller;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class PagesResource {

    @RequestMapping("/")
    public String index(){
        return "index";
    }

    @RequestMapping("/base")
    public String base(){
        return "pages/base/base";
    }

    @RequestMapping("/manter_usuario")
    public String usuario(){
        return "pages/usuario/manter_usuario";
    }

    @RequestMapping("/manter_categoria")
    public String categoriaUsuario(){
        return "pages/usuario/manter_categoria";
    }

    @RequestMapping("/manter_loja")
    public String loja(){
        return "pages/loja/manter_loja";
    }

    @RequestMapping("/manter_cliente")
    public String cliente(){
        return "pages/cliente/manter_cliente";
    }

    @RequestMapping("/manter_perfil")
    public String perfilCliente(){
        return "pages/cliente/manter_perfil";
    }

    @RequestMapping("/login")
    public String login() { return "pages/autenticacao/login"; }

    @RequestMapping("/logout")
    public String logout() { return "pages/autenticacao/logout"; }

}