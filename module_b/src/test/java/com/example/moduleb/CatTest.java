package com.example.moduleb;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class CatTest {

    @Test
    void isCute() {
        Cat c = new Cat("kitty", 42, 0);
        assertThat(c.catCuteness()).isEqualTo(42);

    }
}