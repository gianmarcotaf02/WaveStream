package androidx.media3.exoplayer.upstream.contentsteering;

/* JADX INFO: loaded from: classes.dex */
public final class SteeringManifest {
    public final p076i4.AbstractC2186b0 pathwayClones;
    public final p076i4.AbstractC2186b0 pathwayPriority;
    public final android.net.Uri reloadUri;
    public final long timeToLiveMs;
    public final int version;

    public static final class PathwayClone {
        public final java.lang.String baseId;
        public final java.lang.String id;
        public final androidx.media3.exoplayer.upstream.contentsteering.SteeringManifest.UriReplacement uriReplacement;

        public PathwayClone(java.lang.String str, java.lang.String str2, androidx.media3.exoplayer.upstream.contentsteering.SteeringManifest.UriReplacement uriReplacement) {
            this.baseId = str;
            this.id = str2;
            this.uriReplacement = uriReplacement;
        }

        public boolean equals(java.lang.Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof androidx.media3.exoplayer.upstream.contentsteering.SteeringManifest.PathwayClone)) {
                return false;
            }
            androidx.media3.exoplayer.upstream.contentsteering.SteeringManifest.PathwayClone pathwayClone = (androidx.media3.exoplayer.upstream.contentsteering.SteeringManifest.PathwayClone) obj;
            return java.util.Objects.equals(this.baseId, pathwayClone.baseId) && java.util.Objects.equals(this.id, pathwayClone.id) && java.util.Objects.equals(this.uriReplacement, pathwayClone.uriReplacement);
        }

        public int hashCode() {
            return java.util.Objects.hash(this.baseId, this.id, this.uriReplacement);
        }
    }

    public static final class UriReplacement {
        public final java.lang.String host;
        public final p076i4.AbstractC2194f0 params;
        public final p076i4.AbstractC2194f0 perRenditionUris;
        public final p076i4.AbstractC2194f0 perVariantUris;

        public UriReplacement(java.lang.String str, java.util.Map<java.lang.String, java.lang.String> map, java.util.Map<java.lang.String, android.net.Uri> map2, java.util.Map<java.lang.String, android.net.Uri> map3) {
            this.host = str;
            this.params = p076i4.AbstractC2194f0.a(map);
            this.perVariantUris = p076i4.AbstractC2194f0.a(map2);
            this.perRenditionUris = p076i4.AbstractC2194f0.a(map3);
        }

        public boolean equals(java.lang.Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof androidx.media3.exoplayer.upstream.contentsteering.SteeringManifest.UriReplacement)) {
                return false;
            }
            androidx.media3.exoplayer.upstream.contentsteering.SteeringManifest.UriReplacement uriReplacement = (androidx.media3.exoplayer.upstream.contentsteering.SteeringManifest.UriReplacement) obj;
            return java.util.Objects.equals(this.host, uriReplacement.host) && java.util.Objects.equals(this.params, uriReplacement.params) && java.util.Objects.equals(this.perVariantUris, uriReplacement.perVariantUris) && java.util.Objects.equals(this.perRenditionUris, uriReplacement.perRenditionUris);
        }

        public int hashCode() {
            return java.util.Objects.hash(this.host, this.params, this.perVariantUris, this.perRenditionUris);
        }
    }

    public SteeringManifest(int i3, long j, android.net.Uri uri, java.util.List<java.lang.String> list, java.util.List<androidx.media3.exoplayer.upstream.contentsteering.SteeringManifest.PathwayClone> list2) {
        this.version = i3;
        this.timeToLiveMs = j;
        this.reloadUri = uri;
        this.pathwayPriority = p076i4.AbstractC2186b0.u(list);
        this.pathwayClones = p076i4.AbstractC2186b0.u(list2);
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof androidx.media3.exoplayer.upstream.contentsteering.SteeringManifest)) {
            return false;
        }
        androidx.media3.exoplayer.upstream.contentsteering.SteeringManifest steeringManifest = (androidx.media3.exoplayer.upstream.contentsteering.SteeringManifest) obj;
        return this.version == steeringManifest.version && this.timeToLiveMs == steeringManifest.timeToLiveMs && java.util.Objects.equals(this.reloadUri, steeringManifest.reloadUri) && java.util.Objects.equals(this.pathwayPriority, steeringManifest.pathwayPriority) && java.util.Objects.equals(this.pathwayClones, steeringManifest.pathwayClones);
    }

    public int hashCode() {
        return java.util.Objects.hash(java.lang.Integer.valueOf(this.version), java.lang.Long.valueOf(this.timeToLiveMs), this.reloadUri, this.pathwayPriority, this.pathwayClones);
    }
}
