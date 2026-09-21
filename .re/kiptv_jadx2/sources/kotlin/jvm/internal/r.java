package kotlin.jvm.internal;

import H6.AbstractC0428s;

public class r extends q {
    public r(Class cls, String str, String str2, int i3) {
        super(AbstractC2538c.NO_RECEIVER, cls, str, str2, i3);
    }

    public Object get(Object obj) {
        return ((AbstractC0428s) getGetter()).call(obj);
    }

    public void set(Object obj, Object obj2) throws F6.a {
        ((AbstractC0428s) getSetter()).call(obj, obj2);
    }
}
