package T4;

/* JADX INFO: loaded from: classes.dex */
public final class e extends java.util.LinkedHashMap {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final /* synthetic */ T4.g f9824h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(T4.g gVar) {
        super(16, 0.75f, true);
        this.f9824h = gVar;
    }

    @Override // java.util.LinkedHashMap, java.util.HashMap, java.util.AbstractMap, java.util.Map
    public final /* bridge */ boolean containsValue(java.lang.Object obj) {
        if (obj instanceof T4.b) {
            return super.containsValue((T4.b) obj);
        }
        return false;
    }

    @Override // java.util.HashMap, java.util.Map
    public final /* bridge */ boolean remove(java.lang.Object obj, java.lang.Object obj2) {
        if (obj != null && (obj2 instanceof T4.b)) {
            return super.remove(obj, (T4.b) obj2);
        }
        return false;
    }

    @Override // java.util.LinkedHashMap
    public final boolean removeEldestEntry(java.util.Map.Entry entry) {
        return super.size() > this.f9824h.f9831a;
    }
}
