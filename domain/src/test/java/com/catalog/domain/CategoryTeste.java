package com.catalog.domain;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class CategoryTeste {

    @Test
    public void testeNewCategory(){
        Assertions.assertNotNull(new Category());
    }
}
