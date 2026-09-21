package p114n2;

import android.os.Bundle;
import java.io.Serializable;
import kotlin.jvm.internal.m;

public class H extends I {

    public final Class f25597l;

    public H(Class cls) {
        super(true);
        if (!Serializable.class.isAssignableFrom(cls)) {
            throw new IllegalArgumentException((cls + " does not implement Serializable.").toString());
        }
        if (!cls.isEnum()) {
            this.f25597l = cls;
            return;
        }
        throw new IllegalArgumentException((cls + " is an Enum. You should use EnumType instead.").toString());
    }

    @Override
    public final Object a(String str, Bundle bundle) {
        m.e(bundle, "bundle");
        return (Serializable) bundle.get(str);
    }

    @Override
    public String b() {
        return this.f25597l.getName();
    }

    @Override
    public final void e(Bundle bundle, String key, Object obj) {
        Serializable value = (Serializable) obj;
        m.e(key, "key");
        m.e(value, "value");
        this.f25597l.cast(value);
        bundle.putSerializable(key, value);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof H)) {
            return false;
        }
        return m.a(this.f25597l, ((H) obj).f25597l);
    }

    @Override
    public Serializable d(String str) {
        throw new UnsupportedOperationException("Serializables don't support default values.");
    }

    public final int hashCode() {
        return this.f25597l.hashCode();
    }

    public H(Class cls, int i3) {
        super(false);
        if (Serializable.class.isAssignableFrom(cls)) {
            this.f25597l = cls;
            return;
        }
        throw new IllegalArgumentException((cls + " does not implement Serializable.").toString());
    }
}
