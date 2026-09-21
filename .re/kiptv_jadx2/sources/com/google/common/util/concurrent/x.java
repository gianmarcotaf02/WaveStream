package com.google.common.util.concurrent;

import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;

public final class x extends H {
    public final z j;

    public final y f19458k;

    public final V3.b f19459l;

    public final y f19460m;

    public x(y yVar, V3.b bVar) {
        z zVar = z.f19464h;
        this.f19460m = yVar;
        this.f19458k = yVar;
        this.j = zVar;
        this.f19459l = bVar;
    }

    @Override
    public final void a(Throwable th) {
        y yVar = this.f19458k;
        yVar.f19463m = null;
        if (th instanceof ExecutionException) {
            yVar.setException(((ExecutionException) th).getCause());
        } else if (th instanceof CancellationException) {
            yVar.cancel(false);
        } else {
            yVar.setException(th);
        }
    }

    @Override
    public final void b(Object obj) {
        this.f19458k.f19463m = null;
        this.f19460m.set(obj);
    }

    @Override
    public final boolean d() {
        return this.f19458k.isDone();
    }

    @Override
    public final Object e() {
        this.f19459l.call();
        return null;
    }

    @Override
    public final String f() {
        return this.f19459l.toString();
    }
}
