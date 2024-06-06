package koschei.models;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component("rabbit")
public class Rabbit4 extends Deth8 {

    private Deth8 deth;

    @Autowired
    public Rabbit4(@Qualifier("duck") Deth8 deth) {
        this.deth = deth;
    }

    @Override
    public String toString() {
        return ", в зайце утка " + deth.toString();
    }
}
