package R0;

/* JADX INFO: renamed from: R0.e, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0819e extends R0.AbstractC0815c {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static R0.C0819e f8893d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final p104m1.j f8894e = p104m1.j.f25174i;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final p104m1.j f8895f = p104m1.j.f25173h;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public p011b1.J f8896c;

    @Override // R0.AbstractC0815c
    public final int[] g(int i3) {
        int iD;
        if (k().length() <= 0 || i3 >= k().length()) {
            return null;
        }
        p104m1.j jVar = f8894e;
        if (i3 < 0) {
            p011b1.J j = this.f8896c;
            if (j == null) {
                kotlin.jvm.internal.m.k("layoutResult");
                throw null;
            }
            iD = j.f17773b.d(0);
        } else {
            p011b1.J j9 = this.f8896c;
            if (j9 == null) {
                kotlin.jvm.internal.m.k("layoutResult");
                throw null;
            }
            int iD2 = j9.f17773b.d(i3);
            iD = q(iD2, jVar) == i3 ? iD2 : iD2 + 1;
        }
        p011b1.J j10 = this.f8896c;
        if (j10 == null) {
            kotlin.jvm.internal.m.k("layoutResult");
            throw null;
        }
        if (iD >= j10.f17773b.f17833f) {
            return null;
        }
        return j(q(iD, jVar), q(iD, f8895f) + 1);
    }

    @Override // R0.AbstractC0815c
    public final int[] o(int i3) {
        int iD;
        if (k().length() <= 0 || i3 <= 0) {
            return null;
        }
        int length = k().length();
        p104m1.j jVar = f8895f;
        if (i3 > length) {
            p011b1.J j = this.f8896c;
            if (j == null) {
                kotlin.jvm.internal.m.k("layoutResult");
                throw null;
            }
            iD = j.f17773b.d(k().length());
        } else {
            p011b1.J j9 = this.f8896c;
            if (j9 == null) {
                kotlin.jvm.internal.m.k("layoutResult");
                throw null;
            }
            int iD2 = j9.f17773b.d(i3);
            iD = q(iD2, jVar) + 1 == i3 ? iD2 : iD2 - 1;
        }
        if (iD < 0) {
            return null;
        }
        return j(q(iD, f8894e), q(iD, jVar) + 1);
    }

    public final int q(int i3, p104m1.j jVar) {
        p011b1.J j = this.f8896c;
        if (j == null) {
            kotlin.jvm.internal.m.k("layoutResult");
            throw null;
        }
        int iG = j.g(i3);
        p011b1.J j9 = this.f8896c;
        if (j9 == null) {
            kotlin.jvm.internal.m.k("layoutResult");
            throw null;
        }
        if (jVar != j9.h(iG)) {
            p011b1.J j10 = this.f8896c;
            if (j10 != null) {
                return j10.g(i3);
            }
            kotlin.jvm.internal.m.k("layoutResult");
            throw null;
        }
        p011b1.J j11 = this.f8896c;
        if (j11 != null) {
            return j11.f17773b.c(i3, false) - 1;
        }
        kotlin.jvm.internal.m.k("layoutResult");
        throw null;
    }
}
