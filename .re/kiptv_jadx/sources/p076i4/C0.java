package p076i4;

/* JADX INFO: loaded from: classes.dex */
public final class C0 extends p076i4.r {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final /* synthetic */ java.util.Map.Entry f22777h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final /* synthetic */ p076i4.E0 f22778i;

    public C0(java.util.Map.Entry entry, p076i4.E0 e6) {
        this.f22777h = entry;
        this.f22778i = e6;
    }

    @Override // java.util.Map.Entry
    public final java.lang.Object getKey() {
        return this.f22777h.getKey();
    }

    @Override // java.util.Map.Entry
    public final java.lang.Object getValue() {
        java.util.Map.Entry entry = this.f22777h;
        return this.f22778i.a(entry.getKey(), entry.getValue());
    }
}
