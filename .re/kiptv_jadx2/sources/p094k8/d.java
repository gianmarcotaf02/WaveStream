package p094k8;

import B2.a;
import kotlin.jvm.internal.m;

public final class d implements f {

    public final n f24512h;

    public final a f24513i;
    public j j;

    public int f24514k;

    public boolean f24515l;

    public long f24516m;

    public d(n nVar) {
        this.f24512h = nVar;
        a aVarA = nVar.a();
        this.f24513i = aVarA;
        j jVar = aVarA.f24508h;
        this.j = jVar;
        this.f24514k = jVar != null ? jVar.f24524b : -1;
    }

    @Override
    public final void close() {
        this.f24515l = true;
    }

    @Override
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final long readAtMostTo(a sink, long j) {
        j jVar;
        m.e(sink, "sink");
        if (this.f24515l) {
            throw new IllegalStateException("Source is closed.");
        }
        if (j < 0) {
            throw new IllegalArgumentException(a.k(j, "byteCount (", ") < 0").toString());
        }
        j jVar2 = this.j;
        a aVar = this.f24513i;
        if (jVar2 != null) {
            j jVar3 = aVar.f24508h;
            if (jVar2 == jVar3) {
                int i3 = this.f24514k;
                m.b(jVar3);
            }
            throw new IllegalStateException("Peek source is invalid because upstream source was used");
        }
        if (j == 0) {
            return 0L;
        }
        if (!this.f24512h.d(this.f24516m + 1)) {
            return -1L;
        }
        if (this.j == null && (jVar = aVar.f24508h) != null) {
            this.j = jVar;
            this.f24514k = jVar.f24524b;
        }
        long jMin = Math.min(j, aVar.j - this.f24516m);
        long j9 = this.f24516m;
        long j10 = j9 + jMin;
        p.a(aVar.j, j9, j10);
        if (j9 != j10) {
            long j11 = j10 - j9;
            sink.j += j11;
            j jVar4 = aVar.f24508h;
            while (true) {
                m.b(jVar4);
                long j12 = jVar4.f24525c - jVar4.f24524b;
                if (j9 < j12) {
                    break;
                }
                j9 -= j12;
                jVar4 = jVar4.f24528f;
            }
            while (j11 > 0) {
                m.b(jVar4);
                j jVarF = jVar4.f();
                int i9 = jVarF.f24524b + ((int) j9);
                jVarF.f24524b = i9;
                jVarF.f24525c = Math.min(i9 + ((int) j11), jVarF.f24525c);
                if (sink.f24508h == null) {
                    sink.f24508h = jVarF;
                    sink.f24509i = jVarF;
                } else {
                    j jVar5 = sink.f24509i;
                    m.b(jVar5);
                    jVar5.e(jVarF);
                    sink.f24509i = jVarF;
                }
                j11 -= (long) (jVarF.f24525c - jVarF.f24524b);
                jVar4 = jVar4.f24528f;
                j9 = 0;
            }
        }
        this.f24516m += jMin;
        return jMin;
    }
}
