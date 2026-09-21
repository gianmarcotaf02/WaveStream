package p051f4;

/* JADX INFO: loaded from: classes.dex */
public final class a extends com.google.android.gms.common.internal.a implements E3.c {

    /* JADX INFO: renamed from: G, reason: collision with root package name */
    public final boolean f21699G;
    public final p179v4.o H;

    /* JADX INFO: renamed from: I, reason: collision with root package name */
    public final android.os.Bundle f21700I;

    /* JADX INFO: renamed from: J, reason: collision with root package name */
    public final java.lang.Integer f21701J;

    public a(android.content.Context context, android.os.Looper looper, p179v4.o oVar, android.os.Bundle bundle, E3.g gVar, E3.h hVar) {
        super(context, looper, 44, oVar, gVar, hVar);
        this.f21699G = true;
        this.H = oVar;
        this.f21700I = bundle;
        this.f21701J = (java.lang.Integer) oVar.f29180i;
    }

    @Override // E3.c
    public final int h() {
        return 12451000;
    }

    @Override // com.google.android.gms.common.internal.a, E3.c
    public final boolean k() {
        return this.f21699G;
    }

    @Override // com.google.android.gms.common.internal.a
    public final android.os.IInterface l(android.os.IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        android.os.IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.signin.internal.ISignInService");
        return iInterfaceQueryLocalInterface instanceof p051f4.c ? (p051f4.c) iInterfaceQueryLocalInterface : new p051f4.c(iBinder, "com.google.android.gms.signin.internal.ISignInService", 1);
    }

    @Override // com.google.android.gms.common.internal.a
    public final android.os.Bundle o() {
        p179v4.o oVar = this.H;
        boolean zEquals = this.j.getPackageName().equals((java.lang.String) oVar.f29179h);
        android.os.Bundle bundle = this.f21700I;
        if (!zEquals) {
            bundle.putString("com.google.android.gms.signin.internal.realClientPackageName", (java.lang.String) oVar.f29179h);
        }
        return bundle;
    }

    @Override // com.google.android.gms.common.internal.a
    public final java.lang.String q() {
        return "com.google.android.gms.signin.internal.ISignInService";
    }

    @Override // com.google.android.gms.common.internal.a
    public final java.lang.String r() {
        return "com.google.android.gms.signin.service.START";
    }
}
