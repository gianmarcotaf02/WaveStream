package androidx.recyclerview.widget;

import android.os.Trace;
import android.view.ViewGroup;
import java.util.List;

public abstract class A {
    private final B mObservable = new B();
    private boolean mHasStableIds = false;
    private EnumC1643z mStateRestorationPolicy = EnumC1643z.f17523h;

    public final void bindViewHolder(X x9, int i3) {
        boolean z6 = x9.mBindingAdapter == null;
        if (z6) {
            x9.mPosition = i3;
            if (hasStableIds()) {
                x9.mItemId = getItemId(i3);
            }
            x9.setFlags(1, 519);
            int i9 = p204z1.d.f32142a;
            Trace.beginSection("RV OnBindView");
        }
        x9.mBindingAdapter = this;
        onBindViewHolder(x9, i3, x9.getUnmodifiedPayloads());
        if (z6) {
            x9.clearPayload();
            ViewGroup.LayoutParams layoutParams = x9.itemView.getLayoutParams();
            if (layoutParams instanceof J) {
                ((J) layoutParams).f17219c = true;
            }
            int i10 = p204z1.d.f32142a;
            Trace.endSection();
        }
    }

    public boolean canRestoreState() {
        int iOrdinal = this.mStateRestorationPolicy.ordinal();
        if (iOrdinal != 1) {
            return iOrdinal != 2;
        }
        return getItemCount() > 0;
    }

    public final X createViewHolder(ViewGroup viewGroup, int i3) {
        try {
            int i9 = p204z1.d.f32142a;
            Trace.beginSection("RV CreateView");
            X xOnCreateViewHolder = onCreateViewHolder(viewGroup, i3);
            if (xOnCreateViewHolder.itemView.getParent() != null) {
                throw new IllegalStateException("ViewHolder views must not be attached when created. Ensure that you are not passing 'true' to the attachToRoot parameter of LayoutInflater.inflate(..., boolean attachToRoot)");
            }
            xOnCreateViewHolder.mItemViewType = i3;
            Trace.endSection();
            return xOnCreateViewHolder;
        } catch (Throwable th) {
            int i10 = p204z1.d.f32142a;
            Trace.endSection();
            throw th;
        }
    }

    public int findRelativeAdapterPositionIn(A a2, X x9, int i3) {
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

    public final EnumC1643z getStateRestorationPolicy() {
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

    public void onAttachedToRecyclerView(RecyclerView recyclerView) {
    }

    public abstract void onBindViewHolder(X x9, int i3);

    public void onBindViewHolder(X x9, int i3, List<Object> list) {
        onBindViewHolder(x9, i3);
    }

    public abstract X onCreateViewHolder(ViewGroup viewGroup, int i3);

    public void onDetachedFromRecyclerView(RecyclerView recyclerView) {
    }

    public boolean onFailedToRecycleView(X x9) {
        return false;
    }

    public void onViewAttachedToWindow(X x9) {
    }

    public void onViewDetachedFromWindow(X x9) {
    }

    public void onViewRecycled(X x9) {
    }

    public void registerAdapterDataObserver(C c9) {
        this.mObservable.registerObserver(c9);
    }

    public void setHasStableIds(boolean z6) {
        if (hasObservers()) {
            throw new IllegalStateException("Cannot change whether this adapter has stable IDs while the adapter has registered observers.");
        }
        this.mHasStableIds = z6;
    }

    public void setStateRestorationPolicy(EnumC1643z enumC1643z) {
        this.mStateRestorationPolicy = enumC1643z;
        this.mObservable.g();
    }

    public void unregisterAdapterDataObserver(C c9) {
        this.mObservable.unregisterObserver(c9);
    }

    public final void notifyItemChanged(int i3, Object obj) {
        this.mObservable.d(i3, 1, obj);
    }

    public final void notifyItemRangeChanged(int i3, int i9, Object obj) {
        this.mObservable.d(i3, i9, obj);
    }
}
