package androidx.recyclerview.widget;

/* JADX INFO: loaded from: classes.dex */
public final class O {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final java.util.ArrayList f17242a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public java.util.ArrayList f17243b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final java.util.ArrayList f17244c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final java.util.List f17245d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f17246e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f17247f;
    public androidx.recyclerview.widget.N g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final /* synthetic */ androidx.recyclerview.widget.RecyclerView f17248h;

    public O(androidx.recyclerview.widget.RecyclerView recyclerView) {
        this.f17248h = recyclerView;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        this.f17242a = arrayList;
        this.f17243b = null;
        this.f17244c = new java.util.ArrayList();
        this.f17245d = java.util.Collections.unmodifiableList(arrayList);
        this.f17246e = 2;
        this.f17247f = 2;
    }

    public final void a(androidx.recyclerview.widget.X x9, boolean z6) {
        androidx.recyclerview.widget.RecyclerView.g(x9);
        android.view.View view = x9.itemView;
        androidx.recyclerview.widget.RecyclerView recyclerView = this.f17248h;
        androidx.recyclerview.widget.Z z9 = recyclerView.f17313t0;
        if (z9 != null) {
            androidx.recyclerview.widget.Y y = z9.f17365l;
            D1.U.j(view, y != null ? (D1.C0213b) y.f17363l.remove(view) : null);
        }
        if (z6) {
            java.util.ArrayList arrayList = recyclerView.f17316v;
            if (arrayList.size() > 0) {
                arrayList.get(0).getClass();
                throw new java.lang.ClassCastException();
            }
            androidx.recyclerview.widget.A a2 = recyclerView.f17312t;
            if (a2 != null) {
                a2.onViewRecycled(x9);
            }
            if (recyclerView.f17299m0 != null) {
                recyclerView.f17300n.P(x9);
            }
        }
        x9.mBindingAdapter = null;
        x9.mOwnerRecyclerView = null;
        androidx.recyclerview.widget.N nC = c();
        nC.getClass();
        int itemViewType = x9.getItemViewType();
        java.util.ArrayList arrayList2 = nC.a(itemViewType).f17235a;
        if (((androidx.recyclerview.widget.M) nC.f17239a.get(itemViewType)).f17236b <= arrayList2.size()) {
            p000a.a.l(x9.itemView);
        } else {
            x9.resetInternal();
            arrayList2.add(x9);
        }
    }

    public final int b(int i3) {
        androidx.recyclerview.widget.RecyclerView recyclerView = this.f17248h;
        if (i3 >= 0 && i3 < recyclerView.f17299m0.b()) {
            return !recyclerView.f17299m0.f17350f ? i3 : recyclerView.f17296l.g(i3, 0);
        }
        java.lang.StringBuilder sbT = p121o0.p.t(i3, "invalid position ", ". State item count is ");
        sbT.append(recyclerView.f17299m0.b());
        sbT.append(recyclerView.w());
        throw new java.lang.IndexOutOfBoundsException(sbT.toString());
    }

    public final androidx.recyclerview.widget.N c() {
        if (this.g == null) {
            androidx.recyclerview.widget.N n3 = new androidx.recyclerview.widget.N();
            n3.f17239a = new android.util.SparseArray();
            n3.f17240b = 0;
            n3.f17241c = java.util.Collections.newSetFromMap(new java.util.IdentityHashMap());
            this.g = n3;
            d();
        }
        return this.g;
    }

    public final void d() {
        androidx.recyclerview.widget.RecyclerView recyclerView;
        androidx.recyclerview.widget.A a2;
        androidx.recyclerview.widget.N n3 = this.g;
        if (n3 == null || (a2 = (recyclerView = this.f17248h).f17312t) == null || !recyclerView.f17323z) {
            return;
        }
        n3.f17241c.add(a2);
    }

