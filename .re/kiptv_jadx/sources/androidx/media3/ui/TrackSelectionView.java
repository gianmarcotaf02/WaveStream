package androidx.media3.ui;

/* JADX INFO: loaded from: classes.dex */
public class TrackSelectionView extends android.widget.LinearLayout {
    private boolean allowAdaptiveSelections;
    private boolean allowMultipleOverrides;
    private final androidx.media3.ui.TrackSelectionView.ComponentListener componentListener;
    private final android.widget.CheckedTextView defaultView;
    private final android.widget.CheckedTextView disableView;
    private final android.view.LayoutInflater inflater;
    private boolean isDisabled;
    private androidx.media3.ui.TrackSelectionView.TrackSelectionListener listener;
    private final java.util.Map<androidx.media3.common.TrackGroup, androidx.media3.common.TrackSelectionOverride> overrides;
    private final int selectableItemBackgroundResourceId;
    private final java.util.List<androidx.media3.common.Tracks.Group> trackGroups;
    private java.util.Comparator<androidx.media3.ui.TrackSelectionView.TrackInfo> trackInfoComparator;
    private androidx.media3.ui.TrackNameProvider trackNameProvider;
    private android.widget.CheckedTextView[][] trackViews;

    public class ComponentListener implements android.view.View.OnClickListener {
        private ComponentListener() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(android.view.View view) {
            androidx.media3.ui.TrackSelectionView.this.onClick(view);
        }
    }

    public static final class TrackInfo {
        public final androidx.media3.common.Tracks.Group trackGroup;
        public final int trackIndex;

        public TrackInfo(androidx.media3.common.Tracks.Group group, int i3) {
            this.trackGroup = group;
            this.trackIndex = i3;
        }

        public androidx.media3.common.Format getFormat() {
            return this.trackGroup.getTrackFormat(this.trackIndex);
        }
    }

    public interface TrackSelectionListener {
        void onTrackSelectionChanged(boolean z6, java.util.Map<androidx.media3.common.TrackGroup, androidx.media3.common.TrackSelectionOverride> map);
    }

    public TrackSelectionView(android.content.Context context) {
        this(context, null);
    }

