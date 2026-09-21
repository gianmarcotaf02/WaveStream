package p064h0;

import java.util.Map;
import kotlin.jvm.internal.m;

public class a implements Map.Entry, p201y6.a {

    public final int f22428h;

    public final Object f22429i;
    public final Object j;

    public a(Object obj, Object obj2, int i3) {
        this.f22428h = i3;
        this.f22429i = obj;
        this.j = obj2;
    }

    @Override
    public boolean equals(Object obj) {
        switch (this.f22428h) {
            case 0:
                Map.Entry entry = obj instanceof Map.Entry ? (Map.Entry) obj : null;
                return entry != null && m.a(entry.getKey(), this.f22429i) && m.a(entry.getValue(), getValue());
            default:
                return super.equals(obj);
        }
    }

    @Override
    public final Object getKey() {
        switch (this.f22428h) {
            case 0:
                break;
        }
        return this.f22429i;
    }

    @Override
    public Object getValue() {
        switch (this.f22428h) {
            case 0:
                break;
        }
        return this.j;
    }

    @Override
    public int hashCode() {
        switch (this.f22428h) {
            case 0:
                Object obj = this.f22429i;
                int iHashCode = obj != null ? obj.hashCode() : 0;
                Object value = getValue();
                return (value != null ? value.hashCode() : 0) ^ iHashCode;
            default:
                return super.hashCode();
        }
    }

    @Override
    public Object setValue(Object obj) {
        switch (this.f22428h) {
            case 0:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
            default:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    public String toString() {
        switch (this.f22428h) {
            case 0:
                StringBuilder sb = new StringBuilder();
                sb.append(this.f22429i);
                sb.append('=');
                sb.append(getValue());
                return sb.toString();
            default:
                return super.toString();
        }
    }
}
