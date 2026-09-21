package T1;

/* JADX INFO: loaded from: classes.dex */
public final class v extends android.text.SpannableStringBuilder {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final java.lang.Class f9718h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final java.util.ArrayList f9719i;

    public v(java.lang.Class cls, java.lang.CharSequence charSequence) {
        super(charSequence);
        this.f9719i = new java.util.ArrayList();
        E8.d.K(cls, "watcherClass cannot be null");
        this.f9718h = cls;
    }

    public final void a() {
        int i3 = 0;
        while (true) {
            java.util.ArrayList arrayList = this.f9719i;
            if (i3 >= arrayList.size()) {
                return;
            }
            ((T1.u) arrayList.get(i3)).f9717i.incrementAndGet();
            i3++;
        }
    }

    @Override // android.text.SpannableStringBuilder, android.text.Editable, java.lang.Appendable
    public final android.text.Editable append(java.lang.CharSequence charSequence) {
        super.append(charSequence);
        return this;
    }

    public final void b() {
        e();
        int i3 = 0;
        while (true) {
            java.util.ArrayList arrayList = this.f9719i;
            if (i3 >= arrayList.size()) {
                return;
            }
            ((T1.u) arrayList.get(i3)).onTextChanged(this, 0, length(), length());
            i3++;
        }
    }

    public final T1.u c(java.lang.Object obj) {
        int i3 = 0;
        while (true) {
            java.util.ArrayList arrayList = this.f9719i;
            if (i3 >= arrayList.size()) {
                return null;
            }
            T1.u uVar = (T1.u) arrayList.get(i3);
            if (uVar.f9716h == obj) {
                return uVar;
            }
            i3++;
        }
    }

    public final boolean d(java.lang.Object obj) {
        if (obj != null) {
            return this.f9718h == obj.getClass();
        }
        return false;
    }

    @Override // android.text.SpannableStringBuilder, android.text.Editable
    public final android.text.Editable delete(int i3, int i9) {
        super.delete(i3, i9);
        return this;
    }

    public final void e() {
        int i3 = 0;
        while (true) {
            java.util.ArrayList arrayList = this.f9719i;
            if (i3 >= arrayList.size()) {
                return;
            }
            ((T1.u) arrayList.get(i3)).f9717i.decrementAndGet();
            i3++;
        }
    }

    @Override // android.text.SpannableStringBuilder, android.text.Spanned
    public final int getSpanEnd(java.lang.Object obj) {
        T1.u uVarC;
        if (d(obj) && (uVarC = c(obj)) != null) {
            obj = uVarC;
        }
        return super.getSpanEnd(obj);
    }

    @Override // android.text.SpannableStringBuilder, android.text.Spanned
    public final int getSpanFlags(java.lang.Object obj) {
        T1.u uVarC;
        if (d(obj) && (uVarC = c(obj)) != null) {
            obj = uVarC;
        }
        return super.getSpanFlags(obj);
    }

    @Override // android.text.SpannableStringBuilder, android.text.Spanned
    public final int getSpanStart(java.lang.Object obj) {
        T1.u uVarC;
        if (d(obj) && (uVarC = c(obj)) != null) {
            obj = uVarC;
        }
        return super.getSpanStart(obj);
    }

    @Override // android.text.SpannableStringBuilder, android.text.Spanned
    public final java.lang.Object[] getSpans(int i3, int i9, java.lang.Class cls) {
        if (this.f9718h != cls) {
            return super.getSpans(i3, i9, cls);
        }
        T1.u[] uVarArr = (T1.u[]) super.getSpans(i3, i9, T1.u.class);
        java.lang.Object[] objArr = (java.lang.Object[]) java.lang.reflect.Array.newInstance((java.lang.Class<?>) cls, uVarArr.length);
        for (int i10 = 0; i10 < uVarArr.length; i10++) {
            objArr[i10] = uVarArr[i10].f9716h;
        }
        return objArr;
    }

    @Override // android.text.SpannableStringBuilder, android.text.Editable
    public final android.text.Editable insert(int i3, java.lang.CharSequence charSequence) {
        super.insert(i3, charSequence);
        return this;
    }

    @Override // android.text.SpannableStringBuilder, android.text.Spanned
    public final int nextSpanTransition(int i3, int i9, java.lang.Class cls) {
        if (cls == null || this.f9718h == cls) {
            cls = T1.u.class;
        }
        return super.nextSpanTransition(i3, i9, cls);
    }

