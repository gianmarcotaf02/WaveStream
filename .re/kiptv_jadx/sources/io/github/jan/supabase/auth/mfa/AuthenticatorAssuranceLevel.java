package io.github.jan.supabase.auth.mfa;

/* JADX INFO: loaded from: classes4.dex */
@kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0006\b\u0086\u0081\u0002\u0018\u0000 \u00062\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u0006B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005¨\u0006\u0007"}, d2 = {"Lio/github/jan/supabase/auth/mfa/AuthenticatorAssuranceLevel;", "", "<init>", "(Ljava/lang/String;I)V", "AAL1", "AAL2", "Companion", "auth-kt_release"}, k = 1, mv = {2, 1, 0}, xi = androidx.media3.container.NalUnitUtil.H265_NAL_UNIT_TYPE_UNSPECIFIED)
public enum AuthenticatorAssuranceLevel {
    AAL1,
    AAL2;

    private static final /* synthetic */ p126o6.a $ENTRIES = com.google.crypto.tink.shaded.protobuf.q0.t(values());

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final io.github.jan.supabase.auth.mfa.AuthenticatorAssuranceLevel.Companion INSTANCE = new io.github.jan.supabase.auth.mfa.AuthenticatorAssuranceLevel.Companion(null);

    @kotlin.Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u000e\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007¨\u0006\b"}, d2 = {"Lio/github/jan/supabase/auth/mfa/AuthenticatorAssuranceLevel$Companion;", "", "<init>", "()V", "from", "Lio/github/jan/supabase/auth/mfa/AuthenticatorAssuranceLevel;", "value", "", "auth-kt_release"}, k = 1, mv = {2, 1, 0}, xi = androidx.media3.container.NalUnitUtil.H265_NAL_UNIT_TYPE_UNSPECIFIED)
    public static final class Companion {
        public /* synthetic */ Companion(kotlin.jvm.internal.AbstractC2541f abstractC2541f) {
            this();
        }

        public final io.github.jan.supabase.auth.mfa.AuthenticatorAssuranceLevel from(java.lang.String value) {
            kotlin.jvm.internal.m.e(value, "value");
            if (value.equals("aal1")) {
                return io.github.jan.supabase.auth.mfa.AuthenticatorAssuranceLevel.AAL1;
            }
            if (value.equals("aal2")) {
                return io.github.jan.supabase.auth.mfa.AuthenticatorAssuranceLevel.AAL2;
            }
            throw new java.lang.IllegalArgumentException("Unknown AuthenticatorAssuranceLevel: ".concat(value));
        }

        private Companion() {
        }
    }

    public static p126o6.a getEntries() {
        return $ENTRIES;
    }
}
