package io.ktor.client.statement;

import androidx.media3.container.NalUnitUtil;
import io.ktor.util.pipeline.Pipeline;
import io.ktor.util.pipeline.PipelinePhase;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC2541f;
import p070h6.A;

@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\b\u0018\u0000 \u000b2\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0001\u000bB\u0011\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007R\u001a\u0010\u0005\u001a\u00020\u00048\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0005\u0010\b\u001a\u0004\b\t\u0010\n¨\u0006\f"}, d2 = {"Lio/ktor/client/statement/HttpReceivePipeline;", "Lio/ktor/util/pipeline/Pipeline;", "Lio/ktor/client/statement/HttpResponse;", "Lh6/A;", "", "developmentMode", "<init>", "(Z)V", "Z", "getDevelopmentMode", "()Z", "Phases", "ktor-client-core"}, k = 1, mv = {2, 1, 0}, xi = NalUnitUtil.H265_NAL_UNIT_TYPE_UNSPECIFIED)
public final class HttpReceivePipeline extends Pipeline<HttpResponse, A> {
    private final boolean developmentMode;

    public static final Companion INSTANCE = new Companion(null);
    private static final PipelinePhase Before = new PipelinePhase("Before");
    private static final PipelinePhase State = new PipelinePhase("State");
    private static final PipelinePhase After = new PipelinePhase("After");

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\t\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\bR\u0017\u0010\t\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\t\u0010\u0006\u001a\u0004\b\n\u0010\bR\u0017\u0010\u000b\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u000b\u0010\u0006\u001a\u0004\b\f\u0010\b¨\u0006\r"}, d2 = {"Lio/ktor/client/statement/HttpReceivePipeline$Phases;", "", "<init>", "()V", "Lio/ktor/util/pipeline/PipelinePhase;", "Before", "Lio/ktor/util/pipeline/PipelinePhase;", "getBefore", "()Lio/ktor/util/pipeline/PipelinePhase;", "State", "getState", "After", "getAfter", "ktor-client-core"}, k = 1, mv = {2, 1, 0}, xi = NalUnitUtil.H265_NAL_UNIT_TYPE_UNSPECIFIED)
    public static final class Companion {
        public Companion(AbstractC2541f abstractC2541f) {
            this();
        }

        public final PipelinePhase getAfter() {
            return HttpReceivePipeline.After;
        }

        public final PipelinePhase getBefore() {
            return HttpReceivePipeline.Before;
        }

        public final PipelinePhase getState() {
            return HttpReceivePipeline.State;
        }

        private Companion() {
        }
    }

    public HttpReceivePipeline() {
        this(false, 1, null);
    }

    @Override
    public boolean getDevelopmentMode() {
        return this.developmentMode;
    }

    public HttpReceivePipeline(boolean z6, int i3, AbstractC2541f abstractC2541f) {
        this((i3 & 1) != 0 ? true : z6);
    }

    public HttpReceivePipeline(boolean z6) {
        super(Before, State, After);
        this.developmentMode = z6;
    }
}
