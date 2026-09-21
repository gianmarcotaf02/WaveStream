package p076i4;

/* JADX INFO: loaded from: classes.dex */
public abstract class r implements java.util.Map.Entry {
    @Override // java.util.Map.Entry
    public final boolean equals(java.lang.Object obj) {
        if (obj instanceof java.util.Map.Entry) {
            java.util.Map.Entry entry = (java.util.Map.Entry) obj;
            if (com.google.android.gms.internal.play_billing.AbstractC1853k0.m(getKey(), entry.getKey()) && com.google.android.gms.internal.play_billing.AbstractC1853k0.m(getValue(), entry.getValue())) {
                return true;
            }
        }
        return false;
    }

    @Override // java.util.Map.Entry
    public final int hashCode() {
        java.lang.Object key = getKey();
        java.lang.Object value = getValue();
        return (key == null ? 0 : key.hashCode()) ^ (value != null ? value.hashCode() : 0);
    }

    @Override // java.util.Map.Entry
    public java.lang.Object setValue(java.lang.Object obj) {
        throw new java.lang.UnsupportedOperationException();
    }

    public final java.lang.String toString() {
        return getKey() + "=" + getValue();
    }
}
