package com.revenuecat.purchases.common.workflows;

/* JADX INFO: loaded from: classes4.dex */
@kotlin.Metadata(d1 = {"\u0000^\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\u00020\u0001B)\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\b\b\u0002\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000f\u001a\u0004\u0018\u00010\u000e2\u0006\u0010\r\u001a\u00020\fH\u0082@¢\u0006\u0004\b\u000f\u0010\u0010J6\u0010\u0016\u001a\u00020\u00142\u0006\u0010\u0011\u001a\u00020\f2\u001c\u0010\u0015\u001a\u0018\b\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00140\u0013\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u0012H\u0082@¢\u0006\u0004\b\u0016\u0010\u0017J\r\u0010\u0018\u001a\u00020\u0014¢\u0006\u0004\b\u0018\u0010\u0019J\u0018\u0010\u001c\u001a\u00020\u001b2\u0006\u0010\u001a\u001a\u00020\fH\u0086@¢\u0006\u0004\b\u001c\u0010\u0010J\u0018\u0010\u001f\u001a\u00020\u001e2\u0006\u0010\u001d\u001a\u00020\fH\u0086@¢\u0006\u0004\b\u001f\u0010\u0010J\u001b\u0010\"\u001a\u00020\u00142\f\u0010!\u001a\b\u0012\u0004\u0012\u00020\u00140 ¢\u0006\u0004\b\"\u0010#R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010$R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010%R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010&R\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010'R\u0014\u0010(\u001a\u00020\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b(\u0010)R\u001e\u0010+\u001a\n\u0012\u0004\u0012\u00020\u0014\u0018\u00010*8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b+\u0010,¨\u0006-"}, d2 = {"Lcom/revenuecat/purchases/common/workflows/WorkflowManager;", "", "Lcom/revenuecat/purchases/common/workflows/WorkflowsConfigProvider;", "workflowsConfigProvider", "Lcom/revenuecat/purchases/common/uiconfig/UiConfigProvider;", "uiConfigProvider", "Lcom/revenuecat/purchases/common/workflows/WorkflowAssetPrewarmer;", "workflowAssetPrewarmer", "LS7/A;", "scope", "<init>", "(Lcom/revenuecat/purchases/common/workflows/WorkflowsConfigProvider;Lcom/revenuecat/purchases/common/uiconfig/UiConfigProvider;Lcom/revenuecat/purchases/common/workflows/WorkflowAssetPrewarmer;LS7/A;)V", "", "workflowId", "Lcom/revenuecat/purchases/UiConfig;", "loadUiConfig", "(Ljava/lang/String;Ll6/c;)Ljava/lang/Object;", "what", "Lkotlin/Function1;", "Ll6/c;", "Lh6/A;", "block", "awaitBestEffort", "(Ljava/lang/String;Lx6/j;Ll6/c;)Ljava/lang/Object;", "close", "()V", "workflowOrOfferingId", "Lcom/revenuecat/purchases/common/workflows/PublishedWorkflow;", "getWorkflow", "offeringId", "Lcom/revenuecat/purchases/common/workflows/WorkflowResolution;", "resolveWorkflow", "Lkotlin/Function0;", "onComplete", "onPaywallConfigReady", "(Lkotlin/jvm/functions/Function0;)V", "Lcom/revenuecat/purchases/common/workflows/WorkflowsConfigProvider;", "Lcom/revenuecat/purchases/common/uiconfig/UiConfigProvider;", "Lcom/revenuecat/purchases/common/workflows/WorkflowAssetPrewarmer;", "LS7/A;", "readinessLock", "Ljava/lang/Object;", "LS7/F;", "inFlightReadiness", "LS7/F;", "purchases_defaultsRelease"}, k = 1, mv = {1, 8, 0}, xi = androidx.media3.container.NalUnitUtil.H265_NAL_UNIT_TYPE_UNSPECIFIED)
public final class WorkflowManager {
    private volatile S7.F inFlightReadiness;
    private final java.lang.Object readinessLock;
    private final S7.A scope;
    private final com.revenuecat.purchases.common.uiconfig.UiConfigProvider uiConfigProvider;
    private final com.revenuecat.purchases.common.workflows.WorkflowAssetPrewarmer workflowAssetPrewarmer;
    private final com.revenuecat.purchases.common.workflows.WorkflowsConfigProvider workflowsConfigProvider;

