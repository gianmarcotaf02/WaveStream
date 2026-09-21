package io.github.jan.supabase.auth.admin;

/* JADX INFO: loaded from: classes4.dex */
@kotlin.Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u0000*\b\b\u0000\u0010\u0002*\u00020\u00012\u00020\u0003:\u0007\r\u000e\u000f\u0010\u0011\u0012\u0013J#\u0010\u0007\u001a\u00028\u00002\u0012\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u00050\u0004H'¢\u0006\u0004\b\u0007\u0010\bR\u0014\u0010\f\u001a\u00020\t8&X¦\u0004¢\u0006\u0006\u001a\u0004\b\n\u0010\u000b\u0082\u0001\u0006\u0014\u0015\u0016\u0017\u0018\u0019¨\u0006\u001a"}, d2 = {"Lio/github/jan/supabase/auth/admin/LinkType;", "Lio/github/jan/supabase/auth/admin/LinkType$Config;", "C", "", "Lkotlin/Function1;", "Lh6/A;", "config", "createConfig", "(Lx6/j;)Lio/github/jan/supabase/auth/admin/LinkType$Config;", "", "getType", "()Ljava/lang/String;", "type", "Config", "Signup", "Invite", "MagicLink", "RecoveryLink", "EmailChangeCurrent", "EmailChangeNew", "Lio/github/jan/supabase/auth/admin/LinkType$EmailChangeCurrent;", "Lio/github/jan/supabase/auth/admin/LinkType$EmailChangeNew;", "Lio/github/jan/supabase/auth/admin/LinkType$Invite;", "Lio/github/jan/supabase/auth/admin/LinkType$MagicLink;", "Lio/github/jan/supabase/auth/admin/LinkType$RecoveryLink;", "Lio/github/jan/supabase/auth/admin/LinkType$Signup;", "auth-kt_release"}, k = 1, mv = {2, 1, 0}, xi = androidx.media3.container.NalUnitUtil.H265_NAL_UNIT_TYPE_UNSPECIFIED)
public interface LinkType<C extends io.github.jan.supabase.auth.admin.LinkType.Config> {

