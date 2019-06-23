package br.com.bitscamp.chatbot.controller;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class PagesResource {

    @RequestMapping("/")
    public String base(){
        return "index";
    }

    @RequestMapping("/index.html")
    public String index(){
        return "index";
    }

    @RequestMapping("/index (cópia).html")
    public String indexCopy(){
        return "index (cópia)";
    }
}