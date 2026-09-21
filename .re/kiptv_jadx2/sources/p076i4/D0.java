package p076i4;

import java.util.Iterator;
import java.util.Map;

public final class D0 extends g1 {

    public final int f22788i;

    public D0(Iterator it, int i3) {
        super(it);
        this.f22788i = i3;
    }

    @Override
    public final Object a(Object obj) {
        switch (this.f22788i) {
            case 0:
                return ((Map.Entry) obj).getKey();
            default:
                return ((Map.Entry) obj).getValue();
        }
    }
}
