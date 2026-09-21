package I7;

/* JADX INFO: loaded from: classes4.dex */
public abstract class w implements I7.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final p194x6.j f5605a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final java.lang.String f5606b;

    public w(java.lang.String str, p194x6.j jVar) {
        this.f5605a = jVar;
        this.f5606b = "must return ".concat(str);
    }

    @Override // I7.e
    public final boolean a(Y6.g gVar) {
        return kotlin.jvm.internal.m.a(gVar.f8686n, this.f5605a.invoke(p161s7.d.e(gVar)));
    }

    @Override // I7.e
    public final java.lang.String b(Y6.g gVar) {
        return E8.d.S(this, gVar);
    }

    @Override // I7.e
    public final java.lang.String getDescription() {
        return this.f5606b;
    }
}
