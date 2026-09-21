package p110m7;

import java.io.UnsupportedEncodingException;
import java.util.AbstractList;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.RandomAccess;

public final class s extends AbstractList implements RandomAccess, t {

    public static final H f25504i = new H(new s());

    public final ArrayList f25505h;

    public s() {
        this.f25505h = new ArrayList();
    }

    @Override
    public final void add(int i3, Object obj) {
        this.f25505h.add(i3, (String) obj);
        ((AbstractList) this).modCount++;
    }

    @Override
    public final boolean addAll(Collection collection) {
        return addAll(this.f25505h.size(), collection);
    }

    @Override
    public final List b() {
        return Collections.unmodifiableList(this.f25505h);
    }

    @Override
    public final H c() {
        return new H(this);
    }

    @Override
    public final void clear() {
        this.f25505h.clear();
        ((AbstractList) this).modCount++;
    }

    @Override
    public final Object get(int i3) {
        ArrayList arrayList = this.f25505h;
        Object obj = arrayList.get(i3);
        if (obj instanceof String) {
            return (String) obj;
        }
        if (obj instanceof AbstractC2632e) {
            AbstractC2632e abstractC2632e = (AbstractC2632e) obj;
            String strW = abstractC2632e.w();
            if (abstractC2632e.q()) {
                arrayList.set(i3, strW);
            }
            return strW;
        }
        byte[] bArr = (byte[]) obj;
        byte[] bArr2 = q.f25502a;
        try {
            String str = new String(bArr, "UTF-8");
            if (D.c(bArr, 0, bArr.length) == 0) {
                arrayList.set(i3, str);
            }
            return str;
        } catch (UnsupportedEncodingException e6) {
            throw new RuntimeException("UTF-8 not supported?", e6);
        }
    }

    @Override
    public final AbstractC2632e i(int i3) {
        AbstractC2632e uVar;
        ArrayList arrayList = this.f25505h;
        Object obj = arrayList.get(i3);
        if (obj instanceof AbstractC2632e) {
            uVar = (AbstractC2632e) obj;
        } else if (obj instanceof String) {
            try {
                uVar = new u(((String) obj).getBytes("UTF-8"));
            } catch (UnsupportedEncodingException e6) {
                throw new RuntimeException("UTF-8 not supported?", e6);
            }
        } else {
            byte[] bArr = (byte[]) obj;
            int length = bArr.length;
            byte[] bArr2 = new byte[length];
            System.arraycopy(bArr, 0, bArr2, 0, length);
            uVar = new u(bArr2);
        }
        if (uVar != obj) {
            arrayList.set(i3, uVar);
        }
        return uVar;
    }

    @Override
    public final void l(u uVar) {
        this.f25505h.add(uVar);
        ((AbstractList) this).modCount++;
    }

    @Override
    public final Object remove(int i3) {
        Object objRemove = this.f25505h.remove(i3);
        ((AbstractList) this).modCount++;
        if (objRemove instanceof String) {
            return (String) objRemove;
        }
        if (objRemove instanceof AbstractC2632e) {
            return ((AbstractC2632e) objRemove).w();
        }
        byte[] bArr = (byte[]) objRemove;
        byte[] bArr2 = q.f25502a;
        try {
            return new String(bArr, "UTF-8");
        } catch (UnsupportedEncodingException e6) {
            throw new RuntimeException("UTF-8 not supported?", e6);
        }
    }

    @Override
    public final Object set(int i3, Object obj) {
        Object obj2 = this.f25505h.set(i3, (String) obj);
        if (obj2 instanceof String) {
            return (String) obj2;
        }
        if (obj2 instanceof AbstractC2632e) {
            return ((AbstractC2632e) obj2).w();
        }
        byte[] bArr = (byte[]) obj2;
        byte[] bArr2 = q.f25502a;
        try {
            return new String(bArr, "UTF-8");
        } catch (UnsupportedEncodingException e6) {
            throw new RuntimeException("UTF-8 not supported?", e6);
        }
    }

    @Override
    public final int size() {
        return this.f25505h.size();
    }

    public s(t tVar) {
        this.f25505h = new ArrayList(tVar.size());
        addAll(tVar);
    }

    @Override
    public final boolean addAll(int i3, Collection collection) {
        if (collection instanceof t) {
            collection = ((t) collection).b();
        }
        boolean zAddAll = this.f25505h.addAll(i3, collection);
        ((AbstractList) this).modCount++;
        return zAddAll;
    }
}
