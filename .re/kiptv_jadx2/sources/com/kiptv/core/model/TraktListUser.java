package com.kiptv.core.model;

import androidx.media3.container.NalUnitUtil;
import kotlin.Metadata;
import kotlinx.serialization.KSerializer;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0087\b\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0002¨\u0006\u0004"}, d2 = {"Lcom/kiptv/core/model/TraktListUser;", "", "Companion", "$serializer", "core_release"}, k = 1, mv = {2, 1, 0}, xi = NalUnitUtil.H265_NAL_UNIT_TYPE_UNSPECIFIED)
@p119n8.i
public final class TraktListUser {

    public static final Companion INSTANCE = new Companion();

    public final String f20445a;

    public final String f20446b;

    public final TraktIds f20447c;

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001J\u0013\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lcom/kiptv/core/model/TraktListUser$Companion;", "", "Lkotlinx/serialization/KSerializer;", "Lcom/kiptv/core/model/TraktListUser;", "serializer", "()Lkotlinx/serialization/KSerializer;", "core_release"}, k = 1, mv = {2, 1, 0}, xi = NalUnitUtil.H265_NAL_UNIT_TYPE_UNSPECIFIED)
    public static final class Companion {
        public final KSerializer serializer() {
            return TraktListUser$$serializer.INSTANCE;
        }
    }

    public TraktListUser(int i3, String str, String str2, TraktIds traktIds) {
        if ((i3 & 1) == 0) {
            this.f20445a = null;
        } else {
            this.f20445a = str;
        }
        if ((i3 & 2) == 0) {
            this.f20446b = null;
        } else {
            this.f20446b = str2;
        }
        if ((i3 & 4) == 0) {
            this.f20447c = null;
        } else {
            this.f20447c = traktIds;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof TraktListUser)) {
            return false;
        }
        TraktListUser traktListUser = (TraktListUser) obj;
        return kotlin.jvm.internal.m.a(this.f20445a, traktListUser.f20445a) && kotlin.jvm.internal.m.a(this.f20446b, traktListUser.f20446b) && kotlin.jvm.internal.m.a(this.f20447c, traktListUser.f20447c);
    }

    public final int hashCode() {
        String str = this.f20445a;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.f20446b;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        TraktIds traktIds = this.f20447c;
        return iHashCode2 + (traktIds != null ? traktIds.hashCode() : 0);
    }

    public final String toString() {
        return "TraktListUser(username=" + this.f20445a + ", name=" + this.f20446b + ", ids=" + this.f20447c + ")";
    }
}
