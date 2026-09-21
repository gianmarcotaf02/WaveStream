package com.google.common.util.concurrent;

/* JADX INFO: renamed from: com.google.common.util.concurrent.h, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C1893h extends com.google.common.util.concurrent.AbstractC1887b {
    @Override // com.google.common.util.concurrent.AbstractC1887b
    public final boolean a(com.google.common.util.concurrent.AbstractC1902q abstractC1902q, com.google.common.util.concurrent.C1890e c1890e, com.google.common.util.concurrent.C1890e c1890e2) {
        synchronized (abstractC1902q) {
            try {
                if (abstractC1902q.listeners != c1890e) {
                    return false;
                }
                abstractC1902q.listeners = c1890e2;
                return true;
            } catch (java.lang.Throwable th) {
                throw th;
            }
        }
    }

    @Override // com.google.common.util.concurrent.AbstractC1887b
    public final boolean b(com.google.common.util.concurrent.AbstractC1902q abstractC1902q, java.lang.Object obj, java.lang.Object obj2) {
        synchronized (abstractC1902q) {
            try {
                if (abstractC1902q.value != obj) {
                    return false;
                }
                abstractC1902q.value = obj2;
                return true;
            } catch (java.lang.Throwable th) {
                throw th;
            }
        }
    }

    @Override // com.google.common.util.concurrent.AbstractC1887b
    public final boolean c(com.google.common.util.concurrent.AbstractC1902q abstractC1902q, com.google.common.util.concurrent.C1901p c1901p, com.google.common.util.concurrent.C1901p c1901p2) {
        synchronized (abstractC1902q) {
            try {
                if (abstractC1902q.waiters != c1901p) {
                    return false;
                }
                abstractC1902q.waiters = c1901p2;
                return true;
            } catch (java.lang.Throwable th) {
                throw th;
            }
        }
    }

    @Override // com.google.common.util.concurrent.AbstractC1887b
    public final com.google.common.util.concurrent.C1890e d(com.google.common.util.concurrent.AbstractC1902q abstractC1902q) {
        com.google.common.util.concurrent.C1890e c1890e;
        com.google.common.util.concurrent.C1890e c1890e2 = com.google.common.util.concurrent.C1890e.f19431d;
        synchronized (abstractC1902q) {
            try {
                c1890e = abstractC1902q.listeners;
                if (c1890e != c1890e2) {
                    abstractC1902q.listeners = c1890e2;
                }
            } catch (java.lang.Throwable th) {
                throw th;
            }
        }
        return c1890e;
    }

    @Override // com.google.common.util.concurrent.AbstractC1887b
    public final com.google.common.util.concurrent.C1901p e(com.google.common.util.concurrent.AbstractC1902q abstractC1902q) {
        com.google.common.util.concurrent.C1901p c1901p;
        com.google.common.util.concurrent.C1901p c1901p2 = com.google.common.util.concurrent.C1901p.f19448c;
        synchronized (abstractC1902q) {
            try {
                c1901p = abstractC1902q.waiters;
                if (c1901p != c1901p2) {
                    abstractC1902q.waiters = c1901p2;
                }
            } catch (java.lang.Throwable th) {
                throw th;
            }
        }
        return c1901p;
    }

    @Override // com.google.common.util.concurrent.AbstractC1887b
    public final void f(com.google.common.util.concurrent.C1901p c1901p, com.google.common.util.concurrent.C1901p c1901p2) {
        c1901p.f19450b = c1901p2;
    }

    @Override // com.google.common.util.concurrent.AbstractC1887b
    public final void g(com.google.common.util.concurrent.C1901p c1901p, java.lang.Thread thread) {
        c1901p.f19449a = thread;
    }
}
