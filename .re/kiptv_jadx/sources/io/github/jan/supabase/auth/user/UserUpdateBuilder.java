package io.github.jan.supabase.auth.user;

/* JADX INFO: loaded from: classes4.dex */
@kotlin.Metadata(d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0012\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u001c\b\u0087\b\u0018\u0000 I2\u00020\u0001:\u0002JIBM\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\b\b\u0002\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u000b\u0010\fBM\b\u0010\u0012\u0006\u0010\u000e\u001a\u00020\r\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\u0010\u001a\u0004\u0018\u00010\u000f¢\u0006\u0004\b\u000b\u0010\u0011J$\u0010\b\u001a\u00020\u0013\"\n\b\u0000\u0010\u0012\u0018\u0001*\u00020\u00012\u0006\u0010\b\u001a\u00028\u0000H\u0086\b¢\u0006\u0004\b\b\u0010\u0014J'\u0010\b\u001a\u00020\u00132\u0012\u0010\u0017\u001a\u000e\u0012\u0004\u0012\u00020\u0016\u0012\u0004\u0012\u00020\u00130\u0015H\u0086\bø\u0001\u0000¢\u0006\u0004\b\b\u0010\u0018J\u0012\u0010\u0019\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0019\u0010\u001aJ\u0012\u0010\u001b\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u001b\u0010\u001aJ\u0012\u0010\u001c\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u001c\u0010\u001aJ\u0012\u0010\u001d\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u001d\u0010\u001aJ\u0012\u0010\u001e\u001a\u0004\u0018\u00010\u0007HÆ\u0003¢\u0006\u0004\b\u001e\u0010\u001fJ\u0010\u0010\"\u001a\u00020\tHÀ\u0003¢\u0006\u0004\b \u0010!JV\u0010#\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00072\b\b\u0002\u0010\n\u001a\u00020\tHÆ\u0001¢\u0006\u0004\b#\u0010$J\u0010\u0010%\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b%\u0010\u001aJ\u0010\u0010&\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b&\u0010'J\u001a\u0010*\u001a\u00020)2\b\u0010(\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b*\u0010+J'\u00103\u001a\u00020\u00132\u0006\u0010,\u001a\u00020\u00002\u0006\u0010.\u001a\u00020-2\u0006\u00100\u001a\u00020/H\u0001¢\u0006\u0004\b1\u00102R$\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0003\u00104\u001a\u0004\b5\u0010\u001a\"\u0004\b6\u00107R$\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0004\u00104\u001a\u0004\b8\u0010\u001a\"\u0004\b9\u00107R*\u0010\u0005\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u0087\u000e¢\u0006\u0018\n\u0004\b\u0005\u00104\u0012\u0004\b<\u0010=\u001a\u0004\b:\u0010\u001a\"\u0004\b;\u00107R$\u0010\u0006\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0006\u00104\u001a\u0004\b>\u0010\u001a\"\u0004\b?\u00107R$\u0010\b\u001a\u0004\u0018\u00010\u00078\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\b\u0010@\u001a\u0004\bA\u0010\u001f\"\u0004\bB\u0010CR(\u0010\n\u001a\u00020\t8\u0000@\u0000X\u0081\u000e¢\u0006\u0018\n\u0004\b\n\u0010D\u0012\u0004\bH\u0010=\u001a\u0004\bE\u0010!\"\u0004\bF\u0010G\u0082\u0002\u0007\n\u0005\b\u009920\u0001¨\u0006K"}, d2 = {"Lio/github/jan/supabase/auth/user/UserUpdateBuilder;", "", "", "email", "password", "phone", "nonce", "Lkotlinx/serialization/json/c;", "data", "Lio/github/jan/supabase/SupabaseSerializer;", "serializer", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lkotlinx/serialization/json/c;Lio/github/jan/supabase/SupabaseSerializer;)V", "", "seen0", "Lr8/k0;", "serializationConstructorMarker", "(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lkotlinx/serialization/json/c;Lr8/k0;)V", "T", "Lh6/A;", "(Ljava/lang/Object;)V", "Lkotlin/Function1;", "Ls8/v;", "builder", "(Lx6/j;)V", "component1", "()Ljava/lang/String;", "component2", "component3", "component4", "component5", "()Lkotlinx/serialization/json/c;", "component6$auth_kt_release", "()Lio/github/jan/supabase/SupabaseSerializer;", "component6", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lkotlinx/serialization/json/c;Lio/github/jan/supabase/SupabaseSerializer;)Lio/github/jan/supabase/auth/user/UserUpdateBuilder;", "toString", "hashCode", "()I", io.sentry.protocol.Request.JsonKeys.OTHER, "", "equals", "(Ljava/lang/Object;)Z", "self", "Lq8/b;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "write$Self$auth_kt_release", "(Lio/github/jan/supabase/auth/user/UserUpdateBuilder;Lq8/b;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "write$Self", "Ljava/lang/String;", "getEmail", "setEmail", "(Ljava/lang/String;)V", "getPassword", "setPassword", "getPhone", "setPhone", "getPhone$annotations", "()V", "getNonce", "setNonce", "Lkotlinx/serialization/json/c;", "getData", "setData", "(Lkotlinx/serialization/json/c;)V", "Lio/github/jan/supabase/SupabaseSerializer;", "getSerializer", "setSerializer", "(Lio/github/jan/supabase/SupabaseSerializer;)V", "getSerializer$annotations", "Companion", "$serializer", "auth-kt_release"}, k = 1, mv = {2, 1, 0}, xi = androidx.media3.container.NalUnitUtil.H265_NAL_UNIT_TYPE_UNSPECIFIED)
@p119n8.i
public final /* data */ class UserUpdateBuilder {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final io.github.jan.supabase.auth.user.UserUpdateBuilder.Companion INSTANCE = new io.github.jan.supabase.auth.user.UserUpdateBuilder.Companion(null);
    private kotlinx.serialization.json.c data;
    private java.lang.String email;
    private java.lang.String nonce;
    private java.lang.String password;
    private java.lang.String phone;
    private io.github.jan.supabase.SupabaseSerializer serializer;

    @kotlin.Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¨\u0006\u0007"}, d2 = {"Lio/github/jan/supabase/auth/user/UserUpdateBuilder$Companion;", "", "<init>", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lio/github/jan/supabase/auth/user/UserUpdateBuilder;", "auth-kt_release"}, k = 1, mv = {2, 1, 0}, xi = androidx.media3.container.NalUnitUtil.H265_NAL_UNIT_TYPE_UNSPECIFIED)
    public static final class Companion {
        private Companion() {
        }

        public final kotlinx.serialization.KSerializer serializer() {
            return io.github.jan.supabase.auth.user.UserUpdateBuilder$$serializer.INSTANCE;
        }

        public /* synthetic */ Companion(kotlin.jvm.internal.AbstractC2541f abstractC2541f) {
            this();
        }
    }

    public UserUpdateBuilder() {
        this(null, null, null, null, null, null, 63, null);
    }

    public static /* synthetic */ io.github.jan.supabase.auth.user.UserUpdateBuilder copy$default(io.github.jan.supabase.auth.user.UserUpdateBuilder userUpdateBuilder, java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String str4, kotlinx.serialization.json.c cVar, io.github.jan.supabase.SupabaseSerializer supabaseSerializer, int i3, java.lang.Object obj) {
        if ((i3 & 1) != 0) {
            str = userUpdateBuilder.email;
        }
        if ((i3 & 2) != 0) {
            str2 = userUpdateBuilder.password;
        }
        if ((i3 & 4) != 0) {
            str3 = userUpdateBuilder.phone;
        }
        if ((i3 & 8) != 0) {
            str4 = userUpdateBuilder.nonce;
        }
        if ((i3 & 16) != 0) {
            cVar = userUpdateBuilder.data;
        }
        if ((i3 & 32) != 0) {
            supabaseSerializer = userUpdateBuilder.serializer;
        }
        kotlinx.serialization.json.c cVar2 = cVar;
        io.github.jan.supabase.SupabaseSerializer supabaseSerializer2 = supabaseSerializer;
        return userUpdateBuilder.copy(str, str2, str3, str4, cVar2, supabaseSerializer2);
    }

    @p119n8.h("phone")
    public static /* synthetic */ void getPhone$annotations() {
    }

    public static /* synthetic */ void getSerializer$annotations() {
    }

    public static final /* synthetic */ void write$Self$auth_kt_release(io.github.jan.supabase.auth.user.UserUpdateBuilder self, p143q8.b output, kotlinx.serialization.descriptors.SerialDescriptor serialDesc) {
        if (output.E(serialDesc) || self.email != null) {
            output.t(serialDesc, 0, p153r8.p0.f26988a, self.email);
        }
        if (output.E(serialDesc) || self.password != null) {
            output.t(serialDesc, 1, p153r8.p0.f26988a, self.password);
        }
        if (output.E(serialDesc) || self.phone != null) {
            output.t(serialDesc, 2, p153r8.p0.f26988a, self.phone);
        }
        if (output.E(serialDesc) || self.nonce != null) {
            output.t(serialDesc, 3, p153r8.p0.f26988a, self.nonce);
        }
        if (!output.E(serialDesc) && self.data == null) {
            return;
        }
        output.t(serialDesc, 4, p162s8.x.f27430a, self.data);
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
    public final java.lang.String getPhone() {
        return this.phone;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final java.lang.String getNonce() {
        return this.nonce;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final kotlinx.serialization.json.c getData() {
        return this.data;
    }

    /* JADX INFO: renamed from: component6$auth_kt_release, reason: from getter */
    public final io.github.jan.supabase.SupabaseSerializer getSerializer() {
        return this.serializer;
    }

    public final io.github.jan.supabase.auth.user.UserUpdateBuilder copy(java.lang.String email, java.lang.String password, java.lang.String phone, java.lang.String nonce, kotlinx.serialization.json.c data, io.github.jan.supabase.SupabaseSerializer serializer) {
        kotlin.jvm.internal.m.e(serializer, "serializer");
        return new io.github.jan.supabase.auth.user.UserUpdateBuilder(email, password, phone, nonce, data, serializer);
    }

    public final <T> void data(T data) {
        kotlin.jvm.internal.m.e(data, "data");
        getSerializer();
        p162s8.c cVar = p162s8.d.f27387d;
        kotlin.jvm.internal.m.j();
        throw null;
    }

    public boolean equals(java.lang.Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof io.github.jan.supabase.auth.user.UserUpdateBuilder)) {
            return false;
        }
        io.github.jan.supabase.auth.user.UserUpdateBuilder userUpdateBuilder = (io.github.jan.supabase.auth.user.UserUpdateBuilder) other;
        return kotlin.jvm.internal.m.a(this.email, userUpdateBuilder.email) && kotlin.jvm.internal.m.a(this.password, userUpdateBuilder.password) && kotlin.jvm.internal.m.a(this.phone, userUpdateBuilder.phone) && kotlin.jvm.internal.m.a(this.nonce, userUpdateBuilder.nonce) && kotlin.jvm.internal.m.a(this.data, userUpdateBuilder.data) && kotlin.jvm.internal.m.a(this.serializer, userUpdateBuilder.serializer);
    }

    public final kotlinx.serialization.json.c getData() {
        return this.data;
    }

    public final java.lang.String getEmail() {
        return this.email;
    }

    public final java.lang.String getNonce() {
        return this.nonce;
    }

    public final java.lang.String getPassword() {
        return this.password;
    }

    public final java.lang.String getPhone() {
        return this.phone;
    }

    public final io.github.jan.supabase.SupabaseSerializer getSerializer() {
        return this.serializer;
    }

    public int hashCode() {
        java.lang.String str = this.email;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        java.lang.String str2 = this.password;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        java.lang.String str3 = this.phone;
        int iHashCode3 = (iHashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        java.lang.String str4 = this.nonce;
        int iHashCode4 = (iHashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31;
        kotlinx.serialization.json.c cVar = this.data;
        return this.serializer.hashCode() + ((iHashCode4 + (cVar != null ? cVar.f24558h.hashCode() : 0)) * 31);
    }

    public final void setData(kotlinx.serialization.json.c cVar) {
        this.data = cVar;
    }

    public final void setEmail(java.lang.String str) {
        this.email = str;
    }

    public final void setNonce(java.lang.String str) {
        this.nonce = str;
    }

    public final void setPassword(java.lang.String str) {
        this.password = str;
    }

    public final void setPhone(java.lang.String str) {
        this.phone = str;
    }

    public final void setSerializer(io.github.jan.supabase.SupabaseSerializer supabaseSerializer) {
        kotlin.jvm.internal.m.e(supabaseSerializer, "<set-?>");
        this.serializer = supabaseSerializer;
    }

    public java.lang.String toString() {
        return "UserUpdateBuilder(email=" + this.email + ", password=" + this.password + ", phone=" + this.phone + ", nonce=" + this.nonce + ", data=" + this.data + ", serializer=" + this.serializer + ')';
    }

    /* JADX WARN: Multi-variable type inference failed */
    public /* synthetic */ UserUpdateBuilder(int i3, java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String str4, kotlinx.serialization.json.c cVar, p153r8.k0 k0Var) {
        p162s8.d dVar = null;
        java.lang.Object[] objArr = 0;
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
            this.phone = null;
        } else {
            this.phone = str3;
        }
        if ((i3 & 8) == 0) {
            this.nonce = null;
        } else {
            this.nonce = str4;
        }
        if ((i3 & 16) == 0) {
            this.data = null;
        } else {
            this.data = cVar;
        }
        this.serializer = new io.github.jan.supabase.serializer.KotlinXSerializer(dVar, 1, objArr == true ? 1 : 0);
    }

    public final void data(p194x6.j builder) {
        kotlin.jvm.internal.m.e(builder, "builder");
        p162s8.v vVar = new p162s8.v();
        builder.invoke(vVar);
        setData(vVar.a());
    }

    public UserUpdateBuilder(java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String str4, kotlinx.serialization.json.c cVar, io.github.jan.supabase.SupabaseSerializer serializer) {
        kotlin.jvm.internal.m.e(serializer, "serializer");
        this.email = str;
        this.password = str2;
        this.phone = str3;
        this.nonce = str4;
        this.data = cVar;
        this.serializer = serializer;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public /* synthetic */ UserUpdateBuilder(java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String str4, kotlinx.serialization.json.c cVar, io.github.jan.supabase.SupabaseSerializer supabaseSerializer, int i3, kotlin.jvm.internal.AbstractC2541f abstractC2541f) {
        this((i3 & 1) != 0 ? null : str, (i3 & 2) != 0 ? null : str2, (i3 & 4) != 0 ? null : str3, (i3 & 8) != 0 ? null : str4, (i3 & 16) != 0 ? null : cVar, (i3 & 32) != 0 ? new io.github.jan.supabase.serializer.KotlinXSerializer(null, 1, 0 == true ? 1 : 0) : supabaseSerializer);
    }
}
