package io.github.jan.supabase.auth;

/* JADX INFO: loaded from: classes4.dex */
@kotlin.Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u0000 \u00042\u00020\u0001:\u0003\u0002\u0003\u0004\u0082\u0001\u0002\u0005\u0006¨\u0006\u0007"}, d2 = {"Lio/github/jan/supabase/auth/ExternalAuthAction;", "", "ExternalBrowser", "CustomTabs", "Companion", "Lio/github/jan/supabase/auth/ExternalAuthAction$CustomTabs;", "Lio/github/jan/supabase/auth/ExternalAuthAction$ExternalBrowser;", "auth-kt_release"}, k = 1, mv = {2, 1, 0}, xi = androidx.media3.container.NalUnitUtil.H265_NAL_UNIT_TYPE_UNSPECIFIED)
public interface ExternalAuthAction {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final io.github.jan.supabase.auth.ExternalAuthAction.Companion INSTANCE = io.github.jan.supabase.auth.ExternalAuthAction.Companion.$$INSTANCE;

    @kotlin.Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lio/github/jan/supabase/auth/ExternalAuthAction$Companion;", "", "<init>", "()V", "DEFAULT", "Lio/github/jan/supabase/auth/ExternalAuthAction;", "getDEFAULT", "()Lio/github/jan/supabase/auth/ExternalAuthAction;", "auth-kt_release"}, k = 1, mv = {2, 1, 0}, xi = androidx.media3.container.NalUnitUtil.H265_NAL_UNIT_TYPE_UNSPECIFIED)
    public static final class Companion {
        static final /* synthetic */ io.github.jan.supabase.auth.ExternalAuthAction.Companion $$INSTANCE = new io.github.jan.supabase.auth.ExternalAuthAction.Companion();
        private static final io.github.jan.supabase.auth.ExternalAuthAction DEFAULT = io.github.jan.supabase.auth.ExternalAuthAction.ExternalBrowser.INSTANCE;

        private Companion() {
        }

        public final io.github.jan.supabase.auth.ExternalAuthAction getDEFAULT() {
            return DEFAULT;
        }
    }

    @kotlin.Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\b\u0086\b\u0018\u00002\u00020\u0001B\u001d\u0012\u0014\b\u0002\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0002¢\u0006\u0004\b\u0006\u0010\u0007J\u001c\u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0002HÆ\u0003¢\u0006\u0004\b\b\u0010\tJ&\u0010\n\u001a\u00020\u00002\u0014\b\u0002\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0002HÆ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u001a\u0010\u0015\u001a\u00020\u00142\b\u0010\u0013\u001a\u0004\u0018\u00010\u0012HÖ\u0003¢\u0006\u0004\b\u0015\u0010\u0016R#\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u00028\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0017\u001a\u0004\b\u0018\u0010\t¨\u0006\u0019"}, d2 = {"Lio/github/jan/supabase/auth/ExternalAuthAction$CustomTabs;", "Lio/github/jan/supabase/auth/ExternalAuthAction;", "Lkotlin/Function1;", "Lp/d;", "Lh6/A;", "intentBuilder", "<init>", "(Lx6/j;)V", "component1", "()Lx6/j;", "copy", "(Lx6/j;)Lio/github/jan/supabase/auth/ExternalAuthAction$CustomTabs;", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", io.sentry.protocol.Request.JsonKeys.OTHER, "", "equals", "(Ljava/lang/Object;)Z", "Lx6/j;", "getIntentBuilder", "auth-kt_release"}, k = 1, mv = {2, 1, 0}, xi = androidx.media3.container.NalUnitUtil.H265_NAL_UNIT_TYPE_UNSPECIFIED)
    public static final /* data */ class CustomTabs implements io.github.jan.supabase.auth.ExternalAuthAction {
        private final p194x6.j intentBuilder;

        /* JADX WARN: Multi-variable type inference failed */
        public CustomTabs() {
            this(null, 1, 0 == true ? 1 : 0);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final p070h6.A _init_$lambda$0(p128p.d dVar) {
            kotlin.jvm.internal.m.e(dVar, "<this>");
            return p070h6.A.f22523a;
        }

        public static /* synthetic */ io.github.jan.supabase.auth.ExternalAuthAction.CustomTabs copy$default(io.github.jan.supabase.auth.ExternalAuthAction.CustomTabs customTabs, p194x6.j jVar, int i3, java.lang.Object obj) {
            if ((i3 & 1) != 0) {
                jVar = customTabs.intentBuilder;
            }
            return customTabs.copy(jVar);
        }

        /* JADX INFO: renamed from: component1, reason: from getter */
        public final p194x6.j getIntentBuilder() {
            return this.intentBuilder;
        }

        public final io.github.jan.supabase.auth.ExternalAuthAction.CustomTabs copy(p194x6.j intentBuilder) {
            kotlin.jvm.internal.m.e(intentBuilder, "intentBuilder");
            return new io.github.jan.supabase.auth.ExternalAuthAction.CustomTabs(intentBuilder);
        }

        public boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof io.github.jan.supabase.auth.ExternalAuthAction.CustomTabs) && kotlin.jvm.internal.m.a(this.intentBuilder, ((io.github.jan.supabase.auth.ExternalAuthAction.CustomTabs) other).intentBuilder);
        }

        public final p194x6.j getIntentBuilder() {
            return this.intentBuilder;
        }

        public int hashCode() {
            return this.intentBuilder.hashCode();
        }

        public java.lang.String toString() {
            return "CustomTabs(intentBuilder=" + this.intentBuilder + ')';
        }

        public CustomTabs(p194x6.j intentBuilder) {
            kotlin.jvm.internal.m.e(intentBuilder, "intentBuilder");
            this.intentBuilder = intentBuilder;
        }

        public /* synthetic */ CustomTabs(p194x6.j jVar, int i3, kotlin.jvm.internal.AbstractC2541f abstractC2541f) {
            this((i3 & 1) != 0 ? new io.github.jan.supabase.auth.a(4) : jVar);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007HÖ\u0003J\t\u0010\b\u001a\u00020\tHÖ\u0001J\t\u0010\n\u001a\u00020\u000bHÖ\u0001¨\u0006\f"}, d2 = {"Lio/github/jan/supabase/auth/ExternalAuthAction$ExternalBrowser;", "Lio/github/jan/supabase/auth/ExternalAuthAction;", "<init>", "()V", "equals", "", io.sentry.protocol.Request.JsonKeys.OTHER, "", "hashCode", "", "toString", "", "auth-kt_release"}, k = 1, mv = {2, 1, 0}, xi = androidx.media3.container.NalUnitUtil.H265_NAL_UNIT_TYPE_UNSPECIFIED)
    public static final /* data */ class ExternalBrowser implements io.github.jan.supabase.auth.ExternalAuthAction {
        public static final io.github.jan.supabase.auth.ExternalAuthAction.ExternalBrowser INSTANCE = new io.github.jan.supabase.auth.ExternalAuthAction.ExternalBrowser();

        private ExternalBrowser() {
        }

        public boolean equals(java.lang.Object other) {
            return this == other || (other instanceof io.github.jan.supabase.auth.ExternalAuthAction.ExternalBrowser);
        }

        public int hashCode() {
            return -1146440786;
        }

        public java.lang.String toString() {
            return "ExternalBrowser";
        }
    }
}
