package info.jerrinot.springdemo.xml;

import org.springframework.stereotype.Service;

@Service
public class SpringService {
    private int magicValue;

    public void setMagicValue(int magicValue) {
        this.magicValue = magicValue;
    }

    public int getMagicValue() {
        return magicValue;
    }
}
