package p076i4;

import com.google.android.gms.internal.play_billing.AbstractC1864o0;
import java.util.AbstractMap;
import java.util.Objects;

public final class T0 extends AbstractC2186b0 {
    public final U0 j;

    public T0(U0 u1) {
        this.j = u1;
    }

    @Override
    public final Object get(int i3) {
        U0 u1 = this.j;
        AbstractC1864o0.R(i3, u1.f22840n);
        int i9 = i3 * 2;
        int i10 = u1.f22839m;
        Object[] objArr = u1.f22838l;
        Object obj = objArr[i9 + i10];
        Objects.requireNonNull(obj);
        Object obj2 = objArr[i9 + (i10 ^ 1)];
        Objects.requireNonNull(obj2);
        return new AbstractMap.SimpleImmutableEntry(obj, obj2);
    }

    @Override
    public final boolean p() {
        return true;
    }

    @Override
    public final int size() {
        return this.j.f22840n;
    }
}
