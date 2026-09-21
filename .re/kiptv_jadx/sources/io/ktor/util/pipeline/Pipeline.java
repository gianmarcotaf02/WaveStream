package io.ktor.util.pipeline;

/* JADX INFO: loaded from: classes4.dex */
@kotlin.Metadata(d1 = {"\u0000l\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0018\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0015\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010!\n\u0002\b\u000b\b\u0016\u0018\u0000*\b\b\u0000\u0010\u0002*\u00020\u0001*\b\b\u0001\u0010\u0003*\u00020\u00012\u00020\u0001B\u001b\u0012\u0012\u0010\u0006\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00050\u0004\"\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bB]\b\u0016\u0012\u0006\u0010\t\u001a\u00020\u0005\u0012J\u0010\u0010\u001aF\u0012B\u0012@\b\u0001\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\f\u0012\u0004\u0012\u00028\u0000\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000e0\r\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u000bj\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0001`\u000f0\n¢\u0006\u0004\b\u0007\u0010\u0011J \u0010\u0014\u001a\u00028\u00002\u0006\u0010\u0012\u001a\u00028\u00012\u0006\u0010\u0013\u001a\u00028\u0000H\u0086@¢\u0006\u0004\b\u0014\u0010\u0015J\u0015\u0010\u0016\u001a\u00020\u000e2\u0006\u0010\t\u001a\u00020\u0005¢\u0006\u0004\b\u0016\u0010\u0017J\u001d\u0010\u0019\u001a\u00020\u000e2\u0006\u0010\u0018\u001a\u00020\u00052\u0006\u0010\t\u001a\u00020\u0005¢\u0006\u0004\b\u0019\u0010\u001aJ\u001d\u0010\u001b\u001a\u00020\u000e2\u0006\u0010\u0018\u001a\u00020\u00052\u0006\u0010\t\u001a\u00020\u0005¢\u0006\u0004\b\u001b\u0010\u001aJ[\u0010\u001d\u001a\u00020\u000e2\u0006\u0010\t\u001a\u00020\u00052D\u0010\u001c\u001a@\b\u0001\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\f\u0012\u0004\u0012\u00028\u0000\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000e0\r\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u000bj\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0001`\u000f¢\u0006\u0004\b\u001d\u0010\u001eJ\u000f\u0010\u001f\u001a\u00020\u000eH\u0016¢\u0006\u0004\b\u001f\u0010 JY\u0010!\u001aF\u0012B\u0012@\b\u0001\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\f\u0012\u0004\u0012\u00028\u0000\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000e0\r\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u000bj\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0001`\u000f0\n2\u0006\u0010\t\u001a\u00020\u0005¢\u0006\u0004\b!\u0010\"J!\u0010$\u001a\u00020\u000e2\u0012\u0010#\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0000¢\u0006\u0004\b$\u0010%J!\u0010&\u001a\u00020\u000e2\u0012\u0010#\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0000¢\u0006\u0004\b&\u0010%J!\u0010'\u001a\u00020\u000e2\u0012\u0010#\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0000¢\u0006\u0004\b'\u0010%J\u000f\u0010)\u001a\u00020(H\u0016¢\u0006\u0004\b)\u0010*J[\u0010,\u001aF\u0012B\u0012@\b\u0001\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\f\u0012\u0004\u0012\u00028\u0000\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000e0\r\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u000bj\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0001`\u000f0\n2\u0006\u0010\t\u001a\u00020\u0005H\u0000¢\u0006\u0004\b+\u0010\"JS\u0010/\u001aF\u0012B\u0012@\b\u0001\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\f\u0012\u0004\u0012\u00028\u0000\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000e0\r\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u000bj\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0001`\u000f0\nH\u0000¢\u0006\u0004\b-\u0010.J#\u00100\u001a\u00020\u000e2\u0012\u0010#\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0000H\u0002¢\u0006\u0004\b0\u0010%J3\u00103\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\f2\u0006\u0010\u0012\u001a\u00028\u00012\u0006\u0010\u0013\u001a\u00028\u00002\u0006\u00102\u001a\u000201H\u0002¢\u0006\u0004\b3\u00104J%\u00106\u001a\u0010\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0001\u0018\u0001052\u0006\u0010\t\u001a\u00020\u0005H\u0002¢\u0006\u0004\b6\u00107J\u0017\u00109\u001a\u0002082\u0006\u0010\t\u001a\u00020\u0005H\u0002¢\u0006\u0004\b9\u0010:J\u0017\u0010<\u001a\u00020;2\u0006\u0010\t\u001a\u00020\u0005H\u0002¢\u0006\u0004\b<\u0010=JS\u0010>\u001aF\u0012B\u0012@\b\u0001\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\f\u0012\u0004\u0012\u00028\u0000\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000e0\r\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u000bj\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0001`\u000f0\nH\u0002¢\u0006\u0004\b>\u0010.J#\u0010?\u001a\u00020;2\u0012\u0010#\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0000H\u0002¢\u0006\u0004\b?\u0010@JS\u0010A\u001aF\u0012B\u0012@\b\u0001\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\f\u0012\u0004\u0012\u00028\u0000\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000e0\r\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u000bj\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0001`\u000f0\nH\u0002¢\u0006\u0004\bA\u0010.J\u000f\u0010B\u001a\u00020\u000eH\u0002¢\u0006\u0004\bB\u0010 J[\u0010D\u001a\u00020\u000e2J\u0010C\u001aF\u0012B\u0012@\b\u0001\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\f\u0012\u0004\u0012\u00028\u0000\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000e0\r\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u000bj\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0001`\u000f0\nH\u0002¢\u0006\u0004\bD\u0010EJ#\u0010G\u001a\u00020\u000e2\u0012\u0010F\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u000105H\u0002¢\u0006\u0004\bG\u0010HJ#\u0010J\u001a\u00020\u000e2\u0012\u0010I\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0000H\u0002¢\u0006\u0004\bJ\u0010%J]\u0010K\u001a\u00020;2\u0006\u0010\t\u001a\u00020\u00052D\u0010\u001c\u001a@\b\u0001\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\f\u0012\u0004\u0012\u00028\u0000\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000e0\r\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u000bj\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0001`\u000fH\u0002¢\u0006\u0004\bK\u0010LJ\u001f\u0010O\u001a\u00020;2\u0006\u0010M\u001a\u00020\u00012\u0006\u0010N\u001a\u00020\u0005H\u0002¢\u0006\u0004\bO\u0010PR\u0017\u0010R\u001a\u00020Q8\u0006¢\u0006\f\n\u0004\bR\u0010S\u001a\u0004\bT\u0010UR\u001a\u0010V\u001a\u00020;8\u0016X\u0096D¢\u0006\f\n\u0004\bV\u0010W\u001a\u0004\bX\u0010YR\u001a\u0010[\u001a\b\u0012\u0004\u0012\u00020\u00010Z8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b[\u0010\\R\u0016\u0010]\u001a\u0002088\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b]\u0010^R\u0016\u0010_\u001a\u00020;8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b_\u0010WR\u0018\u0010`\u001a\u0004\u0018\u00010\u00058\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b`\u0010aR\u0017\u0010c\u001a\b\u0012\u0004\u0012\u00020\u00050\n8F¢\u0006\u0006\u001a\u0004\bb\u0010.R\u0011\u0010d\u001a\u00020;8F¢\u0006\u0006\u001a\u0004\bd\u0010Y¨\u0006e"}, d2 = {"Lio/ktor/util/pipeline/Pipeline;", "", "TSubject", "TContext", "", "Lio/ktor/util/pipeline/PipelinePhase;", "phases", "<init>", "([Lio/ktor/util/pipeline/PipelinePhase;)V", "phase", "", "Lkotlin/Function3;", "Lio/ktor/util/pipeline/PipelineContext;", "Ll6/c;", "Lh6/A;", "Lio/ktor/util/pipeline/PipelineInterceptor;", "interceptors", "(Lio/ktor/util/pipeline/PipelinePhase;Ljava/util/List;)V", "context", "subject", "execute", "(Ljava/lang/Object;Ljava/lang/Object;Ll6/c;)Ljava/lang/Object;", "addPhase", "(Lio/ktor/util/pipeline/PipelinePhase;)V", "reference", "insertPhaseAfter", "(Lio/ktor/util/pipeline/PipelinePhase;Lio/ktor/util/pipeline/PipelinePhase;)V", "insertPhaseBefore", "block", "intercept", "(Lio/ktor/util/pipeline/PipelinePhase;Lx6/n;)V", "afterIntercepted", "()V", "interceptorsForPhase", "(Lio/ktor/util/pipeline/PipelinePhase;)Ljava/util/List;", "from", "mergePhases", "(Lio/ktor/util/pipeline/Pipeline;)V", "merge", "resetFrom", "", "toString", "()Ljava/lang/String;", "phaseInterceptors$ktor_utils", "phaseInterceptors", "interceptorsForTests$ktor_utils", "()Ljava/util/List;", "interceptorsForTests", "mergeInterceptors", "Ll6/h;", "coroutineContext", "createContext", "(Ljava/lang/Object;Ljava/lang/Object;Ll6/h;)Lio/ktor/util/pipeline/PipelineContext;", "Lio/ktor/util/pipeline/PhaseContent;", "findPhase", "(Lio/ktor/util/pipeline/PipelinePhase;)Lio/ktor/util/pipeline/PhaseContent;", "", "findPhaseIndex", "(Lio/ktor/util/pipeline/PipelinePhase;)I", "", "hasPhase", "(Lio/ktor/util/pipeline/PipelinePhase;)Z", "cacheInterceptors", "fastPathMerge", "(Lio/ktor/util/pipeline/Pipeline;)Z", "sharedInterceptorsList", "resetInterceptorsList", "list", "notSharedInterceptorsList", "(Ljava/util/List;)V", "phaseContent", "setInterceptorsListFromPhase", "(Lio/ktor/util/pipeline/PhaseContent;)V", "pipeline", "setInterceptorsListFromAnotherPipeline", "tryAddToPhaseFastPath", "(Lio/ktor/util/pipeline/PipelinePhase;Lx6/n;)Z", "fromPhaseOrContent", "fromPhase", "insertRelativePhase", "(Ljava/lang/Object;Lio/ktor/util/pipeline/PipelinePhase;)Z", "Lio/ktor/util/Attributes;", "attributes", "Lio/ktor/util/Attributes;", "getAttributes", "()Lio/ktor/util/Attributes;", "developmentMode", "Z", "getDevelopmentMode", "()Z", "", "phasesRaw", "Ljava/util/List;", "interceptorsQuantity", "I", "interceptorsListShared", "interceptorsListSharedPhase", "Lio/ktor/util/pipeline/PipelinePhase;", "getItems", "items", "isEmpty", "ktor-utils"}, k = 1, mv = {2, 1, 0}, xi = androidx.media3.container.NalUnitUtil.H265_NAL_UNIT_TYPE_UNSPECIFIED)
public class Pipeline<TSubject, TContext> {
    private final io.ktor.util.Attributes attributes;
    private final boolean developmentMode;
    private volatile /* synthetic */ java.lang.Object interceptors$delegate;
    private boolean interceptorsListShared;
    private io.ktor.util.pipeline.PipelinePhase interceptorsListSharedPhase;
    private int interceptorsQuantity;
    private final java.util.List<java.lang.Object> phasesRaw;

