package com.google.common.util.concurrent;

import java.util.concurrent.Callable;

public final class S extends H {
    public final Callable j;

    public final T f19421k;

    public S(T t9, Callable callable) {
        this.f19421k = t9;
        callable.getClass();
        this.j = callable;
    }

    @Override
    public final void a(Throwable th) {
        this.f19421k.setException(th);
    }

    @Override
    public final void b(Object obj) {
        this.f19421k.set(obj);
    }

    @Override
    public final boolean d() {
        return this.f19421k.isDone();
    }

    @Override
    public final Object e() {
        return this.j.call();
    }

    @Override
    public final String f() {
        return this.j.toString();
    }
}
