package p005a5;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class S0 implements java.io.FileFilter {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f13871a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ java.lang.Object f13872b;

    public /* synthetic */ S0(int i3, java.lang.Object obj) {
        this.f13871a = i3;
        this.f13872b = obj;
    }

    @Override // java.io.FileFilter
    public final boolean accept(java.io.File file) {
        switch (this.f13871a) {
            case 0:
                java.lang.String name = file.getName();
                java.lang.StringBuilder sb = new java.lang.StringBuilder();
                java.lang.String str = (java.lang.String) this.f13872b;
                sb.append(str);
                sb.append(".srt");
                if (!kotlin.jvm.internal.m.a(name, sb.toString())) {
                    java.lang.String name2 = file.getName();
                    kotlin.jvm.internal.m.d(name2, "getName(...)");
                    if (!O7.x.x0(name2, str + "_", false)) {
                        return false;
                    }
                    java.lang.String name3 = file.getName();
                    kotlin.jvm.internal.m.d(name3, "getName(...)");
                    if (!O7.x.q0(name3, ".srt", false)) {
                        return false;
                    }
                }
                return true;
            default:
                return com.revenuecat.purchases.common.networking.ETagPayloadStore.deleteTrash$lambda$5((com.revenuecat.purchases.common.networking.ETagPayloadStore) this.f13872b, file);
        }
    }
}