    public Pipeline(io.ktor.util.pipeline.PipelinePhase... phases) {
        kotlin.jvm.internal.m.e(phases, "phases");
        this.attributes = io.ktor.util.AttributesJvmKt.Attributes(true);
        this.phasesRaw = p078i6.p.D0(java.util.Arrays.copyOf(phases, phases.length));
        this.interceptors$delegate = null;
    }

    private final java.util.List<p194x6.n> cacheInterceptors() {
        int iA0;
        int i3 = this.interceptorsQuantity;
        if (i3 == 0) {
            p078i6.w wVar = p078i6.w.f23205h;
            notSharedInterceptorsList(wVar);
            return wVar;
        }
        java.util.List<java.lang.Object> list = this.phasesRaw;
        int i9 = 0;
        if (i3 == 1 && (iA0 = p078i6.p.A0(list)) >= 0) {
            int i10 = 0;
            while (true) {
                java.lang.Object obj = list.get(i10);
                io.ktor.util.pipeline.PhaseContent<TSubject, TContext> phaseContent = obj instanceof io.ktor.util.pipeline.PhaseContent ? (io.ktor.util.pipeline.PhaseContent) obj : null;
                if (phaseContent != null && !phaseContent.isEmpty()) {
                    java.util.List<p194x6.n> listSharedInterceptors = phaseContent.sharedInterceptors();
                    setInterceptorsListFromPhase(phaseContent);
                    return listSharedInterceptors;
                }
                if (i10 == iA0) {
                    break;
                }
                i10++;
            }
        }
        java.util.ArrayList arrayList = new java.util.ArrayList();
        int iA1 = p078i6.p.A0(list);
        if (iA1 >= 0) {
            while (true) {
                java.lang.Object obj2 = list.get(i9);
                io.ktor.util.pipeline.PhaseContent phaseContent2 = obj2 instanceof io.ktor.util.pipeline.PhaseContent ? (io.ktor.util.pipeline.PhaseContent) obj2 : null;
                if (phaseContent2 != null) {
                    phaseContent2.addTo(arrayList);
                }
                if (i9 == iA1) {
                    break;
                }
                i9++;
            }
        }
        notSharedInterceptorsList(arrayList);
        return arrayList;
    }

