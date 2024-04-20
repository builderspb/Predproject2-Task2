package app.model;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component("dogBean")
@Primary
public class Dog extends Animal{

    @Override
    public String toString() {
        return "Im a dog";
    }
}
