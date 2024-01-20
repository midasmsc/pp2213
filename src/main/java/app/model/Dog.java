package app.model;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class Dog extends Animal {
    @Qualifier("Dog")
    @Override
    public String toString() {
        return "Im a Dog";
    }
}
