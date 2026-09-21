package p146r1;

/* JADX INFO: renamed from: r1.a, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C2678a implements p146r1.E {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final p137q0.h f26722h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final long f26723i;

    public C2678a(p137q0.h hVar, long j) {
        this.f26722h = hVar;
        this.f26723i = j;
    }

    @Override // p146r1.E
    public final long b(p113n1.l lVar, long j, p113n1.n nVar, long j9) {
        int i3 = lVar.f25563c - lVar.f25561a;
        int i9 = lVar.f25564d - lVar.f25562b;
        p137q0.h hVar = this.f26722h;
        long jA = hVar.a(0L, (((long) i3) << 32) | (((long) i9) & 4294967295L), nVar);
        long jA2 = hVar.a(0L, j9, nVar);
        long j10 = (((long) (-((int) (jA2 >> 32)))) << 32) | (((long) (-((int) (jA2 & 4294967295L)))) & 4294967295L);
        long j11 = this.f26723i;
        return p113n1.k.c(p113n1.k.c(p113n1.k.c(lVar.a(), jA), j10), (((long) ((int) (j11 & 4294967295L))) & 4294967295L) | (((long) (((int) (j11 >> 32)) * (nVar == p113n1.n.f25566h ? 1 : -1))) << 32));
    }
}
