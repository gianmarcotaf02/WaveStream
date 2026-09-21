package T1;

import android.text.Editable;
import android.text.SpannableStringBuilder;
import java.lang.reflect.Array;
import java.util.ArrayList;

public final class v extends SpannableStringBuilder {

    public final Class f9718h;

    public final ArrayList f9719i;

    public v(Class cls, CharSequence charSequence) {
        super(charSequence);
        this.f9719i = new ArrayList();
        E8.d.K(cls, "watcherClass cannot be null");
        this.f9718h = cls;
    }

    public final void a() {
        int i3 = 0;
        while (true) {
            ArrayList arrayList = this.f9719i;
            if (i3 >= arrayList.size()) {
                return;
            }
            ((u) arrayList.get(i3)).f9717i.incrementAndGet();
            i3++;
        }
    }

    @Override
    public final Editable append(CharSequence charSequence) {
        super.append(charSequence);
        return this;
    }

    public final void b() {
        e();
        int i3 = 0;
        while (true) {
            ArrayList arrayList = this.f9719i;
            if (i3 >= arrayList.size()) {
                return;
            }
            ((u) arrayList.get(i3)).onTextChanged(this, 0, length(), length());
            i3++;
        }
    }

    public final u c(Object obj) {
        int i3 = 0;
        while (true) {
            ArrayList arrayList = this.f9719i;
            if (i3 >= arrayList.size()) {
                return null;
            }
            u uVar = (u) arrayList.get(i3);
            if (uVar.f9716h == obj) {
                return uVar;
            }
            i3++;
        }
    }

    public final boolean d(Object obj) {
        if (obj != null) {
            return this.f9718h == obj.getClass();
        }
        return false;
    }

    @Override
    public final Editable delete(int i3, int i9) {
        super.delete(i3, i9);
        return this;
    }

    public final void e() {
        int i3 = 0;
        while (true) {
            ArrayList arrayList = this.f9719i;
            if (i3 >= arrayList.size()) {
                return;
            }
            ((u) arrayList.get(i3)).f9717i.decrementAndGet();
            i3++;
        }
    }

    @Override
    public final int getSpanEnd(Object obj) {
        u uVarC;
        if (d(obj) && (uVarC = c(obj)) != null) {
            obj = uVarC;
        }
        return super.getSpanEnd(obj);
    }

    @Override
    public final int getSpanFlags(Object obj) {
        u uVarC;
        if (d(obj) && (uVarC = c(obj)) != null) {
            obj = uVarC;
        }
        return super.getSpanFlags(obj);
    }

    @Override
    public final int getSpanStart(Object obj) {
        u uVarC;
        if (d(obj) && (uVarC = c(obj)) != null) {
            obj = uVarC;
        }
        return super.getSpanStart(obj);
    }

    @Override
    public final Object[] getSpans(int i3, int i9, Class cls) {
        if (this.f9718h != cls) {
            return super.getSpans(i3, i9, cls);
        }
        u[] uVarArr = (u[]) super.getSpans(i3, i9, u.class);
        Object[] objArr = (Object[]) Array.newInstance((Class<?>) cls, uVarArr.length);
        for (int i10 = 0; i10 < uVarArr.length; i10++) {
            objArr[i10] = uVarArr[i10].f9716h;
        }
        return objArr;
    }

    @Override
    public final Editable insert(int i3, CharSequence charSequence) {
        super.insert(i3, charSequence);
        return this;
    }

    @Override
    public final int nextSpanTransition(int i3, int i9, Class cls) {
        if (cls == null || this.f9718h == cls) {
            cls = u.class;
        }
        return super.nextSpanTransition(i3, i9, cls);
    }

    @Override
    public final void removeSpan(Object obj) {
        u uVarC;
        if (d(obj)) {
            uVarC = c(obj);
            if (uVarC != null) {
                obj = uVarC;
            }
        } else {
            uVarC = null;
        }
        super.removeSpan(obj);
        if (uVarC != null) {
            this.f9719i.remove(uVarC);
        }
    }

    @Override
    public final Editable replace(int i3, int i9, CharSequence charSequence) {
        replace(i3, i9, charSequence);
        return this;
    }

    @Override
    public final void setSpan(Object obj, int i3, int i9, int i10) {
        if (d(obj)) {
            u uVar = new u(obj);
            this.f9719i.add(uVar);
            obj = uVar;
        }
        super.setSpan(obj, i3, i9, i10);
    }

    @Override
    public final CharSequence subSequence(int i3, int i9) {
        return new v(this.f9718h, this, i3, i9);
    }

    @Override
    public final SpannableStringBuilder append(CharSequence charSequence) {
        super.append(charSequence);
        return this;
    }

    @Override
    public final SpannableStringBuilder delete(int i3, int i9) {
        super.delete(i3, i9);
        return this;
    }

    @Override
    public final SpannableStringBuilder insert(int i3, CharSequence charSequence) {
        super.insert(i3, charSequence);
        return this;
    }

    @Override
    public final Editable replace(int i3, int i9, CharSequence charSequence, int i10, int i11) {
        replace(i3, i9, charSequence, i10, i11);
        return this;
    }

    @Override
    public final Appendable append(CharSequence charSequence) {
        super.append(charSequence);
        return this;
    }

    @Override
    public final Editable insert(int i3, CharSequence charSequence, int i9, int i10) {
        super.insert(i3, charSequence, i9, i10);
        return this;
    }

    @Override
    public final SpannableStringBuilder replace(int i3, int i9, CharSequence charSequence) {
        a();
        super.replace(i3, i9, charSequence);
        e();
        return this;
    }

    @Override
    public final Editable append(char c9) {
        super.append(c9);
        return this;
    }

    @Override
    public final SpannableStringBuilder insert(int i3, CharSequence charSequence, int i9, int i10) {
        super.insert(i3, charSequence, i9, i10);
        return this;
    }

    public v(Class cls, v vVar, int i3, int i9) {
        super(vVar, i3, i9);
        this.f9719i = new ArrayList();
        E8.d.K(cls, "watcherClass cannot be null");
        this.f9718h = cls;
    }

    @Override
    public final SpannableStringBuilder append(char c9) {
        super.append(c9);
        return this;
    }

    @Override
    public final Appendable append(char c9) {
        super.append(c9);
        return this;
    }

    @Override
    public final SpannableStringBuilder replace(int i3, int i9, CharSequence charSequence, int i10, int i11) {
        a();
        super.replace(i3, i9, charSequence, i10, i11);
        e();
        return this;
    }

    @Override
    public final Editable append(CharSequence charSequence, int i3, int i9) {
        super.append(charSequence, i3, i9);
        return this;
    }

    @Override
    public final SpannableStringBuilder append(CharSequence charSequence, int i3, int i9) {
        super.append(charSequence, i3, i9);
        return this;
    }

    @Override
    public final Appendable append(CharSequence charSequence, int i3, int i9) {
        super.append(charSequence, i3, i9);
        return this;
    }

    @Override
    public final SpannableStringBuilder append(CharSequence charSequence, Object obj, int i3) {
        super.append(charSequence, obj, i3);
        return this;
    }
}
