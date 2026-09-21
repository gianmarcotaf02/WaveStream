package io.github.jan.supabase.auth.providers.builtin;

/* JADX INFO: loaded from: classes4.dex */
@kotlin.Metadata(d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0005\bÆ\n\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0002\u001d\u001eB\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\\\u0010\u0011\u001a\u00020\u00032\u0006\u0010\u0007\u001a\u00020\u00062\"\u0010\f\u001a\u001e\b\u0001\u0012\u0004\u0012\u00020\t\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\n\u0012\u0006\u0012\u0004\u0018\u00010\u000b0\b2\b\u0010\u000e\u001a\u0004\u0018\u00010\r2\u0014\u0010\u0010\u001a\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u000fH\u0096@¢\u0006\u0004\b\u0011\u0010\u0012J\\\u0010\u0013\u001a\u00020\u00032\u0006\u0010\u0007\u001a\u00020\u00062\"\u0010\f\u001a\u001e\b\u0001\u0012\u0004\u0012\u00020\t\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\n\u0012\u0006\u0012\u0004\u0018\u00010\u000b0\b2\b\u0010\u000e\u001a\u0004\u0018\u00010\r2\u0014\u0010\u0010\u001a\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u000fH\u0096@¢\u0006\u0004\b\u0013\u0010\u0012J\u0010\u0010\u0014\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0017\u001a\u00020\u0016HÖ\u0001¢\u0006\u0004\b\u0017\u0010\u0018J\u001a\u0010\u001b\u001a\u00020\u001a2\b\u0010\u0019\u001a\u0004\u0018\u00010\u000bHÖ\u0003¢\u0006\u0004\b\u001b\u0010\u001c¨\u0006\u001f"}, d2 = {"Lio/github/jan/supabase/auth/providers/builtin/SSO;", "Lio/github/jan/supabase/auth/providers/AuthProvider;", "Lio/github/jan/supabase/auth/providers/builtin/SSO$Config;", "Lh6/A;", "<init>", "()V", "Lio/github/jan/supabase/SupabaseClient;", "supabaseClient", "Lkotlin/Function2;", "Lio/github/jan/supabase/auth/user/UserSession;", "Ll6/c;", "", "onSuccess", "", "redirectUrl", "Lkotlin/Function1;", "config", "login", "(Lio/github/jan/supabase/SupabaseClient;Lx6/m;Ljava/lang/String;Lx6/j;Ll6/c;)Ljava/lang/Object;", "signUp", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", io.sentry.protocol.Request.JsonKeys.OTHER, "", "equals", "(Ljava/lang/Object;)Z", "Config", "Result", "auth-kt_release"}, k = 1, mv = {2, 1, 0}, xi = androidx.media3.container.NalUnitUtil.H265_NAL_UNIT_TYPE_UNSPECIFIED)
public final /* data */ class SSO implements io.github.jan.supabase.auth.providers.AuthProvider<io.github.jan.supabase.auth.providers.builtin.SSO.Config, p070h6.A> {
    public static final io.github.jan.supabase.auth.providers.builtin.SSO INSTANCE = new io.github.jan.supabase.auth.providers.builtin.SSO();

    @kotlin.Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0011\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B+\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u000b\u0010\u0010\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0011\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0012\u001a\u0004\u0018\u00010\u0003HÆ\u0003J-\u0010\u0013\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0013\u0010\u0014\u001a\u00020\u00152\b\u0010\u0016\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0017\u001a\u00020\u0018HÖ\u0001J\t\u0010\u0019\u001a\u00020\u0003HÖ\u0001R\u001c\u0010\u0002\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\b\u0010\t\"\u0004\b\n\u0010\u000bR\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\f\u0010\t\"\u0004\b\r\u0010\u000bR\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000e\u0010\t\"\u0004\b\u000f\u0010\u000b¨\u0006\u001a"}, d2 = {"Lio/github/jan/supabase/auth/providers/builtin/SSO$Config;", "", "providerId", "", "captchaToken", "domain", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getProviderId", "()Ljava/lang/String;", "setProviderId", "(Ljava/lang/String;)V", "getCaptchaToken", "setCaptchaToken", "getDomain", "setDomain", "component1", "component2", "component3", "copy", "equals", "", io.sentry.protocol.Request.JsonKeys.OTHER, "hashCode", "", "toString", "auth-kt_release"}, k = 1, mv = {2, 1, 0}, xi = androidx.media3.container.NalUnitUtil.H265_NAL_UNIT_TYPE_UNSPECIFIED)
    public static final /* data */ class Config {
        private java.lang.String captchaToken;
        private java.lang.String domain;
        private java.lang.String providerId;

        public Config() {
            this(null, null, null, 7, null);
        }

        public static /* synthetic */ io.github.jan.supabase.auth.providers.builtin.SSO.Config copy$default(io.github.jan.supabase.auth.providers.builtin.SSO.Config config, java.lang.String str, java.lang.String str2, java.lang.String str3, int i3, java.lang.Object obj) {
            if ((i3 & 1) != 0) {
                str = config.providerId;
            }
            if ((i3 & 2) != 0) {
                str2 = config.captchaToken;
            }
            if ((i3 & 4) != 0) {
                str3 = config.domain;
            }
            return config.copy(str, str2, str3);
        }

        /* JADX INFO: renamed from: component1, reason: from getter */
        public final java.lang.String getProviderId() {
            return this.providerId;
        }

        /* JADX INFO: renamed from: component2, reason: from getter */
        public final java.lang.String getCaptchaToken() {
            return this.captchaToken;
        }

        /* JADX INFO: renamed from: component3, reason: from getter */
        public final java.lang.String getDomain() {
            return this.domain;
        }

        public final io.github.jan.supabase.auth.providers.builtin.SSO.Config copy(java.lang.String providerId, java.lang.String captchaToken, java.lang.String domain) {
            return new io.github.jan.supabase.auth.providers.builtin.SSO.Config(providerId, captchaToken, domain);
        }

        public boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof io.github.jan.supabase.auth.providers.builtin.SSO.Config)) {
                return false;
            }
            io.github.jan.supabase.auth.providers.builtin.SSO.Config config = (io.github.jan.supabase.auth.providers.builtin.SSO.Config) other;
            return kotlin.jvm.internal.m.a(this.providerId, config.providerId) && kotlin.jvm.internal.m.a(this.captchaToken, config.captchaToken) && kotlin.jvm.internal.m.a(this.domain, config.domain);
        }

        public final java.lang.String getCaptchaToken() {
            return this.captchaToken;
        }

        public final java.lang.String getDomain() {
            return this.domain;
        }

        public final java.lang.String getProviderId() {
            return this.providerId;
        }

        public int hashCode() {
            java.lang.String str = this.providerId;
            int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
            java.lang.String str2 = this.captchaToken;
            int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
            java.lang.String str3 = this.domain;
            return iHashCode2 + (str3 != null ? str3.hashCode() : 0);
        }

        public final void setCaptchaToken(java.lang.String str) {
            this.captchaToken = str;
        }

        public final void setDomain(java.lang.String str) {
            this.domain = str;
        }

        public final void setProviderId(java.lang.String str) {
            this.providerId = str;
        }

        public java.lang.String toString() {
            java.lang.StringBuilder sb = new java.lang.StringBuilder("Config(providerId=");
            sb.append(this.providerId);
            sb.append(", captchaToken=");
            sb.append(this.captchaToken);
            sb.append(", domain=");
            return Y6.f.l(sb, this.domain, ')');
        }

        public Config(java.lang.String str, java.lang.String str2, java.lang.String str3) {
            this.providerId = str;
            this.captchaToken = str2;
            this.domain = str3;
        }

        public /* synthetic */ Config(java.lang.String str, java.lang.String str2, java.lang.String str3, int i3, kotlin.jvm.internal.AbstractC2541f abstractC2541f) {
            this((i3 & 1) != 0 ? null : str, (i3 & 2) != 0 ? null : str2, (i3 & 4) != 0 ? null : str3);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\u000b\n\u0002\b\u0007\b\u0087\b\u0018\u0000 !2\u00020\u0001:\u0002\"!B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005B%\b\u0010\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\u0004\u0010\nJ'\u0010\u0013\u001a\u00020\u00102\u0006\u0010\u000b\u001a\u00020\u00002\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\u000eH\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0014\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0014\u0010\u0015J\u001a\u0010\u0016\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\u0016\u0010\u0017J\u0010\u0010\u0018\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0018\u0010\u0015J\u0010\u0010\u0019\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0019\u0010\u001aJ\u001a\u0010\u001d\u001a\u00020\u001c2\b\u0010\u001b\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u001d\u0010\u001eR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u001f\u001a\u0004\b \u0010\u0015¨\u0006#"}, d2 = {"Lio/github/jan/supabase/auth/providers/builtin/SSO$Result;", "", "", io.sentry.protocol.Request.JsonKeys.URL, "<init>", "(Ljava/lang/String;)V", "", "seen0", "Lr8/k0;", "serializationConstructorMarker", "(ILjava/lang/String;Lr8/k0;)V", "self", "Lq8/b;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "Lh6/A;", "write$Self$auth_kt_release", "(Lio/github/jan/supabase/auth/providers/builtin/SSO$Result;Lq8/b;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "write$Self", "component1", "()Ljava/lang/String;", "copy", "(Ljava/lang/String;)Lio/github/jan/supabase/auth/providers/builtin/SSO$Result;", "toString", "hashCode", "()I", io.sentry.protocol.Request.JsonKeys.OTHER, "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getUrl", "Companion", "$serializer", "auth-kt_release"}, k = 1, mv = {2, 1, 0}, xi = androidx.media3.container.NalUnitUtil.H265_NAL_UNIT_TYPE_UNSPECIFIED)
    @p119n8.i
    public static final /* data */ class Result {

        /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
        public static final io.github.jan.supabase.auth.providers.builtin.SSO.Result.Companion INSTANCE = new io.github.jan.supabase.auth.providers.builtin.SSO.Result.Companion(null);
        private final java.lang.String url;

        @kotlin.Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¨\u0006\u0007"}, d2 = {"Lio/github/jan/supabase/auth/providers/builtin/SSO$Result$Companion;", "", "<init>", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lio/github/jan/supabase/auth/providers/builtin/SSO$Result;", "auth-kt_release"}, k = 1, mv = {2, 1, 0}, xi = androidx.media3.container.NalUnitUtil.H265_NAL_UNIT_TYPE_UNSPECIFIED)
        public static final class Companion {
            private Companion() {
            }

            public final kotlinx.serialization.KSerializer serializer() {
                return io.github.jan.supabase.auth.providers.builtin.SSO$Result$$serializer.INSTANCE;
            }

            public /* synthetic */ Companion(kotlin.jvm.internal.AbstractC2541f abstractC2541f) {
                this();
            }
        }

        public /* synthetic */ Result(int i3, java.lang.String str, p153r8.k0 k0Var) {
            if (1 == (i3 & 1)) {
                this.url = str;
            } else {
                p153r8.AbstractC2686a0.l(i3, 1, io.github.jan.supabase.auth.providers.builtin.SSO$Result$$serializer.INSTANCE.getDescriptor());
                throw null;
            }
        }

        public static /* synthetic */ io.github.jan.supabase.auth.providers.builtin.SSO.Result copy$default(io.github.jan.supabase.auth.providers.builtin.SSO.Result result, java.lang.String str, int i3, java.lang.Object obj) {
            if ((i3 & 1) != 0) {
                str = result.url;
            }
            return result.copy(str);
        }

        /* JADX INFO: renamed from: component1, reason: from getter */
        public final java.lang.String getUrl() {
            return this.url;
        }

        public final io.github.jan.supabase.auth.providers.builtin.SSO.Result copy(java.lang.String url) {
            kotlin.jvm.internal.m.e(url, "url");
            return new io.github.jan.supabase.auth.providers.builtin.SSO.Result(url);
        }

        public boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof io.github.jan.supabase.auth.providers.builtin.SSO.Result) && kotlin.jvm.internal.m.a(this.url, ((io.github.jan.supabase.auth.providers.builtin.SSO.Result) other).url);
        }

        public final java.lang.String getUrl() {
            return this.url;
        }

        public int hashCode() {
            return this.url.hashCode();
        }

        public java.lang.String toString() {
            return Y6.f.l(new java.lang.StringBuilder("Result(url="), this.url, ')');
        }

        public Result(java.lang.String url) {
            kotlin.jvm.internal.m.e(url, "url");
            this.url = url;
        }
    }

    /* JADX INFO: renamed from: io.github.jan.supabase.auth.providers.builtin.SSO$signUp$1, reason: invalid class name */
    @kotlin.Metadata(k = 3, mv = {2, 1, 0}, xi = androidx.media3.container.NalUnitUtil.H265_NAL_UNIT_TYPE_UNSPECIFIED)
    @p117n6.e(c = "io.github.jan.supabase.auth.providers.builtin.SSO", f = "SSO.kt", l = {54}, m = "signUp")
    public static final class AnonymousClass1 extends p117n6.c {
        int label;
        /* synthetic */ java.lang.Object result;

        public AnonymousClass1(p100l6.c cVar) {
            super(cVar);
        }

        @Override // p117n6.a
        public final java.lang.Object invokeSuspend(java.lang.Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return io.github.jan.supabase.auth.providers.builtin.SSO.this.signUp(null, null, null, null, this);
        }
    }

    private SSO() {
    }

    public boolean equals(java.lang.Object other) {
        return this == other || (other instanceof io.github.jan.supabase.auth.providers.builtin.SSO);
    }

    public int hashCode() {
        return -2145433598;
    }

    @Override // io.github.jan.supabase.auth.providers.AuthProvider
    public java.lang.Object login(io.github.jan.supabase.SupabaseClient supabaseClient, p194x6.m mVar, java.lang.String str, p194x6.j jVar, p100l6.c cVar) {
        java.lang.Object objSignUp = signUp(supabaseClient, mVar, str, jVar, cVar);
        return objSignUp == p109m6.a.f25430h ? objSignUp : p070h6.A.f22523a;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // io.github.jan.supabase.auth.providers.AuthProvider
    public java.lang.Object signUp(io.github.jan.supabase.SupabaseClient supabaseClient, p194x6.m mVar, java.lang.String str, p194x6.j jVar, p100l6.c cVar) {
        io.github.jan.supabase.auth.providers.builtin.SSO.AnonymousClass1 anonymousClass1;
        if (cVar instanceof io.github.jan.supabase.auth.providers.builtin.SSO.AnonymousClass1) {
            anonymousClass1 = (io.github.jan.supabase.auth.providers.builtin.SSO.AnonymousClass1) cVar;
            int i3 = anonymousClass1.label;
            if ((i3 & Integer.MIN_VALUE) != 0) {
                anonymousClass1.label = i3 - Integer.MIN_VALUE;
            } else {
                anonymousClass1 = new io.github.jan.supabase.auth.providers.builtin.SSO.AnonymousClass1(cVar);
            }
        } else {
            anonymousClass1 = new io.github.jan.supabase.auth.providers.builtin.SSO.AnonymousClass1(cVar);
        }
        java.lang.Object obj = anonymousClass1.result;
        p109m6.a aVar = p109m6.a.f25430h;
        int i9 = anonymousClass1.label;
        if (i9 == 0) {
            com.google.common.util.concurrent.P.u0(obj);
            anonymousClass1.label = 1;
            if (io.github.jan.supabase.auth.providers.builtin.SSOKt.loginWithSSO(supabaseClient, mVar, str, jVar, anonymousClass1) == aVar) {
                return aVar;
            }
        } else {
            if (i9 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            com.google.common.util.concurrent.P.u0(obj);
        }
        return p070h6.A.f22523a;
    }

    public java.lang.String toString() {
        return "SSO";
    }
}
