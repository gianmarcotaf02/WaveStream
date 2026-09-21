package N7;

/* JADX INFO: loaded from: classes4.dex */
public final class i implements N7.m {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final N7.m f7447a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f7448b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final p194x6.j f7449c;

    public i(N7.m mVar, boolean z6, p194x6.j predicate) {
        kotlin.jvm.internal.m.e(predicate, "predicate");
        this.f7447a = mVar;
        this.f7448b = z6;
        this.f7449c = predicate;
    }

    @Override // N7.m
    public final java.util.Iterator iterator() {
        return new N7.h(this);
    }
}
