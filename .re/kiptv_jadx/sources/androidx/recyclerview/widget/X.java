package androidx.recyclerview.widget;

/* JADX INFO: loaded from: classes.dex */
public abstract class X {
    static final int FLAG_ADAPTER_FULLUPDATE = 1024;
    static final int FLAG_ADAPTER_POSITION_UNKNOWN = 512;
    static final int FLAG_APPEARED_IN_PRE_LAYOUT = 4096;
    static final int FLAG_BOUNCED_FROM_HIDDEN_LIST = 8192;
    static final int FLAG_BOUND = 1;
    static final int FLAG_IGNORE = 128;
    static final int FLAG_INVALID = 4;
    static final int FLAG_MOVED = 2048;
    static final int FLAG_NOT_RECYCLABLE = 16;
    static final int FLAG_REMOVED = 8;
    static final int FLAG_RETURNED_FROM_SCRAP = 32;
    static final int FLAG_TMP_DETACHED = 256;
    static final int FLAG_UPDATE = 2;
    private static final java.util.List<java.lang.Object> FULLUPDATE_PAYLOADS = java.util.Collections.EMPTY_LIST;
    static final int PENDING_ACCESSIBILITY_STATE_NOT_SET = -1;
    public final android.view.View itemView;
    androidx.recyclerview.widget.A mBindingAdapter;
    int mFlags;
    java.lang.ref.WeakReference<androidx.recyclerview.widget.RecyclerView> mNestedRecyclerView;
    androidx.recyclerview.widget.RecyclerView mOwnerRecyclerView;
    int mPosition = -1;
    int mOldPosition = -1;
    long mItemId = -1;
    int mItemViewType = -1;
    int mPreLayoutPosition = -1;
    androidx.recyclerview.widget.X mShadowedHolder = null;
    androidx.recyclerview.widget.X mShadowingHolder = null;
    java.util.List<java.lang.Object> mPayloads = null;
    java.util.List<java.lang.Object> mUnmodifiedPayloads = null;
    private int mIsRecyclableCount = 0;
    androidx.recyclerview.widget.O mScrapContainer = null;
    boolean mInChangeScrap = false;
    private int mWasImportantForAccessibilityBeforeHidden = 0;
    int mPendingAccessibilityState = -1;

    public X(android.view.View view) {
        if (view == null) {
            throw new java.lang.IllegalArgumentException("itemView may not be null");
        }
        this.itemView = view;
    }

    public void addChangePayload(java.lang.Object obj) {
        if (obj == null) {
            addFlags(1024);
            return;
        }
        if ((1024 & this.mFlags) == 0) {
            if (this.mPayloads == null) {
                java.util.ArrayList arrayList = new java.util.ArrayList();
                this.mPayloads = arrayList;
                this.mUnmodifiedPayloads = java.util.Collections.unmodifiableList(arrayList);
            }
            this.mPayloads.add(obj);
        }
    }

    public void addFlags(int i3) {
        this.mFlags = i3 | this.mFlags;
    }

    public void clearOldPosition() {
        this.mOldPosition = -1;
        this.mPreLayoutPosition = -1;
    }

    public void clearPayload() {
        java.util.List<java.lang.Object> list = this.mPayloads;
        if (list != null) {
            list.clear();
        }
        this.mFlags &= -1025;
    }

    public void clearReturnedFromScrapFlag() {
        this.mFlags &= -33;
    }

    public void clearTmpDetachFlag() {
        this.mFlags &= -257;
    }

    public boolean doesTransientStatePreventRecycling() {
        if ((this.mFlags & 16) != 0) {
            return false;
        }
        android.view.View view = this.itemView;
        java.util.WeakHashMap weakHashMap = D1.U.f1980a;
        return view.hasTransientState();
    }

    public void flagRemovedAndOffsetPosition(int i3, int i9, boolean z6) {
        addFlags(8);
        offsetPosition(i9, z6);
        this.mPosition = i3;
    }

    public final int getAbsoluteAdapterPosition() {
        androidx.recyclerview.widget.RecyclerView recyclerView = this.mOwnerRecyclerView;
        if (recyclerView == null) {
            return -1;
        }
        return recyclerView.D(this);
    }

