package androidx.media3.extractor.metadata.emsg;

/* JADX INFO: loaded from: classes.dex */
public final class EventMessage implements androidx.media3.common.Metadata.Entry {
    public static final java.lang.String ID3_SCHEME_ID_AOM = "https://aomedia.org/emsg/ID3";
    private static final java.lang.String ID3_SCHEME_ID_APPLE = "https://developer.apple.com/streaming/emsg-id3";
    public static final java.lang.String SCTE35_SCHEME_ID = "urn:scte:scte35:2014:bin";
    public final long durationMs;
    private int hashCode;
    public final long id;
    public final byte[] messageData;
    public final java.lang.String schemeIdUri;
    public final java.lang.String value;
    private static final androidx.media3.common.Format ID3_FORMAT = new androidx.media3.common.Format.Builder().setSampleMimeType(androidx.media3.common.MimeTypes.APPLICATION_ID3).build();
    private static final androidx.media3.common.Format SCTE35_FORMAT = new androidx.media3.common.Format.Builder().setSampleMimeType(androidx.media3.common.MimeTypes.APPLICATION_SCTE35).build();

    public EventMessage(java.lang.String str, java.lang.String str2, long j, long j9, byte[] bArr) {
        this.schemeIdUri = str;
        this.value = str2;
        this.durationMs = j;
        this.id = j9;
        this.messageData = bArr;
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && androidx.media3.extractor.metadata.emsg.EventMessage.class == obj.getClass()) {
            androidx.media3.extractor.metadata.emsg.EventMessage eventMessage = (androidx.media3.extractor.metadata.emsg.EventMessage) obj;
            if (this.durationMs == eventMessage.durationMs && this.id == eventMessage.id && java.util.Objects.equals(this.schemeIdUri, eventMessage.schemeIdUri) && java.util.Objects.equals(this.value, eventMessage.value) && java.util.Arrays.equals(this.messageData, eventMessage.messageData)) {
                return true;
            }
        }
        return false;
    }

    @Override // androidx.media3.common.Metadata.Entry
    public byte[] getWrappedMetadataBytes() {
        if (getWrappedMetadataFormat() != null) {
            return this.messageData;
        }
        return null;
    }

    @Override // androidx.media3.common.Metadata.Entry
    public androidx.media3.common.Format getWrappedMetadataFormat() {
        java.lang.String str = this.schemeIdUri;
        str.getClass();
        switch (str) {
            case "urn:scte:scte35:2014:bin":
                return SCTE35_FORMAT;
            case "https://aomedia.org/emsg/ID3":
            case "https://developer.apple.com/streaming/emsg-id3":
                return ID3_FORMAT;
            default:
                return null;
        }
    }

    public int hashCode() {
        if (this.hashCode == 0) {
            java.lang.String str = this.schemeIdUri;
            int iHashCode = (527 + (str != null ? str.hashCode() : 0)) * 31;
            java.lang.String str2 = this.value;
            int iHashCode2 = str2 != null ? str2.hashCode() : 0;
            long j = this.durationMs;
            int i3 = (((iHashCode + iHashCode2) * 31) + ((int) (j ^ (j >>> 32)))) * 31;
            long j9 = this.id;
            this.hashCode = java.util.Arrays.hashCode(this.messageData) + ((i3 + ((int) (j9 ^ (j9 >>> 32)))) * 31);
        }
        return this.hashCode;
    }

    public java.lang.String toString() {
        return "EMSG: scheme=" + this.schemeIdUri + ", id=" + this.id + ", durationMs=" + this.durationMs + ", value=" + this.value;
    }
}
