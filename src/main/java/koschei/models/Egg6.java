package koschei.models;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component("egg")
public class Egg6 extends Deth8 {
    private Deth8 deth;

    @Autowired
    @Qualifier("needle")
    public void setNeedle(Deth8 deth) {
        this.deth = deth;
    }

    @Override
    public String toString() {
        return ", в яйце иголка " + deth.toString();
    }
}