    private final io.ktor.util.pipeline.PipelineContext<TSubject, TContext> createContext(TContext context, TSubject subject, p100l6.h coroutineContext) {
        return io.ktor.util.pipeline.PipelineContextKt.pipelineContextFor(context, sharedInterceptorsList(), subject, coroutineContext, getDevelopmentMode());
    }

    private final boolean fastPathMerge(io.ktor.util.pipeline.Pipeline<TSubject, TContext> from) {
        if (from.phasesRaw.isEmpty()) {
            return true;
        }
        int i3 = 0;
        if (!this.phasesRaw.isEmpty()) {
            return false;
        }
        java.util.List<java.lang.Object> list = from.phasesRaw;
        int iA0 = p078i6.p.A0(list);
        if (iA0 >= 0) {
            while (true) {
                java.lang.Object obj = list.get(i3);
                if (obj instanceof io.ktor.util.pipeline.PipelinePhase) {
                    this.phasesRaw.add(obj);
                } else if (obj instanceof io.ktor.util.pipeline.PhaseContent) {
                    io.ktor.util.pipeline.PhaseContent phaseContent = (io.ktor.util.pipeline.PhaseContent) obj;
                    this.phasesRaw.add(new io.ktor.util.pipeline.PhaseContent(phaseContent.getPhase(), phaseContent.getRelation(), phaseContent.sharedInterceptors()));
                }
                if (i3 == iA0) {
                    break;
                }
                i3++;
            }
        }
        this.interceptorsQuantity += from.interceptorsQuantity;
        setInterceptorsListFromAnotherPipeline(from);
        return true;
    }

