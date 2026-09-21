package p120o;

import java.util.HashMap;

public final class a extends f {

    public final HashMap f25951l = new HashMap();

    @Override
    public final c d(Object obj) {
        return (c) this.f25951l.get(obj);
    }

    @Override
    public final Object e(Object obj) {
        Object objE = super.e(obj);
        this.f25951l.remove(obj);
        return objE;
    }
}
