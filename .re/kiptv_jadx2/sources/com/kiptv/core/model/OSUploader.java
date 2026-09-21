package com.kiptv.core.model;

import androidx.media3.container.NalUnitUtil;
import kotlin.Metadata;
import kotlinx.serialization.KSerializer;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0087\b\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0002¨\u0006\u0004"}, d2 = {"Lcom/kiptv/core/model/OSUploader;", "", "Companion", "$serializer", "core_release"}, k = 1, mv = {2, 1, 0}, xi = NalUnitUtil.H265_NAL_UNIT_TYPE_UNSPECIFIED)
@p119n8.i
public final class OSUploader {

    public static final Companion INSTANCE = new Companion();

    public final Integer f19952a;

    public final String f19953b;

    public final String f19954c;

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001J\u0013\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lcom/kiptv/core/model/OSUploader$Companion;", "", "Lkotlinx/serialization/KSerializer;", "Lcom/kiptv/core/model/OSUploader;", "serializer", "()Lkotlinx/serialization/KSerializer;", "core_release"}, k = 1, mv = {2, 1, 0}, xi = NalUnitUtil.H265_NAL_UNIT_TYPE_UNSPECIFIED)
    public static final class Companion {
        public final KSerializer serializer() {
            return OSUploader$$serializer.INSTANCE;
        }
    }

    public OSUploader(int i3, Integer num, String str, String str2) {
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

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof OSUploader)) {
            return false;
        }
        OSUploader oSUploader = (OSUploader) obj;
        return kotlin.jvm.internal.m.a(this.f19952a, oSUploader.f19952a) && kotlin.jvm.internal.m.a(this.f19953b, oSUploader.f19953b) && kotlin.jvm.internal.m.a(this.f19954c, oSUploader.f19954c);
    }

    public final int hashCode() {
        Integer num = this.f19952a;
        int iHashCode = (num == null ? 0 : num.hashCode()) * 31;
        String str = this.f19953b;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.f19954c;
        return iHashCode2 + (str2 != null ? str2.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("OSUploader(uploaderId=");
        sb.append(this.f19952a);
        sb.append(", name=");
        sb.append(this.f19953b);
        sb.append(", rank=");
        return Y6.f.m(sb, this.f19954c, ")");
    }
}
