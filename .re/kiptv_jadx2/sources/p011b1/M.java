package p011b1;

import kotlin.jvm.internal.m;
import p048f1.i;
import p048f1.p;
import p048f1.s;
import p074i1.b;
import p104m1.a;
import p104m1.d;
import p104m1.e;
import p104m1.k;
import p104m1.l;
import p104m1.n;
import p104m1.o;
import p104m1.q;
import p188x0.C3098s;
import p188x0.N;
import p203z0.c;
import p203z0.g;

public final class M {

    public static final M f17785d = new M(0, 0, null, 0, null, null, 0, 0, null, 16777215);

    public final E f17786a;

    public final t f17787b;

    public final w f17788c;

    public M(E e6, t tVar, w wVar) {
        this.f17786a = e6;
        this.f17787b = tVar;
        this.f17788c = wVar;
    }

    public static M a(M m8, long j, long j9, s sVar, i iVar, long j10, N n3, long j11, w wVar, p104m1.i iVar2, int i3) {
        o cVar;
        long jB = (i3 & 1) != 0 ? m8.f17786a.f17744a.b() : j;
        long j12 = (i3 & 2) != 0 ? m8.f17786a.f17745b : j9;
        s sVar2 = (i3 & 4) != 0 ? m8.f17786a.f17746c : sVar;
        E e6 = m8.f17786a;
        p048f1.o oVar = e6.f17747d;
        p pVar = e6.f17748e;
        i iVar3 = (i3 & 32) != 0 ? e6.f17749f : iVar;
        String str = e6.g;
        long j13 = (i3 & 128) != 0 ? e6.f17750h : j10;
        a aVar = e6.f17751i;
        p104m1.p pVar2 = e6.j;
        b bVar = e6.f17752k;
        long j14 = e6.f17753l;
        l lVar = e6.f17754m;
        N n9 = (i3 & 8192) != 0 ? e6.f17755n : n3;
        c cVar2 = e6.f17756o;
        t tVar = m8.f17787b;
        int i9 = tVar.f17846a;
        int i10 = tVar.f17847b;
        long j15 = (i3 & 131072) != 0 ? tVar.f17848c : j11;
        q qVar = tVar.f17849d;
        w wVar2 = (i3 & 524288) != 0 ? m8.f17788c : wVar;
        p104m1.i iVar4 = (i3 & 1048576) != 0 ? tVar.f17851f : iVar2;
        int i11 = tVar.g;
        int i12 = tVar.f17852h;
        p104m1.s sVar3 = tVar.f17853i;
        if (C3098s.d(jB, e6.f17744a.b())) {
            cVar = e6.f17744a;
        } else {
            cVar = jB != 16 ? new p104m1.c(jB) : n.f25181a;
        }
        return new M(new E(cVar, j12, sVar2, oVar, pVar, iVar3, str, j13, aVar, pVar2, bVar, j14, lVar, n9, cVar2), new t(i9, i10, j15, qVar, wVar2 != null ? wVar2.f17858a : null, iVar4, i11, i12, sVar3), wVar2);
    }

    public static M e(M m8, long j, long j9, s sVar, i iVar, long j10, int i3, long j11, int i9) {
        long j12 = (i9 & 2) != 0 ? p113n1.p.f25570c : j9;
        s sVar2 = (i9 & 4) != 0 ? null : sVar;
        i iVar2 = (i9 & 32) != 0 ? null : iVar;
        long j13 = (i9 & 128) != 0 ? p113n1.p.f25570c : j10;
        long j14 = C3098s.g;
        int i10 = (32768 & i9) != 0 ? 0 : i3;
        long j15 = (i9 & 131072) != 0 ? p113n1.p.f25570c : j11;
        E eA = F.a(m8.f17786a, j, null, Float.NaN, j12, sVar2, null, null, iVar2, null, j13, null, null, null, j14, null, null, null);
        t tVarA = u.a(m8.f17787b, i10, 0, j15, null, null, null, 0, 0, null);
        return (m8.f17786a == eA && m8.f17787b == tVarA) ? m8 : new M(eA, tVarA);
    }

    public final long b() {
        return this.f17786a.f17744a.b();
    }

    public final boolean c(M m8) {
        if (this != m8) {
            return m.a(this.f17787b, m8.f17787b) && this.f17786a.a(m8.f17786a);
        }
        return true;
    }

