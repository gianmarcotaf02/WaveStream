package com.revenuecat.purchases.common.offerings;

import com.revenuecat.purchases.Offerings;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.o;
import p070h6.A;
import p194x6.j;

@Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lh6/A;", "invoke", "()V", "<anonymous>"}, k = 3, mv = {1, 8, 0})
public final class OfferingsManager$vendCachedOfferingsAndMaybeRefresh$dispatchSuccess$1 extends o implements Function0 {
    final Offerings $cachedOfferings;
    final j $onSuccess;
    final OfferingsManager this$0;

    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lh6/A;", "invoke", "()V", "<anonymous>"}, k = 3, mv = {1, 8, 0})
    public static final class AnonymousClass1 extends o implements Function0 {
        final Offerings $cachedOfferings;
        final j $onSuccess;

        public AnonymousClass1(j jVar, Offerings offerings) {
            super(0);
            this.$onSuccess = jVar;
            this.$cachedOfferings = offerings;
        }

        @Override
        public Object invoke() {
            m166invoke();
            return A.f22523a;
        }

        public final void m166invoke() {
            j jVar = this.$onSuccess;
            if (jVar != null) {
                jVar.invoke(this.$cachedOfferings);
            }
        }
    }

    public OfferingsManager$vendCachedOfferingsAndMaybeRefresh$dispatchSuccess$1(OfferingsManager offeringsManager, j jVar, Offerings offerings) {
        super(0);
        this.this$0 = offeringsManager;
        this.$onSuccess = jVar;
        this.$cachedOfferings = offerings;
    }

    @Override
    public Object invoke() {
        m165invoke();
        return A.f22523a;
    }

    public final void m165invoke() {
        this.this$0.dispatch(new AnonymousClass1(this.$onSuccess, this.$cachedOfferings));
    }
}