    private final io.ktor.util.pipeline.PhaseContent<TSubject, TContext> findPhase(io.ktor.util.pipeline.PipelinePhase phase) {
        java.util.List<java.lang.Object> list = this.phasesRaw;
        int size = list.size();
        for (int i3 = 0; i3 < size; i3++) {
            java.lang.Object obj = list.get(i3);
            if (obj == phase) {
                io.ktor.util.pipeline.PhaseContent<TSubject, TContext> phaseContent = new io.ktor.util.pipeline.PhaseContent<>(phase, io.ktor.util.pipeline.PipelinePhaseRelation.Last.INSTANCE);
                list.set(i3, phaseContent);
                return phaseContent;
            }
            if (obj instanceof io.ktor.util.pipeline.PhaseContent) {
                io.ktor.util.pipeline.PhaseContent<TSubject, TContext> phaseContent2 = (io.ktor.util.pipeline.PhaseContent) obj;
                if (phaseContent2.getPhase() == phase) {
                    return phaseContent2;
                }
            }
        }
        return null;
    }

    private final int findPhaseIndex(io.ktor.util.pipeline.PipelinePhase phase) {
        java.util.List<java.lang.Object> list = this.phasesRaw;
        int size = list.size();
        for (int i3 = 0; i3 < size; i3++) {
            java.lang.Object obj = list.get(i3);
            if (obj == phase || ((obj instanceof io.ktor.util.pipeline.PhaseContent) && ((io.ktor.util.pipeline.PhaseContent) obj).getPhase() == phase)) {
                return i3;
            }
        }
        return -1;
    }

