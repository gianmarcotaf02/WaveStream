package io.github.jan.supabase.auth.mfa;

/* JADX INFO: loaded from: classes4.dex */
@kotlin.Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u0000*\u0004\b\u0000\u0010\u0001*\u0004\b\u0001\u0010\u00022\u00020\u0003:\u0002\u0014\u0015B\u0011\b\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J$\u0010\f\u001a\u00020\u000b2\u0012\u0010\n\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\t0\bH§@¢\u0006\u0004\b\f\u0010\rJ\u0018\u0010\u000f\u001a\u00028\u00012\u0006\u0010\u000e\u001a\u00020\u000bH§@¢\u0006\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013\u0082\u0001\u0002\u0016\u0017¨\u0006\u0018"}, d2 = {"Lio/github/jan/supabase/auth/mfa/FactorType;", "Config", "Response", "", "", "value", "<init>", "(Ljava/lang/String;)V", "Lkotlin/Function1;", "Lh6/A;", "config", "Lkotlinx/serialization/json/c;", "encodeConfig", "(Lx6/j;Ll6/c;)Ljava/lang/Object;", "json", "decodeResponse", "(Lkotlinx/serialization/json/c;Ll6/c;)Ljava/lang/Object;", "Ljava/lang/String;", "getValue", "()Ljava/lang/String;", "TOTP", "Phone", "Lio/github/jan/supabase/auth/mfa/FactorType$Phone;", "Lio/github/jan/supabase/auth/mfa/FactorType$TOTP;", "auth-kt_release"}, k = 1, mv = {2, 1, 0}, xi = androidx.media3.container.NalUnitUtil.H265_NAL_UNIT_TYPE_UNSPECIFIED)
public abstract class FactorType<Config, Response> {
    private final java.lang.String value;

