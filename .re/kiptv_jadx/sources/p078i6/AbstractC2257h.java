package p078i6;

/* JADX INFO: renamed from: i6.h, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public abstract class AbstractC2257h extends java.util.AbstractList implements java.util.List, p201y6.c {
    public abstract int d();

    public abstract java.lang.Object e(int i3);

    @Override // java.util.AbstractList, java.util.List
    public final /* bridge */ java.lang.Object remove(int i3) {
        return e(i3);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final /* bridge */ int size() {
        return d();
    }
}
