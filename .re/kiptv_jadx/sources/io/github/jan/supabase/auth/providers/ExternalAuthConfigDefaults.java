package io.github.jan.supabase.auth.providers;

/* JADX INFO: loaded from: classes4.dex */
@kotlin.Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010!\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010%\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0005\b\u0016\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003R\u0017\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u001d\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00060\n¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u001a\u0010\r\u001a\u00020\u000eX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000f\u0010\u0010\"\u0004\b\u0011\u0010\u0012¨\u0006\u0013"}, d2 = {"Lio/github/jan/supabase/auth/providers/ExternalAuthConfigDefaults;", "", "<init>", "()V", "scopes", "", "", "getScopes", "()Ljava/util/List;", "queryParams", "", "getQueryParams", "()Ljava/util/Map;", "automaticallyOpenUrl", "", "getAutomaticallyOpenUrl", "()Z", "setAutomaticallyOpenUrl", "(Z)V", "auth-kt_release"}, k = 1, mv = {2, 1, 0}, xi = androidx.media3.container.NalUnitUtil.H265_NAL_UNIT_TYPE_UNSPECIFIED)
public class ExternalAuthConfigDefaults {
    private final java.util.List<java.lang.String> scopes = new java.util.ArrayList();
    private final java.util.Map<java.lang.String, java.lang.String> queryParams = new java.util.LinkedHashMap();
    private boolean automaticallyOpenUrl = true;

    public final boolean getAutomaticallyOpenUrl() {
        return this.automaticallyOpenUrl;
    }

    public final java.util.Map<java.lang.String, java.lang.String> getQueryParams() {
        return this.queryParams;
    }

    public final java.util.List<java.lang.String> getScopes() {
        return this.scopes;
    }

    public final void setAutomaticallyOpenUrl(boolean z6) {
        this.automaticallyOpenUrl = z6;
    }
}
