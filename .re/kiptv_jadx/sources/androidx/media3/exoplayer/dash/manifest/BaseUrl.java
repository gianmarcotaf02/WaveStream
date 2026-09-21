package androidx.media3.exoplayer.dash.manifest;

/* JADX INFO: loaded from: classes.dex */
public final class BaseUrl {
    public static final int DEFAULT_DVB_PRIORITY = 1;
    public static final int DEFAULT_WEIGHT = 1;
    public static final int PRIORITY_UNSET = Integer.MIN_VALUE;
    public final int priority;
    public final java.lang.String serviceLocation;
    public final java.lang.String url;
    public final int weight;

    public BaseUrl(java.lang.String str) {
        this(str, str, Integer.MIN_VALUE, 1);
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof androidx.media3.exoplayer.dash.manifest.BaseUrl)) {
            return false;
        }
        androidx.media3.exoplayer.dash.manifest.BaseUrl baseUrl = (androidx.media3.exoplayer.dash.manifest.BaseUrl) obj;
        return this.priority == baseUrl.priority && this.weight == baseUrl.weight && java.util.Objects.equals(this.url, baseUrl.url) && java.util.Objects.equals(this.serviceLocation, baseUrl.serviceLocation);
    }

    public int hashCode() {
        return java.util.Objects.hash(this.url, this.serviceLocation, java.lang.Integer.valueOf(this.priority), java.lang.Integer.valueOf(this.weight));
    }

    public BaseUrl(java.lang.String str, java.lang.String str2, int i3, int i9) {
        this.url = str;
        this.serviceLocation = str2;
        this.priority = i3;
        this.weight = i9;
    }
}