    private final java.util.List<p194x6.n> getInterceptors() {
        return (java.util.List) this.interceptors$delegate;
    }

    private final boolean hasPhase(io.ktor.util.pipeline.PipelinePhase phase) {
        java.util.List<java.lang.Object> list = this.phasesRaw;
        int size = list.size();
        for (int i3 = 0; i3 < size; i3++) {
            java.lang.Object obj = list.get(i3);
            if (obj == phase) {
                return true;
            }
            if ((obj instanceof io.ktor.util.pipeline.PhaseContent) && ((io.ktor.util.pipeline.PhaseContent) obj).getPhase() == phase) {
                return true;
            }
        }
        return false;
    }

    private final boolean insertRelativePhase(java.lang.Object fromPhaseOrContent, io.ktor.util.pipeline.PipelinePhase fromPhase) throws io.ktor.util.pipeline.InvalidPhaseException {
        io.ktor.util.pipeline.PipelinePhaseRelation relation;
        if (fromPhaseOrContent == fromPhase) {
            relation = io.ktor.util.pipeline.PipelinePhaseRelation.Last.INSTANCE;
        } else {
            kotlin.jvm.internal.m.c(fromPhaseOrContent, "null cannot be cast to non-null type io.ktor.util.pipeline.PhaseContent<*, *>");
            relation = ((io.ktor.util.pipeline.PhaseContent) fromPhaseOrContent).getRelation();
        }
        if (relation instanceof io.ktor.util.pipeline.PipelinePhaseRelation.Last) {
            addPhase(fromPhase);
            return true;
        }
        if (relation instanceof io.ktor.util.pipeline.PipelinePhaseRelation.Before) {
            io.ktor.util.pipeline.PipelinePhaseRelation.Before before = (io.ktor.util.pipeline.PipelinePhaseRelation.Before) relation;
            if (hasPhase(before.getRelativeTo())) {
                insertPhaseBefore(before.getRelativeTo(), fromPhase);
                return true;
            }
        }
        if (!(relation instanceof io.ktor.util.pipeline.PipelinePhaseRelation.After)) {
            return false;
        }
        insertPhaseAfter(((io.ktor.util.pipeline.PipelinePhaseRelation.After) relation).getRelativeTo(), fromPhase);
        return true;
    }

    private final void mergeInterceptors(io.ktor.util.pipeline.Pipeline<TSubject, TContext> from) {
        if (this.interceptorsQuantity == 0) {
            setInterceptorsListFromAnotherPipeline(from);
        } else {
            resetInterceptorsList();
        }
        for (java.lang.Object obj : from.phasesRaw) {
            io.ktor.util.pipeline.PipelinePhase phase = obj instanceof io.ktor.util.pipeline.PipelinePhase ? (io.ktor.util.pipeline.PipelinePhase) obj : null;
            if (phase == null) {
                kotlin.jvm.internal.m.c(obj, "null cannot be cast to non-null type io.ktor.util.pipeline.PhaseContent<*, *>");
                phase = ((io.ktor.util.pipeline.PhaseContent) obj).getPhase();
            }
            if (obj instanceof io.ktor.util.pipeline.PhaseContent) {
                io.ktor.util.pipeline.PhaseContent phaseContent = (io.ktor.util.pipeline.PhaseContent) obj;
                if (!phaseContent.isEmpty()) {
                    io.ktor.util.pipeline.PhaseContent<TSubject, TContext> phaseContentFindPhase = findPhase(phase);
                    kotlin.jvm.internal.m.b(phaseContentFindPhase);
                    phaseContent.addTo(phaseContentFindPhase);
                    this.interceptorsQuantity = phaseContent.getSize() + this.interceptorsQuantity;
                }
            }
        }
    }

