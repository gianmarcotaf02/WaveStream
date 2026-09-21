package com.revenuecat.purchases.common.offerings;

/* JADX INFO: loaded from: classes4.dex */
@kotlin.Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lh6/A;", "invoke", "()V", "<anonymous>"}, k = 3, mv = {1, 8, 0})
public final class OfferingsManager$vendCachedOfferingsAndMaybeRefresh$dispatchSuccess$1 extends kotlin.jvm.internal.o implements kotlin.jvm.functions.Function0 {
    final /* synthetic */ com.revenuecat.purchases.Offerings $cachedOfferings;
    final /* synthetic */ p194x6.j $onSuccess;
    final /* synthetic */ com.revenuecat.purchases.common.offerings.OfferingsManager this$0;

    /* JADX INFO: renamed from: com.revenuecat.purchases.common.offerings.OfferingsManager$vendCachedOfferingsAndMaybeRefresh$dispatchSuccess$1$1, reason: invalid class name */
    @kotlin.Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lh6/A;", "invoke", "()V", "<anonymous>"}, k = 3, mv = {1, 8, 0})
    public static final class AnonymousClass1 extends kotlin.jvm.internal.o implements kotlin.jvm.functions.Function0 {
        final /* synthetic */ com.revenuecat.purchases.Offerings $cachedOfferings;
        final /* synthetic */ p194x6.j $onSuccess;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(p194x6.j jVar, com.revenuecat.purchases.Offerings offerings) {
            super(0);
            this.$onSuccess = jVar;
            this.$cachedOfferings = offerings;
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ java.lang.Object invoke() {
            m166invoke();
            return p070h6.A.f22523a;
        }

        /* JADX INFO: renamed from: invoke, reason: collision with other method in class */
        public final void m166invoke() {
            p194x6.j jVar = this.$onSuccess;
            if (jVar != null) {
                jVar.invoke(this.$cachedOfferings);
            }
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OfferingsManager$vendCachedOfferingsAndMaybeRefresh$dispatchSuccess$1(com.revenuecat.purchases.common.offerings.OfferingsManager offeringsManager, p194x6.j jVar, com.revenuecat.purchases.Offerings offerings) {
        super(0);
        this.this$0 = offeringsManager;
        this.$onSuccess = jVar;
        this.$cachedOfferings = offerings;
    }

    @Override // kotlin.jvm.functions.Function0
    public /* bridge */ /* synthetic */ java.lang.Object invoke() {
        m165invoke();
        return p070h6.A.f22523a;
    }

    /* JADX INFO: renamed from: invoke, reason: collision with other method in class */
    public final void m165invoke() {
        this.this$0.dispatch(new com.revenuecat.purchases.common.offerings.OfferingsManager$vendCachedOfferingsAndMaybeRefresh$dispatchSuccess$1.AnonymousClass1(this.$onSuccess, this.$cachedOfferings));
    }
}
