package com.kiptv.core.model;

/* JADX INFO: loaded from: classes.dex */
@kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0087\b\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0002¨\u0006\u0004"}, d2 = {"Lcom/kiptv/core/model/OSUserInfoData;", "", "Companion", "$serializer", "core_release"}, k = 1, mv = {2, 1, 0}, xi = androidx.media3.container.NalUnitUtil.H265_NAL_UNIT_TYPE_UNSPECIFIED)
@p119n8.i
public final /* data */ class OSUserInfoData {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final com.kiptv.core.model.OSUserInfoData.Companion INSTANCE = new com.kiptv.core.model.OSUserInfoData.Companion();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final java.lang.Integer f19961a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final java.lang.String f19962b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final java.lang.Integer f19963c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final java.lang.Boolean f19964d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final java.lang.Integer f19965e;

    @kotlin.Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001J\u0013\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lcom/kiptv/core/model/OSUserInfoData$Companion;", "", "Lkotlinx/serialization/KSerializer;", "Lcom/kiptv/core/model/OSUserInfoData;", "serializer", "()Lkotlinx/serialization/KSerializer;", "core_release"}, k = 1, mv = {2, 1, 0}, xi = androidx.media3.container.NalUnitUtil.H265_NAL_UNIT_TYPE_UNSPECIFIED)
    public static final class Companion {
        public final kotlinx.serialization.KSerializer serializer() {
            return com.kiptv.core.model.OSUserInfoData$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ OSUserInfoData(int i3, java.lang.Integer num, java.lang.String str, java.lang.Integer num2, java.lang.Boolean bool, java.lang.Integer num3) {
        if ((i3 & 1) == 0) {
            this.f19961a = null;
        } else {
            this.f19961a = num;
        }
        if ((i3 & 2) == 0) {
            this.f19962b = null;
        } else {
            this.f19962b = str;
        }
        if ((i3 & 4) == 0) {
            this.f19963c = null;
        } else {
            this.f19963c = num2;
        }
        if ((i3 & 8) == 0) {
            this.f19964d = null;
        } else {
            this.f19964d = bool;
        }
        if ((i3 & 16) == 0) {
            this.f19965e = null;
        } else {
            this.f19965e = num3;
        }
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof com.kiptv.core.model.OSUserInfoData)) {
            return false;
        }
        com.kiptv.core.model.OSUserInfoData oSUserInfoData = (com.kiptv.core.model.OSUserInfoData) obj;
        return kotlin.jvm.internal.m.a(this.f19961a, oSUserInfoData.f19961a) && kotlin.jvm.internal.m.a(this.f19962b, oSUserInfoData.f19962b) && kotlin.jvm.internal.m.a(this.f19963c, oSUserInfoData.f19963c) && kotlin.jvm.internal.m.a(this.f19964d, oSUserInfoData.f19964d) && kotlin.jvm.internal.m.a(this.f19965e, oSUserInfoData.f19965e);
    }

    public final int hashCode() {
        java.lang.Integer num = this.f19961a;
        int iHashCode = (num == null ? 0 : num.hashCode()) * 31;
        java.lang.String str = this.f19962b;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        java.lang.Integer num2 = this.f19963c;
        int iHashCode3 = (iHashCode2 + (num2 == null ? 0 : num2.hashCode())) * 31;
        java.lang.Boolean bool = this.f19964d;
        int iHashCode4 = (iHashCode3 + (bool == null ? 0 : bool.hashCode())) * 31;
        java.lang.Integer num3 = this.f19965e;
        return iHashCode4 + (num3 != null ? num3.hashCode() : 0);
    }

    public final java.lang.String toString() {
        return "OSUserInfoData(allowedDownloads=" + this.f19961a + ", level=" + this.f19962b + ", userId=" + this.f19963c + ", vip=" + this.f19964d + ", remainingDownloads=" + this.f19965e + ")";
    }
}
