package U4;

/* JADX INFO: loaded from: classes.dex */
public final class q {
    public static final U4.p Companion = new U4.p();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final android.content.Context f10152a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final p162s8.d f10153b;

    public q(android.content.Context context, p162s8.d json) {
        kotlin.jvm.internal.m.e(context, "context");
        kotlin.jvm.internal.m.e(json, "json");
        this.f10152a = context;
        this.f10153b = json;
    }

    public static final java.io.File a(U4.q qVar, java.lang.String str) {
        qVar.getClass();
        java.io.File file = new java.io.File(qVar.f10152a.getCacheDir(), "SearchIndex");
        if (!file.exists()) {
            file.mkdirs();
        }
        return new java.io.File(file, str.concat(".json"));
    }
}
