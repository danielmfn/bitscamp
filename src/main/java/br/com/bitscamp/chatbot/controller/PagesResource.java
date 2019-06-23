package br.com.bitscamp.chatbot.controller;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class PagesResource {

    @RequestMapping("/")
    public String index(){
        return "index";
    }

    @RequestMapping("/exemplo.html")
    public String indexCopy(){
        return "index (cópia)";
    }

    @RequestMapping("paginas/usuario")
    public String usuario(){
        return "pages/usuario/manter_usuario";
    }

    @RequestMapping("paginas/categoria_usuario")
    public String categoriaUsuario(){
        return "pages/usuario/manter_categoria";
    }

    @RequestMapping("paginas/loja")
    public String loja(){
        return "pages/loja/manter_loja";
    }

    @RequestMapping("paginas/cliente")
    public String cliente(){
        return "pages/cliente/manter_cliente";
    }

    @RequestMapping("paginas/perfil_cliente")
    public String perfilCliente(){
        return "pages/cliente/manter_perfil";
    }


}