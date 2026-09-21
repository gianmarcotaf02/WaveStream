package p077i5;

import java.lang.ref.WeakReference;
import kotlin.jvm.internal.m;
import p194x6.j;

public final class C2234a implements j {

    public final int f23082h;

    public final P f23083i;

    public C2234a(P p2, int i3) {
        this.f23082h = i3;
        this.f23083i = p2;
    }

    @Override
    public final Object invoke(Object obj) {
        WeakReference it = (WeakReference) obj;
        switch (this.f23082h) {
            case 0:
                m.e(it, "it");
                return Boolean.valueOf(it.get() == null || it.get() == this.f23083i);
            default:
                m.e(it, "it");
                return Boolean.valueOf(it.get() == null || it.get() == this.f23083i);
        }
    }
}
