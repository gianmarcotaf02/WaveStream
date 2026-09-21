package com.kiptv.core.model;

/* JADX INFO: loaded from: classes.dex */
@kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0087\b\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0002¨\u0006\u0004"}, d2 = {"Lcom/kiptv/core/model/OSUploader;", "", "Companion", "$serializer", "core_release"}, k = 1, mv = {2, 1, 0}, xi = androidx.media3.container.NalUnitUtil.H265_NAL_UNIT_TYPE_UNSPECIFIED)
@p119n8.i
public final /* data */ class OSUploader {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final com.kiptv.core.model.OSUploader.Companion INSTANCE = new com.kiptv.core.model.OSUploader.Companion();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final java.lang.Integer f19952a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final java.lang.String f19953b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final java.lang.String f19954c;

    @kotlin.Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001J\u0013\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lcom/kiptv/core/model/OSUploader$Companion;", "", "Lkotlinx/serialization/KSerializer;", "Lcom/kiptv/core/model/OSUploader;", "serializer", "()Lkotlinx/serialization/KSerializer;", "core_release"}, k = 1, mv = {2, 1, 0}, xi = androidx.media3.container.NalUnitUtil.H265_NAL_UNIT_TYPE_UNSPECIFIED)
    public static final class Companion {
        public final kotlinx.serialization.KSerializer serializer() {
            return com.kiptv.core.model.OSUploader$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ OSUploader(int i3, java.lang.Integer num, java.lang.String str, java.lang.String str2) {
        if ((i3 & 1) == 0) {
            this.f19952a = null;
        } else {
            this.f19952a = num;
        }
        if ((i3 & 2) == 0) {
            this.f19953b = null;
        } else {
            this.f19953b = str;
        }
        if ((i3 & 4) == 0) {
            this.f19954c = null;
        } else {
            this.f19954c = str2;
        }
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof com.kiptv.core.model.OSUploader)) {
            return false;
        }
        com.kiptv.core.model.OSUploader oSUploader = (com.kiptv.core.model.OSUploader) obj;
        return kotlin.jvm.internal.m.a(this.f19952a, oSUploader.f19952a) && kotlin.jvm.internal.m.a(this.f19953b, oSUploader.f19953b) && kotlin.jvm.internal.m.a(this.f19954c, oSUploader.f19954c);
    }

    public final int hashCode() {
        java.lang.Integer num = this.f19952a;
        int iHashCode = (num == null ? 0 : num.hashCode()) * 31;
        java.lang.String str = this.f19953b;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        java.lang.String str2 = this.f19954c;
        return iHashCode2 + (str2 != null ? str2.hashCode() : 0);
    }

    public final java.lang.String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder("OSUploader(uploaderId=");
        sb.append(this.f19952a);
        sb.append(", name=");
        sb.append(this.f19953b);
        sb.append(", rank=");
        return Y6.f.m(sb, this.f19954c, ")");
    }
}
