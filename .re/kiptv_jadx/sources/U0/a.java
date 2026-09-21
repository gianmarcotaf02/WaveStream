package U0;

/* JADX INFO: loaded from: classes.dex */
public final class a implements p080i8.f {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final java.lang.Object f10104h;

    public /* synthetic */ a(java.lang.Object obj) {
        this.f10104h = obj;
    }

    @Override // p080i8.f
    public java.lang.String a() {
        return B2.a.n(new java.lang.StringBuilder("attempted to overwrite the existing value '"), this.f10104h, '\'');
    }
}
