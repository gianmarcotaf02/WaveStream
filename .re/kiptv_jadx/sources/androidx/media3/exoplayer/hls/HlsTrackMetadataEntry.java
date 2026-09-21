package androidx.media3.exoplayer.hls;

/* JADX INFO: loaded from: classes.dex */
public final class HlsTrackMetadataEntry implements androidx.media3.common.Metadata.Entry {
    public final java.lang.String groupId;
    public final java.lang.String name;
    public final java.util.List<androidx.media3.exoplayer.hls.HlsTrackMetadataEntry.VariantInfo> variantInfos;

    public static final class VariantInfo {
        public final java.lang.String audioGroupId;
        public final int averageBitrate;
        public final java.lang.String captionGroupId;
        public final int peakBitrate;
        public final java.lang.String subtitleGroupId;
        public final java.lang.String videoGroupId;

        public VariantInfo(int i3, int i9, java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String str4) {
            this.averageBitrate = i3;
            this.peakBitrate = i9;
            this.videoGroupId = str;
            this.audioGroupId = str2;
            this.subtitleGroupId = str3;
            this.captionGroupId = str4;
        }

        public boolean equals(java.lang.Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj != null && androidx.media3.exoplayer.hls.HlsTrackMetadataEntry.VariantInfo.class == obj.getClass()) {
                androidx.media3.exoplayer.hls.HlsTrackMetadataEntry.VariantInfo variantInfo = (androidx.media3.exoplayer.hls.HlsTrackMetadataEntry.VariantInfo) obj;
                if (this.averageBitrate == variantInfo.averageBitrate && this.peakBitrate == variantInfo.peakBitrate && android.text.TextUtils.equals(this.videoGroupId, variantInfo.videoGroupId) && android.text.TextUtils.equals(this.audioGroupId, variantInfo.audioGroupId) && android.text.TextUtils.equals(this.subtitleGroupId, variantInfo.subtitleGroupId) && android.text.TextUtils.equals(this.captionGroupId, variantInfo.captionGroupId)) {
                    return true;
                }
            }
            return false;
        }

        public int hashCode() {
            int i3 = ((this.averageBitrate * 31) + this.peakBitrate) * 31;
            java.lang.String str = this.videoGroupId;
            int iHashCode = (i3 + (str != null ? str.hashCode() : 0)) * 31;
            java.lang.String str2 = this.audioGroupId;
            int iHashCode2 = (iHashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
            java.lang.String str3 = this.subtitleGroupId;
            int iHashCode3 = (iHashCode2 + (str3 != null ? str3.hashCode() : 0)) * 31;
            java.lang.String str4 = this.captionGroupId;
            return iHashCode3 + (str4 != null ? str4.hashCode() : 0);
        }
    }

    public HlsTrackMetadataEntry(java.lang.String str, java.lang.String str2, java.util.List<androidx.media3.exoplayer.hls.HlsTrackMetadataEntry.VariantInfo> list) {
        this.groupId = str;
        this.name = str2;
        this.variantInfos = java.util.Collections.unmodifiableList(new java.util.ArrayList(list));
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && androidx.media3.exoplayer.hls.HlsTrackMetadataEntry.class == obj.getClass()) {
            androidx.media3.exoplayer.hls.HlsTrackMetadataEntry hlsTrackMetadataEntry = (androidx.media3.exoplayer.hls.HlsTrackMetadataEntry) obj;
            if (android.text.TextUtils.equals(this.groupId, hlsTrackMetadataEntry.groupId) && android.text.TextUtils.equals(this.name, hlsTrackMetadataEntry.name) && this.variantInfos.equals(hlsTrackMetadataEntry.variantInfos)) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        java.lang.String str = this.groupId;
        int iHashCode = (str != null ? str.hashCode() : 0) * 31;
        java.lang.String str2 = this.name;
        return this.variantInfos.hashCode() + ((iHashCode + (str2 != null ? str2.hashCode() : 0)) * 31);
    }

    public java.lang.String toString() {
        java.lang.String strM;
        java.lang.StringBuilder sb = new java.lang.StringBuilder("HlsTrackMetadataEntry");
        if (this.groupId != null) {
            java.lang.StringBuilder sb2 = new java.lang.StringBuilder(" [");
            sb2.append(this.groupId);
            sb2.append(", ");
            strM = Y6.f.m(sb2, this.name, "]");
        } else {
            strM = "";
        }
        sb.append(strM);
        return sb.toString();
    }
}
