package io.github.jan.supabase.auth.user;

/* JADX INFO: loaded from: classes4.dex */
@kotlin.Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0012\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0019\b\u0087\b\u0018\u0000 B2\u00020\u0001:\u0002CBBW\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\n\u001a\u00020\u0002\u0012\u0006\u0010\u000b\u001a\u00020\u0002¢\u0006\u0004\b\f\u0010\rBk\b\u0010\u0012\u0006\u0010\u000f\u001a\u00020\u000e\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010¢\u0006\u0004\b\f\u0010\u0012J\u0010\u0010\u0013\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0015\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\u0015\u0010\u0016J\u0012\u0010\u0017\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0017\u0010\u0014J\u0012\u0010\u0018\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0018\u0010\u0014J\u0012\u0010\u0019\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0019\u0010\u0014J\u0012\u0010\u001a\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u001a\u0010\u0014J\u0010\u0010\u001b\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u001b\u0010\u0014J\u0010\u0010\u001c\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u001c\u0010\u0014Jh\u0010\u001d\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u00022\b\b\u0002\u0010\n\u001a\u00020\u00022\b\b\u0002\u0010\u000b\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\u001d\u0010\u001eJ\u0010\u0010\u001f\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u001f\u0010\u0014J\u0010\u0010 \u001a\u00020\u000eHÖ\u0001¢\u0006\u0004\b \u0010!J\u001a\u0010$\u001a\u00020#2\b\u0010\"\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b$\u0010%J'\u0010.\u001a\u00020+2\u0006\u0010&\u001a\u00020\u00002\u0006\u0010(\u001a\u00020'2\u0006\u0010*\u001a\u00020)H\u0001¢\u0006\u0004\b,\u0010-R \u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0003\u0010/\u0012\u0004\b1\u00102\u001a\u0004\b0\u0010\u0014R \u0010\u0005\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0005\u00103\u0012\u0004\b5\u00102\u001a\u0004\b4\u0010\u0016R\"\u0010\u0006\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0006\u0010/\u0012\u0004\b7\u00102\u001a\u0004\b6\u0010\u0014R\"\u0010\u0007\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0007\u0010/\u0012\u0004\b9\u00102\u001a\u0004\b8\u0010\u0014R\"\u0010\b\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\b\u0010/\u0012\u0004\b;\u00102\u001a\u0004\b:\u0010\u0014R\"\u0010\t\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\t\u0010/\u0012\u0004\b=\u00102\u001a\u0004\b<\u0010\u0014R \u0010\n\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\n\u0010/\u0012\u0004\b?\u00102\u001a\u0004\b>\u0010\u0014R \u0010\u000b\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u000b\u0010/\u0012\u0004\bA\u00102\u001a\u0004\b@\u0010\u0014¨\u0006D"}, d2 = {"Lio/github/jan/supabase/auth/user/Identity;", "", "", "id", "Lkotlinx/serialization/json/c;", "identityData", "identityId", "lastSignInAt", "updatedAt", "createdAt", "provider", "userId", "<init>", "(Ljava/lang/String;Lkotlinx/serialization/json/c;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "", "seen0", "Lr8/k0;", "serializationConstructorMarker", "(ILjava/lang/String;Lkotlinx/serialization/json/c;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lr8/k0;)V", "component1", "()Ljava/lang/String;", "component2", "()Lkotlinx/serialization/json/c;", "component3", "component4", "component5", "component6", "component7", "component8", "copy", "(Ljava/lang/String;Lkotlinx/serialization/json/c;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lio/github/jan/supabase/auth/user/Identity;", "toString", "hashCode", "()I", io.sentry.protocol.Request.JsonKeys.OTHER, "", "equals", "(Ljava/lang/Object;)Z", "self", "Lq8/b;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "Lh6/A;", "write$Self$auth_kt_release", "(Lio/github/jan/supabase/auth/user/Identity;Lq8/b;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "write$Self", "Ljava/lang/String;", "getId", "getId$annotations", "()V", "Lkotlinx/serialization/json/c;", "getIdentityData", "getIdentityData$annotations", "getIdentityId", "getIdentityId$annotations", "getLastSignInAt", "getLastSignInAt$annotations", "getUpdatedAt", "getUpdatedAt$annotations", "getCreatedAt", "getCreatedAt$annotations", "getProvider", "getProvider$annotations", "getUserId", "getUserId$annotations", "Companion", "$serializer", "auth-kt_release"}, k = 1, mv = {2, 1, 0}, xi = androidx.media3.container.NalUnitUtil.H265_NAL_UNIT_TYPE_UNSPECIFIED)
@p119n8.i
public final /* data */ class Identity {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final io.github.jan.supabase.auth.user.Identity.Companion INSTANCE = new io.github.jan.supabase.auth.user.Identity.Companion(null);
    private final java.lang.String createdAt;
    private final java.lang.String id;
    private final kotlinx.serialization.json.c identityData;
    private final java.lang.String identityId;
    private final java.lang.String lastSignInAt;
    private final java.lang.String provider;
    private final java.lang.String updatedAt;
    private final java.lang.String userId;

    @kotlin.Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¨\u0006\u0007"}, d2 = {"Lio/github/jan/supabase/auth/user/Identity$Companion;", "", "<init>", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lio/github/jan/supabase/auth/user/Identity;", "auth-kt_release"}, k = 1, mv = {2, 1, 0}, xi = androidx.media3.container.NalUnitUtil.H265_NAL_UNIT_TYPE_UNSPECIFIED)
    public static final class Companion {
        private Companion() {
        }

        public final kotlinx.serialization.KSerializer serializer() {
            return io.github.jan.supabase.auth.user.Identity$$serializer.INSTANCE;
        }

        public /* synthetic */ Companion(kotlin.jvm.internal.AbstractC2541f abstractC2541f) {
            this();
        }
    }

    public /* synthetic */ Identity(int i3, java.lang.String str, kotlinx.serialization.json.c cVar, java.lang.String str2, java.lang.String str3, java.lang.String str4, java.lang.String str5, java.lang.String str6, java.lang.String str7, p153r8.k0 k0Var) {
        if (195 != (i3 & 195)) {
            p153r8.AbstractC2686a0.l(i3, 195, io.github.jan.supabase.auth.user.Identity$$serializer.INSTANCE.getDescriptor());
            throw null;
        }
        this.id = str;
        this.identityData = cVar;
        if ((i3 & 4) == 0) {
            this.identityId = null;
        } else {
            this.identityId = str2;
        }
        if ((i3 & 8) == 0) {
            this.lastSignInAt = null;
        } else {
            this.lastSignInAt = str3;
        }
        if ((i3 & 16) == 0) {
            this.updatedAt = null;
        } else {
            this.updatedAt = str4;
        }
        if ((i3 & 32) == 0) {
            this.createdAt = null;
        } else {
            this.createdAt = str5;
        }
        this.provider = str6;
        this.userId = str7;
    }

    public static /* synthetic */ io.github.jan.supabase.auth.user.Identity copy$default(io.github.jan.supabase.auth.user.Identity identity, java.lang.String str, kotlinx.serialization.json.c cVar, java.lang.String str2, java.lang.String str3, java.lang.String str4, java.lang.String str5, java.lang.String str6, java.lang.String str7, int i3, java.lang.Object obj) {
        if ((i3 & 1) != 0) {
            str = identity.id;
        }
        if ((i3 & 2) != 0) {
            cVar = identity.identityData;
        }
        if ((i3 & 4) != 0) {
            str2 = identity.identityId;
        }
        if ((i3 & 8) != 0) {
            str3 = identity.lastSignInAt;
        }
        if ((i3 & 16) != 0) {
            str4 = identity.updatedAt;
        }
        if ((i3 & 32) != 0) {
            str5 = identity.createdAt;
        }
        if ((i3 & 64) != 0) {
            str6 = identity.provider;
        }
        if ((i3 & 128) != 0) {
            str7 = identity.userId;
        }
        java.lang.String str8 = str6;
        java.lang.String str9 = str7;
        java.lang.String str10 = str4;
        java.lang.String str11 = str5;
        return identity.copy(str, cVar, str2, str3, str10, str11, str8, str9);
    }

    @p119n8.h("created_at")
    public static /* synthetic */ void getCreatedAt$annotations() {
    }

    @p119n8.h("id")
    public static /* synthetic */ void getId$annotations() {
    }

    @p119n8.h("identity_data")
    public static /* synthetic */ void getIdentityData$annotations() {
    }

    @p119n8.h("identity_id")
    public static /* synthetic */ void getIdentityId$annotations() {
    }

    @p119n8.h("last_sign_in_at")
    public static /* synthetic */ void getLastSignInAt$annotations() {
    }

    @p119n8.h("provider")
    public static /* synthetic */ void getProvider$annotations() {
    }

    @p119n8.h("updated_at")
    public static /* synthetic */ void getUpdatedAt$annotations() {
    }

    @p119n8.h(io.sentry.TraceContext.JsonKeys.USER_ID)
    public static /* synthetic */ void getUserId$annotations() {
    }

    public static final /* synthetic */ void write$Self$auth_kt_release(io.github.jan.supabase.auth.user.Identity self, p143q8.b output, kotlinx.serialization.descriptors.SerialDescriptor serialDesc) {
        output.s(serialDesc, 0, self.id);
        output.h(serialDesc, 1, p162s8.x.f27430a, self.identityData);
        if (output.E(serialDesc) || self.identityId != null) {
            output.t(serialDesc, 2, p153r8.p0.f26988a, self.identityId);
        }
        if (output.E(serialDesc) || self.lastSignInAt != null) {
            output.t(serialDesc, 3, p153r8.p0.f26988a, self.lastSignInAt);
        }
        if (output.E(serialDesc) || self.updatedAt != null) {
            output.t(serialDesc, 4, p153r8.p0.f26988a, self.updatedAt);
        }
        if (output.E(serialDesc) || self.createdAt != null) {
            output.t(serialDesc, 5, p153r8.p0.f26988a, self.createdAt);
        }
        output.s(serialDesc, 6, self.provider);
        output.s(serialDesc, 7, self.userId);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final java.lang.String getId() {
        return this.id;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final kotlinx.serialization.json.c getIdentityData() {
        return this.identityData;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final java.lang.String getIdentityId() {
        return this.identityId;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final java.lang.String getLastSignInAt() {
        return this.lastSignInAt;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final java.lang.String getUpdatedAt() {
        return this.updatedAt;
    }

    /* JADX INFO: renamed from: component6, reason: from getter */
    public final java.lang.String getCreatedAt() {
        return this.createdAt;
    }

    /* JADX INFO: renamed from: component7, reason: from getter */
    public final java.lang.String getProvider() {
        return this.provider;
    }

    /* JADX INFO: renamed from: component8, reason: from getter */
    public final java.lang.String getUserId() {
        return this.userId;
    }

    public final io.github.jan.supabase.auth.user.Identity copy(java.lang.String id, kotlinx.serialization.json.c identityData, java.lang.String identityId, java.lang.String lastSignInAt, java.lang.String updatedAt, java.lang.String createdAt, java.lang.String provider, java.lang.String userId) {
        kotlin.jvm.internal.m.e(id, "id");
        kotlin.jvm.internal.m.e(identityData, "identityData");
        kotlin.jvm.internal.m.e(provider, "provider");
        kotlin.jvm.internal.m.e(userId, "userId");
        return new io.github.jan.supabase.auth.user.Identity(id, identityData, identityId, lastSignInAt, updatedAt, createdAt, provider, userId);
    }

    public boolean equals(java.lang.Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof io.github.jan.supabase.auth.user.Identity)) {
            return false;
        }
        io.github.jan.supabase.auth.user.Identity identity = (io.github.jan.supabase.auth.user.Identity) other;
        return kotlin.jvm.internal.m.a(this.id, identity.id) && kotlin.jvm.internal.m.a(this.identityData, identity.identityData) && kotlin.jvm.internal.m.a(this.identityId, identity.identityId) && kotlin.jvm.internal.m.a(this.lastSignInAt, identity.lastSignInAt) && kotlin.jvm.internal.m.a(this.updatedAt, identity.updatedAt) && kotlin.jvm.internal.m.a(this.createdAt, identity.createdAt) && kotlin.jvm.internal.m.a(this.provider, identity.provider) && kotlin.jvm.internal.m.a(this.userId, identity.userId);
    }

    public final java.lang.String getCreatedAt() {
        return this.createdAt;
    }

    public final java.lang.String getId() {
        return this.id;
    }

    public final kotlinx.serialization.json.c getIdentityData() {
        return this.identityData;
    }

    public final java.lang.String getIdentityId() {
        return this.identityId;
    }

    public final java.lang.String getLastSignInAt() {
        return this.lastSignInAt;
    }

    public final java.lang.String getProvider() {
        return this.provider;
    }

    public final java.lang.String getUpdatedAt() {
        return this.updatedAt;
    }

    public final java.lang.String getUserId() {
        return this.userId;
    }

    public int hashCode() {
        int iC = B2.a.c(this.id.hashCode() * 31, 31, this.identityData.f24558h);
        java.lang.String str = this.identityId;
        int iHashCode = (iC + (str == null ? 0 : str.hashCode())) * 31;
        java.lang.String str2 = this.lastSignInAt;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        java.lang.String str3 = this.updatedAt;
        int iHashCode3 = (iHashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        java.lang.String str4 = this.createdAt;
        return this.userId.hashCode() + B2.a.a((iHashCode3 + (str4 != null ? str4.hashCode() : 0)) * 31, 31, this.provider);
    }

    public java.lang.String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder("Identity(id=");
        sb.append(this.id);
        sb.append(", identityData=");
        sb.append(this.identityData);
        sb.append(", identityId=");
        sb.append(this.identityId);
        sb.append(", lastSignInAt=");
        sb.append(this.lastSignInAt);
        sb.append(", updatedAt=");
        sb.append(this.updatedAt);
        sb.append(", createdAt=");
        sb.append(this.createdAt);
        sb.append(", provider=");
        sb.append(this.provider);
        sb.append(", userId=");
        return Y6.f.l(sb, this.userId, ')');
    }

    public Identity(java.lang.String id, kotlinx.serialization.json.c identityData, java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String str4, java.lang.String provider, java.lang.String userId) {
        kotlin.jvm.internal.m.e(id, "id");
        kotlin.jvm.internal.m.e(identityData, "identityData");
        kotlin.jvm.internal.m.e(provider, "provider");
        kotlin.jvm.internal.m.e(userId, "userId");
        this.id = id;
        this.identityData = identityData;
        this.identityId = str;
        this.lastSignInAt = str2;
        this.updatedAt = str3;
        this.createdAt = str4;
        this.provider = provider;
        this.userId = userId;
    }

    public /* synthetic */ Identity(java.lang.String str, kotlinx.serialization.json.c cVar, java.lang.String str2, java.lang.String str3, java.lang.String str4, java.lang.String str5, java.lang.String str6, java.lang.String str7, int i3, kotlin.jvm.internal.AbstractC2541f abstractC2541f) {
        this(str, cVar, (i3 & 4) != 0 ? null : str2, (i3 & 8) != 0 ? null : str3, (i3 & 16) != 0 ? null : str4, (i3 & 32) != 0 ? null : str5, str6, str7);
    }
}
