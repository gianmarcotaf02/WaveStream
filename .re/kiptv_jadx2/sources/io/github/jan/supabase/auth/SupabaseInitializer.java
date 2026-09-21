package io.github.jan.supabase.auth;

import android.content.Context;
import androidx.media3.container.NalUnitUtil;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.m;
import p078i6.w;
import p190x2.b;

@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u0017\u0010\u0006\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0006\u0010\u0007J!\u0010\n\u001a\u0014\u0012\u0010\u0012\u000e\u0012\n\b\u0001\u0012\u0006\u0012\u0002\b\u00030\u00010\t0\bH\u0016¢\u0006\u0004\b\n\u0010\u000b¨\u0006\f"}, d2 = {"Lio/github/jan/supabase/auth/SupabaseInitializer;", "Lx2/b;", "Landroid/content/Context;", "<init>", "()V", "context", "create", "(Landroid/content/Context;)Landroid/content/Context;", "", "Ljava/lang/Class;", "dependencies", "()Ljava/util/List;", "auth-kt_release"}, k = 1, mv = {2, 1, 0}, xi = NalUnitUtil.H265_NAL_UNIT_TYPE_UNSPECIFIED)
public final class SupabaseInitializer implements b {
    @Override
    public List<Class<? extends b>> dependencies() {
        return w.f23205h;
    }

    @Override
    public Context create(Context context) {
        m.e(context, "context");
        Context applicationContext = context.getApplicationContext();
        SetupPlatformKt.appContext = applicationContext;
        m.d(applicationContext, "also(...)");
        return applicationContext;
    }
}
