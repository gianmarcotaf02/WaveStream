package io.github.jan.supabase.plugins;

/* JADX INFO: loaded from: classes4.dex */
@kotlin.Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\b\b\u0016\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003R\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\tR\u001c\u0010\n\u001a\u0004\u0018\u00010\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\u0007\"\u0004\b\f\u0010\t¨\u0006\r"}, d2 = {"Lio/github/jan/supabase/plugins/MainConfig;", "", "<init>", "()V", "customUrl", "", "getCustomUrl", "()Ljava/lang/String;", "setCustomUrl", "(Ljava/lang/String;)V", "jwtToken", "getJwtToken", "setJwtToken", "supabase-kt_release"}, k = 1, mv = {2, 1, 0}, xi = androidx.media3.container.NalUnitUtil.H265_NAL_UNIT_TYPE_UNSPECIFIED)
public class MainConfig {
    private java.lang.String customUrl;
    private java.lang.String jwtToken;

    public final java.lang.String getCustomUrl() {
        return this.customUrl;
    }

    public final java.lang.String getJwtToken() {
        return this.jwtToken;
    }

    public final void setCustomUrl(java.lang.String str) {
        this.customUrl = str;
    }

    public final void setJwtToken(java.lang.String str) {
        this.jwtToken = str;
    }
}
