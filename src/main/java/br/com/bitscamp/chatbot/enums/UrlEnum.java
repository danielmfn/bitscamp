package br.com.bitscamp.chatbot.enums;

public class UrlEnum {

    public enum Sitema {

        NOME("Bitscamp"),
        URL("https://danielmfn.github.io/bitscamp-frontend/");

        private String descricao;

        Sitema(String descricao) {
            this.descricao = descricao;
        }

        public String getNome() {
            return NOME.descricao;
        }

        public String getUrl() {
            return URL.descricao;
        }
    }


}
