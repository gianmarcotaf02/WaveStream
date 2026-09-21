package com.kiptv.core.repository;

/* JADX INFO: loaded from: classes.dex */
@kotlin.Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0083\b\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0002¨\u0006\u0004"}, d2 = {"com/kiptv/core/repository/DeviceRegistryRepository$RevokeDeviceResponse", "", "Companion", "$serializer", "core_release"}, k = 1, mv = {2, 1, 0}, xi = androidx.media3.container.NalUnitUtil.H265_NAL_UNIT_TYPE_UNSPECIFIED)
@p119n8.i
public final /* data */ class DeviceRegistryRepository$RevokeDeviceResponse {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final com.kiptv.core.repository.DeviceRegistryRepository$RevokeDeviceResponse.Companion INSTANCE = new com.kiptv.core.repository.DeviceRegistryRepository$RevokeDeviceResponse.Companion();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f20890a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final java.lang.String f20891b;

    @kotlin.Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001J\u0013\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lcom/kiptv/core/repository/DeviceRegistryRepository$RevokeDeviceResponse$Companion;", "", "Lkotlinx/serialization/KSerializer;", "Lcom/kiptv/core/repository/DeviceRegistryRepository$RevokeDeviceResponse;", "serializer", "()Lkotlinx/serialization/KSerializer;", "core_release"}, k = 1, mv = {2, 1, 0}, xi = androidx.media3.container.NalUnitUtil.H265_NAL_UNIT_TYPE_UNSPECIFIED)
    public static final class Companion {
        public final kotlinx.serialization.KSerializer serializer() {
            return com.kiptv.core.repository.DeviceRegistryRepository$RevokeDeviceResponse$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ DeviceRegistryRepository$RevokeDeviceResponse(int i3, java.lang.String str, boolean z6) {
        this.f20890a = (i3 & 1) == 0 ? false : z6;
        if ((i3 & 2) == 0) {
            this.f20891b = null;
        } else {
            this.f20891b = str;
        }
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof com.kiptv.core.repository.DeviceRegistryRepository$RevokeDeviceResponse)) {
            return false;
        }
        com.kiptv.core.repository.DeviceRegistryRepository$RevokeDeviceResponse deviceRegistryRepository$RevokeDeviceResponse = (com.kiptv.core.repository.DeviceRegistryRepository$RevokeDeviceResponse) obj;
        return this.f20890a == deviceRegistryRepository$RevokeDeviceResponse.f20890a && kotlin.jvm.internal.m.a(this.f20891b, deviceRegistryRepository$RevokeDeviceResponse.f20891b);
    }

    public final int hashCode() {
        int iHashCode = java.lang.Boolean.hashCode(this.f20890a) * 31;
        java.lang.String str = this.f20891b;
        return iHashCode + (str == null ? 0 : str.hashCode());
    }

    public final java.lang.String toString() {
        return "RevokeDeviceResponse(success=" + this.f20890a + ", error=" + this.f20891b + ")";
    }
}
