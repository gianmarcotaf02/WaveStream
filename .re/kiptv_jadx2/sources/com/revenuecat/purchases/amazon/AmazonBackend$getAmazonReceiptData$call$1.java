package com.revenuecat.purchases.amazon;

import androidx.media3.extractor.text.ttml.TtmlNode;
import com.revenuecat.purchases.PurchasesError;
import com.revenuecat.purchases.common.Delay;
import com.revenuecat.purchases.common.networking.Endpoint;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.m;
import kotlin.jvm.internal.o;
import org.json.JSONObject;
import p070h6.A;
import p070h6.k;
import p194x6.j;
import p194x6.n;

@Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lh6/A;", "invoke", "()V", "<anonymous>"}, k = 3, mv = {1, 8, 0})
public final class AmazonBackend$getAmazonReceiptData$call$1 extends o implements Function0 {
    final List<String> $cacheKey;
    final String $receiptId;
    final String $storeUserID;
    final AmazonBackend this$0;

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lcom/revenuecat/purchases/PurchasesError;", "error", "Lh6/A;", "invoke", "(Lcom/revenuecat/purchases/PurchasesError;)V", "<anonymous>"}, k = 3, mv = {1, 8, 0})
    public static final class AnonymousClass1 extends o implements j {
        final List<String> $cacheKey;
        final AmazonBackend this$0;

        public AnonymousClass1(AmazonBackend amazonBackend, List<String> list) {
            super(1);
            this.this$0 = amazonBackend;
            this.$cacheKey = list;
        }

        @Override
        public Object invoke(Object obj) {
            invoke((PurchasesError) obj);
            return A.f22523a;
        }

        public final void invoke(PurchasesError error) {
            List<k> listRemove;
            m.e(error, "error");
            AmazonBackend amazonBackend = this.this$0;
            List<String> list = this.$cacheKey;
            synchronized (amazonBackend) {
                listRemove = amazonBackend.getPostAmazonReceiptCallbacks().remove(list);
            }
            if (listRemove != null) {
                Iterator<T> it = listRemove.iterator();
                while (it.hasNext()) {
                    ((j) ((k) it.next()).f22540i).invoke(error);
                }
            }
        }
    }

    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\t\u001a\u00020\u00062\b\u0010\u0001\u001a\u0004\u0018\u00010\u00002\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\n¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Lcom/revenuecat/purchases/PurchasesError;", "error", "", "<anonymous parameter 1>", "Lorg/json/JSONObject;", TtmlNode.TAG_BODY, "Lh6/A;", "invoke", "(Lcom/revenuecat/purchases/PurchasesError;ILorg/json/JSONObject;)V", "<anonymous>"}, k = 3, mv = {1, 8, 0})
    public static final class AnonymousClass2 extends o implements n {
        final List<String> $cacheKey;
        final AmazonBackend this$0;

        public AnonymousClass2(AmazonBackend amazonBackend, List<String> list) {
            super(3);
            this.this$0 = amazonBackend;
            this.$cacheKey = list;
        }

        @Override
        public Object invoke(Object obj, Object obj2, Object obj3) {
            invoke((PurchasesError) obj, ((Number) obj2).intValue(), (JSONObject) obj3);
            return A.f22523a;
        }

        public final void invoke(PurchasesError purchasesError, int i3, JSONObject body) {
            List<k> listRemove;
            m.e(body, "body");
            AmazonBackend amazonBackend = this.this$0;
            List<String> list = this.$cacheKey;
            synchronized (amazonBackend) {
                listRemove = amazonBackend.getPostAmazonReceiptCallbacks().remove(list);
            }
            if (listRemove != null) {
                for (k kVar : listRemove) {
                    j jVar = (j) kVar.f22539h;
                    j jVar2 = (j) kVar.f22540i;
                    if (purchasesError != null) {
                        jVar2.invoke(purchasesError);
                    } else {
                        jVar.invoke(body);
                    }
                }
            }
        }
    }

    public AmazonBackend$getAmazonReceiptData$call$1(AmazonBackend amazonBackend, String str, String str2, List<String> list) {
        super(0);
        this.this$0 = amazonBackend;
        this.$storeUserID = str;
        this.$receiptId = str2;
        this.$cacheKey = list;
    }

    @Override
    public Object invoke() {
        m126invoke();
        return A.f22523a;
    }

    public final void m126invoke() {
        this.this$0.backendHelper.performRequest(new Endpoint.GetAmazonReceipt(this.$storeUserID, this.$receiptId), null, null, Delay.NONE, new AnonymousClass1(this.this$0, this.$cacheKey), new AnonymousClass2(this.this$0, this.$cacheKey));
    }
}