    @kotlin.Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0007\bÆ\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0018B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J#\u0010\b\u001a\u00020\u00022\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00060\u0005H\u0017¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000b\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\u000e\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u001a\u0010\u0013\u001a\u00020\u00122\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010HÖ\u0003¢\u0006\u0004\b\u0013\u0010\u0014R\u001a\u0010\u0015\u001a\u00020\n8\u0016X\u0096D¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0017\u0010\f¨\u0006\u0019"}, d2 = {"Lio/github/jan/supabase/auth/admin/LinkType$EmailChangeCurrent;", "Lio/github/jan/supabase/auth/admin/LinkType;", "Lio/github/jan/supabase/auth/admin/LinkType$EmailChangeCurrent$Config;", "<init>", "()V", "Lkotlin/Function1;", "Lh6/A;", "config", "createConfig", "(Lx6/j;)Lio/github/jan/supabase/auth/admin/LinkType$EmailChangeCurrent$Config;", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", io.sentry.protocol.Request.JsonKeys.OTHER, "", "equals", "(Ljava/lang/Object;)Z", "type", "Ljava/lang/String;", "getType", "Config", "auth-kt_release"}, k = 1, mv = {2, 1, 0}, xi = androidx.media3.container.NalUnitUtil.H265_NAL_UNIT_TYPE_UNSPECIFIED)
    public static final /* data */ class EmailChangeCurrent implements io.github.jan.supabase.auth.admin.LinkType<io.github.jan.supabase.auth.admin.LinkType.EmailChangeCurrent.Config> {
        public static final io.github.jan.supabase.auth.admin.LinkType.EmailChangeCurrent INSTANCE = new io.github.jan.supabase.auth.admin.LinkType.EmailChangeCurrent();
        private static final java.lang.String type = "email_change_current";

        @kotlin.Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\n\b\u0087\b\u0018\u0000 &2\u00020\u0001:\u0002'&B\u0011\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005B/\b\u0010\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\n\u001a\u0004\u0018\u00010\t¢\u0006\u0004\b\u0004\u0010\u000bJ'\u0010\u0014\u001a\u00020\u00112\u0006\u0010\f\u001a\u00020\u00002\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0010\u001a\u00020\u000fH\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0015\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0015\u0010\u0016J\u001a\u0010\u0017\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\u0017\u0010\u0018J\u0010\u0010\u0019\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0019\u0010\u0016J\u0010\u0010\u001a\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u001a\u0010\u001bJ\u001a\u0010\u001f\u001a\u00020\u001e2\b\u0010\u001d\u001a\u0004\u0018\u00010\u001cHÖ\u0003¢\u0006\u0004\b\u001f\u0010 R(\u0010\u0003\u001a\u00020\u00028\u0006@\u0006X\u0087\u000e¢\u0006\u0018\n\u0004\b\u0003\u0010!\u0012\u0004\b$\u0010%\u001a\u0004\b\"\u0010\u0016\"\u0004\b#\u0010\u0005¨\u0006("}, d2 = {"Lio/github/jan/supabase/auth/admin/LinkType$EmailChangeCurrent$Config;", "Lio/github/jan/supabase/auth/admin/LinkType$Config;", "", "newEmail", "<init>", "(Ljava/lang/String;)V", "", "seen0", "email", "Lr8/k0;", "serializationConstructorMarker", "(ILjava/lang/String;Ljava/lang/String;Lr8/k0;)V", "self", "Lq8/b;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "Lh6/A;", "write$Self$auth_kt_release", "(Lio/github/jan/supabase/auth/admin/LinkType$EmailChangeCurrent$Config;Lq8/b;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "write$Self", "component1", "()Ljava/lang/String;", "copy", "(Ljava/lang/String;)Lio/github/jan/supabase/auth/admin/LinkType$EmailChangeCurrent$Config;", "toString", "hashCode", "()I", "", io.sentry.protocol.Request.JsonKeys.OTHER, "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getNewEmail", "setNewEmail", "getNewEmail$annotations", "()V", "Companion", "$serializer", "auth-kt_release"}, k = 1, mv = {2, 1, 0}, xi = androidx.media3.container.NalUnitUtil.H265_NAL_UNIT_TYPE_UNSPECIFIED)
        @p119n8.i
        public static final /* data */ class Config extends io.github.jan.supabase.auth.admin.LinkType.Config {

            /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
            public static final io.github.jan.supabase.auth.admin.LinkType.EmailChangeCurrent.Config.Companion INSTANCE = new io.github.jan.supabase.auth.admin.LinkType.EmailChangeCurrent.Config.Companion(null);
            private java.lang.String newEmail;

            @kotlin.Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¨\u0006\u0007"}, d2 = {"Lio/github/jan/supabase/auth/admin/LinkType$EmailChangeCurrent$Config$Companion;", "", "<init>", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lio/github/jan/supabase/auth/admin/LinkType$EmailChangeCurrent$Config;", "auth-kt_release"}, k = 1, mv = {2, 1, 0}, xi = androidx.media3.container.NalUnitUtil.H265_NAL_UNIT_TYPE_UNSPECIFIED)
            public static final class Companion {
                private Companion() {
                }

                public final kotlinx.serialization.KSerializer serializer() {
                    return io.github.jan.supabase.auth.admin.LinkType$EmailChangeCurrent$Config$$serializer.INSTANCE;
                }

                public /* synthetic */ Companion(kotlin.jvm.internal.AbstractC2541f abstractC2541f) {
                    this();
                }
            }

            /* JADX WARN: Multi-variable type inference failed */
            public Config() {
                this(null, 1, 0 == true ? 1 : 0);
            }

            public static /* synthetic */ io.github.jan.supabase.auth.admin.LinkType.EmailChangeCurrent.Config copy$default(io.github.jan.supabase.auth.admin.LinkType.EmailChangeCurrent.Config config, java.lang.String str, int i3, java.lang.Object obj) {
                if ((i3 & 1) != 0) {
                    str = config.newEmail;
                }
                return config.copy(str);
            }

            @p119n8.h("new_email")
            public static /* synthetic */ void getNewEmail$annotations() {
            }

            public static final /* synthetic */ void write$Self$auth_kt_release(io.github.jan.supabase.auth.admin.LinkType.EmailChangeCurrent.Config self, p143q8.b output, kotlinx.serialization.descriptors.SerialDescriptor serialDesc) {
                io.github.jan.supabase.auth.admin.LinkType.Config.write$Self(self, output, serialDesc);
                if (!output.E(serialDesc) && kotlin.jvm.internal.m.a(self.newEmail, "")) {
                    return;
                }
                output.s(serialDesc, 1, self.newEmail);
            }

            /* JADX INFO: renamed from: component1, reason: from getter */
            public final java.lang.String getNewEmail() {
                return this.newEmail;
            }

