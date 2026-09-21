package io.github.jan.supabase.auth.admin;

/* JADX INFO: loaded from: classes4.dex */
@kotlin.Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0017\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b$\b\u0087\b\u0018\u0000 P2\u00020\u0001:\u0002QPBs\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\b\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\b\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u000e\u0010\u000fBu\b\u0010\u0012\u0006\u0010\u0011\u001a\u00020\u0010\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b\u0012\b\u0010\n\u001a\u0004\u0018\u00010\b\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\r\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0013\u001a\u0004\u0018\u00010\u0012¢\u0006\u0004\b\u000e\u0010\u0014J\u0012\u0010\u0015\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0015\u0010\u0016J\u0012\u0010\u0017\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0017\u0010\u0016J\u0012\u0010\u0018\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0004\b\u0018\u0010\u0019J\u0012\u0010\u001a\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0004\b\u001a\u0010\u0019J\u0012\u0010\u001b\u001a\u0004\u0018\u00010\bHÆ\u0003¢\u0006\u0004\b\u001b\u0010\u001cJ\u0012\u0010\u001d\u001a\u0004\u0018\u00010\bHÆ\u0003¢\u0006\u0004\b\u001d\u0010\u001cJ\u0012\u0010\u001e\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u001e\u0010\u0016J\u0012\u0010\u001f\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u001f\u0010\u0016J\u0012\u0010 \u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b \u0010\u0016J|\u0010!\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\b2\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\b2\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u0002HÆ\u0001¢\u0006\u0004\b!\u0010\"J\u0010\u0010#\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b#\u0010\u0016J\u0010\u0010$\u001a\u00020\u0010HÖ\u0001¢\u0006\u0004\b$\u0010%J\u001a\u0010'\u001a\u00020\b2\b\u0010&\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b'\u0010(J'\u00101\u001a\u00020.2\u0006\u0010)\u001a\u00020\u00002\u0006\u0010+\u001a\u00020*2\u0006\u0010-\u001a\u00020,H\u0001¢\u0006\u0004\b/\u00100R$\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0003\u00102\u001a\u0004\b3\u0010\u0016\"\u0004\b4\u00105R$\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0004\u00102\u001a\u0004\b6\u0010\u0016\"\u0004\b7\u00105R*\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0006@\u0006X\u0087\u000e¢\u0006\u0018\n\u0004\b\u0006\u00108\u0012\u0004\b<\u0010=\u001a\u0004\b9\u0010\u0019\"\u0004\b:\u0010;R*\u0010\u0007\u001a\u0004\u0018\u00010\u00058\u0006@\u0006X\u0087\u000e¢\u0006\u0018\n\u0004\b\u0007\u00108\u0012\u0004\b@\u0010=\u001a\u0004\b>\u0010\u0019\"\u0004\b?\u0010;R*\u0010\t\u001a\u0004\u0018\u00010\b8\u0006@\u0006X\u0087\u000e¢\u0006\u0018\n\u0004\b\t\u0010A\u0012\u0004\bE\u0010=\u001a\u0004\bB\u0010\u001c\"\u0004\bC\u0010DR*\u0010\n\u001a\u0004\u0018\u00010\b8\u0006@\u0006X\u0087\u000e¢\u0006\u0018\n\u0004\b\n\u0010A\u0012\u0004\bH\u0010=\u001a\u0004\bF\u0010\u001c\"\u0004\bG\u0010DR$\u0010\u000b\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u000b\u00102\u001a\u0004\bI\u0010\u0016\"\u0004\bJ\u00105R*\u0010\f\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u0087\u000e¢\u0006\u0018\n\u0004\b\f\u00102\u0012\u0004\bM\u0010=\u001a\u0004\bK\u0010\u0016\"\u0004\bL\u00105R$\u0010\r\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\r\u00102\u001a\u0004\bN\u0010\u0016\"\u0004\bO\u00105¨\u0006R"}, d2 = {"Lio/github/jan/supabase/auth/admin/AdminUserUpdateBuilder;", "", "", "email", "password", "Lkotlinx/serialization/json/c;", "appMetadata", "userMetadata", "", "emailConfirm", "phoneConfirm", "phone", "banDuration", "role", "<init>", "(Ljava/lang/String;Ljava/lang/String;Lkotlinx/serialization/json/c;Lkotlinx/serialization/json/c;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "", "seen0", "Lr8/k0;", "serializationConstructorMarker", "(ILjava/lang/String;Ljava/lang/String;Lkotlinx/serialization/json/c;Lkotlinx/serialization/json/c;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lr8/k0;)V", "component1", "()Ljava/lang/String;", "component2", "component3", "()Lkotlinx/serialization/json/c;", "component4", "component5", "()Ljava/lang/Boolean;", "component6", "component7", "component8", "component9", "copy", "(Ljava/lang/String;Ljava/lang/String;Lkotlinx/serialization/json/c;Lkotlinx/serialization/json/c;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lio/github/jan/supabase/auth/admin/AdminUserUpdateBuilder;", "toString", "hashCode", "()I", io.sentry.protocol.Request.JsonKeys.OTHER, "equals", "(Ljava/lang/Object;)Z", "self", "Lq8/b;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "Lh6/A;", "write$Self$auth_kt_release", "(Lio/github/jan/supabase/auth/admin/AdminUserUpdateBuilder;Lq8/b;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "write$Self", "Ljava/lang/String;", "getEmail", "setEmail", "(Ljava/lang/String;)V", "getPassword", "setPassword", "Lkotlinx/serialization/json/c;", "getAppMetadata", "setAppMetadata", "(Lkotlinx/serialization/json/c;)V", "getAppMetadata$annotations", "()V", "getUserMetadata", "setUserMetadata", "getUserMetadata$annotations", "Ljava/lang/Boolean;", "getEmailConfirm", "setEmailConfirm", "(Ljava/lang/Boolean;)V", "getEmailConfirm$annotations", "getPhoneConfirm", "setPhoneConfirm", "getPhoneConfirm$annotations", "getPhone", "setPhone", "getBanDuration", "setBanDuration", "getBanDuration$annotations", "getRole", "setRole", "Companion", "$serializer", "auth-kt_release"}, k = 1, mv = {2, 1, 0}, xi = androidx.media3.container.NalUnitUtil.H265_NAL_UNIT_TYPE_UNSPECIFIED)
@p119n8.i
public final /* data */ class AdminUserUpdateBuilder {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final io.github.jan.supabase.auth.admin.AdminUserUpdateBuilder.Companion INSTANCE = new io.github.jan.supabase.auth.admin.AdminUserUpdateBuilder.Companion(null);
    private kotlinx.serialization.json.c appMetadata;
    private java.lang.String banDuration;
    private java.lang.String email;
    private java.lang.Boolean emailConfirm;
    private java.lang.String password;
    private java.lang.String phone;
    private java.lang.Boolean phoneConfirm;
    private java.lang.String role;
    private kotlinx.serialization.json.c userMetadata;

    @kotlin.Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¨\u0006\u0007"}, d2 = {"Lio/github/jan/supabase/auth/admin/AdminUserUpdateBuilder$Companion;", "", "<init>", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lio/github/jan/supabase/auth/admin/AdminUserUpdateBuilder;", "auth-kt_release"}, k = 1, mv = {2, 1, 0}, xi = androidx.media3.container.NalUnitUtil.H265_NAL_UNIT_TYPE_UNSPECIFIED)
    public static final class Companion {
        private Companion() {
        }

        public final kotlinx.serialization.KSerializer serializer() {
            return io.github.jan.supabase.auth.admin.AdminUserUpdateBuilder$$serializer.INSTANCE;
        }

        public /* synthetic */ Companion(kotlin.jvm.internal.AbstractC2541f abstractC2541f) {
            this();
        }
    }

    public AdminUserUpdateBuilder() {
        this((java.lang.String) null, (java.lang.String) null, (kotlinx.serialization.json.c) null, (kotlinx.serialization.json.c) null, (java.lang.Boolean) null, (java.lang.Boolean) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, 511, (kotlin.jvm.internal.AbstractC2541f) null);
    }

    public static /* synthetic */ io.github.jan.supabase.auth.admin.AdminUserUpdateBuilder copy$default(io.github.jan.supabase.auth.admin.AdminUserUpdateBuilder adminUserUpdateBuilder, java.lang.String str, java.lang.String str2, kotlinx.serialization.json.c cVar, kotlinx.serialization.json.c cVar2, java.lang.Boolean bool, java.lang.Boolean bool2, java.lang.String str3, java.lang.String str4, java.lang.String str5, int i3, java.lang.Object obj) {
        if ((i3 & 1) != 0) {
            str = adminUserUpdateBuilder.email;
        }
        if ((i3 & 2) != 0) {
            str2 = adminUserUpdateBuilder.password;
        }
        if ((i3 & 4) != 0) {
            cVar = adminUserUpdateBuilder.appMetadata;
        }
        if ((i3 & 8) != 0) {
            cVar2 = adminUserUpdateBuilder.userMetadata;
        }
        if ((i3 & 16) != 0) {
            bool = adminUserUpdateBuilder.emailConfirm;
        }
        if ((i3 & 32) != 0) {
            bool2 = adminUserUpdateBuilder.phoneConfirm;
        }
        if ((i3 & 64) != 0) {
            str3 = adminUserUpdateBuilder.phone;
        }
        if ((i3 & 128) != 0) {
            str4 = adminUserUpdateBuilder.banDuration;
        }
        if ((i3 & 256) != 0) {
            str5 = adminUserUpdateBuilder.role;
        }
        java.lang.String str6 = str4;
        java.lang.String str7 = str5;
        java.lang.Boolean bool3 = bool2;
        java.lang.String str8 = str3;
        java.lang.Boolean bool4 = bool;
        kotlinx.serialization.json.c cVar3 = cVar;
        return adminUserUpdateBuilder.copy(str, str2, cVar3, cVar2, bool4, bool3, str8, str6, str7);
    }

    @p119n8.h("app_metadata")
    public static /* synthetic */ void getAppMetadata$annotations() {
    }

    @p119n8.h("ban_duration")
    public static /* synthetic */ void getBanDuration$annotations() {
    }

    @p119n8.h("email_confirm")
    public static /* synthetic */ void getEmailConfirm$annotations() {
    }

    @p119n8.h("phone_confirm")
    public static /* synthetic */ void getPhoneConfirm$annotations() {
    }

    @p119n8.h("user_metadata")
    public static /* synthetic */ void getUserMetadata$annotations() {
    }

    public static final /* synthetic */ void write$Self$auth_kt_release(io.github.jan.supabase.auth.admin.AdminUserUpdateBuilder self, p143q8.b output, kotlinx.serialization.descriptors.SerialDescriptor serialDesc) {
        if (output.E(serialDesc) || self.email != null) {
            output.t(serialDesc, 0, p153r8.p0.f26988a, self.email);
        }
        if (output.E(serialDesc) || self.password != null) {
            output.t(serialDesc, 1, p153r8.p0.f26988a, self.password);
        }
        if (output.E(serialDesc) || self.appMetadata != null) {
            output.t(serialDesc, 2, p162s8.x.f27430a, self.appMetadata);
        }
        if (output.E(serialDesc) || self.userMetadata != null) {
            output.t(serialDesc, 3, p162s8.x.f27430a, self.userMetadata);
        }
        if (output.E(serialDesc) || self.emailConfirm != null) {
            output.t(serialDesc, 4, p153r8.C2696g.f26961a, self.emailConfirm);
        }
        if (output.E(serialDesc) || self.phoneConfirm != null) {
            output.t(serialDesc, 5, p153r8.C2696g.f26961a, self.phoneConfirm);
        }
        if (output.E(serialDesc) || self.phone != null) {
            output.t(serialDesc, 6, p153r8.p0.f26988a, self.phone);
        }
        if (output.E(serialDesc) || self.banDuration != null) {
            output.t(serialDesc, 7, p153r8.p0.f26988a, self.banDuration);
        }
        if (!output.E(serialDesc) && self.role == null) {
            return;
        }
        output.t(serialDesc, 8, p153r8.p0.f26988a, self.role);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final java.lang.String getEmail() {
        return this.email;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final java.lang.String getPassword() {
        return this.password;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final kotlinx.serialization.json.c getAppMetadata() {
        return this.appMetadata;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final kotlinx.serialization.json.c getUserMetadata() {
        return this.userMetadata;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final java.lang.Boolean getEmailConfirm() {
        return this.emailConfirm;
    }

    /* JADX INFO: renamed from: component6, reason: from getter */
    public final java.lang.Boolean getPhoneConfirm() {
        return this.phoneConfirm;
    }

    /* JADX INFO: renamed from: component7, reason: from getter */
    public final java.lang.String getPhone() {
        return this.phone;
    }

    /* JADX INFO: renamed from: component8, reason: from getter */
    public final java.lang.String getBanDuration() {
        return this.banDuration;
    }

    /* JADX INFO: renamed from: component9, reason: from getter */
    public final java.lang.String getRole() {
        return this.role;
    }

    public final io.github.jan.supabase.auth.admin.AdminUserUpdateBuilder copy(java.lang.String email, java.lang.String password, kotlinx.serialization.json.c appMetadata, kotlinx.serialization.json.c userMetadata, java.lang.Boolean emailConfirm, java.lang.Boolean phoneConfirm, java.lang.String phone, java.lang.String banDuration, java.lang.String role) {
        return new io.github.jan.supabase.auth.admin.AdminUserUpdateBuilder(email, password, appMetadata, userMetadata, emailConfirm, phoneConfirm, phone, banDuration, role);
    }

    public boolean equals(java.lang.Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof io.github.jan.supabase.auth.admin.AdminUserUpdateBuilder)) {
            return false;
        }
        io.github.jan.supabase.auth.admin.AdminUserUpdateBuilder adminUserUpdateBuilder = (io.github.jan.supabase.auth.admin.AdminUserUpdateBuilder) other;
        return kotlin.jvm.internal.m.a(this.email, adminUserUpdateBuilder.email) && kotlin.jvm.internal.m.a(this.password, adminUserUpdateBuilder.password) && kotlin.jvm.internal.m.a(this.appMetadata, adminUserUpdateBuilder.appMetadata) && kotlin.jvm.internal.m.a(this.userMetadata, adminUserUpdateBuilder.userMetadata) && kotlin.jvm.internal.m.a(this.emailConfirm, adminUserUpdateBuilder.emailConfirm) && kotlin.jvm.internal.m.a(this.phoneConfirm, adminUserUpdateBuilder.phoneConfirm) && kotlin.jvm.internal.m.a(this.phone, adminUserUpdateBuilder.phone) && kotlin.jvm.internal.m.a(this.banDuration, adminUserUpdateBuilder.banDuration) && kotlin.jvm.internal.m.a(this.role, adminUserUpdateBuilder.role);
    }

    public final kotlinx.serialization.json.c getAppMetadata() {
        return this.appMetadata;
    }

    public final java.lang.String getBanDuration() {
        return this.banDuration;
    }

    public final java.lang.String getEmail() {
        return this.email;
    }

    public final java.lang.Boolean getEmailConfirm() {
        return this.emailConfirm;
    }

    public final java.lang.String getPassword() {
        return this.password;
    }

    public final java.lang.String getPhone() {
        return this.phone;
    }

    public final java.lang.Boolean getPhoneConfirm() {
        return this.phoneConfirm;
    }

    public final java.lang.String getRole() {
        return this.role;
    }

    public final kotlinx.serialization.json.c getUserMetadata() {
        return this.userMetadata;
    }

    public int hashCode() {
        java.lang.String str = this.email;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        java.lang.String str2 = this.password;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        kotlinx.serialization.json.c cVar = this.appMetadata;
        int iHashCode3 = (iHashCode2 + (cVar == null ? 0 : cVar.f24558h.hashCode())) * 31;
        kotlinx.serialization.json.c cVar2 = this.userMetadata;
        int iHashCode4 = (iHashCode3 + (cVar2 == null ? 0 : cVar2.f24558h.hashCode())) * 31;
        java.lang.Boolean bool = this.emailConfirm;
        int iHashCode5 = (iHashCode4 + (bool == null ? 0 : bool.hashCode())) * 31;
        java.lang.Boolean bool2 = this.phoneConfirm;
        int iHashCode6 = (iHashCode5 + (bool2 == null ? 0 : bool2.hashCode())) * 31;
        java.lang.String str3 = this.phone;
        int iHashCode7 = (iHashCode6 + (str3 == null ? 0 : str3.hashCode())) * 31;
        java.lang.String str4 = this.banDuration;
        int iHashCode8 = (iHashCode7 + (str4 == null ? 0 : str4.hashCode())) * 31;
        java.lang.String str5 = this.role;
        return iHashCode8 + (str5 != null ? str5.hashCode() : 0);
    }

    public final void setAppMetadata(kotlinx.serialization.json.c cVar) {
        this.appMetadata = cVar;
    }

    public final void setBanDuration(java.lang.String str) {
        this.banDuration = str;
    }

    public final void setEmail(java.lang.String str) {
        this.email = str;
    }

    public final void setEmailConfirm(java.lang.Boolean bool) {
        this.emailConfirm = bool;
    }

    public final void setPassword(java.lang.String str) {
        this.password = str;
    }

    public final void setPhone(java.lang.String str) {
        this.phone = str;
    }

    public final void setPhoneConfirm(java.lang.Boolean bool) {
        this.phoneConfirm = bool;
    }

    public final void setRole(java.lang.String str) {
        this.role = str;
    }

    public final void setUserMetadata(kotlinx.serialization.json.c cVar) {
        this.userMetadata = cVar;
    }

    public java.lang.String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder("AdminUserUpdateBuilder(email=");
        sb.append(this.email);
        sb.append(", password=");
        sb.append(this.password);
        sb.append(", appMetadata=");
        sb.append(this.appMetadata);
        sb.append(", userMetadata=");
        sb.append(this.userMetadata);
        sb.append(", emailConfirm=");
        sb.append(this.emailConfirm);
        sb.append(", phoneConfirm=");
        sb.append(this.phoneConfirm);
        sb.append(", phone=");
        sb.append(this.phone);
        sb.append(", banDuration=");
        sb.append(this.banDuration);
        sb.append(", role=");
        return Y6.f.l(sb, this.role, ')');
    }

    public /* synthetic */ AdminUserUpdateBuilder(int i3, java.lang.String str, java.lang.String str2, kotlinx.serialization.json.c cVar, kotlinx.serialization.json.c cVar2, java.lang.Boolean bool, java.lang.Boolean bool2, java.lang.String str3, java.lang.String str4, java.lang.String str5, p153r8.k0 k0Var) {
        if ((i3 & 1) == 0) {
            this.email = null;
        } else {
            this.email = str;
        }
        if ((i3 & 2) == 0) {
            this.password = null;
        } else {
            this.password = str2;
        }
        if ((i3 & 4) == 0) {
            this.appMetadata = null;
        } else {
            this.appMetadata = cVar;
        }
        if ((i3 & 8) == 0) {
            this.userMetadata = null;
        } else {
            this.userMetadata = cVar2;
        }
        if ((i3 & 16) == 0) {
            this.emailConfirm = null;
        } else {
            this.emailConfirm = bool;
        }
        if ((i3 & 32) == 0) {
            this.phoneConfirm = null;
        } else {
            this.phoneConfirm = bool2;
        }
        if ((i3 & 64) == 0) {
            this.phone = null;
        } else {
            this.phone = str3;
        }
        if ((i3 & 128) == 0) {
            this.banDuration = null;
        } else {
            this.banDuration = str4;
        }
        if ((i3 & 256) == 0) {
            this.role = null;
        } else {
            this.role = str5;
        }
    }

    public AdminUserUpdateBuilder(java.lang.String str, java.lang.String str2, kotlinx.serialization.json.c cVar, kotlinx.serialization.json.c cVar2, java.lang.Boolean bool, java.lang.Boolean bool2, java.lang.String str3, java.lang.String str4, java.lang.String str5) {
        this.email = str;
        this.password = str2;
        this.appMetadata = cVar;
        this.userMetadata = cVar2;
        this.emailConfirm = bool;
        this.phoneConfirm = bool2;
        this.phone = str3;
        this.banDuration = str4;
        this.role = str5;
    }

    public /* synthetic */ AdminUserUpdateBuilder(java.lang.String str, java.lang.String str2, kotlinx.serialization.json.c cVar, kotlinx.serialization.json.c cVar2, java.lang.Boolean bool, java.lang.Boolean bool2, java.lang.String str3, java.lang.String str4, java.lang.String str5, int i3, kotlin.jvm.internal.AbstractC2541f abstractC2541f) {
        this((i3 & 1) != 0 ? null : str, (i3 & 2) != 0 ? null : str2, (i3 & 4) != 0 ? null : cVar, (i3 & 8) != 0 ? null : cVar2, (i3 & 16) != 0 ? null : bool, (i3 & 32) != 0 ? null : bool2, (i3 & 64) != 0 ? null : str3, (i3 & 128) != 0 ? null : str4, (i3 & 256) != 0 ? null : str5);
    }
}
