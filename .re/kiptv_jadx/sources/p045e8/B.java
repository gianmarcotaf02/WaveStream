package p045e8;

/* JADX INFO: loaded from: classes4.dex */
public final class B {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final p045e8.B f21481b;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final java.util.List f21482a;

    static {
        new p045e8.B(p078i6.p.B0("Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday", "Sunday"));
        f21481b = new p045e8.B(p078i6.p.B0("Mon", "Tue", "Wed", "Thu", "Fri", "Sat", "Sun"));
    }

    public B(java.util.List list) {
        this.f21482a = list;
        if (list.size() != 7) {
            throw new java.lang.IllegalArgumentException("Day of week names must contain exactly 7 elements");
        }
        java.util.Iterator it = p078i6.p.z0(list).iterator();
        while (((D6.f) it).j) {
            int iA = ((p078i6.A) it).a();
            if (((java.lang.CharSequence) this.f21482a.get(iA)).length() <= 0) {
                throw new java.lang.IllegalArgumentException("A day-of-week name can not be empty");
            }
            for (int i3 = 0; i3 < iA; i3++) {
                if (kotlin.jvm.internal.m.a(this.f21482a.get(iA), this.f21482a.get(i3))) {
                    throw new java.lang.IllegalArgumentException(Y6.f.m(new java.lang.StringBuilder("Day-of-week names must be unique, but '"), (java.lang.String) this.f21482a.get(iA), "' was repeated").toString());
                }
            }
        }
    }

    public final boolean equals(java.lang.Object obj) {
        if (obj instanceof p045e8.B) {
            return kotlin.jvm.internal.m.a(this.f21482a, ((p045e8.B) obj).f21482a);
        }
        return false;
    }

    public final int hashCode() {
        return this.f21482a.hashCode();
    }

    public final java.lang.String toString() {
        return p078i6.o.o1(this.f21482a, ", ", "DayOfWeekNames(", ")", p045e8.A.f21480h, 24);
    }
}
