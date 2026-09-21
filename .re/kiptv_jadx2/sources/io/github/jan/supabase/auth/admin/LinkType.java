package io.github.jan.supabase.auth.admin;

import Y6.f;
import androidx.media3.container.NalUnitUtil;
import io.github.jan.supabase.annotations.SupabaseInternal;
import io.github.jan.supabase.auth.admin.LinkType.Config;
import io.sentry.protocol.Request;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC2541f;
import kotlin.jvm.internal.m;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.json.c;
import p119n8.h;
import p119n8.i;
import p143q8.b;
import p153r8.k0;
import p162s8.x;
import p194x6.j;

@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u0000*\b\b\u0000\u0010\u0002*\u00020\u00012\u00020\u0003:\u0007\r\u000e\u000f\u0010\u0011\u0012\u0013J#\u0010\u0007\u001a\u00028\u00002\u0012\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u00050\u0004H'¢\u0006\u0004\b\u0007\u0010\bR\u0014\u0010\f\u001a\u00020\t8&X¦\u0004¢\u0006\u0006\u001a\u0004\b\n\u0010\u000b\u0082\u0001\u0006\u0014\u0015\u0016\u0017\u0018\u0019¨\u0006\u001a"}, d2 = {"Lio/github/jan/supabase/auth/admin/LinkType;", "Lio/github/jan/supabase/auth/admin/LinkType$Config;", "C", "", "Lkotlin/Function1;", "Lh6/A;", "config", "createConfig", "(Lx6/j;)Lio/github/jan/supabase/auth/admin/LinkType$Config;", "", "getType", "()Ljava/lang/String;", "type", "Config", "Signup", "Invite", "MagicLink", "RecoveryLink", "EmailChangeCurrent", "EmailChangeNew", "Lio/github/jan/supabase/auth/admin/LinkType$EmailChangeCurrent;", "Lio/github/jan/supabase/auth/admin/LinkType$EmailChangeNew;", "Lio/github/jan/supabase/auth/admin/LinkType$Invite;", "Lio/github/jan/supabase/auth/admin/LinkType$MagicLink;", "Lio/github/jan/supabase/auth/admin/LinkType$RecoveryLink;", "Lio/github/jan/supabase/auth/admin/LinkType$Signup;", "auth-kt_release"}, k = 1, mv = {2, 1, 0}, xi = NalUnitUtil.H265_NAL_UNIT_TYPE_UNSPECIFIED)
public interface LinkType<C extends Config> {

    @Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0007\bÆ\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0018B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J#\u0010\b\u001a\u00020\u00022\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00060\u0005H\u0017¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000b\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\u000e\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u001a\u0010\u0013\u001a\u00020\u00122\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010HÖ\u0003¢\u0006\u0004\b\u0013\u0010\u0014R\u001a\u0010\u0015\u001a\u00020\n8\u0016X\u0096D¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0017\u0010\f¨\u0006\u0019"}, d2 = {"Lio/github/jan/supabase/auth/admin/LinkType$EmailChangeCurrent;", "Lio/github/jan/supabase/auth/admin/LinkType;", "Lio/github/jan/supabase/auth/admin/LinkType$EmailChangeCurrent$Config;", "<init>", "()V", "Lkotlin/Function1;", "Lh6/A;", "config", "createConfig", "(Lx6/j;)Lio/github/jan/supabase/auth/admin/LinkType$EmailChangeCurrent$Config;", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", Request.JsonKeys.OTHER, "", "equals", "(Ljava/lang/Object;)Z", "type", "Ljava/lang/String;", "getType", "Config", "auth-kt_release"}, k = 1, mv = {2, 1, 0}, xi = NalUnitUtil.H265_NAL_UNIT_TYPE_UNSPECIFIED)
    public static final class EmailChangeCurrent implements LinkType<Config> {
        public static final EmailChangeCurrent INSTANCE = new EmailChangeCurrent();
        private static final String type = "email_change_current";

