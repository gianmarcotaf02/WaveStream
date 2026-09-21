package io.ktor.network.selector;

/* JADX INFO: loaded from: classes4.dex */
@kotlin.Metadata(d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0012\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u000b\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003:\u00014B\u000f\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J&\u0010\u000e\u001a\u00020\r2\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\b2\u0006\u0010\f\u001a\u00020\u000bH\u0082@¢\u0006\u0004\b\u000e\u0010\u000fJ\u0018\u0010\u0011\u001a\u00020\u00102\u0006\u0010\f\u001a\u00020\u000bH\u0082@¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0013\u001a\u00020\rH\u0082H¢\u0006\u0004\b\u0013\u0010\u0014J\u000f\u0010\u0015\u001a\u00020\rH\u0002¢\u0006\u0004\b\u0015\u0010\u0016J%\u0010\u0017\u001a\u00020\r2\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\b2\u0006\u0010\f\u001a\u00020\u000bH\u0002¢\u0006\u0004\b\u0017\u0010\u0018J\u001c\u0010\u0019\u001a\u0004\u0018\u00010\t*\b\u0012\u0004\u0012\u00020\t0\bH\u0082@¢\u0006\u0004\b\u0019\u0010\u001aJ\u001c\u0010\u001b\u001a\u0004\u0018\u00010\t*\b\u0012\u0004\u0012\u00020\t0\bH\u0082@¢\u0006\u0004\b\u001b\u0010\u001aJ\u0017\u0010\u001d\u001a\u00020\r2\u0006\u0010\u001c\u001a\u00020\tH\u0016¢\u0006\u0004\b\u001d\u0010\u001eJ\u0017\u0010\u001f\u001a\u00020\r2\u0006\u0010\u001c\u001a\u00020\tH\u0014¢\u0006\u0004\b\u001f\u0010\u001eJ\u000f\u0010 \u001a\u00020\rH\u0016¢\u0006\u0004\b \u0010\u0016R\u0018\u0010!\u001a\u0004\u0018\u00010\u000b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b!\u0010\"R\u0014\u0010$\u001a\u00020#8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b$\u0010%R\u0016\u0010'\u001a\u00020&8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b'\u0010(R&\u0010+\u001a\u0014\u0012\u0004\u0012\u00020\r\u0012\n\u0012\b\u0012\u0004\u0012\u00020\r0*0)8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b+\u0010,R\u0016\u0010-\u001a\u00020&8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b-\u0010(R\u001a\u0010.\u001a\b\u0012\u0004\u0012\u00020\t0\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b.\u0010/R\u001a\u00100\u001a\u00020\u00048\u0016X\u0096\u0004¢\u0006\f\n\u0004\b0\u00101\u001a\u0004\b2\u00103¨\u00065"}, d2 = {"Lio/ktor/network/selector/ActorSelectorManager;", "Lio/ktor/network/selector/SelectorManagerSupport;", "Ljava/io/Closeable;", "LS7/A;", "Ll6/h;", "context", "<init>", "(Ll6/h;)V", "Lio/ktor/network/selector/LockFreeMPSCQueue;", "Lio/ktor/network/selector/Selectable;", "mb", "Ljava/nio/channels/Selector;", "selector", "Lh6/A;", "process", "(Lio/ktor/network/selector/LockFreeMPSCQueue;Ljava/nio/channels/Selector;Ll6/c;)Ljava/lang/Object;", "", "select", "(Ljava/nio/channels/Selector;Ll6/c;)Ljava/lang/Object;", "dispatchIfNeeded", "(Ll6/c;)Ljava/lang/Object;", "selectWakeup", "()V", "processInterests", "(Lio/ktor/network/selector/LockFreeMPSCQueue;Ljava/nio/channels/Selector;)V", "receiveOrNull", "(Lio/ktor/network/selector/LockFreeMPSCQueue;Ll6/c;)Ljava/lang/Object;", "receiveOrNullSuspend", "selectable", "notifyClosed", "(Lio/ktor/network/selector/Selectable;)V", "publishInterest", "close", "selectorRef", "Ljava/nio/channels/Selector;", "Ljava/util/concurrent/atomic/AtomicLong;", "wakeup", "Ljava/util/concurrent/atomic/AtomicLong;", "", "inSelect", "Z", "Lio/ktor/network/selector/ActorSelectorManager$ContinuationHolder;", "Ll6/c;", "continuation", "Lio/ktor/network/selector/ActorSelectorManager$ContinuationHolder;", "closed", "selectionQueue", "Lio/ktor/network/selector/LockFreeMPSCQueue;", "coroutineContext", "Ll6/h;", "getCoroutineContext", "()Ll6/h;", "ContinuationHolder", "ktor-network"}, k = 1, mv = {2, 1, 0}, xi = androidx.media3.container.NalUnitUtil.H265_NAL_UNIT_TYPE_UNSPECIFIED)
public final class ActorSelectorManager extends io.ktor.network.selector.SelectorManagerSupport implements java.io.Closeable, S7.A, java.lang.AutoCloseable {
    private volatile boolean closed;
    private final io.ktor.network.selector.ActorSelectorManager.ContinuationHolder<p070h6.A, p100l6.c> continuation;
    private final p100l6.h coroutineContext;
    private volatile boolean inSelect;
    private final io.ktor.network.selector.LockFreeMPSCQueue<io.ktor.network.selector.Selectable> selectionQueue;
    private volatile java.nio.channels.Selector selectorRef;
    private final java.util.concurrent.atomic.AtomicLong wakeup;

