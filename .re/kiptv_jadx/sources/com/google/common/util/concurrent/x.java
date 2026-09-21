package com.google.common.util.concurrent;

/* JADX INFO: loaded from: classes.dex */
public final class x extends com.google.common.util.concurrent.H {
    public final com.google.common.util.concurrent.z j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final /* synthetic */ com.google.common.util.concurrent.y f19458k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final V3.b f19459l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final /* synthetic */ com.google.common.util.concurrent.y f19460m;

    public x(com.google.common.util.concurrent.y yVar, V3.b bVar) {
        com.google.common.util.concurrent.z zVar = com.google.common.util.concurrent.z.f19464h;
        this.f19460m = yVar;
        this.f19458k = yVar;
        this.j = zVar;
        this.f19459l = bVar;
    }

    @Override // com.google.common.util.concurrent.H
    public final void a(java.lang.Throwable th) {
        com.google.common.util.concurrent.y yVar = this.f19458k;
        yVar.f19463m = null;
        if (th instanceof java.util.concurrent.ExecutionException) {
            yVar.setException(((java.util.concurrent.ExecutionException) th).getCause());
        } else if (th instanceof java.util.concurrent.CancellationException) {
            yVar.cancel(false);
        } else {
            yVar.setException(th);
        }
    }

    @Override // com.google.common.util.concurrent.H
    public final void b(java.lang.Object obj) {
        this.f19458k.f19463m = null;
        this.f19460m.set(obj);
    }

    @Override // com.google.common.util.concurrent.H
    public final boolean d() {
        return this.f19458k.isDone();
    }

    @Override // com.google.common.util.concurrent.H
    public final java.lang.Object e() {
        this.f19459l.call();
        return null;
    }

    @Override // com.google.common.util.concurrent.H
    public final java.lang.String f() {
        return this.f19459l.toString();
    }
}
