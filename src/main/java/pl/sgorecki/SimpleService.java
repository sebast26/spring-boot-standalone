package pl.sgorecki;

import org.springframework.stereotype.Service;

/**
 * @author Sebastian Górecki <gorecki.sebastian@gmail.com>
 */
@Service
public class SimpleService {
    public String sayHello() {
        return "Hello!";
    }
}