    @kotlin.Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\bÆ\n\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0002\u001a\u001bB\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0018\u0010\b\u001a\u00020\u00032\u0006\u0010\u0007\u001a\u00020\u0006H\u0096@¢\u0006\u0004\b\b\u0010\tJ$\u0010\r\u001a\u00020\u00062\u0012\u0010\f\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u000b0\nH\u0096@¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0013\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u001a\u0010\u0018\u001a\u00020\u00172\b\u0010\u0016\u001a\u0004\u0018\u00010\u0015HÖ\u0003¢\u0006\u0004\b\u0018\u0010\u0019¨\u0006\u001c"}, d2 = {"Lio/github/jan/supabase/auth/mfa/FactorType$Phone;", "Lio/github/jan/supabase/auth/mfa/FactorType;", "Lio/github/jan/supabase/auth/mfa/FactorType$Phone$Config;", "Lio/github/jan/supabase/auth/mfa/FactorType$Phone$Response;", "<init>", "()V", "Lkotlinx/serialization/json/c;", "json", "decodeResponse", "(Lkotlinx/serialization/json/c;Ll6/c;)Ljava/lang/Object;", "Lkotlin/Function1;", "Lh6/A;", "config", "encodeConfig", "(Lx6/j;Ll6/c;)Ljava/lang/Object;", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", io.sentry.protocol.Request.JsonKeys.OTHER, "", "equals", "(Ljava/lang/Object;)Z", "Response", "Config", "auth-kt_release"}, k = 1, mv = {2, 1, 0}, xi = androidx.media3.container.NalUnitUtil.H265_NAL_UNIT_TYPE_UNSPECIFIED)
    public static final /* data */ class Phone extends io.github.jan.supabase.auth.mfa.FactorType<io.github.jan.supabase.auth.mfa.FactorType.Phone.Config, io.github.jan.supabase.auth.mfa.FactorType.Phone.Response> {
        public static final io.github.jan.supabase.auth.mfa.FactorType.Phone INSTANCE = new io.github.jan.supabase.auth.mfa.FactorType.Phone();

        @kotlin.Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\u000b\n\u0002\b\b\b\u0087\b\u0018\u0000 \"2\u00020\u0001:\u0002#\"B\u0013\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0004\u0010\u0005B%\b\u0010\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\u0004\u0010\nJ'\u0010\u0013\u001a\u00020\u00102\u0006\u0010\u000b\u001a\u00020\u00002\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\u000eH\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u0012\u0010\u0014\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0014\u0010\u0015J\u001c\u0010\u0016\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002HÆ\u0001¢\u0006\u0004\b\u0016\u0010\u0017J\u0010\u0010\u0018\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0018\u0010\u0015J\u0010\u0010\u0019\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0019\u0010\u001aJ\u001a\u0010\u001d\u001a\u00020\u001c2\b\u0010\u001b\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u001d\u0010\u001eR$\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0003\u0010\u001f\u001a\u0004\b \u0010\u0015\"\u0004\b!\u0010\u0005¨\u0006$"}, d2 = {"Lio/github/jan/supabase/auth/mfa/FactorType$Phone$Config;", "", "", "phone", "<init>", "(Ljava/lang/String;)V", "", "seen0", "Lr8/k0;", "serializationConstructorMarker", "(ILjava/lang/String;Lr8/k0;)V", "self", "Lq8/b;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "Lh6/A;", "write$Self$auth_kt_release", "(Lio/github/jan/supabase/auth/mfa/FactorType$Phone$Config;Lq8/b;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "write$Self", "component1", "()Ljava/lang/String;", "copy", "(Ljava/lang/String;)Lio/github/jan/supabase/auth/mfa/FactorType$Phone$Config;", "toString", "hashCode", "()I", io.sentry.protocol.Request.JsonKeys.OTHER, "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getPhone", "setPhone", "Companion", "$serializer", "auth-kt_release"}, k = 1, mv = {2, 1, 0}, xi = androidx.media3.container.NalUnitUtil.H265_NAL_UNIT_TYPE_UNSPECIFIED)
        @p119n8.i
        public static final /* data */ class Config {

            /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
            public static final io.github.jan.supabase.auth.mfa.FactorType.Phone.Config.Companion INSTANCE = new io.github.jan.supabase.auth.mfa.FactorType.Phone.Config.Companion(null);
            private java.lang.String phone;

            @kotlin.Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¨\u0006\u0007"}, d2 = {"Lio/github/jan/supabase/auth/mfa/FactorType$Phone$Config$Companion;", "", "<init>", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lio/github/jan/supabase/auth/mfa/FactorType$Phone$Config;", "auth-kt_release"}, k = 1, mv = {2, 1, 0}, xi = androidx.media3.container.NalUnitUtil.H265_NAL_UNIT_TYPE_UNSPECIFIED)
            public static final class Companion {
                private Companion() {
                }

                public final kotlinx.serialization.KSerializer serializer() {
                    return io.github.jan.supabase.auth.mfa.FactorType$Phone$Config$$serializer.INSTANCE;
                }

                public /* synthetic */ Companion(kotlin.jvm.internal.AbstractC2541f abstractC2541f) {
                    this();
                }
            }

            /* JADX WARN: Multi-variable type inference failed */
            public Config() {
                this((java.lang.String) null, 1, (kotlin.jvm.internal.AbstractC2541f) (0 == true ? 1 : 0));
            }

            public static /* synthetic */ io.github.jan.supabase.auth.mfa.FactorType.Phone.Config copy$default(io.github.jan.supabase.auth.mfa.FactorType.Phone.Config config, java.lang.String str, int i3, java.lang.Object obj) {
                if ((i3 & 1) != 0) {
                    str = config.phone;
                }
                return config.copy(str);
            }

            public static final /* synthetic */ void write$Self$auth_kt_release(io.github.jan.supabase.auth.mfa.FactorType.Phone.Config self, p143q8.b output, kotlinx.serialization.descriptors.SerialDescriptor serialDesc) {
                if (!output.E(serialDesc) && self.phone == null) {
                    return;
                }
                output.t(serialDesc, 0, p153r8.p0.f26988a, self.phone);
            }

            /* JADX INFO: renamed from: component1, reason: from getter */
            public final java.lang.String getPhone() {
                return this.phone;
            }

            public final io.github.jan.supabase.auth.mfa.FactorType.Phone.Config copy(java.lang.String phone) {
                return new io.github.jan.supabase.auth.mfa.FactorType.Phone.Config(phone);
            }

            public boolean equals(java.lang.Object other) {
                if (this == other) {
                    return true;
                }
                return (other instanceof io.github.jan.supabase.auth.mfa.FactorType.Phone.Config) && kotlin.jvm.internal.m.a(this.phone, ((io.github.jan.supabase.auth.mfa.FactorType.Phone.Config) other).phone);
            }

            public final java.lang.String getPhone() {
                return this.phone;
            }

            public int hashCode() {
                java.lang.String str = this.phone;
                if (str == null) {
                    return 0;
                }
                return str.hashCode();
            }

            public final void setPhone(java.lang.String str) {
                this.phone = str;
            }

            public java.lang.String toString() {
                return Y6.f.l(new java.lang.StringBuilder("Config(phone="), this.phone, ')');
            }

            public /* synthetic */ Config(int i3, java.lang.String str, p153r8.k0 k0Var) {
                if ((i3 & 1) == 0) {
                    this.phone = null;
                } else {
                    this.phone = str;
                }
            }

            public Config(java.lang.String str) {
                this.phone = str;
            }

            public /* synthetic */ Config(java.lang.String str, int i3, kotlin.jvm.internal.AbstractC2541f abstractC2541f) {
                this((i3 & 1) != 0 ? null : str);
            }
        }

        @kotlin.Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\u000b\n\u0002\b\u0007\b\u0087\b\u0018\u0000 !2\u00020\u0001:\u0002\"!B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005B%\b\u0010\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\u0004\u0010\nJ'\u0010\u0013\u001a\u00020\u00102\u0006\u0010\u000b\u001a\u00020\u00002\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\u000eH\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0014\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0014\u0010\u0015J\u001a\u0010\u0016\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\u0016\u0010\u0017J\u0010\u0010\u0018\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0018\u0010\u0015J\u0010\u0010\u0019\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0019\u0010\u001aJ\u001a\u0010\u001d\u001a\u00020\u001c2\b\u0010\u001b\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u001d\u0010\u001eR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u001f\u001a\u0004\b \u0010\u0015¨\u0006#"}, d2 = {"Lio/github/jan/supabase/auth/mfa/FactorType$Phone$Response;", "", "", "phone", "<init>", "(Ljava/lang/String;)V", "", "seen0", "Lr8/k0;", "serializationConstructorMarker", "(ILjava/lang/String;Lr8/k0;)V", "self", "Lq8/b;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "Lh6/A;", "write$Self$auth_kt_release", "(Lio/github/jan/supabase/auth/mfa/FactorType$Phone$Response;Lq8/b;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "write$Self", "component1", "()Ljava/lang/String;", "copy", "(Ljava/lang/String;)Lio/github/jan/supabase/auth/mfa/FactorType$Phone$Response;", "toString", "hashCode", "()I", io.sentry.protocol.Request.JsonKeys.OTHER, "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getPhone", "Companion", "$serializer", "auth-kt_release"}, k = 1, mv = {2, 1, 0}, xi = androidx.media3.container.NalUnitUtil.H265_NAL_UNIT_TYPE_UNSPECIFIED)
        @p119n8.i
        public static final /* data */ class Response {

            /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
            public static final io.github.jan.supabase.auth.mfa.FactorType.Phone.Response.Companion INSTANCE = new io.github.jan.supabase.auth.mfa.FactorType.Phone.Response.Companion(null);
            private final java.lang.String phone;

            @kotlin.Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¨\u0006\u0007"}, d2 = {"Lio/github/jan/supabase/auth/mfa/FactorType$Phone$Response$Companion;", "", "<init>", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lio/github/jan/supabase/auth/mfa/FactorType$Phone$Response;", "auth-kt_release"}, k = 1, mv = {2, 1, 0}, xi = androidx.media3.container.NalUnitUtil.H265_NAL_UNIT_TYPE_UNSPECIFIED)
            public static final class Companion {
                private Companion() {
                }

                public final kotlinx.serialization.KSerializer serializer() {
                    return io.github.jan.supabase.auth.mfa.FactorType$Phone$Response$$serializer.INSTANCE;
                }

                public /* synthetic */ Companion(kotlin.jvm.internal.AbstractC2541f abstractC2541f) {
                    this();
                }
            }

            public /* synthetic */ Response(int i3, java.lang.String str, p153r8.k0 k0Var) {
                if (1 == (i3 & 1)) {
                    this.phone = str;
                } else {
                    p153r8.AbstractC2686a0.l(i3, 1, io.github.jan.supabase.auth.mfa.FactorType$Phone$Response$$serializer.INSTANCE.getDescriptor());
                    throw null;
                }
            }

            public static /* synthetic */ io.github.jan.supabase.auth.mfa.FactorType.Phone.Response copy$default(io.github.jan.supabase.auth.mfa.FactorType.Phone.Response response, java.lang.String str, int i3, java.lang.Object obj) {
                if ((i3 & 1) != 0) {
                    str = response.phone;
                }
                return response.copy(str);
            }

            /* JADX INFO: renamed from: component1, reason: from getter */
            public final java.lang.String getPhone() {
                return this.phone;
            }

            public final io.github.jan.supabase.auth.mfa.FactorType.Phone.Response copy(java.lang.String phone) {
                kotlin.jvm.internal.m.e(phone, "phone");
                return new io.github.jan.supabase.auth.mfa.FactorType.Phone.Response(phone);
            }

            public boolean equals(java.lang.Object other) {
                if (this == other) {
                    return true;
                }
                return (other instanceof io.github.jan.supabase.auth.mfa.FactorType.Phone.Response) && kotlin.jvm.internal.m.a(this.phone, ((io.github.jan.supabase.auth.mfa.FactorType.Phone.Response) other).phone);
            }

            public final java.lang.String getPhone() {
                return this.phone;
            }

            public int hashCode() {
                return this.phone.hashCode();
            }

            public java.lang.String toString() {
                return Y6.f.l(new java.lang.StringBuilder("Response(phone="), this.phone, ')');
            }

            public Response(java.lang.String phone) {
                kotlin.jvm.internal.m.e(phone, "phone");
                this.phone = phone;
            }
        }

        private Phone() {
            super("phone", null);
        }

        @Override // io.github.jan.supabase.auth.mfa.FactorType
        public java.lang.Object decodeResponse(kotlinx.serialization.json.c cVar, p100l6.c cVar2) {
            java.lang.String strF;
            kotlinx.serialization.json.b bVar = (kotlinx.serialization.json.b) cVar.get("phone");
            if (bVar == null || (strF = p162s8.l.f(p162s8.l.j(bVar))) == null) {
                throw new java.lang.IllegalStateException("No 'phone' entry found in factor response");
            }
            return new io.github.jan.supabase.auth.mfa.FactorType.Phone.Response(strF);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // io.github.jan.supabase.auth.mfa.FactorType
        public java.lang.Object encodeConfig(p194x6.j jVar, p100l6.c cVar) {
            p162s8.d supabaseJson = io.github.jan.supabase.UtilsKt.getSupabaseJson();
            io.github.jan.supabase.auth.mfa.FactorType.Phone.Config config = new io.github.jan.supabase.auth.mfa.FactorType.Phone.Config((java.lang.String) null, 1, (kotlin.jvm.internal.AbstractC2541f) (0 == true ? 1 : 0));
            jVar.invoke(config);
            supabaseJson.getClass();
            return p162s8.l.i(supabaseJson.c(io.github.jan.supabase.auth.mfa.FactorType.Phone.Config.INSTANCE.serializer(), config));
        }

        public boolean equals(java.lang.Object other) {
            return this == other || (other instanceof io.github.jan.supabase.auth.mfa.FactorType.Phone);
        }

        public int hashCode() {
            return 1929459909;
        }

        public java.lang.String toString() {
            return "Phone";
        }
    }

    @kotlin.Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\bÆ\n\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0002\u001a\u001bB\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0018\u0010\b\u001a\u00020\u00032\u0006\u0010\u0007\u001a\u00020\u0006H\u0096@¢\u0006\u0004\b\b\u0010\tJ$\u0010\r\u001a\u00020\u00062\u0012\u0010\f\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u000b0\nH\u0096@¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0013\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u001a\u0010\u0018\u001a\u00020\u00172\b\u0010\u0016\u001a\u0004\u0018\u00010\u0015HÖ\u0003¢\u0006\u0004\b\u0018\u0010\u0019¨\u0006\u001c"}, d2 = {"Lio/github/jan/supabase/auth/mfa/FactorType$TOTP;", "Lio/github/jan/supabase/auth/mfa/FactorType;", "Lio/github/jan/supabase/auth/mfa/FactorType$TOTP$Config;", "Lio/github/jan/supabase/auth/mfa/FactorType$TOTP$Response;", "<init>", "()V", "Lkotlinx/serialization/json/c;", "json", "decodeResponse", "(Lkotlinx/serialization/json/c;Ll6/c;)Ljava/lang/Object;", "Lkotlin/Function1;", "Lh6/A;", "config", "encodeConfig", "(Lx6/j;Ll6/c;)Ljava/lang/Object;", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", io.sentry.protocol.Request.JsonKeys.OTHER, "", "equals", "(Ljava/lang/Object;)Z", "Response", "Config", "auth-kt_release"}, k = 1, mv = {2, 1, 0}, xi = androidx.media3.container.NalUnitUtil.H265_NAL_UNIT_TYPE_UNSPECIFIED)
    public static final /* data */ class TOTP extends io.github.jan.supabase.auth.mfa.FactorType<io.github.jan.supabase.auth.mfa.FactorType.TOTP.Config, io.github.jan.supabase.auth.mfa.FactorType.TOTP.Response> {
        public static final io.github.jan.supabase.auth.mfa.FactorType.TOTP INSTANCE = new io.github.jan.supabase.auth.mfa.FactorType.TOTP();

        @kotlin.Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\u000b\n\u0002\b\b\b\u0087\b\u0018\u0000 \"2\u00020\u0001:\u0002#\"B\u0013\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0004\u0010\u0005B%\b\u0010\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\u0004\u0010\nJ'\u0010\u0013\u001a\u00020\u00102\u0006\u0010\u000b\u001a\u00020\u00002\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\u000eH\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u0012\u0010\u0014\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0014\u0010\u0015J\u001c\u0010\u0016\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002HÆ\u0001¢\u0006\u0004\b\u0016\u0010\u0017J\u0010\u0010\u0018\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0018\u0010\u0015J\u0010\u0010\u0019\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0019\u0010\u001aJ\u001a\u0010\u001d\u001a\u00020\u001c2\b\u0010\u001b\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u001d\u0010\u001eR$\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0003\u0010\u001f\u001a\u0004\b \u0010\u0015\"\u0004\b!\u0010\u0005¨\u0006$"}, d2 = {"Lio/github/jan/supabase/auth/mfa/FactorType$TOTP$Config;", "", "", "issuer", "<init>", "(Ljava/lang/String;)V", "", "seen0", "Lr8/k0;", "serializationConstructorMarker", "(ILjava/lang/String;Lr8/k0;)V", "self", "Lq8/b;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "Lh6/A;", "write$Self$auth_kt_release", "(Lio/github/jan/supabase/auth/mfa/FactorType$TOTP$Config;Lq8/b;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "write$Self", "component1", "()Ljava/lang/String;", "copy", "(Ljava/lang/String;)Lio/github/jan/supabase/auth/mfa/FactorType$TOTP$Config;", "toString", "hashCode", "()I", io.sentry.protocol.Request.JsonKeys.OTHER, "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getIssuer", "setIssuer", "Companion", "$serializer", "auth-kt_release"}, k = 1, mv = {2, 1, 0}, xi = androidx.media3.container.NalUnitUtil.H265_NAL_UNIT_TYPE_UNSPECIFIED)
        @p119n8.i
        public static final /* data */ class Config {

            /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
            public static final io.github.jan.supabase.auth.mfa.FactorType.TOTP.Config.Companion INSTANCE = new io.github.jan.supabase.auth.mfa.FactorType.TOTP.Config.Companion(null);
            private java.lang.String issuer;

            @kotlin.Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¨\u0006\u0007"}, d2 = {"Lio/github/jan/supabase/auth/mfa/FactorType$TOTP$Config$Companion;", "", "<init>", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lio/github/jan/supabase/auth/mfa/FactorType$TOTP$Config;", "auth-kt_release"}, k = 1, mv = {2, 1, 0}, xi = androidx.media3.container.NalUnitUtil.H265_NAL_UNIT_TYPE_UNSPECIFIED)
            public static final class Companion {
                private Companion() {
                }

                public final kotlinx.serialization.KSerializer serializer() {
                    return io.github.jan.supabase.auth.mfa.FactorType$TOTP$Config$$serializer.INSTANCE;
                }

                public /* synthetic */ Companion(kotlin.jvm.internal.AbstractC2541f abstractC2541f) {
                    this();
                }
            }

            /* JADX WARN: Multi-variable type inference failed */
            public Config() {
                this((java.lang.String) null, 1, (kotlin.jvm.internal.AbstractC2541f) (0 == true ? 1 : 0));
            }

            public static /* synthetic */ io.github.jan.supabase.auth.mfa.FactorType.TOTP.Config copy$default(io.github.jan.supabase.auth.mfa.FactorType.TOTP.Config config, java.lang.String str, int i3, java.lang.Object obj) {
                if ((i3 & 1) != 0) {
                    str = config.issuer;
                }
                return config.copy(str);
            }

            public static final /* synthetic */ void write$Self$auth_kt_release(io.github.jan.supabase.auth.mfa.FactorType.TOTP.Config self, p143q8.b output, kotlinx.serialization.descriptors.SerialDescriptor serialDesc) {
                if (!output.E(serialDesc) && self.issuer == null) {
                    return;
                }
                output.t(serialDesc, 0, p153r8.p0.f26988a, self.issuer);
            }

            /* JADX INFO: renamed from: component1, reason: from getter */
            public final java.lang.String getIssuer() {
                return this.issuer;
            }

            public final io.github.jan.supabase.auth.mfa.FactorType.TOTP.Config copy(java.lang.String issuer) {
                return new io.github.jan.supabase.auth.mfa.FactorType.TOTP.Config(issuer);
            }

            public boolean equals(java.lang.Object other) {
                if (this == other) {
                    return true;
                }
                return (other instanceof io.github.jan.supabase.auth.mfa.FactorType.TOTP.Config) && kotlin.jvm.internal.m.a(this.issuer, ((io.github.jan.supabase.auth.mfa.FactorType.TOTP.Config) other).issuer);
            }

            public final java.lang.String getIssuer() {
                return this.issuer;
            }

            public int hashCode() {
                java.lang.String str = this.issuer;
                if (str == null) {
                    return 0;
                }
                return str.hashCode();
            }

            public final void setIssuer(java.lang.String str) {
                this.issuer = str;
            }

            public java.lang.String toString() {
                return Y6.f.l(new java.lang.StringBuilder("Config(issuer="), this.issuer, ')');
            }

            public /* synthetic */ Config(int i3, java.lang.String str, p153r8.k0 k0Var) {
                if ((i3 & 1) == 0) {
                    this.issuer = null;
                } else {
                    this.issuer = str;
                }
            }

            public Config(java.lang.String str) {
                this.issuer = str;
            }

            public /* synthetic */ Config(java.lang.String str, int i3, kotlin.jvm.internal.AbstractC2541f abstractC2541f) {
                this((i3 & 1) != 0 ? null : str);
            }
        }

        @kotlin.Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\u000b\n\u0002\b\u000b\b\u0087\b\u0018\u0000 )2\u00020\u0001:\u0002*)B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002¢\u0006\u0004\b\u0006\u0010\u0007B9\b\u0010\u0012\u0006\u0010\t\u001a\u00020\b\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\n¢\u0006\u0004\b\u0006\u0010\fJ'\u0010\u0015\u001a\u00020\u00122\u0006\u0010\r\u001a\u00020\u00002\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0011\u001a\u00020\u0010H\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0016\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0016\u0010\u0017J\u0010\u0010\u0018\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0018\u0010\u0017J\u0010\u0010\u0019\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0019\u0010\u0017J.\u0010\u001a\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\u001a\u0010\u001bJ\u0010\u0010\u001c\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u001c\u0010\u0017J\u0010\u0010\u001d\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\u001d\u0010\u001eJ\u001a\u0010!\u001a\u00020 2\b\u0010\u001f\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b!\u0010\"R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010#\u001a\u0004\b$\u0010\u0017R \u0010\u0004\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0004\u0010#\u0012\u0004\b&\u0010'\u001a\u0004\b%\u0010\u0017R\u0017\u0010\u0005\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0005\u0010#\u001a\u0004\b(\u0010\u0017¨\u0006+"}, d2 = {"Lio/github/jan/supabase/auth/mfa/FactorType$TOTP$Response;", "", "", "secret", "qrCode", "uri", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "", "seen0", "Lr8/k0;", "serializationConstructorMarker", "(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Lr8/k0;)V", "self", "Lq8/b;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "Lh6/A;", "write$Self$auth_kt_release", "(Lio/github/jan/supabase/auth/mfa/FactorType$TOTP$Response;Lq8/b;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "write$Self", "component1", "()Ljava/lang/String;", "component2", "component3", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lio/github/jan/supabase/auth/mfa/FactorType$TOTP$Response;", "toString", "hashCode", "()I", io.sentry.protocol.Request.JsonKeys.OTHER, "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getSecret", "getQrCode", "getQrCode$annotations", "()V", "getUri", "Companion", "$serializer", "auth-kt_release"}, k = 1, mv = {2, 1, 0}, xi = androidx.media3.container.NalUnitUtil.H265_NAL_UNIT_TYPE_UNSPECIFIED)
        @p119n8.i
        public static final /* data */ class Response {

            /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
            public static final io.github.jan.supabase.auth.mfa.FactorType.TOTP.Response.Companion INSTANCE = new io.github.jan.supabase.auth.mfa.FactorType.TOTP.Response.Companion(null);
            private final java.lang.String qrCode;
            private final java.lang.String secret;
            private final java.lang.String uri;

            @kotlin.Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¨\u0006\u0007"}, d2 = {"Lio/github/jan/supabase/auth/mfa/FactorType$TOTP$Response$Companion;", "", "<init>", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lio/github/jan/supabase/auth/mfa/FactorType$TOTP$Response;", "auth-kt_release"}, k = 1, mv = {2, 1, 0}, xi = androidx.media3.container.NalUnitUtil.H265_NAL_UNIT_TYPE_UNSPECIFIED)
            public static final class Companion {
                private Companion() {
                }

                public final kotlinx.serialization.KSerializer serializer() {
                    return io.github.jan.supabase.auth.mfa.FactorType$TOTP$Response$$serializer.INSTANCE;
                }

                public /* synthetic */ Companion(kotlin.jvm.internal.AbstractC2541f abstractC2541f) {
                    this();
                }
            }

            public /* synthetic */ Response(int i3, java.lang.String str, java.lang.String str2, java.lang.String str3, p153r8.k0 k0Var) {
                if (7 != (i3 & 7)) {
                    p153r8.AbstractC2686a0.l(i3, 7, io.github.jan.supabase.auth.mfa.FactorType$TOTP$Response$$serializer.INSTANCE.getDescriptor());
                    throw null;
                }
                this.secret = str;
                this.qrCode = str2;
                this.uri = str3;
            }

            public static /* synthetic */ io.github.jan.supabase.auth.mfa.FactorType.TOTP.Response copy$default(io.github.jan.supabase.auth.mfa.FactorType.TOTP.Response response, java.lang.String str, java.lang.String str2, java.lang.String str3, int i3, java.lang.Object obj) {
                if ((i3 & 1) != 0) {
                    str = response.secret;
                }
                if ((i3 & 2) != 0) {
                    str2 = response.qrCode;
                }
                if ((i3 & 4) != 0) {
                    str3 = response.uri;
                }
                return response.copy(str, str2, str3);
            }

            @p119n8.h("qr_code")
            public static /* synthetic */ void getQrCode$annotations() {
            }

            public static final /* synthetic */ void write$Self$auth_kt_release(io.github.jan.supabase.auth.mfa.FactorType.TOTP.Response self, p143q8.b output, kotlinx.serialization.descriptors.SerialDescriptor serialDesc) {
                output.s(serialDesc, 0, self.secret);
                output.s(serialDesc, 1, self.qrCode);
                output.s(serialDesc, 2, self.uri);
            }

            /* JADX INFO: renamed from: component1, reason: from getter */
            public final java.lang.String getSecret() {
                return this.secret;
            }

            /* JADX INFO: renamed from: component2, reason: from getter */
            public final java.lang.String getQrCode() {
                return this.qrCode;
            }

            /* JADX INFO: renamed from: component3, reason: from getter */
            public final java.lang.String getUri() {
                return this.uri;
            }

            public final io.github.jan.supabase.auth.mfa.FactorType.TOTP.Response copy(java.lang.String secret, java.lang.String qrCode, java.lang.String uri) {
                kotlin.jvm.internal.m.e(secret, "secret");
                kotlin.jvm.internal.m.e(qrCode, "qrCode");
                kotlin.jvm.internal.m.e(uri, "uri");
                return new io.github.jan.supabase.auth.mfa.FactorType.TOTP.Response(secret, qrCode, uri);
            }

            public boolean equals(java.lang.Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof io.github.jan.supabase.auth.mfa.FactorType.TOTP.Response)) {
                    return false;
                }
                io.github.jan.supabase.auth.mfa.FactorType.TOTP.Response response = (io.github.jan.supabase.auth.mfa.FactorType.TOTP.Response) other;
                return kotlin.jvm.internal.m.a(this.secret, response.secret) && kotlin.jvm.internal.m.a(this.qrCode, response.qrCode) && kotlin.jvm.internal.m.a(this.uri, response.uri);
            }

            public final java.lang.String getQrCode() {
                return this.qrCode;
            }

            public final java.lang.String getSecret() {
                return this.secret;
            }

            public final java.lang.String getUri() {
                return this.uri;
            }

            public int hashCode() {
                return this.uri.hashCode() + B2.a.a(this.secret.hashCode() * 31, 31, this.qrCode);
            }

            public java.lang.String toString() {
                java.lang.StringBuilder sb = new java.lang.StringBuilder("Response(secret=");
                sb.append(this.secret);
                sb.append(", qrCode=");
                sb.append(this.qrCode);
                sb.append(", uri=");
                return Y6.f.l(sb, this.uri, ')');
            }

            public Response(java.lang.String secret, java.lang.String qrCode, java.lang.String uri) {
                kotlin.jvm.internal.m.e(secret, "secret");
                kotlin.jvm.internal.m.e(qrCode, "qrCode");
                kotlin.jvm.internal.m.e(uri, "uri");
                this.secret = secret;
                this.qrCode = qrCode;
                this.uri = uri;
            }
        }

        private TOTP() {
            super("totp", null);
        }

        @Override // io.github.jan.supabase.auth.mfa.FactorType
        public java.lang.Object decodeResponse(kotlinx.serialization.json.c cVar, p100l6.c cVar2) {
            p162s8.d supabaseJson = io.github.jan.supabase.UtilsKt.getSupabaseJson();
            kotlinx.serialization.json.b bVar = (kotlinx.serialization.json.b) cVar.get("totp");
            if (bVar == null) {
                throw new java.lang.IllegalStateException("No 'totp' object found in factor response");
            }
            kotlinx.serialization.json.c cVarI = p162s8.l.i(bVar);
            supabaseJson.getClass();
            return supabaseJson.a(io.github.jan.supabase.auth.mfa.FactorType.TOTP.Response.INSTANCE.serializer(), cVarI);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // io.github.jan.supabase.auth.mfa.FactorType
        public java.lang.Object encodeConfig(p194x6.j jVar, p100l6.c cVar) {
            p162s8.d supabaseJson = io.github.jan.supabase.UtilsKt.getSupabaseJson();
            io.github.jan.supabase.auth.mfa.FactorType.TOTP.Config config = new io.github.jan.supabase.auth.mfa.FactorType.TOTP.Config((java.lang.String) null, 1, (kotlin.jvm.internal.AbstractC2541f) (0 == true ? 1 : 0));
            jVar.invoke(config);
            supabaseJson.getClass();
            return p162s8.l.i(supabaseJson.c(io.github.jan.supabase.auth.mfa.FactorType.TOTP.Config.INSTANCE.serializer(), config));
        }

        public boolean equals(java.lang.Object other) {
            return this == other || (other instanceof io.github.jan.supabase.auth.mfa.FactorType.TOTP);
        }

        public int hashCode() {
            return 1170713568;
        }

        public java.lang.String toString() {
            return "TOTP";
        }
    }

    public /* synthetic */ FactorType(java.lang.String str, kotlin.jvm.internal.AbstractC2541f abstractC2541f) {
        this(str);
    }

    @io.github.jan.supabase.annotations.SupabaseInternal
    public abstract java.lang.Object decodeResponse(kotlinx.serialization.json.c cVar, p100l6.c cVar2);

    @io.github.jan.supabase.annotations.SupabaseInternal
    public abstract java.lang.Object encodeConfig(p194x6.j jVar, p100l6.c cVar);

    public final java.lang.String getValue() {
        return this.value;
    }

    private FactorType(java.lang.String str) {
        this.value = str;
    }
}
