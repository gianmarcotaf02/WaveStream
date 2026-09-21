package p076i4;

/* JADX INFO: loaded from: classes.dex */
public final class B0 implements p068h4.j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f22773a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ p076i4.E0 f22774b;

    public /* synthetic */ B0(p076i4.E0 e6, int i3) {
        this.f22773a = i3;
        this.f22774b = e6;
    }

    @Override // p068h4.j
    public final java.lang.Object apply(java.lang.Object obj) {
        switch (this.f22773a) {
            case 0:
                java.util.Map.Entry entry = (java.util.Map.Entry) obj;
                entry.getKey();
                return ((p068h4.j) ((p020c0.C1704s0) this.f22774b).f18362i).apply(entry.getValue());
            default:
                java.util.Map.Entry entry2 = (java.util.Map.Entry) obj;
                p076i4.E0 e6 = this.f22774b;
                e6.getClass();
                entry2.getClass();
                return new p076i4.C0(entry2, e6);
        }
    }
}
