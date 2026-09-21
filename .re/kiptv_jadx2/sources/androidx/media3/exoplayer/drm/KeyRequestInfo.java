package androidx.media3.exoplayer.drm;

import androidx.media3.common.DrmInitData;
import androidx.media3.exoplayer.source.LoadEventInfo;
import java.util.List;
import org.checkerframework.dataflow.qual.SideEffectFree;
import p076i4.AbstractC2186b0;
import p076i4.Y;

public final class KeyRequestInfo {
    public final AbstractC2186b0 loadInfos;
    public final AbstractC2186b0 schemeDatas;

    public static final class Builder {
        private final Y loadEventInfos = AbstractC2186b0.s();
        private AbstractC2186b0 schemeDatas;

        public Builder addLoadInfo(LoadEventInfo loadEventInfo) {
            this.loadEventInfos.c(loadEventInfo);
            return this;
        }

        @SideEffectFree
        public KeyRequestInfo build() {
            return new KeyRequestInfo(this);
        }

        public Builder setSchemeDatas(List<DrmInitData.SchemeData> list) {
            this.schemeDatas = AbstractC2186b0.u(list);
            return this;
        }
    }

    private KeyRequestInfo(Builder builder) {
        this.loadInfos = builder.loadEventInfos.f();
        this.schemeDatas = builder.schemeDatas;
    }
}
