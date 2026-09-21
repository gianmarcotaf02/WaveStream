package com.kiptv.core.model;

import androidx.media3.container.NalUnitUtil;
import kotlin.Metadata;
import kotlinx.serialization.KSerializer;
import p153r8.AbstractC2686a0;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0087\b\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0002¨\u0006\u0004"}, d2 = {"Lcom/kiptv/core/model/UserDevice;", "", "Companion", "$serializer", "core_release"}, k = 1, mv = {2, 1, 0}, xi = NalUnitUtil.H265_NAL_UNIT_TYPE_UNSPECIFIED)
@p119n8.i
public final class UserDevice {

    public static final Companion INSTANCE = new Companion();

    public final String f20570a;

    public final String f20571b;

    public final String f20572c;

    public final String f20573d;

    public final String f20574e;

    public final String f20575f;
    public final String g;

    public final String f20576h;

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001J\u0013\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lcom/kiptv/core/model/UserDevice$Companion;", "", "Lkotlinx/serialization/KSerializer;", "Lcom/kiptv/core/model/UserDevice;", "serializer", "()Lkotlinx/serialization/KSerializer;", "core_release"}, k = 1, mv = {2, 1, 0}, xi = NalUnitUtil.H265_NAL_UNIT_TYPE_UNSPECIFIED)
    public static final class Companion {
        public final KSerializer serializer() {
            return UserDevice$$serializer.INSTANCE;
        }
    }

    public UserDevice(int i3, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8) {
        if (1 != (i3 & 1)) {
            AbstractC2686a0.l(i3, 1, UserDevice$$serializer.INSTANCE.getDescriptor());
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

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof UserDevice)) {
            return false;
        }
        UserDevice userDevice = (UserDevice) obj;
        return kotlin.jvm.internal.m.a(this.f20570a, userDevice.f20570a) && kotlin.jvm.internal.m.a(this.f20571b, userDevice.f20571b) && kotlin.jvm.internal.m.a(this.f20572c, userDevice.f20572c) && kotlin.jvm.internal.m.a(this.f20573d, userDevice.f20573d) && kotlin.jvm.internal.m.a(this.f20574e, userDevice.f20574e) && kotlin.jvm.internal.m.a(this.f20575f, userDevice.f20575f) && kotlin.jvm.internal.m.a(this.g, userDevice.g) && kotlin.jvm.internal.m.a(this.f20576h, userDevice.f20576h);
    }

    public final int hashCode() {
        int iHashCode = this.f20570a.hashCode() * 31;
        String str = this.f20571b;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.f20572c;
        int iA = B2.a.a((iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31, 31, this.f20573d);
        String str3 = this.f20574e;
        int iHashCode3 = (iA + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.f20575f;
        int iHashCode4 = (iHashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.g;
        int iHashCode5 = (iHashCode4 + (str5 == null ? 0 : str5.hashCode())) * 31;
        String str6 = this.f20576h;
        return iHashCode5 + (str6 != null ? str6.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("UserDevice(deviceId=");
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
