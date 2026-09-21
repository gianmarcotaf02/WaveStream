package io.github.jan.supabase.auth;

/* JADX INFO: loaded from: classes4.dex */
@kotlin.Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\u001a\u000f\u0010\u0001\u001a\u00020\u0000H\u0000¢\u0006\u0004\b\u0001\u0010\u0002\u001a\u0013\u0010\u0005\u001a\u00020\u0004*\u00020\u0003H\u0007¢\u0006\u0004\b\u0005\u0010\u0006\u001a\u0017\u0010\b\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0003H\u0002¢\u0006\u0004\b\b\u0010\u0006\"\u0018\u0010\t\u001a\u0004\u0018\u00010\u00008\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\t\u0010\n¨\u0006\u000b"}, d2 = {"Landroid/content/Context;", "applicationContext", "()Landroid/content/Context;", "Lio/github/jan/supabase/auth/Auth;", "Lh6/A;", "setupPlatform", "(Lio/github/jan/supabase/auth/Auth;)V", "gotrue", "addLifecycleCallbacks", "appContext", "Landroid/content/Context;", "auth-kt_release"}, k = 2, mv = {2, 1, 0}, xi = androidx.media3.container.NalUnitUtil.H265_NAL_UNIT_TYPE_UNSPECIFIED)
public final class SetupPlatformKt {
    private static android.content.Context appContext;

    /* JADX INFO: renamed from: io.github.jan.supabase.auth.SetupPlatformKt$addLifecycleCallbacks$1, reason: invalid class name */
    @kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"LS7/A;", "Lh6/A;", "<anonymous>", "(LS7/A;)V"}, k = 3, mv = {2, 1, 0})
    @p117n6.e(c = "io.github.jan.supabase.auth.SetupPlatformKt$addLifecycleCallbacks$1", f = "setupPlatform.kt", l = {}, m = "invokeSuspend")
    public static final class AnonymousClass1 extends p117n6.i implements p194x6.m {
        final /* synthetic */ io.github.jan.supabase.auth.Auth $gotrue;
        final /* synthetic */ androidx.lifecycle.AbstractC1534p $lifecycle;
        final /* synthetic */ S7.A $scope;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(androidx.lifecycle.AbstractC1534p abstractC1534p, io.github.jan.supabase.auth.Auth auth, S7.A a2, p100l6.c cVar) {
            super(2, cVar);
            this.$lifecycle = abstractC1534p;
            this.$gotrue = auth;
            this.$scope = a2;
        }

        @Override // p117n6.a
        public final p100l6.c create(java.lang.Object obj, p100l6.c cVar) {
            return new io.github.jan.supabase.auth.SetupPlatformKt.AnonymousClass1(this.$lifecycle, this.$gotrue, this.$scope, cVar);
        }

        @Override // p194x6.m
        public final java.lang.Object invoke(S7.A a2, p100l6.c cVar) {
            return ((io.github.jan.supabase.auth.SetupPlatformKt.AnonymousClass1) create(a2, cVar)).invokeSuspend(p070h6.A.f22523a);
        }

        @Override // p117n6.a
        public final java.lang.Object invokeSuspend(java.lang.Object obj) {
            p109m6.a aVar = p109m6.a.f25430h;
            if (this.label != 0) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            com.google.common.util.concurrent.P.u0(obj);
            androidx.lifecycle.AbstractC1534p abstractC1534p = this.$lifecycle;
            final io.github.jan.supabase.auth.Auth auth = this.$gotrue;
            final S7.A a2 = this.$scope;
            abstractC1534p.a(new androidx.lifecycle.DefaultLifecycleObserver() { // from class: io.github.jan.supabase.auth.SetupPlatformKt.addLifecycleCallbacks.1.1
                @Override // androidx.lifecycle.DefaultLifecycleObserver
                public void onStart(androidx.lifecycle.InterfaceC1540w owner) {
                    kotlin.jvm.internal.m.e(owner, "owner");
                    if (((io.github.jan.supabase.auth.AuthImpl) auth).isAutoRefreshRunning() || !((io.github.jan.supabase.auth.AuthImpl) auth).getConfig().getAlwaysAutoRefresh()) {
                        return;
                    }
                    io.github.jan.supabase.logging.SupabaseLogger logger = io.github.jan.supabase.auth.Auth.INSTANCE.getLogger();
                    io.github.jan.supabase.logging.LogLevel logLevel = io.github.jan.supabase.logging.LogLevel.DEBUG;
                    io.github.jan.supabase.logging.LogLevel level = logger.getLevel();
                    if (level == null) {
                        level = io.github.jan.supabase.SupabaseClient.INSTANCE.getDEFAULT_LOG_LEVEL();
                    }
                    if (logLevel.compareTo(level) >= 0) {
                        logger.log(logLevel, (java.lang.Throwable) null, "Trying to re-load session from storage...");
                    }
                    S7.C.A(a2, null, new io.github.jan.supabase.auth.SetupPlatformKt$addLifecycleCallbacks$1$1$onStart$2(auth, null), 3);
                }

                @Override // androidx.lifecycle.DefaultLifecycleObserver
                public void onStop(androidx.lifecycle.InterfaceC1540w owner) {
                    kotlin.jvm.internal.m.e(owner, "owner");
                    if (((io.github.jan.supabase.auth.AuthImpl) auth).isAutoRefreshRunning()) {
                        io.github.jan.supabase.logging.SupabaseLogger logger = io.github.jan.supabase.auth.Auth.INSTANCE.getLogger();
                        io.github.jan.supabase.logging.LogLevel logLevel = io.github.jan.supabase.logging.LogLevel.DEBUG;
                        io.github.jan.supabase.logging.LogLevel level = logger.getLevel();
                        if (level == null) {
                            level = io.github.jan.supabase.SupabaseClient.INSTANCE.getDEFAULT_LOG_LEVEL();
                        }
                        if (logLevel.compareTo(level) >= 0) {
                            logger.log(logLevel, (java.lang.Throwable) null, "Cancelling auto refresh because app is switching to the background");
                        }
                        S7.C.A(a2, null, new io.github.jan.supabase.auth.SetupPlatformKt$addLifecycleCallbacks$1$1$onStop$2(auth, null), 3);
                    }
                }
            });
            return p070h6.A.f22523a;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    private static final void addLifecycleCallbacks(io.github.jan.supabase.auth.Auth auth) {
        if (((io.github.jan.supabase.auth.AuthConfig) auth.getConfig()).getEnableLifecycleCallbacks()) {
            androidx.lifecycle.C1542y c1542y = androidx.lifecycle.ProcessLifecycleOwner.f16308p.f16313m;
            S7.A authScope = ((io.github.jan.supabase.auth.AuthImpl) auth).getAuthScope();
            Z7.e eVar = S7.M.f9549a;
            S7.C.A(authScope, X7.m.f10930a, new io.github.jan.supabase.auth.SetupPlatformKt.AnonymousClass1(c1542y, auth, authScope, null), 2);
        }
    }

    public static final android.content.Context applicationContext() {
        android.content.Context context = appContext;
        if (context != null) {
            return context;
        }
        throw new java.lang.IllegalStateException("Application context not initialized");
    }

    @io.github.jan.supabase.annotations.SupabaseInternal
    public static final void setupPlatform(io.github.jan.supabase.auth.Auth auth) {
        kotlin.jvm.internal.m.e(auth, "<this>");
        addLifecycleCallbacks(auth);
    }
}
