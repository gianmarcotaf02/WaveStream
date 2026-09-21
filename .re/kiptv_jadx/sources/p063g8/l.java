package p063g8;

/* JADX INFO: loaded from: classes4.dex */
public final class l extends p063g8.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final p063g8.r f22380a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final java.lang.String f22381b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final java.lang.Object f22382c;

    public l(p063g8.r rVar, p055f8.a aVar, int i3) {
        java.lang.String name = rVar.f22391h.getName();
        aVar = (i3 & 4) != 0 ? null : aVar;
        kotlin.jvm.internal.m.e(name, "name");
        this.f22380a = rVar;
        this.f22381b = name;
        this.f22382c = aVar;
    }

    @Override // p063g8.a
    public final p063g8.r a() {
        return this.f22380a;
    }

    @Override // p063g8.a
    public final java.lang.Object b() {
        return this.f22382c;
    }

    @Override // p063g8.a
    public final java.lang.String c() {
        return this.f22381b;
    }

    @Override // p063g8.a
    public final p045e8.X d() {
        return null;
    }
}
