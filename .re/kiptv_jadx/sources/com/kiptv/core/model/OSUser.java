package com.kiptv.core.model;

/* JADX INFO: loaded from: classes.dex */
@kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0087\b\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0002¨\u0006\u0004"}, d2 = {"Lcom/kiptv/core/model/OSUser;", "", "Companion", "$serializer", "core_release"}, k = 1, mv = {2, 1, 0}, xi = androidx.media3.container.NalUnitUtil.H265_NAL_UNIT_TYPE_UNSPECIFIED)
@p119n8.i
public final /* data */ class OSUser {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final com.kiptv.core.model.OSUser.Companion INSTANCE = new com.kiptv.core.model.OSUser.Companion();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final java.lang.Integer f19955a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final java.lang.String f19956b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final java.lang.Integer f19957c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final java.lang.Boolean f19958d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final java.lang.Boolean f19959e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final java.lang.Integer f19960f;

    @kotlin.Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001J\u0013\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lcom/kiptv/core/model/OSUser$Companion;", "", "Lkotlinx/serialization/KSerializer;", "Lcom/kiptv/core/model/OSUser;", "serializer", "()Lkotlinx/serialization/KSerializer;", "core_release"}, k = 1, mv = {2, 1, 0}, xi = androidx.media3.container.NalUnitUtil.H265_NAL_UNIT_TYPE_UNSPECIFIED)
    public static final class Companion {
        public final kotlinx.serialization.KSerializer serializer() {
            return com.kiptv.core.model.OSUser$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ OSUser(int i3, java.lang.Integer num, java.lang.String str, java.lang.Integer num2, java.lang.Boolean bool, java.lang.Boolean bool2, java.lang.Integer num3) {
        if ((i3 & 1) == 0) {
            this.f19955a = null;
        } else {
            this.f19955a = num;
        }
        if ((i3 & 2) == 0) {
            this.f19956b = null;
        } else {
            this.f19956b = str;
        }
        if ((i3 & 4) == 0) {
            this.f19957c = null;
        } else {
            this.f19957c = num2;
        }
        if ((i3 & 8) == 0) {
            this.f19958d = null;
        } else {
            this.f19958d = bool;
        }
        if ((i3 & 16) == 0) {
            this.f19959e = null;
        } else {
            this.f19959e = bool2;
        }
        if ((i3 & 32) == 0) {
            this.f19960f = null;
        } else {
            this.f19960f = num3;
        }
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof com.kiptv.core.model.OSUser)) {
            return false;
        }
        com.kiptv.core.model.OSUser oSUser = (com.kiptv.core.model.OSUser) obj;
        return kotlin.jvm.internal.m.a(this.f19955a, oSUser.f19955a) && kotlin.jvm.internal.m.a(this.f19956b, oSUser.f19956b) && kotlin.jvm.internal.m.a(this.f19957c, oSUser.f19957c) && kotlin.jvm.internal.m.a(this.f19958d, oSUser.f19958d) && kotlin.jvm.internal.m.a(this.f19959e, oSUser.f19959e) && kotlin.jvm.internal.m.a(this.f19960f, oSUser.f19960f);
    }

    public final int hashCode() {
        java.lang.Integer num = this.f19955a;
        int iHashCode = (num == null ? 0 : num.hashCode()) * 31;
        java.lang.String str = this.f19956b;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        java.lang.Integer num2 = this.f19957c;
        int iHashCode3 = (iHashCode2 + (num2 == null ? 0 : num2.hashCode())) * 31;
        java.lang.Boolean bool = this.f19958d;
        int iHashCode4 = (iHashCode3 + (bool == null ? 0 : bool.hashCode())) * 31;
        java.lang.Boolean bool2 = this.f19959e;
        int iHashCode5 = (iHashCode4 + (bool2 == null ? 0 : bool2.hashCode())) * 31;
        java.lang.Integer num3 = this.f19960f;
        return iHashCode5 + (num3 != null ? num3.hashCode() : 0);
    }

    public final java.lang.String toString() {
        return "OSUser(allowedDownloads=" + this.f19955a + ", level=" + this.f19956b + ", userId=" + this.f19957c + ", vip=" + this.f19958d + ", extInstalled=" + this.f19959e + ", remainingDownloads=" + this.f19960f + ")";
    }
}
