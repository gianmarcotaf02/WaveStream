package p072i;

/* JADX INFO: loaded from: classes.dex */
public abstract class i {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final int f22649h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final p136q.C2662f f22650i;
    public static final java.lang.Object j;

    static {
        new java.util.ArrayDeque();
        f22649h = -100;
        f22650i = new p136q.C2662f(0);
        j = new java.lang.Object();
    }

    public static void b(p072i.v vVar) {
        synchronized (j) {
            try {
                p136q.C2662f c2662f = f22650i;
                c2662f.getClass();
                p136q.C2657a c2657a = new p136q.C2657a(c2662f);
                while (c2657a.hasNext()) {
                    p072i.i iVar = (p072i.i) ((java.lang.ref.WeakReference) c2657a.next()).get();
                    if (iVar == vVar || iVar == null) {
                        c2657a.remove();
                    }
                }
            } catch (java.lang.Throwable th) {
                throw th;
            }
        }
    }

    public abstract void a();

    public abstract boolean c(int i3);
}
