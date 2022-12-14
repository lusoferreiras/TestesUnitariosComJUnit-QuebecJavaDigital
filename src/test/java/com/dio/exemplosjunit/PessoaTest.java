package com.dio.exemplosjunit;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.time.LocalDate;
import java.time.LocalDateTime;

public class PessoaTest {

    @Test
    void deveCalcularIdadeCorretamente(){

        Pessoa jessica = new Pessoa("Jessica", LocalDateTime.of(2000, 1, 1,15,0,0));
        Assertions.assertEquals(22,jessica.getIdade());
    }

    @Test
    void DeveRetornarSeEhMaiorDeIdade(){
        Pessoa jessica = new Pessoa("Jessica", LocalDateTime.of(2000, 1, 1,15,0,0));
        Assertions.assertTrue(jessica.ehMaiorDeIdade());

        Pessoa joao = new Pessoa("João", LocalDateTime.now());
        Assertions.assertFalse(joao.ehMaiorDeIdade());
    }
}