    public static java.util.Map<androidx.media3.common.TrackGroup, androidx.media3.common.TrackSelectionOverride> filterOverrides(java.util.Map<androidx.media3.common.TrackGroup, androidx.media3.common.TrackSelectionOverride> map, java.util.List<androidx.media3.common.Tracks.Group> list, boolean z6) {
        java.util.HashMap map2 = new java.util.HashMap();
        for (int i3 = 0; i3 < list.size(); i3++) {
            androidx.media3.common.TrackSelectionOverride trackSelectionOverride = map.get(list.get(i3).getMediaTrackGroup());
            if (trackSelectionOverride != null && (z6 || map2.isEmpty())) {
                map2.put(trackSelectionOverride.mediaTrackGroup, trackSelectionOverride);
            }
        }
        return map2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ int lambda$init$0(java.util.Comparator comparator, androidx.media3.ui.TrackSelectionView.TrackInfo trackInfo, androidx.media3.ui.TrackSelectionView.TrackInfo trackInfo2) {
        return comparator.compare(trackInfo.getFormat(), trackInfo2.getFormat());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void onClick(android.view.View view) {
        if (view == this.disableView) {
            onDisableViewClicked();
        } else if (view == this.defaultView) {
            onDefaultViewClicked();
        } else {
            onTrackViewClicked(view);
        }
        updateViewStates();
        androidx.media3.ui.TrackSelectionView.TrackSelectionListener trackSelectionListener = this.listener;
        if (trackSelectionListener != null) {
            trackSelectionListener.onTrackSelectionChanged(getIsDisabled(), getOverrides());
        }
    }

    private void onDefaultViewClicked() {
        this.isDisabled = false;
        this.overrides.clear();
    }

    private void onDisableViewClicked() {
        this.isDisabled = true;
        this.overrides.clear();
    }

    private void onTrackViewClicked(android.view.View view) {
        this.isDisabled = false;
        java.lang.Object tag = view.getTag();
        tag.getClass();
        androidx.media3.ui.TrackSelectionView.TrackInfo trackInfo = (androidx.media3.ui.TrackSelectionView.TrackInfo) tag;
        androidx.media3.common.TrackGroup mediaTrackGroup = trackInfo.trackGroup.getMediaTrackGroup();
        int i3 = trackInfo.trackIndex;
        androidx.media3.common.TrackSelectionOverride trackSelectionOverride = this.overrides.get(mediaTrackGroup);
        if (trackSelectionOverride == null) {
            if (!this.allowMultipleOverrides && !this.overrides.isEmpty()) {
                this.overrides.clear();
            }
            this.overrides.put(mediaTrackGroup, new androidx.media3.common.TrackSelectionOverride(mediaTrackGroup, p076i4.AbstractC2186b0.y(java.lang.Integer.valueOf(i3))));
            return;
        }
        java.util.ArrayList arrayList = new java.util.ArrayList(trackSelectionOverride.trackIndices);
        boolean zIsChecked = ((android.widget.CheckedTextView) view).isChecked();
        boolean zShouldEnableAdaptiveSelection = shouldEnableAdaptiveSelection(trackInfo.trackGroup);
        boolean z6 = zShouldEnableAdaptiveSelection || shouldEnableMultiGroupSelection();
        if (zIsChecked && z6) {
            arrayList.remove(java.lang.Integer.valueOf(i3));
            if (arrayList.isEmpty()) {
                this.overrides.remove(mediaTrackGroup);
                return;
            } else {
                this.overrides.put(mediaTrackGroup, new androidx.media3.common.TrackSelectionOverride(mediaTrackGroup, arrayList));
                return;
            }
        }
        if (zIsChecked) {
            return;
        }
        if (!zShouldEnableAdaptiveSelection) {
            this.overrides.put(mediaTrackGroup, new androidx.media3.common.TrackSelectionOverride(mediaTrackGroup, p076i4.AbstractC2186b0.y(java.lang.Integer.valueOf(i3))));
        } else {
            arrayList.add(java.lang.Integer.valueOf(i3));
            this.overrides.put(mediaTrackGroup, new androidx.media3.common.TrackSelectionOverride(mediaTrackGroup, arrayList));
        }
    }

    private boolean shouldEnableAdaptiveSelection(androidx.media3.common.Tracks.Group group) {
        return this.allowAdaptiveSelections && group.isAdaptiveSupported();
    }

    private boolean shouldEnableMultiGroupSelection() {
        return this.allowMultipleOverrides && this.trackGroups.size() > 1;
    }

    private void updateViewStates() {
        this.disableView.setChecked(this.isDisabled);
        this.defaultView.setChecked(!this.isDisabled && this.overrides.isEmpty());
        for (int i3 = 0; i3 < this.trackViews.length; i3++) {
            androidx.media3.common.TrackSelectionOverride trackSelectionOverride = this.overrides.get(this.trackGroups.get(i3).getMediaTrackGroup());
            int i9 = 0;
            while (true) {
                android.widget.CheckedTextView[] checkedTextViewArr = this.trackViews[i3];
                if (i9 < checkedTextViewArr.length) {
                    if (trackSelectionOverride != null) {
                        java.lang.Object tag = checkedTextViewArr[i9].getTag();
                        tag.getClass();
                        this.trackViews[i3][i9].setChecked(trackSelectionOverride.trackIndices.contains(java.lang.Integer.valueOf(((androidx.media3.ui.TrackSelectionView.TrackInfo) tag).trackIndex)));
                    } else {
                        checkedTextViewArr[i9].setChecked(false);
                    }
                    i9++;
                }
            }
        }
    }

    private void updateViews() {
        for (int childCount = getChildCount() - 1; childCount >= 3; childCount--) {
            removeViewAt(childCount);
        }
        if (this.trackGroups.isEmpty()) {
            this.disableView.setEnabled(false);
            this.defaultView.setEnabled(false);
            return;
        }
        this.disableView.setEnabled(true);
        this.defaultView.setEnabled(true);
        this.trackViews = new android.widget.CheckedTextView[this.trackGroups.size()][];
        boolean zShouldEnableMultiGroupSelection = shouldEnableMultiGroupSelection();
        for (int i3 = 0; i3 < this.trackGroups.size(); i3++) {
            androidx.media3.common.Tracks.Group group = this.trackGroups.get(i3);
            boolean zShouldEnableAdaptiveSelection = shouldEnableAdaptiveSelection(group);
            android.widget.CheckedTextView[][] checkedTextViewArr = this.trackViews;
            int i9 = group.length;
            checkedTextViewArr[i3] = new android.widget.CheckedTextView[i9];
            androidx.media3.ui.TrackSelectionView.TrackInfo[] trackInfoArr = new androidx.media3.ui.TrackSelectionView.TrackInfo[i9];
            for (int i10 = 0; i10 < group.length; i10++) {
                trackInfoArr[i10] = new androidx.media3.ui.TrackSelectionView.TrackInfo(group, i10);
            }
            java.util.Comparator<androidx.media3.ui.TrackSelectionView.TrackInfo> comparator = this.trackInfoComparator;
            if (comparator != null) {
                java.util.Arrays.sort(trackInfoArr, comparator);
            }
            for (int i11 = 0; i11 < i9; i11++) {
                if (i11 == 0) {
                    addView(this.inflater.inflate(androidx.media3.ui.R.layout.exo_list_divider, (android.view.ViewGroup) this, false));
                }
                android.widget.CheckedTextView checkedTextView = (android.widget.CheckedTextView) this.inflater.inflate((zShouldEnableAdaptiveSelection || zShouldEnableMultiGroupSelection) ? android.R.layout.simple_list_item_multiple_choice : android.R.layout.simple_list_item_single_choice, (android.view.ViewGroup) this, false);
                checkedTextView.setBackgroundResource(this.selectableItemBackgroundResourceId);
                checkedTextView.setText(this.trackNameProvider.getTrackName(trackInfoArr[i11].getFormat()));
                checkedTextView.setTag(trackInfoArr[i11]);
                if (group.isTrackSupported(i11)) {
                    checkedTextView.setFocusable(true);
                    checkedTextView.setOnClickListener(this.componentListener);
                } else {
                    checkedTextView.setFocusable(false);
                    checkedTextView.setEnabled(false);
                }
                this.trackViews[i3][i11] = checkedTextView;
                addView(checkedTextView);
            }
        }
        updateViewStates();
    }

    public boolean getIsDisabled() {
        return this.isDisabled;
    }

    public java.util.Map<androidx.media3.common.TrackGroup, androidx.media3.common.TrackSelectionOverride> getOverrides() {
        return this.overrides;
    }

    public void init(java.util.List<androidx.media3.common.Tracks.Group> list, boolean z6, java.util.Map<androidx.media3.common.TrackGroup, androidx.media3.common.TrackSelectionOverride> map, final java.util.Comparator<androidx.media3.common.Format> comparator, androidx.media3.ui.TrackSelectionView.TrackSelectionListener trackSelectionListener) {
        this.isDisabled = z6;
        this.trackInfoComparator = comparator == null ? null : new java.util.Comparator() { // from class: androidx.media3.ui.q
            @Override // java.util.Comparator
            public final int compare(java.lang.Object obj, java.lang.Object obj2) {
                return androidx.media3.ui.TrackSelectionView.lambda$init$0(comparator, (androidx.media3.ui.TrackSelectionView.TrackInfo) obj, (androidx.media3.ui.TrackSelectionView.TrackInfo) obj2);
            }
        };
        this.listener = trackSelectionListener;
        this.trackGroups.clear();
        this.trackGroups.addAll(list);
        this.overrides.clear();
        this.overrides.putAll(filterOverrides(map, list, this.allowMultipleOverrides));
        updateViews();
    }

    public void setAllowAdaptiveSelections(boolean z6) {
        if (this.allowAdaptiveSelections != z6) {
            this.allowAdaptiveSelections = z6;
            updateViews();
        }
    }

    public void setAllowMultipleOverrides(boolean z6) {
        if (this.allowMultipleOverrides != z6) {
            this.allowMultipleOverrides = z6;
            if (!z6 && this.overrides.size() > 1) {
                java.util.Map<androidx.media3.common.TrackGroup, androidx.media3.common.TrackSelectionOverride> mapFilterOverrides = filterOverrides(this.overrides, this.trackGroups, false);
                this.overrides.clear();
                this.overrides.putAll(mapFilterOverrides);
            }
            updateViews();
        }
    }

    public void setShowDisableOption(boolean z6) {
        this.disableView.setVisibility(z6 ? 0 : 8);
    }

    public void setTrackNameProvider(androidx.media3.ui.TrackNameProvider trackNameProvider) {
        trackNameProvider.getClass();
        this.trackNameProvider = trackNameProvider;
        updateViews();
    }

    public TrackSelectionView(android.content.Context context, android.util.AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public TrackSelectionView(android.content.Context context, android.util.AttributeSet attributeSet, int i3) {
        super(context, attributeSet, i3);
        setOrientation(1);
        setSaveFromParentEnabled(false);
        android.content.res.TypedArray typedArrayObtainStyledAttributes = context.getTheme().obtainStyledAttributes(new int[]{android.R.attr.selectableItemBackground});
        int resourceId = typedArrayObtainStyledAttributes.getResourceId(0, 0);
        this.selectableItemBackgroundResourceId = resourceId;
        typedArrayObtainStyledAttributes.recycle();
        android.view.LayoutInflater layoutInflaterFrom = android.view.LayoutInflater.from(context);
        this.inflater = layoutInflaterFrom;
        androidx.media3.ui.TrackSelectionView.ComponentListener componentListener = new androidx.media3.ui.TrackSelectionView.ComponentListener();
        this.componentListener = componentListener;
        this.trackNameProvider = new androidx.media3.ui.DefaultTrackNameProvider(getResources());
        this.trackGroups = new java.util.ArrayList();
        this.overrides = new java.util.HashMap();
        android.widget.CheckedTextView checkedTextView = (android.widget.CheckedTextView) layoutInflaterFrom.inflate(android.R.layout.simple_list_item_single_choice, (android.view.ViewGroup) this, false);
        this.disableView = checkedTextView;
        checkedTextView.setBackgroundResource(resourceId);
        checkedTextView.setText(androidx.media3.ui.R.string.exo_track_selection_none);
        checkedTextView.setEnabled(false);
        checkedTextView.setFocusable(true);
        checkedTextView.setOnClickListener(componentListener);
        checkedTextView.setVisibility(8);
        addView(checkedTextView);
        addView(layoutInflaterFrom.inflate(androidx.media3.ui.R.layout.exo_list_divider, (android.view.ViewGroup) this, false));
        android.widget.CheckedTextView checkedTextView2 = (android.widget.CheckedTextView) layoutInflaterFrom.inflate(android.R.layout.simple_list_item_single_choice, (android.view.ViewGroup) this, false);
        this.defaultView = checkedTextView2;
        checkedTextView2.setBackgroundResource(resourceId);
        checkedTextView2.setText(androidx.media3.ui.R.string.exo_track_selection_auto);
        checkedTextView2.setEnabled(false);
        checkedTextView2.setFocusable(true);
        checkedTextView2.setOnClickListener(componentListener);
        addView(checkedTextView2);
    }
}
