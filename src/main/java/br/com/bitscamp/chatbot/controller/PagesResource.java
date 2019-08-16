package br.com.bitscamp.chatbot.controller;
import br.com.bitscamp.chatbot.enums.UrlEnum;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PagesResource {

    String urlSistema = UrlEnum.GestaoFrontEnd.URL.getUrl();

    @RequestMapping("/")
    public String index(){
        return urlSistema;
    }

    @RequestMapping("/base")
    public String base(){
        return urlSistema+"/pages/base/base";
    }

    @RequestMapping("/manter_usuario")
    public String usuario(){
        return urlSistema+"/pages/usuario/manter_usuario";
    }

    @RequestMapping("/manter_categoria")
    public String categoriaUsuario(){
        return urlSistema+"/pages/usuario/manter_categoria";
    }

    @RequestMapping("/manter_loja")
    public String loja(){
        return urlSistema+"/pages/loja/manter_loja";
    }

    @RequestMapping("/manter_cliente")
    public String cliente(){
        return urlSistema+"/pages/cliente/manter_cliente";
    }

    @RequestMapping("/manter_perfil")
    public String perfilCliente(){
        return urlSistema+"/pages/cliente/manter_perfil";
    }

    @RequestMapping("/login")
    public String login() { return urlSistema+"/pages/autenticacao/login"; }

    @RequestMapping("/logout")
    public String logout() { return urlSistema+"/pages/autenticacao/logout"; }

}