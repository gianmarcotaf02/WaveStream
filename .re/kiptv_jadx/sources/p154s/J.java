package p154s;

/* JADX INFO: loaded from: classes.dex */
public final class J extends kotlin.jvm.internal.o implements p194x6.j {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final /* synthetic */ int f27067h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final /* synthetic */ p194x6.j f27068i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ J(int i3, p194x6.j jVar) {
        super(1);
        this.f27067h = i3;
        this.f27068i = jVar;
    }

    @Override // p194x6.j
    public final java.lang.Object invoke(java.lang.Object obj) {
        switch (this.f27067h) {
            case 0:
                return new p113n1.k((((long) ((java.lang.Number) this.f27068i.invoke(java.lang.Integer.valueOf((int) (((p113n1.m) obj).f25565a >> 32)))).intValue()) << 32) | (((long) 0) & 4294967295L));
            case 1:
                return new p113n1.k((((long) 0) << 32) | (4294967295L & ((long) ((java.lang.Number) this.f27068i.invoke(java.lang.Integer.valueOf((int) (((p113n1.m) obj).f25565a & 4294967295L)))).intValue())));
            case 2:
                return new p113n1.k((((long) ((java.lang.Number) this.f27068i.invoke(java.lang.Integer.valueOf((int) (((p113n1.m) obj).f25565a >> 32)))).intValue()) << 32) | (((long) 0) & 4294967295L));
            default:
                return new p113n1.k((((long) 0) << 32) | (4294967295L & ((long) ((java.lang.Number) this.f27068i.invoke(java.lang.Integer.valueOf((int) (((p113n1.m) obj).f25565a & 4294967295L)))).intValue())));
        }
    }
}
