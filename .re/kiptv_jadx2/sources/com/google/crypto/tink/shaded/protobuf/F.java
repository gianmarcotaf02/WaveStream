package com.google.crypto.tink.shaded.protobuf;

import java.nio.charset.Charset;
import java.util.AbstractList;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.RandomAccess;

public final class F extends AbstractC1907b implements G, RandomAccess {

    public final ArrayList f19480i;

    static {
        new F(10).f19514h = false;
    }

    public F(int i3) {
        this(new ArrayList(i3));
    }

    @Override
    public final void add(int i3, Object obj) {
        d();
        this.f19480i.add(i3, (String) obj);
        ((AbstractList) this).modCount++;
    }

    @Override
    public final boolean addAll(Collection collection) {
        return addAll(this.f19480i.size(), collection);
    }

    @Override
    public final List b() {
        return Collections.unmodifiableList(this.f19480i);
    }

    @Override
    public final G c() {
        return this.f19514h ? new k0(this) : this;
    }

    @Override
    public final void clear() {
        d();
        this.f19480i.clear();
        ((AbstractList) this).modCount++;
    }

    @Override
    public final A g(int i3) {
        ArrayList arrayList = this.f19480i;
        if (i3 < arrayList.size()) {
            throw new IllegalArgumentException();
        }
        ArrayList arrayList2 = new ArrayList(i3);
        arrayList2.addAll(arrayList);
        return new F(arrayList2);
    }

    @Override
    public final Object get(int i3) {
        String str;
        ArrayList arrayList = this.f19480i;
        Object obj = arrayList.get(i3);
        if (obj instanceof String) {
            return (String) obj;
        }
        if (!(obj instanceof AbstractC1915j)) {
            byte[] bArr = (byte[]) obj;
            String str2 = new String(bArr, B.f19466a);
            q0 q0Var = s0.f19590a;
            if (s0.f19590a.C(bArr, 0, bArr.length)) {
                arrayList.set(i3, str2);
            }
            return str2;
        }
        AbstractC1915j abstractC1915j = (AbstractC1915j) obj;
        abstractC1915j.getClass();
        Charset charset = B.f19466a;
        if (abstractC1915j.size() == 0) {
            str = "";
        } else {
            C1914i c1914i = (C1914i) abstractC1915j;
            str = new String(c1914i.f19539k, c1914i.p(), c1914i.size(), charset);
        }
        C1914i c1914i2 = (C1914i) abstractC1915j;
        int iP = c1914i2.p();
        if (s0.f19590a.C(c1914i2.f19539k, iP, c1914i2.size() + iP)) {
            arrayList.set(i3, str);
        }
        return str;
    }

    @Override
    public final void j(AbstractC1915j abstractC1915j) {
        d();
        this.f19480i.add(abstractC1915j);
        ((AbstractList) this).modCount++;
    }

    @Override
    public final Object m(int i3) {
        return this.f19480i.get(i3);
    }

    @Override
    public final Object remove(int i3) {
        d();
        Object objRemove = this.f19480i.remove(i3);
        ((AbstractList) this).modCount++;
        if (objRemove instanceof String) {
            return (String) objRemove;
        }
        if (!(objRemove instanceof AbstractC1915j)) {
            return new String((byte[]) objRemove, B.f19466a);
        }
        AbstractC1915j abstractC1915j = (AbstractC1915j) objRemove;
        abstractC1915j.getClass();
        Charset charset = B.f19466a;
        if (abstractC1915j.size() == 0) {
            return "";
        }
        C1914i c1914i = (C1914i) abstractC1915j;
        return new String(c1914i.f19539k, c1914i.p(), c1914i.size(), charset);
    }

    @Override
    public final Object set(int i3, Object obj) {
        d();
        Object obj2 = this.f19480i.set(i3, (String) obj);
        if (obj2 instanceof String) {
            return (String) obj2;
        }
        if (!(obj2 instanceof AbstractC1915j)) {
            return new String((byte[]) obj2, B.f19466a);
        }
        AbstractC1915j abstractC1915j = (AbstractC1915j) obj2;
        abstractC1915j.getClass();
        Charset charset = B.f19466a;
        if (abstractC1915j.size() == 0) {
            return "";
        }
        C1914i c1914i = (C1914i) abstractC1915j;
        return new String(c1914i.f19539k, c1914i.p(), c1914i.size(), charset);
    }

    @Override
    public final int size() {
        return this.f19480i.size();
    }

    public F(ArrayList arrayList) {
        this.f19480i = arrayList;
    }

    @Override
    public final boolean addAll(int i3, Collection collection) {
        d();
        if (collection instanceof G) {
            collection = ((G) collection).b();
        }
        boolean zAddAll = this.f19480i.addAll(i3, collection);
        ((AbstractList) this).modCount++;
        return zAddAll;
    }
}
