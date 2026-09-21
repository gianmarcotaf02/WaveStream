package com.kiptv.core.model;

import androidx.media3.container.NalUnitUtil;
import kotlin.Metadata;
import kotlinx.serialization.KSerializer;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0087\b\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0002¨\u0006\u0004"}, d2 = {"Lcom/kiptv/core/model/TraktScrobbleResponse;", "", "Companion", "$serializer", "core_release"}, k = 1, mv = {2, 1, 0}, xi = NalUnitUtil.H265_NAL_UNIT_TYPE_UNSPECIFIED)
@p119n8.i
public final class TraktScrobbleResponse {

    public static final Companion INSTANCE = new Companion();

    public final Long f20492a;

    public final String f20493b;

    public final Double f20494c;

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001J\u0013\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lcom/kiptv/core/model/TraktScrobbleResponse$Companion;", "", "Lkotlinx/serialization/KSerializer;", "Lcom/kiptv/core/model/TraktScrobbleResponse;", "serializer", "()Lkotlinx/serialization/KSerializer;", "core_release"}, k = 1, mv = {2, 1, 0}, xi = NalUnitUtil.H265_NAL_UNIT_TYPE_UNSPECIFIED)
    public static final class Companion {
        public final KSerializer serializer() {
            return TraktScrobbleResponse$$serializer.INSTANCE;
        }
    }

    public TraktScrobbleResponse(int i3, Long l2, String str, Double d4) {
        if ((i3 & 1) == 0) {
            this.f20492a = null;
        } else {
            this.f20492a = l2;
        }
        if ((i3 & 2) == 0) {
            this.f20493b = null;
        } else {
            this.f20493b = str;
        }
        if ((i3 & 4) == 0) {
            this.f20494c = null;
        } else {
            this.f20494c = d4;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof TraktScrobbleResponse)) {
            return false;
        }
        TraktScrobbleResponse traktScrobbleResponse = (TraktScrobbleResponse) obj;
        return kotlin.jvm.internal.m.a(this.f20492a, traktScrobbleResponse.f20492a) && kotlin.jvm.internal.m.a(this.f20493b, traktScrobbleResponse.f20493b) && kotlin.jvm.internal.m.a(this.f20494c, traktScrobbleResponse.f20494c);
    }

    public final int hashCode() {
        Long l2 = this.f20492a;
        int iHashCode = (l2 == null ? 0 : l2.hashCode()) * 31;
        String str = this.f20493b;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        Double d4 = this.f20494c;
        return iHashCode2 + (d4 != null ? d4.hashCode() : 0);
    }

    public final String toString() {
        return "TraktScrobbleResponse(id=" + this.f20492a + ", action=" + this.f20493b + ", progress=" + this.f20494c + ")";
    }
}
