package com.revenuecat.purchases.common.workflows;

import S7.F;
import kotlin.Metadata;
import kotlin.jvm.internal.o;
import p070h6.A;
import p194x6.j;

@Metadata(d1 = {"\u0000\u000e\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\b\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"", "it", "Lh6/A;", "invoke", "(Ljava/lang/Throwable;)V", "<anonymous>"}, k = 3, mv = {1, 8, 0})
public final class WorkflowManager$onPaywallConfigReady$readiness$1$2$1 extends o implements j {
    final F $deferred;
    final WorkflowManager this$0;

    public WorkflowManager$onPaywallConfigReady$readiness$1$2$1(WorkflowManager workflowManager, F f9) {
        super(1);
        this.this$0 = workflowManager;
        this.$deferred = f9;
    }

    @Override
    public Object invoke(Object obj) {
        invoke((Throwable) obj);
        return A.f22523a;
    }

    public final void invoke(Throwable th) {
        Object obj = this.this$0.readinessLock;
        WorkflowManager workflowManager = this.this$0;
        F f9 = this.$deferred;
        synchronized (obj) {
            if (workflowManager.inFlightReadiness == f9) {
                workflowManager.inFlightReadiness = null;
            }
        }
    }
}
