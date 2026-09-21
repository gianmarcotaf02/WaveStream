package p063g8;

/* JADX INFO: loaded from: classes4.dex */
public final class e implements p063g8.q {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final java.lang.Object f22374a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final p007a7.n f22375b;

    public e(java.lang.Object obj, p007a7.n nVar) {
        this.f22374a = obj;
        this.f22375b = nVar;
    }

    @Override // p063g8.q
    public final boolean test(java.lang.Object obj) {
        return kotlin.jvm.internal.m.a(this.f22375b.invoke(obj), this.f22374a);
    }
}
