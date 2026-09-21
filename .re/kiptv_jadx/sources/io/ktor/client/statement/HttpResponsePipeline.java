package io.ktor.client.statement;

/* JADX INFO: loaded from: classes4.dex */
@kotlin.Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\b\u0018\u0000 \u000b2\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0001\u000bB\u0011\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007R\u001a\u0010\u0005\u001a\u00020\u00048\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0005\u0010\b\u001a\u0004\b\t\u0010\n¨\u0006\f"}, d2 = {"Lio/ktor/client/statement/HttpResponsePipeline;", "Lio/ktor/util/pipeline/Pipeline;", "Lio/ktor/client/statement/HttpResponseContainer;", "Lio/ktor/client/call/HttpClientCall;", "", "developmentMode", "<init>", "(Z)V", "Z", "getDevelopmentMode", "()Z", "Phases", "ktor-client-core"}, k = 1, mv = {2, 1, 0}, xi = androidx.media3.container.NalUnitUtil.H265_NAL_UNIT_TYPE_UNSPECIFIED)
public final class HttpResponsePipeline extends io.ktor.util.pipeline.Pipeline<io.ktor.client.statement.HttpResponseContainer, io.ktor.client.call.HttpClientCall> {
    private final boolean developmentMode;

    /* JADX INFO: renamed from: Phases, reason: from kotlin metadata */
    public static final io.ktor.client.statement.HttpResponsePipeline.Companion INSTANCE = new io.ktor.client.statement.HttpResponsePipeline.Companion(null);
    private static final io.ktor.util.pipeline.PipelinePhase Receive = new io.ktor.util.pipeline.PipelinePhase("Receive");
    private static final io.ktor.util.pipeline.PipelinePhase Parse = new io.ktor.util.pipeline.PipelinePhase("Parse");
    private static final io.ktor.util.pipeline.PipelinePhase Transform = new io.ktor.util.pipeline.PipelinePhase("Transform");
    private static final io.ktor.util.pipeline.PipelinePhase State = new io.ktor.util.pipeline.PipelinePhase("State");
    private static final io.ktor.util.pipeline.PipelinePhase After = new io.ktor.util.pipeline.PipelinePhase("After");

    /* JADX INFO: renamed from: io.ktor.client.statement.HttpResponsePipeline$Phases, reason: from kotlin metadata */
    @kotlin.Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\r\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\bR\u0017\u0010\t\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\t\u0010\u0006\u001a\u0004\b\n\u0010\bR\u0017\u0010\u000b\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u000b\u0010\u0006\u001a\u0004\b\f\u0010\bR\u0017\u0010\r\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\r\u0010\u0006\u001a\u0004\b\u000e\u0010\bR\u0017\u0010\u000f\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u000f\u0010\u0006\u001a\u0004\b\u0010\u0010\b¨\u0006\u0011"}, d2 = {"Lio/ktor/client/statement/HttpResponsePipeline$Phases;", "", "<init>", "()V", "Lio/ktor/util/pipeline/PipelinePhase;", "Receive", "Lio/ktor/util/pipeline/PipelinePhase;", "getReceive", "()Lio/ktor/util/pipeline/PipelinePhase;", "Parse", "getParse", "Transform", "getTransform", "State", "getState", "After", "getAfter", "ktor-client-core"}, k = 1, mv = {2, 1, 0}, xi = androidx.media3.container.NalUnitUtil.H265_NAL_UNIT_TYPE_UNSPECIFIED)
    public static final class Companion {
        public /* synthetic */ Companion(kotlin.jvm.internal.AbstractC2541f abstractC2541f) {
            this();
        }

        public final io.ktor.util.pipeline.PipelinePhase getAfter() {
            return io.ktor.client.statement.HttpResponsePipeline.After;
        }

        public final io.ktor.util.pipeline.PipelinePhase getParse() {
            return io.ktor.client.statement.HttpResponsePipeline.Parse;
        }

        public final io.ktor.util.pipeline.PipelinePhase getReceive() {
            return io.ktor.client.statement.HttpResponsePipeline.Receive;
        }

        public final io.ktor.util.pipeline.PipelinePhase getState() {
            return io.ktor.client.statement.HttpResponsePipeline.State;
        }

        public final io.ktor.util.pipeline.PipelinePhase getTransform() {
            return io.ktor.client.statement.HttpResponsePipeline.Transform;
        }

        private Companion() {
        }
    }

    public HttpResponsePipeline() {
        this(false, 1, null);
    }

    @Override // io.ktor.util.pipeline.Pipeline
    public boolean getDevelopmentMode() {
        return this.developmentMode;
    }

    public /* synthetic */ HttpResponsePipeline(boolean z6, int i3, kotlin.jvm.internal.AbstractC2541f abstractC2541f) {
        this((i3 & 1) != 0 ? true : z6);
    }

    public HttpResponsePipeline(boolean z6) {
        super(Receive, Parse, Transform, State, After);
        this.developmentMode = z6;
    }
}
