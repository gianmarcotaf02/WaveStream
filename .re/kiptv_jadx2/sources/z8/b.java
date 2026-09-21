package z8;

import com.google.common.util.concurrent.D;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.RejectedExecutionException;
import java.util.logging.Level;
import kotlin.jvm.internal.m;
import q2.i;

public final class b {

    public final c f32960a;

    public final String f32961b;

    public boolean f32962c;

    public a f32963d;

    public final ArrayList f32964e;

    public boolean f32965f;

    public b(c taskRunner, String name) {
        m.e(taskRunner, "taskRunner");
        m.e(name, "name");
        this.f32960a = taskRunner;
        this.f32961b = name;
        this.f32964e = new ArrayList();
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
        a aVar = this.f32963d;
        if (aVar != null && aVar.f32957b) {
            this.f32965f = true;
        }
        ArrayList arrayList = this.f32964e;
        boolean z6 = false;
        for (int size = arrayList.size() - 1; -1 < size; size--) {
            if (((a) arrayList.get(size)).f32957b) {
                a aVar2 = (a) arrayList.get(size);
                i iVar = c.f32966h;
                if (c.j.isLoggable(Level.FINE)) {
                    D.c(aVar2, this, "canceled");
                }
                arrayList.remove(size);
                z6 = true;
            }
        }
        return z6;
    }

    public final void c(a task, long j) {
        m.e(task, "task");
        synchronized (this.f32960a) {
            if (!this.f32962c) {
                if (d(task, j, false)) {
                    this.f32960a.d(this);
                }
            } else if (task.f32957b) {
                i iVar = c.f32966h;
                if (c.j.isLoggable(Level.FINE)) {
                    D.c(task, this, "schedule canceled (queue is shutdown)");
                }
            } else {
                i iVar2 = c.f32966h;
                if (c.j.isLoggable(Level.FINE)) {
                    D.c(task, this, "schedule failed (queue is shutdown)");
                }
                throw new RejectedExecutionException();
            }
        }
    }

    public final boolean d(a task, long j, boolean z6) {
        Iterator it;
        int size;
        String strConcat;
        m.e(task, "task");
        b bVar = task.f32958c;
        if (bVar != this) {
            if (bVar != null) {
                throw new IllegalStateException("task is in multiple queues");
            }
            task.f32958c = this;
        }
        y7.m mVar = this.f32960a.f32968a;
        long jNanoTime = System.nanoTime();
        long j9 = jNanoTime + j;
        ArrayList arrayList = this.f32964e;
        int iIndexOf = arrayList.indexOf(task);
        if (iIndexOf == -1) {
            task.f32959d = j9;
            i iVar = c.f32966h;
            if (c.j.isLoggable(Level.FINE)) {
                if (z6) {
                    strConcat = "run again after ".concat(D.s(j9 - jNanoTime));
                } else {
                    strConcat = "scheduled after ".concat(D.s(j9 - jNanoTime));
                }
                D.c(task, this, strConcat);
            }
            it = arrayList.iterator();
            size = 0;
            while (true) {
                if (it.hasNext()) {
                    size = -1;
                    break;
                }
                if (((a) it.next()).f32959d - jNanoTime > j) {
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
            i iVar2 = c.f32966h;
            if (c.j.isLoggable(Level.FINE)) {
                D.c(task, this, "already scheduled");
                return false;
            }
        } else {
            arrayList.remove(iIndexOf);
            task.f32959d = j9;
            i iVar3 = c.f32966h;
            if (c.j.isLoggable(Level.FINE)) {
                if (z6) {
                    strConcat = "run again after ".concat(D.s(j9 - jNanoTime));
                } else {
                    strConcat = "scheduled after ".concat(D.s(j9 - jNanoTime));
                }
                D.c(task, this, strConcat);
            }
            it = arrayList.iterator();
            size = 0;
            while (true) {
                if (it.hasNext()) {
                    size = -1;
                    break;
                }
                if (((a) it.next()).f32959d - jNanoTime > j) {
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

    public final String toString() {
        return this.f32961b;
    }
}
