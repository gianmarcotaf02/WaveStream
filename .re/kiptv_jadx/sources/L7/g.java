package L7;

/* JADX INFO: loaded from: classes4.dex */
public final class g extends java.util.AbstractList implements java.util.RandomAccess {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public int f7099h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public java.lang.Object f7100i;

    public static /* synthetic */ void d(int i3) {
        java.lang.String str = (i3 == 2 || i3 == 3 || i3 == 5 || i3 == 6 || i3 == 7) ? "@NotNull method %s.%s must not return null" : "Argument for @NotNull parameter '%s' of %s.%s must not be null";
        java.lang.Object[] objArr = new java.lang.Object[(i3 == 2 || i3 == 3 || i3 == 5 || i3 == 6 || i3 == 7) ? 2 : 3];
        switch (i3) {
            case 2:
            case 3:
            case 5:
            case 6:
            case 7:
                objArr[0] = "kotlin/reflect/jvm/internal/impl/utils/SmartList";
                break;
            case 4:
                objArr[0] = androidx.media3.exoplayer.upstream.CmcdData.OBJECT_TYPE_AUDIO_ONLY;
                break;
            default:
                objArr[0] = "elements";
                break;
        }
        if (i3 == 2 || i3 == 3) {
            objArr[1] = "iterator";
        } else if (i3 == 5 || i3 == 6 || i3 == 7) {
            objArr[1] = "toArray";
        } else {
            objArr[1] = "kotlin/reflect/jvm/internal/impl/utils/SmartList";
        }
        switch (i3) {
            case 2:
            case 3:
            case 5:
            case 6:
            case 7:
                break;
            case 4:
                objArr[2] = "toArray";
                break;
            default:
                objArr[2] = "<init>";
                break;
        }
        java.lang.String str2 = java.lang.String.format(str, objArr);
        if (i3 != 2 && i3 != 3 && i3 != 5 && i3 != 6 && i3 != 7) {
            throw new java.lang.IllegalArgumentException(str2);
        }
        throw new java.lang.IllegalStateException(str2);
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean add(java.lang.Object obj) {
        int i3 = this.f7099h;
        if (i3 == 0) {
            this.f7100i = obj;
        } else if (i3 == 1) {
            this.f7100i = new java.lang.Object[]{this.f7100i, obj};
        } else {
            java.lang.Object[] objArr = (java.lang.Object[]) this.f7100i;
            int length = objArr.length;
            if (i3 >= length) {
                int iC = Y6.f.c(length, 3, 2, 1);
                int i9 = i3 + 1;
                if (iC < i9) {
                    iC = i9;
                }
                java.lang.Object[] objArr2 = new java.lang.Object[iC];
                this.f7100i = objArr2;
                java.lang.System.arraycopy(objArr, 0, objArr2, 0, length);
                objArr = objArr2;
            }
            objArr[this.f7099h] = obj;
        }
        this.f7099h++;
        ((java.util.AbstractList) this).modCount++;
        return true;
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final void clear() {
        this.f7100i = null;
        this.f7099h = 0;
        ((java.util.AbstractList) this).modCount++;
    }

    @Override // java.util.AbstractList, java.util.List
    public final java.lang.Object get(int i3) {
        int i9;
        if (i3 >= 0 && i3 < (i9 = this.f7099h)) {
            return i9 == 1 ? this.f7100i : ((java.lang.Object[]) this.f7100i)[i3];
        }
        java.lang.StringBuilder sbT = p121o0.p.t(i3, "Index: ", ", Size: ");
        sbT.append(this.f7099h);
        throw new java.lang.IndexOutOfBoundsException(sbT.toString());
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.List
    public final java.util.Iterator iterator() {
        int i3 = this.f7099h;
        if (i3 == 0) {
            return L7.e.f7096h;
        }
        if (i3 == 1) {
            return new L7.f(this);
        }
        java.util.Iterator it = super.iterator();
        if (it != null) {
            return it;
        }
        d(3);
        throw null;
    }

    @Override // java.util.AbstractList, java.util.List
    public final java.lang.Object remove(int i3) {
        int i9;
        java.lang.Object obj;
        if (i3 < 0 || i3 >= (i9 = this.f7099h)) {
            java.lang.StringBuilder sbT = p121o0.p.t(i3, "Index: ", ", Size: ");
            sbT.append(this.f7099h);
            throw new java.lang.IndexOutOfBoundsException(sbT.toString());
        }
        if (i9 == 1) {
            obj = this.f7100i;
            this.f7100i = null;
        } else {
            java.lang.Object[] objArr = (java.lang.Object[]) this.f7100i;
            java.lang.Object obj2 = objArr[i3];
            if (i9 == 2) {
                this.f7100i = objArr[1 - i3];
            } else {
                int i10 = (i9 - i3) - 1;
                if (i10 > 0) {
                    java.lang.System.arraycopy(objArr, i3 + 1, objArr, i3, i10);
                }
                objArr[this.f7099h - 1] = null;
            }
            obj = obj2;
        }
        this.f7099h--;
        ((java.util.AbstractList) this).modCount++;
        return obj;
    }

    @Override // java.util.AbstractList, java.util.List
    public final java.lang.Object set(int i3, java.lang.Object obj) {
        int i9;
        if (i3 < 0 || i3 >= (i9 = this.f7099h)) {
            java.lang.StringBuilder sbT = p121o0.p.t(i3, "Index: ", ", Size: ");
            sbT.append(this.f7099h);
            throw new java.lang.IndexOutOfBoundsException(sbT.toString());
        }
        if (i9 == 1) {
            java.lang.Object obj2 = this.f7100i;
            this.f7100i = obj;
            return obj2;
        }
        java.lang.Object[] objArr = (java.lang.Object[]) this.f7100i;
        java.lang.Object obj3 = objArr[i3];
        objArr[i3] = obj;
        return obj3;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f7099h;
    }

    @Override // java.util.List
    public final void sort(java.util.Comparator comparator) {
        int i3 = this.f7099h;
        if (i3 >= 2) {
            java.util.Arrays.sort((java.lang.Object[]) this.f7100i, 0, i3, comparator);
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final java.lang.Object[] toArray(java.lang.Object[] objArr) {
        if (objArr == null) {
            d(4);
            throw null;
        }
        int length = objArr.length;
        int i3 = this.f7099h;
        if (i3 == 1) {
            if (length == 0) {
                java.lang.Object[] objArr2 = (java.lang.Object[]) java.lang.reflect.Array.newInstance(objArr.getClass().getComponentType(), 1);
                objArr2[0] = this.f7100i;
                return objArr2;
            }
            objArr[0] = this.f7100i;
        } else {
            if (length < i3) {
                java.lang.Object[] objArrCopyOf = java.util.Arrays.copyOf((java.lang.Object[]) this.f7100i, i3, objArr.getClass());
                if (objArrCopyOf != null) {
                    return objArrCopyOf;
                }
                d(6);
                throw null;
            }
            if (i3 != 0) {
                java.lang.System.arraycopy(this.f7100i, 0, objArr, 0, i3);
            }
        }
        int i9 = this.f7099h;
        if (length > i9) {
            objArr[i9] = null;
        }
        return objArr;
    }

    @Override // java.util.AbstractList, java.util.List
    public final void add(int i3, java.lang.Object obj) {
        int i9;
        if (i3 >= 0 && i3 <= (i9 = this.f7099h)) {
            if (i9 == 0) {
                this.f7100i = obj;
            } else if (i9 == 1 && i3 == 0) {
                this.f7100i = new java.lang.Object[]{obj, this.f7100i};
            } else {
                java.lang.Object[] objArr = new java.lang.Object[i9 + 1];
                if (i9 == 1) {
                    objArr[0] = this.f7100i;
                } else {
                    java.lang.Object[] objArr2 = (java.lang.Object[]) this.f7100i;
                    java.lang.System.arraycopy(objArr2, 0, objArr, 0, i3);
                    java.lang.System.arraycopy(objArr2, i3, objArr, i3 + 1, this.f7099h - i3);
                }
                objArr[i3] = obj;
                this.f7100i = objArr;
            }
            this.f7099h++;
            ((java.util.AbstractList) this).modCount++;
            return;
        }
        java.lang.StringBuilder sbT = p121o0.p.t(i3, "Index: ", ", Size: ");
        sbT.append(this.f7099h);
        throw new java.lang.IndexOutOfBoundsException(sbT.toString());
    }
}
