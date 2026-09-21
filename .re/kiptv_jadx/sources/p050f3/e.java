package p050f3;

/* JADX INFO: loaded from: classes.dex */
public final class e implements p058g3.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f21691a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final java.lang.Object f21692b;

    public /* synthetic */ e(int i3, java.lang.Object obj) {
        this.f21691a = i3;
        this.f21692b = obj;
    }

    @Override // p061g6.a
    public final java.lang.Object get() {
        switch (this.f21691a) {
            case 0:
                return new p050f3.d((android.content.Context) ((p050f3.e) this.f21692b).f21692b, new V1.b(24), new V1.b(23));
            case 1:
                java.lang.String packageName = ((android.content.Context) ((p050f3.e) this.f21692b).f21692b).getPackageName();
                if (packageName != null) {
                    return packageName;
                }
                throw new java.lang.NullPointerException("Cannot return null from a non-@Nullable @Provides method");
            case 2:
                return new p098l3.i((android.content.Context) ((p050f3.e) this.f21692b).f21692b, java.lang.Integer.valueOf(p098l3.i.f24734k).intValue(), "com.google.android.datatransport.events");
            default:
                return this.f21692b;
        }
    }
}
