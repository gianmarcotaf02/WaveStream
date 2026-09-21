package io.github.jan.supabase.auth;

import S7.A;
import S7.C;
import S7.M;
import android.content.Context;
import androidx.lifecycle.AbstractC1534p;
import androidx.lifecycle.C1542y;
import androidx.lifecycle.DefaultLifecycleObserver;
import androidx.lifecycle.InterfaceC1540w;
import androidx.lifecycle.ProcessLifecycleOwner;
import androidx.media3.container.NalUnitUtil;
import com.google.common.util.concurrent.P;
import io.github.jan.supabase.SupabaseClient;
import io.github.jan.supabase.annotations.SupabaseInternal;
import io.github.jan.supabase.logging.LogLevel;
import io.github.jan.supabase.logging.SupabaseLogger;
import kotlin.Metadata;
import p100l6.c;
import p117n6.e;
import p117n6.i;
import p194x6.m;

@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\u001a\u000f\u0010\u0001\u001a\u00020\u0000H\u0000¢\u0006\u0004\b\u0001\u0010\u0002\u001a\u0013\u0010\u0005\u001a\u00020\u0004*\u00020\u0003H\u0007¢\u0006\u0004\b\u0005\u0010\u0006\u001a\u0017\u0010\b\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0003H\u0002¢\u0006\u0004\b\b\u0010\u0006\"\u0018\u0010\t\u001a\u0004\u0018\u00010\u00008\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\t\u0010\n¨\u0006\u000b"}, d2 = {"Landroid/content/Context;", "applicationContext", "()Landroid/content/Context;", "Lio/github/jan/supabase/auth/Auth;", "Lh6/A;", "setupPlatform", "(Lio/github/jan/supabase/auth/Auth;)V", "gotrue", "addLifecycleCallbacks", "appContext", "Landroid/content/Context;", "auth-kt_release"}, k = 2, mv = {2, 1, 0}, xi = NalUnitUtil.H265_NAL_UNIT_TYPE_UNSPECIFIED)
public final class SetupPlatformKt {
    private static Context appContext;

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"LS7/A;", "Lh6/A;", "<anonymous>", "(LS7/A;)V"}, k = 3, mv = {2, 1, 0})
    @e(c = "io.github.jan.supabase.auth.SetupPlatformKt$addLifecycleCallbacks$1", f = "setupPlatform.kt", l = {}, m = "invokeSuspend")
    public static final class AnonymousClass1 extends i implements m {
        final Auth $gotrue;
        final AbstractC1534p $lifecycle;
        final A $scope;
        int label;

        public AnonymousClass1(AbstractC1534p abstractC1534p, Auth auth, A a2, c cVar) {
            super(2, cVar);
            this.$lifecycle = abstractC1534p;
            this.$gotrue = auth;
            this.$scope = a2;
        }

        @Override
        public final c create(Object obj, c cVar) {
            return new AnonymousClass1(this.$lifecycle, this.$gotrue, this.$scope, cVar);
        }

        @Override
        public final Object invoke(A a2, c cVar) {
            return ((AnonymousClass1) create(a2, cVar)).invokeSuspend(p070h6.A.f22523a);
        }

        @Override
        public final Object invokeSuspend(Object obj) {
            p109m6.a aVar = p109m6.a.f25430h;
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            P.u0(obj);
            AbstractC1534p abstractC1534p = this.$lifecycle;
            final Auth auth = this.$gotrue;
            final A a2 = this.$scope;
            abstractC1534p.a(new DefaultLifecycleObserver() {
                @Override
                public void onStart(InterfaceC1540w owner) {
                    kotlin.jvm.internal.m.e(owner, "owner");
                    if (((AuthImpl) auth).isAutoRefreshRunning() || !((AuthImpl) auth).getConfig().getAlwaysAutoRefresh()) {
                        return;
                    }
                    SupabaseLogger logger = Auth.INSTANCE.getLogger();
                    LogLevel logLevel = LogLevel.DEBUG;
                    LogLevel level = logger.getLevel();
                    if (level == null) {
                        level = SupabaseClient.INSTANCE.getDEFAULT_LOG_LEVEL();
                    }
                    if (logLevel.compareTo(level) >= 0) {
                        logger.log(logLevel, (Throwable) null, "Trying to re-load session from storage...");
                    }
                    C.A(a2, null, new SetupPlatformKt$addLifecycleCallbacks$1$1$onStart$2(auth, null), 3);
                }

                @Override
                public void onStop(InterfaceC1540w owner) {
                    kotlin.jvm.internal.m.e(owner, "owner");
                    if (((AuthImpl) auth).isAutoRefreshRunning()) {
                        SupabaseLogger logger = Auth.INSTANCE.getLogger();
                        LogLevel logLevel = LogLevel.DEBUG;
                        LogLevel level = logger.getLevel();
                        if (level == null) {
                            level = SupabaseClient.INSTANCE.getDEFAULT_LOG_LEVEL();
                        }
                        if (logLevel.compareTo(level) >= 0) {
                            logger.log(logLevel, (Throwable) null, "Cancelling auto refresh because app is switching to the background");
                        }
                        C.A(a2, null, new SetupPlatformKt$addLifecycleCallbacks$1$1$onStop$2(auth, null), 3);
                    }
                }
            });
            return p070h6.A.f22523a;
        }
    }

    private static final void addLifecycleCallbacks(Auth auth) {
        if (((AuthConfig) auth.getConfig()).getEnableLifecycleCallbacks()) {
            C1542y c1542y = ProcessLifecycleOwner.f16308p.f16313m;
            A authScope = ((AuthImpl) auth).getAuthScope();
            Z7.e eVar = M.f9549a;
            C.A(authScope, X7.m.f10930a, new AnonymousClass1(c1542y, auth, authScope, null), 2);
        }
    }

    public static final Context applicationContext() {
        Context context = appContext;
        if (context != null) {
            return context;
        }
        throw new IllegalStateException("Application context not initialized");
    }

    @SupabaseInternal
    public static final void setupPlatform(Auth auth) {
        kotlin.jvm.internal.m.e(auth, "<this>");
        addLifecycleCallbacks(auth);
    }
}
