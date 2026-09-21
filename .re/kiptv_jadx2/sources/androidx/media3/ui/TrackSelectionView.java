package androidx.media3.ui;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.CheckedTextView;
import android.widget.LinearLayout;
import androidx.media3.common.Format;
import androidx.media3.common.TrackGroup;
import androidx.media3.common.TrackSelectionOverride;
import androidx.media3.common.Tracks;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import p076i4.AbstractC2186b0;

public class TrackSelectionView extends LinearLayout {
    private boolean allowAdaptiveSelections;
    private boolean allowMultipleOverrides;
    private final ComponentListener componentListener;
    private final CheckedTextView defaultView;
    private final CheckedTextView disableView;
    private final LayoutInflater inflater;
    private boolean isDisabled;
    private TrackSelectionListener listener;
    private final Map<TrackGroup, TrackSelectionOverride> overrides;
    private final int selectableItemBackgroundResourceId;
    private final List<Tracks.Group> trackGroups;
    private Comparator<TrackInfo> trackInfoComparator;
    private TrackNameProvider trackNameProvider;
    private CheckedTextView[][] trackViews;

    public class ComponentListener implements View.OnClickListener {
        private ComponentListener() {
        }

        @Override
        public void onClick(View view) {
            TrackSelectionView.this.onClick(view);
        }
    }

    public static final class TrackInfo {
        public final Tracks.Group trackGroup;
        public final int trackIndex;

        public TrackInfo(Tracks.Group group, int i3) {
            this.trackGroup = group;
            this.trackIndex = i3;
        }

        public Format getFormat() {
            return this.trackGroup.getTrackFormat(this.trackIndex);
        }
    }

    public interface TrackSelectionListener {
        void onTrackSelectionChanged(boolean z6, Map<TrackGroup, TrackSelectionOverride> map);
    }

    public TrackSelectionView(Context context) {
        this(context, null);
    }

    public static Map<TrackGroup, TrackSelectionOverride> filterOverrides(Map<TrackGroup, TrackSelectionOverride> map, List<Tracks.Group> list, boolean z6) {
        HashMap map2 = new HashMap();
        for (int i3 = 0; i3 < list.size(); i3++) {
            TrackSelectionOverride trackSelectionOverride = map.get(list.get(i3).getMediaTrackGroup());
            if (trackSelectionOverride != null && (z6 || map2.isEmpty())) {
                map2.put(trackSelectionOverride.mediaTrackGroup, trackSelectionOverride);
            }
        }
        return map2;
    }

    public static int lambda$init$0(Comparator comparator, TrackInfo trackInfo, TrackInfo trackInfo2) {
        return comparator.compare(trackInfo.getFormat(), trackInfo2.getFormat());
    }

