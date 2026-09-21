package p052f5;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class a implements p194x6.j {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final /* synthetic */ int f21708h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f21709i;

    public /* synthetic */ a(java.lang.String str, int i3) {
        this.f21708h = i3;
        this.f21709i = str;
    }

    @Override // p194x6.j
    public final java.lang.Object invoke(java.lang.Object obj) {
        switch (this.f21708h) {
            case 0:
                Y0.x semantics = (Y0.x) obj;
                kotlin.jvm.internal.m.e(semantics, "$this$semantics");
                Y0.v.b(semantics, this.f21709i);
                return p070h6.A.f22523a;
            case 1:
                return io.github.jan.supabase.auth.AuthImpl.verifyEmailOtp$lambda$35(this.f21709i, (p162s8.v) obj);
            case 2:
                return io.github.jan.supabase.auth.AuthImpl.verifyEmailOtp$lambda$34(this.f21709i, (p162s8.v) obj);
            case 3:
                return io.github.jan.supabase.auth.AuthImpl.verifyPhoneOtp$lambda$36(this.f21709i, (p162s8.v) obj);
            case 4:
                return io.github.jan.supabase.auth.AuthenticatedSupabaseApiKt.authenticatedSupabaseApi$lambda$0(this.f21709i, (java.lang.String) obj);
            case 5:
                return io.github.jan.supabase.network.SupabaseApiKt.supabaseApi$lambda$0(this.f21709i, (java.lang.String) obj);
            default:
                Y0.x xVar = (Y0.x) obj;
                Y0.v.b(xVar, this.f21709i);
                Y0.v.c(xVar, 5);
                return p070h6.A.f22523a;
        }
    }
}
