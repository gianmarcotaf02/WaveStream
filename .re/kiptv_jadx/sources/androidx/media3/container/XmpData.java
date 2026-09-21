package androidx.media3.container;

/* JADX INFO: loaded from: classes.dex */
public final class XmpData implements androidx.media3.common.Metadata.Entry {
    public final byte[] data;

    public XmpData(byte[] bArr) {
        this.data = bArr;
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || androidx.media3.container.XmpData.class != obj.getClass()) {
            return false;
        }
        return java.util.Arrays.equals(this.data, ((androidx.media3.container.XmpData) obj).data);
    }

    public int hashCode() {
        return java.util.Arrays.hashCode(this.data);
    }

    public java.lang.String toString() {
        return "XMP: " + androidx.media3.common.util.Util.toHexString(this.data);
    }
}
