package S4;

import java.util.Iterator;
import java.util.Set;

public final class C0873l {
    public static final C0872k Companion = new C0872k();

    public static final C0873l f9408c;

    public final Set f9409a;

    public final Set f9410b;

    static {
        p078i6.y yVar = p078i6.y.f23207h;
        f9408c = new C0873l(yVar, yVar);
    }

    public C0873l(Set set, Set set2) {
        this.f9409a = set;
        this.f9410b = set2;
    }

    public final String a() {
        Iterator it = p078i6.o.H1(this.f9409a).iterator();
        long j = -3750763034362895579L;
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            for (byte b9 : O7.x.p0("c:" + ((String) it.next()))) {
                j = (j ^ (((long) b9) & 255)) * 1099511628211L;
            }
            j = (j ^ 31) * 1099511628211L;
        }
        Iterator it2 = p078i6.o.H1(this.f9410b).iterator();
        while (it2.hasNext()) {
            byte[] bArrP0 = O7.x.p0("i:" + ((String) it2.next()));
            int length = bArrP0.length;
            for (int i3 = 0; i3 < length; i3++) {
                j = (j ^ (((long) bArrP0[i3]) & 255)) * 1099511628211L;
            }
            j = (j ^ 31) * 1099511628211L;
        }
        String hexString = Long.toHexString(j);
        kotlin.jvm.internal.m.d(hexString, "toHexString(...)");
        return hexString;
    }

    public final boolean b(int i3, String str) {
        Set set = this.f9410b;
        if (!set.isEmpty() && set.contains(String.valueOf(i3))) {
            return true;
        }
        Set set2 = this.f9409a;
        return (set2.isEmpty() || str == null || !set2.contains(str)) ? false : true;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0873l)) {
            return false;
        }
        C0873l c0873l = (C0873l) obj;
        return kotlin.jvm.internal.m.a(this.f9409a, c0873l.f9409a) && kotlin.jvm.internal.m.a(this.f9410b, c0873l.f9410b);
    }

    public final int hashCode() {
        return this.f9410b.hashCode() + (this.f9409a.hashCode() * 31);
    }

    public final String toString() {
        return "ContentVisibilityFilter(hiddenCategoryIds=" + this.f9409a + ", hiddenItemIds=" + this.f9410b + ")";
    }
}