    /* JADX INFO: renamed from: io.ktor.network.selector.ActorSelectorManager$1, reason: invalid class name */
    @kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"LS7/A;", "Lh6/A;", "<anonymous>", "(LS7/A;)V"}, k = 3, mv = {2, 1, 0})
    @p117n6.e(c = "io.ktor.network.selector.ActorSelectorManager$1", f = "ActorSelectorManager.kt", l = {44}, m = "invokeSuspend")
    public static final class AnonymousClass1 extends p117n6.i implements p194x6.m {
        java.lang.Object L$0;
        java.lang.Object L$1;
        java.lang.Object L$2;
        int label;

        public AnonymousClass1(p100l6.c cVar) {
            super(2, cVar);
        }

        @Override // p117n6.a
        public final p100l6.c create(java.lang.Object obj, p100l6.c cVar) {
            return io.ktor.network.selector.ActorSelectorManager.this.new AnonymousClass1(cVar);
        }

        @Override // p194x6.m
        public final java.lang.Object invoke(S7.A a2, p100l6.c cVar) {
            return ((io.ktor.network.selector.ActorSelectorManager.AnonymousClass1) create(a2, cVar)).invokeSuspend(p070h6.A.f22523a);
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r0v12, types: [java.nio.channels.spi.AbstractSelector] */
        /* JADX WARN: Type inference failed for: r0v13 */
        /* JADX WARN: Type inference failed for: r0v14 */
        /* JADX WARN: Type inference failed for: r0v15 */
        /* JADX WARN: Type inference failed for: r0v16 */
        /* JADX WARN: Type inference failed for: r0v4 */
        /* JADX WARN: Type inference failed for: r0v6, types: [java.nio.channels.Selector] */
        /* JADX WARN: Type inference failed for: r0v7, types: [java.nio.channels.Selector] */
        /* JADX WARN: Type inference failed for: r0v9 */
        /* JADX WARN: Type inference failed for: r1v10 */
        /* JADX WARN: Type inference failed for: r1v11 */
        /* JADX WARN: Type inference failed for: r1v2, types: [io.ktor.network.selector.ActorSelectorManager, java.lang.Object] */
        /* JADX WARN: Type inference failed for: r1v3, types: [io.ktor.network.selector.ActorSelectorManager, io.ktor.network.selector.SelectorManagerSupport] */
        /* JADX WARN: Type inference failed for: r1v4, types: [io.ktor.network.selector.ActorSelectorManager, io.ktor.network.selector.SelectorManagerSupport] */
        /* JADX WARN: Type inference failed for: r1v5, types: [io.ktor.network.selector.ActorSelectorManager] */
        /* JADX WARN: Type inference failed for: r1v7, types: [io.ktor.network.selector.ActorSelectorManager] */
        /* JADX WARN: Type inference failed for: r1v8 */
        /* JADX WARN: Type inference failed for: r1v9 */
        @Override // p117n6.a
        public final java.lang.Object invokeSuspend(java.lang.Object obj) throws java.io.IOException {
            ?? r9;
            java.io.Closeable closeable;
            java.lang.Throwable th;
            ?? r10;
            java.io.Closeable closeable2;
            java.io.Closeable closeable3;
            ?? r11;
            ?? r12;
            ?? r13;
            ?? r14;
            p109m6.a aVar = p109m6.a.f25430h;
            int i3 = this.label;
            try {
                if (i3 == 0) {
                    com.google.common.util.concurrent.P.u0(obj);
                    java.nio.channels.spi.AbstractSelector abstractSelectorOpenSelector = io.ktor.network.selector.ActorSelectorManager.this.getProvider().openSelector();
                    if (abstractSelectorOpenSelector == null) {
                        throw new java.lang.IllegalStateException("openSelector() = null");
                    }
                    io.ktor.network.selector.ActorSelectorManager.this.selectorRef = abstractSelectorOpenSelector;
                    r9 = io.ktor.network.selector.ActorSelectorManager.this;
                    try {
                        io.ktor.network.selector.LockFreeMPSCQueue lockFreeMPSCQueue = ((io.ktor.network.selector.ActorSelectorManager) r9).selectionQueue;
                        this.L$0 = abstractSelectorOpenSelector;
                        this.L$1 = r9;
                        this.L$2 = abstractSelectorOpenSelector;
                        this.label = 1;
                        if (r9.process(lockFreeMPSCQueue, abstractSelectorOpenSelector, this) == aVar) {
                            return aVar;
                        }
                        java.nio.channels.spi.AbstractSelector abstractSelector = abstractSelectorOpenSelector;
                        closeable2 = abstractSelector;
                        r14 = abstractSelector;
                        r13 = r9;
                        ((io.ktor.network.selector.ActorSelectorManager) r13).closed = true;
                        ((io.ktor.network.selector.ActorSelectorManager) r13).selectionQueue.close();
                        ((io.ktor.network.selector.ActorSelectorManager) r13).selectorRef = null;
                        r12 = r14;
                        r11 = r13;
                        closeable3 = closeable2;
                    } catch (java.lang.Throwable th2) {
                        closeable = abstractSelectorOpenSelector;
                        th = th2;
                        r10 = closeable;
                        ((io.ktor.network.selector.ActorSelectorManager) r9).closed = true;
                        ((io.ktor.network.selector.ActorSelectorManager) r9).selectionQueue.close();
                        r9.cancelAllSuspensions(r10, th);
                        ((io.ktor.network.selector.ActorSelectorManager) r9).closed = true;
                        ((io.ktor.network.selector.ActorSelectorManager) r9).selectionQueue.close();
                        ((io.ktor.network.selector.ActorSelectorManager) r9).selectorRef = null;
                        r12 = r10;
                        r11 = r9;
                        closeable3 = closeable;
                    }
                } else {
                    if (i3 != 1) {
                        throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    r10 = (java.nio.channels.spi.AbstractSelector) this.L$2;
                    r9 = (io.ktor.network.selector.ActorSelectorManager) this.L$1;
                    closeable = (java.io.Closeable) this.L$0;
                    try {
                        com.google.common.util.concurrent.P.u0(obj);
                        r14 = r10;
                        r13 = r9;
                        closeable2 = closeable;
                        ((io.ktor.network.selector.ActorSelectorManager) r13).closed = true;
                        ((io.ktor.network.selector.ActorSelectorManager) r13).selectionQueue.close();
                        ((io.ktor.network.selector.ActorSelectorManager) r13).selectorRef = null;
                        r12 = r14;
                        r11 = r13;
                        closeable3 = closeable2;
                    } catch (java.lang.Throwable th3) {
                        th = th3;
                        try {
                            ((io.ktor.network.selector.ActorSelectorManager) r9).closed = true;
                            ((io.ktor.network.selector.ActorSelectorManager) r9).selectionQueue.close();
                            r9.cancelAllSuspensions(r10, th);
                            ((io.ktor.network.selector.ActorSelectorManager) r9).closed = true;
                            ((io.ktor.network.selector.ActorSelectorManager) r9).selectionQueue.close();
                            ((io.ktor.network.selector.ActorSelectorManager) r9).selectorRef = null;
                            r12 = r10;
                            r11 = r9;
                            closeable3 = closeable;
                        } catch (java.lang.Throwable th4) {
                            ((io.ktor.network.selector.ActorSelectorManager) r9).closed = true;
                            ((io.ktor.network.selector.ActorSelectorManager) r9).selectionQueue.close();
                            ((io.ktor.network.selector.ActorSelectorManager) r9).selectorRef = null;
                            r9.cancelAllSuspensions(r10, null);
                            throw th4;
                        }
                    }
                }
                r11.cancelAllSuspensions(r12, null);
                while (true) {
                    io.ktor.network.selector.Selectable selectable = (io.ktor.network.selector.Selectable) ((io.ktor.network.selector.ActorSelectorManager) r11).selectionQueue.removeFirstOrNull();
                    if (selectable == null) {
                        com.google.android.gms.internal.play_billing.AbstractC1833d1.l(closeable3, null);
                        return p070h6.A.f22523a;
                    }
                    r11.cancelAllSuspensions(selectable, new U7.v("Failed to apply interest: selector closed"));
                }
            } catch (java.lang.Throwable th5) {
                try {
                    throw th5;
                } catch (java.lang.Throwable th6) {
                    com.google.android.gms.internal.play_billing.AbstractC1833d1.l(closeable, th5);
                    throw th6;
                }
            }
        }
    }

    @kotlin.Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0002\u0018\u0000*\u0004\b\u0000\u0010\u0001*\u000e\b\u0001\u0010\u0003*\b\u0012\u0004\u0012\u00028\u00000\u00022\u00020\u0004B\u0007¢\u0006\u0004\b\u0005\u0010\u0006J\u0015\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00028\u0000¢\u0006\u0004\b\t\u0010\nJ+\u0010\u000e\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u000b\u001a\u00028\u00012\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\b0\fH\u0086\bø\u0001\u0000¢\u0006\u0004\b\u000e\u0010\u000fR\u001c\u0010\u0011\u001a\n\u0012\u0006\u0012\u0004\u0018\u00018\u00010\u00108\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012\u0082\u0002\u0007\n\u0005\b\u009920\u0001¨\u0006\u0013"}, d2 = {"Lio/ktor/network/selector/ActorSelectorManager$ContinuationHolder;", "R", "Ll6/c;", "C", "", "<init>", "()V", "value", "", "resume", "(Ljava/lang/Object;)Z", "continuation", "Lkotlin/Function0;", "condition", "suspendIf", "(Ll6/c;Lkotlin/jvm/functions/Function0;)Ljava/lang/Object;", "Ljava/util/concurrent/atomic/AtomicReference;", "ref", "Ljava/util/concurrent/atomic/AtomicReference;", "ktor-network"}, k = 1, mv = {2, 1, 0}, xi = androidx.media3.container.NalUnitUtil.H265_NAL_UNIT_TYPE_UNSPECIFIED)
    public static final class ContinuationHolder<R, C extends p100l6.c> {
        private final java.util.concurrent.atomic.AtomicReference<C> ref = new java.util.concurrent.atomic.AtomicReference<>(null);

        public final boolean resume(R value) {
            C andSet = this.ref.getAndSet(null);
            if (andSet == null) {
                return false;
            }
            andSet.resumeWith(value);
            return true;
        }

        public final java.lang.Object suspendIf(C continuation, kotlin.jvm.functions.Function0 condition) {
            kotlin.jvm.internal.m.e(continuation, "continuation");
            kotlin.jvm.internal.m.e(condition, "condition");
            if (!((java.lang.Boolean) condition.invoke()).booleanValue()) {
                return null;
            }
            java.util.concurrent.atomic.AtomicReference atomicReference = this.ref;
            while (!atomicReference.compareAndSet(null, continuation)) {
                if (atomicReference.get() != null) {
                    throw new java.lang.IllegalStateException("Continuation is already set");
                }
            }
            if (!((java.lang.Boolean) condition.invoke()).booleanValue()) {
                java.util.concurrent.atomic.AtomicReference atomicReference2 = this.ref;
                while (!atomicReference2.compareAndSet(continuation, null)) {
                    if (atomicReference2.get() != continuation) {
                    }
                }
                return null;
            }
            return p109m6.a.f25430h;
        }
    }

    /* JADX INFO: renamed from: io.ktor.network.selector.ActorSelectorManager$process$1, reason: invalid class name and case insensitive filesystem */
    @kotlin.Metadata(k = 3, mv = {2, 1, 0}, xi = androidx.media3.container.NalUnitUtil.H265_NAL_UNIT_TYPE_UNSPECIFIED)
    @p117n6.e(c = "io.ktor.network.selector.ActorSelectorManager", f = "ActorSelectorManager.kt", l = {dev.jdtech.mpv.MPVLib.MPV_LOG_LEVEL_TRACE, 74, 90}, m = "process")
    public static final class C24251 extends p117n6.c {
        java.lang.Object L$0;
        java.lang.Object L$1;
        java.lang.Object L$2;
        int label;
        /* synthetic */ java.lang.Object result;

        public C24251(p100l6.c cVar) {
            super(cVar);
        }

        @Override // p117n6.a
        public final java.lang.Object invokeSuspend(java.lang.Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return io.ktor.network.selector.ActorSelectorManager.this.process(null, null, this);
        }
    }

    /* JADX INFO: renamed from: io.ktor.network.selector.ActorSelectorManager$receiveOrNullSuspend$1, reason: invalid class name and case insensitive filesystem */
    @kotlin.Metadata(k = 3, mv = {2, 1, 0}, xi = androidx.media3.container.NalUnitUtil.H265_NAL_UNIT_TYPE_UNSPECIFIED)
    @p117n6.e(c = "io.ktor.network.selector.ActorSelectorManager", f = "ActorSelectorManager.kt", l = {168}, m = "receiveOrNullSuspend")
    public static final class C24261 extends p117n6.c {
        java.lang.Object L$0;
        java.lang.Object L$1;
        int label;
        /* synthetic */ java.lang.Object result;

        public C24261(p100l6.c cVar) {
            super(cVar);
        }

        @Override // p117n6.a
        public final java.lang.Object invokeSuspend(java.lang.Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return io.ktor.network.selector.ActorSelectorManager.this.receiveOrNullSuspend(null, this);
        }
    }

    /* JADX INFO: renamed from: io.ktor.network.selector.ActorSelectorManager$select$1, reason: invalid class name and case insensitive filesystem */
    @kotlin.Metadata(k = 3, mv = {2, 1, 0}, xi = androidx.media3.container.NalUnitUtil.H265_NAL_UNIT_TYPE_UNSPECIFIED)
    @p117n6.e(c = "io.ktor.network.selector.ActorSelectorManager", f = "ActorSelectorManager.kt", l = {210}, m = "select")
    public static final class C24271 extends p117n6.c {
        java.lang.Object L$0;
        java.lang.Object L$1;
        int label;
        /* synthetic */ java.lang.Object result;

        public C24271(p100l6.c cVar) {
            super(cVar);
        }

        @Override // p117n6.a
        public final java.lang.Object invokeSuspend(java.lang.Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return io.ktor.network.selector.ActorSelectorManager.this.select(null, this);
        }
    }

    public ActorSelectorManager(p100l6.h context) {
        kotlin.jvm.internal.m.e(context, "context");
        this.wakeup = new java.util.concurrent.atomic.AtomicLong();
        this.continuation = new io.ktor.network.selector.ActorSelectorManager.ContinuationHolder<>();
        this.selectionQueue = new io.ktor.network.selector.LockFreeMPSCQueue<>();
        this.coroutineContext = context.plus(new S7.C0909z("selector"));
        S7.C.A(this, null, new io.ktor.network.selector.ActorSelectorManager.AnonymousClass1(null), 3);
    }

    private final java.lang.Object dispatchIfNeeded(p100l6.c cVar) {
        S7.C.M(cVar);
        return p070h6.A.f22523a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:21:0x0077  */
    /* JADX WARN: Code duplicated, block: B:35:0x00c4  */
    /* JADX WARN: Code duplicated, block: B:37:0x00ca  */
    /* JADX WARN: Code duplicated, block: B:50:0x00ea A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:52:0x00e5 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:54:0x00d3 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:28:0x0097 -> B:19:0x0073). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:31:0x00b1 -> B:19:0x0073). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:33:0x00c1 -> B:19:0x0073). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:42:0x00f6 -> B:44:0x00f9). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    public final java.lang.Object process(io.ktor.network.selector.LockFreeMPSCQueue<io.ktor.network.selector.Selectable> r11, java.nio.channels.Selector r12, p100l6.c r13) {
        /*
            Method dump skipped, instruction units count: 262
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: io.ktor.network.selector.ActorSelectorManager.process(io.ktor.network.selector.LockFreeMPSCQueue, java.nio.channels.Selector, l6.c):java.lang.Object");
    }

    private final void processInterests(io.ktor.network.selector.LockFreeMPSCQueue<io.ktor.network.selector.Selectable> mb, java.nio.channels.Selector selector) {
        while (true) {
            io.ktor.network.selector.Selectable selectableRemoveFirstOrNull = mb.removeFirstOrNull();
            if (selectableRemoveFirstOrNull == null) {
                return;
            } else {
                applyInterest(selector, selectableRemoveFirstOrNull);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final java.lang.Object receiveOrNull(io.ktor.network.selector.LockFreeMPSCQueue<io.ktor.network.selector.Selectable> lockFreeMPSCQueue, p100l6.c cVar) {
        io.ktor.network.selector.Selectable selectableRemoveFirstOrNull = lockFreeMPSCQueue.removeFirstOrNull();
        return selectableRemoveFirstOrNull == null ? receiveOrNullSuspend(lockFreeMPSCQueue, cVar) : selectableRemoveFirstOrNull;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final java.lang.Object receiveOrNullSuspend(io.ktor.network.selector.LockFreeMPSCQueue<io.ktor.network.selector.Selectable> lockFreeMPSCQueue, p100l6.c cVar) {
        io.ktor.network.selector.ActorSelectorManager.C24261 c24261;
        io.ktor.network.selector.ActorSelectorManager actorSelectorManager;
        java.lang.Object obj;
        if (cVar instanceof io.ktor.network.selector.ActorSelectorManager.C24261) {
            c24261 = (io.ktor.network.selector.ActorSelectorManager.C24261) cVar;
            int i3 = c24261.label;
            if ((i3 & Integer.MIN_VALUE) != 0) {
                c24261.label = i3 - Integer.MIN_VALUE;
            } else {
                c24261 = new io.ktor.network.selector.ActorSelectorManager.C24261(cVar);
            }
        } else {
            c24261 = new io.ktor.network.selector.ActorSelectorManager.C24261(cVar);
        }
        java.lang.Object obj2 = c24261.result;
        java.lang.Object obj3 = p109m6.a.f25430h;
        int i9 = c24261.label;
        if (i9 == 0) {
            com.google.common.util.concurrent.P.u0(obj2);
            actorSelectorManager = this;
        } else {
            if (i9 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            lockFreeMPSCQueue = (io.ktor.network.selector.LockFreeMPSCQueue) c24261.L$1;
            actorSelectorManager = (io.ktor.network.selector.ActorSelectorManager) c24261.L$0;
            com.google.common.util.concurrent.P.u0(obj2);
        }
        do {
            io.ktor.network.selector.Selectable selectableRemoveFirstOrNull = lockFreeMPSCQueue.removeFirstOrNull();
            if (selectableRemoveFirstOrNull != null) {
                return selectableRemoveFirstOrNull;
            }
            obj = null;
            if (actorSelectorManager.closed) {
                return null;
            }
            c24261.L$0 = actorSelectorManager;
            c24261.L$1 = lockFreeMPSCQueue;
            c24261.label = 1;
            io.ktor.network.selector.ActorSelectorManager.ContinuationHolder<p070h6.A, p100l6.c> continuationHolder = actorSelectorManager.continuation;
            if (lockFreeMPSCQueue.isEmpty() && !actorSelectorManager.closed) {
                java.util.concurrent.atomic.AtomicReference atomicReference = ((io.ktor.network.selector.ActorSelectorManager.ContinuationHolder) continuationHolder).ref;
                while (!atomicReference.compareAndSet(null, c24261)) {
                    if (atomicReference.get() != null) {
                        throw new java.lang.IllegalStateException("Continuation is already set");
                    }
                }
                if (lockFreeMPSCQueue.isEmpty() && !actorSelectorManager.closed) {
                    obj = p109m6.a.f25430h;
                    break;
                }
                java.util.concurrent.atomic.AtomicReference atomicReference2 = ((io.ktor.network.selector.ActorSelectorManager.ContinuationHolder) continuationHolder).ref;
                while (!atomicReference2.compareAndSet(c24261, null)) {
                    if (atomicReference2.get() != c24261) {
                        obj = p109m6.a.f25430h;
                        break;
                    }
                }
            }
            if (obj == null) {
                obj = p070h6.A.f22523a;
            }
            p109m6.a aVar = p109m6.a.f25430h;
        } while (obj != obj3);
        return obj3;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final java.lang.Object select(java.nio.channels.Selector selector, p100l6.c cVar) throws java.io.IOException {
        io.ktor.network.selector.ActorSelectorManager.C24271 c24271;
        io.ktor.network.selector.ActorSelectorManager actorSelectorManager;
        int iSelectNow;
        if (cVar instanceof io.ktor.network.selector.ActorSelectorManager.C24271) {
            c24271 = (io.ktor.network.selector.ActorSelectorManager.C24271) cVar;
            int i3 = c24271.label;
            if ((i3 & Integer.MIN_VALUE) != 0) {
                c24271.label = i3 - Integer.MIN_VALUE;
            } else {
                c24271 = new io.ktor.network.selector.ActorSelectorManager.C24271(cVar);
            }
        } else {
            c24271 = new io.ktor.network.selector.ActorSelectorManager.C24271(cVar);
        }
        java.lang.Object obj = c24271.result;
        p109m6.a aVar = p109m6.a.f25430h;
        int i9 = c24271.label;
        if (i9 == 0) {
            com.google.common.util.concurrent.P.u0(obj);
            this.inSelect = true;
            c24271.L$0 = this;
            c24271.L$1 = selector;
            c24271.label = 1;
            if (S7.C.M(c24271) == aVar) {
                return aVar;
            }
            actorSelectorManager = this;
        } else {
            if (i9 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            selector = (java.nio.channels.Selector) c24271.L$1;
            actorSelectorManager = (io.ktor.network.selector.ActorSelectorManager) c24271.L$0;
            com.google.common.util.concurrent.P.u0(obj);
        }
        if (actorSelectorManager.wakeup.get() == 0) {
            iSelectNow = selector.select(500L);
            actorSelectorManager.inSelect = false;
        } else {
            actorSelectorManager.inSelect = false;
            actorSelectorManager.wakeup.set(0L);
            iSelectNow = selector.selectNow();
        }
        return new java.lang.Integer(iSelectNow);
    }

    private final void selectWakeup() {
        java.nio.channels.Selector selector;
        if (this.wakeup.incrementAndGet() == 1 && this.inSelect && (selector = this.selectorRef) != null) {
            selector.wakeup();
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        this.closed = true;
        this.selectionQueue.close();
        if (this.continuation.resume(p070h6.A.f22523a)) {
            return;
        }
        selectWakeup();
    }

    @Override // io.ktor.network.selector.SelectorManagerSupport, io.ktor.network.selector.SelectorManager, S7.A
    public p100l6.h getCoroutineContext() {
        return this.coroutineContext;
    }

    @Override // io.ktor.network.selector.SelectorManager
    public void notifyClosed(io.ktor.network.selector.Selectable selectable) {
        java.nio.channels.SelectionKey selectionKeyKeyFor;
        kotlin.jvm.internal.m.e(selectable, "selectable");
        cancelAllSuspensions(selectable, new java.nio.channels.ClosedChannelException());
        java.nio.channels.Selector selector = this.selectorRef;
        if (selector == null || (selectionKeyKeyFor = selectable.getChannel().keyFor(selector)) == null) {
            return;
        }
        selectionKeyKeyFor.cancel();
        selectWakeup();
    }

    @Override // io.ktor.network.selector.SelectorManagerSupport
    public void publishInterest(io.ktor.network.selector.Selectable selectable) {
        kotlin.jvm.internal.m.e(selectable, "selectable");
        try {
            if (this.selectionQueue.addLast(selectable)) {
                this.continuation.resume(p070h6.A.f22523a);
                selectWakeup();
            } else {
                if (!selectable.getChannel().isOpen()) {
                    throw new java.nio.channels.ClosedChannelException();
                }
                throw new java.nio.channels.ClosedSelectorException();
            }
        } catch (java.lang.Throwable th) {
            cancelAllSuspensions(selectable, th);
        }
    }
}
