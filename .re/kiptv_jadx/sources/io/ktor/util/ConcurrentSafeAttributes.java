package io.ktor.util;

/* JADX INFO: loaded from: classes4.dex */
@kotlin.Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0002\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J5\u0010\n\u001a\u00028\u0000\"\b\b\u0000\u0010\u0005*\u00020\u00042\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00028\u00000\u00062\f\u0010\t\u001a\b\u0012\u0004\u0012\u00028\u00000\bH\u0016¢\u0006\u0004\b\n\u0010\u000bR,\u0010\r\u001a\u0014\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u0006\u0012\u0006\u0012\u0004\u0018\u00010\u00040\f8\u0014X\u0094\u0004¢\u0006\f\n\u0004\b\r\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010¨\u0006\u0011"}, d2 = {"Lio/ktor/util/ConcurrentSafeAttributes;", "Lio/ktor/util/AttributesJvmBase;", "<init>", "()V", "", "T", "Lio/ktor/util/AttributeKey;", com.revenuecat.purchases.subscriberattributes.SubscriberAttributeKt.JSON_NAME_KEY, "Lkotlin/Function0;", "block", "computeIfAbsent", "(Lio/ktor/util/AttributeKey;Lkotlin/jvm/functions/Function0;)Ljava/lang/Object;", "Ljava/util/concurrent/ConcurrentHashMap;", "map", "Ljava/util/concurrent/ConcurrentHashMap;", "getMap", "()Ljava/util/concurrent/ConcurrentHashMap;", "ktor-utils"}, k = 1, mv = {2, 1, 0}, xi = androidx.media3.container.NalUnitUtil.H265_NAL_UNIT_TYPE_UNSPECIFIED)
final class ConcurrentSafeAttributes extends io.ktor.util.AttributesJvmBase {
    private final java.util.concurrent.ConcurrentHashMap<io.ktor.util.AttributeKey<?>, java.lang.Object> map = new java.util.concurrent.ConcurrentHashMap<>();

    @Override // io.ktor.util.Attributes
    public <T> T computeIfAbsent(io.ktor.util.AttributeKey<T> key, kotlin.jvm.functions.Function0 block) {
        kotlin.jvm.internal.m.e(key, "key");
        kotlin.jvm.internal.m.e(block, "block");
        T t9 = (T) getMap().get(key);
        if (t9 != null) {
            return t9;
        }
        T t10 = (T) block.invoke();
        java.lang.Object objPutIfAbsent = getMap().putIfAbsent(key, t10);
        if (objPutIfAbsent != null) {
            t10 = (T) objPutIfAbsent;
        }
        kotlin.jvm.internal.m.c(t10, "null cannot be cast to non-null type T of io.ktor.util.ConcurrentSafeAttributes.computeIfAbsent");
        return t10;
    }

    @Override // io.ktor.util.AttributesJvmBase
    public java.util.concurrent.ConcurrentHashMap<io.ktor.util.AttributeKey<?>, java.lang.Object> getMap() {
        return this.map;
    }
}