    private final void notSharedInterceptorsList(java.util.List<? extends p194x6.n> list) {
        setInterceptors(list);
        this.interceptorsListShared = false;
        this.interceptorsListSharedPhase = null;
    }

    private final void resetInterceptorsList() {
        setInterceptors(null);
        this.interceptorsListShared = false;
        this.interceptorsListSharedPhase = null;
    }

    private final void setInterceptors(java.util.List<? extends p194x6.n> list) {
        this.interceptors$delegate = list;
    }

    private final void setInterceptorsListFromAnotherPipeline(io.ktor.util.pipeline.Pipeline<TSubject, TContext> pipeline) {
        setInterceptors(pipeline.sharedInterceptorsList());
        this.interceptorsListShared = true;
        this.interceptorsListSharedPhase = null;
    }

    private final void setInterceptorsListFromPhase(io.ktor.util.pipeline.PhaseContent<TSubject, TContext> phaseContent) {
        setInterceptors(phaseContent.sharedInterceptors());
        this.interceptorsListShared = false;
        this.interceptorsListSharedPhase = phaseContent.getPhase();
    }

    private final java.util.List<p194x6.n> sharedInterceptorsList() {
        if (getInterceptors() == null) {
            cacheInterceptors();
        }
        this.interceptorsListShared = true;
        java.util.List<p194x6.n> interceptors = getInterceptors();
        kotlin.jvm.internal.m.b(interceptors);
        return interceptors;
    }

    private final boolean tryAddToPhaseFastPath(io.ktor.util.pipeline.PipelinePhase phase, p194x6.n block) {
        java.util.List<p194x6.n> interceptors = getInterceptors();
        if (this.phasesRaw.isEmpty() || interceptors == null || this.interceptorsListShared || ((interceptors instanceof p201y6.a) && !(interceptors instanceof p201y6.c))) {
            return false;
        }
        if (kotlin.jvm.internal.m.a(this.interceptorsListSharedPhase, phase)) {
            interceptors.add(block);
            return true;
        }
        if (kotlin.jvm.internal.m.a(phase, p078i6.o.q1(this.phasesRaw)) || findPhaseIndex(phase) == p078i6.p.A0(this.phasesRaw)) {
            io.ktor.util.pipeline.PhaseContent<TSubject, TContext> phaseContentFindPhase = findPhase(phase);
            kotlin.jvm.internal.m.b(phaseContentFindPhase);
            phaseContentFindPhase.addInterceptor(block);
            interceptors.add(block);
            return true;
        }
        return false;
    }

    public final void addPhase(io.ktor.util.pipeline.PipelinePhase phase) {
        kotlin.jvm.internal.m.e(phase, "phase");
        if (hasPhase(phase)) {
            return;
        }
        this.phasesRaw.add(phase);
    }

    public void afterIntercepted() {
    }

    public final java.lang.Object execute(TContext tcontext, TSubject tsubject, p100l6.c cVar) {
        return createContext(tcontext, tsubject, cVar.getContext()).execute$ktor_utils(tsubject, cVar);
    }

    public final io.ktor.util.Attributes getAttributes() {
        return this.attributes;
    }

    public boolean getDevelopmentMode() {
        return this.developmentMode;
    }

    public final java.util.List<io.ktor.util.pipeline.PipelinePhase> getItems() {
        java.util.List<java.lang.Object> list = this.phasesRaw;
        java.util.ArrayList arrayList = new java.util.ArrayList(p078i6.q.I0(list, 10));
        for (java.lang.Object obj : list) {
            io.ktor.util.pipeline.PipelinePhase pipelinePhase = obj instanceof io.ktor.util.pipeline.PipelinePhase ? (io.ktor.util.pipeline.PipelinePhase) obj : null;
            if (pipelinePhase == null) {
                io.ktor.util.pipeline.PhaseContent phaseContent = obj instanceof io.ktor.util.pipeline.PhaseContent ? (io.ktor.util.pipeline.PhaseContent) obj : null;
                io.ktor.util.pipeline.PipelinePhase phase = phaseContent != null ? phaseContent.getPhase() : null;
                kotlin.jvm.internal.m.b(phase);
                pipelinePhase = phase;
            }
            arrayList.add(pipelinePhase);
        }
        return arrayList;
    }

