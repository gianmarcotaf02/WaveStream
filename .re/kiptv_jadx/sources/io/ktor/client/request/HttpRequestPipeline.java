package io.ktor.client.request;

/* JADX INFO: loaded from: classes4.dex */
@kotlin.Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\b\u0018\u0000 \u000b2\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0001\u000bB\u0011\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007R\u001a\u0010\u0005\u001a\u00020\u00048\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0005\u0010\b\u001a\u0004\b\t\u0010\n¨\u0006\f"}, d2 = {"Lio/ktor/client/request/HttpRequestPipeline;", "Lio/ktor/util/pipeline/Pipeline;", "", "Lio/ktor/client/request/HttpRequestBuilder;", "", "developmentMode", "<init>", "(Z)V", "Z", "getDevelopmentMode", "()Z", "Phases", "ktor-client-core"}, k = 1, mv = {2, 1, 0}, xi = androidx.media3.container.NalUnitUtil.H265_NAL_UNIT_TYPE_UNSPECIFIED)
public final class HttpRequestPipeline extends io.ktor.util.pipeline.Pipeline<java.lang.Object, io.ktor.client.request.HttpRequestBuilder> {
    private final boolean developmentMode;

    /* JADX INFO: renamed from: Phases, reason: from kotlin metadata */
    public static final io.ktor.client.request.HttpRequestPipeline.Companion INSTANCE = new io.ktor.client.request.HttpRequestPipeline.Companion(null);
    private static final io.ktor.util.pipeline.PipelinePhase Before = new io.ktor.util.pipeline.PipelinePhase("Before");
    private static final io.ktor.util.pipeline.PipelinePhase State = new io.ktor.util.pipeline.PipelinePhase("State");
    private static final io.ktor.util.pipeline.PipelinePhase Transform = new io.ktor.util.pipeline.PipelinePhase("Transform");
    private static final io.ktor.util.pipeline.PipelinePhase Render = new io.ktor.util.pipeline.PipelinePhase("Render");
    private static final io.ktor.util.pipeline.PipelinePhase Send = new io.ktor.util.pipeline.PipelinePhase("Send");

    /* JADX INFO: renamed from: io.ktor.client.request.HttpRequestPipeline$Phases, reason: from kotlin metadata */
    @kotlin.Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\r\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\bR\u0017\u0010\t\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\t\u0010\u0006\u001a\u0004\b\n\u0010\bR\u0017\u0010\u000b\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u000b\u0010\u0006\u001a\u0004\b\f\u0010\bR\u0017\u0010\r\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\r\u0010\u0006\u001a\u0004\b\u000e\u0010\bR\u0017\u0010\u000f\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u000f\u0010\u0006\u001a\u0004\b\u0010\u0010\b¨\u0006\u0011"}, d2 = {"Lio/ktor/client/request/HttpRequestPipeline$Phases;", "", "<init>", "()V", "Lio/ktor/util/pipeline/PipelinePhase;", "Before", "Lio/ktor/util/pipeline/PipelinePhase;", "getBefore", "()Lio/ktor/util/pipeline/PipelinePhase;", "State", "getState", "Transform", "getTransform", "Render", "getRender", "Send", "getSend", "ktor-client-core"}, k = 1, mv = {2, 1, 0}, xi = androidx.media3.container.NalUnitUtil.H265_NAL_UNIT_TYPE_UNSPECIFIED)
    public static final class Companion {
        public /* synthetic */ Companion(kotlin.jvm.internal.AbstractC2541f abstractC2541f) {
            this();
        }

        public final io.ktor.util.pipeline.PipelinePhase getBefore() {
            return io.ktor.client.request.HttpRequestPipeline.Before;
        }

        public final io.ktor.util.pipeline.PipelinePhase getRender() {
            return io.ktor.client.request.HttpRequestPipeline.Render;
        }

        public final io.ktor.util.pipeline.PipelinePhase getSend() {
            return io.ktor.client.request.HttpRequestPipeline.Send;
        }

        public final io.ktor.util.pipeline.PipelinePhase getState() {
            return io.ktor.client.request.HttpRequestPipeline.State;
        }

        public final io.ktor.util.pipeline.PipelinePhase getTransform() {
            return io.ktor.client.request.HttpRequestPipeline.Transform;
        }

        private Companion() {
        }
    }

    public HttpRequestPipeline() {
        this(false, 1, null);
    }

    @Override // io.ktor.util.pipeline.Pipeline
    public boolean getDevelopmentMode() {
        return this.developmentMode;
    }

    public /* synthetic */ HttpRequestPipeline(boolean z6, int i3, kotlin.jvm.internal.AbstractC2541f abstractC2541f) {
        this((i3 & 1) != 0 ? true : z6);
    }

    public HttpRequestPipeline(boolean z6) {
        super(Before, State, Transform, Render, Send);
        this.developmentMode = z6;
    }
}
