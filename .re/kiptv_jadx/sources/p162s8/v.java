package p162s8;

/* JADX INFO: loaded from: classes4.dex */
public final class v {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final java.util.LinkedHashMap f27426a = new java.util.LinkedHashMap();

    public final kotlinx.serialization.json.c a() {
        return new kotlinx.serialization.json.c(this.f27426a);
    }

    public final kotlinx.serialization.json.b b(java.lang.String key, kotlinx.serialization.json.b element) {
        kotlin.jvm.internal.m.e(key, "key");
        kotlin.jvm.internal.m.e(element, "element");
        return (kotlinx.serialization.json.b) this.f27426a.put(key, element);
    }
}