    /* JADX INFO: renamed from: com.revenuecat.purchases.common.workflows.WorkflowManager$awaitBestEffort$1, reason: invalid class name */
    @kotlin.Metadata(k = 3, mv = {1, 8, 0}, xi = androidx.media3.container.NalUnitUtil.H265_NAL_UNIT_TYPE_UNSPECIFIED)
    @p117n6.e(c = "com.revenuecat.purchases.common.workflows.WorkflowManager", f = "WorkflowManager.kt", l = {165}, m = "awaitBestEffort")
    public static final class AnonymousClass1 extends p117n6.c {
        java.lang.Object L$0;
        int label;
        /* synthetic */ java.lang.Object result;

        public AnonymousClass1(p100l6.c cVar) {
            super(cVar);
        }

        @Override // p117n6.a
        public final java.lang.Object invokeSuspend(java.lang.Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return com.revenuecat.purchases.common.workflows.WorkflowManager.this.awaitBestEffort(null, null, this);
        }
    }

    /* JADX INFO: renamed from: com.revenuecat.purchases.common.workflows.WorkflowManager$getWorkflow$1, reason: invalid class name and case insensitive filesystem */
    @kotlin.Metadata(k = 3, mv = {1, 8, 0}, xi = androidx.media3.container.NalUnitUtil.H265_NAL_UNIT_TYPE_UNSPECIFIED)
    @p117n6.e(c = "com.revenuecat.purchases.common.workflows.WorkflowManager", f = "WorkflowManager.kt", l = {64, 66, 73}, m = "getWorkflow")
    public static final class C20731 extends p117n6.c {
        java.lang.Object L$0;
        java.lang.Object L$1;
        java.lang.Object L$2;
        int label;
        /* synthetic */ java.lang.Object result;

        public C20731(p100l6.c cVar) {
            super(cVar);
        }

        @Override // p117n6.a
        public final java.lang.Object invokeSuspend(java.lang.Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return com.revenuecat.purchases.common.workflows.WorkflowManager.this.getWorkflow(null, this);
        }
    }

