package com.revenuecat.purchases.google.usecase;

/* JADX INFO: loaded from: classes4.dex */
@kotlin.Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0010\u000b\n\u0002\b\u0007\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0087\u0001\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00060\u0005\u0012\u0016\u0010\n\u001a\u0012\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\u00060\u0005j\u0002`\t\u0012\u001e\u0010\f\u001a\u001a\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\u00060\u0005\u0012\u0004\u0012\u00020\u00060\u0005\u0012*\u0010\u0010\u001a&\u0012\u0004\u0012\u00020\u000e\u0012\u0012\u0012\u0010\u0012\u0006\u0012\u0004\u0018\u00010\b\u0012\u0004\u0012\u00020\u00060\u0005\u0012\u0004\u0012\u00020\u00060\rj\u0002`\u000f¢\u0006\u0004\b\u0011\u0010\u0012J\u000f\u0010\u0013\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u0013\u0010\u0014J\u0017\u0010\u0016\u001a\u00020\u00062\u0006\u0010\u0015\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0016\u0010\u0017R\u0014\u0010\u0004\u001a\u00020\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0004\u0010\u0018R#\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00060\u00058\u0006¢\u0006\f\n\u0004\b\u0007\u0010\u0019\u001a\u0004\b\u001a\u0010\u001bR'\u0010\n\u001a\u0012\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\u00060\u0005j\u0002`\t8\u0006¢\u0006\f\n\u0004\b\n\u0010\u0019\u001a\u0004\b\u001c\u0010\u001bR/\u0010\f\u001a\u001a\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\u00060\u0005\u0012\u0004\u0012\u00020\u00060\u00058\u0006¢\u0006\f\n\u0004\b\f\u0010\u0019\u001a\u0004\b\u001d\u0010\u001bR\u0014\u0010!\u001a\u00020\u001e8TX\u0094\u0004¢\u0006\u0006\u001a\u0004\b\u001f\u0010 R\u0014\u0010$\u001a\u00020\u00028VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\"\u0010#¨\u0006%"}, d2 = {"Lcom/revenuecat/purchases/google/usecase/ConsumePurchaseUseCase;", "Lcom/revenuecat/purchases/google/usecase/BillingClientUseCase;", "", "Lcom/revenuecat/purchases/google/usecase/ConsumePurchaseUseCaseParams;", "useCaseParams", "Lkotlin/Function1;", "Lh6/A;", "onReceive", "Lcom/revenuecat/purchases/PurchasesError;", "Lcom/revenuecat/purchases/PurchasesErrorCallback;", "onError", "LY2/b;", "withConnectedClient", "Lkotlin/Function2;", "", "Lcom/revenuecat/purchases/google/usecase/ExecuteRequestOnUIThreadFunction;", "executeRequestOnUIThread", "<init>", "(Lcom/revenuecat/purchases/google/usecase/ConsumePurchaseUseCaseParams;Lx6/j;Lx6/j;Lx6/j;Lx6/m;)V", "executeAsync", "()V", "received", "onOk", "(Ljava/lang/String;)V", "Lcom/revenuecat/purchases/google/usecase/ConsumePurchaseUseCaseParams;", "Lx6/j;", "getOnReceive", "()Lx6/j;", "getOnError", "getWithConnectedClient", "", "getBackoffForNetworkErrors", "()Z", "backoffForNetworkErrors", "getErrorMessage", "()Ljava/lang/String;", "errorMessage", "purchases_defaultsRelease"}, k = 1, mv = {1, 8, 0}, xi = androidx.media3.container.NalUnitUtil.H265_NAL_UNIT_TYPE_UNSPECIFIED)
public final class ConsumePurchaseUseCase extends com.revenuecat.purchases.google.usecase.BillingClientUseCase<java.lang.String> {
    private final p194x6.j onError;
    private final p194x6.j onReceive;
    private final com.revenuecat.purchases.google.usecase.ConsumePurchaseUseCaseParams useCaseParams;
    private final p194x6.j withConnectedClient;

