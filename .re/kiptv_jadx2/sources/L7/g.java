package L7;

import androidx.media3.exoplayer.upstream.CmcdData;
import java.lang.reflect.Array;
import java.util.AbstractList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.Iterator;
import java.util.RandomAccess;
import p121o0.p;

public final class g extends AbstractList implements RandomAccess {

    public int f7099h;

    public Object f7100i;

    public static void d(int i3) {
        String str = (i3 == 2 || i3 == 3 || i3 == 5 || i3 == 6 || i3 == 7) ? "@NotNull method %s.%s must not return null" : "Argument for @NotNull parameter '%s' of %s.%s must not be null";
        Object[] objArr = new Object[(i3 == 2 || i3 == 3 || i3 == 5 || i3 == 6 || i3 == 7) ? 2 : 3];
        switch (i3) {
            case 2:
            case 3:
            case 5:
            case 6:
            case 7:
                objArr[0] = "kotlin/reflect/jvm/internal/impl/utils/SmartList";
                break;
            case 4:
                objArr[0] = CmcdData.OBJECT_TYPE_AUDIO_ONLY;
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
        String str2 = String.format(str, objArr);
        if (i3 != 2 && i3 != 3 && i3 != 5 && i3 != 6 && i3 != 7) {
            throw new IllegalArgumentException(str2);
        }
        throw new IllegalStateException(str2);
    }

    @Override
    public final boolean add(Object obj) {
        int i3 = this.f7099h;
        if (i3 == 0) {
            this.f7100i = obj;
        } else if (i3 == 1) {
            this.f7100i = new Object[]{this.f7100i, obj};
        } else {
            Object[] objArr = (Object[]) this.f7100i;
            int length = objArr.length;
            if (i3 >= length) {
                int iC = Y6.f.c(length, 3, 2, 1);
                int i9 = i3 + 1;
                if (iC < i9) {
                    iC = i9;
                }
                Object[] objArr2 = new Object[iC];
                this.f7100i = objArr2;
                System.arraycopy(objArr, 0, objArr2, 0, length);
                objArr = objArr2;
            }
            objArr[this.f7099h] = obj;
        }
        this.f7099h++;
        ((AbstractList) this).modCount++;
        return true;
    }

    @Override
    public final void clear() {
        this.f7100i = null;
        this.f7099h = 0;
        ((AbstractList) this).modCount++;
    }

    @Override
    public final Object get(int i3) {
        int i9;
        if (i3 >= 0 && i3 < (i9 = this.f7099h)) {
            return i9 == 1 ? this.f7100i : ((Object[]) this.f7100i)[i3];
        }
        StringBuilder sbT = p.t(i3, "Index: ", ", Size: ");
        sbT.append(this.f7099h);
        throw new IndexOutOfBoundsException(sbT.toString());
    }

    @Override
    public final Iterator iterator() {
        int i3 = this.f7099h;
        if (i3 == 0) {
            return e.f7096h;
        }
        if (i3 == 1) {
            return new f(this);
        }
        Iterator it = super.iterator();
        if (it != null) {
            return it;
        }
        d(3);
        throw null;
    }

    @Override
    public final Object remove(int i3) {
        int i9;
        Object obj;
        if (i3 < 0 || i3 >= (i9 = this.f7099h)) {
            StringBuilder sbT = p.t(i3, "Index: ", ", Size: ");
            sbT.append(this.f7099h);
            throw new IndexOutOfBoundsException(sbT.toString());
        }
        if (i9 == 1) {
            obj = this.f7100i;
            this.f7100i = null;
        } else {
            Object[] objArr = (Object[]) this.f7100i;
            Object obj2 = objArr[i3];
            if (i9 == 2) {
                this.f7100i = objArr[1 - i3];
            } else {
                int i10 = (i9 - i3) - 1;
                if (i10 > 0) {
                    System.arraycopy(objArr, i3 + 1, objArr, i3, i10);
                }
                objArr[this.f7099h - 1] = null;
            }
            obj = obj2;
        }
        this.f7099h--;
        ((AbstractList) this).modCount++;
        return obj;
    }

    @Override
    public final Object set(int i3, Object obj) {
        int i9;
        if (i3 < 0 || i3 >= (i9 = this.f7099h)) {
            StringBuilder sbT = p.t(i3, "Index: ", ", Size: ");
            sbT.append(this.f7099h);
            throw new IndexOutOfBoundsException(sbT.toString());
        }
        if (i9 == 1) {
            Object obj2 = this.f7100i;
            this.f7100i = obj;
            return obj2;
        }
        Object[] objArr = (Object[]) this.f7100i;
        Object obj3 = objArr[i3];
        objArr[i3] = obj;
        return obj3;
    }

    @Override
    public final int size() {
        return this.f7099h;
    }

    @Override
    public final void sort(Comparator comparator) {
        int i3 = this.f7099h;
        if (i3 >= 2) {
            Arrays.sort((Object[]) this.f7100i, 0, i3, comparator);
        }
    }

    @Override
    public final Object[] toArray(Object[] objArr) {
        if (objArr == null) {
            d(4);
            throw null;
        }
        int length = objArr.length;
        int i3 = this.f7099h;
        if (i3 == 1) {
            if (length == 0) {
                Object[] objArr2 = (Object[]) Array.newInstance(objArr.getClass().getComponentType(), 1);
                objArr2[0] = this.f7100i;
                return objArr2;
            }
            objArr[0] = this.f7100i;
        } else {
            if (length < i3) {
                Object[] objArrCopyOf = Arrays.copyOf((Object[]) this.f7100i, i3, objArr.getClass());
                if (objArrCopyOf != null) {
                    return objArrCopyOf;
                }
                d(6);
                throw null;
            }
            if (i3 != 0) {
                System.arraycopy(this.f7100i, 0, objArr, 0, i3);
            }
        }
        int i9 = this.f7099h;
        if (length > i9) {
            objArr[i9] = null;
        }
        return objArr;
    }

    @Override
    public final void add(int i3, Object obj) {
        int i9;
        if (i3 >= 0 && i3 <= (i9 = this.f7099h)) {
            if (i9 == 0) {
                this.f7100i = obj;
            } else if (i9 == 1 && i3 == 0) {
                this.f7100i = new Object[]{obj, this.f7100i};
            } else {
                Object[] objArr = new Object[i9 + 1];
                if (i9 == 1) {
                    objArr[0] = this.f7100i;
                } else {
                    Object[] objArr2 = (Object[]) this.f7100i;
                    System.arraycopy(objArr2, 0, objArr, 0, i3);
                    System.arraycopy(objArr2, i3, objArr, i3 + 1, this.f7099h - i3);
                }
                objArr[i3] = obj;
                this.f7100i = objArr;
            }
            this.f7099h++;
            ((AbstractList) this).modCount++;
            return;
        }
        StringBuilder sbT = p.t(i3, "Index: ", ", Size: ");
        sbT.append(this.f7099h);
        throw new IndexOutOfBoundsException(sbT.toString());
    }
}
