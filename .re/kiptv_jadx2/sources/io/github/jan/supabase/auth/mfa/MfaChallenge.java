package io.github.jan.supabase.auth.mfa;

import Y6.f;
import androidx.media3.container.NalUnitUtil;
import io.sentry.protocol.Request;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC2541f;
import kotlin.jvm.internal.m;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import p036d8.c;
import p036d8.d;
import p119n8.h;
import p119n8.i;
import p143q8.b;
import p153r8.AbstractC2686a0;
import p153r8.k0;

@Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\b\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\u000b\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0087\b\u0018\u0000 .2\u00020\u0001:\u0002/.B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0006B7\b\u0010\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\n\u001a\u00020\t\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u000b¢\u0006\u0004\b\u0005\u0010\rJ'\u0010\u0016\u001a\u00020\u00132\u0006\u0010\u000e\u001a\u00020\u00002\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0012\u001a\u00020\u0011H\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0017\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0017\u0010\u0018J\u0010\u0010\u0019\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0019\u0010\u0018J$\u0010\u001a\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\u001a\u0010\u001bJ\u0010\u0010\u001c\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u001c\u0010\u0018J\u0010\u0010\u001d\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\u001d\u0010\u001eJ\u001a\u0010!\u001a\u00020 2\b\u0010\u001f\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b!\u0010\"R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010#\u001a\u0004\b$\u0010\u0018R \u0010\u0004\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0004\u0010#\u0012\u0004\b&\u0010'\u001a\u0004\b%\u0010\u0018R\u001a\u0010\n\u001a\u00020\t8\u0002X\u0083D¢\u0006\f\n\u0004\b\n\u0010(\u0012\u0004\b)\u0010'R\u0011\u0010-\u001a\u00020*8F¢\u0006\u0006\u001a\u0004\b+\u0010,¨\u00060"}, d2 = {"Lio/github/jan/supabase/auth/mfa/MfaChallenge;", "", "", "id", "factorType", "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", "", "seen0", "", "expiresAtSeconds", "Lr8/k0;", "serializationConstructorMarker", "(ILjava/lang/String;Ljava/lang/String;JLr8/k0;)V", "self", "Lq8/b;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "Lh6/A;", "write$Self$auth_kt_release", "(Lio/github/jan/supabase/auth/mfa/MfaChallenge;Lq8/b;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "write$Self", "component1", "()Ljava/lang/String;", "component2", "copy", "(Ljava/lang/String;Ljava/lang/String;)Lio/github/jan/supabase/auth/mfa/MfaChallenge;", "toString", "hashCode", "()I", Request.JsonKeys.OTHER, "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getId", "getFactorType", "getFactorType$annotations", "()V", "J", "getExpiresAtSeconds$annotations", "Ld8/d;", "getExpiresAt", "()Ld8/d;", "expiresAt", "Companion", "$serializer", "auth-kt_release"}, k = 1, mv = {2, 1, 0}, xi = NalUnitUtil.H265_NAL_UNIT_TYPE_UNSPECIFIED)
@i
public final class MfaChallenge {

    public static final Companion INSTANCE = new Companion(null);
    private final long expiresAtSeconds;
    private final String factorType;
    private final String id;

    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¨\u0006\u0007"}, d2 = {"Lio/github/jan/supabase/auth/mfa/MfaChallenge$Companion;", "", "<init>", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lio/github/jan/supabase/auth/mfa/MfaChallenge;", "auth-kt_release"}, k = 1, mv = {2, 1, 0}, xi = NalUnitUtil.H265_NAL_UNIT_TYPE_UNSPECIFIED)
    public static final class Companion {
        private Companion() {
        }

        public final KSerializer serializer() {
            return MfaChallenge$$serializer.INSTANCE;
        }

        public Companion(AbstractC2541f abstractC2541f) {
            this();
        }
    }

    public MfaChallenge(int i3, String str, String str2, long j, k0 k0Var) {
        if (3 != (i3 & 3)) {
            AbstractC2686a0.l(i3, 3, MfaChallenge$$serializer.INSTANCE.getDescriptor());
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

    public static MfaChallenge copy$default(MfaChallenge mfaChallenge, String str, String str2, int i3, Object obj) {
        if ((i3 & 1) != 0) {
            str = mfaChallenge.id;
        }
        if ((i3 & 2) != 0) {
            str2 = mfaChallenge.factorType;
        }
        return mfaChallenge.copy(str, str2);
    }

    @h("expires_at")
    private static void getExpiresAtSeconds$annotations() {
    }

    @h("type")
    public static void getFactorType$annotations() {
    }

    public static final void write$Self$auth_kt_release(MfaChallenge self, b output, SerialDescriptor serialDesc) {
        output.s(serialDesc, 0, self.id);
        output.s(serialDesc, 1, self.factorType);
        if (!output.E(serialDesc) && self.expiresAtSeconds == 0) {
            return;
        }
        output.D(serialDesc, 2, self.expiresAtSeconds);
    }

    public final String getId() {
        return this.id;
    }

    public final String getFactorType() {
        return this.factorType;
    }

    public final MfaChallenge copy(String id, String factorType) {
        m.e(id, "id");
        m.e(factorType, "factorType");
        return new MfaChallenge(id, factorType);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof MfaChallenge)) {
            return false;
        }
        MfaChallenge mfaChallenge = (MfaChallenge) other;
        return m.a(this.id, mfaChallenge.id) && m.a(this.factorType, mfaChallenge.factorType);
    }

    public final d getExpiresAt() {
        c cVar = d.Companion;
        long j = this.expiresAtSeconds;
        cVar.getClass();
        return c.a(j, 0L);
    }

    public final String getFactorType() {
        return this.factorType;
    }

    public final String getId() {
        return this.id;
    }

    public int hashCode() {
        return this.factorType.hashCode() + (this.id.hashCode() * 31);
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("MfaChallenge(id=");
        sb.append(this.id);
        sb.append(", factorType=");
        return f.l(sb, this.factorType, ')');
    }

    public MfaChallenge(String id, String factorType) {
        m.e(id, "id");
        m.e(factorType, "factorType");
        this.id = id;
        this.factorType = factorType;
    }
}
