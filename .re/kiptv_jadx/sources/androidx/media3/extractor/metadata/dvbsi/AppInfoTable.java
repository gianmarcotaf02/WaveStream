package androidx.media3.extractor.metadata.dvbsi;

/* JADX INFO: loaded from: classes.dex */
public final class AppInfoTable implements androidx.media3.common.Metadata.Entry {
    public static final int CONTROL_CODE_AUTOSTART = 1;
    public static final int CONTROL_CODE_PRESENT = 2;
    public final int controlCode;
    public final java.lang.String url;

    public AppInfoTable(int i3, java.lang.String str) {
        this.controlCode = i3;
        this.url = str;
    }

    public java.lang.String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder("Ait(controlCode=");
        sb.append(this.controlCode);
        sb.append(",url=");
        return Y6.f.m(sb, this.url, ")");
    }
}
