package p076i4;

/* JADX INFO: loaded from: classes.dex */
public abstract class e1 extends java.util.AbstractSet {
    @Override // java.util.AbstractSet, java.util.AbstractCollection, java.util.Collection, java.util.Set
    public boolean removeAll(java.util.Collection collection) {
        return p076i4.AbstractC2230y.t(this, collection);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public boolean retainAll(java.util.Collection collection) {
        collection.getClass();
        return super.retainAll(collection);
    }
}
