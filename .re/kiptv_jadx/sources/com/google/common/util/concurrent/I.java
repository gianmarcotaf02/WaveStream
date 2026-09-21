package com.google.common.util.concurrent;

/* JADX INFO: loaded from: classes.dex */
public final class I {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final java.lang.Object f19412a = new java.lang.Object();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final java.lang.String f19413b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public volatile java.util.logging.Logger f19414c;

    public I(java.lang.Class cls) {
        this.f19413b = cls.getName();
    }

    public final java.util.logging.Logger a() {
        java.util.logging.Logger logger = this.f19414c;
        if (logger != null) {
            return logger;
        }
        synchronized (this.f19412a) {
            try {
                java.util.logging.Logger logger2 = this.f19414c;
                if (logger2 != null) {
                    return logger2;
                }
                java.util.logging.Logger logger3 = java.util.logging.Logger.getLogger(this.f19413b);
                this.f19414c = logger3;
                return logger3;
            } catch (java.lang.Throwable th) {
                throw th;
            }
        }
    }
}
