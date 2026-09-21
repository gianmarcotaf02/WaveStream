package D;

/* JADX INFO: loaded from: classes.dex */
public final class t implements O0.T {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final D.u f1746a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f1747b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f1748c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final float f1749d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final O0.T f1750e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final float f1751f;
    public final boolean g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final S7.A f1752h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final p113n1.c f1753i;
    public final long j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final java.lang.Object f1754k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final int f1755l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final int f1756m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final int f1757n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final x.EnumC3061p0 f1758o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final int f1759p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final int f1760q;

    public t(D.u uVar, int i3, boolean z6, float f9, O0.T t9, float f10, boolean z9, S7.A a2, p113n1.c cVar, long j, java.util.List list, int i9, int i10, int i11, x.EnumC3061p0 enumC3061p0, int i12, int i13) {
        this.f1746a = uVar;
        this.f1747b = i3;
        this.f1748c = z6;
        this.f1749d = f9;
        this.f1750e = t9;
        this.f1751f = f10;
        this.g = z9;
        this.f1752h = a2;
        this.f1753i = cVar;
        this.j = j;
        this.f1754k = list;
        this.f1755l = i9;
        this.f1756m = i10;
        this.f1757n = i11;
        this.f1758o = enumC3061p0;
        this.f1759p = i12;
        this.f1760q = i13;
    }

    @Override // O0.T
    public final int a() {
        return this.f1750e.a();
    }

    @Override // O0.T
    public final int b() {
        return this.f1750e.b();
    }

    @Override // O0.T
    public final java.util.Map c() {
        return this.f1750e.c();
    }

    @Override // O0.T
    public final void d() {
        this.f1750e.d();
    }

    @Override // O0.T
    public final p194x6.j e() {
        return this.f1750e.e();
    }

    /* JADX WARN: Type inference failed for: r15v0, types: [java.lang.Object, java.util.Collection, java.util.List] */
    public final D.t f(int i3, boolean z6) {
        D.u uVar;
        int i9;
        if (this.g) {
            return null;
        }
        ?? r15 = this.f1754k;
        if (r15.isEmpty() || (uVar = this.f1746a) == null || (i9 = this.f1747b - i3) < 0 || i9 >= uVar.f1772n) {
            return null;
        }
        D.u uVar2 = (D.u) p078i6.o.h1(r15);
        D.u uVar3 = (D.u) p078i6.o.q1(r15);
        if (uVar2.f1774p || uVar3.f1774p) {
            return null;
        }
        int i10 = this.f1756m;
        int i11 = this.f1755l;
        if (i3 < 0) {
            if (java.lang.Math.min((uVar2.f1770l + uVar2.f1772n) - i11, (uVar3.f1770l + uVar3.f1772n) - i10) <= (-i3)) {
                return null;
            }
        } else if (java.lang.Math.min(i11 - uVar2.f1770l, i10 - uVar3.f1770l) <= i3) {
            return null;
        }
        int size = r15.size();
        for (int i12 = 0; i12 < size; i12++) {
            D.u uVar4 = (D.u) r15.get(i12);
            if (!uVar4.f1774p) {
                uVar4.f1770l += i3;
                int[] iArr = uVar4.f1776r;
                int length = iArr.length;
                for (int i13 = 0; i13 < length; i13++) {
                    int i14 = i13 & 1;
                    boolean z9 = uVar4.f1763c;
                    if ((z9 && i14 != 0) || (!z9 && i14 == 0)) {
                        iArr[i13] = iArr[i13] + i3;
                    }
                }
                if (z6) {
                    int size2 = uVar4.f1762b.size();
                    for (int i15 = 0; i15 < size2; i15++) {
                        uVar4.f1769k.a(i15, uVar4.f1768i);
                    }
                }
            }
        }
        return new D.t(this.f1746a, i9, this.f1748c || i3 > 0, i3, this.f1750e, this.f1751f, this.g, this.f1752h, this.f1753i, this.j, r15, this.f1755l, this.f1756m, this.f1757n, this.f1758o, this.f1759p, this.f1760q);
    }

    public final long g() {
        O0.T t9 = this.f1750e;
        return (((long) t9.b()) << 32) | (((long) t9.a()) & 4294967295L);
    }
}
