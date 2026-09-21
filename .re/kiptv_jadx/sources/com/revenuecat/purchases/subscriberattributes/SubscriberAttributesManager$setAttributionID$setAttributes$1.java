package com.revenuecat.purchases.subscriberattributes;

/* JADX INFO: loaded from: classes4.dex */
@kotlin.Metadata(d1 = {"\u0000\u0012\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0006\u001a\u00020\u00032\u0014\u0010\u0002\u001a\u0010\u0012\u0004\u0012\u00020\u0001\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"", "", "deviceIdentifiers", "Lh6/A;", "invoke", "(Ljava/util/Map;)V", "<anonymous>"}, k = 3, mv = {1, 8, 0})
public final class SubscriberAttributesManager$setAttributionID$setAttributes$1 extends kotlin.jvm.internal.o implements p194x6.j {
    final /* synthetic */ java.lang.String $appUserID;
    final /* synthetic */ com.revenuecat.purchases.common.subscriberattributes.SubscriberAttributeKey.AttributionIds $attributionKey;
    final /* synthetic */ java.lang.String $value;
    final /* synthetic */ com.revenuecat.purchases.subscriberattributes.SubscriberAttributesManager this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SubscriberAttributesManager$setAttributionID$setAttributes$1(com.revenuecat.purchases.common.subscriberattributes.SubscriberAttributeKey.AttributionIds attributionIds, java.lang.String str, com.revenuecat.purchases.subscriberattributes.SubscriberAttributesManager subscriberAttributesManager, java.lang.String str2) {
        super(1);
        this.$attributionKey = attributionIds;
        this.$value = str;
        this.this$0 = subscriberAttributesManager;
        this.$appUserID = str2;
    }

    @Override // p194x6.j
    public /* bridge */ /* synthetic */ java.lang.Object invoke(java.lang.Object obj) {
        invoke((java.util.Map<java.lang.String, java.lang.String>) obj);
        return p070h6.A.f22523a;
    }

    public final void invoke(java.util.Map<java.lang.String, java.lang.String> deviceIdentifiers) {
        kotlin.jvm.internal.m.e(deviceIdentifiers, "deviceIdentifiers");
        this.this$0.setAttributes(p078i6.C.R0(p078i6.D.J0(new p070h6.k(this.$attributionKey.getBackendKey(), this.$value)), deviceIdentifiers), this.$appUserID);
    }
}
