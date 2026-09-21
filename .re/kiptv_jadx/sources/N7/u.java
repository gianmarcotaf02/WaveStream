package N7;

/* JADX INFO: loaded from: classes4.dex */
public final class u implements N7.m {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final N7.m f7470a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final p194x6.j f7471b;

    public u(N7.m sequence, p194x6.j transformer) {
        kotlin.jvm.internal.m.e(sequence, "sequence");
        kotlin.jvm.internal.m.e(transformer, "transformer");
        this.f7470a = sequence;
        this.f7471b = transformer;
    }

    @Override // N7.m
    public final java.util.Iterator iterator() {
        return new D1.B(this);
    }
}
