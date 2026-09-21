package H3;

/* JADX INFO: loaded from: classes.dex */
public abstract class o {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public java.lang.Boolean f3993a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public boolean f3994b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ com.google.android.gms.common.internal.a f3995c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f3996d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final android.os.Bundle f3997e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.google.android.gms.common.internal.a f3998f;

    public o(com.google.android.gms.common.internal.a aVar, int i3, android.os.Bundle bundle) {
        java.util.Objects.requireNonNull(aVar);
        this.f3998f = aVar;
        java.lang.Boolean bool = java.lang.Boolean.TRUE;
        this.f3995c = aVar;
        this.f3993a = bool;
        this.f3994b = false;
        this.f3996d = i3;
        this.f3997e = bundle;
    }

    public abstract boolean a();

    public abstract void b(D3.b bVar);
}
