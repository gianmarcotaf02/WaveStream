package v;

/* JADX INFO: loaded from: classes.dex */
public final class Y implements p188x0.O {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final v.Y f28909b = new v.Y(0);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final v.Y f28910c = new v.Y(1);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f28911a;

    public /* synthetic */ Y(int i3) {
        this.f28911a = i3;
    }

    @Override // p188x0.O
    public final p188x0.z a(long j, p113n1.n nVar, p113n1.c cVar) {
        switch (this.f28911a) {
            case 0:
                float fK0 = cVar.k0(v.H.f28851a);
                return new p188x0.G(new p181w0.b(0.0f, -fK0, java.lang.Float.intBitsToFloat((int) (j >> 32)), java.lang.Float.intBitsToFloat((int) (j & 4294967295L)) + fK0));
            default:
                float fK1 = cVar.k0(v.H.f28851a);
                return new p188x0.G(new p181w0.b(-fK1, 0.0f, java.lang.Float.intBitsToFloat((int) (j >> 32)) + fK1, java.lang.Float.intBitsToFloat((int) (j & 4294967295L))));
        }
    }
}
