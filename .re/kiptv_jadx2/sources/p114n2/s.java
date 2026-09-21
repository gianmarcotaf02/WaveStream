package p114n2;

import android.os.Bundle;
import kotlin.jvm.internal.m;

public final class s implements Comparable {

    public final t f25665h;

    public final Bundle f25666i;
    public final boolean j;

    public final int f25667k;

    public final boolean f25668l;

    public s(t destination, Bundle bundle, boolean z6, int i3, boolean z9) {
        m.e(destination, "destination");
        this.f25665h = destination;
        this.f25666i = bundle;
        this.j = z6;
        this.f25667k = i3;
        this.f25668l = z9;
    }

    @Override
    public final int compareTo(s other) {
        m.e(other, "other");
        boolean z6 = other.j;
        boolean z9 = this.j;
        if (z9 && !z6) {
            return 1;
        }
        if (!z9 && z6) {
            return -1;
        }
        int i3 = this.f25667k - other.f25667k;
        if (i3 > 0) {
            return 1;
        }
        if (i3 < 0) {
            return -1;
        }
        Bundle bundle = other.f25666i;
        Bundle bundle2 = this.f25666i;
        if (bundle2 != null && bundle == null) {
            return 1;
        }
        if (bundle2 == null && bundle != null) {
            return -1;
        }
        if (bundle2 != null) {
            int size = bundle2.size();
            m.b(bundle);
            int size2 = size - bundle.size();
            if (size2 > 0) {
                return 1;
            }
            if (size2 < 0) {
                return -1;
            }
        }
        boolean z10 = other.f25668l;
        boolean z11 = this.f25668l;
        if (!z11 || z10) {
            return (z11 || !z10) ? 0 : -1;
        }
        return 1;
    }
}
