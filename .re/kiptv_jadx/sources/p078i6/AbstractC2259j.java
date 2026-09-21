package p078i6;

/* JADX INFO: renamed from: i6.j, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public abstract class AbstractC2259j extends p078i6.AbstractC2250a implements java.util.Set {
    @Override // java.util.Collection, java.util.Set
    public final boolean equals(java.lang.Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof java.util.Set)) {
            return false;
        }
        java.util.Set other = (java.util.Set) obj;
        kotlin.jvm.internal.m.e(other, "other");
        if (size() != other.size()) {
            return false;
        }
        return containsAll(other);
    }

    @Override // java.util.Collection, java.util.Set
    public final int hashCode() {
        java.util.Iterator<E> it = iterator();
        int iHashCode = 0;
        while (it.hasNext()) {
            java.lang.Object next = it.next();
            iHashCode += next != null ? next.hashCode() : 0;
        }
        return iHashCode;
    }
}