    /* JADX INFO: renamed from: com.revenuecat.purchases.common.workflows.WorkflowManager$getWorkflow$2, reason: invalid class name */
    @kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"LS7/A;", "Lh6/A;", "<anonymous>", "(LS7/A;)V"}, k = 3, mv = {1, 8, 0})
    @p117n6.e(c = "com.revenuecat.purchases.common.workflows.WorkflowManager$getWorkflow$2", f = "WorkflowManager.kt", l = {}, m = "invokeSuspend")
    public static final class AnonymousClass2 extends p117n6.i implements p194x6.m {
        final /* synthetic */ com.revenuecat.purchases.UiConfig $uiConfig;
        final /* synthetic */ com.revenuecat.purchases.common.workflows.PublishedWorkflow $workflow;
        private /* synthetic */ java.lang.Object L$0;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass2(com.revenuecat.purchases.common.workflows.PublishedWorkflow publishedWorkflow, com.revenuecat.purchases.UiConfig uiConfig, p100l6.c cVar) {
            super(2, cVar);
            this.$workflow = publishedWorkflow;
            this.$uiConfig = uiConfig;
        }

        @Override // p117n6.a
        public final p100l6.c create(java.lang.Object obj, p100l6.c cVar) {
            com.revenuecat.purchases.common.workflows.WorkflowManager.AnonymousClass2 anonymousClass2 = com.revenuecat.purchases.common.workflows.WorkflowManager.this.new AnonymousClass2(this.$workflow, this.$uiConfig, cVar);
            anonymousClass2.L$0 = obj;
            return anonymousClass2;
        }

        @Override // p194x6.m
        public final java.lang.Object invoke(S7.A a2, p100l6.c cVar) {
            return ((com.revenuecat.purchases.common.workflows.WorkflowManager.AnonymousClass2) create(a2, cVar)).invokeSuspend(p070h6.A.f22523a);
        }

        @Override // p117n6.a
        public final java.lang.Object invokeSuspend(java.lang.Object obj) {
            java.lang.Object objT;
            p070h6.A a2 = p070h6.A.f22523a;
            p109m6.a aVar = p109m6.a.f25430h;
            if (this.label != 0) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            com.google.common.util.concurrent.P.u0(obj);
            com.revenuecat.purchases.common.workflows.WorkflowManager workflowManager = com.revenuecat.purchases.common.workflows.WorkflowManager.this;
            try {
                workflowManager.workflowAssetPrewarmer.preDownloadWorkflowAssets(this.$workflow, this.$uiConfig);
                objT = a2;
            } catch (java.lang.Throwable th) {
                objT = com.google.common.util.concurrent.P.T(th);
            }
            java.lang.Throwable thA = p070h6.n.a(objT);
            if (thA != null) {
                com.revenuecat.purchases.common.LogWrapperKt.getCurrentLogHandler().e("[Purchases] - ERROR", "Failed to pre-download workflow assets", thA);
            }
            return a2;
        }
    }

    /* JADX INFO: renamed from: com.revenuecat.purchases.common.workflows.WorkflowManager$loadUiConfig$1, reason: invalid class name and case insensitive filesystem */
    @kotlin.Metadata(k = 3, mv = {1, 8, 0}, xi = androidx.media3.container.NalUnitUtil.H265_NAL_UNIT_TYPE_UNSPECIFIED)
    @p117n6.e(c = "com.revenuecat.purchases.common.workflows.WorkflowManager", f = "WorkflowManager.kt", l = {95}, m = "loadUiConfig")
    public static final class C20741 extends p117n6.c {
        java.lang.Object L$0;
        int label;
        /* synthetic */ java.lang.Object result;

        public C20741(p100l6.c cVar) {
            super(cVar);
        }

        @Override // p117n6.a
        public final java.lang.Object invokeSuspend(java.lang.Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return com.revenuecat.purchases.common.workflows.WorkflowManager.this.loadUiConfig(null, this);
        }
    }

    /* JADX INFO: renamed from: com.revenuecat.purchases.common.workflows.WorkflowManager$onPaywallConfigReady$1, reason: invalid class name and case insensitive filesystem */
    @kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"LS7/A;", "Lh6/A;", "<anonymous>", "(LS7/A;)V"}, k = 3, mv = {1, 8, 0})
    @p117n6.e(c = "com.revenuecat.purchases.common.workflows.WorkflowManager$onPaywallConfigReady$1", f = "WorkflowManager.kt", l = {153}, m = "invokeSuspend")
    public static final class C20751 extends p117n6.i implements p194x6.m {
        final /* synthetic */ kotlin.jvm.functions.Function0 $onComplete;
        final /* synthetic */ S7.F $readiness;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C20751(S7.F f9, kotlin.jvm.functions.Function0 function0, p100l6.c cVar) {
            super(2, cVar);
            this.$readiness = f9;
            this.$onComplete = function0;
        }

        @Override // p117n6.a
        public final p100l6.c create(java.lang.Object obj, p100l6.c cVar) {
            return new com.revenuecat.purchases.common.workflows.WorkflowManager.C20751(this.$readiness, this.$onComplete, cVar);
        }

        @Override // p194x6.m
        public final java.lang.Object invoke(S7.A a2, p100l6.c cVar) {
            return ((com.revenuecat.purchases.common.workflows.WorkflowManager.C20751) create(a2, cVar)).invokeSuspend(p070h6.A.f22523a);
        }

        @Override // p117n6.a
        public final java.lang.Object invokeSuspend(java.lang.Object obj) {
            p109m6.a aVar = p109m6.a.f25430h;
            int i3 = this.label;
            if (i3 == 0) {
                com.google.common.util.concurrent.P.u0(obj);
                S7.F f9 = this.$readiness;
                this.label = 1;
                if (f9.B(this) == aVar) {
                    return aVar;
                }
            } else {
                if (i3 != 1) {
                    throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                com.google.common.util.concurrent.P.u0(obj);
            }
            this.$onComplete.invoke();
            return p070h6.A.f22523a;
        }
    }

    public WorkflowManager(com.revenuecat.purchases.common.workflows.WorkflowsConfigProvider workflowsConfigProvider, com.revenuecat.purchases.common.uiconfig.UiConfigProvider uiConfigProvider, com.revenuecat.purchases.common.workflows.WorkflowAssetPrewarmer workflowAssetPrewarmer, S7.A scope) {
        kotlin.jvm.internal.m.e(workflowsConfigProvider, "workflowsConfigProvider");
        kotlin.jvm.internal.m.e(uiConfigProvider, "uiConfigProvider");
        kotlin.jvm.internal.m.e(workflowAssetPrewarmer, "workflowAssetPrewarmer");
        kotlin.jvm.internal.m.e(scope, "scope");
        this.workflowsConfigProvider = workflowsConfigProvider;
        this.uiConfigProvider = uiConfigProvider;
        this.workflowAssetPrewarmer = workflowAssetPrewarmer;
        this.scope = scope;
        this.readinessLock = new java.lang.Object();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Multi-variable type inference failed */
    public final java.lang.Object awaitBestEffort(java.lang.String str, p194x6.j jVar, p100l6.c cVar) {
        com.revenuecat.purchases.common.workflows.WorkflowManager.AnonymousClass1 anonymousClass1;
        if (cVar instanceof com.revenuecat.purchases.common.workflows.WorkflowManager.AnonymousClass1) {
            anonymousClass1 = (com.revenuecat.purchases.common.workflows.WorkflowManager.AnonymousClass1) cVar;
            int i3 = anonymousClass1.label;
            if ((i3 & Integer.MIN_VALUE) != 0) {
                anonymousClass1.label = i3 - Integer.MIN_VALUE;
            } else {
                anonymousClass1 = new com.revenuecat.purchases.common.workflows.WorkflowManager.AnonymousClass1(cVar);
            }
        } else {
            anonymousClass1 = new com.revenuecat.purchases.common.workflows.WorkflowManager.AnonymousClass1(cVar);
        }
        java.lang.Object obj = anonymousClass1.result;
        p109m6.a aVar = p109m6.a.f25430h;
        int i9 = anonymousClass1.label;
        try {
            if (i9 == 0) {
                com.google.common.util.concurrent.P.u0(obj);
                anonymousClass1.L$0 = str;
                anonymousClass1.label = 1;
                java.lang.Object objInvoke = jVar.invoke(anonymousClass1);
                str = objInvoke;
                if (objInvoke == aVar) {
                    return aVar;
                }
            } else {
                if (i9 != 1) {
                    throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                java.lang.String str2 = (java.lang.String) anonymousClass1.L$0;
                com.google.common.util.concurrent.P.u0(obj);
                str = str2;
            }
        } catch (java.util.concurrent.CancellationException e6) {
            throw e6;
        } catch (java.lang.Exception e9) {
            com.revenuecat.purchases.common.LogWrapperKt.getCurrentLogHandler().e("[Purchases] - ERROR", Y6.f.h("Failed to ready ", str, " before getOfferings; proceeding without it."), e9);
        }
        return p070h6.A.f22523a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final java.lang.Object loadUiConfig(java.lang.String str, p100l6.c cVar) {
        com.revenuecat.purchases.common.workflows.WorkflowManager.C20741 c20741;
        if (cVar instanceof com.revenuecat.purchases.common.workflows.WorkflowManager.C20741) {
            c20741 = (com.revenuecat.purchases.common.workflows.WorkflowManager.C20741) cVar;
            int i3 = c20741.label;
            if ((i3 & Integer.MIN_VALUE) != 0) {
                c20741.label = i3 - Integer.MIN_VALUE;
            } else {
                c20741 = new com.revenuecat.purchases.common.workflows.WorkflowManager.C20741(cVar);
            }
        } else {
            c20741 = new com.revenuecat.purchases.common.workflows.WorkflowManager.C20741(cVar);
        }
        java.lang.Object uiConfig = c20741.result;
        p109m6.a aVar = p109m6.a.f25430h;
        int i9 = c20741.label;
        try {
            if (i9 == 0) {
                com.google.common.util.concurrent.P.u0(uiConfig);
                com.revenuecat.purchases.common.uiconfig.UiConfigProvider uiConfigProvider = this.uiConfigProvider;
                c20741.L$0 = str;
                c20741.label = 1;
                uiConfig = uiConfigProvider.getUiConfig(c20741);
                if (uiConfig == aVar) {
                    return aVar;
                }
            } else {
                if (i9 != 1) {
                    throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                str = (java.lang.String) c20741.L$0;
                com.google.common.util.concurrent.P.u0(uiConfig);
            }
            return (com.revenuecat.purchases.UiConfig) uiConfig;
        } catch (java.util.concurrent.CancellationException e6) {
            throw e6;
        } catch (java.lang.Exception e9) {
            com.revenuecat.purchases.common.LogWrapperKt.getCurrentLogHandler().e("[Purchases] - ERROR", Y6.f.h("Failed to load ui_config for workflow '", str, "'."), e9);
            return null;
        }
    }

    public final void close() {
        S7.C.i(this.scope, null);
    }

    /* JADX WARN: Code duplicated, block: B:31:0x0087  */
    /* JADX WARN: Code duplicated, block: B:34:0x0096  */
    /* JADX WARN: Code duplicated, block: B:37:0x009e  */
    /* JADX WARN: Code duplicated, block: B:39:0x00aa  */
    /* JADX WARN: Code duplicated, block: B:41:0x00bd  */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final java.lang.Object getWorkflow(java.lang.String str, p100l6.c cVar) throws com.revenuecat.purchases.PurchasesException {
        com.revenuecat.purchases.common.workflows.WorkflowManager.C20731 c20731;
        com.revenuecat.purchases.common.workflows.WorkflowManager workflowManager;
        com.revenuecat.purchases.common.workflows.PublishedWorkflow publishedWorkflow;
        java.lang.Object objLoadUiConfig;
        java.lang.String str2;
        com.revenuecat.purchases.common.workflows.PublishedWorkflow publishedWorkflow2;
        com.revenuecat.purchases.common.workflows.WorkflowManager workflowManager2;
        com.revenuecat.purchases.UiConfig uiConfig;
        if (cVar instanceof com.revenuecat.purchases.common.workflows.WorkflowManager.C20731) {
            c20731 = (com.revenuecat.purchases.common.workflows.WorkflowManager.C20731) cVar;
            int i3 = c20731.label;
            if ((i3 & Integer.MIN_VALUE) != 0) {
                c20731.label = i3 - Integer.MIN_VALUE;
            } else {
                c20731 = new com.revenuecat.purchases.common.workflows.WorkflowManager.C20731(cVar);
            }
        } else {
            c20731 = new com.revenuecat.purchases.common.workflows.WorkflowManager.C20731(cVar);
        }
        java.lang.Object objWorkflowIdForOfferingId = c20731.result;
        p109m6.a aVar = p109m6.a.f25430h;
        int i9 = c20731.label;
        if (i9 == 0) {
            com.google.common.util.concurrent.P.u0(objWorkflowIdForOfferingId);
            com.revenuecat.purchases.common.workflows.WorkflowsConfigProvider workflowsConfigProvider = this.workflowsConfigProvider;
            c20731.L$0 = this;
            c20731.L$1 = str;
            c20731.label = 1;
            objWorkflowIdForOfferingId = workflowsConfigProvider.workflowIdForOfferingId(str, c20731);
            if (objWorkflowIdForOfferingId != aVar) {
                workflowManager = this;
            }
            return aVar;
        }
        if (i9 == 1) {
            str = (java.lang.String) c20731.L$1;
            workflowManager = (com.revenuecat.purchases.common.workflows.WorkflowManager) c20731.L$0;
            com.google.common.util.concurrent.P.u0(objWorkflowIdForOfferingId);
        } else {
            if (i9 == 2) {
                str = (java.lang.String) c20731.L$1;
                workflowManager = (com.revenuecat.purchases.common.workflows.WorkflowManager) c20731.L$0;
                com.google.common.util.concurrent.P.u0(objWorkflowIdForOfferingId);
                publishedWorkflow = (com.revenuecat.purchases.common.workflows.PublishedWorkflow) objWorkflowIdForOfferingId;
                if (publishedWorkflow != null) {
                    throw new com.revenuecat.purchases.PurchasesException(new com.revenuecat.purchases.PurchasesError(com.revenuecat.purchases.PurchasesErrorCode.UnknownError, Y6.f.h("Workflow '", str, "' is unavailable from remote config.")));
                }
                c20731.L$0 = workflowManager;
                c20731.L$1 = str;
                c20731.L$2 = publishedWorkflow;
                c20731.label = 3;
                objLoadUiConfig = workflowManager.loadUiConfig(str, c20731);
                if (objLoadUiConfig != aVar) {
                    str2 = str;
                    publishedWorkflow2 = publishedWorkflow;
                    objWorkflowIdForOfferingId = objLoadUiConfig;
                    workflowManager2 = workflowManager;
                }
                return aVar;
            }
            if (i9 != 3) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            publishedWorkflow2 = (com.revenuecat.purchases.common.workflows.PublishedWorkflow) c20731.L$2;
            str2 = (java.lang.String) c20731.L$1;
            workflowManager2 = (com.revenuecat.purchases.common.workflows.WorkflowManager) c20731.L$0;
            com.google.common.util.concurrent.P.u0(objWorkflowIdForOfferingId);
        }
        uiConfig = (com.revenuecat.purchases.UiConfig) objWorkflowIdForOfferingId;
        if (uiConfig != null) {
            throw new com.revenuecat.purchases.PurchasesException(new com.revenuecat.purchases.PurchasesError(com.revenuecat.purchases.PurchasesErrorCode.UnknownError, Y6.f.h("Workflow '", str2, "' resolved, but its UI config is unavailable.")));
        }
        S7.C.A(workflowManager2.scope, null, workflowManager2.new AnonymousClass2(publishedWorkflow2, uiConfig, null), 3);
        return publishedWorkflow2;
        java.lang.String str3 = (java.lang.String) objWorkflowIdForOfferingId;
        if (str3 != null) {
            str = str3;
        }
        com.revenuecat.purchases.common.workflows.WorkflowsConfigProvider workflowsConfigProvider2 = workflowManager.workflowsConfigProvider;
        c20731.L$0 = workflowManager;
        c20731.L$1 = str;
        c20731.label = 2;
        objWorkflowIdForOfferingId = workflowsConfigProvider2.getWorkflow(str, c20731);
        if (objWorkflowIdForOfferingId != aVar) {
            publishedWorkflow = (com.revenuecat.purchases.common.workflows.PublishedWorkflow) objWorkflowIdForOfferingId;
            if (publishedWorkflow != null) {
                throw new com.revenuecat.purchases.PurchasesException(new com.revenuecat.purchases.PurchasesError(com.revenuecat.purchases.PurchasesErrorCode.UnknownError, Y6.f.h("Workflow '", str, "' is unavailable from remote config.")));
            }
            c20731.L$0 = workflowManager;
            c20731.L$1 = str;
            c20731.L$2 = publishedWorkflow;
            c20731.label = 3;
            objLoadUiConfig = workflowManager.loadUiConfig(str, c20731);
            if (objLoadUiConfig != aVar) {
                str2 = str;
                publishedWorkflow2 = publishedWorkflow;
                objWorkflowIdForOfferingId = objLoadUiConfig;
                workflowManager2 = workflowManager;
                uiConfig = (com.revenuecat.purchases.UiConfig) objWorkflowIdForOfferingId;
                if (uiConfig != null) {
                    throw new com.revenuecat.purchases.PurchasesException(new com.revenuecat.purchases.PurchasesError(com.revenuecat.purchases.PurchasesErrorCode.UnknownError, Y6.f.h("Workflow '", str2, "' resolved, but its UI config is unavailable.")));
                }
                S7.C.A(workflowManager2.scope, null, workflowManager2.new AnonymousClass2(publishedWorkflow2, uiConfig, null), 3);
                return publishedWorkflow2;
            }
        }
        return aVar;
    }

    public final void onPaywallConfigReady(kotlin.jvm.functions.Function0 onComplete) {
        S7.F f9;
        kotlin.jvm.internal.m.e(onComplete, "onComplete");
        if (this.uiConfigProvider.isWarm() && this.workflowsConfigProvider.isWarmForCurrentOffering()) {
            onComplete.invoke();
            return;
        }
        synchronized (this.readinessLock) {
            f9 = this.inFlightReadiness;
            if (f9 == null) {
                f9 = S7.C.f(this.scope, null, new com.revenuecat.purchases.common.workflows.WorkflowManager$onPaywallConfigReady$readiness$1$1(this, null), 3);
                this.inFlightReadiness = f9;
                f9.j(new com.revenuecat.purchases.common.workflows.WorkflowManager$onPaywallConfigReady$readiness$1$2$1(this, f9));
            }
        }
        S7.C.A(this.scope, null, new com.revenuecat.purchases.common.workflows.WorkflowManager.C20751(f9, onComplete, null), 3);
    }

    public final java.lang.Object resolveWorkflow(java.lang.String str, p100l6.c cVar) {
        return this.workflowsConfigProvider.resolveWorkflow(str, cVar);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public WorkflowManager(com.revenuecat.purchases.common.workflows.WorkflowsConfigProvider workflowsConfigProvider, com.revenuecat.purchases.common.uiconfig.UiConfigProvider uiConfigProvider, com.revenuecat.purchases.common.workflows.WorkflowAssetPrewarmer workflowAssetPrewarmer, S7.A a2, int i3, kotlin.jvm.internal.AbstractC2541f abstractC2541f) {
        if ((i3 & 8) != 0) {
            S7.y0 y0VarE = S7.C.e();
            Z7.e eVar = S7.M.f9549a;
            a2 = S7.C.c(com.google.android.gms.internal.play_billing.AbstractC1833d1.H(y0VarE, Z7.d.f13044i));
        }
        this(workflowsConfigProvider, uiConfigProvider, workflowAssetPrewarmer, a2);
    }
}