    @java.lang.Deprecated
    public final int getAdapterPosition() {
        return getBindingAdapterPosition();
    }

    public final androidx.recyclerview.widget.A getBindingAdapter() {
        return this.mBindingAdapter;
    }

    public final int getBindingAdapterPosition() {
        androidx.recyclerview.widget.RecyclerView recyclerView;
        androidx.recyclerview.widget.A adapter;
        int iD;
        if (this.mBindingAdapter == null || (recyclerView = this.mOwnerRecyclerView) == null || (adapter = recyclerView.getAdapter()) == null || (iD = this.mOwnerRecyclerView.D(this)) == -1) {
            return -1;
        }
        return adapter.findRelativeAdapterPositionIn(this.mBindingAdapter, this, iD);
    }

    public final long getItemId() {
        return this.mItemId;
    }

    public final int getItemViewType() {
        return this.mItemViewType;
    }

    public final int getLayoutPosition() {
        int i3 = this.mPreLayoutPosition;
        return i3 == -1 ? this.mPosition : i3;
    }

    public final int getOldPosition() {
        return this.mOldPosition;
    }

    @java.lang.Deprecated
    public final int getPosition() {
        int i3 = this.mPreLayoutPosition;
        return i3 == -1 ? this.mPosition : i3;
    }

    public java.util.List<java.lang.Object> getUnmodifiedPayloads() {
        if ((this.mFlags & 1024) != 0) {
            return FULLUPDATE_PAYLOADS;
        }
        java.util.List<java.lang.Object> list = this.mPayloads;
        return (list == null || list.size() == 0) ? FULLUPDATE_PAYLOADS : this.mUnmodifiedPayloads;
    }

    public boolean hasAnyOfTheFlags(int i3) {
        return (i3 & this.mFlags) != 0;
    }

    public boolean isAdapterPositionUnknown() {
        return (this.mFlags & 512) != 0 || isInvalid();
    }

    public boolean isAttachedToTransitionOverlay() {
        return (this.itemView.getParent() == null || this.itemView.getParent() == this.mOwnerRecyclerView) ? false : true;
    }

    public boolean isBound() {
        return (this.mFlags & 1) != 0;
    }

    public boolean isInvalid() {
        return (this.mFlags & 4) != 0;
    }

    public final boolean isRecyclable() {
        if ((this.mFlags & 16) != 0) {
            return false;
        }
        android.view.View view = this.itemView;
        java.util.WeakHashMap weakHashMap = D1.U.f1980a;
        return !view.hasTransientState();
    }

    public boolean isRemoved() {
        return (this.mFlags & 8) != 0;
    }

    public boolean isScrap() {
        return this.mScrapContainer != null;
    }

    public boolean isTmpDetached() {
        return (this.mFlags & 256) != 0;
    }

    public boolean isUpdated() {
        return (this.mFlags & 2) != 0;
    }

    public boolean needsUpdate() {
        return (this.mFlags & 2) != 0;
    }

    public void offsetPosition(int i3, boolean z6) {
        if (this.mOldPosition == -1) {
            this.mOldPosition = this.mPosition;
        }
        if (this.mPreLayoutPosition == -1) {
            this.mPreLayoutPosition = this.mPosition;
        }
        if (z6) {
            this.mPreLayoutPosition += i3;
        }
        this.mPosition += i3;
        if (this.itemView.getLayoutParams() != null) {
            ((androidx.recyclerview.widget.J) this.itemView.getLayoutParams()).f17219c = true;
        }
    }

    public void onEnteredHiddenState(androidx.recyclerview.widget.RecyclerView recyclerView) {
        int i3 = this.mPendingAccessibilityState;
        if (i3 != -1) {
            this.mWasImportantForAccessibilityBeforeHidden = i3;
        } else {
            android.view.View view = this.itemView;
            java.util.WeakHashMap weakHashMap = D1.U.f1980a;
            this.mWasImportantForAccessibilityBeforeHidden = view.getImportantForAccessibility();
        }
        if (recyclerView.J()) {
            this.mPendingAccessibilityState = 4;
            recyclerView.f17324z0.add(this);
        } else {
            android.view.View view2 = this.itemView;
            java.util.WeakHashMap weakHashMap2 = D1.U.f1980a;
            view2.setImportantForAccessibility(4);
        }
    }

