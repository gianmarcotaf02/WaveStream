package N2;

import S.p;
import Y2.L;
import java.util.LinkedHashMap;
import java.util.Map;
import p078i6.o;
import p163t.G0;
import p163t.I0;
import p163t.T;
import p163t.r;

public final class e implements G0 {

    public final long f7310h;

    public long f7311i;
    public final Object j;

    public final Object f7312k;

    public e(long j, p pVar) {
        this.f7312k = pVar;
        this.f7310h = j;
        this.j = new LinkedHashMap(0, 0.75f, true);
        if (j <= 0) {
            throw new IllegalArgumentException("maxSize <= 0");
        }
    }

    @Override
    public boolean a() {
        return true;
    }

    @Override
    public long b(r rVar, r rVar2, r rVar3) {
        return Long.MAX_VALUE;
    }

    public void c(Object obj, Object obj2, d dVar) {
        d dVar2 = (d) obj2;
        ((L) ((p) this.f7312k).f9153i).k((a) obj, dVar2.f7307a, dVar2.f7308b, dVar2.f7309c);
    }

    public long d() {
        if (this.f7311i == -1) {
            long jH = 0;
            for (Map.Entry entry : ((LinkedHashMap) this.j).entrySet()) {
                jH += h(entry.getKey(), entry.getValue());
            }
            this.f7311i = jH;
        }
        return this.f7311i;
    }

    @Override
    public r e(long j, r rVar, r rVar2, r rVar3) {
        return ((I0) this.j).e(f(j), rVar, rVar2, g(j, rVar, rVar3, rVar2));
    }

    public long f(long j) {
        long j9 = this.f7311i;
        if (j + j9 <= 0) {
            return 0L;
        }
        long j10 = j + j9;
        long j11 = this.f7310h;
        long j12 = j10 / j11;
        return (((T) this.f7312k) == T.f27506h || j12 % ((long) 2) == 0) ? j10 - (j12 * j11) : ((j12 + 1) * j11) - j10;
    }

    public r g(long j, r rVar, r rVar2, r rVar3) {
        long j9 = this.f7311i;
        long j10 = j + j9;
        long j11 = this.f7310h;
        return j10 > j11 ? ((I0) this.j).u(j11 - j9, rVar, rVar3, rVar2) : rVar2;
    }

    public long h(Object obj, Object obj2) throws Exception {
        try {
            long j = ((d) obj2).f7309c;
            if (j >= 0) {
                return j;
            }
            throw new IllegalStateException(("sizeOf(" + obj + ", " + obj2 + ") returned a negative value: " + j).toString());
        } catch (Exception e6) {
            this.f7311i = -1L;
            throw e6;
        }
    }

    public void i(long j) {
        while (d() > j) {
            LinkedHashMap linkedHashMap = (LinkedHashMap) this.j;
            if (linkedHashMap.isEmpty()) {
                if (d() != 0) {
                    throw new IllegalStateException("sizeOf() is returning inconsistent values");
                }
                return;
            }
            Map.Entry entry = (Map.Entry) o.g1(linkedHashMap.entrySet());
            Object key = entry.getKey();
            Object value = entry.getValue();
            linkedHashMap.remove(key);
            this.f7311i = d() - h(key, value);
            c(key, value, null);
        }
    }

    @Override
    public r u(long j, r rVar, r rVar2, r rVar3) {
        return ((I0) this.j).u(f(j), rVar, rVar2, g(j, rVar, rVar3, rVar2));
    }

    public e(I0 i3, T t9, long j) {
        this.j = i3;
        this.f7312k = t9;
        this.f7310h = ((long) (i3.G() + i3.A())) * 1000000;
        this.f7311i = j * 1000000;
    }
}
