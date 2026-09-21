package p136q;

/* JADX INFO: loaded from: classes.dex */
public abstract class N {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final java.lang.Object[] f26348a = new java.lang.Object[0];

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final p136q.D f26349b = new p136q.D(0);

    public static final void a(int i3, java.util.List list) {
        int size = list.size();
        if (i3 < 0 || i3 >= size) {
            p144r.a.d("Index " + i3 + " is out of bounds. The list has " + size + " elements.");
            throw null;
        }
    }

    public static final void b(int i3, int i9, java.util.List list) {
        int size = list.size();
        if (i3 > i9) {
            p144r.a.c("Indices are out of order. fromIndex (" + i3 + ") is greater than toIndex (" + i9 + ").");
            throw null;
        }
        if (i3 < 0) {
            p144r.a.d("fromIndex (" + i3 + ") is less than 0.");
            throw null;
        }
        if (i9 <= size) {
            return;
        }
        p144r.a.d("toIndex (" + i9 + ") is more than than the list size (" + size + ')');
        throw null;
    }
}
