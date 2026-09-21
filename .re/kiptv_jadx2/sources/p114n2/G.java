package p114n2;

import android.os.Bundle;
import java.io.Serializable;
import kotlin.jvm.internal.m;

public final class G extends I {

    public final Class f25596l;

    public G(Class cls) {
        super(true);
        if (!Serializable.class.isAssignableFrom(cls)) {
            throw new IllegalArgumentException((cls + " does not implement Serializable.").toString());
        }
        try {
            this.f25596l = Class.forName("[L" + cls.getName() + ';');
        } catch (ClassNotFoundException e6) {
            throw new RuntimeException(e6);
        }
    }

    @Override
    public final Object a(String str, Bundle bundle) {
        m.e(bundle, "bundle");
        return (Serializable[]) bundle.get(str);
    }

    @Override
    public final String b() {
        return this.f25596l.getName();
    }

    @Override
    public final Object d(String str) {
        throw new UnsupportedOperationException("Arrays don't support default values.");
    }

    @Override
    public final void e(Bundle bundle, String key, Object obj) {
        ?? r9 = (Serializable[]) obj;
        m.e(key, "key");
        this.f25596l.cast(r9);
        bundle.putSerializable(key, r9);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !G.class.equals(obj.getClass())) {
            return false;
        }
        return m.a(this.f25596l, ((G) obj).f25596l);
    }

    @Override
    public final boolean f(Object obj, Object obj2) {
        return p078i6.m.X((Serializable[]) obj, (Serializable[]) obj2);
    }

    public final int hashCode() {
        return this.f25596l.hashCode();
    }
}