    public void onLeftHiddenState(androidx.recyclerview.widget.RecyclerView recyclerView) {
        int i3 = this.mWasImportantForAccessibilityBeforeHidden;
        if (recyclerView.J()) {
            this.mPendingAccessibilityState = i3;
            recyclerView.f17324z0.add(this);
        } else {
            android.view.View view = this.itemView;
            java.util.WeakHashMap weakHashMap = D1.U.f1980a;
            view.setImportantForAccessibility(i3);
        }
        this.mWasImportantForAccessibilityBeforeHidden = 0;
    }

    public void resetInternal() {
        this.mFlags = 0;
        this.mPosition = -1;
        this.mOldPosition = -1;
        this.mItemId = -1L;
        this.mPreLayoutPosition = -1;
        this.mIsRecyclableCount = 0;
        this.mShadowedHolder = null;
        this.mShadowingHolder = null;
        clearPayload();
        this.mWasImportantForAccessibilityBeforeHidden = 0;
        this.mPendingAccessibilityState = -1;
        androidx.recyclerview.widget.RecyclerView.g(this);
    }

    public void saveOldPosition() {
        if (this.mOldPosition == -1) {
            this.mOldPosition = this.mPosition;
        }
    }

    public void setFlags(int i3, int i9) {
        this.mFlags = (i3 & i9) | (this.mFlags & (~i9));
    }

    public final void setIsRecyclable(boolean z6) {
        int i3 = this.mIsRecyclableCount;
        int i9 = z6 ? i3 - 1 : i3 + 1;
        this.mIsRecyclableCount = i9;
        if (i9 < 0) {
            this.mIsRecyclableCount = 0;
            android.util.Log.e("View", "isRecyclable decremented below 0: unmatched pair of setIsRecyable() calls for " + this);
            return;
        }
        if (!z6 && i9 == 1) {
            this.mFlags |= 16;
        } else if (z6 && i9 == 0) {
            this.mFlags &= -17;
        }
    }

    public void setScrapContainer(androidx.recyclerview.widget.O o8, boolean z6) {
        this.mScrapContainer = o8;
        this.mInChangeScrap = z6;
    }

    public boolean shouldBeKeptAsChild() {
        return (this.mFlags & 16) != 0;
    }

    public boolean shouldIgnore() {
        return (this.mFlags & 128) != 0;
    }

    public void stopIgnoring() {
        this.mFlags &= -129;
    }

    public java.lang.String toString() {
        java.lang.StringBuilder sbN = Y6.f.n(getClass().isAnonymousClass() ? "ViewHolder" : getClass().getSimpleName(), "{");
        sbN.append(java.lang.Integer.toHexString(hashCode()));
        sbN.append(" position=");
        sbN.append(this.mPosition);
        sbN.append(" id=");
        sbN.append(this.mItemId);
        sbN.append(", oldPos=");
        sbN.append(this.mOldPosition);
        sbN.append(", pLpos:");
        sbN.append(this.mPreLayoutPosition);
        java.lang.StringBuilder sb = new java.lang.StringBuilder(sbN.toString());
        if (isScrap()) {
            sb.append(" scrap ");
            sb.append(this.mInChangeScrap ? "[changeScrap]" : "[attachedScrap]");
        }
        if (isInvalid()) {
            sb.append(" invalid");
        }
        if (!isBound()) {
            sb.append(" unbound");
        }
        if (needsUpdate()) {
            sb.append(" update");
        }
        if (isRemoved()) {
            sb.append(" removed");
        }
        if (shouldIgnore()) {
            sb.append(" ignored");
        }
        if (isTmpDetached()) {
            sb.append(" tmpDetached");
        }
        if (!isRecyclable()) {
            sb.append(" not recyclable(" + this.mIsRecyclableCount + ")");
        }
        if (isAdapterPositionUnknown()) {
            sb.append(" undefined adapter position");
        }
        if (this.itemView.getParent() == null) {
            sb.append(" no parent");
        }
        sb.append("}");
        return sb.toString();
    }

    public void unScrap() {
        this.mScrapContainer.l(this);
    }

    public boolean wasReturnedFromScrap() {
        return (this.mFlags & 32) != 0;
    }
}
