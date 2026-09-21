package com.kiptv.core.model;

/* JADX INFO: loaded from: classes.dex */
@kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0087\b\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0002¨\u0006\u0004"}, d2 = {"Lcom/kiptv/core/model/TraktScrobbleResponse;", "", "Companion", "$serializer", "core_release"}, k = 1, mv = {2, 1, 0}, xi = androidx.media3.container.NalUnitUtil.H265_NAL_UNIT_TYPE_UNSPECIFIED)
@p119n8.i
public final /* data */ class TraktScrobbleResponse {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final com.kiptv.core.model.TraktScrobbleResponse.Companion INSTANCE = new com.kiptv.core.model.TraktScrobbleResponse.Companion();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final java.lang.Long f20492a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final java.lang.String f20493b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final java.lang.Double f20494c;

    @kotlin.Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001J\u0013\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lcom/kiptv/core/model/TraktScrobbleResponse$Companion;", "", "Lkotlinx/serialization/KSerializer;", "Lcom/kiptv/core/model/TraktScrobbleResponse;", "serializer", "()Lkotlinx/serialization/KSerializer;", "core_release"}, k = 1, mv = {2, 1, 0}, xi = androidx.media3.container.NalUnitUtil.H265_NAL_UNIT_TYPE_UNSPECIFIED)
    public static final class Companion {
        public final kotlinx.serialization.KSerializer serializer() {
            return com.kiptv.core.model.TraktScrobbleResponse$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ TraktScrobbleResponse(int i3, java.lang.Long l2, java.lang.String str, java.lang.Double d4) {
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

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof com.kiptv.core.model.TraktScrobbleResponse)) {
            return false;
        }
        com.kiptv.core.model.TraktScrobbleResponse traktScrobbleResponse = (com.kiptv.core.model.TraktScrobbleResponse) obj;
        return kotlin.jvm.internal.m.a(this.f20492a, traktScrobbleResponse.f20492a) && kotlin.jvm.internal.m.a(this.f20493b, traktScrobbleResponse.f20493b) && kotlin.jvm.internal.m.a(this.f20494c, traktScrobbleResponse.f20494c);
    }

    public final int hashCode() {
        java.lang.Long l2 = this.f20492a;
        int iHashCode = (l2 == null ? 0 : l2.hashCode()) * 31;
        java.lang.String str = this.f20493b;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        java.lang.Double d4 = this.f20494c;
        return iHashCode2 + (d4 != null ? d4.hashCode() : 0);
    }

    public final java.lang.String toString() {
        return "TraktScrobbleResponse(id=" + this.f20492a + ", action=" + this.f20493b + ", progress=" + this.f20494c + ")";
    }
}
