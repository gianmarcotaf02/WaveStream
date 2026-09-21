package com.revenuecat.purchases.common.workflows;

/* JADX INFO: loaded from: classes4.dex */
@kotlin.Metadata(d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010#\n\u0002\b\u0003\b\u0000\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u0012\u0010\u000b\u001a\u0004\u0018\u00010\nH\u0082@¢\u0006\u0004\b\u000b\u0010\fJ\u001d\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u000f\u001a\u00020\n¢\u0006\u0004\b\u0011\u0010\u0012J>\u0010\u0018\u001a\u00020\u00102\u0006\u0010\u0014\u001a\u00020\u00132$\u0010\u0017\u001a \b\u0001\u0012\u0004\u0012\u00020\u0013\u0012\f\u0012\n\u0012\u0006\u0012\u0004\u0018\u00010\r0\u0016\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u0015H\u0086@¢\u0006\u0004\b\u0018\u0010\u0019R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u001aR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u001bR\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\u001cR\u001a\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\u00130\u001d8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001e\u0010\u001f¨\u0006 "}, d2 = {"Lcom/revenuecat/purchases/common/workflows/WorkflowAssetPrewarmer;", "", "Lcom/revenuecat/purchases/common/uiconfig/UiConfigProvider;", "uiConfigProvider", "Lcom/revenuecat/purchases/utils/PaywallComponentsImagePreDownloader;", "paywallComponentsImagePreDownloader", "Lcom/revenuecat/purchases/paywalls/OfferingFontPreDownloader;", "offeringFontPreDownloader", "<init>", "(Lcom/revenuecat/purchases/common/uiconfig/UiConfigProvider;Lcom/revenuecat/purchases/utils/PaywallComponentsImagePreDownloader;Lcom/revenuecat/purchases/paywalls/OfferingFontPreDownloader;)V", "Lcom/revenuecat/purchases/UiConfig;", "loadUiConfig", "(Ll6/c;)Ljava/lang/Object;", "Lcom/revenuecat/purchases/common/workflows/PublishedWorkflow;", "workflow", "uiConfig", "Lh6/A;", "preDownloadWorkflowAssets", "(Lcom/revenuecat/purchases/common/workflows/PublishedWorkflow;Lcom/revenuecat/purchases/UiConfig;)V", "", "workflowId", "Lkotlin/Function2;", "Ll6/c;", "transientDecode", "onCurrentWorkflowLoaded", "(Ljava/lang/String;Lx6/m;Ll6/c;)Ljava/lang/Object;", "Lcom/revenuecat/purchases/common/uiconfig/UiConfigProvider;", "Lcom/revenuecat/purchases/utils/PaywallComponentsImagePreDownloader;", "Lcom/revenuecat/purchases/paywalls/OfferingFontPreDownloader;", "", "warmedWorkflowIds", "Ljava/util/Set;", "purchases_defaultsRelease"}, k = 1, mv = {1, 8, 0}, xi = androidx.media3.container.NalUnitUtil.H265_NAL_UNIT_TYPE_UNSPECIFIED)
public final class WorkflowAssetPrewarmer {
    private final com.revenuecat.purchases.paywalls.OfferingFontPreDownloader offeringFontPreDownloader;
    private final com.revenuecat.purchases.utils.PaywallComponentsImagePreDownloader paywallComponentsImagePreDownloader;
    private final com.revenuecat.purchases.common.uiconfig.UiConfigProvider uiConfigProvider;
    private final java.util.Set<java.lang.String> warmedWorkflowIds;

    /* JADX INFO: renamed from: com.revenuecat.purchases.common.workflows.WorkflowAssetPrewarmer$loadUiConfig$1, reason: invalid class name */
    @kotlin.Metadata(k = 3, mv = {1, 8, 0}, xi = androidx.media3.container.NalUnitUtil.H265_NAL_UNIT_TYPE_UNSPECIFIED)
    @p117n6.e(c = "com.revenuecat.purchases.common.workflows.WorkflowAssetPrewarmer", f = "WorkflowAssetPrewarmer.kt", l = {76}, m = "loadUiConfig")
    public static final class AnonymousClass1 extends p117n6.c {
        int label;
        /* synthetic */ java.lang.Object result;

        public AnonymousClass1(p100l6.c cVar) {
            super(cVar);
        }

        @Override // p117n6.a
        public final java.lang.Object invokeSuspend(java.lang.Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return com.revenuecat.purchases.common.workflows.WorkflowAssetPrewarmer.this.loadUiConfig(this);
        }
    }

    /* JADX INFO: renamed from: com.revenuecat.purchases.common.workflows.WorkflowAssetPrewarmer$onCurrentWorkflowLoaded$1, reason: invalid class name and case insensitive filesystem */
    @kotlin.Metadata(k = 3, mv = {1, 8, 0}, xi = androidx.media3.container.NalUnitUtil.H265_NAL_UNIT_TYPE_UNSPECIFIED)
    @p117n6.e(c = "com.revenuecat.purchases.common.workflows.WorkflowAssetPrewarmer", f = "WorkflowAssetPrewarmer.kt", l = {61, 65}, m = "onCurrentWorkflowLoaded")
    public static final class C20721 extends p117n6.c {
        java.lang.Object L$0;
        java.lang.Object L$1;
        java.lang.Object L$2;
        int label;
        /* synthetic */ java.lang.Object result;

        public C20721(p100l6.c cVar) {
            super(cVar);
        }

        @Override // p117n6.a
        public final java.lang.Object invokeSuspend(java.lang.Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return com.revenuecat.purchases.common.workflows.WorkflowAssetPrewarmer.this.onCurrentWorkflowLoaded(null, null, this);
        }
    }

    public WorkflowAssetPrewarmer(com.revenuecat.purchases.common.uiconfig.UiConfigProvider uiConfigProvider, com.revenuecat.purchases.utils.PaywallComponentsImagePreDownloader paywallComponentsImagePreDownloader, com.revenuecat.purchases.paywalls.OfferingFontPreDownloader offeringFontPreDownloader) {
        kotlin.jvm.internal.m.e(uiConfigProvider, "uiConfigProvider");
        kotlin.jvm.internal.m.e(paywallComponentsImagePreDownloader, "paywallComponentsImagePreDownloader");
        kotlin.jvm.internal.m.e(offeringFontPreDownloader, "offeringFontPreDownloader");
        this.uiConfigProvider = uiConfigProvider;
        this.paywallComponentsImagePreDownloader = paywallComponentsImagePreDownloader;
        this.offeringFontPreDownloader = offeringFontPreDownloader;
        this.warmedWorkflowIds = new java.util.LinkedHashSet();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final java.lang.Object loadUiConfig(p100l6.c cVar) {
        com.revenuecat.purchases.common.workflows.WorkflowAssetPrewarmer.AnonymousClass1 anonymousClass1;
        if (cVar instanceof com.revenuecat.purchases.common.workflows.WorkflowAssetPrewarmer.AnonymousClass1) {
            anonymousClass1 = (com.revenuecat.purchases.common.workflows.WorkflowAssetPrewarmer.AnonymousClass1) cVar;
            int i3 = anonymousClass1.label;
            if ((i3 & Integer.MIN_VALUE) != 0) {
                anonymousClass1.label = i3 - Integer.MIN_VALUE;
            } else {
                anonymousClass1 = new com.revenuecat.purchases.common.workflows.WorkflowAssetPrewarmer.AnonymousClass1(cVar);
            }
        } else {
            anonymousClass1 = new com.revenuecat.purchases.common.workflows.WorkflowAssetPrewarmer.AnonymousClass1(cVar);
        }
        java.lang.Object uiConfig = anonymousClass1.result;
        p109m6.a aVar = p109m6.a.f25430h;
        int i9 = anonymousClass1.label;
        try {
            if (i9 == 0) {
                com.google.common.util.concurrent.P.u0(uiConfig);
                com.revenuecat.purchases.common.uiconfig.UiConfigProvider uiConfigProvider = this.uiConfigProvider;
                anonymousClass1.label = 1;
                uiConfig = uiConfigProvider.getUiConfig(anonymousClass1);
                if (uiConfig == aVar) {
                    return aVar;
                }
            } else {
                if (i9 != 1) {
                    throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                com.google.common.util.concurrent.P.u0(uiConfig);
            }
            return (com.revenuecat.purchases.UiConfig) uiConfig;
        } catch (java.util.concurrent.CancellationException e6) {
            throw e6;
        } catch (java.lang.Exception e9) {
            com.revenuecat.purchases.common.LogWrapperKt.getCurrentLogHandler().e("[Purchases] - ERROR", "Failed to load ui_config; skipping workflow asset prewarm.", e9);
            return null;
        }
    }

    /* JADX WARN: Code duplicated, block: B:43:0x0096 A[Catch: Exception -> 0x0036, CancellationException -> 0x0039, TRY_LEAVE, TryCatch #2 {CancellationException -> 0x0039, blocks: (B:13:0x0032, B:41:0x0092, B:43:0x0096, B:37:0x007e), top: B:58:0x0020 }] */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final java.lang.Object onCurrentWorkflowLoaded(java.lang.String str, p194x6.m mVar, p100l6.c cVar) {
        com.revenuecat.purchases.common.workflows.WorkflowAssetPrewarmer.C20721 c20721;
        boolean zContains;
        com.revenuecat.purchases.common.workflows.WorkflowAssetPrewarmer workflowAssetPrewarmer;
        java.lang.String str2;
        java.lang.Exception e6;
        com.revenuecat.purchases.UiConfig uiConfig;
        com.revenuecat.purchases.common.workflows.WorkflowAssetPrewarmer workflowAssetPrewarmer2;
        com.revenuecat.purchases.common.workflows.PublishedWorkflow publishedWorkflow;
        if (cVar instanceof com.revenuecat.purchases.common.workflows.WorkflowAssetPrewarmer.C20721) {
            c20721 = (com.revenuecat.purchases.common.workflows.WorkflowAssetPrewarmer.C20721) cVar;
            int i3 = c20721.label;
            if ((i3 & Integer.MIN_VALUE) != 0) {
                c20721.label = i3 - Integer.MIN_VALUE;
            } else {
                c20721 = new com.revenuecat.purchases.common.workflows.WorkflowAssetPrewarmer.C20721(cVar);
            }
        } else {
            c20721 = new com.revenuecat.purchases.common.workflows.WorkflowAssetPrewarmer.C20721(cVar);
        }
        java.lang.Object objLoadUiConfig = c20721.result;
        p109m6.a aVar = p109m6.a.f25430h;
        int i9 = c20721.label;
        try {
            if (i9 == 0) {
                com.google.common.util.concurrent.P.u0(objLoadUiConfig);
                synchronized (this.warmedWorkflowIds) {
                    zContains = this.warmedWorkflowIds.contains(str);
                }
                if (zContains) {
                    return p070h6.A.f22523a;
                }
                c20721.L$0 = this;
                c20721.L$1 = str;
                c20721.L$2 = mVar;
                c20721.label = 1;
                objLoadUiConfig = loadUiConfig(c20721);
                if (objLoadUiConfig != aVar) {
                    workflowAssetPrewarmer = this;
                }
                return aVar;
            }
            if (i9 != 1) {
                if (i9 != 2) {
                    throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                uiConfig = (com.revenuecat.purchases.UiConfig) c20721.L$2;
                str2 = (java.lang.String) c20721.L$1;
                workflowAssetPrewarmer2 = (com.revenuecat.purchases.common.workflows.WorkflowAssetPrewarmer) c20721.L$0;
                try {
                    com.google.common.util.concurrent.P.u0(objLoadUiConfig);
                    publishedWorkflow = (com.revenuecat.purchases.common.workflows.PublishedWorkflow) objLoadUiConfig;
                    if (publishedWorkflow != null) {
                        workflowAssetPrewarmer2.preDownloadWorkflowAssets(publishedWorkflow, uiConfig);
                    }
                } catch (java.lang.Exception e9) {
                    e6 = e9;
                    com.revenuecat.purchases.common.LogWrapperKt.getCurrentLogHandler().e("[Purchases] - ERROR", Y6.f.h("Failed to prewarm assets for workflow '", str2, "'."), e6);
                }
                return p070h6.A.f22523a;
            }
            mVar = (p194x6.m) c20721.L$2;
            str = (java.lang.String) c20721.L$1;
            workflowAssetPrewarmer = (com.revenuecat.purchases.common.workflows.WorkflowAssetPrewarmer) c20721.L$0;
            com.google.common.util.concurrent.P.u0(objLoadUiConfig);
            com.revenuecat.purchases.UiConfig uiConfig2 = (com.revenuecat.purchases.UiConfig) objLoadUiConfig;
            if (uiConfig2 == null) {
                return p070h6.A.f22523a;
            }
            try {
                c20721.L$0 = workflowAssetPrewarmer;
                c20721.L$1 = str;
                c20721.L$2 = uiConfig2;
                c20721.label = 2;
                java.lang.Object objInvoke = mVar.invoke(str, c20721);
                if (objInvoke != aVar) {
                    str2 = str;
                    uiConfig = uiConfig2;
                    objLoadUiConfig = objInvoke;
                    workflowAssetPrewarmer2 = workflowAssetPrewarmer;
                    publishedWorkflow = (com.revenuecat.purchases.common.workflows.PublishedWorkflow) objLoadUiConfig;
                    if (publishedWorkflow != null) {
                        workflowAssetPrewarmer2.preDownloadWorkflowAssets(publishedWorkflow, uiConfig);
                    }
                    return p070h6.A.f22523a;
                }
                return aVar;
            } catch (java.lang.Exception e10) {
                str2 = str;
                e6 = e10;
                com.revenuecat.purchases.common.LogWrapperKt.getCurrentLogHandler().e("[Purchases] - ERROR", Y6.f.h("Failed to prewarm assets for workflow '", str2, "'."), e6);
            }
        } catch (java.util.concurrent.CancellationException e11) {
            throw e11;
        }
    }

    public final void preDownloadWorkflowAssets(com.revenuecat.purchases.common.workflows.PublishedWorkflow workflow, com.revenuecat.purchases.UiConfig uiConfig) {
        kotlin.jvm.internal.m.e(workflow, "workflow");
        kotlin.jvm.internal.m.e(uiConfig, "uiConfig");
        synchronized (this.warmedWorkflowIds) {
            if (this.warmedWorkflowIds.add(workflow.getId())) {
                java.util.Iterator<T> it = workflow.getScreens().values().iterator();
                while (it.hasNext()) {
                    this.paywallComponentsImagePreDownloader.preDownloadImages(((com.revenuecat.purchases.common.workflows.WorkflowScreen) it.next()).getComponentsConfig().getBase());
                }
                this.offeringFontPreDownloader.preDownloadFontsIfNeeded(uiConfig.getApp().getFonts().values());
            }
        }
    }
}
