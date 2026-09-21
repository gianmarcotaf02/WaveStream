package p005a5;

import com.google.android.gms.internal.play_billing.M0;
import kotlin.jvm.internal.m;

public final class U2 extends W2 {

    public final T2 f13961a;

    public U2(T2 t9) {
        this.f13961a = t9;
    }

    @Override
    public final String a() {
        return M0.l(this.f13961a.f13919a, "c");
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof U2) && m.a(this.f13961a, ((U2) obj).f13961a);
    }

    public final int hashCode() {
        return this.f13961a.hashCode();
    }

    public final String toString() {
        return "Collection(group=" + this.f13961a + ")";
    }
}
