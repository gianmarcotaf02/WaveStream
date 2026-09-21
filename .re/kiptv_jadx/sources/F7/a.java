package F7;

/* JADX INFO: loaded from: classes4.dex */
public final class a extends java.util.ArrayList implements F7.g {
    @Override // java.util.ArrayList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final /* bridge */ boolean contains(java.lang.Object obj) {
        if (obj instanceof C7.P) {
            return super.contains((C7.P) obj);
        }
        return false;
    }

    @Override // java.util.ArrayList, java.util.AbstractList, java.util.List
    public final /* bridge */ int indexOf(java.lang.Object obj) {
        if (obj instanceof C7.P) {
            return super.indexOf((C7.P) obj);
        }
        return -1;
    }

    @Override // java.util.ArrayList, java.util.AbstractList, java.util.List
    public final /* bridge */ int lastIndexOf(java.lang.Object obj) {
        if (obj instanceof C7.P) {
            return super.lastIndexOf((C7.P) obj);
        }
        return -1;
    }

    @Override // java.util.ArrayList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final /* bridge */ boolean remove(java.lang.Object obj) {
        if (obj instanceof C7.P) {
            return super.remove((C7.P) obj);
        }
        return false;
    }
}
