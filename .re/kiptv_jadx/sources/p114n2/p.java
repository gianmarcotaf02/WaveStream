package p114n2;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class p implements p194x6.j {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final /* synthetic */ int f25645h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final /* synthetic */ android.os.Bundle f25646i;

    public /* synthetic */ p(int i3, android.os.Bundle bundle) {
        this.f25645h = i3;
        this.f25646i = bundle;
    }

    @Override // p194x6.j
    public final java.lang.Object invoke(java.lang.Object obj) {
        java.lang.String argName = (java.lang.String) obj;
        switch (this.f25645h) {
            case 0:
                kotlin.jvm.internal.m.e(argName, "argName");
                android.os.Bundle source = this.f25646i;
                kotlin.jvm.internal.m.e(source, "source");
                return java.lang.Boolean.valueOf(!source.containsKey(argName));
            default:
                kotlin.jvm.internal.m.e(argName, "key");
                android.os.Bundle source2 = this.f25646i;
                kotlin.jvm.internal.m.e(source2, "source");
                return java.lang.Boolean.valueOf(!source2.containsKey(argName));
        }
    }
}
