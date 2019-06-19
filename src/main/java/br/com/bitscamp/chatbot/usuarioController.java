package br.com.bitscamp.chatbot;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;;


@Controller
public class usuarioController{
    @RequestMapping("/usuario.html")
    public String usuario(){
        return "usuario";
    }
}