    public final void insertPhaseAfter(io.ktor.util.pipeline.PipelinePhase reference, io.ktor.util.pipeline.PipelinePhase phase) throws io.ktor.util.pipeline.InvalidPhaseException {
        io.ktor.util.pipeline.PipelinePhaseRelation relation;
        io.ktor.util.pipeline.PipelinePhase relativeTo;
        kotlin.jvm.internal.m.e(reference, "reference");
        kotlin.jvm.internal.m.e(phase, "phase");
        if (hasPhase(phase)) {
            return;
        }
        int iFindPhaseIndex = findPhaseIndex(reference);
        if (iFindPhaseIndex == -1) {
            throw new io.ktor.util.pipeline.InvalidPhaseException("Phase " + reference + " was not registered for this pipeline");
        }
        int i3 = iFindPhaseIndex + 1;
        int iA0 = p078i6.p.A0(this.phasesRaw);
        if (i3 <= iA0) {
            while (true) {
                java.lang.Object obj = this.phasesRaw.get(i3);
                io.ktor.util.pipeline.PhaseContent phaseContent = obj instanceof io.ktor.util.pipeline.PhaseContent ? (io.ktor.util.pipeline.PhaseContent) obj : null;
                if (phaseContent != null && (relation = phaseContent.getRelation()) != null) {
                    io.ktor.util.pipeline.PipelinePhaseRelation.After after = relation instanceof io.ktor.util.pipeline.PipelinePhaseRelation.After ? (io.ktor.util.pipeline.PipelinePhaseRelation.After) relation : null;
                    if (after != null && (relativeTo = after.getRelativeTo()) != null && relativeTo.equals(reference)) {
                        iFindPhaseIndex = i3;
                    }
                    if (i3 == iA0) {
                        break;
                    } else {
                        i3++;
                    }
                } else {
                    break;
                }
            }
        }
        this.phasesRaw.add(iFindPhaseIndex + 1, new io.ktor.util.pipeline.PhaseContent(phase, new io.ktor.util.pipeline.PipelinePhaseRelation.After(reference)));
    }

    public final void insertPhaseBefore(io.ktor.util.pipeline.PipelinePhase reference, io.ktor.util.pipeline.PipelinePhase phase) throws io.ktor.util.pipeline.InvalidPhaseException {
        kotlin.jvm.internal.m.e(reference, "reference");
        kotlin.jvm.internal.m.e(phase, "phase");
        if (hasPhase(phase)) {
            return;
        }
        int iFindPhaseIndex = findPhaseIndex(reference);
        if (iFindPhaseIndex != -1) {
            this.phasesRaw.add(iFindPhaseIndex, new io.ktor.util.pipeline.PhaseContent(phase, new io.ktor.util.pipeline.PipelinePhaseRelation.Before(reference)));
            return;
        }
        throw new io.ktor.util.pipeline.InvalidPhaseException("Phase " + reference + " was not registered for this pipeline");
    }

    public final void intercept(io.ktor.util.pipeline.PipelinePhase phase, p194x6.n block) {
        kotlin.jvm.internal.m.e(phase, "phase");
        kotlin.jvm.internal.m.e(block, "block");
        io.ktor.util.pipeline.PhaseContent<TSubject, TContext> phaseContentFindPhase = findPhase(phase);
        if (phaseContentFindPhase == null) {
            throw new io.ktor.util.pipeline.InvalidPhaseException("Phase " + phase + " was not registered for this pipeline");
        }
        if (tryAddToPhaseFastPath(phase, block)) {
            this.interceptorsQuantity++;
            return;
        }
        phaseContentFindPhase.addInterceptor(block);
        this.interceptorsQuantity++;
        resetInterceptorsList();
        afterIntercepted();
    }

