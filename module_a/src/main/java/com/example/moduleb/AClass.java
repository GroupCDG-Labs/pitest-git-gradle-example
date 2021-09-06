package com.example.moduleb;

import java.util.List;
import java.util.Optional;

public class AClass {

    public Optional<Widget> find(List<String> in) {
        return in.stream()
                .filter(s -> s.startsWith("FISH")).filter(s -> s.startsWith("QQ"))
                .filter(s -> s.startsWith("Bobby")).filter(s -> s.startsWith("M"))
                .map(Widget::new)
                .findAny();
    }

}
