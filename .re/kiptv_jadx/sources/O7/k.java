package O7;

/* JADX INFO: loaded from: classes4.dex */
public final class k extends p078i6.AbstractC2254e {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final /* synthetic */ int f8051h = 0;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final java.lang.Object f8052i;

    public k(O7.m mVar) {
        this.f8052i = mVar;
    }

    @Override // p078i6.AbstractC2250a, java.util.Collection, java.util.List
    public /* bridge */ boolean contains(java.lang.Object obj) {
        switch (this.f8051h) {
            case 0:
                if (obj instanceof java.lang.String) {
                    return super.contains((java.lang.String) obj);
                }
                return false;
            default:
                return super.contains(obj);
        }
    }

    @Override // p078i6.AbstractC2250a
    public final int d() {
        switch (this.f8051h) {
            case 0:
                return ((O7.m) this.f8052i).f8055a.groupCount() + 1;
            default:
                return ((java.util.List) this.f8052i).size();
        }
    }

    @Override // java.util.List
    public final java.lang.Object get(int i3) {
        switch (this.f8051h) {
            case 0:
                java.lang.String strGroup = ((O7.m) this.f8052i).f8055a.group(i3);
                return strGroup == null ? "" : strGroup;
            default:
                return ((java.util.List) this.f8052i).get(p078i6.o.V0(i3, this));
        }
    }

    @Override // p078i6.AbstractC2254e, java.util.List
    public /* bridge */ int indexOf(java.lang.Object obj) {
        switch (this.f8051h) {
            case 0:
                if (obj instanceof java.lang.String) {
                    return super.indexOf((java.lang.String) obj);
                }
                return -1;
            default:
                return super.indexOf(obj);
        }
    }

    @Override // p078i6.AbstractC2254e, java.util.Collection, java.lang.Iterable, java.util.List
    public java.util.Iterator iterator() {
        switch (this.f8051h) {
            case 1:
                return new p078i6.E(this, 0);
            default:
                return super.iterator();
        }
    }

    @Override // p078i6.AbstractC2254e, java.util.List
    public /* bridge */ int lastIndexOf(java.lang.Object obj) {
        switch (this.f8051h) {
            case 0:
                if (obj instanceof java.lang.String) {
                    return super.lastIndexOf((java.lang.String) obj);
                }
                return -1;
            default:
                return super.lastIndexOf(obj);
        }
    }

    @Override // p078i6.AbstractC2254e, java.util.List
    public java.util.ListIterator listIterator() {
        switch (this.f8051h) {
            case 1:
                return new p078i6.E(this, 0);
            default:
                return super.listIterator();
        }
    }

    @Override // p078i6.AbstractC2254e, java.util.List
    public java.util.ListIterator listIterator(int i3) {
        switch (this.f8051h) {
            case 1:
                return new p078i6.E(this, i3);
            default:
                return super.listIterator(i3);
        }
    }

    public k(java.util.List delegate) {
        kotlin.jvm.internal.m.e(delegate, "delegate");
        this.f8052i = delegate;
    }
}