        @Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\n\b\u0087\b\u0018\u0000 &2\u00020\u0001:\u0002'&B\u0011\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005B/\b\u0010\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\n\u001a\u0004\u0018\u00010\t¢\u0006\u0004\b\u0004\u0010\u000bJ'\u0010\u0014\u001a\u00020\u00112\u0006\u0010\f\u001a\u00020\u00002\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0010\u001a\u00020\u000fH\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0015\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0015\u0010\u0016J\u001a\u0010\u0017\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\u0017\u0010\u0018J\u0010\u0010\u0019\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0019\u0010\u0016J\u0010\u0010\u001a\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u001a\u0010\u001bJ\u001a\u0010\u001f\u001a\u00020\u001e2\b\u0010\u001d\u001a\u0004\u0018\u00010\u001cHÖ\u0003¢\u0006\u0004\b\u001f\u0010 R(\u0010\u0003\u001a\u00020\u00028\u0006@\u0006X\u0087\u000e¢\u0006\u0018\n\u0004\b\u0003\u0010!\u0012\u0004\b$\u0010%\u001a\u0004\b\"\u0010\u0016\"\u0004\b#\u0010\u0005¨\u0006("}, d2 = {"Lio/github/jan/supabase/auth/admin/LinkType$EmailChangeCurrent$Config;", "Lio/github/jan/supabase/auth/admin/LinkType$Config;", "", "newEmail", "<init>", "(Ljava/lang/String;)V", "", "seen0", "email", "Lr8/k0;", "serializationConstructorMarker", "(ILjava/lang/String;Ljava/lang/String;Lr8/k0;)V", "self", "Lq8/b;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "Lh6/A;", "write$Self$auth_kt_release", "(Lio/github/jan/supabase/auth/admin/LinkType$EmailChangeCurrent$Config;Lq8/b;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "write$Self", "component1", "()Ljava/lang/String;", "copy", "(Ljava/lang/String;)Lio/github/jan/supabase/auth/admin/LinkType$EmailChangeCurrent$Config;", "toString", "hashCode", "()I", "", Request.JsonKeys.OTHER, "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getNewEmail", "setNewEmail", "getNewEmail$annotations", "()V", "Companion", "$serializer", "auth-kt_release"}, k = 1, mv = {2, 1, 0}, xi = NalUnitUtil.H265_NAL_UNIT_TYPE_UNSPECIFIED)
        @i
        public static final class Config extends Config {

            public static final Companion INSTANCE = new Companion(null);
            private String newEmail;

            @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¨\u0006\u0007"}, d2 = {"Lio/github/jan/supabase/auth/admin/LinkType$EmailChangeCurrent$Config$Companion;", "", "<init>", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lio/github/jan/supabase/auth/admin/LinkType$EmailChangeCurrent$Config;", "auth-kt_release"}, k = 1, mv = {2, 1, 0}, xi = NalUnitUtil.H265_NAL_UNIT_TYPE_UNSPECIFIED)
            public static final class Companion {
                private Companion() {
                }

                public final KSerializer serializer() {
                    return LinkType$EmailChangeCurrent$Config$$serializer.INSTANCE;
                }

                public Companion(AbstractC2541f abstractC2541f) {
                    this();
                }
            }

            public Config() {
                this(null, 1, 0 == true ? 1 : 0);
            }

            public static Config copy$default(Config config, String str, int i3, Object obj) {
                if ((i3 & 1) != 0) {
                    str = config.newEmail;
                }
                return config.copy(str);
            }

            @h("new_email")
            public static void getNewEmail$annotations() {
            }

            public static final void write$Self$auth_kt_release(Config self, b output, SerialDescriptor serialDesc) {
                Config.write$Self(self, output, serialDesc);
                if (!output.E(serialDesc) && m.a(self.newEmail, "")) {
                    return;
                }
                output.s(serialDesc, 1, self.newEmail);
            }

