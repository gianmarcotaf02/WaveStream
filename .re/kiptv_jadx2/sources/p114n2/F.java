package p114n2;

import android.os.Bundle;
import android.os.Parcelable;
import java.io.Serializable;
import kotlin.jvm.internal.m;

public final class F extends I {

    public final Class f25595l;

    public F(Class cls) {
        super(true);
        if (Parcelable.class.isAssignableFrom(cls) || Serializable.class.isAssignableFrom(cls)) {
            this.f25595l = cls;
            return;
        }
        throw new IllegalArgumentException((cls + " does not implement Parcelable or Serializable.").toString());
    }

    @Override
    public final Object a(String str, Bundle bundle) {
        m.e(bundle, "bundle");
        return bundle.get(str);
    }

    @Override
    public final String b() {
        return this.f25595l.getName();
    }

    @Override
    public final Object d(String str) {
        throw new UnsupportedOperationException("Parcelables don't support default values.");
    }

    @Override
    public final void e(Bundle bundle, String key, Object obj) {
        m.e(key, "key");
        this.f25595l.cast(obj);
        if (obj == null || (obj instanceof Parcelable)) {
            bundle.putParcelable(key, (Parcelable) obj);
        } else if (obj instanceof Serializable) {
            bundle.putSerializable(key, (Serializable) obj);
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !F.class.equals(obj.getClass())) {
            return false;
        }
        return m.a(this.f25595l, ((F) obj).f25595l);
    }

    public final int hashCode() {
        return this.f25595l.hashCode();
    }
}
