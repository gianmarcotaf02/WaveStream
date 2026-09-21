package io.github.jan.supabase.auth.mfa;

/* JADX INFO: loaded from: classes4.dex */
@kotlin.Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0010\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u0000*\u0004\b\u0000\u0010\u00012\u00020\u0002B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00028\u0000¢\u0006\u0004\b\u0007\u0010\bJ\t\u0010\u000f\u001a\u00020\u0004HÆ\u0003J\t\u0010\u0010\u001a\u00020\u0004HÆ\u0003J\u000e\u0010\u0011\u001a\u00028\u0000HÆ\u0003¢\u0006\u0002\u0010\rJ2\u0010\u0012\u001a\b\u0012\u0004\u0012\u00028\u00000\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00042\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0006\u001a\u00028\u0000HÆ\u0001¢\u0006\u0002\u0010\u0013J\u0013\u0010\u0014\u001a\u00020\u00152\b\u0010\u0016\u001a\u0004\u0018\u00010\u0002HÖ\u0003J\t\u0010\u0017\u001a\u00020\u0018HÖ\u0001J\t\u0010\u0019\u001a\u00020\u0004HÖ\u0001R\u0011\u0010\u0003\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0011\u0010\u0005\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\nR\u0013\u0010\u0006\u001a\u00028\u0000¢\u0006\n\n\u0002\u0010\u000e\u001a\u0004\b\f\u0010\r¨\u0006\u001a"}, d2 = {"Lio/github/jan/supabase/auth/mfa/MfaFactor;", "T", "", "id", "", "type", "data", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Object;)V", "getId", "()Ljava/lang/String;", "getType", "getData", "()Ljava/lang/Object;", "Ljava/lang/Object;", "component1", "component2", "component3", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Object;)Lio/github/jan/supabase/auth/mfa/MfaFactor;", "equals", "", io.sentry.protocol.Request.JsonKeys.OTHER, "hashCode", "", "toString", "auth-kt_release"}, k = 1, mv = {2, 1, 0}, xi = androidx.media3.container.NalUnitUtil.H265_NAL_UNIT_TYPE_UNSPECIFIED)
public final /* data */ class MfaFactor<T> {
    private final T data;
    private final java.lang.String id;
    private final java.lang.String type;

    public MfaFactor(java.lang.String id, java.lang.String type, T t9) {
        kotlin.jvm.internal.m.e(id, "id");
        kotlin.jvm.internal.m.e(type, "type");
        this.id = id;
        this.type = type;
        this.data = t9;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ io.github.jan.supabase.auth.mfa.MfaFactor copy$default(io.github.jan.supabase.auth.mfa.MfaFactor mfaFactor, java.lang.String str, java.lang.String str2, java.lang.Object obj, int i3, java.lang.Object obj2) {
        if ((i3 & 1) != 0) {
            str = mfaFactor.id;
        }
        if ((i3 & 2) != 0) {
            str2 = mfaFactor.type;
        }
        if ((i3 & 4) != 0) {
            obj = mfaFactor.data;
        }
        return mfaFactor.copy(str, str2, obj);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final java.lang.String getId() {
        return this.id;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final java.lang.String getType() {
        return this.type;
    }

    public final T component3() {
        return this.data;
    }

    public final io.github.jan.supabase.auth.mfa.MfaFactor<T> copy(java.lang.String id, java.lang.String type, T data) {
        kotlin.jvm.internal.m.e(id, "id");
        kotlin.jvm.internal.m.e(type, "type");
        return new io.github.jan.supabase.auth.mfa.MfaFactor<>(id, type, data);
    }

    public boolean equals(java.lang.Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof io.github.jan.supabase.auth.mfa.MfaFactor)) {
            return false;
        }
        io.github.jan.supabase.auth.mfa.MfaFactor mfaFactor = (io.github.jan.supabase.auth.mfa.MfaFactor) other;
        return kotlin.jvm.internal.m.a(this.id, mfaFactor.id) && kotlin.jvm.internal.m.a(this.type, mfaFactor.type) && kotlin.jvm.internal.m.a(this.data, mfaFactor.data);
    }

    public final T getData() {
        return this.data;
    }

    public final java.lang.String getId() {
        return this.id;
    }

    public final java.lang.String getType() {
        return this.type;
    }

    public int hashCode() {
        int iA = B2.a.a(this.id.hashCode() * 31, 31, this.type);
        T t9 = this.data;
        return iA + (t9 == null ? 0 : t9.hashCode());
    }

    public java.lang.String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder("MfaFactor(id=");
        sb.append(this.id);
        sb.append(", type=");
        sb.append(this.type);
        sb.append(", data=");
        return B2.a.n(sb, this.data, ')');
    }
}
