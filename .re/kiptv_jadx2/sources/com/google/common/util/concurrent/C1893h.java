package com.google.common.util.concurrent;

public final class C1893h extends AbstractC1887b {
    @Override
    public final boolean a(AbstractC1902q abstractC1902q, C1890e c1890e, C1890e c1890e2) {
        synchronized (abstractC1902q) {
            try {
                if (abstractC1902q.listeners != c1890e) {
                    return false;
                }
                abstractC1902q.listeners = c1890e2;
                return true;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override
    public final boolean b(AbstractC1902q abstractC1902q, Object obj, Object obj2) {
        synchronized (abstractC1902q) {
            try {
                if (abstractC1902q.value != obj) {
                    return false;
                }
                abstractC1902q.value = obj2;
                return true;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override
    public final boolean c(AbstractC1902q abstractC1902q, C1901p c1901p, C1901p c1901p2) {
        synchronized (abstractC1902q) {
            try {
                if (abstractC1902q.waiters != c1901p) {
                    return false;
                }
                abstractC1902q.waiters = c1901p2;
                return true;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override
    public final C1890e d(AbstractC1902q abstractC1902q) {
        C1890e c1890e;
        C1890e c1890e2 = C1890e.f19431d;
        synchronized (abstractC1902q) {
            try {
                c1890e = abstractC1902q.listeners;
                if (c1890e != c1890e2) {
                    abstractC1902q.listeners = c1890e2;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return c1890e;
    }

    @Override
    public final C1901p e(AbstractC1902q abstractC1902q) {
        C1901p c1901p;
        C1901p c1901p2 = C1901p.f19448c;
        synchronized (abstractC1902q) {
            try {
                c1901p = abstractC1902q.waiters;
                if (c1901p != c1901p2) {
                    abstractC1902q.waiters = c1901p2;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return c1901p;
    }

    @Override
    public final void f(C1901p c1901p, C1901p c1901p2) {
        c1901p.f19450b = c1901p2;
    }

    @Override
    public final void g(C1901p c1901p, Thread thread) {
        c1901p.f19449a = thread;
    }
}
