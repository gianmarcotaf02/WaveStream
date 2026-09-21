package N7;

/* JADX INFO: loaded from: classes4.dex */
public final class j implements N7.m {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final N7.m f7450a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final p194x6.j f7451b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final p194x6.j f7452c;

    public j(N7.m sequence, p194x6.j transformer, p194x6.j jVar) {
        kotlin.jvm.internal.m.e(sequence, "sequence");
        kotlin.jvm.internal.m.e(transformer, "transformer");
        this.f7450a = sequence;
        this.f7451b = transformer;
        this.f7452c = jVar;
    }

    @Override // N7.m
    public final java.util.Iterator iterator() {
        return new N7.h(this);
    }
}
