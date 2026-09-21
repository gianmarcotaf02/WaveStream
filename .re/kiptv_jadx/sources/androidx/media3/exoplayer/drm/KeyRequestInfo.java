package androidx.media3.exoplayer.drm;

/* JADX INFO: loaded from: classes.dex */
public final class KeyRequestInfo {
    public final p076i4.AbstractC2186b0 loadInfos;
    public final p076i4.AbstractC2186b0 schemeDatas;

    public static final class Builder {
        private final p076i4.Y loadEventInfos = p076i4.AbstractC2186b0.s();
        private p076i4.AbstractC2186b0 schemeDatas;

        public androidx.media3.exoplayer.drm.KeyRequestInfo.Builder addLoadInfo(androidx.media3.exoplayer.source.LoadEventInfo loadEventInfo) {
            this.loadEventInfos.c(loadEventInfo);
            return this;
        }

        @org.checkerframework.dataflow.qual.SideEffectFree
        public androidx.media3.exoplayer.drm.KeyRequestInfo build() {
            return new androidx.media3.exoplayer.drm.KeyRequestInfo(this);
        }

        public androidx.media3.exoplayer.drm.KeyRequestInfo.Builder setSchemeDatas(java.util.List<androidx.media3.common.DrmInitData.SchemeData> list) {
            this.schemeDatas = p076i4.AbstractC2186b0.u(list);
            return this;
        }
    }

    private KeyRequestInfo(androidx.media3.exoplayer.drm.KeyRequestInfo.Builder builder) {
        this.loadInfos = builder.loadEventInfos.f();
        this.schemeDatas = builder.schemeDatas;
    }
}
