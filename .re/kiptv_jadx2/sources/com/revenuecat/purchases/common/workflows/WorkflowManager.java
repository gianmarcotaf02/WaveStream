package com.revenuecat.purchases.common.workflows;

import S7.A;
import S7.C;
import S7.F;
import S7.M;
import S7.y0;
import Y6.f;
import Z7.d;
import androidx.media3.container.NalUnitUtil;
import com.google.android.gms.internal.play_billing.AbstractC1833d1;
import com.google.common.util.concurrent.P;
import com.revenuecat.purchases.PurchasesError;
import com.revenuecat.purchases.PurchasesErrorCode;
import com.revenuecat.purchases.PurchasesException;
import com.revenuecat.purchases.UiConfig;
import com.revenuecat.purchases.common.LogWrapperKt;
import com.revenuecat.purchases.common.uiconfig.UiConfigProvider;
import java.util.concurrent.CancellationException;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AbstractC2541f;
import p070h6.n;
import p109m6.a;
import p117n6.c;
import p117n6.e;
import p117n6.i;
import p194x6.j;
import p194x6.m;

@Metadata(d1 = {"\u0000^\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\u00020\u0001B)\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\b\b\u0002\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000f\u001a\u0004\u0018\u00010\u000e2\u0006\u0010\r\u001a\u00020\fH\u0082@¢\u0006\u0004\b\u000f\u0010\u0010J6\u0010\u0016\u001a\u00020\u00142\u0006\u0010\u0011\u001a\u00020\f2\u001c\u0010\u0015\u001a\u0018\b\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00140\u0013\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u0012H\u0082@¢\u0006\u0004\b\u0016\u0010\u0017J\r\u0010\u0018\u001a\u00020\u0014¢\u0006\u0004\b\u0018\u0010\u0019J\u0018\u0010\u001c\u001a\u00020\u001b2\u0006\u0010\u001a\u001a\u00020\fH\u0086@¢\u0006\u0004\b\u001c\u0010\u0010J\u0018\u0010\u001f\u001a\u00020\u001e2\u0006\u0010\u001d\u001a\u00020\fH\u0086@¢\u0006\u0004\b\u001f\u0010\u0010J\u001b\u0010\"\u001a\u00020\u00142\f\u0010!\u001a\b\u0012\u0004\u0012\u00020\u00140 ¢\u0006\u0004\b\"\u0010#R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010$R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010%R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010&R\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010'R\u0014\u0010(\u001a\u00020\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b(\u0010)R\u001e\u0010+\u001a\n\u0012\u0004\u0012\u00020\u0014\u0018\u00010*8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b+\u0010,¨\u0006-"}, d2 = {"Lcom/revenuecat/purchases/common/workflows/WorkflowManager;", "", "Lcom/revenuecat/purchases/common/workflows/WorkflowsConfigProvider;", "workflowsConfigProvider", "Lcom/revenuecat/purchases/common/uiconfig/UiConfigProvider;", "uiConfigProvider", "Lcom/revenuecat/purchases/common/workflows/WorkflowAssetPrewarmer;", "workflowAssetPrewarmer", "LS7/A;", "scope", "<init>", "(Lcom/revenuecat/purchases/common/workflows/WorkflowsConfigProvider;Lcom/revenuecat/purchases/common/uiconfig/UiConfigProvider;Lcom/revenuecat/purchases/common/workflows/WorkflowAssetPrewarmer;LS7/A;)V", "", "workflowId", "Lcom/revenuecat/purchases/UiConfig;", "loadUiConfig", "(Ljava/lang/String;Ll6/c;)Ljava/lang/Object;", "what", "Lkotlin/Function1;", "Ll6/c;", "Lh6/A;", "block", "awaitBestEffort", "(Ljava/lang/String;Lx6/j;Ll6/c;)Ljava/lang/Object;", "close", "()V", "workflowOrOfferingId", "Lcom/revenuecat/purchases/common/workflows/PublishedWorkflow;", "getWorkflow", "offeringId", "Lcom/revenuecat/purchases/common/workflows/WorkflowResolution;", "resolveWorkflow", "Lkotlin/Function0;", "onComplete", "onPaywallConfigReady", "(Lkotlin/jvm/functions/Function0;)V", "Lcom/revenuecat/purchases/common/workflows/WorkflowsConfigProvider;", "Lcom/revenuecat/purchases/common/uiconfig/UiConfigProvider;", "Lcom/revenuecat/purchases/common/workflows/WorkflowAssetPrewarmer;", "LS7/A;", "readinessLock", "Ljava/lang/Object;", "LS7/F;", "inFlightReadiness", "LS7/F;", "purchases_defaultsRelease"}, k = 1, mv = {1, 8, 0}, xi = NalUnitUtil.H265_NAL_UNIT_TYPE_UNSPECIFIED)
public final class WorkflowManager {
    private volatile F inFlightReadiness;
    private final Object readinessLock;
    private final A scope;
    private final UiConfigProvider uiConfigProvider;
    private final WorkflowAssetPrewarmer workflowAssetPrewarmer;
    private final WorkflowsConfigProvider workflowsConfigProvider;

