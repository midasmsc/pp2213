package app.model;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class AnimalsCage {

    @Qualifier("cat")
    @Autowired
    private Animal animal;

    public void whatAnimalSay() {
        System.out.println("Say:");
        System.out.println(animal.toString());
        System.out.println("At:");
        System.out.println(new Timer().getTime());
        System.out.println("________________________");
    }
    @Autowired
    private Timer timer;

    public Timer getTimer() {
        return timer;
    }

    public void setTimer(Timer timer) {
        this.timer = timer;
    }
}