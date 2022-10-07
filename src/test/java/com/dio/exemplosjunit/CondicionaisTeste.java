package com.dio.exemplosjunit;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class CondicionaisTeste {

    @Test
    void validarAlgoSomenteNoUsuarioWillyam(){
        Assertions.assertEquals(10,5+5);
    }
}