    public final void e(androidx.recyclerview.widget.A a2, boolean z6) {
        androidx.recyclerview.widget.N n3 = this.g;
        if (n3 == null) {
            return;
        }
        java.util.Set set = n3.f17241c;
        set.remove(a2);
        if (set.size() != 0 || z6) {
            return;
        }
        int i3 = 0;
        while (true) {
            android.util.SparseArray sparseArray = n3.f17239a;
            if (i3 >= sparseArray.size()) {
                return;
            }
            java.util.ArrayList arrayList = ((androidx.recyclerview.widget.M) sparseArray.get(sparseArray.keyAt(i3))).f17235a;
            for (int i9 = 0; i9 < arrayList.size(); i9++) {
                p000a.a.l(((androidx.recyclerview.widget.X) arrayList.get(i9)).itemView);
            }
            i3++;
        }
    }

    public final void f() {
        java.util.ArrayList arrayList = this.f17244c;
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            g(size);
        }
        arrayList.clear();
        if (androidx.recyclerview.widget.RecyclerView.f17254J0) {
            U.C0948v c0948v = this.f17248h.f17297l0;
            int[] iArr = (int[]) c0948v.f10089e;
            if (iArr != null) {
                java.util.Arrays.fill(iArr, -1);
            }
            c0948v.f10088d = 0;
        }
    }

    public final void g(int i3) {
        java.util.ArrayList arrayList = this.f17244c;
        a((androidx.recyclerview.widget.X) arrayList.get(i3), true);
        arrayList.remove(i3);
    }

    public final void h(android.view.View view) {
        androidx.recyclerview.widget.X xG = androidx.recyclerview.widget.RecyclerView.G(view);
        boolean zIsTmpDetached = xG.isTmpDetached();
        androidx.recyclerview.widget.RecyclerView recyclerView = this.f17248h;
        if (zIsTmpDetached) {
            recyclerView.removeDetachedView(view, false);
        }
        if (xG.isScrap()) {
            xG.unScrap();
        } else if (xG.wasReturnedFromScrap()) {
            xG.clearReturnedFromScrapFlag();
        }
        i(xG);
        if (recyclerView.f17279S == null || xG.isRecyclable()) {
            return;
        }
        recyclerView.f17279S.d(xG);
    }

    /* JADX WARN: Code duplicated, block: B:40:0x007b  */
    /* JADX WARN: Code duplicated, block: B:42:0x008b  */
    /* JADX WARN: Code duplicated, block: B:44:0x0092  */
    /* JADX WARN: Code duplicated, block: B:47:0x009d A[LOOP:2: B:43:0x0090->B:47:0x009d, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:74:0x00a0 A[EDGE_INSN: B:74:0x00a0->B:48:0x00a0 BREAK  A[LOOP:1: B:39:0x0079->B:46:0x009a], SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:75:0x00a0 A[EDGE_INSN: B:75:0x00a0->B:48:0x00a0 BREAK  A[LOOP:1: B:39:0x0079->B:46:0x009a, LOOP_LABEL: LOOP:1: B:39:0x0079->B:46:0x009a], SYNTHETIC] */
    public final void i(androidx.recyclerview.widget.X x9) {
        boolean z6;
        int i3;
        int i9;
        U.C0948v c0948v;
        int i10;
        int i11;
        boolean zIsScrap = x9.isScrap();
        androidx.recyclerview.widget.RecyclerView recyclerView = this.f17248h;
        boolean z9 = false;
        boolean z10 = true;
        if (zIsScrap || x9.itemView.getParent() != null) {
            java.lang.StringBuilder sb = new java.lang.StringBuilder("Scrapped or attached views may not be recycled. isScrap:");
            sb.append(x9.isScrap());
            sb.append(" isAttached:");
            sb.append(x9.itemView.getParent() != null);
            sb.append(recyclerView.w());
            throw new java.lang.IllegalArgumentException(sb.toString());
        }
        if (x9.isTmpDetached()) {
            throw new java.lang.IllegalArgumentException("Tmp detached view should be removed from RecyclerView before it can be recycled: " + x9 + recyclerView.w());
        }
        if (x9.shouldIgnore()) {
            throw new java.lang.IllegalArgumentException("Trying to recycle an ignored view holder. You should first call stopIgnoringView(view) before calling recycle." + recyclerView.w());
        }
        boolean zDoesTransientStatePreventRecycling = x9.doesTransientStatePreventRecycling();
        androidx.recyclerview.widget.A a2 = recyclerView.f17312t;
        if ((a2 != null && zDoesTransientStatePreventRecycling && a2.onFailedToRecycleView(x9)) || x9.isRecyclable()) {
            if (this.f17247f <= 0 || x9.hasAnyOfTheFlags(526)) {
                z6 = false;
            } else {
                java.util.ArrayList arrayList = this.f17244c;
                int size = arrayList.size();
                if (size >= this.f17247f && size > 0) {
                    g(0);
                    size--;
                }
                if (androidx.recyclerview.widget.RecyclerView.f17254J0 && size > 0) {
                    U.C0948v c0948v2 = recyclerView.f17297l0;
                    int i12 = x9.mPosition;
                    if (((int[]) c0948v2.f10089e) != null) {
                        int i13 = c0948v2.f10088d * 2;
                        int i14 = 0;
                        while (true) {
                            if (i14 >= i13) {
                                i3 = size - 1;
                                loop1: while (i3 >= 0) {
                                    i9 = ((androidx.recyclerview.widget.X) arrayList.get(i3)).mPosition;
                                    c0948v = recyclerView.f17297l0;
                                    if (((int[]) c0948v.f10089e) != null) {
                                        break;
                                    }
                                    i10 = c0948v.f10088d * 2;
                                    i11 = 0;
                                    while (true) {
                                        if (i11 < i10) {
                                            break loop1;
                                        } else if (((int[]) c0948v.f10089e)[i11] == i9) {
                                            break;
                                        } else {
                                            i11 += 2;
                                        }
                                    }
                                    i3--;
                                }
                                size = i3 + 1;
                            } else if (((int[]) c0948v2.f10089e)[i14] != i12) {
                                i14 += 2;
                            }
                        }
                    } else {
                        i3 = size - 1;
                        loop1: while (i3 >= 0) {
                            i9 = ((androidx.recyclerview.widget.X) arrayList.get(i3)).mPosition;
                            c0948v = recyclerView.f17297l0;
                            if (((int[]) c0948v.f10089e) != null) {
                                break;
                                break;
                            }
                            i10 = c0948v.f10088d * 2;
                            i11 = 0;
                            while (true) {
                                if (i11 < i10) {
                                    break loop1;
                                    break loop1;
                                } else if (((int[]) c0948v.f10089e)[i11] == i9) {
                                    break;
                                } else {
                                    i11 += 2;
                                }
                            }
                            i3--;
                        }
                        size = i3 + 1;
                    }
                }
                arrayList.add(size, x9);
                z6 = true;
            }
            if (z6) {
                z10 = false;
            } else {
                a(x9, true);
            }
            z9 = z6;
        } else {
            z10 = false;
        }
        recyclerView.f17300n.P(x9);
        if (z9 || z10 || !zDoesTransientStatePreventRecycling) {
            return;
        }
        p000a.a.l(x9.itemView);
        x9.mBindingAdapter = null;
        x9.mOwnerRecyclerView = null;
    }

    public final void j(android.view.View view) {
        androidx.recyclerview.widget.F f9;
        androidx.recyclerview.widget.X xG = androidx.recyclerview.widget.RecyclerView.G(view);
        boolean zHasAnyOfTheFlags = xG.hasAnyOfTheFlags(12);
        androidx.recyclerview.widget.RecyclerView recyclerView = this.f17248h;
        if (!zHasAnyOfTheFlags && xG.isUpdated() && (f9 = recyclerView.f17279S) != null) {
            androidx.recyclerview.widget.C1626h c1626h = (androidx.recyclerview.widget.C1626h) f9;
            if (xG.getUnmodifiedPayloads().isEmpty() && c1626h.g && !xG.isInvalid()) {
                if (this.f17243b == null) {
                    this.f17243b = new java.util.ArrayList();
                }
                xG.setScrapContainer(this, true);
                this.f17243b.add(xG);
                return;
            }
        }
        if (!xG.isInvalid() || xG.isRemoved() || recyclerView.f17312t.hasStableIds()) {
            xG.setScrapContainer(this, false);
            this.f17242a.add(xG);
        } else {
            throw new java.lang.IllegalArgumentException("Called scrap view with an invalid view. Invalid views cannot be reused from scrap, they should rebound from recycler pool." + recyclerView.w());
        }
    }

    /* JADX WARN: Code duplicated, block: B:178:0x0335 A[EDGE_INSN: B:178:0x0335->B:179:0x0336 BREAK  A[LOOP:3: B:173:0x031d->B:177:0x0332]] */
    /* JADX WARN: Code duplicated, block: B:273:0x04ba  */
    /* JADX WARN: Code duplicated, block: B:274:0x04c6  */
    /* JADX WARN: Code duplicated, block: B:276:0x04cc  */
    /* JADX WARN: Code duplicated, block: B:277:0x04d8  */
    /* JADX WARN: Code duplicated, block: B:282:0x04e1  */
    /* JADX WARN: Code duplicated, block: B:35:0x007f A[EDGE_INSN: B:35:0x007f->B:36:0x0080 BREAK  A[LOOP:0: B:14:0x0025->B:20:0x003f]] */
    /* JADX WARN: Code duplicated, block: B:74:0x0127  */
    public final androidx.recyclerview.widget.X k(int i3, long j) {
        boolean z6;
        androidx.recyclerview.widget.X xCreateViewHolder;
        boolean z9;
        long j9;
        long j10;
        boolean z10;
        java.lang.Object[] objArr;
        android.view.ViewGroup.LayoutParams layoutParams;
        androidx.recyclerview.widget.J j11;
        androidx.recyclerview.widget.RecyclerView recyclerViewB;
        androidx.recyclerview.widget.X x9;
        android.view.View view;
        int iC;
        boolean z11;
        int size;
        int iG;
        boolean z12 = true;
        androidx.recyclerview.widget.RecyclerView recyclerView = this.f17248h;
        androidx.recyclerview.widget.T t9 = recyclerView.f17299m0;
        if (i3 < 0 || i3 >= t9.b()) {
            java.lang.StringBuilder sbS = p121o0.p.s(i3, i3, "Invalid item position ", "(", "). Item count:");
            sbS.append(t9.b());
            sbS.append(recyclerView.w());
            throw new java.lang.IndexOutOfBoundsException(sbS.toString());
        }
        if (t9.f17350f) {
            java.util.ArrayList arrayList = this.f17243b;
            if (arrayList != null && (size = arrayList.size()) != 0) {
                int i9 = 0;
                while (true) {
                    if (i9 >= size) {
                        if (recyclerView.f17312t.hasStableIds() && (iG = recyclerView.f17296l.g(i3, 0)) > 0 && iG < recyclerView.f17312t.getItemCount()) {
                            long itemId = recyclerView.f17312t.getItemId(iG);
                            int i10 = 0;
                            while (true) {
                                if (i10 >= size) {
                                    xCreateViewHolder = null;
                                    break;
                                }
                                androidx.recyclerview.widget.X x10 = (androidx.recyclerview.widget.X) this.f17243b.get(i10);
                                if (!x10.wasReturnedFromScrap() && x10.getItemId() == itemId) {
                                    x10.addFlags(32);
                                    xCreateViewHolder = x10;
                                    break;
                                }
                                i10++;
                            }
                        } else {
                            xCreateViewHolder = null;
                            break;
                        }
                    } else {
                        xCreateViewHolder = (androidx.recyclerview.widget.X) this.f17243b.get(i9);
                        if (!xCreateViewHolder.wasReturnedFromScrap() && xCreateViewHolder.getLayoutPosition() == i3) {
                            xCreateViewHolder.addFlags(32);
                            break;
                        }
                        i9++;
                    }
                }
            } else {
                xCreateViewHolder = null;
                break;
            }
            z6 = xCreateViewHolder != null;
        } else {
            z6 = false;
            xCreateViewHolder = null;
        }
        java.util.ArrayList arrayList2 = this.f17244c;
        java.util.ArrayList arrayList3 = this.f17242a;
        if (xCreateViewHolder == null) {
            int size2 = arrayList3.size();
            int i11 = 0;
            while (true) {
                if (i11 >= size2) {
                    java.util.ArrayList arrayList4 = (java.util.ArrayList) recyclerView.f17298m.f15618k;
                    int size3 = arrayList4.size();
                    int i12 = 0;
                    while (true) {
                        if (i12 >= size3) {
                            z9 = z12;
                            view = null;
                            break;
                        }
                        view = (android.view.View) arrayList4.get(i12);
                        androidx.recyclerview.widget.X xG = androidx.recyclerview.widget.RecyclerView.G(view);
                        z9 = z12;
                        if (xG.getLayoutPosition() == i3 && !xG.isInvalid() && !xG.isRemoved()) {
                            break;
                        }
                        i12++;
                        z12 = z9;
                    }
                    if (view == null) {
                        int size4 = arrayList2.size();
                        int i13 = 0;
                        while (true) {
                            if (i13 >= size4) {
                                xCreateViewHolder = null;
                                break;
                            }
                            androidx.recyclerview.widget.X x11 = (androidx.recyclerview.widget.X) arrayList2.get(i13);
                            if (!x11.isInvalid() && x11.getLayoutPosition() == i3 && !x11.isAttachedToTransitionOverlay()) {
                                arrayList2.remove(i13);
                                xCreateViewHolder = x11;
                                break;
                            }
                            i13++;
                        }
                    } else {
                        androidx.recyclerview.widget.X xG2 = androidx.recyclerview.widget.RecyclerView.G(view);
                        android.support.v4.media.session.q qVar = recyclerView.f17298m;
                        int iIndexOfChild = ((androidx.recyclerview.widget.C1642y) qVar.f15617i).f17522a.indexOfChild(view);
                        if (iIndexOfChild < 0) {
                            throw new java.lang.IllegalArgumentException("view is not a child, cannot hide " + view);
                        }
                        C8.a aVar = (C8.a) qVar.j;
                        if (!aVar.e(iIndexOfChild)) {
                            throw new java.lang.RuntimeException("trying to unhide a view that was not hidden" + view);
                        }
                        aVar.b(iIndexOfChild);
                        qVar.Q(view);
                        android.support.v4.media.session.q qVar2 = recyclerView.f17298m;
                        int iIndexOfChild2 = ((androidx.recyclerview.widget.C1642y) qVar2.f15617i).f17522a.indexOfChild(view);
                        if (iIndexOfChild2 == -1) {
                            iC = -1;
                        } else {
                            C8.a aVar2 = (C8.a) qVar2.j;
                            if (aVar2.e(iIndexOfChild2)) {
                                iC = -1;
                            } else {
                                iC = iIndexOfChild2 - aVar2.c(iIndexOfChild2);
                            }
                        }
                        if (iC == -1) {
                            throw new java.lang.IllegalStateException("layout index should not be -1 after unhiding a view:" + xG2 + recyclerView.w());
                        }
                        recyclerView.f17298m.n(iC);
                        j(view);
                        xG2.addFlags(8224);
                        xCreateViewHolder = xG2;
                        break;
                    }
                } else {
                    androidx.recyclerview.widget.X x12 = (androidx.recyclerview.widget.X) arrayList3.get(i11);
                    if (!x12.wasReturnedFromScrap() && x12.getLayoutPosition() == i3 && !x12.isInvalid() && (t9.f17350f || !x12.isRemoved())) {
                        x12.addFlags(32);
                        z9 = true;
                        xCreateViewHolder = x12;
                        break;
                    }
                    i11++;
                }
            }
            if (xCreateViewHolder != null) {
                if (xCreateViewHolder.isRemoved()) {
                    z11 = t9.f17350f;
                } else {
                    int i14 = xCreateViewHolder.mPosition;
                    if (i14 < 0 || i14 >= recyclerView.f17312t.getItemCount()) {
                        throw new java.lang.IndexOutOfBoundsException("Inconsistency detected. Invalid view holder adapter position" + xCreateViewHolder + recyclerView.w());
                    }
                    z11 = ((t9.f17350f || recyclerView.f17312t.getItemViewType(xCreateViewHolder.mPosition) == xCreateViewHolder.getItemViewType()) && (!recyclerView.f17312t.hasStableIds() || xCreateViewHolder.getItemId() == recyclerView.f17312t.getItemId(xCreateViewHolder.mPosition))) ? z9 : false;
                }
                if (z11) {
                    z6 = z9;
                } else {
                    xCreateViewHolder.addFlags(4);
                    if (xCreateViewHolder.isScrap()) {
                        recyclerView.removeDetachedView(xCreateViewHolder.itemView, false);
                        xCreateViewHolder.unScrap();
                    } else if (xCreateViewHolder.wasReturnedFromScrap()) {
                        xCreateViewHolder.clearReturnedFromScrapFlag();
                    }
                    i(xCreateViewHolder);
                    xCreateViewHolder = null;
                }
            }
        } else {
            z9 = true;
        }
        if (xCreateViewHolder == null) {
            int iG2 = recyclerView.f17296l.g(i3, 0);
            if (iG2 < 0 || iG2 >= recyclerView.f17312t.getItemCount()) {
                java.lang.StringBuilder sbS2 = p121o0.p.s(i3, iG2, "Inconsistency detected. Invalid item position ", "(offset:", ").state:");
                sbS2.append(t9.b());
                sbS2.append(recyclerView.w());
                throw new java.lang.IndexOutOfBoundsException(sbS2.toString());
            }
            int itemViewType = recyclerView.f17312t.getItemViewType(iG2);
            j9 = 3;
            if (recyclerView.f17312t.hasStableIds()) {
                long itemId2 = recyclerView.f17312t.getItemId(iG2);
                int size5 = arrayList3.size() - 1;
                while (true) {
                    if (size5 < 0) {
                        j10 = 4;
                        int size6 = arrayList2.size() - 1;
                        while (true) {
                            if (size6 >= 0) {
                                androidx.recyclerview.widget.X x13 = (androidx.recyclerview.widget.X) arrayList2.get(size6);
                                if (x13.getItemId() != itemId2 || x13.isAttachedToTransitionOverlay()) {
                                    size6--;
                                } else {
                                    if (itemViewType == x13.getItemViewType()) {
                                        arrayList2.remove(size6);
                                        xCreateViewHolder = x13;
                                        break;
                                    }
                                    g(size6);
                                }
                            }
                            xCreateViewHolder = null;
                            break;
                        }
                    }
                    j10 = 4;
                    androidx.recyclerview.widget.X x14 = (androidx.recyclerview.widget.X) arrayList3.get(size5);
                    if (x14.getItemId() == itemId2 && !x14.wasReturnedFromScrap()) {
                        if (itemViewType == x14.getItemViewType()) {
                            x14.addFlags(32);
                            if (x14.isRemoved() && !t9.f17350f) {
                                x14.setFlags(2, 14);
                            }
                            xCreateViewHolder = x14;
                            break;
                        }
                        arrayList3.remove(size5);
                        recyclerView.removeDetachedView(x14.itemView, false);
                        androidx.recyclerview.widget.X xG3 = androidx.recyclerview.widget.RecyclerView.G(x14.itemView);
                        xG3.mScrapContainer = null;
                        xG3.mInChangeScrap = false;
                        xG3.clearReturnedFromScrapFlag();
                        i(xG3);
                    }
                    size5--;
                }
                if (xCreateViewHolder != null) {
                    xCreateViewHolder.mPosition = iG2;
                    z6 = z9;
                }
            } else {
                j10 = 4;
            }
            if (xCreateViewHolder == null) {
                androidx.recyclerview.widget.M m8 = (androidx.recyclerview.widget.M) c().f17239a.get(itemViewType);
                if (m8 == null) {
                    x9 = null;
                    break;
                }
                java.util.ArrayList arrayList5 = m8.f17235a;
                if (!arrayList5.isEmpty()) {
                    int size7 = arrayList5.size() - 1;
                    while (true) {
                        if (size7 < 0) {
                            x9 = null;
                            break;
                        }
                        if (!((androidx.recyclerview.widget.X) arrayList5.get(size7)).isAttachedToTransitionOverlay()) {
                            x9 = (androidx.recyclerview.widget.X) arrayList5.remove(size7);
                            break;
                        }
                        size7--;
                    }
                } else {
                    x9 = null;
                    break;
                }
                if (x9 != null) {
                    x9.resetInternal();
                    int[] iArr = androidx.recyclerview.widget.RecyclerView.f17250F0;
                }
                xCreateViewHolder = x9;
            }
            if (xCreateViewHolder == null) {
                long nanoTime = recyclerView.getNanoTime();
                if (j != Long.MAX_VALUE) {
                    long j12 = this.g.a(itemViewType).f17237c;
                    if (!((j12 == 0 || j12 + nanoTime < j) ? z9 : false)) {
                        return null;
                    }
                }
                xCreateViewHolder = recyclerView.f17312t.createViewHolder(recyclerView, itemViewType);
                if (androidx.recyclerview.widget.RecyclerView.f17254J0 && (recyclerViewB = androidx.recyclerview.widget.RecyclerView.B(xCreateViewHolder.itemView)) != null) {
                    xCreateViewHolder.mNestedRecyclerView = new java.lang.ref.WeakReference<>(recyclerViewB);
                }
                long nanoTime2 = recyclerView.getNanoTime() - nanoTime;
                androidx.recyclerview.widget.M mA = this.g.a(itemViewType);
                long j13 = mA.f17237c;
                if (j13 != 0) {
                    nanoTime2 = (nanoTime2 / j10) + ((j13 / j10) * 3);
                }
                mA.f17237c = nanoTime2;
            }
        } else {
            j9 = 3;
            j10 = 4;
        }
        if (z6 && !t9.f17350f && xCreateViewHolder.hasAnyOfTheFlags(8192)) {
            xCreateViewHolder.setFlags(0, 8192);
            if (t9.f17352i) {
                androidx.recyclerview.widget.F.b(xCreateViewHolder);
                androidx.recyclerview.widget.F f9 = recyclerView.f17279S;
                xCreateViewHolder.getUnmodifiedPayloads();
                f9.getClass();
                D1.r rVar = new D1.r();
                rVar.a(xCreateViewHolder);
                recyclerView.S(xCreateViewHolder, rVar);
            }
        }
        if (!t9.f17350f || !xCreateViewHolder.isBound()) {
            if (!xCreateViewHolder.isBound() || xCreateViewHolder.needsUpdate() || xCreateViewHolder.isInvalid()) {
                int iG3 = recyclerView.f17296l.g(i3, 0);
                D1.C0213b c0213b = null;
                xCreateViewHolder.mBindingAdapter = null;
                xCreateViewHolder.mOwnerRecyclerView = recyclerView;
                int itemViewType2 = xCreateViewHolder.getItemViewType();
                long nanoTime3 = recyclerView.getNanoTime();
                if (j != Long.MAX_VALUE) {
                    long j14 = this.g.a(itemViewType2).f17238d;
                    if (j14 == 0 || j14 + nanoTime3 < j) {
                    }
                }
                recyclerView.f17312t.bindViewHolder(xCreateViewHolder, iG3);
                long nanoTime4 = recyclerView.getNanoTime() - nanoTime3;
                androidx.recyclerview.widget.M mA2 = this.g.a(xCreateViewHolder.getItemViewType());
                long j15 = mA2.f17238d;
                if (j15 != 0) {
                    nanoTime4 = (nanoTime4 / j10) + ((j15 / j10) * j9);
                }
                mA2.f17238d = nanoTime4;
                android.view.accessibility.AccessibilityManager accessibilityManager = recyclerView.f17269I;
                if ((accessibilityManager == null || !accessibilityManager.isEnabled()) ? false : z9) {
                    android.view.View view2 = xCreateViewHolder.itemView;
                    java.util.WeakHashMap weakHashMap = D1.U.f1980a;
                    if (view2.getImportantForAccessibility() == 0) {
                        z10 = z9;
                        view2.setImportantForAccessibility(z10 ? 1 : 0);
                    } else {
                        z10 = z9;
                    }
                    androidx.recyclerview.widget.Z z13 = recyclerView.f17313t0;
                    if (z13 != null) {
                        androidx.recyclerview.widget.Y y = z13.f17365l;
                        if (y != null) {
                            android.view.View.AccessibilityDelegate accessibilityDelegateD = D1.U.d(view2);
                            if (accessibilityDelegateD != null) {
                                c0213b = accessibilityDelegateD instanceof D1.C0211a ? ((D1.C0211a) accessibilityDelegateD).f1992a : new D1.C0213b(accessibilityDelegateD);
                            }
                            if (c0213b != null && c0213b != y) {
                                y.f17363l.put(view2, c0213b);
                            }
                        }
                        D1.U.j(view2, y);
                    }
                } else {
                    z10 = z9;
                }
                if (t9.f17350f) {
                    xCreateViewHolder.mPreLayoutPosition = i3;
                }
                objArr = z10 ? 1 : 0;
            }
            layoutParams = xCreateViewHolder.itemView.getLayoutParams();
            if (layoutParams == null) {
                j11 = (androidx.recyclerview.widget.J) recyclerView.generateDefaultLayoutParams();
                xCreateViewHolder.itemView.setLayoutParams(j11);
            } else if (recyclerView.checkLayoutParams(layoutParams)) {
                j11 = (androidx.recyclerview.widget.J) layoutParams;
            } else {
                j11 = (androidx.recyclerview.widget.J) recyclerView.generateLayoutParams(layoutParams);
                xCreateViewHolder.itemView.setLayoutParams(j11);
            }
            j11.f17217a = xCreateViewHolder;
            if (z6 || objArr == null) {
                z10 = false;
            }
            j11.f17220d = z10;
            return xCreateViewHolder;
        }
        xCreateViewHolder.mPreLayoutPosition = i3;
        objArr = null;
        z10 = z9;
        layoutParams = xCreateViewHolder.itemView.getLayoutParams();
        if (layoutParams == null) {
            j11 = (androidx.recyclerview.widget.J) recyclerView.generateDefaultLayoutParams();
            xCreateViewHolder.itemView.setLayoutParams(j11);
        } else if (recyclerView.checkLayoutParams(layoutParams)) {
            j11 = (androidx.recyclerview.widget.J) recyclerView.generateLayoutParams(layoutParams);
            xCreateViewHolder.itemView.setLayoutParams(j11);
        } else {
            j11 = (androidx.recyclerview.widget.J) layoutParams;
        }
        j11.f17217a = xCreateViewHolder;
        if (z6) {
            z10 = false;
        } else {
            z10 = false;
        }
        j11.f17220d = z10;
        return xCreateViewHolder;
    }

    public final void l(androidx.recyclerview.widget.X x9) {
        if (x9.mInChangeScrap) {
            this.f17243b.remove(x9);
        } else {
            this.f17242a.remove(x9);
        }
        x9.mScrapContainer = null;
        x9.mInChangeScrap = false;
        x9.clearReturnedFromScrapFlag();
    }

    public final void m() {
        androidx.recyclerview.widget.I i3 = this.f17248h.f17314u;
        this.f17247f = this.f17246e + (i3 != null ? i3.f17212i : 0);
        java.util.ArrayList arrayList = this.f17244c;
        for (int size = arrayList.size() - 1; size >= 0 && arrayList.size() > this.f17247f; size--) {
            g(size);
        }
    }
}