            public final io.github.jan.supabase.auth.admin.LinkType.EmailChangeCurrent.Config copy(java.lang.String newEmail) {
                kotlin.jvm.internal.m.e(newEmail, "newEmail");
                return new io.github.jan.supabase.auth.admin.LinkType.EmailChangeCurrent.Config(newEmail);
            }

            public boolean equals(java.lang.Object other) {
                if (this == other) {
                    return true;
                }
                return (other instanceof io.github.jan.supabase.auth.admin.LinkType.EmailChangeCurrent.Config) && kotlin.jvm.internal.m.a(this.newEmail, ((io.github.jan.supabase.auth.admin.LinkType.EmailChangeCurrent.Config) other).newEmail);
            }

            public final java.lang.String getNewEmail() {
                return this.newEmail;
            }

            public int hashCode() {
                return this.newEmail.hashCode();
            }

            public final void setNewEmail(java.lang.String str) {
                kotlin.jvm.internal.m.e(str, "<set-?>");
                this.newEmail = str;
            }

            public java.lang.String toString() {
                return Y6.f.l(new java.lang.StringBuilder("Config(newEmail="), this.newEmail, ')');
            }

            public /* synthetic */ Config(int i3, java.lang.String str, java.lang.String str2, p153r8.k0 k0Var) {
                super(i3, str, k0Var);
                if ((i3 & 2) == 0) {
                    this.newEmail = "";
                } else {
                    this.newEmail = str2;
                }
            }

            public /* synthetic */ Config(java.lang.String str, int i3, kotlin.jvm.internal.AbstractC2541f abstractC2541f) {
                this((i3 & 1) != 0 ? "" : str);
            }

