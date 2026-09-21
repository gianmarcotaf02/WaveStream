package com.revenuecat.purchases.common.workflows;

/* JADX INFO: loaded from: classes4.dex */
@kotlin.Metadata(d1 = {"\u0000d\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0012\n\u0002\b\u0004\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0011\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0000\u0018\u0000 82\u00020\u0001:\u000298Bw\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0010\b\u0002\u0010\u0006\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00050\u0004\u0012J\b\u0002\u0010\r\u001aD\b\u0001\u0012\u0004\u0012\u00020\u0005\u0012\"\u0012 \b\u0001\u0012\u0004\u0012\u00020\u0005\u0012\f\u0012\n\u0012\u0006\u0012\u0004\u0018\u00010\n0\t\u0012\u0006\u0012\u0004\u0018\u00010\u000b0\b\u0012\n\u0012\b\u0012\u0004\u0012\u00020\f0\t\u0012\u0006\u0012\u0004\u0018\u00010\u000b\u0018\u00010\u0007\u0012\b\b\u0002\u0010\u000f\u001a\u00020\u000e¢\u0006\u0004\b\u0010\u0010\u0011J\u001a\u0010\u0013\u001a\u0004\u0018\u00010\n2\u0006\u0010\u0012\u001a\u00020\u0005H\u0082@¢\u0006\u0004\b\u0013\u0010\u0014J\u001a\u0010\u0016\u001a\u0004\u0018\u00010\u00152\u0006\u0010\u0012\u001a\u00020\u0005H\u0082@¢\u0006\u0004\b\u0016\u0010\u0014J!\u0010\u0018\u001a\u0004\u0018\u00010\n2\u0006\u0010\u0012\u001a\u00020\u00052\u0006\u0010\u0017\u001a\u00020\u0015H\u0002¢\u0006\u0004\b\u0018\u0010\u0019J\u0017\u0010\u001d\u001a\u00020\u001c2\u0006\u0010\u001b\u001a\u00020\u001aH\u0002¢\u0006\u0004\b\u001d\u0010\u001eJ\r\u0010\u001f\u001a\u00020\u001c¢\u0006\u0004\b\u001f\u0010 J\u0018\u0010#\u001a\u00020\"2\u0006\u0010!\u001a\u00020\u0005H\u0086@¢\u0006\u0004\b#\u0010\u0014J\u001a\u0010$\u001a\u0004\u0018\u00010\u00052\u0006\u0010!\u001a\u00020\u0005H\u0086@¢\u0006\u0004\b$\u0010\u0014J\u001a\u0010%\u001a\u0004\u0018\u00010\n2\u0006\u0010\u0012\u001a\u00020\u0005H\u0086@¢\u0006\u0004\b%\u0010\u0014J\u0010\u0010&\u001a\u00020\fH\u0086@¢\u0006\u0004\b&\u0010'J\u0018\u0010(\u001a\u00020\f2\u0006\u0010\u001b\u001a\u00020\u001aH\u0086@¢\u0006\u0004\b(\u0010)J\u0010\u0010(\u001a\u00020\fH\u0086@¢\u0006\u0004\b(\u0010'J\u0015\u0010*\u001a\u00020\f2\u0006\u0010\u001b\u001a\u00020\u001a¢\u0006\u0004\b*\u0010+J\u0017\u0010,\u001a\u00020\f2\u0006\u0010\u001b\u001a\u00020\u001aH\u0016¢\u0006\u0004\b,\u0010+J\u0017\u0010-\u001a\u00020\f2\u0006\u0010\u001b\u001a\u00020\u001aH\u0016¢\u0006\u0004\b-\u0010+J\r\u0010.\u001a\u00020\f¢\u0006\u0004\b.\u0010/R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u00100R\u001c\u0010\u0006\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00050\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u00101RV\u0010\r\u001aD\b\u0001\u0012\u0004\u0012\u00020\u0005\u0012\"\u0012 \b\u0001\u0012\u0004\u0012\u00020\u0005\u0012\f\u0012\n\u0012\u0006\u0012\u0004\u0018\u00010\n0\t\u0012\u0006\u0012\u0004\u0018\u00010\u000b0\b\u0012\n\u0012\b\u0012\u0004\u0012\u00020\f0\t\u0012\u0006\u0012\u0004\u0018\u00010\u000b\u0018\u00010\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u00102R\u0014\u0010\u000f\u001a\u00020\u000e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u00103R\u001a\u00106\u001a\b\u0012\u0004\u0012\u000205048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b6\u00107¨\u0006:"}, d2 = {"Lcom/revenuecat/purchases/common/workflows/WorkflowsConfigProvider;", "Lcom/revenuecat/purchases/common/remoteconfig/RemoteConfigCommitListener;", "Lcom/revenuecat/purchases/common/remoteconfig/RemoteConfigManager;", "manager", "Lkotlin/Function0;", "", "currentOfferingIdProvider", "Lkotlin/Function3;", "Lkotlin/Function2;", "Ll6/c;", "Lcom/revenuecat/purchases/common/workflows/PublishedWorkflow;", "", "Lh6/A;", "onCurrentWorkflowLoaded", "LS7/A;", "scope", "<init>", "(Lcom/revenuecat/purchases/common/remoteconfig/RemoteConfigManager;Lkotlin/jvm/functions/Function0;Lx6/n;LS7/A;)V", "workflowId", "resolveWorkflowBody", "(Ljava/lang/String;Ll6/c;)Ljava/lang/Object;", "", "resolveWorkflowBytes", androidx.media3.extractor.text.ttml.TtmlNode.TAG_BODY, "decodeWorkflow", "(Ljava/lang/String;[B)Lcom/revenuecat/purchases/common/workflows/PublishedWorkflow;", "", "generation", "", "isWarmAtOrAbove", "(I)Z", "isWarmForCurrentOffering", "()Z", "offeringId", "Lcom/revenuecat/purchases/common/workflows/WorkflowResolution;", "resolveWorkflow", "workflowIdForOfferingId", "getWorkflow", "awaitReady", "(Ll6/c;)Ljava/lang/Object;", "warm", "(ILl6/c;)Ljava/lang/Object;", "warmAsync", "(I)V", "onConfigCommitted", "onConfigInvalidated", "close", "()V", "Lcom/revenuecat/purchases/common/remoteconfig/RemoteConfigManager;", "Lkotlin/jvm/functions/Function0;", "Lx6/n;", "LS7/A;", "Lcom/revenuecat/purchases/common/remoteconfig/GenerationGuardedCache;", "Lcom/revenuecat/purchases/common/workflows/WorkflowsConfigProvider$Cached;", "cache", "Lcom/revenuecat/purchases/common/remoteconfig/GenerationGuardedCache;", "Companion", "Cached", "purchases_defaultsRelease"}, k = 1, mv = {1, 8, 0}, xi = androidx.media3.container.NalUnitUtil.H265_NAL_UNIT_TYPE_UNSPECIFIED)
public final class WorkflowsConfigProvider implements com.revenuecat.purchases.common.remoteconfig.RemoteConfigCommitListener {
    private static final com.revenuecat.purchases.common.workflows.WorkflowsConfigProvider.Companion Companion = new com.revenuecat.purchases.common.workflows.WorkflowsConfigProvider.Companion(null);
    private static final java.lang.String KEY_OFFERING_IDENTIFIER = "offering_identifier";
    private final com.revenuecat.purchases.common.remoteconfig.GenerationGuardedCache<com.revenuecat.purchases.common.workflows.WorkflowsConfigProvider.Cached> cache;
    private final kotlin.jvm.functions.Function0 currentOfferingIdProvider;
    private final com.revenuecat.purchases.common.remoteconfig.RemoteConfigManager manager;
    private final p194x6.n onCurrentWorkflowLoaded;
    private final S7.A scope;

