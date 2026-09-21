package R0;

/* JADX INFO: renamed from: R0.f, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0821f extends R0.AbstractC0815c {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static R0.C0821f f8900e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final p104m1.j f8901f = p104m1.j.f25174i;
    public static final p104m1.j g = p104m1.j.f25173h;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public p011b1.J f8902c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public Y0.p f8903d;

    @Override // R0.AbstractC0815c
    public final int[] g(int i3) {
        int iE;
        if (k().length() <= 0 || i3 >= k().length()) {
            return null;
        }
        try {
            Y0.p pVar = this.f8903d;
            if (pVar == null) {
                kotlin.jvm.internal.m.k("node");
                throw null;
            }
            p181w0.b bVarG = pVar.g();
            int iRound = java.lang.Math.round(bVarG.f29749d - bVarG.f29747b);
            if (i3 <= 0) {
                i3 = 0;
            }
            p011b1.J j = this.f8902c;
            if (j == null) {
                kotlin.jvm.internal.m.k("layoutResult");
                throw null;
            }
            int iD = j.f17773b.d(i3);
            p011b1.J j9 = this.f8902c;
            if (j9 == null) {
                kotlin.jvm.internal.m.k("layoutResult");
                throw null;
            }
            float f9 = j9.f17773b.f(iD) + iRound;
            p011b1.J j10 = this.f8902c;
            if (j10 == null) {
                kotlin.jvm.internal.m.k("layoutResult");
                throw null;
            }
            if (j10 == null) {
                kotlin.jvm.internal.m.k("layoutResult");
                throw null;
            }
            p011b1.C1658o c1658o = j10.f17773b;
            if (f9 < c1658o.f(c1658o.f17833f - 1)) {
                p011b1.J j11 = this.f8902c;
                if (j11 == null) {
                    kotlin.jvm.internal.m.k("layoutResult");
                    throw null;
                }
                iE = j11.f17773b.e(f9);
            } else {
                p011b1.J j12 = this.f8902c;
                if (j12 == null) {
                    kotlin.jvm.internal.m.k("layoutResult");
                    throw null;
                }
                iE = j12.f17773b.f17833f;
            }
            return j(i3, q(iE - 1, g) + 1);
        } catch (java.lang.IllegalStateException unused) {
            return null;
        }
    }

    @Override // R0.AbstractC0815c
    public final int[] o(int i3) {
        int iE;
        if (k().length() <= 0 || i3 <= 0) {
            return null;
        }
        try {
            Y0.p pVar = this.f8903d;
            if (pVar == null) {
                kotlin.jvm.internal.m.k("node");
                throw null;
            }
            p181w0.b bVarG = pVar.g();
            int iRound = java.lang.Math.round(bVarG.f29749d - bVarG.f29747b);
            int length = k().length();
            if (length <= i3) {
                i3 = length;
            }
            p011b1.J j = this.f8902c;
            if (j == null) {
                kotlin.jvm.internal.m.k("layoutResult");
                throw null;
            }
            int iD = j.f17773b.d(i3);
            p011b1.J j9 = this.f8902c;
            if (j9 == null) {
                kotlin.jvm.internal.m.k("layoutResult");
                throw null;
            }
            float f9 = j9.f17773b.f(iD) - iRound;
            if (f9 > 0.0f) {
                p011b1.J j10 = this.f8902c;
                if (j10 == null) {
                    kotlin.jvm.internal.m.k("layoutResult");
                    throw null;
                }
                iE = j10.f17773b.e(f9);
            } else {
                iE = 0;
            }
            if (i3 == k().length() && iE < iD) {
                iE++;
            }
            return j(q(iE, f8901f), i3);
        } catch (java.lang.IllegalStateException unused) {
            return null;
        }
    }

    public final int q(int i3, p104m1.j jVar) {
        p011b1.J j = this.f8902c;
        if (j == null) {
            kotlin.jvm.internal.m.k("layoutResult");
            throw null;
        }
        int iG = j.g(i3);
        p011b1.J j9 = this.f8902c;
        if (j9 == null) {
            kotlin.jvm.internal.m.k("layoutResult");
            throw null;
        }
        if (jVar != j9.h(iG)) {
            p011b1.J j10 = this.f8902c;
            if (j10 != null) {
                return j10.g(i3);
            }
            kotlin.jvm.internal.m.k("layoutResult");
            throw null;
        }
        p011b1.J j11 = this.f8902c;
        if (j11 != null) {
            return j11.f17773b.c(i3, false) - 1;
        }
        kotlin.jvm.internal.m.k("layoutResult");
        throw null;
    }
}
