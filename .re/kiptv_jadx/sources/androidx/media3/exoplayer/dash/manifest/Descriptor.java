package androidx.media3.exoplayer.dash.manifest;

/* JADX INFO: loaded from: classes.dex */
public final class Descriptor {
    public final java.lang.String id;
    public final java.lang.String schemeIdUri;
    public final java.lang.String value;

    public Descriptor(java.lang.String str, java.lang.String str2, java.lang.String str3) {
        this.schemeIdUri = str;
        this.value = str2;
        this.id = str3;
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && androidx.media3.exoplayer.dash.manifest.Descriptor.class == obj.getClass()) {
            androidx.media3.exoplayer.dash.manifest.Descriptor descriptor = (androidx.media3.exoplayer.dash.manifest.Descriptor) obj;
            if (java.util.Objects.equals(this.schemeIdUri, descriptor.schemeIdUri) && java.util.Objects.equals(this.value, descriptor.value) && java.util.Objects.equals(this.id, descriptor.id)) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        int iHashCode = this.schemeIdUri.hashCode() * 31;
        java.lang.String str = this.value;
        int iHashCode2 = (iHashCode + (str != null ? str.hashCode() : 0)) * 31;
        java.lang.String str2 = this.id;
        return iHashCode2 + (str2 != null ? str2.hashCode() : 0);
    }
}
