package com.revenuecat.purchases.amazon;

/* JADX INFO: loaded from: classes4.dex */
@kotlin.Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lh6/A;", "invoke", "()V", "<anonymous>"}, k = 3, mv = {1, 8, 0})
public final class AmazonBackend$getAmazonReceiptData$call$1 extends kotlin.jvm.internal.o implements kotlin.jvm.functions.Function0 {
    final /* synthetic */ java.util.List<java.lang.String> $cacheKey;
    final /* synthetic */ java.lang.String $receiptId;
    final /* synthetic */ java.lang.String $storeUserID;
    final /* synthetic */ com.revenuecat.purchases.amazon.AmazonBackend this$0;

    /* JADX INFO: renamed from: com.revenuecat.purchases.amazon.AmazonBackend$getAmazonReceiptData$call$1$1, reason: invalid class name */
    @kotlin.Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lcom/revenuecat/purchases/PurchasesError;", "error", "Lh6/A;", "invoke", "(Lcom/revenuecat/purchases/PurchasesError;)V", "<anonymous>"}, k = 3, mv = {1, 8, 0})
    public static final class AnonymousClass1 extends kotlin.jvm.internal.o implements p194x6.j {
        final /* synthetic */ java.util.List<java.lang.String> $cacheKey;
        final /* synthetic */ com.revenuecat.purchases.amazon.AmazonBackend this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(com.revenuecat.purchases.amazon.AmazonBackend amazonBackend, java.util.List<java.lang.String> list) {
            super(1);
            this.this$0 = amazonBackend;
            this.$cacheKey = list;
        }

        @Override // p194x6.j
        public /* bridge */ /* synthetic */ java.lang.Object invoke(java.lang.Object obj) {
            invoke((com.revenuecat.purchases.PurchasesError) obj);
            return p070h6.A.f22523a;
        }

        public final void invoke(com.revenuecat.purchases.PurchasesError error) {
            java.util.List<p070h6.k> listRemove;
            kotlin.jvm.internal.m.e(error, "error");
            com.revenuecat.purchases.amazon.AmazonBackend amazonBackend = this.this$0;
            java.util.List<java.lang.String> list = this.$cacheKey;
            synchronized (amazonBackend) {
                listRemove = amazonBackend.getPostAmazonReceiptCallbacks().remove(list);
            }
            if (listRemove != null) {
                java.util.Iterator<T> it = listRemove.iterator();
                while (it.hasNext()) {
                    ((p194x6.j) ((p070h6.k) it.next()).f22540i).invoke(error);
                }
            }
        }
    }

    /* JADX INFO: renamed from: com.revenuecat.purchases.amazon.AmazonBackend$getAmazonReceiptData$call$1$2, reason: invalid class name */
    @kotlin.Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\t\u001a\u00020\u00062\b\u0010\u0001\u001a\u0004\u0018\u00010\u00002\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\n¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Lcom/revenuecat/purchases/PurchasesError;", "error", "", "<anonymous parameter 1>", "Lorg/json/JSONObject;", androidx.media3.extractor.text.ttml.TtmlNode.TAG_BODY, "Lh6/A;", "invoke", "(Lcom/revenuecat/purchases/PurchasesError;ILorg/json/JSONObject;)V", "<anonymous>"}, k = 3, mv = {1, 8, 0})
    public static final class AnonymousClass2 extends kotlin.jvm.internal.o implements p194x6.n {
        final /* synthetic */ java.util.List<java.lang.String> $cacheKey;
        final /* synthetic */ com.revenuecat.purchases.amazon.AmazonBackend this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass2(com.revenuecat.purchases.amazon.AmazonBackend amazonBackend, java.util.List<java.lang.String> list) {
            super(3);
            this.this$0 = amazonBackend;
            this.$cacheKey = list;
        }

        @Override // p194x6.n
        public /* bridge */ /* synthetic */ java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2, java.lang.Object obj3) {
            invoke((com.revenuecat.purchases.PurchasesError) obj, ((java.lang.Number) obj2).intValue(), (org.json.JSONObject) obj3);
            return p070h6.A.f22523a;
        }

        public final void invoke(com.revenuecat.purchases.PurchasesError purchasesError, int i3, org.json.JSONObject body) {
            java.util.List<p070h6.k> listRemove;
            kotlin.jvm.internal.m.e(body, "body");
            com.revenuecat.purchases.amazon.AmazonBackend amazonBackend = this.this$0;
            java.util.List<java.lang.String> list = this.$cacheKey;
            synchronized (amazonBackend) {
                listRemove = amazonBackend.getPostAmazonReceiptCallbacks().remove(list);
            }
            if (listRemove != null) {
                for (p070h6.k kVar : listRemove) {
                    p194x6.j jVar = (p194x6.j) kVar.f22539h;
                    p194x6.j jVar2 = (p194x6.j) kVar.f22540i;
                    if (purchasesError != null) {
                        jVar2.invoke(purchasesError);
                    } else {
                        jVar.invoke(body);
                    }
                }
            }
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AmazonBackend$getAmazonReceiptData$call$1(com.revenuecat.purchases.amazon.AmazonBackend amazonBackend, java.lang.String str, java.lang.String str2, java.util.List<java.lang.String> list) {
        super(0);
        this.this$0 = amazonBackend;
        this.$storeUserID = str;
        this.$receiptId = str2;
        this.$cacheKey = list;
    }

    @Override // kotlin.jvm.functions.Function0
    public /* bridge */ /* synthetic */ java.lang.Object invoke() {
        m126invoke();
        return p070h6.A.f22523a;
    }

    /* JADX INFO: renamed from: invoke, reason: collision with other method in class */
    public final void m126invoke() {
        this.this$0.backendHelper.performRequest(new com.revenuecat.purchases.common.networking.Endpoint.GetAmazonReceipt(this.$storeUserID, this.$receiptId), null, null, com.revenuecat.purchases.common.Delay.NONE, new com.revenuecat.purchases.amazon.AmazonBackend$getAmazonReceiptData$call$1.AnonymousClass1(this.this$0, this.$cacheKey), new com.revenuecat.purchases.amazon.AmazonBackend$getAmazonReceiptData$call$1.AnonymousClass2(this.this$0, this.$cacheKey));
    }
}
