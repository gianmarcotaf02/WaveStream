package R8;

/* JADX INFO: loaded from: classes4.dex */
public final class a extends java.lang.InheritableThreadLocal {
    @Override // java.lang.InheritableThreadLocal
    public final java.lang.Object childValue(java.lang.Object obj) {
        java.util.Map map = (java.util.Map) obj;
        if (map == null) {
            return null;
        }
        return new java.util.HashMap(map);
    }
}
