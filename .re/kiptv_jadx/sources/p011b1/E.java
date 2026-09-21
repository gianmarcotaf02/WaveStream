package p011b1;

/* JADX INFO: loaded from: classes.dex */
public final class E implements p011b1.InterfaceC1645b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final p104m1.o f17744a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long f17745b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final p048f1.s f17746c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final p048f1.o f17747d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final p048f1.p f17748e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final p048f1.i f17749f;
    public final java.lang.String g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final long f17750h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final p104m1.a f17751i;
    public final p104m1.p j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final p074i1.b f17752k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final long f17753l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final p104m1.l f17754m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final p188x0.N f17755n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final p203z0.c f17756o;

    public E(long j, long j9, p048f1.s sVar, p048f1.o oVar, p048f1.p pVar, p048f1.i iVar, java.lang.String str, long j10, p104m1.a aVar, p104m1.p pVar2, p074i1.b bVar, long j11, p104m1.l lVar, p188x0.N n3, p203z0.c cVar) {
        this(j != 16 ? new p104m1.c(j) : p104m1.n.f25181a, j9, sVar, oVar, pVar, iVar, str, j10, aVar, pVar2, bVar, j11, lVar, n3, cVar);
    }

    public final boolean a(p011b1.E e6) {
        if (this == e6) {
            return true;
        }
        return p113n1.p.a(this.f17745b, e6.f17745b) && kotlin.jvm.internal.m.a(this.f17746c, e6.f17746c) && kotlin.jvm.internal.m.a(this.f17747d, e6.f17747d) && kotlin.jvm.internal.m.a(this.f17748e, e6.f17748e) && kotlin.jvm.internal.m.a(this.f17749f, e6.f17749f) && kotlin.jvm.internal.m.a(this.g, e6.g) && p113n1.p.a(this.f17750h, e6.f17750h) && kotlin.jvm.internal.m.a(this.f17751i, e6.f17751i) && kotlin.jvm.internal.m.a(this.j, e6.j) && kotlin.jvm.internal.m.a(this.f17752k, e6.f17752k) && p188x0.C3098s.d(this.f17753l, e6.f17753l);
    }

    public final boolean b(p011b1.E e6) {
        return kotlin.jvm.internal.m.a(this.f17744a, e6.f17744a) && kotlin.jvm.internal.m.a(this.f17754m, e6.f17754m) && kotlin.jvm.internal.m.a(this.f17755n, e6.f17755n) && kotlin.jvm.internal.m.a(this.f17756o, e6.f17756o);
    }

    public final p011b1.E c(p011b1.E e6) {
        if (e6 == null) {
            return this;
        }
        p104m1.o oVar = e6.f17744a;
        return p011b1.F.a(this, oVar.b(), oVar.c(), oVar.a(), e6.f17745b, e6.f17746c, e6.f17747d, e6.f17748e, e6.f17749f, e6.g, e6.f17750h, e6.f17751i, e6.j, e6.f17752k, e6.f17753l, e6.f17754m, e6.f17755n, e6.f17756o);
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof p011b1.E)) {
            return false;
        }
        p011b1.E e6 = (p011b1.E) obj;
        return a(e6) && b(e6);
    }

    public final int hashCode() {
        p104m1.o oVar = this.f17744a;
        long jB = oVar.b();
        int i3 = p188x0.C3098s.f31128h;
        int iHashCode = java.lang.Long.hashCode(jB) * 31;
        p188x0.AbstractC3095o abstractC3095oC = oVar.c();
        int iHashCode2 = (java.lang.Float.hashCode(oVar.a()) + ((iHashCode + (abstractC3095oC != null ? abstractC3095oC.hashCode() : 0)) * 31)) * 31;
        p113n1.q[] qVarArr = p113n1.p.f25569b;
        int iE = p121o0.p.e(iHashCode2, 31, this.f17745b);
        p048f1.s sVar = this.f17746c;
        int i9 = (iE + (sVar != null ? sVar.f21672h : 0)) * 31;
        p048f1.o oVar2 = this.f17747d;
        int iHashCode3 = (i9 + (oVar2 != null ? java.lang.Integer.hashCode(oVar2.f21663a) : 0)) * 31;
        p048f1.p pVar = this.f17748e;
        int iHashCode4 = (iHashCode3 + (pVar != null ? java.lang.Integer.hashCode(pVar.f21664a) : 0)) * 31;
        p048f1.i iVar = this.f17749f;
        int iHashCode5 = (iHashCode4 + (iVar != null ? iVar.hashCode() : 0)) * 31;
        java.lang.String str = this.g;
        int iE2 = p121o0.p.e((iHashCode5 + (str != null ? str.hashCode() : 0)) * 31, 31, this.f17750h);
        p104m1.a aVar = this.f17751i;
        int iHashCode6 = (iE2 + (aVar != null ? java.lang.Float.hashCode(aVar.f25156a) : 0)) * 31;
        p104m1.p pVar2 = this.j;
        int iHashCode7 = (iHashCode6 + (pVar2 != null ? pVar2.hashCode() : 0)) * 31;
        p074i1.b bVar = this.f17752k;
        int iE3 = p121o0.p.e((iHashCode7 + (bVar != null ? bVar.f22747h.hashCode() : 0)) * 31, 31, this.f17753l);
        p104m1.l lVar = this.f17754m;
        int i10 = (iE3 + (lVar != null ? lVar.f25179a : 0)) * 31;
        p188x0.N n3 = this.f17755n;
        int iHashCode8 = (i10 + (n3 != null ? n3.hashCode() : 0)) * 961;
        p203z0.c cVar = this.f17756o;
        return iHashCode8 + (cVar != null ? cVar.hashCode() : 0);
    }

    public final java.lang.String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder("SpanStyle(color=");
        p104m1.o oVar = this.f17744a;
        sb.append((java.lang.Object) p188x0.C3098s.j(oVar.b()));
        sb.append(", brush=");
        sb.append(oVar.c());
        sb.append(", alpha=");
        sb.append(oVar.a());
        sb.append(", fontSize=");
        sb.append((java.lang.Object) p113n1.p.d(this.f17745b));
        sb.append(", fontWeight=");
        sb.append(this.f17746c);
        sb.append(", fontStyle=");
        sb.append(this.f17747d);
        sb.append(", fontSynthesis=");
        sb.append(this.f17748e);
        sb.append(", fontFamily=");
        sb.append(this.f17749f);
        sb.append(", fontFeatureSettings=");
        sb.append(this.g);
        sb.append(", letterSpacing=");
        sb.append((java.lang.Object) p113n1.p.d(this.f17750h));
        sb.append(", baselineShift=");
        sb.append(this.f17751i);
        sb.append(", textGeometricTransform=");
        sb.append(this.j);
        sb.append(", localeList=");
        sb.append(this.f17752k);
        sb.append(", background=");
        p121o0.p.x(this.f17753l, ", textDecoration=", sb);
        sb.append(this.f17754m);
        sb.append(", shadow=");
        sb.append(this.f17755n);
        sb.append(", platformStyle=null, drawStyle=");
        sb.append(this.f17756o);
        sb.append(')');
        return sb.toString();
    }

    public E(p104m1.o oVar, long j, p048f1.s sVar, p048f1.o oVar2, p048f1.p pVar, p048f1.i iVar, java.lang.String str, long j9, p104m1.a aVar, p104m1.p pVar2, p074i1.b bVar, long j10, p104m1.l lVar, p188x0.N n3, p203z0.c cVar) {
        this.f17744a = oVar;
        this.f17745b = j;
        this.f17746c = sVar;
        this.f17747d = oVar2;
        this.f17748e = pVar;
        this.f17749f = iVar;
        this.g = str;
        this.f17750h = j9;
        this.f17751i = aVar;
        this.j = pVar2;
        this.f17752k = bVar;
        this.f17753l = j10;
        this.f17754m = lVar;
        this.f17755n = n3;
        this.f17756o = cVar;
    }

    public E(long j, long j9, p048f1.s sVar, p048f1.o oVar, p048f1.p pVar, p048f1.i iVar, java.lang.String str, long j10, p104m1.a aVar, p104m1.p pVar2, p074i1.b bVar, long j11, p104m1.l lVar, p188x0.N n3, int i3) {
        this((i3 & 1) != 0 ? p188x0.C3098s.g : j, (i3 & 2) != 0 ? p113n1.p.f25570c : j9, (i3 & 4) != 0 ? null : sVar, (i3 & 8) != 0 ? null : oVar, (i3 & 16) != 0 ? null : pVar, (i3 & 32) != 0 ? null : iVar, (i3 & 64) != 0 ? null : str, (i3 & 128) != 0 ? p113n1.p.f25570c : j10, (i3 & 256) != 0 ? null : aVar, (i3 & 512) != 0 ? null : pVar2, (i3 & 1024) != 0 ? null : bVar, (i3 & 2048) != 0 ? p188x0.C3098s.g : j11, (i3 & 4096) != 0 ? null : lVar, (i3 & 8192) != 0 ? null : n3, (p203z0.c) null);
    }
}
