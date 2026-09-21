package z8;

/* JADX INFO: loaded from: classes4.dex */
public final class c {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final q2.i f32966h = new q2.i(15);

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final z8.c f32967i;
    public static final java.util.logging.Logger j;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final y7.m f32968a;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public boolean f32970c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public long f32971d;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f32969b = 10000;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final java.util.ArrayList f32972e = new java.util.ArrayList();

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final java.util.ArrayList f32973f = new java.util.ArrayList();
    public final B3.r g = new B3.r(17, this);

    static {
        java.lang.String name = x8.b.g + " TaskRunner";
        kotlin.jvm.internal.m.e(name, "name");
        f32967i = new z8.c(new y7.m(new x8.a(name, true)));
        java.util.logging.Logger logger = java.util.logging.Logger.getLogger(z8.c.class.getName());
        kotlin.jvm.internal.m.d(logger, "getLogger(TaskRunner::class.java.name)");
        j = logger;
    }

    public c(y7.m mVar) {
        this.f32968a = mVar;
    }

    public static final void a(z8.c cVar, z8.a aVar) {
        cVar.getClass();
        byte[] bArr = x8.b.f31716a;
        java.lang.Thread threadCurrentThread = java.lang.Thread.currentThread();
        java.lang.String name = threadCurrentThread.getName();
        threadCurrentThread.setName(aVar.f32956a);
        try {
            long jA = aVar.a();
            synchronized (cVar) {
                cVar.b(aVar, jA);
            }
        } finally {
            synchronized (cVar) {
                cVar.b(aVar, -1L);
                threadCurrentThread.setName(name);
            }
        }
    }

    public final void b(z8.a aVar, long j9) {
        byte[] bArr = x8.b.f31716a;
        z8.b bVar = aVar.f32958c;
        kotlin.jvm.internal.m.b(bVar);
        if (bVar.f32963d != aVar) {
            throw new java.lang.IllegalStateException("Check failed.");
        }
        boolean z6 = bVar.f32965f;
        bVar.f32965f = false;
        bVar.f32963d = null;
        this.f32972e.remove(bVar);
        if (j9 != -1 && !z6 && !bVar.f32962c) {
            bVar.d(aVar, j9, true);
        }
        if (bVar.f32964e.isEmpty()) {
            return;
        }
        this.f32973f.add(bVar);
    }

    public final z8.a c() {
        long j9;
        z8.a aVar;
        boolean z6;
        byte[] bArr = x8.b.f31716a;
        while (true) {
            java.util.ArrayList arrayList = this.f32973f;
            if (arrayList.isEmpty()) {
                return null;
            }
            y7.m mVar = this.f32968a;
            long jNanoTime = java.lang.System.nanoTime();
            java.util.Iterator it = arrayList.iterator();
            long jMin = Long.MAX_VALUE;
            z8.a aVar2 = null;
            while (true) {
                if (!it.hasNext()) {
                    j9 = jNanoTime;
                    aVar = null;
                    z6 = false;
                    break;
                }
                z8.a aVar3 = (z8.a) ((z8.b) it.next()).f32964e.get(0);
                j9 = jNanoTime;
                aVar = null;
                long jMax = java.lang.Math.max(0L, aVar3.f32959d - j9);
                if (jMax > 0) {
                    jMin = java.lang.Math.min(jMax, jMin);
                } else {
                    if (aVar2 != null) {
                        z6 = true;
                        break;
                    }
                    aVar2 = aVar3;
                }
                jNanoTime = j9;
            }
            java.util.ArrayList arrayList2 = this.f32972e;
            if (aVar2 != null) {
                byte[] bArr2 = x8.b.f31716a;
                aVar2.f32959d = -1L;
                z8.b bVar = aVar2.f32958c;
                kotlin.jvm.internal.m.b(bVar);
                bVar.f32964e.remove(aVar2);
                arrayList.remove(bVar);
                bVar.f32963d = aVar2;
                arrayList2.add(bVar);
                if (z6 || (!this.f32970c && !arrayList.isEmpty())) {
                    B3.r runnable = this.g;
                    kotlin.jvm.internal.m.e(runnable, "runnable");
                    ((java.util.concurrent.ThreadPoolExecutor) mVar.f32077h).execute(runnable);
                }
                return aVar2;
            }
            if (this.f32970c) {
                if (jMin >= this.f32971d - j9) {
                    return aVar;
                }
                notify();
                return aVar;
            }
            this.f32970c = true;
            this.f32971d = j9 + jMin;
            try {
                try {
                    long j10 = jMin / 1000000;
                    long j11 = jMin - (1000000 * j10);
                    if (j10 > 0 || jMin > 0) {
                        wait(j10, (int) j11);
                    }
                } catch (java.lang.InterruptedException unused) {
                    for (int size = arrayList2.size() - 1; -1 < size; size--) {
                        ((z8.b) arrayList2.get(size)).b();
                    }
                    for (int size2 = arrayList.size() - 1; -1 < size2; size2--) {
                        z8.b bVar2 = (z8.b) arrayList.get(size2);
                        bVar2.b();
                        if (bVar2.f32964e.isEmpty()) {
                            arrayList.remove(size2);
                        }
                    }
                }
                this.f32970c = false;
            } catch (java.lang.Throwable th) {
                this.f32970c = false;
                throw th;
            }
        }
    }

    public final void d(z8.b taskQueue) {
        kotlin.jvm.internal.m.e(taskQueue, "taskQueue");
        byte[] bArr = x8.b.f31716a;
        if (taskQueue.f32963d == null) {
            boolean zIsEmpty = taskQueue.f32964e.isEmpty();
            java.util.ArrayList arrayList = this.f32973f;
            if (zIsEmpty) {
                arrayList.remove(taskQueue);
            } else {
                kotlin.jvm.internal.m.e(arrayList, "<this>");
                if (!arrayList.contains(taskQueue)) {
                    arrayList.add(taskQueue);
                }
            }
        }
        boolean z6 = this.f32970c;
        y7.m mVar = this.f32968a;
        if (z6) {
            notify();
            return;
        }
        B3.r runnable = this.g;
        kotlin.jvm.internal.m.e(runnable, "runnable");
        ((java.util.concurrent.ThreadPoolExecutor) mVar.f32077h).execute(runnable);
    }

    public final z8.b e() {
        int i3;
        synchronized (this) {
            i3 = this.f32969b;
            this.f32969b = i3 + 1;
        }
        return new z8.b(this, com.google.android.gms.internal.play_billing.M0.l(i3, "Q"));
    }
}
