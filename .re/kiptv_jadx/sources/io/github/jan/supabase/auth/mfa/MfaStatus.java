package io.github.jan.supabase.auth.mfa;

/* JADX INFO: loaded from: classes4.dex */
@kotlin.Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\f\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\t\u0010\n\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000b\u001a\u00020\u0003HÆ\u0003J\u001d\u0010\f\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\r\u001a\u00020\u00032\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u000f\u001a\u00020\u0010HÖ\u0001J\t\u0010\u0011\u001a\u00020\u0012HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\b¨\u0006\u0013"}, d2 = {"Lio/github/jan/supabase/auth/mfa/MfaStatus;", "", "enabled", "", "active", "<init>", "(ZZ)V", "getEnabled", "()Z", "getActive", "component1", "component2", "copy", "equals", io.sentry.protocol.Request.JsonKeys.OTHER, "hashCode", "", "toString", "", "auth-kt_release"}, k = 1, mv = {2, 1, 0}, xi = androidx.media3.container.NalUnitUtil.H265_NAL_UNIT_TYPE_UNSPECIFIED)
public final /* data */ class MfaStatus {
    private final boolean active;
    private final boolean enabled;

    public MfaStatus(boolean z6, boolean z9) {
        this.enabled = z6;
        this.active = z9;
    }

    public static /* synthetic */ io.github.jan.supabase.auth.mfa.MfaStatus copy$default(io.github.jan.supabase.auth.mfa.MfaStatus mfaStatus, boolean z6, boolean z9, int i3, java.lang.Object obj) {
        if ((i3 & 1) != 0) {
            z6 = mfaStatus.enabled;
        }
        if ((i3 & 2) != 0) {
            z9 = mfaStatus.active;
        }
        return mfaStatus.copy(z6, z9);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final boolean getEnabled() {
        return this.enabled;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final boolean getActive() {
        return this.active;
    }

    public final io.github.jan.supabase.auth.mfa.MfaStatus copy(boolean enabled, boolean active) {
        return new io.github.jan.supabase.auth.mfa.MfaStatus(enabled, active);
    }

    public boolean equals(java.lang.Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof io.github.jan.supabase.auth.mfa.MfaStatus)) {
            return false;
        }
        io.github.jan.supabase.auth.mfa.MfaStatus mfaStatus = (io.github.jan.supabase.auth.mfa.MfaStatus) other;
        return this.enabled == mfaStatus.enabled && this.active == mfaStatus.active;
    }

    public final boolean getActive() {
        return this.active;
    }

    public final boolean getEnabled() {
        return this.enabled;
    }

    public int hashCode() {
        return java.lang.Boolean.hashCode(this.active) + (java.lang.Boolean.hashCode(this.enabled) * 31);
    }

    public java.lang.String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder("MfaStatus(enabled=");
        sb.append(this.enabled);
        sb.append(", active=");
        return v5.L.a(sb, this.active, ')');
    }
}
