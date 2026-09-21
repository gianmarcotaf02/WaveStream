package com.google.common.util.concurrent;

/* JADX INFO: loaded from: classes.dex */
public final class S extends com.google.common.util.concurrent.H {
    public final java.util.concurrent.Callable j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final /* synthetic */ com.google.common.util.concurrent.T f19421k;

    public S(com.google.common.util.concurrent.T t9, java.util.concurrent.Callable callable) {
        this.f19421k = t9;
        callable.getClass();
        this.j = callable;
    }

    @Override // com.google.common.util.concurrent.H
    public final void a(java.lang.Throwable th) {
        this.f19421k.setException(th);
    }

    @Override // com.google.common.util.concurrent.H
    public final void b(java.lang.Object obj) {
        this.f19421k.set(obj);
    }

    @Override // com.google.common.util.concurrent.H
    public final boolean d() {
        return this.f19421k.isDone();
    }

    @Override // com.google.common.util.concurrent.H
    public final java.lang.Object e() {
        return this.j.call();
    }

    @Override // com.google.common.util.concurrent.H
    public final java.lang.String f() {
        return this.j.toString();
    }
}
