package io.github.jan.supabase.auth.mfa;

/* JADX INFO: loaded from: classes4.dex */
@kotlin.Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\b\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\u000b\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0087\b\u0018\u0000 .2\u00020\u0001:\u0002/.B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0006B7\b\u0010\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\n\u001a\u00020\t\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u000b¢\u0006\u0004\b\u0005\u0010\rJ'\u0010\u0016\u001a\u00020\u00132\u0006\u0010\u000e\u001a\u00020\u00002\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0012\u001a\u00020\u0011H\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0017\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0017\u0010\u0018J\u0010\u0010\u0019\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0019\u0010\u0018J$\u0010\u001a\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\u001a\u0010\u001bJ\u0010\u0010\u001c\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u001c\u0010\u0018J\u0010\u0010\u001d\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\u001d\u0010\u001eJ\u001a\u0010!\u001a\u00020 2\b\u0010\u001f\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b!\u0010\"R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010#\u001a\u0004\b$\u0010\u0018R \u0010\u0004\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0004\u0010#\u0012\u0004\b&\u0010'\u001a\u0004\b%\u0010\u0018R\u001a\u0010\n\u001a\u00020\t8\u0002X\u0083D¢\u0006\f\n\u0004\b\n\u0010(\u0012\u0004\b)\u0010'R\u0011\u0010-\u001a\u00020*8F¢\u0006\u0006\u001a\u0004\b+\u0010,¨\u00060"}, d2 = {"Lio/github/jan/supabase/auth/mfa/MfaChallenge;", "", "", "id", "factorType", "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", "", "seen0", "", "expiresAtSeconds", "Lr8/k0;", "serializationConstructorMarker", "(ILjava/lang/String;Ljava/lang/String;JLr8/k0;)V", "self", "Lq8/b;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "Lh6/A;", "write$Self$auth_kt_release", "(Lio/github/jan/supabase/auth/mfa/MfaChallenge;Lq8/b;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "write$Self", "component1", "()Ljava/lang/String;", "component2", "copy", "(Ljava/lang/String;Ljava/lang/String;)Lio/github/jan/supabase/auth/mfa/MfaChallenge;", "toString", "hashCode", "()I", io.sentry.protocol.Request.JsonKeys.OTHER, "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getId", "getFactorType", "getFactorType$annotations", "()V", "J", "getExpiresAtSeconds$annotations", "Ld8/d;", "getExpiresAt", "()Ld8/d;", "expiresAt", "Companion", "$serializer", "auth-kt_release"}, k = 1, mv = {2, 1, 0}, xi = androidx.media3.container.NalUnitUtil.H265_NAL_UNIT_TYPE_UNSPECIFIED)
@p119n8.i
public final /* data */ class MfaChallenge {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final io.github.jan.supabase.auth.mfa.MfaChallenge.Companion INSTANCE = new io.github.jan.supabase.auth.mfa.MfaChallenge.Companion(null);
    private final long expiresAtSeconds;
    private final java.lang.String factorType;
    private final java.lang.String id;

    @kotlin.Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¨\u0006\u0007"}, d2 = {"Lio/github/jan/supabase/auth/mfa/MfaChallenge$Companion;", "", "<init>", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lio/github/jan/supabase/auth/mfa/MfaChallenge;", "auth-kt_release"}, k = 1, mv = {2, 1, 0}, xi = androidx.media3.container.NalUnitUtil.H265_NAL_UNIT_TYPE_UNSPECIFIED)
    public static final class Companion {
        private Companion() {
        }

        public final kotlinx.serialization.KSerializer serializer() {
            return io.github.jan.supabase.auth.mfa.MfaChallenge$$serializer.INSTANCE;
        }

        public /* synthetic */ Companion(kotlin.jvm.internal.AbstractC2541f abstractC2541f) {
            this();
        }
    }

    public /* synthetic */ MfaChallenge(int i3, java.lang.String str, java.lang.String str2, long j, p153r8.k0 k0Var) {
        if (3 != (i3 & 3)) {
            p153r8.AbstractC2686a0.l(i3, 3, io.github.jan.supabase.auth.mfa.MfaChallenge$$serializer.INSTANCE.getDescriptor());
            throw null;
        }
        this.id = str;
        this.factorType = str2;
        if ((i3 & 4) == 0) {
            this.expiresAtSeconds = 0L;
        } else {
            this.expiresAtSeconds = j;
        }
    }

    public static /* synthetic */ io.github.jan.supabase.auth.mfa.MfaChallenge copy$default(io.github.jan.supabase.auth.mfa.MfaChallenge mfaChallenge, java.lang.String str, java.lang.String str2, int i3, java.lang.Object obj) {
        if ((i3 & 1) != 0) {
            str = mfaChallenge.id;
        }
        if ((i3 & 2) != 0) {
            str2 = mfaChallenge.factorType;
        }
        return mfaChallenge.copy(str, str2);
    }

    @p119n8.h("expires_at")
    private static /* synthetic */ void getExpiresAtSeconds$annotations() {
    }

    @p119n8.h("type")
    public static /* synthetic */ void getFactorType$annotations() {
    }

    public static final /* synthetic */ void write$Self$auth_kt_release(io.github.jan.supabase.auth.mfa.MfaChallenge self, p143q8.b output, kotlinx.serialization.descriptors.SerialDescriptor serialDesc) {
        output.s(serialDesc, 0, self.id);
        output.s(serialDesc, 1, self.factorType);
        if (!output.E(serialDesc) && self.expiresAtSeconds == 0) {
            return;
        }
        output.D(serialDesc, 2, self.expiresAtSeconds);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final java.lang.String getId() {
        return this.id;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final java.lang.String getFactorType() {
        return this.factorType;
    }

    public final io.github.jan.supabase.auth.mfa.MfaChallenge copy(java.lang.String id, java.lang.String factorType) {
        kotlin.jvm.internal.m.e(id, "id");
        kotlin.jvm.internal.m.e(factorType, "factorType");
        return new io.github.jan.supabase.auth.mfa.MfaChallenge(id, factorType);
    }

    public boolean equals(java.lang.Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof io.github.jan.supabase.auth.mfa.MfaChallenge)) {
            return false;
        }
        io.github.jan.supabase.auth.mfa.MfaChallenge mfaChallenge = (io.github.jan.supabase.auth.mfa.MfaChallenge) other;
        return kotlin.jvm.internal.m.a(this.id, mfaChallenge.id) && kotlin.jvm.internal.m.a(this.factorType, mfaChallenge.factorType);
    }

    public final p036d8.d getExpiresAt() {
        p036d8.c cVar = p036d8.d.Companion;
        long j = this.expiresAtSeconds;
        cVar.getClass();
        return p036d8.c.a(j, 0L);
    }

    public final java.lang.String getFactorType() {
        return this.factorType;
    }

    public final java.lang.String getId() {
        return this.id;
    }

    public int hashCode() {
        return this.factorType.hashCode() + (this.id.hashCode() * 31);
    }

    public java.lang.String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder("MfaChallenge(id=");
        sb.append(this.id);
        sb.append(", factorType=");
        return Y6.f.l(sb, this.factorType, ')');
    }

    public MfaChallenge(java.lang.String id, java.lang.String factorType) {
        kotlin.jvm.internal.m.e(id, "id");
        kotlin.jvm.internal.m.e(factorType, "factorType");
        this.id = id;
        this.factorType = factorType;
    }
}