            public final String getNewEmail() {
                return this.newEmail;
            }

            public final Config copy(String newEmail) {
                m.e(newEmail, "newEmail");
                return new Config(newEmail);
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                return (other instanceof Config) && m.a(this.newEmail, ((Config) other).newEmail);
            }

            public final String getNewEmail() {
                return this.newEmail;
            }

            public int hashCode() {
                return this.newEmail.hashCode();
            }

            public final void setNewEmail(String str) {
                m.e(str, "<set-?>");
                this.newEmail = str;
            }

            public String toString() {
                return f.l(new StringBuilder("Config(newEmail="), this.newEmail, ')');
            }

            public Config(int i3, String str, String str2, k0 k0Var) {
                super(i3, str, k0Var);
                if ((i3 & 2) == 0) {
                    this.newEmail = "";
                } else {
                    this.newEmail = str2;
                }
            }

            public Config(String str, int i3, AbstractC2541f abstractC2541f) {
                this((i3 & 1) != 0 ? "" : str);
            }

            public Config(String newEmail) {
                m.e(newEmail, "newEmail");
                this.newEmail = newEmail;
            }
        }

        private EmailChangeCurrent() {
        }

        public boolean equals(Object other) {
            return this == other || (other instanceof EmailChangeCurrent);
        }

        @Override
        public String getType() {
            return type;
        }

        public int hashCode() {
            return -35365934;
        }

        public String toString() {
            return "EmailChangeCurrent";
        }

        @Override
        @SupabaseInternal
        public Config createConfig(j config) {
            m.e(config, "config");
            Config config2 = new Config(null, 1, 0 == true ? 1 : 0);
            config.invoke(config2);
            return config2;
        }
    }

    @Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\bÆ\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J#\u0010\b\u001a\u00020\u00022\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00060\u0005H\u0017¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000b\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\u000e\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u001a\u0010\u0013\u001a\u00020\u00122\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010HÖ\u0003¢\u0006\u0004\b\u0013\u0010\u0014R\u001a\u0010\u0015\u001a\u00020\n8\u0016X\u0096D¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0017\u0010\f¨\u0006\u0018"}, d2 = {"Lio/github/jan/supabase/auth/admin/LinkType$EmailChangeNew;", "Lio/github/jan/supabase/auth/admin/LinkType;", "Lio/github/jan/supabase/auth/admin/LinkType$EmailChangeCurrent$Config;", "<init>", "()V", "Lkotlin/Function1;", "Lh6/A;", "config", "createConfig", "(Lx6/j;)Lio/github/jan/supabase/auth/admin/LinkType$EmailChangeCurrent$Config;", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", Request.JsonKeys.OTHER, "", "equals", "(Ljava/lang/Object;)Z", "type", "Ljava/lang/String;", "getType", "auth-kt_release"}, k = 1, mv = {2, 1, 0}, xi = NalUnitUtil.H265_NAL_UNIT_TYPE_UNSPECIFIED)
    public static final class EmailChangeNew implements LinkType<EmailChangeCurrent.Config> {
        public static final EmailChangeNew INSTANCE = new EmailChangeNew();
        private static final String type = "email_change_new";

        private EmailChangeNew() {
        }

        public boolean equals(Object other) {
            return this == other || (other instanceof EmailChangeNew);
        }

        @Override
        public String getType() {
            return type;
        }

        public int hashCode() {
            return 1911643257;
        }

        public String toString() {
            return "EmailChangeNew";
        }

        @Override
        @SupabaseInternal
        public EmailChangeCurrent.Config createConfig(j config) {
            m.e(config, "config");
            EmailChangeCurrent.Config config2 = new EmailChangeCurrent.Config(null, 1, 0 == true ? 1 : 0);
            config.invoke(config2);
            return config2;
        }
    }

    @Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\bÆ\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J#\u0010\b\u001a\u00020\u00022\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00060\u0005H\u0017¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000b\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\u000e\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u001a\u0010\u0013\u001a\u00020\u00122\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010HÖ\u0003¢\u0006\u0004\b\u0013\u0010\u0014R\u001a\u0010\u0015\u001a\u00020\n8\u0016X\u0096D¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0017\u0010\f¨\u0006\u0018"}, d2 = {"Lio/github/jan/supabase/auth/admin/LinkType$Invite;", "Lio/github/jan/supabase/auth/admin/LinkType;", "Lio/github/jan/supabase/auth/admin/LinkType$Config;", "<init>", "()V", "Lkotlin/Function1;", "Lh6/A;", "config", "createConfig", "(Lx6/j;)Lio/github/jan/supabase/auth/admin/LinkType$Config;", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", Request.JsonKeys.OTHER, "", "equals", "(Ljava/lang/Object;)Z", "type", "Ljava/lang/String;", "getType", "auth-kt_release"}, k = 1, mv = {2, 1, 0}, xi = NalUnitUtil.H265_NAL_UNIT_TYPE_UNSPECIFIED)
    public static final class Invite implements LinkType<Config> {
        public static final Invite INSTANCE = new Invite();
        private static final String type = "invite";

        private Invite() {
        }

        @Override
        @SupabaseInternal
        public Config createConfig(j config) {
            m.e(config, "config");
            Config config2 = new Config();
            config.invoke(config2);
            return config2;
        }

        public boolean equals(Object other) {
            return this == other || (other instanceof Invite);
        }

        @Override
        public String getType() {
            return type;
        }

        public int hashCode() {
            return 731307246;
        }

        public String toString() {
            return "Invite";
        }
    }

    @Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\bÆ\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J#\u0010\b\u001a\u00020\u00022\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00060\u0005H\u0017¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000b\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\u000e\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u001a\u0010\u0013\u001a\u00020\u00122\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010HÖ\u0003¢\u0006\u0004\b\u0013\u0010\u0014R\u001a\u0010\u0015\u001a\u00020\n8\u0016X\u0096D¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0017\u0010\f¨\u0006\u0018"}, d2 = {"Lio/github/jan/supabase/auth/admin/LinkType$MagicLink;", "Lio/github/jan/supabase/auth/admin/LinkType;", "Lio/github/jan/supabase/auth/admin/LinkType$Config;", "<init>", "()V", "Lkotlin/Function1;", "Lh6/A;", "config", "createConfig", "(Lx6/j;)Lio/github/jan/supabase/auth/admin/LinkType$Config;", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", Request.JsonKeys.OTHER, "", "equals", "(Ljava/lang/Object;)Z", "type", "Ljava/lang/String;", "getType", "auth-kt_release"}, k = 1, mv = {2, 1, 0}, xi = NalUnitUtil.H265_NAL_UNIT_TYPE_UNSPECIFIED)
    public static final class MagicLink implements LinkType<Config> {
        public static final MagicLink INSTANCE = new MagicLink();
        private static final String type = "magiclink";

        private MagicLink() {
        }

        @Override
        @SupabaseInternal
        public Config createConfig(j config) {
            m.e(config, "config");
            Config config2 = new Config();
            config.invoke(config2);
            return config2;
        }

        public boolean equals(Object other) {
            return this == other || (other instanceof MagicLink);
        }

        @Override
        public String getType() {
            return type;
        }

        public int hashCode() {
            return 2034465602;
        }

        public String toString() {
            return "MagicLink";
        }
    }

    @Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\bÆ\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J#\u0010\b\u001a\u00020\u00022\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00060\u0005H\u0017¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000b\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\u000e\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u001a\u0010\u0013\u001a\u00020\u00122\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010HÖ\u0003¢\u0006\u0004\b\u0013\u0010\u0014R\u001a\u0010\u0015\u001a\u00020\n8\u0016X\u0096D¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0017\u0010\f¨\u0006\u0018"}, d2 = {"Lio/github/jan/supabase/auth/admin/LinkType$RecoveryLink;", "Lio/github/jan/supabase/auth/admin/LinkType;", "Lio/github/jan/supabase/auth/admin/LinkType$Config;", "<init>", "()V", "Lkotlin/Function1;", "Lh6/A;", "config", "createConfig", "(Lx6/j;)Lio/github/jan/supabase/auth/admin/LinkType$Config;", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", Request.JsonKeys.OTHER, "", "equals", "(Ljava/lang/Object;)Z", "type", "Ljava/lang/String;", "getType", "auth-kt_release"}, k = 1, mv = {2, 1, 0}, xi = NalUnitUtil.H265_NAL_UNIT_TYPE_UNSPECIFIED)
    public static final class RecoveryLink implements LinkType<Config> {
        public static final RecoveryLink INSTANCE = new RecoveryLink();
        private static final String type = "recovery";

        private RecoveryLink() {
        }

        @Override
        @SupabaseInternal
        public Config createConfig(j config) {
            m.e(config, "config");
            Config config2 = new Config();
            config.invoke(config2);
            return config2;
        }

        public boolean equals(Object other) {
            return this == other || (other instanceof RecoveryLink);
        }

        @Override
        public String getType() {
            return type;
        }

        public int hashCode() {
            return -1501511852;
        }

        public String toString() {
            return "RecoveryLink";
        }
    }

    @Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0007\bÆ\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0018B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J#\u0010\b\u001a\u00020\u00022\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00060\u0005H\u0017¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000b\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\u000e\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u001a\u0010\u0013\u001a\u00020\u00122\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010HÖ\u0003¢\u0006\u0004\b\u0013\u0010\u0014R\u001a\u0010\u0015\u001a\u00020\n8\u0016X\u0096D¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0017\u0010\f¨\u0006\u0019"}, d2 = {"Lio/github/jan/supabase/auth/admin/LinkType$Signup;", "Lio/github/jan/supabase/auth/admin/LinkType;", "Lio/github/jan/supabase/auth/admin/LinkType$Signup$Config;", "<init>", "()V", "Lkotlin/Function1;", "Lh6/A;", "config", "createConfig", "(Lx6/j;)Lio/github/jan/supabase/auth/admin/LinkType$Signup$Config;", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", Request.JsonKeys.OTHER, "", "equals", "(Ljava/lang/Object;)Z", "type", "Ljava/lang/String;", "getType", "Config", "auth-kt_release"}, k = 1, mv = {2, 1, 0}, xi = NalUnitUtil.H265_NAL_UNIT_TYPE_UNSPECIFIED)
    public static final class Signup implements LinkType<Config> {
        public static final Signup INSTANCE = new Signup();
        private static final String type = "signup";

        @Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\r\b\u0087\b\u0018\u0000 -2\u00020\u0001:\u0002.-B\u001d\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007B9\b\u0010\u0012\u0006\u0010\t\u001a\u00020\b\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u000b¢\u0006\u0004\b\u0006\u0010\rJ'\u0010\u0016\u001a\u00020\u00132\u0006\u0010\u000e\u001a\u00020\u00002\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0012\u001a\u00020\u0011H\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0017\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0017\u0010\u0018J\u0012\u0010\u0019\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b\u0019\u0010\u001aJ&\u0010\u001b\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004HÆ\u0001¢\u0006\u0004\b\u001b\u0010\u001cJ\u0010\u0010\u001d\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u001d\u0010\u0018J\u0010\u0010\u001e\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\u001e\u0010\u001fJ\u001a\u0010#\u001a\u00020\"2\b\u0010!\u001a\u0004\u0018\u00010 HÖ\u0003¢\u0006\u0004\b#\u0010$R\"\u0010\u0003\u001a\u00020\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0003\u0010%\u001a\u0004\b&\u0010\u0018\"\u0004\b'\u0010(R$\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0005\u0010)\u001a\u0004\b*\u0010\u001a\"\u0004\b+\u0010,¨\u0006/"}, d2 = {"Lio/github/jan/supabase/auth/admin/LinkType$Signup$Config;", "Lio/github/jan/supabase/auth/admin/LinkType$Config;", "", "password", "Lkotlinx/serialization/json/c;", "data", "<init>", "(Ljava/lang/String;Lkotlinx/serialization/json/c;)V", "", "seen0", "email", "Lr8/k0;", "serializationConstructorMarker", "(ILjava/lang/String;Ljava/lang/String;Lkotlinx/serialization/json/c;Lr8/k0;)V", "self", "Lq8/b;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "Lh6/A;", "write$Self$auth_kt_release", "(Lio/github/jan/supabase/auth/admin/LinkType$Signup$Config;Lq8/b;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "write$Self", "component1", "()Ljava/lang/String;", "component2", "()Lkotlinx/serialization/json/c;", "copy", "(Ljava/lang/String;Lkotlinx/serialization/json/c;)Lio/github/jan/supabase/auth/admin/LinkType$Signup$Config;", "toString", "hashCode", "()I", "", Request.JsonKeys.OTHER, "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getPassword", "setPassword", "(Ljava/lang/String;)V", "Lkotlinx/serialization/json/c;", "getData", "setData", "(Lkotlinx/serialization/json/c;)V", "Companion", "$serializer", "auth-kt_release"}, k = 1, mv = {2, 1, 0}, xi = NalUnitUtil.H265_NAL_UNIT_TYPE_UNSPECIFIED)
        @i
        public static final class Config extends Config {

            public static final Companion INSTANCE = new Companion(null);
            private c data;
            private String password;

            @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¨\u0006\u0007"}, d2 = {"Lio/github/jan/supabase/auth/admin/LinkType$Signup$Config$Companion;", "", "<init>", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lio/github/jan/supabase/auth/admin/LinkType$Signup$Config;", "auth-kt_release"}, k = 1, mv = {2, 1, 0}, xi = NalUnitUtil.H265_NAL_UNIT_TYPE_UNSPECIFIED)
            public static final class Companion {
                private Companion() {
                }

                public final KSerializer serializer() {
                    return LinkType$Signup$Config$$serializer.INSTANCE;
                }

                public Companion(AbstractC2541f abstractC2541f) {
                    this();
                }
            }

            public Config() {
                this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
            }

            public static Config copy$default(Config config, String str, c cVar, int i3, Object obj) {
                if ((i3 & 1) != 0) {
                    str = config.password;
                }
                if ((i3 & 2) != 0) {
                    cVar = config.data;
                }
                return config.copy(str, cVar);
            }

            public static final void write$Self$auth_kt_release(Config self, b output, SerialDescriptor serialDesc) {
                Config.write$Self(self, output, serialDesc);
                if (output.E(serialDesc) || !m.a(self.password, "")) {
                    output.s(serialDesc, 1, self.password);
                }
                if (!output.E(serialDesc) && self.data == null) {
                    return;
                }
                output.t(serialDesc, 2, x.f27430a, self.data);
            }

            public final String getPassword() {
                return this.password;
            }

            public final c getData() {
                return this.data;
            }

            public final Config copy(String password, c data) {
                m.e(password, "password");
                return new Config(password, data);
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof Config)) {
                    return false;
                }
                Config config = (Config) other;
                return m.a(this.password, config.password) && m.a(this.data, config.data);
            }

            public final c getData() {
                return this.data;
            }

            public final String getPassword() {
                return this.password;
            }

            public int hashCode() {
                int iHashCode = this.password.hashCode() * 31;
                c cVar = this.data;
                return iHashCode + (cVar == null ? 0 : cVar.f24558h.hashCode());
            }

            public final void setData(c cVar) {
                this.data = cVar;
            }

            public final void setPassword(String str) {
                m.e(str, "<set-?>");
                this.password = str;
            }

            public String toString() {
                return "Config(password=" + this.password + ", data=" + this.data + ')';
            }

            public Config(int i3, String str, String str2, c cVar, k0 k0Var) {
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

            public Config(String str, c cVar, int i3, AbstractC2541f abstractC2541f) {
                this((i3 & 1) != 0 ? "" : str, (i3 & 2) != 0 ? null : cVar);
            }

            public Config(String password, c cVar) {
                m.e(password, "password");
                this.password = password;
                this.data = cVar;
            }
        }

        private Signup() {
        }

        public boolean equals(Object other) {
            return this == other || (other instanceof Signup);
        }

        @Override
        public String getType() {
            return type;
        }

        public int hashCode() {
            return 1012539133;
        }

        public String toString() {
            return "Signup";
        }

        @Override
        @SupabaseInternal
        public Config createConfig(j config) {
            m.e(config, "config");
            Config config2 = new Config(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
            config.invoke(config2);
            return config2;
        }
    }

    @SupabaseInternal
    C createConfig(j config);

    String getType();

    @Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\b\u0017\u0018\u0000 \u00182\u00020\u0001:\u0002\u0019\u0018B\u0007¢\u0006\u0004\b\u0002\u0010\u0003B%\b\u0016\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\u0002\u0010\nJ'\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u000b\u001a\u00020\u00002\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\u000eH\u0007¢\u0006\u0004\b\u0011\u0010\u0012R\"\u0010\u0007\u001a\u00020\u00068\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0007\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015\"\u0004\b\u0016\u0010\u0017¨\u0006\u001a"}, d2 = {"Lio/github/jan/supabase/auth/admin/LinkType$Config;", "", "<init>", "()V", "", "seen0", "", "email", "Lr8/k0;", "serializationConstructorMarker", "(ILjava/lang/String;Lr8/k0;)V", "self", "Lq8/b;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "Lh6/A;", "write$Self", "(Lio/github/jan/supabase/auth/admin/LinkType$Config;Lq8/b;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "Ljava/lang/String;", "getEmail", "()Ljava/lang/String;", "setEmail", "(Ljava/lang/String;)V", "Companion", "$serializer", "auth-kt_release"}, k = 1, mv = {2, 1, 0}, xi = NalUnitUtil.H265_NAL_UNIT_TYPE_UNSPECIFIED)
    @i
    public static class Config {

        public static final Companion INSTANCE = new Companion(null);
        private String email;

        @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¨\u0006\u0007"}, d2 = {"Lio/github/jan/supabase/auth/admin/LinkType$Config$Companion;", "", "<init>", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lio/github/jan/supabase/auth/admin/LinkType$Config;", "auth-kt_release"}, k = 1, mv = {2, 1, 0}, xi = NalUnitUtil.H265_NAL_UNIT_TYPE_UNSPECIFIED)
        public static final class Companion {
            private Companion() {
            }

            public final KSerializer serializer() {
                return LinkType$Config$$serializer.INSTANCE;
            }

            public Companion(AbstractC2541f abstractC2541f) {
                this();
            }
        }

        public Config() {
            this.email = "";
        }

        public static final void write$Self(Config self, b output, SerialDescriptor serialDesc) {
            if (!output.E(serialDesc) && m.a(self.email, "")) {
                return;
            }
            output.s(serialDesc, 0, self.email);
        }

        public final String getEmail() {
            return this.email;
        }

        public final void setEmail(String str) {
            m.e(str, "<set-?>");
            this.email = str;
        }

        public Config(int i3, String str, k0 k0Var) {
            if ((i3 & 1) == 0) {
                this.email = "";
            } else {
                this.email = str;
            }
        }
    }
}
