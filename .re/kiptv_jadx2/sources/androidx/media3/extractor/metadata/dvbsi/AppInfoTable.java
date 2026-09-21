package androidx.media3.extractor.metadata.dvbsi;

import Y6.f;
import androidx.media3.common.Metadata;

public final class AppInfoTable implements Metadata.Entry {
    public static final int CONTROL_CODE_AUTOSTART = 1;
    public static final int CONTROL_CODE_PRESENT = 2;
    public final int controlCode;
    public final String url;

    public AppInfoTable(int i3, String str) {
        this.controlCode = i3;
        this.url = str;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("Ait(controlCode=");
        sb.append(this.controlCode);
        sb.append(",url=");
        return f.m(sb, this.url, ")");
    }
}
