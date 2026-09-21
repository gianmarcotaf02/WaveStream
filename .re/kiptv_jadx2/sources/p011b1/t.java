package p011b1;

import kotlin.jvm.internal.m;
import p065h1.a;
import p104m1.d;
import p104m1.e;
import p104m1.i;
import p104m1.k;
import p104m1.q;
import p104m1.s;
import p113n1.p;

public final class t implements InterfaceC1645b {

    public final int f17846a;

    public final int f17847b;

    public final long f17848c;

    public final q f17849d;

    public final v f17850e;

    public final i f17851f;
    public final int g;

    public final int f17852h;

    public final s f17853i;

    public t(int i3, int i9, long j, q qVar, v vVar, i iVar, int i10, int i11, s sVar) {
        this.f17846a = i3;
        this.f17847b = i9;
        this.f17848c = j;
        this.f17849d = qVar;
        this.f17850e = vVar;
        this.f17851f = iVar;
        this.g = i10;
        this.f17852h = i11;
        this.f17853i = sVar;
        if (p.a(j, p.f25570c) || p.c(j) >= 0.0f) {
            return;
        }
        a.b("lineHeight can't be negative (" + p.c(j) + ')');
    }

    public final t a(t tVar) {
        if (tVar == null) {
            return this;
        }
        return u.a(this, tVar.f17846a, tVar.f17847b, tVar.f17848c, tVar.f17849d, tVar.f17850e, tVar.f17851f, tVar.g, tVar.f17852h, tVar.f17853i);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof t)) {
            return false;
        }
        t tVar = (t) obj;
        return this.f17846a == tVar.f17846a && this.f17847b == tVar.f17847b && p.a(this.f17848c, tVar.f17848c) && m.a(this.f17849d, tVar.f17849d) && m.a(this.f17850e, tVar.f17850e) && m.a(this.f17851f, tVar.f17851f) && this.g == tVar.g && this.f17852h == tVar.f17852h && m.a(this.f17853i, tVar.f17853i);
    }

    public final int hashCode() {
        int iD = p121o0.p.d(this.f17847b, Integer.hashCode(this.f17846a) * 31, 31);
        p113n1.q[] qVarArr = p.f25569b;
        int iE = p121o0.p.e(iD, 31, this.f17848c);
        q qVar = this.f17849d;
        int iHashCode = (iE + (qVar != null ? qVar.hashCode() : 0)) * 31;
        v vVar = this.f17850e;
        int iHashCode2 = (iHashCode + (vVar != null ? vVar.hashCode() : 0)) * 31;
        i iVar = this.f17851f;
        int iD2 = p121o0.p.d(this.f17852h, p121o0.p.d(this.g, (iHashCode2 + (iVar != null ? iVar.hashCode() : 0)) * 31, 31), 31);
        s sVar = this.f17853i;
        return iD2 + (sVar != null ? sVar.hashCode() : 0);
    }

    public final String toString() {
        return "ParagraphStyle(textAlign=" + ((Object) k.b(this.f17846a)) + ", textDirection=" + ((Object) p104m1.m.a(this.f17847b)) + ", lineHeight=" + ((Object) p.d(this.f17848c)) + ", textIndent=" + this.f17849d + ", platformStyle=" + this.f17850e + ", lineHeightStyle=" + this.f17851f + ", lineBreak=" + ((Object) e.a(this.g)) + ", hyphens=" + ((Object) d.a(this.f17852h)) + ", textMotion=" + this.f17853i + ')';
    }
}
