package p146r1;

import p113n1.k;
import p113n1.l;
import p113n1.n;
import p137q0.h;

public final class C2678a implements E {

    public final h f26722h;

    public final long f26723i;

    public C2678a(h hVar, long j) {
        this.f26722h = hVar;
        this.f26723i = j;
    }

    @Override
    public final long b(l lVar, long j, n nVar, long j9) {
        int i3 = lVar.f25563c - lVar.f25561a;
        int i9 = lVar.f25564d - lVar.f25562b;
        h hVar = this.f26722h;
        long jA = hVar.a(0L, (((long) i3) << 32) | (((long) i9) & 4294967295L), nVar);
        long jA2 = hVar.a(0L, j9, nVar);
        long j10 = (((long) (-((int) (jA2 >> 32)))) << 32) | (((long) (-((int) (jA2 & 4294967295L)))) & 4294967295L);
        long j11 = this.f26723i;
        return k.c(k.c(k.c(lVar.a(), jA), j10), (((long) ((int) (j11 & 4294967295L))) & 4294967295L) | (((long) (((int) (j11 >> 32)) * (nVar == n.f25566h ? 1 : -1))) << 32));
    }
}
