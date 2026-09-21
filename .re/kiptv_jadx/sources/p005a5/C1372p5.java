package p005a5;

/* JADX INFO: renamed from: a5.p5, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C1372p5 extends java.util.LinkedHashMap {
    @Override // java.util.HashMap, java.util.AbstractMap, java.util.Map
    public final /* bridge */ boolean containsKey(java.lang.Object obj) {
        if (obj instanceof java.lang.String) {
            return super.containsKey((java.lang.String) obj);
        }
        return false;
    }

    @Override // java.util.LinkedHashMap, java.util.HashMap, java.util.AbstractMap, java.util.Map
    public final /* bridge */ boolean containsValue(java.lang.Object obj) {
        if (obj instanceof p005a5.C1390r4) {
            return super.containsValue((p005a5.C1390r4) obj);
        }
        return false;
    }

    @Override // java.util.LinkedHashMap, java.util.HashMap, java.util.AbstractMap, java.util.Map
    public final /* bridge */ java.lang.Object get(java.lang.Object obj) {
        if (obj instanceof java.lang.String) {
            return (p005a5.C1390r4) super.get((java.lang.String) obj);
        }
        return null;
    }

    @Override // java.util.LinkedHashMap, java.util.HashMap, java.util.Map
    public final /* bridge */ java.lang.Object getOrDefault(java.lang.Object obj, java.lang.Object obj2) {
        return !(obj instanceof java.lang.String) ? obj2 : (p005a5.C1390r4) super.getOrDefault((java.lang.String) obj, (p005a5.C1390r4) obj2);
    }

    @Override // java.util.HashMap, java.util.AbstractMap, java.util.Map
    public final /* bridge */ java.lang.Object remove(java.lang.Object obj) {
        if (obj instanceof java.lang.String) {
            return (p005a5.C1390r4) super.remove((java.lang.String) obj);
        }
        return null;
    }

    @Override // java.util.LinkedHashMap
    public final boolean removeEldestEntry(java.util.Map.Entry entry) {
        return super.size() > 200;
    }

    @Override // java.util.HashMap, java.util.Map
    public final /* bridge */ boolean remove(java.lang.Object obj, java.lang.Object obj2) {
        if ((obj instanceof java.lang.String) && (obj2 instanceof p005a5.C1390r4)) {
            return super.remove((java.lang.String) obj, (p005a5.C1390r4) obj2);
        }
        return false;
    }
}
