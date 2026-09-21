package p105m2;

/* JADX INFO: loaded from: classes.dex */
public final class V {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ p105m2.W f25242a;

    public V(p105m2.W w6) {
        this.f25242a = w6;
    }

    public static void a(java.lang.String str, android.os.Bundle bundle) {
        android.util.Log.d("MediaRouteProviderProxy", "Error: " + str + ", data: " + bundle);
    }

    public final void b(android.os.Bundle bundle) {
        bundle.getString("groupableTitle");
        p105m2.W w6 = this.f25242a;
        w6.getClass();
        bundle.getString("transferableTitle");
        w6.getClass();
    }
}