    @Metadata(k = 3, mv = {1, 8, 0}, xi = NalUnitUtil.H265_NAL_UNIT_TYPE_UNSPECIFIED)
    @e(c = "com.revenuecat.purchases.common.workflows.WorkflowManager", f = "WorkflowManager.kt", l = {165}, m = "awaitBestEffort")
    public static final class AnonymousClass1 extends c {
        Object L$0;
        int label;
        Object result;

        public AnonymousClass1(p100l6.c cVar) {
            super(cVar);
        }

        @Override
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return WorkflowManager.this.awaitBestEffort(null, null, this);
        }
    }

    @Metadata(k = 3, mv = {1, 8, 0}, xi = NalUnitUtil.H265_NAL_UNIT_TYPE_UNSPECIFIED)
    @e(c = "com.revenuecat.purchases.common.workflows.WorkflowManager", f = "WorkflowManager.kt", l = {64, 66, 73}, m = "getWorkflow")
    public static final class C20731 extends c {
        Object L$0;
        Object L$1;
        Object L$2;
        int label;
        Object result;

        public C20731(p100l6.c cVar) {
            super(cVar);
        }

        @Override
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return WorkflowManager.this.getWorkflow(null, this);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"LS7/A;", "Lh6/A;", "<anonymous>", "(LS7/A;)V"}, k = 3, mv = {1, 8, 0})
    @e(c = "com.revenuecat.purchases.common.workflows.WorkflowManager$getWorkflow$2", f = "WorkflowManager.kt", l = {}, m = "invokeSuspend")
    public static final class AnonymousClass2 extends i implements m {
        final UiConfig $uiConfig;
        final PublishedWorkflow $workflow;
        private Object L$0;
        int label;

        public AnonymousClass2(PublishedWorkflow publishedWorkflow, UiConfig uiConfig, p100l6.c cVar) {
            super(2, cVar);
            this.$workflow = publishedWorkflow;
            this.$uiConfig = uiConfig;
        }

        @Override
        public final p100l6.c create(Object obj, p100l6.c cVar) {
            AnonymousClass2 anonymousClass2 = WorkflowManager.this.new AnonymousClass2(this.$workflow, this.$uiConfig, cVar);
            anonymousClass2.L$0 = obj;
            return anonymousClass2;
        }

        @Override
        public final Object invoke(A a2, p100l6.c cVar) {
            return ((AnonymousClass2) create(a2, cVar)).invokeSuspend(p070h6.A.f22523a);
        }

        @Override
        public final Object invokeSuspend(Object obj) {
            Object objT;
            p070h6.A a2 = p070h6.A.f22523a;
            a aVar = a.f25430h;
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            P.u0(obj);
            WorkflowManager workflowManager = WorkflowManager.this;
            try {
                workflowManager.workflowAssetPrewarmer.preDownloadWorkflowAssets(this.$workflow, this.$uiConfig);
                objT = a2;
            } catch (Throwable th) {
                objT = P.T(th);
            }
            Throwable thA = n.a(objT);
            if (thA != null) {
                LogWrapperKt.getCurrentLogHandler().e("[Purchases] - ERROR", "Failed to pre-download workflow assets", thA);
            }
            return a2;
        }
    }

    @Metadata(k = 3, mv = {1, 8, 0}, xi = NalUnitUtil.H265_NAL_UNIT_TYPE_UNSPECIFIED)
    @e(c = "com.revenuecat.purchases.common.workflows.WorkflowManager", f = "WorkflowManager.kt", l = {95}, m = "loadUiConfig")
    public static final class C20741 extends c {
        Object L$0;
        int label;
        Object result;

        public C20741(p100l6.c cVar) {
            super(cVar);
        }

        @Override
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return WorkflowManager.this.loadUiConfig(null, this);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"LS7/A;", "Lh6/A;", "<anonymous>", "(LS7/A;)V"}, k = 3, mv = {1, 8, 0})
    @e(c = "com.revenuecat.purchases.common.workflows.WorkflowManager$onPaywallConfigReady$1", f = "WorkflowManager.kt", l = {153}, m = "invokeSuspend")
    public static final class C20751 extends i implements m {
        final Function0 $onComplete;
        final F $readiness;
        int label;

        public C20751(F f9, Function0 function0, p100l6.c cVar) {
            super(2, cVar);
            this.$readiness = f9;
            this.$onComplete = function0;
        }

        @Override
        public final p100l6.c create(Object obj, p100l6.c cVar) {
            return new C20751(this.$readiness, this.$onComplete, cVar);
        }

        @Override
        public final Object invoke(A a2, p100l6.c cVar) {
            return ((C20751) create(a2, cVar)).invokeSuspend(p070h6.A.f22523a);
        }

        @Override
        public final Object invokeSuspend(Object obj) {
            a aVar = a.f25430h;
            int i3 = this.label;
            if (i3 == 0) {
                P.u0(obj);
                F f9 = this.$readiness;
                this.label = 1;
                if (f9.B(this) == aVar) {
                    return aVar;
                }
            } else {
                if (i3 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                P.u0(obj);
            }
            this.$onComplete.invoke();
            return p070h6.A.f22523a;
        }
    }

    public WorkflowManager(WorkflowsConfigProvider workflowsConfigProvider, UiConfigProvider uiConfigProvider, WorkflowAssetPrewarmer workflowAssetPrewarmer, A scope) {
        kotlin.jvm.internal.m.e(workflowsConfigProvider, "workflowsConfigProvider");
        kotlin.jvm.internal.m.e(uiConfigProvider, "uiConfigProvider");
        kotlin.jvm.internal.m.e(workflowAssetPrewarmer, "workflowAssetPrewarmer");
        kotlin.jvm.internal.m.e(scope, "scope");
        this.workflowsConfigProvider = workflowsConfigProvider;
        this.uiConfigProvider = uiConfigProvider;
        this.workflowAssetPrewarmer = workflowAssetPrewarmer;
        this.scope = scope;
        this.readinessLock = new Object();
    }

    public final Object awaitBestEffort(String str, j jVar, p100l6.c cVar) {
        AnonymousClass1 anonymousClass1;
        if (cVar instanceof AnonymousClass1) {
            anonymousClass1 = (AnonymousClass1) cVar;
            int i3 = anonymousClass1.label;
            if ((i3 & Integer.MIN_VALUE) != 0) {
                anonymousClass1.label = i3 - Integer.MIN_VALUE;
            } else {
                anonymousClass1 = new AnonymousClass1(cVar);
            }
        } else {
            anonymousClass1 = new AnonymousClass1(cVar);
        }
        Object obj = anonymousClass1.result;
        a aVar = a.f25430h;
        int i9 = anonymousClass1.label;
        try {
            if (i9 == 0) {
                P.u0(obj);
                anonymousClass1.L$0 = str;
                anonymousClass1.label = 1;
                Object objInvoke = jVar.invoke(anonymousClass1);
                str = objInvoke;
                if (objInvoke == aVar) {
                    return aVar;
                }
            } else {
                if (i9 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                String str2 = (String) anonymousClass1.L$0;
                P.u0(obj);
                str = str2;
            }
        } catch (CancellationException e6) {
            throw e6;
        } catch (Exception e9) {
            LogWrapperKt.getCurrentLogHandler().e("[Purchases] - ERROR", f.h("Failed to ready ", str, " before getOfferings; proceeding without it."), e9);
        }
        return p070h6.A.f22523a;
    }

    public final Object loadUiConfig(String str, p100l6.c cVar) {
        C20741 c20741;
        if (cVar instanceof C20741) {
            c20741 = (C20741) cVar;
            int i3 = c20741.label;
            if ((i3 & Integer.MIN_VALUE) != 0) {
                c20741.label = i3 - Integer.MIN_VALUE;
            } else {
                c20741 = new C20741(cVar);
            }
        } else {
            c20741 = new C20741(cVar);
        }
        Object uiConfig = c20741.result;
        a aVar = a.f25430h;
        int i9 = c20741.label;
        try {
            if (i9 == 0) {
                P.u0(uiConfig);
                UiConfigProvider uiConfigProvider = this.uiConfigProvider;
                c20741.L$0 = str;
                c20741.label = 1;
                uiConfig = uiConfigProvider.getUiConfig(c20741);
                if (uiConfig == aVar) {
                    return aVar;
                }
            } else {
                if (i9 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                str = (String) c20741.L$0;
                P.u0(uiConfig);
            }
            return (UiConfig) uiConfig;
        } catch (CancellationException e6) {
            throw e6;
        } catch (Exception e9) {
            LogWrapperKt.getCurrentLogHandler().e("[Purchases] - ERROR", f.h("Failed to load ui_config for workflow '", str, "'."), e9);
            return null;
        }
    }

    public final void close() {
        C.i(this.scope, null);
    }

    public final Object getWorkflow(String str, p100l6.c cVar) throws PurchasesException {
        C20731 c20731;
        WorkflowManager workflowManager;
        PublishedWorkflow publishedWorkflow;
        Object objLoadUiConfig;
        String str2;
        PublishedWorkflow publishedWorkflow2;
        WorkflowManager workflowManager2;
        UiConfig uiConfig;
        if (cVar instanceof C20731) {
            c20731 = (C20731) cVar;
            int i3 = c20731.label;
            if ((i3 & Integer.MIN_VALUE) != 0) {
                c20731.label = i3 - Integer.MIN_VALUE;
            } else {
                c20731 = new C20731(cVar);
            }
        } else {
            c20731 = new C20731(cVar);
        }
        Object objWorkflowIdForOfferingId = c20731.result;
        a aVar = a.f25430h;
        int i9 = c20731.label;
        if (i9 == 0) {
            P.u0(objWorkflowIdForOfferingId);
            WorkflowsConfigProvider workflowsConfigProvider = this.workflowsConfigProvider;
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
            str = (String) c20731.L$1;
            workflowManager = (WorkflowManager) c20731.L$0;
            P.u0(objWorkflowIdForOfferingId);
        } else {
            if (i9 == 2) {
                str = (String) c20731.L$1;
                workflowManager = (WorkflowManager) c20731.L$0;
                P.u0(objWorkflowIdForOfferingId);
                publishedWorkflow = (PublishedWorkflow) objWorkflowIdForOfferingId;
                if (publishedWorkflow != null) {
                    throw new PurchasesException(new PurchasesError(PurchasesErrorCode.UnknownError, f.h("Workflow '", str, "' is unavailable from remote config.")));
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
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            publishedWorkflow2 = (PublishedWorkflow) c20731.L$2;
            str2 = (String) c20731.L$1;
            workflowManager2 = (WorkflowManager) c20731.L$0;
            P.u0(objWorkflowIdForOfferingId);
        }
        uiConfig = (UiConfig) objWorkflowIdForOfferingId;
        if (uiConfig != null) {
            throw new PurchasesException(new PurchasesError(PurchasesErrorCode.UnknownError, f.h("Workflow '", str2, "' resolved, but its UI config is unavailable.")));
        }
        C.A(workflowManager2.scope, null, workflowManager2.new AnonymousClass2(publishedWorkflow2, uiConfig, null), 3);
        return publishedWorkflow2;
        String str3 = (String) objWorkflowIdForOfferingId;
        if (str3 != null) {
            str = str3;
        }
        WorkflowsConfigProvider workflowsConfigProvider2 = workflowManager.workflowsConfigProvider;
        c20731.L$0 = workflowManager;
        c20731.L$1 = str;
        c20731.label = 2;
        objWorkflowIdForOfferingId = workflowsConfigProvider2.getWorkflow(str, c20731);
        if (objWorkflowIdForOfferingId != aVar) {
            publishedWorkflow = (PublishedWorkflow) objWorkflowIdForOfferingId;
            if (publishedWorkflow != null) {
                throw new PurchasesException(new PurchasesError(PurchasesErrorCode.UnknownError, f.h("Workflow '", str, "' is unavailable from remote config.")));
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
                uiConfig = (UiConfig) objWorkflowIdForOfferingId;
                if (uiConfig != null) {
                    throw new PurchasesException(new PurchasesError(PurchasesErrorCode.UnknownError, f.h("Workflow '", str2, "' resolved, but its UI config is unavailable.")));
                }
                C.A(workflowManager2.scope, null, workflowManager2.new AnonymousClass2(publishedWorkflow2, uiConfig, null), 3);
                return publishedWorkflow2;
            }
        }
        return aVar;
    }

    public final void onPaywallConfigReady(Function0 onComplete) {
        F f9;
        kotlin.jvm.internal.m.e(onComplete, "onComplete");
        if (this.uiConfigProvider.isWarm() && this.workflowsConfigProvider.isWarmForCurrentOffering()) {
            onComplete.invoke();
            return;
        }
        synchronized (this.readinessLock) {
            f9 = this.inFlightReadiness;
            if (f9 == null) {
                f9 = C.f(this.scope, null, new WorkflowManager$onPaywallConfigReady$readiness$1$1(this, null), 3);
                this.inFlightReadiness = f9;
                f9.j(new WorkflowManager$onPaywallConfigReady$readiness$1$2$1(this, f9));
            }
        }
        C.A(this.scope, null, new C20751(f9, onComplete, null), 3);
    }

    public final Object resolveWorkflow(String str, p100l6.c cVar) {
        return this.workflowsConfigProvider.resolveWorkflow(str, cVar);
    }

    public WorkflowManager(WorkflowsConfigProvider workflowsConfigProvider, UiConfigProvider uiConfigProvider, WorkflowAssetPrewarmer workflowAssetPrewarmer, A a2, int i3, AbstractC2541f abstractC2541f) {
        if ((i3 & 8) != 0) {
            y0 y0VarE = C.e();
            Z7.e eVar = M.f9549a;
            a2 = C.c(AbstractC1833d1.H(y0VarE, d.f13044i));
        }
        this(workflowsConfigProvider, uiConfigProvider, workflowAssetPrewarmer, a2);
    }
}
