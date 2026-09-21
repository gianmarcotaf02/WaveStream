package A6;

import E6.u;
import kotlin.jvm.internal.m;

public abstract class a implements c {
    private Object value;

    public a(Object obj) {
        this.value = obj;
    }

    public boolean beforeChange(u property, Object obj, Object obj2) {
        m.e(property, "property");
        return true;
    }

    @Override
    public Object getValue(Object obj, u property) {
        m.e(property, "property");
        return this.value;
    }

    @Override
    public void setValue(Object obj, u property, Object obj2) {
        m.e(property, "property");
        Object obj3 = this.value;
        if (beforeChange(property, obj3, obj2)) {
            this.value = obj2;
            afterChange(property, obj3, obj2);
        }
    }

    public String toString() {
        return B2.a.n(new StringBuilder("ObservableProperty(value="), this.value, ')');
    }

    public void afterChange(u uVar, Object obj, Object obj2) {
    }
}