    @kotlin.Metadata(k = 3, mv = {1, 8, 0}, xi = androidx.media3.container.NalUnitUtil.H265_NAL_UNIT_TYPE_UNSPECIFIED)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[com.revenuecat.purchases.PostReceiptInitiationSource.values().length];
            try {
                iArr[com.revenuecat.purchases.PostReceiptInitiationSource.RESTORE.ordinal()] = 1;
            } catch (java.lang.NoSuchFieldError unused) {
            }
            try {
                iArr[com.revenuecat.purchases.PostReceiptInitiationSource.PURCHASE.ordinal()] = 2;
            } catch (java.lang.NoSuchFieldError unused2) {
            }
            try {
                iArr[com.revenuecat.purchases.PostReceiptInitiationSource.UNSYNCED_ACTIVE_PURCHASES.ordinal()] = 3;
            } catch (java.lang.NoSuchFieldError unused3) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    /* JADX INFO: renamed from: com.revenuecat.purchases.google.usecase.ConsumePurchaseUseCase$executeAsync$1, reason: invalid class name */
    @kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0004\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"LY2/b;", "Lh6/A;", "invoke", "(LY2/b;)V", "<anonymous>"}, k = 3, mv = {1, 8, 0})
    public static final class AnonymousClass1 extends kotlin.jvm.internal.o implements p194x6.j {
        public AnonymousClass1() {
            super(1);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void invoke$lambda$0(com.revenuecat.purchases.google.usecase.ConsumePurchaseUseCase consumePurchaseUseCase, Y2.C1040j billingResult, java.lang.String purchaseToken) {
            kotlin.jvm.internal.m.e(billingResult, "billingResult");
            kotlin.jvm.internal.m.e(purchaseToken, "purchaseToken");
            com.revenuecat.purchases.google.usecase.BillingClientUseCase.processResult$default(consumePurchaseUseCase, billingResult, purchaseToken, null, new com.revenuecat.purchases.google.usecase.ConsumePurchaseUseCase$executeAsync$1$1$1(consumePurchaseUseCase), 4, null);
        }

        @Override // p194x6.j
        public /* bridge */ /* synthetic */ java.lang.Object invoke(java.lang.Object obj) {
            invoke((Y2.AbstractC1032b) obj);
            return p070h6.A.f22523a;
        }

        public final void invoke(Y2.AbstractC1032b invoke) {
            kotlin.jvm.internal.m.e(invoke, "$this$invoke");
            java.lang.String purchaseToken = com.revenuecat.purchases.google.usecase.ConsumePurchaseUseCase.this.useCaseParams.getPurchaseToken();
            if (purchaseToken == null) {
                throw new java.lang.IllegalArgumentException("Purchase token must be set");
            }
            N6.A a2 = new N6.A(3);
            a2.f7359i = purchaseToken;
            invoke.b(a2, new com.revenuecat.purchases.google.usecase.a(com.revenuecat.purchases.google.usecase.ConsumePurchaseUseCase.this));
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ConsumePurchaseUseCase(com.revenuecat.purchases.google.usecase.ConsumePurchaseUseCaseParams useCaseParams, p194x6.j onReceive, p194x6.j onError, p194x6.j withConnectedClient, p194x6.m executeRequestOnUIThread) {
        super(useCaseParams, onError, executeRequestOnUIThread);
        kotlin.jvm.internal.m.e(useCaseParams, "useCaseParams");
        kotlin.jvm.internal.m.e(onReceive, "onReceive");
        kotlin.jvm.internal.m.e(onError, "onError");
        kotlin.jvm.internal.m.e(withConnectedClient, "withConnectedClient");
        kotlin.jvm.internal.m.e(executeRequestOnUIThread, "executeRequestOnUIThread");
        this.useCaseParams = useCaseParams;
        this.onReceive = onReceive;
        this.onError = onError;
        this.withConnectedClient = withConnectedClient;
    }

    @Override // com.revenuecat.purchases.google.usecase.BillingClientUseCase
    public void executeAsync() {
        this.withConnectedClient.invoke(new com.revenuecat.purchases.google.usecase.ConsumePurchaseUseCase.AnonymousClass1());
    }

    @Override // com.revenuecat.purchases.google.usecase.BillingClientUseCase
    public boolean getBackoffForNetworkErrors() {
        int i3 = com.revenuecat.purchases.google.usecase.ConsumePurchaseUseCase.WhenMappings.$EnumSwitchMapping$0[this.useCaseParams.getInitiationSource().ordinal()];
        if (i3 == 1 || i3 == 2) {
            return false;
        }
        if (i3 == 3) {
            return true;
        }
        throw new I3.b();
    }

    @Override // com.revenuecat.purchases.google.usecase.BillingClientUseCase
    public java.lang.String getErrorMessage() {
        return "Error consuming purchase";
    }

    public final p194x6.j getOnError() {
        return this.onError;
    }

    public final p194x6.j getOnReceive() {
        return this.onReceive;
    }

    public final p194x6.j getWithConnectedClient() {
        return this.withConnectedClient;
    }

    @Override // com.revenuecat.purchases.google.usecase.BillingClientUseCase
    public void onOk(java.lang.String received) {
        kotlin.jvm.internal.m.e(received, "received");
        this.onReceive.invoke(received);
    }
}
