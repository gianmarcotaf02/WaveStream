package androidx.media3.exoplayer.trackselection;

import android.graphics.Point;
import androidx.media3.common.TrackGroup;
import androidx.media3.common.Tracks;
import androidx.media3.common.util.Util;
import androidx.media3.exoplayer.source.TrackGroupArray;
import java.util.Arrays;
import java.util.List;
import p076i4.AbstractC2186b0;
import p076i4.S0;
import p076i4.Y;
import p076i4.Z;

public final class TrackSelectionUtil {

    public interface AdaptiveTrackSelectionFactory {
        ExoTrackSelection createAdaptiveTrackSelection(ExoTrackSelection.Definition definition);
    }

    private TrackSelectionUtil() {
    }

    public static Tracks buildTracks(MappingTrackSelector.MappedTrackInfo mappedTrackInfo, TrackSelection[] trackSelectionArr) {
        S0 s0Y;
        List[] listArr = new List[trackSelectionArr.length];
        for (int i3 = 0; i3 < trackSelectionArr.length; i3++) {
            TrackSelection trackSelection = trackSelectionArr[i3];
            if (trackSelection != null) {
                s0Y = AbstractC2186b0.y(trackSelection);
            } else {
                Z z6 = AbstractC2186b0.f22868i;
                s0Y = S0.f22832l;
            }
            listArr[i3] = s0Y;
        }
        return buildTracks(mappedTrackInfo, (List<? extends TrackSelection>[]) listArr);
    }

    public static ExoTrackSelection[] createTrackSelectionsForDefinitions(ExoTrackSelection.Definition[] definitionArr, AdaptiveTrackSelectionFactory adaptiveTrackSelectionFactory) {
        ExoTrackSelection[] exoTrackSelectionArr = new ExoTrackSelection[definitionArr.length];
        boolean z6 = false;
        for (int i3 = 0; i3 < definitionArr.length; i3++) {
            ExoTrackSelection.Definition definition = definitionArr[i3];
            if (definition != null) {
                int[] iArr = definition.tracks;
                if (iArr.length <= 1 || z6) {
                    exoTrackSelectionArr[i3] = new FixedTrackSelection(definition.group, iArr[0], definition.type);
                } else {
                    exoTrackSelectionArr[i3] = adaptiveTrackSelectionFactory.createAdaptiveTrackSelection(definition);
                    z6 = true;
                }
            }
        }
        return exoTrackSelectionArr;
    }

    public static Point getMaxVideoSizeInViewport(boolean z6, int i3, int i9, int i10, int i11) {
        if (z6) {
            if ((i10 > i11) == (i3 > i9)) {
                i9 = i3;
                i3 = i9;
            }
        } else {
            i9 = i3;
            i3 = i9;
        }
        int i12 = i10 * i3;
        int i13 = i11 * i9;
        return i12 >= i13 ? new Point(i9, Util.ceilDivide(i13, i10)) : new Point(Util.ceilDivide(i12, i11), i3);
    }

    @Deprecated
    public static DefaultTrackSelector.Parameters updateParametersWithOverride(DefaultTrackSelector.Parameters parameters, int i3, TrackGroupArray trackGroupArray, boolean z6, DefaultTrackSelector.SelectionOverride selectionOverride) {
        DefaultTrackSelector.Parameters.Builder rendererDisabled = parameters.buildUpon().clearSelectionOverrides(i3).setRendererDisabled(i3, z6);
        if (selectionOverride != null) {
            rendererDisabled.setSelectionOverride(i3, trackGroupArray, selectionOverride);
        }
        return rendererDisabled.build();
    }

    public static Tracks buildTracks(MappingTrackSelector.MappedTrackInfo mappedTrackInfo, List<? extends TrackSelection>[] listArr) {
        boolean z6;
        Y y = new Y(4);
        boolean z9 = false;
        int i3 = 0;
        while (i3 < mappedTrackInfo.getRendererCount()) {
            TrackGroupArray trackGroups = mappedTrackInfo.getTrackGroups(i3);
            int i9 = z9 ? 1 : 0;
            MappingTrackSelector.MappedTrackInfo mappedTrackInfo2 = mappedTrackInfo;
            boolean z10 = z9;
            while (i9 < trackGroups.length) {
                TrackGroup trackGroup = trackGroups.get(i9);
                boolean z11 = mappedTrackInfo2.getAdaptiveSupport(i3, i9, z10) != 0 ? true : z10 ? 1 : 0;
                int i10 = trackGroup.length;
                int[] iArr = new int[i10];
                boolean[] zArr = new boolean[i10];
                int i11 = z10 ? 1 : 0;
                MappingTrackSelector.MappedTrackInfo mappedTrackInfo3 = mappedTrackInfo2;
                boolean z12 = z10;
                while (i11 < trackGroup.length) {
                    iArr[i11] = mappedTrackInfo3.getTrackSupport(i3, i9, i11);
                    int length = listArr.length;
                    int i12 = z12 ? 1 : 0;
                    boolean z13 = i12;
                    while (i12 < length) {
                        z6 = z12;
                        List<? extends TrackSelection> list = listArr[i12];
                        for (?? r9 = z6; r9 < list.size(); r9++) {
                            TrackSelection trackSelection = list.get(r9);
                            if (trackSelection.getTrackGroup().equals(trackGroup) && trackSelection.indexOf(i11) != -1) {
                                z13 = true;
                                break;
                            }
                        }
                        i12++;
                        listArr = listArr;
                        z6 = false;
                        z13 = z13;
                    }
                    z6 = z12;
                    zArr[i11] = z13;
                    i11++;
                    mappedTrackInfo3 = mappedTrackInfo;
                    listArr = listArr;
                    z12 = false;
                }
                y.c(new Tracks.Group(trackGroup, z11, iArr, zArr));
                i9++;
                mappedTrackInfo2 = mappedTrackInfo;
                listArr = listArr;
                z10 = false;
            }
            i3++;
            z9 = false;
        }
        TrackGroupArray unmappedTrackGroups = mappedTrackInfo.getUnmappedTrackGroups();
        for (int i13 = 0; i13 < unmappedTrackGroups.length; i13++) {
            TrackGroup trackGroup2 = unmappedTrackGroups.get(i13);
            int[] iArr2 = new int[trackGroup2.length];
            Arrays.fill(iArr2, 0);
            y.c(new Tracks.Group(trackGroup2, false, iArr2, new boolean[trackGroup2.length]));
        }
        return new Tracks(y.f());
    }
}
