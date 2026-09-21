package com.kiptv.core.model;

/* JADX INFO: loaded from: classes.dex */
@kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0087\b\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0002¨\u0006\u0004"}, d2 = {"Lcom/kiptv/core/model/UserDevice;", "", "Companion", "$serializer", "core_release"}, k = 1, mv = {2, 1, 0}, xi = androidx.media3.container.NalUnitUtil.H265_NAL_UNIT_TYPE_UNSPECIFIED)
@p119n8.i
public final /* data */ class UserDevice {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final com.kiptv.core.model.UserDevice.Companion INSTANCE = new com.kiptv.core.model.UserDevice.Companion();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final java.lang.String f20570a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final java.lang.String f20571b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final java.lang.String f20572c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final java.lang.String f20573d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final java.lang.String f20574e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final java.lang.String f20575f;
    public final java.lang.String g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final java.lang.String f20576h;

    @kotlin.Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001J\u0013\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lcom/kiptv/core/model/UserDevice$Companion;", "", "Lkotlinx/serialization/KSerializer;", "Lcom/kiptv/core/model/UserDevice;", "serializer", "()Lkotlinx/serialization/KSerializer;", "core_release"}, k = 1, mv = {2, 1, 0}, xi = androidx.media3.container.NalUnitUtil.H265_NAL_UNIT_TYPE_UNSPECIFIED)
    public static final class Companion {
        public final kotlinx.serialization.KSerializer serializer() {
            return com.kiptv.core.model.UserDevice$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ UserDevice(int i3, java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String str4, java.lang.String str5, java.lang.String str6, java.lang.String str7, java.lang.String str8) {
        if (1 != (i3 & 1)) {
            p153r8.AbstractC2686a0.l(i3, 1, com.kiptv.core.model.UserDevice$$serializer.INSTANCE.getDescriptor());
            throw null;
        }
        this.f20570a = str;
        if ((i3 & 2) == 0) {
            this.f20571b = null;
        } else {
            this.f20571b = str2;
        }
        if ((i3 & 4) == 0) {
            this.f20572c = null;
        } else {
            this.f20572c = str3;
        }
        if ((i3 & 8) == 0) {
            this.f20573d = "";
        } else {
            this.f20573d = str4;
        }
        if ((i3 & 16) == 0) {
            this.f20574e = null;
        } else {
            this.f20574e = str5;
        }
        if ((i3 & 32) == 0) {
            this.f20575f = null;
        } else {
            this.f20575f = str6;
        }
        if ((i3 & 64) == 0) {
            this.g = null;
        } else {
            this.g = str7;
        }
        if ((i3 & 128) == 0) {
            this.f20576h = null;
        } else {
            this.f20576h = str8;
        }
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof com.kiptv.core.model.UserDevice)) {
            return false;
        }
        com.kiptv.core.model.UserDevice userDevice = (com.kiptv.core.model.UserDevice) obj;
        return kotlin.jvm.internal.m.a(this.f20570a, userDevice.f20570a) && kotlin.jvm.internal.m.a(this.f20571b, userDevice.f20571b) && kotlin.jvm.internal.m.a(this.f20572c, userDevice.f20572c) && kotlin.jvm.internal.m.a(this.f20573d, userDevice.f20573d) && kotlin.jvm.internal.m.a(this.f20574e, userDevice.f20574e) && kotlin.jvm.internal.m.a(this.f20575f, userDevice.f20575f) && kotlin.jvm.internal.m.a(this.g, userDevice.g) && kotlin.jvm.internal.m.a(this.f20576h, userDevice.f20576h);
    }

    public final int hashCode() {
        int iHashCode = this.f20570a.hashCode() * 31;
        java.lang.String str = this.f20571b;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        java.lang.String str2 = this.f20572c;
        int iA = B2.a.a((iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31, 31, this.f20573d);
        java.lang.String str3 = this.f20574e;
        int iHashCode3 = (iA + (str3 == null ? 0 : str3.hashCode())) * 31;
        java.lang.String str4 = this.f20575f;
        int iHashCode4 = (iHashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31;
        java.lang.String str5 = this.g;
        int iHashCode5 = (iHashCode4 + (str5 == null ? 0 : str5.hashCode())) * 31;
        java.lang.String str6 = this.f20576h;
        return iHashCode5 + (str6 != null ? str6.hashCode() : 0);
    }

    public final java.lang.String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder("UserDevice(deviceId=");
        sb.append(this.f20570a);
        sb.append(", deviceName=");
        sb.append(this.f20571b);
        sb.append(", model=");
        sb.append(this.f20572c);
        sb.append(", platform=");
        sb.append(this.f20573d);
        sb.append(", appVersion=");
        sb.append(this.f20574e);
        sb.append(", osVersion=");
        sb.append(this.f20575f);
        sb.append(", lastSeenAt=");
        sb.append(this.g);
        sb.append(", revokedAt=");
        return Y6.f.m(sb, this.f20576h, ")");
    }
}
