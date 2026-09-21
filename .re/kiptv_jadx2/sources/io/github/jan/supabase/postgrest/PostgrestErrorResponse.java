package io.github.jan.supabase.postgrest;

import Y6.f;
import androidx.media3.container.NalUnitUtil;
import io.sentry.protocol.Request;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC2541f;
import kotlin.jvm.internal.m;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import p119n8.i;
import p143q8.b;
import p153r8.AbstractC2686a0;
import p153r8.k0;
import p153r8.p0;

@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0010\u000b\n\u0002\b\n\b\u0081\b\u0018\u0000 *2\u00020\u0001:\u0002+*B3\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0007\u0010\bBC\b\u0010\u0012\u0006\u0010\n\u001a\u00020\t\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u000b¢\u0006\u0004\b\u0007\u0010\rJ'\u0010\u0016\u001a\u00020\u00132\u0006\u0010\u000e\u001a\u00020\u00002\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0012\u001a\u00020\u0011H\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0017\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0017\u0010\u0018J\u0012\u0010\u0019\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0019\u0010\u0018J\u0012\u0010\u001a\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u001a\u0010\u0018J\u0012\u0010\u001b\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u001b\u0010\u0018J>\u0010\u001c\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0002HÆ\u0001¢\u0006\u0004\b\u001c\u0010\u001dJ\u0010\u0010\u001e\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u001e\u0010\u0018J\u0010\u0010\u001f\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\u001f\u0010 J\u001a\u0010#\u001a\u00020\"2\b\u0010!\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b#\u0010$R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010%\u001a\u0004\b&\u0010\u0018R\u0019\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010%\u001a\u0004\b'\u0010\u0018R\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0005\u0010%\u001a\u0004\b(\u0010\u0018R\u0019\u0010\u0006\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0006\u0010%\u001a\u0004\b)\u0010\u0018¨\u0006,"}, d2 = {"Lio/github/jan/supabase/postgrest/PostgrestErrorResponse;", "", "", "message", "hint", "details", "code", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "", "seen0", "Lr8/k0;", "serializationConstructorMarker", "(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lr8/k0;)V", "self", "Lq8/b;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "Lh6/A;", "write$Self$postgrest_kt_release", "(Lio/github/jan/supabase/postgrest/PostgrestErrorResponse;Lq8/b;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "write$Self", "component1", "()Ljava/lang/String;", "component2", "component3", "component4", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lio/github/jan/supabase/postgrest/PostgrestErrorResponse;", "toString", "hashCode", "()I", Request.JsonKeys.OTHER, "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getMessage", "getHint", "getDetails", "getCode", "Companion", "$serializer", "postgrest-kt_release"}, k = 1, mv = {2, 1, 0}, xi = NalUnitUtil.H265_NAL_UNIT_TYPE_UNSPECIFIED)
@i
public final class PostgrestErrorResponse {

    public static final Companion INSTANCE = new Companion(null);
    private final String code;
    private final String details;
    private final String hint;
    private final String message;

    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¨\u0006\u0007"}, d2 = {"Lio/github/jan/supabase/postgrest/PostgrestErrorResponse$Companion;", "", "<init>", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lio/github/jan/supabase/postgrest/PostgrestErrorResponse;", "postgrest-kt_release"}, k = 1, mv = {2, 1, 0}, xi = NalUnitUtil.H265_NAL_UNIT_TYPE_UNSPECIFIED)
    public static final class Companion {
        private Companion() {
        }

        public final KSerializer serializer() {
            return PostgrestErrorResponse$$serializer.INSTANCE;
        }

        public Companion(AbstractC2541f abstractC2541f) {
            this();
        }
    }

    public PostgrestErrorResponse(int i3, String str, String str2, String str3, String str4, k0 k0Var) {
        if (1 != (i3 & 1)) {
            AbstractC2686a0.l(i3, 1, PostgrestErrorResponse$$serializer.INSTANCE.getDescriptor());
            throw null;
        }
        this.message = str;
        if ((i3 & 2) == 0) {
            this.hint = null;
        } else {
            this.hint = str2;
        }
        if ((i3 & 4) == 0) {
            this.details = null;
        } else {
            this.details = str3;
        }
        if ((i3 & 8) == 0) {
            this.code = null;
        } else {
            this.code = str4;
        }
    }

    public static PostgrestErrorResponse copy$default(PostgrestErrorResponse postgrestErrorResponse, String str, String str2, String str3, String str4, int i3, Object obj) {
        if ((i3 & 1) != 0) {
            str = postgrestErrorResponse.message;
        }
        if ((i3 & 2) != 0) {
            str2 = postgrestErrorResponse.hint;
        }
        if ((i3 & 4) != 0) {
            str3 = postgrestErrorResponse.details;
        }
        if ((i3 & 8) != 0) {
            str4 = postgrestErrorResponse.code;
        }
        return postgrestErrorResponse.copy(str, str2, str3, str4);
    }

    public static final void write$Self$postgrest_kt_release(PostgrestErrorResponse self, b output, SerialDescriptor serialDesc) {
        output.s(serialDesc, 0, self.message);
        if (output.E(serialDesc) || self.hint != null) {
            output.t(serialDesc, 1, p0.f26988a, self.hint);
        }
        if (output.E(serialDesc) || self.details != null) {
            output.t(serialDesc, 2, p0.f26988a, self.details);
        }
        if (!output.E(serialDesc) && self.code == null) {
            return;
        }
        output.t(serialDesc, 3, p0.f26988a, self.code);
    }

    public final String getMessage() {
        return this.message;
    }

    public final String getHint() {
        return this.hint;
    }

    public final String getDetails() {
        return this.details;
    }

    public final String getCode() {
        return this.code;
    }

    public final PostgrestErrorResponse copy(String message, String hint, String details, String code) {
        m.e(message, "message");
        return new PostgrestErrorResponse(message, hint, details, code);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof PostgrestErrorResponse)) {
            return false;
        }
        PostgrestErrorResponse postgrestErrorResponse = (PostgrestErrorResponse) other;
        return m.a(this.message, postgrestErrorResponse.message) && m.a(this.hint, postgrestErrorResponse.hint) && m.a(this.details, postgrestErrorResponse.details) && m.a(this.code, postgrestErrorResponse.code);
    }

    public final String getCode() {
        return this.code;
    }

    public final String getDetails() {
        return this.details;
    }

    public final String getHint() {
        return this.hint;
    }

    public final String getMessage() {
        return this.message;
    }

    public int hashCode() {
        int iHashCode = this.message.hashCode() * 31;
        String str = this.hint;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.details;
        int iHashCode3 = (iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.code;
        return iHashCode3 + (str3 != null ? str3.hashCode() : 0);
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("PostgrestErrorResponse(message=");
        sb.append(this.message);
        sb.append(", hint=");
        sb.append(this.hint);
        sb.append(", details=");
        sb.append(this.details);
        sb.append(", code=");
        return f.l(sb, this.code, ')');
    }

    public PostgrestErrorResponse(String message, String str, String str2, String str3) {
        m.e(message, "message");
        this.message = message;
        this.hint = str;
        this.details = str2;
        this.code = str3;
    }

    public PostgrestErrorResponse(String str, String str2, String str3, String str4, int i3, AbstractC2541f abstractC2541f) {
        this(str, (i3 & 2) != 0 ? null : str2, (i3 & 4) != 0 ? null : str3, (i3 & 8) != 0 ? null : str4);
    }
}
