package p114n2;

import android.os.Bundle;
import android.os.Parcelable;
import kotlin.jvm.internal.m;

public final class E extends I {

    public final Class f25594l;

    public E(Class cls) {
        super(true);
        if (!Parcelable.class.isAssignableFrom(cls)) {
            throw new IllegalArgumentException((cls + " does not implement Parcelable.").toString());
        }
        try {
            this.f25594l = Class.forName("[L" + cls.getName() + ';');
        } catch (ClassNotFoundException e6) {
            throw new RuntimeException(e6);
        }
    }

    @Override
    public final Object a(String str, Bundle bundle) {
        m.e(bundle, "bundle");
        return (Parcelable[]) bundle.get(str);
    }

    @Override
    public final String b() {
        return this.f25594l.getName();
    }

    @Override
    public final Object d(String str) {
        throw new UnsupportedOperationException("Arrays don't support default values.");
    }

    @Override
    public final void e(Bundle bundle, String key, Object obj) {
        Parcelable[] parcelableArr = (Parcelable[]) obj;
        m.e(key, "key");
        this.f25594l.cast(parcelableArr);
        bundle.putParcelableArray(key, parcelableArr);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !E.class.equals(obj.getClass())) {
            return false;
        }
        return m.a(this.f25594l, ((E) obj).f25594l);
    }

    @Override
    public final boolean f(Object obj, Object obj2) {
        return p078i6.m.X((Parcelable[]) obj, (Parcelable[]) obj2);
    }

    public final int hashCode() {
        return this.f25594l.hashCode();
    }
}