    public final java.util.List<p194x6.n> interceptorsForPhase(io.ktor.util.pipeline.PipelinePhase phase) {
        java.lang.Object next;
        kotlin.jvm.internal.m.e(phase, "phase");
        java.util.List<java.lang.Object> list = this.phasesRaw;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        for (java.lang.Object obj : list) {
            if (obj instanceof io.ktor.util.pipeline.PhaseContent) {
                arrayList.add(obj);
            }
        }
        java.util.Iterator it = arrayList.iterator();
        do {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
        } while (!kotlin.jvm.internal.m.a(((io.ktor.util.pipeline.PhaseContent) next).getPhase(), phase));
        io.ktor.util.pipeline.PhaseContent phaseContent = (io.ktor.util.pipeline.PhaseContent) next;
        java.util.List<p194x6.n> listSharedInterceptors = phaseContent != null ? phaseContent.sharedInterceptors() : null;
        return listSharedInterceptors == null ? p078i6.w.f23205h : listSharedInterceptors;
    }

    public final java.util.List<p194x6.n> interceptorsForTests$ktor_utils() {
        java.util.List<p194x6.n> interceptors = getInterceptors();
        return interceptors == null ? cacheInterceptors() : interceptors;
    }

    public final boolean isEmpty() {
        return this.interceptorsQuantity == 0;
    }

    public final void merge(io.ktor.util.pipeline.Pipeline<TSubject, TContext> from) {
        kotlin.jvm.internal.m.e(from, "from");
        if (fastPathMerge(from)) {
            return;
        }
        mergePhases(from);
        mergeInterceptors(from);
    }

    public final void mergePhases(io.ktor.util.pipeline.Pipeline<TSubject, TContext> from) {
        kotlin.jvm.internal.m.e(from, "from");
        java.util.ArrayList arrayListO1 = p078i6.o.O1(from.phasesRaw);
        while (!arrayListO1.isEmpty()) {
            java.util.Iterator it = arrayListO1.iterator();
            while (it.hasNext()) {
                java.lang.Object next = it.next();
                io.ktor.util.pipeline.PipelinePhase phase = next instanceof io.ktor.util.pipeline.PipelinePhase ? (io.ktor.util.pipeline.PipelinePhase) next : null;
                if (phase == null) {
                    kotlin.jvm.internal.m.c(next, "null cannot be cast to non-null type io.ktor.util.pipeline.PhaseContent<*, *>");
                    phase = ((io.ktor.util.pipeline.PhaseContent) next).getPhase();
                }
                if (hasPhase(phase)) {
                    it.remove();
                } else if (insertRelativePhase(next, phase)) {
                    it.remove();
                }
            }
        }
    }

    public final java.util.List<p194x6.n> phaseInterceptors$ktor_utils(io.ktor.util.pipeline.PipelinePhase phase) {
        java.util.List<p194x6.n> listSharedInterceptors;
        kotlin.jvm.internal.m.e(phase, "phase");
        io.ktor.util.pipeline.PhaseContent<TSubject, TContext> phaseContentFindPhase = findPhase(phase);
        return (phaseContentFindPhase == null || (listSharedInterceptors = phaseContentFindPhase.sharedInterceptors()) == null) ? p078i6.w.f23205h : listSharedInterceptors;
    }

    public final void resetFrom(io.ktor.util.pipeline.Pipeline<TSubject, TContext> from) {
        kotlin.jvm.internal.m.e(from, "from");
        this.phasesRaw.clear();
        if (this.interceptorsQuantity != 0) {
            throw new java.lang.IllegalStateException("Check failed.");
        }
        fastPathMerge(from);
    }

    public java.lang.String toString() {
        return super.toString();
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public Pipeline(io.ktor.util.pipeline.PipelinePhase phase, java.util.List<? extends p194x6.n> interceptors) {
        this(phase);
        kotlin.jvm.internal.m.e(phase, "phase");
        kotlin.jvm.internal.m.e(interceptors, "interceptors");
        java.util.Iterator<T> it = interceptors.iterator();
        while (it.hasNext()) {
            intercept(phase, (p194x6.n) it.next());
        }
    }
}