    public void onClick(View view) {
        if (view == this.disableView) {
            onDisableViewClicked();
        } else if (view == this.defaultView) {
            onDefaultViewClicked();
        } else {
            onTrackViewClicked(view);
        }
        updateViewStates();
        TrackSelectionListener trackSelectionListener = this.listener;
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

    private void onTrackViewClicked(View view) {
        this.isDisabled = false;
        Object tag = view.getTag();
        tag.getClass();
        TrackInfo trackInfo = (TrackInfo) tag;
        TrackGroup mediaTrackGroup = trackInfo.trackGroup.getMediaTrackGroup();
        int i3 = trackInfo.trackIndex;
        TrackSelectionOverride trackSelectionOverride = this.overrides.get(mediaTrackGroup);
        if (trackSelectionOverride == null) {
            if (!this.allowMultipleOverrides && !this.overrides.isEmpty()) {
                this.overrides.clear();
            }
            this.overrides.put(mediaTrackGroup, new TrackSelectionOverride(mediaTrackGroup, AbstractC2186b0.y(Integer.valueOf(i3))));
            return;
        }
        ArrayList arrayList = new ArrayList(trackSelectionOverride.trackIndices);
        boolean zIsChecked = ((CheckedTextView) view).isChecked();
        boolean zShouldEnableAdaptiveSelection = shouldEnableAdaptiveSelection(trackInfo.trackGroup);
        boolean z6 = zShouldEnableAdaptiveSelection || shouldEnableMultiGroupSelection();
        if (zIsChecked && z6) {
            arrayList.remove(Integer.valueOf(i3));
            if (arrayList.isEmpty()) {
                this.overrides.remove(mediaTrackGroup);
                return;
            } else {
                this.overrides.put(mediaTrackGroup, new TrackSelectionOverride(mediaTrackGroup, arrayList));
                return;
            }
        }
        if (zIsChecked) {
            return;
        }
        if (!zShouldEnableAdaptiveSelection) {
            this.overrides.put(mediaTrackGroup, new TrackSelectionOverride(mediaTrackGroup, AbstractC2186b0.y(Integer.valueOf(i3))));
        } else {
            arrayList.add(Integer.valueOf(i3));
            this.overrides.put(mediaTrackGroup, new TrackSelectionOverride(mediaTrackGroup, arrayList));
        }
    }

    private boolean shouldEnableAdaptiveSelection(Tracks.Group group) {
        return this.allowAdaptiveSelections && group.isAdaptiveSupported();
    }

    private boolean shouldEnableMultiGroupSelection() {
        return this.allowMultipleOverrides && this.trackGroups.size() > 1;
    }

    private void updateViewStates() {
        this.disableView.setChecked(this.isDisabled);
        this.defaultView.setChecked(!this.isDisabled && this.overrides.isEmpty());
        for (int i3 = 0; i3 < this.trackViews.length; i3++) {
            TrackSelectionOverride trackSelectionOverride = this.overrides.get(this.trackGroups.get(i3).getMediaTrackGroup());
            int i9 = 0;
            while (true) {
                CheckedTextView[] checkedTextViewArr = this.trackViews[i3];
                if (i9 < checkedTextViewArr.length) {
                    if (trackSelectionOverride != null) {
                        Object tag = checkedTextViewArr[i9].getTag();
                        tag.getClass();
                        this.trackViews[i3][i9].setChecked(trackSelectionOverride.trackIndices.contains(Integer.valueOf(((TrackInfo) tag).trackIndex)));
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
        this.trackViews = new CheckedTextView[this.trackGroups.size()][];
        boolean zShouldEnableMultiGroupSelection = shouldEnableMultiGroupSelection();
        for (int i3 = 0; i3 < this.trackGroups.size(); i3++) {
            Tracks.Group group = this.trackGroups.get(i3);
            boolean zShouldEnableAdaptiveSelection = shouldEnableAdaptiveSelection(group);
            CheckedTextView[][] checkedTextViewArr = this.trackViews;
            int i9 = group.length;
            checkedTextViewArr[i3] = new CheckedTextView[i9];
            TrackInfo[] trackInfoArr = new TrackInfo[i9];
            for (int i10 = 0; i10 < group.length; i10++) {
                trackInfoArr[i10] = new TrackInfo(group, i10);
            }
            Comparator<TrackInfo> comparator = this.trackInfoComparator;
            if (comparator != null) {
                Arrays.sort(trackInfoArr, comparator);
            }
            for (int i11 = 0; i11 < i9; i11++) {
                if (i11 == 0) {
                    addView(this.inflater.inflate(R.layout.exo_list_divider, (ViewGroup) this, false));
                }
                CheckedTextView checkedTextView = (CheckedTextView) this.inflater.inflate((zShouldEnableAdaptiveSelection || zShouldEnableMultiGroupSelection) ? android.R.layout.simple_list_item_multiple_choice : android.R.layout.simple_list_item_single_choice, (ViewGroup) this, false);
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

    public Map<TrackGroup, TrackSelectionOverride> getOverrides() {
        return this.overrides;
    }

    public void init(List<Tracks.Group> list, boolean z6, Map<TrackGroup, TrackSelectionOverride> map, final Comparator<Format> comparator, TrackSelectionListener trackSelectionListener) {
        this.isDisabled = z6;
        this.trackInfoComparator = comparator == null ? null : new Comparator() {
            @Override
            public final int compare(Object obj, Object obj2) {
                return TrackSelectionView.lambda$init$0(comparator, (TrackSelectionView.TrackInfo) obj, (TrackSelectionView.TrackInfo) obj2);
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
                Map<TrackGroup, TrackSelectionOverride> mapFilterOverrides = filterOverrides(this.overrides, this.trackGroups, false);
                this.overrides.clear();
                this.overrides.putAll(mapFilterOverrides);
            }
            updateViews();
        }
    }

    public void setShowDisableOption(boolean z6) {
        this.disableView.setVisibility(z6 ? 0 : 8);
    }

    public void setTrackNameProvider(TrackNameProvider trackNameProvider) {
        trackNameProvider.getClass();
        this.trackNameProvider = trackNameProvider;
        updateViews();
    }

    public TrackSelectionView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public TrackSelectionView(Context context, AttributeSet attributeSet, int i3) {
        super(context, attributeSet, i3);
        setOrientation(1);
        setSaveFromParentEnabled(false);
        TypedArray typedArrayObtainStyledAttributes = context.getTheme().obtainStyledAttributes(new int[]{android.R.attr.selectableItemBackground});
        int resourceId = typedArrayObtainStyledAttributes.getResourceId(0, 0);
        this.selectableItemBackgroundResourceId = resourceId;
        typedArrayObtainStyledAttributes.recycle();
        LayoutInflater layoutInflaterFrom = LayoutInflater.from(context);
        this.inflater = layoutInflaterFrom;
        ComponentListener componentListener = new ComponentListener();
        this.componentListener = componentListener;
        this.trackNameProvider = new DefaultTrackNameProvider(getResources());
        this.trackGroups = new ArrayList();
        this.overrides = new HashMap();
        CheckedTextView checkedTextView = (CheckedTextView) layoutInflaterFrom.inflate(android.R.layout.simple_list_item_single_choice, (ViewGroup) this, false);
        this.disableView = checkedTextView;
        checkedTextView.setBackgroundResource(resourceId);
        checkedTextView.setText(R.string.exo_track_selection_none);
        checkedTextView.setEnabled(false);
        checkedTextView.setFocusable(true);
        checkedTextView.setOnClickListener(componentListener);
        checkedTextView.setVisibility(8);
        addView(checkedTextView);
        addView(layoutInflaterFrom.inflate(R.layout.exo_list_divider, (ViewGroup) this, false));
        CheckedTextView checkedTextView2 = (CheckedTextView) layoutInflaterFrom.inflate(android.R.layout.simple_list_item_single_choice, (ViewGroup) this, false);
        this.defaultView = checkedTextView2;
        checkedTextView2.setBackgroundResource(resourceId);
        checkedTextView2.setText(R.string.exo_track_selection_auto);
        checkedTextView2.setEnabled(false);
        checkedTextView2.setFocusable(true);
        checkedTextView2.setOnClickListener(componentListener);
        addView(checkedTextView2);
    }
}
