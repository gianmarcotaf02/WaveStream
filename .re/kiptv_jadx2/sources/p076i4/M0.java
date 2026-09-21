package p076i4;

import com.google.android.gms.internal.play_billing.AbstractC1853k0;

public final class M0 {

    public final Object f22813a;

    public int f22814b;

    public final N0 f22815c;

    public M0(N0 n3, int i3) {
        this.f22815c = n3;
        this.f22813a = n3.f22817a[i3];
        this.f22814b = i3;
    }

    public final int a() {
        int i3 = this.f22814b;
        N0 n3 = this.f22815c;
        Object obj = this.f22813a;
        if (i3 == -1 || i3 >= n3.f22819c || !AbstractC1853k0.m(obj, n3.f22817a[i3])) {
            this.f22814b = n3.c(obj);
        }
        int i9 = this.f22814b;
        if (i9 == -1) {
            return 0;
        }
        return n3.f22818b[i9];
    }

    public final boolean equals(Object obj) {
        if (obj instanceof M0) {
            M0 m8 = (M0) obj;
            if (a() == m8.a() && AbstractC1853k0.m(this.f22813a, m8.f22813a)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        Object obj = this.f22813a;
        return (obj == null ? 0 : obj.hashCode()) ^ a();
    }

    public final String toString() {
        String strValueOf = String.valueOf(this.f22813a);
        int iA = a();
        if (iA == 1) {
            return strValueOf;
        }
        return strValueOf + " x " + iA;
    }
}