    public final M d(M m8) {
        return (m8 == null || m8.equals(f17785d)) ? this : new M(this.f17786a.c(m8.f17786a), this.f17787b.a(m8.f17787b));
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof M)) {
            return false;
        }
        M m8 = (M) obj;
        return m.a(this.f17786a, m8.f17786a) && m.a(this.f17787b, m8.f17787b) && m.a(this.f17788c, m8.f17788c);
    }

    public final int hashCode() {
        int iHashCode = (this.f17787b.hashCode() + (this.f17786a.hashCode() * 31)) * 31;
        w wVar = this.f17788c;
        return iHashCode + (wVar != null ? wVar.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("TextStyle(color=");
        sb.append((Object) C3098s.j(b()));
        sb.append(", brush=");
        E e6 = this.f17786a;
        sb.append(e6.f17744a.c());
        sb.append(", alpha=");
        sb.append(e6.f17744a.a());
        sb.append(", fontSize=");
        sb.append((Object) p113n1.p.d(e6.f17745b));
        sb.append(", fontWeight=");
        sb.append(e6.f17746c);
        sb.append(", fontStyle=");
        sb.append(e6.f17747d);
        sb.append(", fontSynthesis=");
        sb.append(e6.f17748e);
        sb.append(", fontFamily=");
        sb.append(e6.f17749f);
        sb.append(", fontFeatureSettings=");
        sb.append(e6.g);
        sb.append(", letterSpacing=");
        sb.append((Object) p113n1.p.d(e6.f17750h));
        sb.append(", baselineShift=");
        sb.append(e6.f17751i);
        sb.append(", textGeometricTransform=");
        sb.append(e6.j);
        sb.append(", localeList=");
        sb.append(e6.f17752k);
        sb.append(", background=");
        p121o0.p.x(e6.f17753l, ", textDecoration=", sb);
        sb.append(e6.f17754m);
        sb.append(", shadow=");
        sb.append(e6.f17755n);
        sb.append(", drawStyle=");
        sb.append(e6.f17756o);
        sb.append(", textAlign=");
        t tVar = this.f17787b;
        sb.append((Object) k.b(tVar.f17846a));
        sb.append(", textDirection=");
        sb.append((Object) p104m1.m.a(tVar.f17847b));
        sb.append(", lineHeight=");
        sb.append((Object) p113n1.p.d(tVar.f17848c));
        sb.append(", textIndent=");
        sb.append(tVar.f17849d);
        sb.append(", platformStyle=");
        sb.append(this.f17788c);
        sb.append(", lineHeightStyle=");
        sb.append(tVar.f17851f);
        sb.append(", lineBreak=");
        sb.append((Object) e.a(tVar.g));
        sb.append(", hyphens=");
        sb.append((Object) d.a(tVar.f17852h));
        sb.append(", textMotion=");
        sb.append(tVar.f17853i);
        sb.append(')');
        return sb.toString();
    }

    public M(E e6, t tVar) {
        e6.getClass();
        v vVar = tVar.f17850e;
        this(e6, tVar, vVar == null ? null : new w(vVar));
    }

    public M(long j, long j9, s sVar, long j10, N n3, g gVar, int i3, long j11, w wVar, int i9) {
        long j12 = (i9 & 1) != 0 ? C3098s.g : j;
        long j13 = (i9 & 2) != 0 ? p113n1.p.f25570c : j9;
        s sVar2 = (i9 & 4) != 0 ? null : sVar;
        long j14 = (i9 & 128) != 0 ? p113n1.p.f25570c : j10;
        long j15 = C3098s.g;
        N n9 = (i9 & 8192) != 0 ? null : n3;
        g gVar2 = (i9 & 16384) != 0 ? null : gVar;
        int i10 = (32768 & i9) != 0 ? 0 : i3;
        long j16 = (131072 & i9) != 0 ? p113n1.p.f25570c : j11;
        w wVar2 = (i9 & 524288) != 0 ? null : wVar;
        this(new E(j12, j13, sVar2, (p048f1.o) null, (p) null, (i) null, (String) null, j14, (a) null, (p104m1.p) null, (b) null, j15, (l) null, n9, gVar2), new t(i10, 0, j16, null, wVar2 != null ? wVar2.f17858a : null, null, 0, 0, null), wVar2);
    }
}
