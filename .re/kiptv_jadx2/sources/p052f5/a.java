package p052f5;

import Y0.v;
import Y0.x;
import io.github.jan.supabase.auth.AuthImpl;
import io.github.jan.supabase.auth.AuthenticatedSupabaseApiKt;
import io.github.jan.supabase.network.SupabaseApiKt;
import kotlin.jvm.internal.m;
import p070h6.A;
import p194x6.j;

public final class a implements j {

    public final int f21708h;

    public final String f21709i;

    public a(String str, int i3) {
        this.f21708h = i3;
        this.f21709i = str;
    }

    @Override
    public final Object invoke(Object obj) {
        switch (this.f21708h) {
            case 0:
                x semantics = (x) obj;
                m.e(semantics, "$this$semantics");
                v.b(semantics, this.f21709i);
                return A.f22523a;
            case 1:
                return AuthImpl.verifyEmailOtp$lambda$35(this.f21709i, (p162s8.v) obj);
            case 2:
                return AuthImpl.verifyEmailOtp$lambda$34(this.f21709i, (p162s8.v) obj);
            case 3:
                return AuthImpl.verifyPhoneOtp$lambda$36(this.f21709i, (p162s8.v) obj);
            case 4:
                return AuthenticatedSupabaseApiKt.authenticatedSupabaseApi$lambda$0(this.f21709i, (String) obj);
            case 5:
                return SupabaseApiKt.supabaseApi$lambda$0(this.f21709i, (String) obj);
            default:
                x xVar = (x) obj;
                v.b(xVar, this.f21709i);
                v.c(xVar, 5);
                return A.f22523a;
        }
    }
}
