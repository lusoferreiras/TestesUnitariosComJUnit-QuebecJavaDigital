package com.dio.exemplosjunit;

import java.util.logging.Logger;

public class BancoDeDados {

    public static final Logger LOGGER = Logger.getLogger(BancoDeDados.class.getName());

    public static void iniciarConexao(){
        //fez algo
        LOGGER.info("Iniciou Conexão");
    }

    public static void finalizarConexao(){
        //fez algo
        LOGGER.info("Finalizou Conexão");
    }

    public static void insereDados(Pessoa pessoa){
        //insere pessoa no BD
        LOGGER.info("inseriu dados");
    }

    public static void removeDados(Pessoa pessoa){
        //remove pessoa no BD
        LOGGER.info("removeu dados");
    }
}
