package z8;

/* JADX INFO: loaded from: classes4.dex */
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final z8.c f32960a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final java.lang.String f32961b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public boolean f32962c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public z8.a f32963d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final java.util.ArrayList f32964e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public boolean f32965f;

    public b(z8.c taskRunner, java.lang.String name) {
        kotlin.jvm.internal.m.e(taskRunner, "taskRunner");
        kotlin.jvm.internal.m.e(name, "name");
        this.f32960a = taskRunner;
        this.f32961b = name;
        this.f32964e = new java.util.ArrayList();
    }

    public final void a() {
        byte[] bArr = x8.b.f31716a;
        synchronized (this.f32960a) {
            if (b()) {
                this.f32960a.d(this);
            }
        }
    }

    public final boolean b() {
        z8.a aVar = this.f32963d;
        if (aVar != null && aVar.f32957b) {
            this.f32965f = true;
        }
        java.util.ArrayList arrayList = this.f32964e;
        boolean z6 = false;
        for (int size = arrayList.size() - 1; -1 < size; size--) {
            if (((z8.a) arrayList.get(size)).f32957b) {
                z8.a aVar2 = (z8.a) arrayList.get(size);
                q2.i iVar = z8.c.f32966h;
                if (z8.c.j.isLoggable(java.util.logging.Level.FINE)) {
                    com.google.common.util.concurrent.D.c(aVar2, this, "canceled");
                }
                arrayList.remove(size);
                z6 = true;
            }
        }
        return z6;
    }

    public final void c(z8.a task, long j) {
        kotlin.jvm.internal.m.e(task, "task");
        synchronized (this.f32960a) {
            if (!this.f32962c) {
                if (d(task, j, false)) {
                    this.f32960a.d(this);
                }
            } else if (task.f32957b) {
                q2.i iVar = z8.c.f32966h;
                if (z8.c.j.isLoggable(java.util.logging.Level.FINE)) {
                    com.google.common.util.concurrent.D.c(task, this, "schedule canceled (queue is shutdown)");
                }
            } else {
                q2.i iVar2 = z8.c.f32966h;
                if (z8.c.j.isLoggable(java.util.logging.Level.FINE)) {
                    com.google.common.util.concurrent.D.c(task, this, "schedule failed (queue is shutdown)");
                }
                throw new java.util.concurrent.RejectedExecutionException();
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:18:0x004c A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:19:0x004e  */
    /* JADX WARN: Code duplicated, block: B:20:0x005a  */
    /* JADX WARN: Code duplicated, block: B:25:0x0073  */
    /* JADX WARN: Code duplicated, block: B:28:0x0081 A[LOOP:0: B:23:0x006d->B:28:0x0081, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:31:0x0086  */
    /* JADX WARN: Code duplicated, block: B:34:0x008f A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:38:0x0083 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:39:0x0084 A[EDGE_INSN: B:39:0x0084->B:30:0x0084 BREAK  A[LOOP:0: B:23:0x006d->B:28:0x0081], SYNTHETIC] */
    public final boolean d(z8.a task, long j, boolean z6) {
        java.util.Iterator it;
        int size;
        java.lang.String strConcat;
        kotlin.jvm.internal.m.e(task, "task");
        z8.b bVar = task.f32958c;
        if (bVar != this) {
            if (bVar != null) {
                throw new java.lang.IllegalStateException("task is in multiple queues");
            }
            task.f32958c = this;
        }
        y7.m mVar = this.f32960a.f32968a;
        long jNanoTime = java.lang.System.nanoTime();
        long j9 = jNanoTime + j;
        java.util.ArrayList arrayList = this.f32964e;
        int iIndexOf = arrayList.indexOf(task);
        if (iIndexOf == -1) {
            task.f32959d = j9;
            q2.i iVar = z8.c.f32966h;
            if (z8.c.j.isLoggable(java.util.logging.Level.FINE)) {
                if (z6) {
                    strConcat = "run again after ".concat(com.google.common.util.concurrent.D.s(j9 - jNanoTime));
                } else {
                    strConcat = "scheduled after ".concat(com.google.common.util.concurrent.D.s(j9 - jNanoTime));
                }
                com.google.common.util.concurrent.D.c(task, this, strConcat);
            }
            it = arrayList.iterator();
            size = 0;
            while (true) {
                if (it.hasNext()) {
                    size = -1;
                    break;
                }
                if (((z8.a) it.next()).f32959d - jNanoTime > j) {
                    break;
                }
                size++;
            }
            if (size == -1) {
                size = arrayList.size();
            }
            arrayList.add(size, task);
            if (size == 0) {
                return true;
            }
        } else if (task.f32959d <= j9) {
            q2.i iVar2 = z8.c.f32966h;
            if (z8.c.j.isLoggable(java.util.logging.Level.FINE)) {
                com.google.common.util.concurrent.D.c(task, this, "already scheduled");
                return false;
            }
        } else {
            arrayList.remove(iIndexOf);
            task.f32959d = j9;
            q2.i iVar3 = z8.c.f32966h;
            if (z8.c.j.isLoggable(java.util.logging.Level.FINE)) {
                if (z6) {
                    strConcat = "run again after ".concat(com.google.common.util.concurrent.D.s(j9 - jNanoTime));
                } else {
                    strConcat = "scheduled after ".concat(com.google.common.util.concurrent.D.s(j9 - jNanoTime));
                }
                com.google.common.util.concurrent.D.c(task, this, strConcat);
            }
            it = arrayList.iterator();
            size = 0;
            while (true) {
                if (it.hasNext()) {
                    size = -1;
                    break;
                }
                if (((z8.a) it.next()).f32959d - jNanoTime > j) {
                    break;
                    break;
                }
                size++;
            }
            if (size == -1) {
                size = arrayList.size();
            }
            arrayList.add(size, task);
            if (size == 0) {
                return true;
            }
        }
        return false;
    }

    public final void e() {
        byte[] bArr = x8.b.f31716a;
        synchronized (this.f32960a) {
            this.f32962c = true;
            if (b()) {
                this.f32960a.d(this);
            }
        }
    }

    public final java.lang.String toString() {
        return this.f32961b;
    }
}