    @Override // android.text.SpannableStringBuilder, android.text.Spannable
    public final void removeSpan(java.lang.Object obj) {
        T1.u uVarC;
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

    @Override // android.text.SpannableStringBuilder, android.text.Editable
    public final /* bridge */ /* synthetic */ android.text.Editable replace(int i3, int i9, java.lang.CharSequence charSequence) {
        replace(i3, i9, charSequence);
        return this;
    }

    @Override // android.text.SpannableStringBuilder, android.text.Spannable
    public final void setSpan(java.lang.Object obj, int i3, int i9, int i10) {
        if (d(obj)) {
            T1.u uVar = new T1.u(obj);
            this.f9719i.add(uVar);
            obj = uVar;
        }
        super.setSpan(obj, i3, i9, i10);
    }

    @Override // android.text.SpannableStringBuilder, java.lang.CharSequence
    public final java.lang.CharSequence subSequence(int i3, int i9) {
        return new T1.v(this.f9718h, this, i3, i9);
    }

    @Override // android.text.SpannableStringBuilder, android.text.Editable, java.lang.Appendable
    public final android.text.SpannableStringBuilder append(java.lang.CharSequence charSequence) {
        super.append(charSequence);
        return this;
    }

    @Override // android.text.SpannableStringBuilder, android.text.Editable
    public final android.text.SpannableStringBuilder delete(int i3, int i9) {
        super.delete(i3, i9);
        return this;
    }

    @Override // android.text.SpannableStringBuilder, android.text.Editable
    public final android.text.SpannableStringBuilder insert(int i3, java.lang.CharSequence charSequence) {
        super.insert(i3, charSequence);
        return this;
    }

    @Override // android.text.SpannableStringBuilder, android.text.Editable
    public final /* bridge */ /* synthetic */ android.text.Editable replace(int i3, int i9, java.lang.CharSequence charSequence, int i10, int i11) {
        replace(i3, i9, charSequence, i10, i11);
        return this;
    }

    @Override // android.text.SpannableStringBuilder, android.text.Editable, java.lang.Appendable
    public final java.lang.Appendable append(java.lang.CharSequence charSequence) {
        super.append(charSequence);
        return this;
    }

    @Override // android.text.SpannableStringBuilder, android.text.Editable
    public final android.text.Editable insert(int i3, java.lang.CharSequence charSequence, int i9, int i10) {
        super.insert(i3, charSequence, i9, i10);
        return this;
    }

    @Override // android.text.SpannableStringBuilder, android.text.Editable
    public final android.text.SpannableStringBuilder replace(int i3, int i9, java.lang.CharSequence charSequence) {
        a();
        super.replace(i3, i9, charSequence);
        e();
        return this;
    }

    @Override // android.text.SpannableStringBuilder, android.text.Editable, java.lang.Appendable
    public final android.text.Editable append(char c9) {
        super.append(c9);
        return this;
    }

    @Override // android.text.SpannableStringBuilder, android.text.Editable
    public final android.text.SpannableStringBuilder insert(int i3, java.lang.CharSequence charSequence, int i9, int i10) {
        super.insert(i3, charSequence, i9, i10);
        return this;
    }

    public v(java.lang.Class cls, T1.v vVar, int i3, int i9) {
        super(vVar, i3, i9);
        this.f9719i = new java.util.ArrayList();
        E8.d.K(cls, "watcherClass cannot be null");
        this.f9718h = cls;
    }

    @Override // android.text.SpannableStringBuilder, android.text.Editable, java.lang.Appendable
    public final android.text.SpannableStringBuilder append(char c9) {
        super.append(c9);
        return this;
    }

    @Override // android.text.SpannableStringBuilder, android.text.Editable, java.lang.Appendable
    public final java.lang.Appendable append(char c9) {
        super.append(c9);
        return this;
    }

    @Override // android.text.SpannableStringBuilder, android.text.Editable
    public final android.text.SpannableStringBuilder replace(int i3, int i9, java.lang.CharSequence charSequence, int i10, int i11) {
        a();
        super.replace(i3, i9, charSequence, i10, i11);
        e();
        return this;
    }

    @Override // android.text.SpannableStringBuilder, android.text.Editable, java.lang.Appendable
    public final android.text.Editable append(java.lang.CharSequence charSequence, int i3, int i9) {
        super.append(charSequence, i3, i9);
        return this;
    }

    @Override // android.text.SpannableStringBuilder, android.text.Editable, java.lang.Appendable
    public final android.text.SpannableStringBuilder append(java.lang.CharSequence charSequence, int i3, int i9) {
        super.append(charSequence, i3, i9);
        return this;
    }

    @Override // android.text.SpannableStringBuilder, android.text.Editable, java.lang.Appendable
    public final java.lang.Appendable append(java.lang.CharSequence charSequence, int i3, int i9) {
        super.append(charSequence, i3, i9);
        return this;
    }

    @Override // android.text.SpannableStringBuilder
    public final android.text.SpannableStringBuilder append(java.lang.CharSequence charSequence, java.lang.Object obj, int i3) {
        super.append(charSequence, obj, i3);
        return this;
    }
}
