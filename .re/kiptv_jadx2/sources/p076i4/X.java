package p076i4;

import java.io.Serializable;

public final class X extends r implements Serializable {

    public final Object f22846h;

    public final Object f22847i;

    public X(Object obj, Object obj2) {
        this.f22846h = obj;
        this.f22847i = obj2;
    }

    @Override
    public final Object getKey() {
        return this.f22846h;
    }

    @Override
    public final Object getValue() {
        return this.f22847i;
    }

    @Override
    public final Object setValue(Object obj) {
        throw new UnsupportedOperationException();
    }
}
