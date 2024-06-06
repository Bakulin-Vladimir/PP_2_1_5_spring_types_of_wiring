package koschei.models;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component("duck")
public class Duck5 extends Deth8 {

    @Autowired
    @Qualifier("egg")
    private Deth8 deth;

    @Override
    public String toString() {
        return ", в утке яйцо " + deth.toString();
    }
}
