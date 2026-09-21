package p011b1;

/* JADX INFO: loaded from: classes.dex */
public final class t implements p011b1.InterfaceC1645b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f17846a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f17847b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final long f17848c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final p104m1.q f17849d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final p011b1.v f17850e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final p104m1.i f17851f;
    public final int g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final int f17852h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final p104m1.s f17853i;

    public t(int i3, int i9, long j, p104m1.q qVar, p011b1.v vVar, p104m1.i iVar, int i10, int i11, p104m1.s sVar) {
        this.f17846a = i3;
        this.f17847b = i9;
        this.f17848c = j;
        this.f17849d = qVar;
        this.f17850e = vVar;
        this.f17851f = iVar;
        this.g = i10;
        this.f17852h = i11;
        this.f17853i = sVar;
        if (p113n1.p.a(j, p113n1.p.f25570c) || p113n1.p.c(j) >= 0.0f) {
            return;
        }
        p065h1.a.b("lineHeight can't be negative (" + p113n1.p.c(j) + ')');
    }

    public final p011b1.t a(p011b1.t tVar) {
        if (tVar == null) {
            return this;
        }
        return p011b1.u.a(this, tVar.f17846a, tVar.f17847b, tVar.f17848c, tVar.f17849d, tVar.f17850e, tVar.f17851f, tVar.g, tVar.f17852h, tVar.f17853i);
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof p011b1.t)) {
            return false;
        }
        p011b1.t tVar = (p011b1.t) obj;
        return this.f17846a == tVar.f17846a && this.f17847b == tVar.f17847b && p113n1.p.a(this.f17848c, tVar.f17848c) && kotlin.jvm.internal.m.a(this.f17849d, tVar.f17849d) && kotlin.jvm.internal.m.a(this.f17850e, tVar.f17850e) && kotlin.jvm.internal.m.a(this.f17851f, tVar.f17851f) && this.g == tVar.g && this.f17852h == tVar.f17852h && kotlin.jvm.internal.m.a(this.f17853i, tVar.f17853i);
    }

    public final int hashCode() {
        int iD = p121o0.p.d(this.f17847b, java.lang.Integer.hashCode(this.f17846a) * 31, 31);
        p113n1.q[] qVarArr = p113n1.p.f25569b;
        int iE = p121o0.p.e(iD, 31, this.f17848c);
        p104m1.q qVar = this.f17849d;
        int iHashCode = (iE + (qVar != null ? qVar.hashCode() : 0)) * 31;
        p011b1.v vVar = this.f17850e;
        int iHashCode2 = (iHashCode + (vVar != null ? vVar.hashCode() : 0)) * 31;
        p104m1.i iVar = this.f17851f;
        int iD2 = p121o0.p.d(this.f17852h, p121o0.p.d(this.g, (iHashCode2 + (iVar != null ? iVar.hashCode() : 0)) * 31, 31), 31);
        p104m1.s sVar = this.f17853i;
        return iD2 + (sVar != null ? sVar.hashCode() : 0);
    }

    public final java.lang.String toString() {
        return "ParagraphStyle(textAlign=" + ((java.lang.Object) p104m1.k.b(this.f17846a)) + ", textDirection=" + ((java.lang.Object) p104m1.m.a(this.f17847b)) + ", lineHeight=" + ((java.lang.Object) p113n1.p.d(this.f17848c)) + ", textIndent=" + this.f17849d + ", platformStyle=" + this.f17850e + ", lineHeightStyle=" + this.f17851f + ", lineBreak=" + ((java.lang.Object) p104m1.e.a(this.g)) + ", hyphens=" + ((java.lang.Object) p104m1.d.a(this.f17852h)) + ", textMotion=" + this.f17853i + ')';
    }
}