            public Config(java.lang.String newEmail) {
                kotlin.jvm.internal.m.e(newEmail, "newEmail");
                this.newEmail = newEmail;
            }
        }

        private EmailChangeCurrent() {
        }

        public boolean equals(java.lang.Object other) {
            return this == other || (other instanceof io.github.jan.supabase.auth.admin.LinkType.EmailChangeCurrent);
        }

        @Override // io.github.jan.supabase.auth.admin.LinkType
        public java.lang.String getType() {
            return type;
        }

        public int hashCode() {
            return -35365934;
        }

        public java.lang.String toString() {
            return "EmailChangeCurrent";
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // io.github.jan.supabase.auth.admin.LinkType
        @io.github.jan.supabase.annotations.SupabaseInternal
        public io.github.jan.supabase.auth.admin.LinkType.EmailChangeCurrent.Config createConfig(p194x6.j config) {
            kotlin.jvm.internal.m.e(config, "config");
            io.github.jan.supabase.auth.admin.LinkType.EmailChangeCurrent.Config config2 = new io.github.jan.supabase.auth.admin.LinkType.EmailChangeCurrent.Config(null, 1, 0 == true ? 1 : 0);
            config.invoke(config2);
            return config2;
        }
    }

    @kotlin.Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\bÆ\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J#\u0010\b\u001a\u00020\u00022\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00060\u0005H\u0017¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000b\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\u000e\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u001a\u0010\u0013\u001a\u00020\u00122\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010HÖ\u0003¢\u0006\u0004\b\u0013\u0010\u0014R\u001a\u0010\u0015\u001a\u00020\n8\u0016X\u0096D¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0017\u0010\f¨\u0006\u0018"}, d2 = {"Lio/github/jan/supabase/auth/admin/LinkType$EmailChangeNew;", "Lio/github/jan/supabase/auth/admin/LinkType;", "Lio/github/jan/supabase/auth/admin/LinkType$EmailChangeCurrent$Config;", "<init>", "()V", "Lkotlin/Function1;", "Lh6/A;", "config", "createConfig", "(Lx6/j;)Lio/github/jan/supabase/auth/admin/LinkType$EmailChangeCurrent$Config;", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", io.sentry.protocol.Request.JsonKeys.OTHER, "", "equals", "(Ljava/lang/Object;)Z", "type", "Ljava/lang/String;", "getType", "auth-kt_release"}, k = 1, mv = {2, 1, 0}, xi = androidx.media3.container.NalUnitUtil.H265_NAL_UNIT_TYPE_UNSPECIFIED)
    public static final /* data */ class EmailChangeNew implements io.github.jan.supabase.auth.admin.LinkType<io.github.jan.supabase.auth.admin.LinkType.EmailChangeCurrent.Config> {
        public static final io.github.jan.supabase.auth.admin.LinkType.EmailChangeNew INSTANCE = new io.github.jan.supabase.auth.admin.LinkType.EmailChangeNew();
        private static final java.lang.String type = "email_change_new";

        private EmailChangeNew() {
        }

        public boolean equals(java.lang.Object other) {
            return this == other || (other instanceof io.github.jan.supabase.auth.admin.LinkType.EmailChangeNew);
        }

        @Override // io.github.jan.supabase.auth.admin.LinkType
        public java.lang.String getType() {
            return type;
        }

        public int hashCode() {
            return 1911643257;
        }

        public java.lang.String toString() {
            return "EmailChangeNew";
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // io.github.jan.supabase.auth.admin.LinkType
        @io.github.jan.supabase.annotations.SupabaseInternal
        public io.github.jan.supabase.auth.admin.LinkType.EmailChangeCurrent.Config createConfig(p194x6.j config) {
            kotlin.jvm.internal.m.e(config, "config");
            io.github.jan.supabase.auth.admin.LinkType.EmailChangeCurrent.Config config2 = new io.github.jan.supabase.auth.admin.LinkType.EmailChangeCurrent.Config(null, 1, 0 == true ? 1 : 0);
            config.invoke(config2);
            return config2;
        }
    }

    @kotlin.Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\bÆ\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J#\u0010\b\u001a\u00020\u00022\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00060\u0005H\u0017¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000b\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\u000e\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u001a\u0010\u0013\u001a\u00020\u00122\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010HÖ\u0003¢\u0006\u0004\b\u0013\u0010\u0014R\u001a\u0010\u0015\u001a\u00020\n8\u0016X\u0096D¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0017\u0010\f¨\u0006\u0018"}, d2 = {"Lio/github/jan/supabase/auth/admin/LinkType$Invite;", "Lio/github/jan/supabase/auth/admin/LinkType;", "Lio/github/jan/supabase/auth/admin/LinkType$Config;", "<init>", "()V", "Lkotlin/Function1;", "Lh6/A;", "config", "createConfig", "(Lx6/j;)Lio/github/jan/supabase/auth/admin/LinkType$Config;", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", io.sentry.protocol.Request.JsonKeys.OTHER, "", "equals", "(Ljava/lang/Object;)Z", "type", "Ljava/lang/String;", "getType", "auth-kt_release"}, k = 1, mv = {2, 1, 0}, xi = androidx.media3.container.NalUnitUtil.H265_NAL_UNIT_TYPE_UNSPECIFIED)
    public static final /* data */ class Invite implements io.github.jan.supabase.auth.admin.LinkType<io.github.jan.supabase.auth.admin.LinkType.Config> {
        public static final io.github.jan.supabase.auth.admin.LinkType.Invite INSTANCE = new io.github.jan.supabase.auth.admin.LinkType.Invite();
        private static final java.lang.String type = "invite";

        private Invite() {
        }

        @Override // io.github.jan.supabase.auth.admin.LinkType
        @io.github.jan.supabase.annotations.SupabaseInternal
        public io.github.jan.supabase.auth.admin.LinkType.Config createConfig(p194x6.j config) {
            kotlin.jvm.internal.m.e(config, "config");
            io.github.jan.supabase.auth.admin.LinkType.Config config2 = new io.github.jan.supabase.auth.admin.LinkType.Config();
            config.invoke(config2);
            return config2;
        }

        public boolean equals(java.lang.Object other) {
            return this == other || (other instanceof io.github.jan.supabase.auth.admin.LinkType.Invite);
        }

        @Override // io.github.jan.supabase.auth.admin.LinkType
        public java.lang.String getType() {
            return type;
        }

        public int hashCode() {
            return 731307246;
        }

        public java.lang.String toString() {
            return "Invite";
        }
    }

    @kotlin.Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\bÆ\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J#\u0010\b\u001a\u00020\u00022\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00060\u0005H\u0017¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000b\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\u000e\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u001a\u0010\u0013\u001a\u00020\u00122\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010HÖ\u0003¢\u0006\u0004\b\u0013\u0010\u0014R\u001a\u0010\u0015\u001a\u00020\n8\u0016X\u0096D¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0017\u0010\f¨\u0006\u0018"}, d2 = {"Lio/github/jan/supabase/auth/admin/LinkType$MagicLink;", "Lio/github/jan/supabase/auth/admin/LinkType;", "Lio/github/jan/supabase/auth/admin/LinkType$Config;", "<init>", "()V", "Lkotlin/Function1;", "Lh6/A;", "config", "createConfig", "(Lx6/j;)Lio/github/jan/supabase/auth/admin/LinkType$Config;", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", io.sentry.protocol.Request.JsonKeys.OTHER, "", "equals", "(Ljava/lang/Object;)Z", "type", "Ljava/lang/String;", "getType", "auth-kt_release"}, k = 1, mv = {2, 1, 0}, xi = androidx.media3.container.NalUnitUtil.H265_NAL_UNIT_TYPE_UNSPECIFIED)
    public static final /* data */ class MagicLink implements io.github.jan.supabase.auth.admin.LinkType<io.github.jan.supabase.auth.admin.LinkType.Config> {
        public static final io.github.jan.supabase.auth.admin.LinkType.MagicLink INSTANCE = new io.github.jan.supabase.auth.admin.LinkType.MagicLink();
        private static final java.lang.String type = "magiclink";

        private MagicLink() {
        }

        @Override // io.github.jan.supabase.auth.admin.LinkType
        @io.github.jan.supabase.annotations.SupabaseInternal
        public io.github.jan.supabase.auth.admin.LinkType.Config createConfig(p194x6.j config) {
            kotlin.jvm.internal.m.e(config, "config");
            io.github.jan.supabase.auth.admin.LinkType.Config config2 = new io.github.jan.supabase.auth.admin.LinkType.Config();
            config.invoke(config2);
            return config2;
        }

        public boolean equals(java.lang.Object other) {
            return this == other || (other instanceof io.github.jan.supabase.auth.admin.LinkType.MagicLink);
        }

        @Override // io.github.jan.supabase.auth.admin.LinkType
        public java.lang.String getType() {
            return type;
        }

        public int hashCode() {
            return 2034465602;
        }

        public java.lang.String toString() {
            return "MagicLink";
        }
    }

    @kotlin.Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\bÆ\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J#\u0010\b\u001a\u00020\u00022\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00060\u0005H\u0017¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000b\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\u000e\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u001a\u0010\u0013\u001a\u00020\u00122\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010HÖ\u0003¢\u0006\u0004\b\u0013\u0010\u0014R\u001a\u0010\u0015\u001a\u00020\n8\u0016X\u0096D¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0017\u0010\f¨\u0006\u0018"}, d2 = {"Lio/github/jan/supabase/auth/admin/LinkType$RecoveryLink;", "Lio/github/jan/supabase/auth/admin/LinkType;", "Lio/github/jan/supabase/auth/admin/LinkType$Config;", "<init>", "()V", "Lkotlin/Function1;", "Lh6/A;", "config", "createConfig", "(Lx6/j;)Lio/github/jan/supabase/auth/admin/LinkType$Config;", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", io.sentry.protocol.Request.JsonKeys.OTHER, "", "equals", "(Ljava/lang/Object;)Z", "type", "Ljava/lang/String;", "getType", "auth-kt_release"}, k = 1, mv = {2, 1, 0}, xi = androidx.media3.container.NalUnitUtil.H265_NAL_UNIT_TYPE_UNSPECIFIED)
    public static final /* data */ class RecoveryLink implements io.github.jan.supabase.auth.admin.LinkType<io.github.jan.supabase.auth.admin.LinkType.Config> {
        public static final io.github.jan.supabase.auth.admin.LinkType.RecoveryLink INSTANCE = new io.github.jan.supabase.auth.admin.LinkType.RecoveryLink();
        private static final java.lang.String type = "recovery";

        private RecoveryLink() {
        }

        @Override // io.github.jan.supabase.auth.admin.LinkType
        @io.github.jan.supabase.annotations.SupabaseInternal
        public io.github.jan.supabase.auth.admin.LinkType.Config createConfig(p194x6.j config) {
            kotlin.jvm.internal.m.e(config, "config");
            io.github.jan.supabase.auth.admin.LinkType.Config config2 = new io.github.jan.supabase.auth.admin.LinkType.Config();
            config.invoke(config2);
            return config2;
        }

        public boolean equals(java.lang.Object other) {
            return this == other || (other instanceof io.github.jan.supabase.auth.admin.LinkType.RecoveryLink);
        }

        @Override // io.github.jan.supabase.auth.admin.LinkType
        public java.lang.String getType() {
            return type;
        }

        public int hashCode() {
            return -1501511852;
        }

        public java.lang.String toString() {
            return "RecoveryLink";
        }
    }

    @kotlin.Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0007\bÆ\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0018B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J#\u0010\b\u001a\u00020\u00022\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00060\u0005H\u0017¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000b\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\u000e\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u001a\u0010\u0013\u001a\u00020\u00122\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010HÖ\u0003¢\u0006\u0004\b\u0013\u0010\u0014R\u001a\u0010\u0015\u001a\u00020\n8\u0016X\u0096D¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0017\u0010\f¨\u0006\u0019"}, d2 = {"Lio/github/jan/supabase/auth/admin/LinkType$Signup;", "Lio/github/jan/supabase/auth/admin/LinkType;", "Lio/github/jan/supabase/auth/admin/LinkType$Signup$Config;", "<init>", "()V", "Lkotlin/Function1;", "Lh6/A;", "config", "createConfig", "(Lx6/j;)Lio/github/jan/supabase/auth/admin/LinkType$Signup$Config;", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", io.sentry.protocol.Request.JsonKeys.OTHER, "", "equals", "(Ljava/lang/Object;)Z", "type", "Ljava/lang/String;", "getType", "Config", "auth-kt_release"}, k = 1, mv = {2, 1, 0}, xi = androidx.media3.container.NalUnitUtil.H265_NAL_UNIT_TYPE_UNSPECIFIED)
    public static final /* data */ class Signup implements io.github.jan.supabase.auth.admin.LinkType<io.github.jan.supabase.auth.admin.LinkType.Signup.Config> {
        public static final io.github.jan.supabase.auth.admin.LinkType.Signup INSTANCE = new io.github.jan.supabase.auth.admin.LinkType.Signup();
        private static final java.lang.String type = "signup";

        @kotlin.Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\r\b\u0087\b\u0018\u0000 -2\u00020\u0001:\u0002.-B\u001d\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007B9\b\u0010\u0012\u0006\u0010\t\u001a\u00020\b\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u000b¢\u0006\u0004\b\u0006\u0010\rJ'\u0010\u0016\u001a\u00020\u00132\u0006\u0010\u000e\u001a\u00020\u00002\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0012\u001a\u00020\u0011H\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0017\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0017\u0010\u0018J\u0012\u0010\u0019\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b\u0019\u0010\u001aJ&\u0010\u001b\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004HÆ\u0001¢\u0006\u0004\b\u001b\u0010\u001cJ\u0010\u0010\u001d\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u001d\u0010\u0018J\u0010\u0010\u001e\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\u001e\u0010\u001fJ\u001a\u0010#\u001a\u00020\"2\b\u0010!\u001a\u0004\u0018\u00010 HÖ\u0003¢\u0006\u0004\b#\u0010$R\"\u0010\u0003\u001a\u00020\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0003\u0010%\u001a\u0004\b&\u0010\u0018\"\u0004\b'\u0010(R$\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0005\u0010)\u001a\u0004\b*\u0010\u001a\"\u0004\b+\u0010,¨\u0006/"}, d2 = {"Lio/github/jan/supabase/auth/admin/LinkType$Signup$Config;", "Lio/github/jan/supabase/auth/admin/LinkType$Config;", "", "password", "Lkotlinx/serialization/json/c;", "data", "<init>", "(Ljava/lang/String;Lkotlinx/serialization/json/c;)V", "", "seen0", "email", "Lr8/k0;", "serializationConstructorMarker", "(ILjava/lang/String;Ljava/lang/String;Lkotlinx/serialization/json/c;Lr8/k0;)V", "self", "Lq8/b;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "Lh6/A;", "write$Self$auth_kt_release", "(Lio/github/jan/supabase/auth/admin/LinkType$Signup$Config;Lq8/b;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "write$Self", "component1", "()Ljava/lang/String;", "component2", "()Lkotlinx/serialization/json/c;", "copy", "(Ljava/lang/String;Lkotlinx/serialization/json/c;)Lio/github/jan/supabase/auth/admin/LinkType$Signup$Config;", "toString", "hashCode", "()I", "", io.sentry.protocol.Request.JsonKeys.OTHER, "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getPassword", "setPassword", "(Ljava/lang/String;)V", "Lkotlinx/serialization/json/c;", "getData", "setData", "(Lkotlinx/serialization/json/c;)V", "Companion", "$serializer", "auth-kt_release"}, k = 1, mv = {2, 1, 0}, xi = androidx.media3.container.NalUnitUtil.H265_NAL_UNIT_TYPE_UNSPECIFIED)
        @p119n8.i
        public static final /* data */ class Config extends io.github.jan.supabase.auth.admin.LinkType.Config {

            /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
            public static final io.github.jan.supabase.auth.admin.LinkType.Signup.Config.Companion INSTANCE = new io.github.jan.supabase.auth.admin.LinkType.Signup.Config.Companion(null);
            private kotlinx.serialization.json.c data;
            private java.lang.String password;

            @kotlin.Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¨\u0006\u0007"}, d2 = {"Lio/github/jan/supabase/auth/admin/LinkType$Signup$Config$Companion;", "", "<init>", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lio/github/jan/supabase/auth/admin/LinkType$Signup$Config;", "auth-kt_release"}, k = 1, mv = {2, 1, 0}, xi = androidx.media3.container.NalUnitUtil.H265_NAL_UNIT_TYPE_UNSPECIFIED)
            public static final class Companion {
                private Companion() {
                }

                public final kotlinx.serialization.KSerializer serializer() {
                    return io.github.jan.supabase.auth.admin.LinkType$Signup$Config$$serializer.INSTANCE;
                }

                public /* synthetic */ Companion(kotlin.jvm.internal.AbstractC2541f abstractC2541f) {
                    this();
                }
            }

            /* JADX WARN: Multi-variable type inference failed */
            public Config() {
                this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
            }

            public static /* synthetic */ io.github.jan.supabase.auth.admin.LinkType.Signup.Config copy$default(io.github.jan.supabase.auth.admin.LinkType.Signup.Config config, java.lang.String str, kotlinx.serialization.json.c cVar, int i3, java.lang.Object obj) {
                if ((i3 & 1) != 0) {
                    str = config.password;
                }
                if ((i3 & 2) != 0) {
                    cVar = config.data;
                }
                return config.copy(str, cVar);
            }

            public static final /* synthetic */ void write$Self$auth_kt_release(io.github.jan.supabase.auth.admin.LinkType.Signup.Config self, p143q8.b output, kotlinx.serialization.descriptors.SerialDescriptor serialDesc) {
                io.github.jan.supabase.auth.admin.LinkType.Config.write$Self(self, output, serialDesc);
                if (output.E(serialDesc) || !kotlin.jvm.internal.m.a(self.password, "")) {
                    output.s(serialDesc, 1, self.password);
                }
                if (!output.E(serialDesc) && self.data == null) {
                    return;
                }
                output.t(serialDesc, 2, p162s8.x.f27430a, self.data);
            }

            /* JADX INFO: renamed from: component1, reason: from getter */
            public final java.lang.String getPassword() {
                return this.password;
            }

            /* JADX INFO: renamed from: component2, reason: from getter */
            public final kotlinx.serialization.json.c getData() {
                return this.data;
            }

            public final io.github.jan.supabase.auth.admin.LinkType.Signup.Config copy(java.lang.String password, kotlinx.serialization.json.c data) {
                kotlin.jvm.internal.m.e(password, "password");
                return new io.github.jan.supabase.auth.admin.LinkType.Signup.Config(password, data);
            }

            public boolean equals(java.lang.Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof io.github.jan.supabase.auth.admin.LinkType.Signup.Config)) {
                    return false;
                }
                io.github.jan.supabase.auth.admin.LinkType.Signup.Config config = (io.github.jan.supabase.auth.admin.LinkType.Signup.Config) other;
                return kotlin.jvm.internal.m.a(this.password, config.password) && kotlin.jvm.internal.m.a(this.data, config.data);
            }

            public final kotlinx.serialization.json.c getData() {
                return this.data;
            }

            public final java.lang.String getPassword() {
                return this.password;
            }

            public int hashCode() {
                int iHashCode = this.password.hashCode() * 31;
                kotlinx.serialization.json.c cVar = this.data;
                return iHashCode + (cVar == null ? 0 : cVar.f24558h.hashCode());
            }

            public final void setData(kotlinx.serialization.json.c cVar) {
                this.data = cVar;
            }

            public final void setPassword(java.lang.String str) {
                kotlin.jvm.internal.m.e(str, "<set-?>");
                this.password = str;
            }

            public java.lang.String toString() {
                return "Config(password=" + this.password + ", data=" + this.data + ')';
            }

            public /* synthetic */ Config(int i3, java.lang.String str, java.lang.String str2, kotlinx.serialization.json.c cVar, p153r8.k0 k0Var) {
                super(i3, str, k0Var);
                if ((i3 & 2) == 0) {
                    this.password = "";
                } else {
                    this.password = str2;
                }
                if ((i3 & 4) == 0) {
                    this.data = null;
                } else {
                    this.data = cVar;
                }
            }

            public /* synthetic */ Config(java.lang.String str, kotlinx.serialization.json.c cVar, int i3, kotlin.jvm.internal.AbstractC2541f abstractC2541f) {
                this((i3 & 1) != 0 ? "" : str, (i3 & 2) != 0 ? null : cVar);
            }

            public Config(java.lang.String password, kotlinx.serialization.json.c cVar) {
                kotlin.jvm.internal.m.e(password, "password");
                this.password = password;
                this.data = cVar;
            }
        }

        private Signup() {
        }

        public boolean equals(java.lang.Object other) {
            return this == other || (other instanceof io.github.jan.supabase.auth.admin.LinkType.Signup);
        }

        @Override // io.github.jan.supabase.auth.admin.LinkType
        public java.lang.String getType() {
            return type;
        }

        public int hashCode() {
            return 1012539133;
        }

        public java.lang.String toString() {
            return "Signup";
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // io.github.jan.supabase.auth.admin.LinkType
        @io.github.jan.supabase.annotations.SupabaseInternal
        public io.github.jan.supabase.auth.admin.LinkType.Signup.Config createConfig(p194x6.j config) {
            kotlin.jvm.internal.m.e(config, "config");
            io.github.jan.supabase.auth.admin.LinkType.Signup.Config config2 = new io.github.jan.supabase.auth.admin.LinkType.Signup.Config(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
            config.invoke(config2);
            return config2;
        }
    }

    @io.github.jan.supabase.annotations.SupabaseInternal
    C createConfig(p194x6.j config);

    java.lang.String getType();

    @kotlin.Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\b\u0017\u0018\u0000 \u00182\u00020\u0001:\u0002\u0019\u0018B\u0007¢\u0006\u0004\b\u0002\u0010\u0003B%\b\u0016\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\u0002\u0010\nJ'\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u000b\u001a\u00020\u00002\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\u000eH\u0007¢\u0006\u0004\b\u0011\u0010\u0012R\"\u0010\u0007\u001a\u00020\u00068\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0007\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015\"\u0004\b\u0016\u0010\u0017¨\u0006\u001a"}, d2 = {"Lio/github/jan/supabase/auth/admin/LinkType$Config;", "", "<init>", "()V", "", "seen0", "", "email", "Lr8/k0;", "serializationConstructorMarker", "(ILjava/lang/String;Lr8/k0;)V", "self", "Lq8/b;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "Lh6/A;", "write$Self", "(Lio/github/jan/supabase/auth/admin/LinkType$Config;Lq8/b;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "Ljava/lang/String;", "getEmail", "()Ljava/lang/String;", "setEmail", "(Ljava/lang/String;)V", "Companion", "$serializer", "auth-kt_release"}, k = 1, mv = {2, 1, 0}, xi = androidx.media3.container.NalUnitUtil.H265_NAL_UNIT_TYPE_UNSPECIFIED)
    @p119n8.i
    public static class Config {

        /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
        public static final io.github.jan.supabase.auth.admin.LinkType.Config.Companion INSTANCE = new io.github.jan.supabase.auth.admin.LinkType.Config.Companion(null);
        private java.lang.String email;

        @kotlin.Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¨\u0006\u0007"}, d2 = {"Lio/github/jan/supabase/auth/admin/LinkType$Config$Companion;", "", "<init>", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lio/github/jan/supabase/auth/admin/LinkType$Config;", "auth-kt_release"}, k = 1, mv = {2, 1, 0}, xi = androidx.media3.container.NalUnitUtil.H265_NAL_UNIT_TYPE_UNSPECIFIED)
        public static final class Companion {
            private Companion() {
            }

            public final kotlinx.serialization.KSerializer serializer() {
                return io.github.jan.supabase.auth.admin.LinkType$Config$$serializer.INSTANCE;
            }

            public /* synthetic */ Companion(kotlin.jvm.internal.AbstractC2541f abstractC2541f) {
                this();
            }
        }

        public Config() {
            this.email = "";
        }

        public static final /* synthetic */ void write$Self(io.github.jan.supabase.auth.admin.LinkType.Config self, p143q8.b output, kotlinx.serialization.descriptors.SerialDescriptor serialDesc) {
            if (!output.E(serialDesc) && kotlin.jvm.internal.m.a(self.email, "")) {
                return;
            }
            output.s(serialDesc, 0, self.email);
        }

        public final java.lang.String getEmail() {
            return this.email;
        }

        public final void setEmail(java.lang.String str) {
            kotlin.jvm.internal.m.e(str, "<set-?>");
            this.email = str;
        }

        public /* synthetic */ Config(int i3, java.lang.String str, p153r8.k0 k0Var) {
            if ((i3 & 1) == 0) {
                this.email = "";
            } else {
                this.email = str;
            }
        }
    }
}
