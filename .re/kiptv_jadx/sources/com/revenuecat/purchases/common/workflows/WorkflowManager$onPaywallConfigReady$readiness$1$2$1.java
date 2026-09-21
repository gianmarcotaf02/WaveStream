package com.revenuecat.purchases.common.workflows;

/* JADX INFO: loaded from: classes4.dex */
@kotlin.Metadata(d1 = {"\u0000\u000e\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\b\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"", "it", "Lh6/A;", "invoke", "(Ljava/lang/Throwable;)V", "<anonymous>"}, k = 3, mv = {1, 8, 0})
public final class WorkflowManager$onPaywallConfigReady$readiness$1$2$1 extends kotlin.jvm.internal.o implements p194x6.j {
    final /* synthetic */ S7.F $deferred;
    final /* synthetic */ com.revenuecat.purchases.common.workflows.WorkflowManager this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public WorkflowManager$onPaywallConfigReady$readiness$1$2$1(com.revenuecat.purchases.common.workflows.WorkflowManager workflowManager, S7.F f9) {
        super(1);
        this.this$0 = workflowManager;
        this.$deferred = f9;
    }

    @Override // p194x6.j
    public /* bridge */ /* synthetic */ java.lang.Object invoke(java.lang.Object obj) {
        invoke((java.lang.Throwable) obj);
        return p070h6.A.f22523a;
    }

    public final void invoke(java.lang.Throwable th) {
        java.lang.Object obj = this.this$0.readinessLock;
        com.revenuecat.purchases.common.workflows.WorkflowManager workflowManager = this.this$0;
        S7.F f9 = this.$deferred;
        synchronized (obj) {
            if (workflowManager.inFlightReadiness == f9) {
                workflowManager.inFlightReadiness = null;
            }
        }
    }
}
