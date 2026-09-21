package p045e8;

/* JADX INFO: loaded from: classes4.dex */
public final class T {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final p045e8.T f21520b;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final java.util.List f21521a;

    static {
        new p045e8.T(p078i6.p.B0("January", "February", "March", "April", "May", "June", "July", "August", "September", "October", "November", "December"));
        f21520b = new p045e8.T(p078i6.p.B0("Jan", "Feb", "Mar", "Apr", "May", "Jun", "Jul", "Aug", "Sep", "Oct", "Nov", "Dec"));
    }

    public T(java.util.List list) {
        this.f21521a = list;
        if (list.size() != 12) {
            throw new java.lang.IllegalArgumentException("Month names must contain exactly 12 elements");
        }
        java.util.Iterator it = p078i6.p.z0(list).iterator();
        while (((D6.f) it).j) {
            int iA = ((p078i6.A) it).a();
            if (((java.lang.CharSequence) this.f21521a.get(iA)).length() <= 0) {
                throw new java.lang.IllegalArgumentException("A month name can not be empty");
            }
            for (int i3 = 0; i3 < iA; i3++) {
                if (kotlin.jvm.internal.m.a(this.f21521a.get(iA), this.f21521a.get(i3))) {
                    throw new java.lang.IllegalArgumentException(Y6.f.m(new java.lang.StringBuilder("Month names must be unique, but '"), (java.lang.String) this.f21521a.get(iA), "' was repeated").toString());
                }
            }
        }
    }

    public final boolean equals(java.lang.Object obj) {
        if (obj instanceof p045e8.T) {
            return kotlin.jvm.internal.m.a(this.f21521a, ((p045e8.T) obj).f21521a);
        }
        return false;
    }

    public final int hashCode() {
        return this.f21521a.hashCode();
    }

    public final java.lang.String toString() {
        return p078i6.o.o1(this.f21521a, ", ", "MonthNames(", ")", p045e8.S.f21519h, 24);
    }
}