    /* JADX INFO: renamed from: com.revenuecat.purchases.common.workflows.WorkflowsConfigProvider$1, reason: invalid class name */
    @kotlin.Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0001\n\u0000\u0010\u0000\u001a\u0004\u0018\u00010\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "invoke"}, k = 3, mv = {1, 8, 0}, xi = androidx.media3.container.NalUnitUtil.H265_NAL_UNIT_TYPE_UNSPECIFIED)
    public static final class AnonymousClass1 extends kotlin.jvm.internal.o implements kotlin.jvm.functions.Function0 {
        public static final com.revenuecat.purchases.common.workflows.WorkflowsConfigProvider.AnonymousClass1 INSTANCE = new com.revenuecat.purchases.common.workflows.WorkflowsConfigProvider.AnonymousClass1();

        public AnonymousClass1() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final java.lang.Void invoke() {
            return null;
        }
    }

    @kotlin.Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\t\b\u0002\u0018\u00002\u00020\u0001B7\u0012\u001a\u0010\u0006\u001a\u0016\u0012\u0004\u0012\u00020\u0003\u0012\f\u0012\n\u0012\u0006\u0012\u0004\u0018\u00010\u00050\u00040\u0002\u0012\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\b\u0010\tR+\u0010\u0006\u001a\u0016\u0012\u0004\u0012\u00020\u0003\u0012\f\u0012\n\u0012\u0006\u0012\u0004\u0018\u00010\u00050\u00040\u00028\u0006¢\u0006\f\n\u0004\b\u0006\u0010\n\u001a\u0004\b\u000b\u0010\fR#\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00030\u00028\u0006¢\u0006\f\n\u0004\b\u0007\u0010\n\u001a\u0004\b\r\u0010\f¨\u0006\u000e"}, d2 = {"Lcom/revenuecat/purchases/common/workflows/WorkflowsConfigProvider$Cached;", "", "", "", "Lh6/h;", "Lcom/revenuecat/purchases/common/workflows/PublishedWorkflow;", com.revenuecat.purchases.common.events.BackendEvent.WORKFLOW_EVENT_TYPE, "offeringToWorkflowId", "<init>", "(Ljava/util/Map;Ljava/util/Map;)V", "Ljava/util/Map;", "getWorkflows", "()Ljava/util/Map;", "getOfferingToWorkflowId", "purchases_defaultsRelease"}, k = 1, mv = {1, 8, 0}, xi = androidx.media3.container.NalUnitUtil.H265_NAL_UNIT_TYPE_UNSPECIFIED)
    public static final class Cached {
        private final java.util.Map<java.lang.String, java.lang.String> offeringToWorkflowId;
        private final java.util.Map<java.lang.String, p070h6.h> workflows;

        /* JADX WARN: Multi-variable type inference failed */
        public Cached(java.util.Map<java.lang.String, ? extends p070h6.h> workflows, java.util.Map<java.lang.String, java.lang.String> offeringToWorkflowId) {
            kotlin.jvm.internal.m.e(workflows, "workflows");
            kotlin.jvm.internal.m.e(offeringToWorkflowId, "offeringToWorkflowId");
            this.workflows = workflows;
            this.offeringToWorkflowId = offeringToWorkflowId;
        }

        public final java.util.Map<java.lang.String, java.lang.String> getOfferingToWorkflowId() {
            return this.offeringToWorkflowId;
        }

        public final java.util.Map<java.lang.String, p070h6.h> getWorkflows() {
            return this.workflows;
        }
    }

    @kotlin.Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\b\u0082\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001d\u0010\u0007\u001a\u0004\u0018\u00010\u0005*\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u0005H\u0002¢\u0006\u0004\b\u0007\u0010\bR\u0014\u0010\t\u001a\u00020\u00058\u0002X\u0082T¢\u0006\u0006\n\u0004\b\t\u0010\n¨\u0006\u000b"}, d2 = {"Lcom/revenuecat/purchases/common/workflows/WorkflowsConfigProvider$Companion;", "", "<init>", "()V", "Lkotlinx/serialization/json/c;", "", com.revenuecat.purchases.subscriberattributes.SubscriberAttributeKt.JSON_NAME_KEY, "stringOrNull", "(Lkotlinx/serialization/json/c;Ljava/lang/String;)Ljava/lang/String;", "KEY_OFFERING_IDENTIFIER", "Ljava/lang/String;", "purchases_defaultsRelease"}, k = 1, mv = {1, 8, 0}, xi = androidx.media3.container.NalUnitUtil.H265_NAL_UNIT_TYPE_UNSPECIFIED)
    public static final class Companion {
        public /* synthetic */ Companion(kotlin.jvm.internal.AbstractC2541f abstractC2541f) {
            this();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final java.lang.String stringOrNull(kotlinx.serialization.json.c cVar, java.lang.String str) {
            java.lang.Object obj = cVar.get(str);
            kotlinx.serialization.json.d dVar = obj instanceof kotlinx.serialization.json.d ? (kotlinx.serialization.json.d) obj : null;
            if (dVar != null) {
                if (!dVar.e()) {
                    dVar = null;
                }
                if (dVar != null) {
                    return dVar.d();
                }
            }
            return null;
        }

        private Companion() {
        }
    }

    /* JADX INFO: renamed from: com.revenuecat.purchases.common.workflows.WorkflowsConfigProvider$getWorkflow$1, reason: invalid class name and case insensitive filesystem */
    @kotlin.Metadata(k = 3, mv = {1, 8, 0}, xi = androidx.media3.container.NalUnitUtil.H265_NAL_UNIT_TYPE_UNSPECIFIED)
    @p117n6.e(c = "com.revenuecat.purchases.common.workflows.WorkflowsConfigProvider", f = "WorkflowsConfigProvider.kt", l = {153}, m = "getWorkflow")
    public static final class C20761 extends p117n6.c {
        int I$0;
        java.lang.Object L$0;
        java.lang.Object L$1;
        int label;
        /* synthetic */ java.lang.Object result;

        public C20761(p100l6.c cVar) {
            super(cVar);
        }

        @Override // p117n6.a
        public final java.lang.Object invokeSuspend(java.lang.Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return com.revenuecat.purchases.common.workflows.WorkflowsConfigProvider.this.getWorkflow(null, this);
        }
    }

    /* JADX INFO: renamed from: com.revenuecat.purchases.common.workflows.WorkflowsConfigProvider$onConfigCommitted$1, reason: invalid class name and case insensitive filesystem */
    @kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"LS7/A;", "Lh6/A;", "<anonymous>", "(LS7/A;)V"}, k = 3, mv = {1, 8, 0})
    @p117n6.e(c = "com.revenuecat.purchases.common.workflows.WorkflowsConfigProvider$onConfigCommitted$1", f = "WorkflowsConfigProvider.kt", l = {org.videolan.libvlc.MediaPlayer.Event.ESSelected}, m = "invokeSuspend")
    public static final class C20771 extends p117n6.i implements p194x6.m {
        final /* synthetic */ int $generation;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C20771(int i3, p100l6.c cVar) {
            super(2, cVar);
            this.$generation = i3;
        }

        @Override // p117n6.a
        public final p100l6.c create(java.lang.Object obj, p100l6.c cVar) {
            return com.revenuecat.purchases.common.workflows.WorkflowsConfigProvider.this.new C20771(this.$generation, cVar);
        }

        @Override // p194x6.m
        public final java.lang.Object invoke(S7.A a2, p100l6.c cVar) {
            return ((com.revenuecat.purchases.common.workflows.WorkflowsConfigProvider.C20771) create(a2, cVar)).invokeSuspend(p070h6.A.f22523a);
        }

        @Override // p117n6.a
        public final java.lang.Object invokeSuspend(java.lang.Object obj) {
            p109m6.a aVar = p109m6.a.f25430h;
            int i3 = this.label;
            if (i3 == 0) {
                com.google.common.util.concurrent.P.u0(obj);
                com.revenuecat.purchases.common.workflows.WorkflowsConfigProvider workflowsConfigProvider = com.revenuecat.purchases.common.workflows.WorkflowsConfigProvider.this;
                int i9 = this.$generation;
                this.label = 1;
                if (workflowsConfigProvider.warm(i9, this) == aVar) {
                    return aVar;
                }
            } else {
                if (i3 != 1) {
                    throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                com.google.common.util.concurrent.P.u0(obj);
            }
            return p070h6.A.f22523a;
        }
    }

    /* JADX INFO: renamed from: com.revenuecat.purchases.common.workflows.WorkflowsConfigProvider$resolveWorkflow$1, reason: invalid class name and case insensitive filesystem */
    @kotlin.Metadata(k = 3, mv = {1, 8, 0}, xi = androidx.media3.container.NalUnitUtil.H265_NAL_UNIT_TYPE_UNSPECIFIED)
    @p117n6.e(c = "com.revenuecat.purchases.common.workflows.WorkflowsConfigProvider", f = "WorkflowsConfigProvider.kt", l = {100}, m = "resolveWorkflow")
    public static final class C20781 extends p117n6.c {
        int I$0;
        java.lang.Object L$0;
        java.lang.Object L$1;
        int label;
        /* synthetic */ java.lang.Object result;

        public C20781(p100l6.c cVar) {
            super(cVar);
        }

        @Override // p117n6.a
        public final java.lang.Object invokeSuspend(java.lang.Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return com.revenuecat.purchases.common.workflows.WorkflowsConfigProvider.this.resolveWorkflow(null, this);
        }
    }

    /* JADX INFO: renamed from: com.revenuecat.purchases.common.workflows.WorkflowsConfigProvider$resolveWorkflowBody$1, reason: invalid class name and case insensitive filesystem */
    @kotlin.Metadata(k = 3, mv = {1, 8, 0}, xi = androidx.media3.container.NalUnitUtil.H265_NAL_UNIT_TYPE_UNSPECIFIED)
    @p117n6.e(c = "com.revenuecat.purchases.common.workflows.WorkflowsConfigProvider", f = "WorkflowsConfigProvider.kt", l = {165}, m = "resolveWorkflowBody")
    public static final class C20791 extends p117n6.c {
        java.lang.Object L$0;
        java.lang.Object L$1;
        int label;
        /* synthetic */ java.lang.Object result;

        public C20791(p100l6.c cVar) {
            super(cVar);
        }

        @Override // p117n6.a
        public final java.lang.Object invokeSuspend(java.lang.Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return com.revenuecat.purchases.common.workflows.WorkflowsConfigProvider.this.resolveWorkflowBody(null, this);
        }
    }

    /* JADX INFO: renamed from: com.revenuecat.purchases.common.workflows.WorkflowsConfigProvider$resolveWorkflowBytes$1, reason: invalid class name and case insensitive filesystem */
    @kotlin.Metadata(k = 3, mv = {1, 8, 0}, xi = androidx.media3.container.NalUnitUtil.H265_NAL_UNIT_TYPE_UNSPECIFIED)
    @p117n6.e(c = "com.revenuecat.purchases.common.workflows.WorkflowsConfigProvider", f = "WorkflowsConfigProvider.kt", l = {171}, m = "resolveWorkflowBytes")
    public static final class C20801 extends p117n6.c {
        java.lang.Object L$0;
        java.lang.Object L$1;
        int label;
        /* synthetic */ java.lang.Object result;

        public C20801(p100l6.c cVar) {
            super(cVar);
        }

        @Override // p117n6.a
        public final java.lang.Object invokeSuspend(java.lang.Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return com.revenuecat.purchases.common.workflows.WorkflowsConfigProvider.this.resolveWorkflowBytes(null, this);
        }
    }

    /* JADX INFO: renamed from: com.revenuecat.purchases.common.workflows.WorkflowsConfigProvider$resolveWorkflowBytes$2, reason: invalid class name */
    @kotlin.Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0012\n\u0002\b\u0002\u0010\u0000\u001a\u0004\u0018\u00010\u00012\u0006\u0010\u0002\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0003"}, d2 = {"<anonymous>", "", "it", "invoke"}, k = 3, mv = {1, 8, 0}, xi = androidx.media3.container.NalUnitUtil.H265_NAL_UNIT_TYPE_UNSPECIFIED)
    public static final class AnonymousClass2 extends kotlin.jvm.internal.o implements p194x6.j {
        public static final com.revenuecat.purchases.common.workflows.WorkflowsConfigProvider.AnonymousClass2 INSTANCE = new com.revenuecat.purchases.common.workflows.WorkflowsConfigProvider.AnonymousClass2();

        public AnonymousClass2() {
            super(1);
        }

        @Override // p194x6.j
        public final byte[] invoke(byte[] it) {
            kotlin.jvm.internal.m.e(it, "it");
            return it;
        }
    }

    /* JADX INFO: renamed from: com.revenuecat.purchases.common.workflows.WorkflowsConfigProvider$warm$1, reason: invalid class name and case insensitive filesystem */
    @kotlin.Metadata(k = 3, mv = {1, 8, 0}, xi = androidx.media3.container.NalUnitUtil.H265_NAL_UNIT_TYPE_UNSPECIFIED)
    @p117n6.e(c = "com.revenuecat.purchases.common.workflows.WorkflowsConfigProvider", f = "WorkflowsConfigProvider.kt", l = {216, 231}, m = "warm")
    public static final class C20811 extends p117n6.c {
        int I$0;
        java.lang.Object L$0;
        java.lang.Object L$1;
        java.lang.Object L$2;
        int label;
        /* synthetic */ java.lang.Object result;

        public C20811(p100l6.c cVar) {
            super(cVar);
        }

        @Override // p117n6.a
        public final java.lang.Object invokeSuspend(java.lang.Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return com.revenuecat.purchases.common.workflows.WorkflowsConfigProvider.this.warm(0, this);
        }
    }

    /* JADX INFO: renamed from: com.revenuecat.purchases.common.workflows.WorkflowsConfigProvider$warm$5, reason: invalid class name */
    @kotlin.Metadata(k = 3, mv = {1, 8, 0}, xi = androidx.media3.container.NalUnitUtil.H265_NAL_UNIT_TYPE_UNSPECIFIED)
    @p117n6.e(c = "com.revenuecat.purchases.common.workflows.WorkflowsConfigProvider", f = "WorkflowsConfigProvider.kt", l = {org.videolan.libvlc.MediaPlayer.Event.PositionChanged, org.videolan.libvlc.MediaPlayer.Event.SeekableChanged}, m = "warm")
    public static final class AnonymousClass5 extends p117n6.c {
        java.lang.Object L$0;
        int label;
        /* synthetic */ java.lang.Object result;

        public AnonymousClass5(p100l6.c cVar) {
            super(cVar);
        }

        @Override // p117n6.a
        public final java.lang.Object invokeSuspend(java.lang.Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return com.revenuecat.purchases.common.workflows.WorkflowsConfigProvider.this.warm(this);
        }
    }

    /* JADX INFO: renamed from: com.revenuecat.purchases.common.workflows.WorkflowsConfigProvider$warmAsync$1, reason: invalid class name and case insensitive filesystem */
    @kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"LS7/A;", "Lh6/A;", "<anonymous>", "(LS7/A;)V"}, k = 3, mv = {1, 8, 0})
    @p117n6.e(c = "com.revenuecat.purchases.common.workflows.WorkflowsConfigProvider$warmAsync$1", f = "WorkflowsConfigProvider.kt", l = {org.videolan.libvlc.MediaPlayer.Event.Vout}, m = "invokeSuspend")
    public static final class C20821 extends p117n6.i implements p194x6.m {
        final /* synthetic */ int $generation;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C20821(int i3, p100l6.c cVar) {
            super(2, cVar);
            this.$generation = i3;
        }

        @Override // p117n6.a
        public final p100l6.c create(java.lang.Object obj, p100l6.c cVar) {
            return com.revenuecat.purchases.common.workflows.WorkflowsConfigProvider.this.new C20821(this.$generation, cVar);
        }

        @Override // p194x6.m
        public final java.lang.Object invoke(S7.A a2, p100l6.c cVar) {
            return ((com.revenuecat.purchases.common.workflows.WorkflowsConfigProvider.C20821) create(a2, cVar)).invokeSuspend(p070h6.A.f22523a);
        }

        @Override // p117n6.a
        public final java.lang.Object invokeSuspend(java.lang.Object obj) {
            p109m6.a aVar = p109m6.a.f25430h;
            int i3 = this.label;
            if (i3 == 0) {
                com.google.common.util.concurrent.P.u0(obj);
                com.revenuecat.purchases.common.workflows.WorkflowsConfigProvider workflowsConfigProvider = com.revenuecat.purchases.common.workflows.WorkflowsConfigProvider.this;
                int i9 = this.$generation;
                this.label = 1;
                if (workflowsConfigProvider.warm(i9, this) == aVar) {
                    return aVar;
                }
            } else {
                if (i3 != 1) {
                    throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                com.google.common.util.concurrent.P.u0(obj);
            }
            return p070h6.A.f22523a;
        }
    }

    /* JADX INFO: renamed from: com.revenuecat.purchases.common.workflows.WorkflowsConfigProvider$workflowIdForOfferingId$1, reason: invalid class name and case insensitive filesystem */
    @kotlin.Metadata(k = 3, mv = {1, 8, 0}, xi = androidx.media3.container.NalUnitUtil.H265_NAL_UNIT_TYPE_UNSPECIFIED)
    @p117n6.e(c = "com.revenuecat.purchases.common.workflows.WorkflowsConfigProvider", f = "WorkflowsConfigProvider.kt", l = {142}, m = "workflowIdForOfferingId")
    public static final class C20831 extends p117n6.c {
        int label;
        /* synthetic */ java.lang.Object result;

        public C20831(p100l6.c cVar) {
            super(cVar);
        }

        @Override // p117n6.a
        public final java.lang.Object invokeSuspend(java.lang.Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return com.revenuecat.purchases.common.workflows.WorkflowsConfigProvider.this.workflowIdForOfferingId(null, this);
        }
    }

    public WorkflowsConfigProvider(com.revenuecat.purchases.common.remoteconfig.RemoteConfigManager manager, kotlin.jvm.functions.Function0 currentOfferingIdProvider, p194x6.n nVar, S7.A scope) {
        kotlin.jvm.internal.m.e(manager, "manager");
        kotlin.jvm.internal.m.e(currentOfferingIdProvider, "currentOfferingIdProvider");
        kotlin.jvm.internal.m.e(scope, "scope");
        this.manager = manager;
        this.currentOfferingIdProvider = currentOfferingIdProvider;
        this.onCurrentWorkflowLoaded = nVar;
        this.scope = scope;
        this.cache = new com.revenuecat.purchases.common.remoteconfig.GenerationGuardedCache<>();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final com.revenuecat.purchases.common.workflows.PublishedWorkflow decodeWorkflow(java.lang.String workflowId, byte[] body) {
        try {
            com.revenuecat.purchases.common.workflows.PublishedWorkflow publishedWorkflow = com.revenuecat.purchases.common.workflows.WorkflowJsonParser.INSTANCE.parsePublishedWorkflow(O7.x.n0(body));
            com.revenuecat.purchases.LogLevel logLevel = com.revenuecat.purchases.LogLevel.DEBUG;
            com.revenuecat.purchases.LogHandler currentLogHandler = com.revenuecat.purchases.common.LogWrapperKt.getCurrentLogHandler();
            if (com.revenuecat.purchases.common.Config.INSTANCE.getLogLevel().compareTo(logLevel) > 0) {
                return publishedWorkflow;
            }
            currentLogHandler.d("[Purchases] - " + logLevel.name(), "Parsed workflow '" + workflowId + "' (" + publishedWorkflow.getSteps().size() + " step(s))");
            return publishedWorkflow;
        } catch (java.lang.Exception e6) {
            com.revenuecat.purchases.common.LogWrapperKt.getCurrentLogHandler().e("[Purchases] - ERROR", Y6.f.h("Failed to parse workflow '", workflowId, "' body."), e6);
            return null;
        }
    }

    private final boolean isWarmAtOrAbove(int generation) {
        return this.cache.isAtOrAbove(generation) && isWarmForCurrentOffering();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final java.lang.Object resolveWorkflowBody(java.lang.String str, p100l6.c cVar) {
        com.revenuecat.purchases.common.workflows.WorkflowsConfigProvider.C20791 c20791;
        com.revenuecat.purchases.common.workflows.WorkflowsConfigProvider workflowsConfigProvider;
        if (cVar instanceof com.revenuecat.purchases.common.workflows.WorkflowsConfigProvider.C20791) {
            c20791 = (com.revenuecat.purchases.common.workflows.WorkflowsConfigProvider.C20791) cVar;
            int i3 = c20791.label;
            if ((i3 & Integer.MIN_VALUE) != 0) {
                c20791.label = i3 - Integer.MIN_VALUE;
            } else {
                c20791 = new com.revenuecat.purchases.common.workflows.WorkflowsConfigProvider.C20791(cVar);
            }
        } else {
            c20791 = new com.revenuecat.purchases.common.workflows.WorkflowsConfigProvider.C20791(cVar);
        }
        java.lang.Object objResolveWorkflowBytes = c20791.result;
        p109m6.a aVar = p109m6.a.f25430h;
        int i9 = c20791.label;
        if (i9 == 0) {
            com.google.common.util.concurrent.P.u0(objResolveWorkflowBytes);
            c20791.L$0 = this;
            c20791.L$1 = str;
            c20791.label = 1;
            objResolveWorkflowBytes = resolveWorkflowBytes(str, c20791);
            if (objResolveWorkflowBytes == aVar) {
                return aVar;
            }
            workflowsConfigProvider = this;
        } else {
            if (i9 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            str = (java.lang.String) c20791.L$1;
            workflowsConfigProvider = (com.revenuecat.purchases.common.workflows.WorkflowsConfigProvider) c20791.L$0;
            com.google.common.util.concurrent.P.u0(objResolveWorkflowBytes);
        }
        byte[] bArr = (byte[]) objResolveWorkflowBytes;
        if (bArr == null) {
            return null;
        }
        return workflowsConfigProvider.decodeWorkflow(str, bArr);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final java.lang.Object resolveWorkflowBytes(java.lang.String str, p100l6.c cVar) {
        com.revenuecat.purchases.common.workflows.WorkflowsConfigProvider.C20801 c20801;
        if (cVar instanceof com.revenuecat.purchases.common.workflows.WorkflowsConfigProvider.C20801) {
            c20801 = (com.revenuecat.purchases.common.workflows.WorkflowsConfigProvider.C20801) cVar;
            int i3 = c20801.label;
            if ((i3 & Integer.MIN_VALUE) != 0) {
                c20801.label = i3 - Integer.MIN_VALUE;
            } else {
                c20801 = new com.revenuecat.purchases.common.workflows.WorkflowsConfigProvider.C20801(cVar);
            }
        } else {
            c20801 = new com.revenuecat.purchases.common.workflows.WorkflowsConfigProvider.C20801(cVar);
        }
        java.lang.Object objBlobData = c20801.result;
        p109m6.a aVar = p109m6.a.f25430h;
        int i9 = c20801.label;
        if (i9 == 0) {
            com.google.common.util.concurrent.P.u0(objBlobData);
            com.revenuecat.purchases.common.remoteconfig.RemoteConfigManager remoteConfigManager = this.manager;
            com.revenuecat.purchases.common.remoteconfig.RemoteConfigTopic remoteConfigTopic = com.revenuecat.purchases.common.remoteconfig.RemoteConfigTopic.Workflows;
            com.revenuecat.purchases.common.workflows.WorkflowsConfigProvider.AnonymousClass2 anonymousClass2 = com.revenuecat.purchases.common.workflows.WorkflowsConfigProvider.AnonymousClass2.INSTANCE;
            c20801.L$0 = this;
            c20801.L$1 = str;
            c20801.label = 1;
            objBlobData = remoteConfigManager.blobData(remoteConfigTopic, str, anonymousClass2, c20801);
            if (objBlobData == aVar) {
                return aVar;
            }
        } else {
            if (i9 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            str = (java.lang.String) c20801.L$1;
            com.google.common.util.concurrent.P.u0(objBlobData);
        }
        byte[] bArr = (byte[]) objBlobData;
        if (bArr != null) {
            return bArr;
        }
        com.revenuecat.purchases.common.LogWrapperKt.getCurrentLogHandler().e("[Purchases] - ERROR", Y6.f.h("Workflow '", str, "' is unavailable from remote config."), null);
        return null;
    }

    public final java.lang.Object awaitReady(p100l6.c cVar) {
        java.lang.Object objAwaitTopicAndPrefetchBlobsReady = this.manager.awaitTopicAndPrefetchBlobsReady(com.revenuecat.purchases.common.remoteconfig.RemoteConfigTopic.Workflows, cVar);
        return objAwaitTopicAndPrefetchBlobsReady == p109m6.a.f25430h ? objAwaitTopicAndPrefetchBlobsReady : p070h6.A.f22523a;
    }

    public final void close() {
        S7.C.i(this.scope, null);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final java.lang.Object getWorkflow(java.lang.String str, p100l6.c cVar) {
        com.revenuecat.purchases.common.workflows.WorkflowsConfigProvider.C20761 c20761;
        java.lang.String str2;
        int i3;
        com.revenuecat.purchases.common.workflows.WorkflowsConfigProvider workflowsConfigProvider;
        java.util.Map<java.lang.String, p070h6.h> workflows;
        p070h6.h hVar;
        java.util.Map<java.lang.String, p070h6.h> workflows2;
        p070h6.h hVar2;
        if (cVar instanceof com.revenuecat.purchases.common.workflows.WorkflowsConfigProvider.C20761) {
            c20761 = (com.revenuecat.purchases.common.workflows.WorkflowsConfigProvider.C20761) cVar;
            int i9 = c20761.label;
            if ((i9 & Integer.MIN_VALUE) != 0) {
                c20761.label = i9 - Integer.MIN_VALUE;
            } else {
                c20761 = new com.revenuecat.purchases.common.workflows.WorkflowsConfigProvider.C20761(cVar);
            }
        } else {
            c20761 = new com.revenuecat.purchases.common.workflows.WorkflowsConfigProvider.C20761(cVar);
        }
        java.lang.Object obj = c20761.result;
        p109m6.a aVar = p109m6.a.f25430h;
        int i10 = c20761.label;
        if (i10 == 0) {
            com.google.common.util.concurrent.P.u0(obj);
            com.revenuecat.purchases.common.workflows.WorkflowsConfigProvider.Cached cached = this.cache.getCached();
            if (cached != null && (workflows = cached.getWorkflows()) != null && (hVar = workflows.get(str)) != null) {
                return hVar.getValue();
            }
            int configGeneration = this.manager.getConfigGeneration();
            c20761.L$0 = this;
            c20761.L$1 = str;
            c20761.I$0 = configGeneration;
            c20761.label = 1;
            java.lang.Object objResolveWorkflowBody = resolveWorkflowBody(str, c20761);
            if (objResolveWorkflowBody == aVar) {
                return aVar;
            }
            str2 = str;
            i3 = configGeneration;
            obj = objResolveWorkflowBody;
            workflowsConfigProvider = this;
        } else {
            if (i10 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            i3 = c20761.I$0;
            str2 = (java.lang.String) c20761.L$1;
            workflowsConfigProvider = (com.revenuecat.purchases.common.workflows.WorkflowsConfigProvider) c20761.L$0;
            com.google.common.util.concurrent.P.u0(obj);
        }
        com.revenuecat.purchases.common.workflows.PublishedWorkflow publishedWorkflow = (com.revenuecat.purchases.common.workflows.PublishedWorkflow) obj;
        if (publishedWorkflow == null) {
            return null;
        }
        if (workflowsConfigProvider.cache.isCurrent(i3)) {
            return publishedWorkflow;
        }
        com.revenuecat.purchases.common.workflows.WorkflowsConfigProvider.Cached cached2 = workflowsConfigProvider.cache.getCached();
        if (cached2 == null || (workflows2 = cached2.getWorkflows()) == null || (hVar2 = workflows2.get(str2)) == null) {
            return null;
        }
        return (com.revenuecat.purchases.common.workflows.PublishedWorkflow) hVar2.getValue();
    }

    public final boolean isWarmForCurrentOffering() {
        com.revenuecat.purchases.common.workflows.WorkflowsConfigProvider.Cached cached = this.cache.getCached();
        if (cached == null) {
            return false;
        }
        java.lang.String str = (java.lang.String) this.currentOfferingIdProvider.invoke();
        java.lang.String str2 = str != null ? cached.getOfferingToWorkflowId().get(str) : null;
        return str2 == null || cached.getWorkflows().containsKey(str2);
    }

    @Override // com.revenuecat.purchases.common.remoteconfig.RemoteConfigCommitListener
    public void onConfigCommitted(int generation) {
        S7.C.A(this.scope, null, new com.revenuecat.purchases.common.workflows.WorkflowsConfigProvider.C20771(generation, null), 3);
    }

    @Override // com.revenuecat.purchases.common.remoteconfig.RemoteConfigCommitListener
    public void onConfigInvalidated(int generation) {
        this.cache.invalidate(generation);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final java.lang.Object resolveWorkflow(java.lang.String str, p100l6.c cVar) {
        com.revenuecat.purchases.common.workflows.WorkflowsConfigProvider.C20781 c20781;
        int configGeneration;
        java.lang.Object obj;
        com.revenuecat.purchases.common.workflows.WorkflowsConfigProvider workflowsConfigProvider;
        java.util.Map<java.lang.String, java.lang.String> offeringToWorkflowId;
        if (cVar instanceof com.revenuecat.purchases.common.workflows.WorkflowsConfigProvider.C20781) {
            c20781 = (com.revenuecat.purchases.common.workflows.WorkflowsConfigProvider.C20781) cVar;
            int i3 = c20781.label;
            if ((i3 & Integer.MIN_VALUE) != 0) {
                c20781.label = i3 - Integer.MIN_VALUE;
            } else {
                c20781 = new com.revenuecat.purchases.common.workflows.WorkflowsConfigProvider.C20781(cVar);
            }
        } else {
            c20781 = new com.revenuecat.purchases.common.workflows.WorkflowsConfigProvider.C20781(cVar);
        }
        java.lang.Object obj2 = c20781.result;
        p109m6.a aVar = p109m6.a.f25430h;
        int i9 = c20781.label;
        if (i9 == 0) {
            com.google.common.util.concurrent.P.u0(obj2);
            if (this.manager.getDisabled()) {
                return com.revenuecat.purchases.common.workflows.WorkflowResolution.Disabled.INSTANCE;
            }
            com.revenuecat.purchases.common.workflows.WorkflowsConfigProvider.Cached cached = this.cache.getCached();
            if (cached != null) {
                java.lang.String str2 = cached.getOfferingToWorkflowId().get(str);
                return str2 != null ? new com.revenuecat.purchases.common.workflows.WorkflowResolution.Found(str2) : com.revenuecat.purchases.common.workflows.WorkflowResolution.NoWorkflow.INSTANCE;
            }
            configGeneration = this.manager.getConfigGeneration();
            com.revenuecat.purchases.common.remoteconfig.RemoteConfigManager remoteConfigManager = this.manager;
            com.revenuecat.purchases.common.remoteconfig.RemoteConfigTopic remoteConfigTopic = com.revenuecat.purchases.common.remoteconfig.RemoteConfigTopic.Workflows;
            c20781.L$0 = this;
            c20781.L$1 = str;
            c20781.I$0 = configGeneration;
            c20781.label = 1;
            obj = remoteConfigManager.topic(remoteConfigTopic, c20781);
            if (obj == aVar) {
                return aVar;
            }
            workflowsConfigProvider = this;
        } else {
            if (i9 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            int i10 = c20781.I$0;
            java.lang.String str3 = (java.lang.String) c20781.L$1;
            com.revenuecat.purchases.common.workflows.WorkflowsConfigProvider workflowsConfigProvider2 = (com.revenuecat.purchases.common.workflows.WorkflowsConfigProvider) c20781.L$0;
            com.google.common.util.concurrent.P.u0(obj2);
            configGeneration = i10;
            str = str3;
            workflowsConfigProvider = workflowsConfigProvider2;
            obj = obj2;
        }
        com.revenuecat.purchases.common.remoteconfig.ConfigTopic configTopic = (com.revenuecat.purchases.common.remoteconfig.ConfigTopic) obj;
        com.revenuecat.purchases.LogLevel logLevel = com.revenuecat.purchases.LogLevel.VERBOSE;
        com.revenuecat.purchases.LogHandler currentLogHandler = com.revenuecat.purchases.common.LogWrapperKt.getCurrentLogHandler();
        com.revenuecat.purchases.common.Config config = com.revenuecat.purchases.common.Config.INSTANCE;
        if (config.getLogLevel().compareTo(logLevel) <= 0) {
            java.lang.String strM = com.google.android.gms.internal.play_billing.M0.m(logLevel, new java.lang.StringBuilder("[Purchases] - "));
            java.lang.StringBuilder sb = new java.lang.StringBuilder("workflows topic ");
            sb.append(configTopic == null ? "is absent" : "has " + configTopic.size() + " item(s)");
            currentLogHandler.v(strM, sb.toString());
        }
        if (configTopic == null) {
            if (workflowsConfigProvider.manager.getDisabled()) {
                com.revenuecat.purchases.LogHandler currentLogHandler2 = com.revenuecat.purchases.common.LogWrapperKt.getCurrentLogHandler();
                if (config.getLogLevel().compareTo(logLevel) <= 0) {
                    currentLogHandler2.v(com.google.android.gms.internal.play_billing.M0.m(logLevel, new java.lang.StringBuilder("[Purchases] - ")), "Workflows topic unavailable (remote config disabled) resolving offering '" + str + '\'');
                }
                return com.revenuecat.purchases.common.workflows.WorkflowResolution.Disabled.INSTANCE;
            }
            com.revenuecat.purchases.LogHandler currentLogHandler3 = com.revenuecat.purchases.common.LogWrapperKt.getCurrentLogHandler();
            if (config.getLogLevel().compareTo(logLevel) <= 0) {
                currentLogHandler3.v(com.google.android.gms.internal.play_billing.M0.m(logLevel, new java.lang.StringBuilder("[Purchases] - ")), "Workflows topic unavailable resolving offering '" + str + '\'');
            }
            return com.revenuecat.purchases.common.workflows.WorkflowResolution.Unavailable.INSTANCE;
        }
        java.util.Set<java.util.Map.Entry<java.lang.String, com.revenuecat.purchases.common.remoteconfig.RemoteConfiguration.ConfigItem>> setEntrySet = configTopic.entrySet();
        java.util.ArrayList arrayList = new java.util.ArrayList();
        for (java.lang.Object obj3 : setEntrySet) {
            if (kotlin.jvm.internal.m.a(Companion.stringOrNull(((com.revenuecat.purchases.common.remoteconfig.RemoteConfiguration.ConfigItem) ((java.util.Map.Entry) obj3).getValue()).getMetadata(), KEY_OFFERING_IDENTIFIER), str)) {
                arrayList.add(obj3);
            }
        }
        if (arrayList.size() > 1) {
            com.revenuecat.purchases.LogLevel logLevel2 = com.revenuecat.purchases.LogLevel.WARN;
            com.revenuecat.purchases.LogHandler currentLogHandler4 = com.revenuecat.purchases.common.LogWrapperKt.getCurrentLogHandler();
            if (com.revenuecat.purchases.common.Config.INSTANCE.getLogLevel().compareTo(logLevel2) <= 0) {
                java.lang.String strM2 = com.google.android.gms.internal.play_billing.M0.m(logLevel2, new java.lang.StringBuilder("[Purchases] - "));
                java.lang.StringBuilder sbQ = com.google.android.gms.internal.play_billing.M0.q("Duplicate offering_identifier '", str, "' in workflows topic: ");
                java.util.ArrayList arrayList2 = new java.util.ArrayList(p078i6.q.I0(arrayList, 10));
                java.util.Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    arrayList2.add((java.lang.String) ((java.util.Map.Entry) it.next()).getKey());
                }
                sbQ.append(arrayList2);
                currentLogHandler4.w(strM2, sbQ.toString());
            }
        }
        java.util.Map.Entry entry = (java.util.Map.Entry) p078i6.o.s1(arrayList);
        java.lang.String str4 = null;
        java.lang.String str5 = entry != null ? (java.lang.String) entry.getKey() : null;
        com.revenuecat.purchases.LogLevel logLevel3 = com.revenuecat.purchases.LogLevel.VERBOSE;
        com.revenuecat.purchases.LogHandler currentLogHandler5 = com.revenuecat.purchases.common.LogWrapperKt.getCurrentLogHandler();
        if (com.revenuecat.purchases.common.Config.INSTANCE.getLogLevel().compareTo(logLevel3) <= 0) {
            currentLogHandler5.v(com.google.android.gms.internal.play_billing.M0.m(logLevel3, new java.lang.StringBuilder("[Purchases] - ")), str5 != null ? "Resolved offering '" + str + "' to workflow '" + str5 + '\'' : B2.a.i('\'', "No workflow found for offering '", str));
        }
        if (workflowsConfigProvider.cache.isCurrent(configGeneration)) {
            str4 = str5;
        } else {
            com.revenuecat.purchases.common.workflows.WorkflowsConfigProvider.Cached cached2 = workflowsConfigProvider.cache.getCached();
            if (cached2 != null && (offeringToWorkflowId = cached2.getOfferingToWorkflowId()) != null) {
                str4 = offeringToWorkflowId.get(str);
            }
        }
        return str4 != null ? new com.revenuecat.purchases.common.workflows.WorkflowResolution.Found(str4) : com.revenuecat.purchases.common.workflows.WorkflowResolution.NoWorkflow.INSTANCE;
    }

    /* JADX WARN: Code duplicated, block: B:46:0x00fd  */
    /* JADX WARN: Code duplicated, block: B:48:0x010d  */
    /* JADX WARN: Code duplicated, block: B:49:0x011e  */
    /* JADX WARN: Code duplicated, block: B:54:0x013b  */
    /* JADX WARN: Code duplicated, block: B:62:0x0121 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:65:0x00f7 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    /* JADX WARN: Instruction removed from duplicated block: B:54:0x013b, please report this as an issue */
    public final java.lang.Object warm(int i3, p100l6.c cVar) {
        com.revenuecat.purchases.common.workflows.WorkflowsConfigProvider.C20811 c20811;
        com.revenuecat.purchases.common.workflows.WorkflowsConfigProvider workflowsConfigProvider;
        int i9;
        int i10;
        com.revenuecat.purchases.common.workflows.WorkflowsConfigProvider workflowsConfigProvider2;
        java.util.LinkedHashMap linkedHashMap;
        java.lang.String str;
        java.util.ArrayList arrayList;
        java.util.Map mapX0;
        com.revenuecat.purchases.LogLevel logLevel;
        com.revenuecat.purchases.LogHandler currentLogHandler;
        p194x6.n nVar;
        java.lang.String str2;
        java.lang.String str3;
        byte[] bArr;
        p070h6.k kVar;
        if (cVar instanceof com.revenuecat.purchases.common.workflows.WorkflowsConfigProvider.C20811) {
            c20811 = (com.revenuecat.purchases.common.workflows.WorkflowsConfigProvider.C20811) cVar;
            int i11 = c20811.label;
            if ((i11 & Integer.MIN_VALUE) != 0) {
                c20811.label = i11 - Integer.MIN_VALUE;
            } else {
                c20811 = new com.revenuecat.purchases.common.workflows.WorkflowsConfigProvider.C20811(cVar);
            }
        } else {
            c20811 = new com.revenuecat.purchases.common.workflows.WorkflowsConfigProvider.C20811(cVar);
        }
        java.lang.Object objCommittedTopicOrNull = c20811.result;
        p109m6.a aVar = p109m6.a.f25430h;
        int i12 = c20811.label;
        p070h6.A a2 = p070h6.A.f22523a;
        if (i12 == 0) {
            com.google.common.util.concurrent.P.u0(objCommittedTopicOrNull);
            if (!isWarmAtOrAbove(i3)) {
                com.revenuecat.purchases.common.remoteconfig.RemoteConfigManager remoteConfigManager = this.manager;
                com.revenuecat.purchases.common.remoteconfig.RemoteConfigTopic remoteConfigTopic = com.revenuecat.purchases.common.remoteconfig.RemoteConfigTopic.Workflows;
                c20811.L$0 = this;
                c20811.I$0 = i3;
                c20811.label = 1;
                objCommittedTopicOrNull = remoteConfigManager.committedTopicOrNull(remoteConfigTopic, c20811);
                if (objCommittedTopicOrNull != aVar) {
                    workflowsConfigProvider = this;
                    i9 = i3;
                }
                return aVar;
            }
            return a2;
        }
        if (i12 == 1) {
            i9 = c20811.I$0;
            workflowsConfigProvider = (com.revenuecat.purchases.common.workflows.WorkflowsConfigProvider) c20811.L$0;
            com.google.common.util.concurrent.P.u0(objCommittedTopicOrNull);
        } else {
            if (i12 != 2) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            i10 = c20811.I$0;
            str = (java.lang.String) c20811.L$2;
            linkedHashMap = (java.util.LinkedHashMap) c20811.L$1;
            workflowsConfigProvider2 = (com.revenuecat.purchases.common.workflows.WorkflowsConfigProvider) c20811.L$0;
            com.google.common.util.concurrent.P.u0(objCommittedTopicOrNull);
        }
        arrayList = new java.util.ArrayList();
        for (p070h6.k kVar2 : (java.lang.Iterable) objCommittedTopicOrNull) {
            str3 = (java.lang.String) kVar2.f22539h;
            bArr = (byte[]) kVar2.f22540i;
            if (bArr != null) {
                kVar = new p070h6.k(str3, com.google.common.util.concurrent.D.A(p070h6.i.f22536h, new com.revenuecat.purchases.common.workflows.WorkflowsConfigProvider$warm$workflows$2$1$1(workflowsConfigProvider2, str3, bArr)));
            } else {
                kVar = null;
            }
            if (kVar != null) {
                arrayList.add(kVar);
            }
        }
        mapX0 = p078i6.C.X0(arrayList);
        logLevel = com.revenuecat.purchases.LogLevel.VERBOSE;
        currentLogHandler = com.revenuecat.purchases.common.LogWrapperKt.getCurrentLogHandler();
        if (com.revenuecat.purchases.common.Config.INSTANCE.getLogLevel().compareTo(logLevel) <= 0) {
            currentLogHandler.v(com.google.android.gms.internal.play_billing.M0.m(logLevel, new java.lang.StringBuilder("[Purchases] - ")), "Warmed workflows cache: " + mapX0.size() + " eligible workflow(s), " + linkedHashMap.size() + " offering mapping(s).");
        }
        workflowsConfigProvider2.cache.store(i10, new com.revenuecat.purchases.common.workflows.WorkflowsConfigProvider.Cached(mapX0, linkedHashMap));
        nVar = workflowsConfigProvider2.onCurrentWorkflowLoaded;
        if (nVar != null && str != null && (str2 = (java.lang.String) linkedHashMap.get(str)) != null) {
            S7.C.A(workflowsConfigProvider2.scope, null, new com.revenuecat.purchases.common.workflows.WorkflowsConfigProvider$warm$4$2$1(nVar, str2, workflowsConfigProvider2, null), 3);
        }
        return a2;
        com.revenuecat.purchases.common.remoteconfig.ConfigTopic configTopic = (com.revenuecat.purchases.common.remoteconfig.ConfigTopic) objCommittedTopicOrNull;
        if (configTopic != null) {
            java.util.LinkedHashMap linkedHashMap2 = new java.util.LinkedHashMap();
            java.lang.String str4 = (java.lang.String) workflowsConfigProvider.currentOfferingIdProvider.invoke();
            java.util.ArrayList arrayList2 = new java.util.ArrayList();
            java.util.Iterator<T> it = configTopic.entrySet().iterator();
            while (it.hasNext()) {
                java.util.Map.Entry entry = (java.util.Map.Entry) it.next();
                java.lang.String str5 = (java.lang.String) entry.getKey();
                com.revenuecat.purchases.common.remoteconfig.RemoteConfiguration.ConfigItem configItem = (com.revenuecat.purchases.common.remoteconfig.RemoteConfiguration.ConfigItem) entry.getValue();
                java.lang.String strStringOrNull = Companion.stringOrNull(configItem.getMetadata(), KEY_OFFERING_IDENTIFIER);
                if (strStringOrNull != null) {
                    linkedHashMap2.put(strStringOrNull, str5);
                }
                if (configItem.getPrefetch() || (strStringOrNull != null && strStringOrNull.equals(str4))) {
                    arrayList2.add(str5);
                }
            }
            com.revenuecat.purchases.common.workflows.WorkflowsConfigProvider$warm$workflows$1 workflowsConfigProvider$warm$workflows$1 = new com.revenuecat.purchases.common.workflows.WorkflowsConfigProvider$warm$workflows$1(arrayList2, workflowsConfigProvider, null);
            c20811.L$0 = workflowsConfigProvider;
            c20811.L$1 = linkedHashMap2;
            c20811.L$2 = str4;
            c20811.I$0 = i9;
            c20811.label = 2;
            objCommittedTopicOrNull = S7.C.m(workflowsConfigProvider$warm$workflows$1, c20811);
            if (objCommittedTopicOrNull != aVar) {
                i10 = i9;
                workflowsConfigProvider2 = workflowsConfigProvider;
                linkedHashMap = linkedHashMap2;
                str = str4;
                arrayList = new java.util.ArrayList();
                while (r1.hasNext()) {
                    str3 = (java.lang.String) kVar2.f22539h;
                    bArr = (byte[]) kVar2.f22540i;
                    if (bArr != null) {
                        kVar = new p070h6.k(str3, com.google.common.util.concurrent.D.A(p070h6.i.f22536h, new com.revenuecat.purchases.common.workflows.WorkflowsConfigProvider$warm$workflows$2$1$1(workflowsConfigProvider2, str3, bArr)));
                    } else {
                        kVar = null;
                    }
                    if (kVar != null) {
                        arrayList.add(kVar);
                    }
                }
                mapX0 = p078i6.C.X0(arrayList);
                logLevel = com.revenuecat.purchases.LogLevel.VERBOSE;
                currentLogHandler = com.revenuecat.purchases.common.LogWrapperKt.getCurrentLogHandler();
                if (com.revenuecat.purchases.common.Config.INSTANCE.getLogLevel().compareTo(logLevel) <= 0) {
                    currentLogHandler.v(com.google.android.gms.internal.play_billing.M0.m(logLevel, new java.lang.StringBuilder("[Purchases] - ")), "Warmed workflows cache: " + mapX0.size() + " eligible workflow(s), " + linkedHashMap.size() + " offering mapping(s).");
                }
                workflowsConfigProvider2.cache.store(i10, new com.revenuecat.purchases.common.workflows.WorkflowsConfigProvider.Cached(mapX0, linkedHashMap));
                nVar = workflowsConfigProvider2.onCurrentWorkflowLoaded;
                if (nVar != null) {
                    S7.C.A(workflowsConfigProvider2.scope, null, new com.revenuecat.purchases.common.workflows.WorkflowsConfigProvider$warm$4$2$1(nVar, str2, workflowsConfigProvider2, null), 3);
                }
            }
            return aVar;
        }
        return a2;
    }

    public final void warmAsync(int generation) {
        S7.C.A(this.scope, null, new com.revenuecat.purchases.common.workflows.WorkflowsConfigProvider.C20821(generation, null), 3);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final java.lang.Object workflowIdForOfferingId(java.lang.String str, p100l6.c cVar) {
        com.revenuecat.purchases.common.workflows.WorkflowsConfigProvider.C20831 c20831;
        if (cVar instanceof com.revenuecat.purchases.common.workflows.WorkflowsConfigProvider.C20831) {
            c20831 = (com.revenuecat.purchases.common.workflows.WorkflowsConfigProvider.C20831) cVar;
            int i3 = c20831.label;
            if ((i3 & Integer.MIN_VALUE) != 0) {
                c20831.label = i3 - Integer.MIN_VALUE;
            } else {
                c20831 = new com.revenuecat.purchases.common.workflows.WorkflowsConfigProvider.C20831(cVar);
            }
        } else {
            c20831 = new com.revenuecat.purchases.common.workflows.WorkflowsConfigProvider.C20831(cVar);
        }
        java.lang.Object objResolveWorkflow = c20831.result;
        java.lang.Object obj = p109m6.a.f25430h;
        int i9 = c20831.label;
        if (i9 == 0) {
            com.google.common.util.concurrent.P.u0(objResolveWorkflow);
            c20831.label = 1;
            objResolveWorkflow = resolveWorkflow(str, c20831);
            if (objResolveWorkflow == obj) {
                return obj;
            }
        } else {
            if (i9 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            com.google.common.util.concurrent.P.u0(objResolveWorkflow);
        }
        com.revenuecat.purchases.common.workflows.WorkflowResolution.Found found = objResolveWorkflow instanceof com.revenuecat.purchases.common.workflows.WorkflowResolution.Found ? (com.revenuecat.purchases.common.workflows.WorkflowResolution.Found) objResolveWorkflow : null;
        if (found != null) {
            return found.getWorkflowId();
        }
        return null;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public WorkflowsConfigProvider(com.revenuecat.purchases.common.remoteconfig.RemoteConfigManager remoteConfigManager, kotlin.jvm.functions.Function0 function0, p194x6.n nVar, S7.A a2, int i3, kotlin.jvm.internal.AbstractC2541f abstractC2541f) {
        function0 = (i3 & 2) != 0 ? com.revenuecat.purchases.common.workflows.WorkflowsConfigProvider.AnonymousClass1.INSTANCE : function0;
        nVar = (i3 & 4) != 0 ? null : nVar;
        if ((i3 & 8) != 0) {
            S7.y0 y0VarE = S7.C.e();
            Z7.e eVar = S7.M.f9549a;
            a2 = S7.C.c(com.google.android.gms.internal.play_billing.AbstractC1833d1.H(y0VarE, Z7.d.f13044i));
        }
        this(remoteConfigManager, function0, nVar, a2);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x0058, code lost:
    
        if (r2.warm(r6, r0) == r1) goto L22;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object warm(p100l6.c cVar) {
        com.revenuecat.purchases.common.workflows.WorkflowsConfigProvider.AnonymousClass5 anonymousClass5;
        com.revenuecat.purchases.common.workflows.WorkflowsConfigProvider workflowsConfigProvider;
        if (cVar instanceof com.revenuecat.purchases.common.workflows.WorkflowsConfigProvider.AnonymousClass5) {
            anonymousClass5 = (com.revenuecat.purchases.common.workflows.WorkflowsConfigProvider.AnonymousClass5) cVar;
            int i3 = anonymousClass5.label;
            if ((i3 & Integer.MIN_VALUE) != 0) {
                anonymousClass5.label = i3 - Integer.MIN_VALUE;
            } else {
                anonymousClass5 = new com.revenuecat.purchases.common.workflows.WorkflowsConfigProvider.AnonymousClass5(cVar);
            }
        } else {
            anonymousClass5 = new com.revenuecat.purchases.common.workflows.WorkflowsConfigProvider.AnonymousClass5(cVar);
        }
        java.lang.Object obj = anonymousClass5.result;
        p109m6.a aVar = p109m6.a.f25430h;
        int i9 = anonymousClass5.label;
        if (i9 == 0) {
            com.google.common.util.concurrent.P.u0(obj);
            anonymousClass5.L$0 = this;
            anonymousClass5.label = 1;
            if (awaitReady(anonymousClass5) != aVar) {
                workflowsConfigProvider = this;
            }
            return aVar;
        }
        if (i9 == 1) {
            workflowsConfigProvider = (com.revenuecat.purchases.common.workflows.WorkflowsConfigProvider) anonymousClass5.L$0;
            com.google.common.util.concurrent.P.u0(obj);
        } else {
            if (i9 != 2) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            com.google.common.util.concurrent.P.u0(obj);
        }
        return p070h6.A.f22523a;
        int configGeneration = workflowsConfigProvider.manager.getConfigGeneration();
        anonymousClass5.L$0 = null;
        anonymousClass5.label = 2;
    }
}
