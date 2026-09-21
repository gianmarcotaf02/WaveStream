package io.github.jan.supabase.auth;

import androidx.media3.container.NalUnitUtil;
import io.sentry.protocol.Request;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC2541f;
import kotlin.jvm.internal.m;
import p070h6.A;
import p128p.d;
import p194x6.j;

@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u0000 \u00042\u00020\u0001:\u0003\u0002\u0003\u0004\u0082\u0001\u0002\u0005\u0006¨\u0006\u0007"}, d2 = {"Lio/github/jan/supabase/auth/ExternalAuthAction;", "", "ExternalBrowser", "CustomTabs", "Companion", "Lio/github/jan/supabase/auth/ExternalAuthAction$CustomTabs;", "Lio/github/jan/supabase/auth/ExternalAuthAction$ExternalBrowser;", "auth-kt_release"}, k = 1, mv = {2, 1, 0}, xi = NalUnitUtil.H265_NAL_UNIT_TYPE_UNSPECIFIED)
public interface ExternalAuthAction {

    public static final Companion INSTANCE = Companion.$$INSTANCE;

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lio/github/jan/supabase/auth/ExternalAuthAction$Companion;", "", "<init>", "()V", "DEFAULT", "Lio/github/jan/supabase/auth/ExternalAuthAction;", "getDEFAULT", "()Lio/github/jan/supabase/auth/ExternalAuthAction;", "auth-kt_release"}, k = 1, mv = {2, 1, 0}, xi = NalUnitUtil.H265_NAL_UNIT_TYPE_UNSPECIFIED)
    public static final class Companion {
        static final Companion $$INSTANCE = new Companion();
        private static final ExternalAuthAction DEFAULT = ExternalBrowser.INSTANCE;

        private Companion() {
        }

        public final ExternalAuthAction getDEFAULT() {
            return DEFAULT;
        }
    }

    @Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\b\u0086\b\u0018\u00002\u00020\u0001B\u001d\u0012\u0014\b\u0002\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0002¢\u0006\u0004\b\u0006\u0010\u0007J\u001c\u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0002HÆ\u0003¢\u0006\u0004\b\b\u0010\tJ&\u0010\n\u001a\u00020\u00002\u0014\b\u0002\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0002HÆ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u001a\u0010\u0015\u001a\u00020\u00142\b\u0010\u0013\u001a\u0004\u0018\u00010\u0012HÖ\u0003¢\u0006\u0004\b\u0015\u0010\u0016R#\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u00028\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0017\u001a\u0004\b\u0018\u0010\t¨\u0006\u0019"}, d2 = {"Lio/github/jan/supabase/auth/ExternalAuthAction$CustomTabs;", "Lio/github/jan/supabase/auth/ExternalAuthAction;", "Lkotlin/Function1;", "Lp/d;", "Lh6/A;", "intentBuilder", "<init>", "(Lx6/j;)V", "component1", "()Lx6/j;", "copy", "(Lx6/j;)Lio/github/jan/supabase/auth/ExternalAuthAction$CustomTabs;", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", Request.JsonKeys.OTHER, "", "equals", "(Ljava/lang/Object;)Z", "Lx6/j;", "getIntentBuilder", "auth-kt_release"}, k = 1, mv = {2, 1, 0}, xi = NalUnitUtil.H265_NAL_UNIT_TYPE_UNSPECIFIED)
    public static final class CustomTabs implements ExternalAuthAction {
        private final j intentBuilder;

        public CustomTabs() {
            this(null, 1, 0 == true ? 1 : 0);
        }

        public static final A _init_$lambda$0(d dVar) {
            m.e(dVar, "<this>");
            return A.f22523a;
        }

        public static CustomTabs copy$default(CustomTabs customTabs, j jVar, int i3, Object obj) {
            if ((i3 & 1) != 0) {
                jVar = customTabs.intentBuilder;
            }
            return customTabs.copy(jVar);
        }

        public final j getIntentBuilder() {
            return this.intentBuilder;
        }

        public final CustomTabs copy(j intentBuilder) {
            m.e(intentBuilder, "intentBuilder");
            return new CustomTabs(intentBuilder);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof CustomTabs) && m.a(this.intentBuilder, ((CustomTabs) other).intentBuilder);
        }

        public final j getIntentBuilder() {
            return this.intentBuilder;
        }

        public int hashCode() {
            return this.intentBuilder.hashCode();
        }

        public String toString() {
            return "CustomTabs(intentBuilder=" + this.intentBuilder + ')';
        }

        public CustomTabs(j intentBuilder) {
            m.e(intentBuilder, "intentBuilder");
            this.intentBuilder = intentBuilder;
        }

        public CustomTabs(j jVar, int i3, AbstractC2541f abstractC2541f) {
            this((i3 & 1) != 0 ? new a(4) : jVar);
        }
    }

    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007HÖ\u0003J\t\u0010\b\u001a\u00020\tHÖ\u0001J\t\u0010\n\u001a\u00020\u000bHÖ\u0001¨\u0006\f"}, d2 = {"Lio/github/jan/supabase/auth/ExternalAuthAction$ExternalBrowser;", "Lio/github/jan/supabase/auth/ExternalAuthAction;", "<init>", "()V", "equals", "", Request.JsonKeys.OTHER, "", "hashCode", "", "toString", "", "auth-kt_release"}, k = 1, mv = {2, 1, 0}, xi = NalUnitUtil.H265_NAL_UNIT_TYPE_UNSPECIFIED)
    public static final class ExternalBrowser implements ExternalAuthAction {
        public static final ExternalBrowser INSTANCE = new ExternalBrowser();

        private ExternalBrowser() {
        }

        public boolean equals(Object other) {
            return this == other || (other instanceof ExternalBrowser);
        }

        public int hashCode() {
            return -1146440786;
        }

        public String toString() {
            return "ExternalBrowser";
        }
    }
}
