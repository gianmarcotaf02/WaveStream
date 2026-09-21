package io.github.jan.supabase.auth;

/* JADX INFO: loaded from: classes4.dex */
@kotlin.Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0004\b\u0081\b\u0018\u0000 \u00192\u00020\u0001:\u0002\u0018\u0019B'\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\u0007\u0010\bJ\u000b\u0010\u000e\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010\u000f\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u0010\u001a\u0004\u0018\u00010\u0006HÆ\u0003J+\u0010\u0011\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0006HÆ\u0001J\u0013\u0010\u0012\u001a\u00020\u00132\b\u0010\u0014\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0015\u001a\u00020\u0016HÖ\u0001J\t\u0010\u0017\u001a\u00020\u0003HÖ\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\nR\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\r¨\u0006\u001a"}, d2 = {"Lio/github/jan/supabase/auth/GoTrueErrorResponse;", "", "error", "", "description", "weakPassword", "Lio/github/jan/supabase/auth/GoTrueErrorResponse$WeakPassword;", "<init>", "(Ljava/lang/String;Ljava/lang/String;Lio/github/jan/supabase/auth/GoTrueErrorResponse$WeakPassword;)V", "getError", "()Ljava/lang/String;", "getDescription", "getWeakPassword", "()Lio/github/jan/supabase/auth/GoTrueErrorResponse$WeakPassword;", "component1", "component2", "component3", "copy", "equals", "", io.sentry.protocol.Request.JsonKeys.OTHER, "hashCode", "", "toString", "WeakPassword", "Companion", "auth-kt_release"}, k = 1, mv = {2, 1, 0}, xi = androidx.media3.container.NalUnitUtil.H265_NAL_UNIT_TYPE_UNSPECIFIED)
@p119n8.i(with = io.github.jan.supabase.auth.GoTrueErrorResponse.Companion.class)
public final /* data */ class GoTrueErrorResponse {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final io.github.jan.supabase.auth.GoTrueErrorResponse.Companion INSTANCE = new io.github.jan.supabase.auth.GoTrueErrorResponse.Companion(null);
    private static final kotlinx.serialization.descriptors.SerialDescriptor descriptor = com.google.crypto.tink.shaded.protobuf.q0.j("GoTrueErrorResponse", new kotlinx.serialization.descriptors.SerialDescriptor[0], new io.github.jan.supabase.auth.a(5));
    private final java.lang.String description;
    private final java.lang.String error;
    private final io.github.jan.supabase.auth.GoTrueErrorResponse.WeakPassword weakPassword;

    @kotlin.Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0017\u0010\u0007\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\u0007\u0010\bJ\u001f\u0010\r\u001a\u00020\f2\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u000b\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\r\u0010\u000eJ\u0013\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001¢\u0006\u0004\b\u000f\u0010\u0010R\u001a\u0010\u0012\u001a\u00020\u00118\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015¨\u0006\u0016"}, d2 = {"Lio/github/jan/supabase/auth/GoTrueErrorResponse$Companion;", "Lkotlinx/serialization/KSerializer;", "Lio/github/jan/supabase/auth/GoTrueErrorResponse;", "<init>", "()V", "Lkotlinx/serialization/encoding/Decoder;", "decoder", "deserialize", "(Lkotlinx/serialization/encoding/Decoder;)Lio/github/jan/supabase/auth/GoTrueErrorResponse;", "Lkotlinx/serialization/encoding/Encoder;", "encoder", "value", "Lh6/A;", "serialize", "(Lkotlinx/serialization/encoding/Encoder;Lio/github/jan/supabase/auth/GoTrueErrorResponse;)V", "serializer", "()Lkotlinx/serialization/KSerializer;", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "auth-kt_release"}, k = 1, mv = {2, 1, 0}, xi = androidx.media3.container.NalUnitUtil.H265_NAL_UNIT_TYPE_UNSPECIFIED)
    public static final class Companion implements kotlinx.serialization.KSerializer {
        public /* synthetic */ Companion(kotlin.jvm.internal.AbstractC2541f abstractC2541f) {
            this();
        }

        @Override // kotlinx.serialization.KSerializer
        public kotlinx.serialization.descriptors.SerialDescriptor getDescriptor() {
            return io.github.jan.supabase.auth.GoTrueErrorResponse.descriptor;
        }

        public final kotlinx.serialization.KSerializer serializer() {
            return io.github.jan.supabase.auth.GoTrueErrorResponse.INSTANCE;
        }

        private Companion() {
        }

        @Override // kotlinx.serialization.KSerializer
        public io.github.jan.supabase.auth.GoTrueErrorResponse deserialize(kotlinx.serialization.encoding.Decoder decoder) {
            java.lang.String strD;
            kotlin.jvm.internal.m.e(decoder, "decoder");
            kotlinx.serialization.json.b bVarI = ((p162s8.k) decoder).i();
            kotlinx.serialization.json.b bVar = (kotlinx.serialization.json.b) p162s8.l.i(bVarI).get(com.revenuecat.purchases.common.diagnostics.DiagnosticsTracker.ERROR_CODE_KEY);
            io.github.jan.supabase.auth.GoTrueErrorResponse.WeakPassword weakPassword = null;
            java.lang.String strD2 = bVar != null ? p162s8.l.j(bVar).d() : null;
            kotlinx.serialization.json.b bVar2 = (kotlinx.serialization.json.b) p162s8.l.i(bVarI).get("error_description");
            if (bVar2 == null || (strD = p162s8.l.j(bVar2).d()) == null) {
                kotlinx.serialization.json.b bVar3 = (kotlinx.serialization.json.b) p162s8.l.i(bVarI).get("msg");
                if (bVar3 != null) {
                    strD = p162s8.l.j(bVar3).d();
                } else {
                    kotlinx.serialization.json.b bVar4 = (kotlinx.serialization.json.b) p162s8.l.i(bVarI).get("message");
                    strD = bVar4 != null ? p162s8.l.j(bVar4).d() : null;
                    if (strD == null) {
                        strD = bVarI.toString();
                    }
                }
            }
            if (p162s8.l.i(bVarI).containsKey(io.github.jan.supabase.auth.exception.AuthWeakPasswordException.CODE)) {
                p162s8.c cVar = p162s8.d.f27387d;
                java.lang.Object obj = p162s8.l.i(bVarI).get(io.github.jan.supabase.auth.exception.AuthWeakPasswordException.CODE);
                kotlin.jvm.internal.m.b(obj);
                cVar.getClass();
                weakPassword = (io.github.jan.supabase.auth.GoTrueErrorResponse.WeakPassword) cVar.a(io.github.jan.supabase.auth.GoTrueErrorResponse.WeakPassword.INSTANCE.serializer(), (kotlinx.serialization.json.b) obj);
            }
            return new io.github.jan.supabase.auth.GoTrueErrorResponse(strD2, strD, weakPassword);
        }

        @Override // kotlinx.serialization.KSerializer
        public void serialize(kotlinx.serialization.encoding.Encoder encoder, io.github.jan.supabase.auth.GoTrueErrorResponse value) {
            kotlin.jvm.internal.m.e(encoder, "encoder");
            kotlin.jvm.internal.m.e(value, "value");
            throw new java.lang.UnsupportedOperationException();
        }
    }

    @kotlin.Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\u000b\n\u0002\b\u0007\b\u0087\b\u0018\u0000 #2\u00020\u0001:\u0002$#B\u0015\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0005\u0010\u0006B+\b\u0010\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u000e\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0002\u0012\b\u0010\n\u001a\u0004\u0018\u00010\t¢\u0006\u0004\b\u0005\u0010\u000bJ'\u0010\u0014\u001a\u00020\u00112\u0006\u0010\f\u001a\u00020\u00002\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0010\u001a\u00020\u000fH\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u0016\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002HÆ\u0003¢\u0006\u0004\b\u0015\u0010\u0016J \u0010\u0017\u001a\u00020\u00002\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002HÆ\u0001¢\u0006\u0004\b\u0017\u0010\u0018J\u0010\u0010\u0019\u001a\u00020\u0003HÖ\u0001¢\u0006\u0004\b\u0019\u0010\u001aJ\u0010\u0010\u001b\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\u001b\u0010\u001cJ\u001a\u0010\u001f\u001a\u00020\u001e2\b\u0010\u001d\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u001f\u0010 R\u001d\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010!\u001a\u0004\b\"\u0010\u0016¨\u0006%"}, d2 = {"Lio/github/jan/supabase/auth/GoTrueErrorResponse$WeakPassword;", "", "", "", "reasons", "<init>", "(Ljava/util/List;)V", "", "seen0", "Lr8/k0;", "serializationConstructorMarker", "(ILjava/util/List;Lr8/k0;)V", "self", "Lq8/b;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "Lh6/A;", "write$Self$auth_kt_release", "(Lio/github/jan/supabase/auth/GoTrueErrorResponse$WeakPassword;Lq8/b;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "write$Self", "component1", "()Ljava/util/List;", "copy", "(Ljava/util/List;)Lio/github/jan/supabase/auth/GoTrueErrorResponse$WeakPassword;", "toString", "()Ljava/lang/String;", "hashCode", "()I", io.sentry.protocol.Request.JsonKeys.OTHER, "", "equals", "(Ljava/lang/Object;)Z", "Ljava/util/List;", "getReasons", "Companion", "$serializer", "auth-kt_release"}, k = 1, mv = {2, 1, 0}, xi = androidx.media3.container.NalUnitUtil.H265_NAL_UNIT_TYPE_UNSPECIFIED)
    @p119n8.i
    public static final /* data */ class WeakPassword {
        private final java.util.List<java.lang.String> reasons;

        /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
        public static final io.github.jan.supabase.auth.GoTrueErrorResponse.WeakPassword.Companion INSTANCE = new io.github.jan.supabase.auth.GoTrueErrorResponse.WeakPassword.Companion(null);
        private static final kotlinx.serialization.KSerializer[] $childSerializers = {new p153r8.C2691d(p153r8.p0.f26988a, 0)};

        @kotlin.Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¨\u0006\u0007"}, d2 = {"Lio/github/jan/supabase/auth/GoTrueErrorResponse$WeakPassword$Companion;", "", "<init>", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lio/github/jan/supabase/auth/GoTrueErrorResponse$WeakPassword;", "auth-kt_release"}, k = 1, mv = {2, 1, 0}, xi = androidx.media3.container.NalUnitUtil.H265_NAL_UNIT_TYPE_UNSPECIFIED)
        public static final class Companion {
            private Companion() {
            }

            public final kotlinx.serialization.KSerializer serializer() {
                return io.github.jan.supabase.auth.GoTrueErrorResponse$WeakPassword$$serializer.INSTANCE;
            }

            public /* synthetic */ Companion(kotlin.jvm.internal.AbstractC2541f abstractC2541f) {
                this();
            }
        }

        public /* synthetic */ WeakPassword(int i3, java.util.List list, p153r8.k0 k0Var) {
            if (1 == (i3 & 1)) {
                this.reasons = list;
            } else {
                p153r8.AbstractC2686a0.l(i3, 1, io.github.jan.supabase.auth.GoTrueErrorResponse$WeakPassword$$serializer.INSTANCE.getDescriptor());
                throw null;
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ io.github.jan.supabase.auth.GoTrueErrorResponse.WeakPassword copy$default(io.github.jan.supabase.auth.GoTrueErrorResponse.WeakPassword weakPassword, java.util.List list, int i3, java.lang.Object obj) {
            if ((i3 & 1) != 0) {
                list = weakPassword.reasons;
            }
            return weakPassword.copy(list);
        }

        public final java.util.List<java.lang.String> component1() {
            return this.reasons;
        }

        public final io.github.jan.supabase.auth.GoTrueErrorResponse.WeakPassword copy(java.util.List<java.lang.String> reasons) {
            kotlin.jvm.internal.m.e(reasons, "reasons");
            return new io.github.jan.supabase.auth.GoTrueErrorResponse.WeakPassword(reasons);
        }

        public boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof io.github.jan.supabase.auth.GoTrueErrorResponse.WeakPassword) && kotlin.jvm.internal.m.a(this.reasons, ((io.github.jan.supabase.auth.GoTrueErrorResponse.WeakPassword) other).reasons);
        }

        public final java.util.List<java.lang.String> getReasons() {
            return this.reasons;
        }

        public int hashCode() {
            return this.reasons.hashCode();
        }

        public java.lang.String toString() {
            return com.google.android.gms.internal.play_billing.M0.n(new java.lang.StringBuilder("WeakPassword(reasons="), this.reasons, ')');
        }

        public WeakPassword(java.util.List<java.lang.String> reasons) {
            kotlin.jvm.internal.m.e(reasons, "reasons");
            this.reasons = reasons;
        }
    }

    public GoTrueErrorResponse(java.lang.String str, java.lang.String description, io.github.jan.supabase.auth.GoTrueErrorResponse.WeakPassword weakPassword) {
        kotlin.jvm.internal.m.e(description, "description");
        this.error = str;
        this.description = description;
        this.weakPassword = weakPassword;
    }

    public static /* synthetic */ io.github.jan.supabase.auth.GoTrueErrorResponse copy$default(io.github.jan.supabase.auth.GoTrueErrorResponse goTrueErrorResponse, java.lang.String str, java.lang.String str2, io.github.jan.supabase.auth.GoTrueErrorResponse.WeakPassword weakPassword, int i3, java.lang.Object obj) {
        if ((i3 & 1) != 0) {
            str = goTrueErrorResponse.error;
        }
        if ((i3 & 2) != 0) {
            str2 = goTrueErrorResponse.description;
        }
        if ((i3 & 4) != 0) {
            weakPassword = goTrueErrorResponse.weakPassword;
        }
        return goTrueErrorResponse.copy(str, str2, weakPassword);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final p070h6.A descriptor$lambda$0(p135p8.a buildClassSerialDescriptor) {
        kotlin.jvm.internal.m.e(buildClassSerialDescriptor, "$this$buildClassSerialDescriptor");
        buildClassSerialDescriptor.a("error", p153r8.p0.f26989b, (12 & 8) == 0);
        return p070h6.A.f22523a;
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final java.lang.String getError() {
        return this.error;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final java.lang.String getDescription() {
        return this.description;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final io.github.jan.supabase.auth.GoTrueErrorResponse.WeakPassword getWeakPassword() {
        return this.weakPassword;
    }

    public final io.github.jan.supabase.auth.GoTrueErrorResponse copy(java.lang.String error, java.lang.String description, io.github.jan.supabase.auth.GoTrueErrorResponse.WeakPassword weakPassword) {
        kotlin.jvm.internal.m.e(description, "description");
        return new io.github.jan.supabase.auth.GoTrueErrorResponse(error, description, weakPassword);
    }

    public boolean equals(java.lang.Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof io.github.jan.supabase.auth.GoTrueErrorResponse)) {
            return false;
        }
        io.github.jan.supabase.auth.GoTrueErrorResponse goTrueErrorResponse = (io.github.jan.supabase.auth.GoTrueErrorResponse) other;
        return kotlin.jvm.internal.m.a(this.error, goTrueErrorResponse.error) && kotlin.jvm.internal.m.a(this.description, goTrueErrorResponse.description) && kotlin.jvm.internal.m.a(this.weakPassword, goTrueErrorResponse.weakPassword);
    }

    public final java.lang.String getDescription() {
        return this.description;
    }

    public final java.lang.String getError() {
        return this.error;
    }

    public final io.github.jan.supabase.auth.GoTrueErrorResponse.WeakPassword getWeakPassword() {
        return this.weakPassword;
    }

    public int hashCode() {
        java.lang.String str = this.error;
        int iA = B2.a.a((str == null ? 0 : str.hashCode()) * 31, 31, this.description);
        io.github.jan.supabase.auth.GoTrueErrorResponse.WeakPassword weakPassword = this.weakPassword;
        return iA + (weakPassword != null ? weakPassword.hashCode() : 0);
    }

    public java.lang.String toString() {
        return "GoTrueErrorResponse(error=" + this.error + ", description=" + this.description + ", weakPassword=" + this.weakPassword + ')';
    }

    public /* synthetic */ GoTrueErrorResponse(java.lang.String str, java.lang.String str2, io.github.jan.supabase.auth.GoTrueErrorResponse.WeakPassword weakPassword, int i3, kotlin.jvm.internal.AbstractC2541f abstractC2541f) {
        this(str, (i3 & 2) != 0 ? "" : str2, (i3 & 4) != 0 ? null : weakPassword);
    }
}
