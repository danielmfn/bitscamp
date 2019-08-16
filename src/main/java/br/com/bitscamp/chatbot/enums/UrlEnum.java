package br.com.bitscamp.chatbot.enums;

public class UrlEnum {

    public enum GestaoFrontEnd {

        NOME("Bitscamp"),
        URL_DEV("https://localhost:900"),
        URL_PROD("https://danielmfn.github.io/bitscamp-frontend");

        private String descricao;

        GestaoFrontEnd(String descricao) {
            this.descricao = descricao;
        }

        public String getNome() {
            return NOME.descricao;
        }

        public String getUrl() {
            return this.descricao;
        }
    }


}
