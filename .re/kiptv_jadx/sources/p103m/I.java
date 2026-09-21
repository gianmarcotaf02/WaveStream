package p103m;

/* JADX INFO: loaded from: classes.dex */
public final class I implements android.widget.ListAdapter, android.widget.SpinnerAdapter {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public android.widget.SpinnerAdapter f24918a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public android.widget.ListAdapter f24919b;

    @Override // android.widget.ListAdapter
    public final boolean areAllItemsEnabled() {
        android.widget.ListAdapter listAdapter = this.f24919b;
        if (listAdapter != null) {
            return listAdapter.areAllItemsEnabled();
        }
        return true;
    }

    @Override // android.widget.Adapter
    public final int getCount() {
        android.widget.SpinnerAdapter spinnerAdapter = this.f24918a;
        if (spinnerAdapter == null) {
            return 0;
        }
        return spinnerAdapter.getCount();
    }

    @Override // android.widget.SpinnerAdapter
    public final android.view.View getDropDownView(int i3, android.view.View view, android.view.ViewGroup viewGroup) {
        android.widget.SpinnerAdapter spinnerAdapter = this.f24918a;
        if (spinnerAdapter == null) {
            return null;
        }
        return spinnerAdapter.getDropDownView(i3, view, viewGroup);
    }

    @Override // android.widget.Adapter
    public final java.lang.Object getItem(int i3) {
        android.widget.SpinnerAdapter spinnerAdapter = this.f24918a;
        if (spinnerAdapter == null) {
            return null;
        }
        return spinnerAdapter.getItem(i3);
    }

    @Override // android.widget.Adapter
    public final long getItemId(int i3) {
        android.widget.SpinnerAdapter spinnerAdapter = this.f24918a;
        if (spinnerAdapter == null) {
            return -1L;
        }
        return spinnerAdapter.getItemId(i3);
    }

    @Override // android.widget.Adapter
    public final int getItemViewType(int i3) {
        return 0;
    }

    @Override // android.widget.Adapter
    public final android.view.View getView(int i3, android.view.View view, android.view.ViewGroup viewGroup) {
        return getDropDownView(i3, view, viewGroup);
    }

    @Override // android.widget.Adapter
    public final int getViewTypeCount() {
        return 1;
    }

    @Override // android.widget.Adapter
    public final boolean hasStableIds() {
        android.widget.SpinnerAdapter spinnerAdapter = this.f24918a;
        return spinnerAdapter != null && spinnerAdapter.hasStableIds();
    }

    @Override // android.widget.Adapter
    public final boolean isEmpty() {
        return getCount() == 0;
    }

    @Override // android.widget.ListAdapter
    public final boolean isEnabled(int i3) {
        android.widget.ListAdapter listAdapter = this.f24919b;
        if (listAdapter != null) {
            return listAdapter.isEnabled(i3);
        }
        return true;
    }

    @Override // android.widget.Adapter
    public final void registerDataSetObserver(android.database.DataSetObserver dataSetObserver) {
        android.widget.SpinnerAdapter spinnerAdapter = this.f24918a;
        if (spinnerAdapter != null) {
            spinnerAdapter.registerDataSetObserver(dataSetObserver);
        }
    }

    @Override // android.widget.Adapter
    public final void unregisterDataSetObserver(android.database.DataSetObserver dataSetObserver) {
        android.widget.SpinnerAdapter spinnerAdapter = this.f24918a;
        if (spinnerAdapter != null) {
            spinnerAdapter.unregisterDataSetObserver(dataSetObserver);
        }
    }
}
