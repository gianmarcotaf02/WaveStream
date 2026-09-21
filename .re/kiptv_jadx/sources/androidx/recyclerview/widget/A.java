package androidx.recyclerview.widget;

/* JADX INFO: loaded from: classes.dex */
public abstract class A {
    private final androidx.recyclerview.widget.B mObservable = new androidx.recyclerview.widget.B();
    private boolean mHasStableIds = false;
    private androidx.recyclerview.widget.EnumC1643z mStateRestorationPolicy = androidx.recyclerview.widget.EnumC1643z.f17523h;

    public final void bindViewHolder(androidx.recyclerview.widget.X x9, int i3) {
        boolean z6 = x9.mBindingAdapter == null;
        if (z6) {
            x9.mPosition = i3;
            if (hasStableIds()) {
                x9.mItemId = getItemId(i3);
            }
            x9.setFlags(1, 519);
            int i9 = p204z1.d.f32142a;
            android.os.Trace.beginSection("RV OnBindView");
        }
        x9.mBindingAdapter = this;
        onBindViewHolder(x9, i3, x9.getUnmodifiedPayloads());
        if (z6) {
            x9.clearPayload();
            android.view.ViewGroup.LayoutParams layoutParams = x9.itemView.getLayoutParams();
            if (layoutParams instanceof androidx.recyclerview.widget.J) {
                ((androidx.recyclerview.widget.J) layoutParams).f17219c = true;
            }
            int i10 = p204z1.d.f32142a;
            android.os.Trace.endSection();
        }
    }

    public boolean canRestoreState() {
        int iOrdinal = this.mStateRestorationPolicy.ordinal();
        if (iOrdinal != 1) {
            return iOrdinal != 2;
        }
        return getItemCount() > 0;
    }

    public final androidx.recyclerview.widget.X createViewHolder(android.view.ViewGroup viewGroup, int i3) {
        try {
            int i9 = p204z1.d.f32142a;
            android.os.Trace.beginSection("RV CreateView");
            androidx.recyclerview.widget.X xOnCreateViewHolder = onCreateViewHolder(viewGroup, i3);
            if (xOnCreateViewHolder.itemView.getParent() != null) {
                throw new java.lang.IllegalStateException("ViewHolder views must not be attached when created. Ensure that you are not passing 'true' to the attachToRoot parameter of LayoutInflater.inflate(..., boolean attachToRoot)");
            }
            xOnCreateViewHolder.mItemViewType = i3;
            android.os.Trace.endSection();
            return xOnCreateViewHolder;
        } catch (java.lang.Throwable th) {
            int i10 = p204z1.d.f32142a;
            android.os.Trace.endSection();
            throw th;
        }
    }

    public int findRelativeAdapterPositionIn(androidx.recyclerview.widget.A a2, androidx.recyclerview.widget.X x9, int i3) {
        if (a2 == this) {
            return i3;
        }
        return -1;
    }

    public abstract int getItemCount();

    public long getItemId(int i3) {
        return -1L;
    }

    public int getItemViewType(int i3) {
        return 0;
    }

    public final androidx.recyclerview.widget.EnumC1643z getStateRestorationPolicy() {
        return this.mStateRestorationPolicy;
    }

    public final boolean hasObservers() {
        return this.mObservable.a();
    }

    public final boolean hasStableIds() {
        return this.mHasStableIds;
    }

    public final void notifyDataSetChanged() {
        this.mObservable.b();
    }

    public final void notifyItemChanged(int i3) {
        this.mObservable.d(i3, 1, null);
    }

    public final void notifyItemInserted(int i3) {
        this.mObservable.e(i3, 1);
    }

    public final void notifyItemMoved(int i3, int i9) {
        this.mObservable.c(i3, i9);
    }

    public final void notifyItemRangeChanged(int i3, int i9) {
        this.mObservable.d(i3, i9, null);
    }

    public final void notifyItemRangeInserted(int i3, int i9) {
        this.mObservable.e(i3, i9);
    }

    public final void notifyItemRangeRemoved(int i3, int i9) {
        this.mObservable.f(i3, i9);
    }

    public final void notifyItemRemoved(int i3) {
        this.mObservable.f(i3, 1);
    }

    public void onAttachedToRecyclerView(androidx.recyclerview.widget.RecyclerView recyclerView) {
    }

    public abstract void onBindViewHolder(androidx.recyclerview.widget.X x9, int i3);

    public void onBindViewHolder(androidx.recyclerview.widget.X x9, int i3, java.util.List<java.lang.Object> list) {
        onBindViewHolder(x9, i3);
    }

    public abstract androidx.recyclerview.widget.X onCreateViewHolder(android.view.ViewGroup viewGroup, int i3);

    public void onDetachedFromRecyclerView(androidx.recyclerview.widget.RecyclerView recyclerView) {
    }

    public boolean onFailedToRecycleView(androidx.recyclerview.widget.X x9) {
        return false;
    }

    public void onViewAttachedToWindow(androidx.recyclerview.widget.X x9) {
    }

    public void onViewDetachedFromWindow(androidx.recyclerview.widget.X x9) {
    }

    public void onViewRecycled(androidx.recyclerview.widget.X x9) {
    }

    public void registerAdapterDataObserver(androidx.recyclerview.widget.C c9) {
        this.mObservable.registerObserver(c9);
    }

    public void setHasStableIds(boolean z6) {
        if (hasObservers()) {
            throw new java.lang.IllegalStateException("Cannot change whether this adapter has stable IDs while the adapter has registered observers.");
        }
        this.mHasStableIds = z6;
    }

    public void setStateRestorationPolicy(androidx.recyclerview.widget.EnumC1643z enumC1643z) {
        this.mStateRestorationPolicy = enumC1643z;
        this.mObservable.g();
    }

    public void unregisterAdapterDataObserver(androidx.recyclerview.widget.C c9) {
        this.mObservable.unregisterObserver(c9);
    }

    public final void notifyItemChanged(int i3, java.lang.Object obj) {
        this.mObservable.d(i3, 1, obj);
    }

    public final void notifyItemRangeChanged(int i3, int i9, java.lang.Object obj) {
        this.mObservable.d(i3, i9, obj);
    }
}
