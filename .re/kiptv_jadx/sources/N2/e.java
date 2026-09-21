package N2;

/* JADX INFO: loaded from: classes.dex */
public final class e implements p163t.G0 {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final long f7310h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public long f7311i;
    public final java.lang.Object j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final java.lang.Object f7312k;

    public e(long j, S.p pVar) {
        this.f7312k = pVar;
        this.f7310h = j;
        this.j = new java.util.LinkedHashMap(0, 0.75f, true);
        if (j <= 0) {
            throw new java.lang.IllegalArgumentException("maxSize <= 0");
        }
    }

    @Override // p163t.G0
    public boolean a() {
        return true;
    }

    @Override // p163t.G0
    public long b(p163t.r rVar, p163t.r rVar2, p163t.r rVar3) {
        return Long.MAX_VALUE;
    }

    public void c(java.lang.Object obj, java.lang.Object obj2, N2.d dVar) {
        N2.d dVar2 = (N2.d) obj2;
        ((Y2.L) ((S.p) this.f7312k).f9153i).k((N2.a) obj, dVar2.f7307a, dVar2.f7308b, dVar2.f7309c);
    }

    public long d() {
        if (this.f7311i == -1) {
            long jH = 0;
            for (java.util.Map.Entry entry : ((java.util.LinkedHashMap) this.j).entrySet()) {
                jH += h(entry.getKey(), entry.getValue());
            }
            this.f7311i = jH;
        }
        return this.f7311i;
    }

    @Override // p163t.G0
    public p163t.r e(long j, p163t.r rVar, p163t.r rVar2, p163t.r rVar3) {
        return ((p163t.I0) this.j).e(f(j), rVar, rVar2, g(j, rVar, rVar3, rVar2));
    }

    public long f(long j) {
        long j9 = this.f7311i;
        if (j + j9 <= 0) {
            return 0L;
        }
        long j10 = j + j9;
        long j11 = this.f7310h;
        long j12 = j10 / j11;
        return (((p163t.T) this.f7312k) == p163t.T.f27506h || j12 % ((long) 2) == 0) ? j10 - (j12 * j11) : ((j12 + 1) * j11) - j10;
    }

    public p163t.r g(long j, p163t.r rVar, p163t.r rVar2, p163t.r rVar3) {
        long j9 = this.f7311i;
        long j10 = j + j9;
        long j11 = this.f7310h;
        return j10 > j11 ? ((p163t.I0) this.j).u(j11 - j9, rVar, rVar3, rVar2) : rVar2;
    }

    public long h(java.lang.Object obj, java.lang.Object obj2) throws java.lang.Exception {
        try {
            long j = ((N2.d) obj2).f7309c;
            if (j >= 0) {
                return j;
            }
            throw new java.lang.IllegalStateException(("sizeOf(" + obj + ", " + obj2 + ") returned a negative value: " + j).toString());
        } catch (java.lang.Exception e6) {
            this.f7311i = -1L;
            throw e6;
        }
    }

    public void i(long j) {
        while (d() > j) {
            java.util.LinkedHashMap linkedHashMap = (java.util.LinkedHashMap) this.j;
            if (linkedHashMap.isEmpty()) {
                if (d() != 0) {
                    throw new java.lang.IllegalStateException("sizeOf() is returning inconsistent values");
                }
                return;
            }
            java.util.Map.Entry entry = (java.util.Map.Entry) p078i6.o.g1(linkedHashMap.entrySet());
            java.lang.Object key = entry.getKey();
            java.lang.Object value = entry.getValue();
            linkedHashMap.remove(key);
            this.f7311i = d() - h(key, value);
            c(key, value, null);
        }
    }

    @Override // p163t.G0
    public p163t.r u(long j, p163t.r rVar, p163t.r rVar2, p163t.r rVar3) {
        return ((p163t.I0) this.j).u(f(j), rVar, rVar2, g(j, rVar, rVar3, rVar2));
    }

    public e(p163t.I0 i3, p163t.T t9, long j) {
        this.j = i3;
        this.f7312k = t9;
        this.f7310h = ((long) (i3.G() + i3.A())) * 1000000;
        this.f7311i = j * 1000000;
    }
}
