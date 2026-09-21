package androidx.media3.exoplayer.trackselection;

/* JADX INFO: loaded from: classes.dex */
public final class TrackSelectionUtil {

    public interface AdaptiveTrackSelectionFactory {
        androidx.media3.exoplayer.trackselection.ExoTrackSelection createAdaptiveTrackSelection(androidx.media3.exoplayer.trackselection.ExoTrackSelection.Definition definition);
    }

    private TrackSelectionUtil() {
    }

    public static androidx.media3.common.Tracks buildTracks(androidx.media3.exoplayer.trackselection.MappingTrackSelector.MappedTrackInfo mappedTrackInfo, androidx.media3.exoplayer.trackselection.TrackSelection[] trackSelectionArr) {
        p076i4.S0 s0Y;
        java.util.List[] listArr = new java.util.List[trackSelectionArr.length];
        for (int i3 = 0; i3 < trackSelectionArr.length; i3++) {
            androidx.media3.exoplayer.trackselection.TrackSelection trackSelection = trackSelectionArr[i3];
            if (trackSelection != null) {
                s0Y = p076i4.AbstractC2186b0.y(trackSelection);
            } else {
                p076i4.Z z6 = p076i4.AbstractC2186b0.f22868i;
                s0Y = p076i4.S0.f22832l;
            }
            listArr[i3] = s0Y;
        }
        return buildTracks(mappedTrackInfo, (java.util.List<? extends androidx.media3.exoplayer.trackselection.TrackSelection>[]) listArr);
    }

    public static androidx.media3.exoplayer.trackselection.ExoTrackSelection[] createTrackSelectionsForDefinitions(androidx.media3.exoplayer.trackselection.ExoTrackSelection.Definition[] definitionArr, androidx.media3.exoplayer.trackselection.TrackSelectionUtil.AdaptiveTrackSelectionFactory adaptiveTrackSelectionFactory) {
        androidx.media3.exoplayer.trackselection.ExoTrackSelection[] exoTrackSelectionArr = new androidx.media3.exoplayer.trackselection.ExoTrackSelection[definitionArr.length];
        boolean z6 = false;
        for (int i3 = 0; i3 < definitionArr.length; i3++) {
            androidx.media3.exoplayer.trackselection.ExoTrackSelection.Definition definition = definitionArr[i3];
            if (definition != null) {
                int[] iArr = definition.tracks;
                if (iArr.length <= 1 || z6) {
                    exoTrackSelectionArr[i3] = new androidx.media3.exoplayer.trackselection.FixedTrackSelection(definition.group, iArr[0], definition.type);
                } else {
                    exoTrackSelectionArr[i3] = adaptiveTrackSelectionFactory.createAdaptiveTrackSelection(definition);
                    z6 = true;
                }
            }
        }
        return exoTrackSelectionArr;
    }

    /* JADX WARN: Code duplicated, block: B:11:0x000f  */
    public static android.graphics.Point getMaxVideoSizeInViewport(boolean z6, int i3, int i9, int i10, int i11) {
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
        return i12 >= i13 ? new android.graphics.Point(i9, androidx.media3.common.util.Util.ceilDivide(i13, i10)) : new android.graphics.Point(androidx.media3.common.util.Util.ceilDivide(i12, i11), i3);
    }

    @java.lang.Deprecated
    public static androidx.media3.exoplayer.trackselection.DefaultTrackSelector.Parameters updateParametersWithOverride(androidx.media3.exoplayer.trackselection.DefaultTrackSelector.Parameters parameters, int i3, androidx.media3.exoplayer.source.TrackGroupArray trackGroupArray, boolean z6, androidx.media3.exoplayer.trackselection.DefaultTrackSelector.SelectionOverride selectionOverride) {
        androidx.media3.exoplayer.trackselection.DefaultTrackSelector.Parameters.Builder rendererDisabled = parameters.buildUpon().clearSelectionOverrides(i3).setRendererDisabled(i3, z6);
        if (selectionOverride != null) {
            rendererDisabled.setSelectionOverride(i3, trackGroupArray, selectionOverride);
        }
        return rendererDisabled.build();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r15v0 */
    /* JADX WARN: Type inference failed for: r3v11, types: [int] */
    /* JADX WARN: Type inference failed for: r3v21 */
    /* JADX WARN: Type inference failed for: r3v22 */
    public static androidx.media3.common.Tracks buildTracks(androidx.media3.exoplayer.trackselection.MappingTrackSelector.MappedTrackInfo mappedTrackInfo, java.util.List<? extends androidx.media3.exoplayer.trackselection.TrackSelection>[] listArr) {
        boolean z6;
        p076i4.Y y = new p076i4.Y(4);
        boolean z9 = false;
        int i3 = 0;
        while (i3 < mappedTrackInfo.getRendererCount()) {
            androidx.media3.exoplayer.source.TrackGroupArray trackGroups = mappedTrackInfo.getTrackGroups(i3);
            int i9 = z9 ? 1 : 0;
            androidx.media3.exoplayer.trackselection.MappingTrackSelector.MappedTrackInfo mappedTrackInfo2 = mappedTrackInfo;
            boolean z10 = z9;
            while (i9 < trackGroups.length) {
                androidx.media3.common.TrackGroup trackGroup = trackGroups.get(i9);
                boolean z11 = mappedTrackInfo2.getAdaptiveSupport(i3, i9, z10) != 0 ? true : z10 ? 1 : 0;
                int i10 = trackGroup.length;
                int[] iArr = new int[i10];
                boolean[] zArr = new boolean[i10];
                int i11 = z10 ? 1 : 0;
                androidx.media3.exoplayer.trackselection.MappingTrackSelector.MappedTrackInfo mappedTrackInfo3 = mappedTrackInfo2;
                boolean z12 = z10;
                while (i11 < trackGroup.length) {
                    iArr[i11] = mappedTrackInfo3.getTrackSupport(i3, i9, i11);
                    int length = listArr.length;
                    int i12 = z12 ? 1 : 0;
                    boolean z13 = i12;
                    while (i12 < length) {
                        z6 = z12;
                        java.util.List<? extends androidx.media3.exoplayer.trackselection.TrackSelection> list = listArr[i12];
                        for (?? r9 = z6; r9 < list.size(); r9++) {
                            androidx.media3.exoplayer.trackselection.TrackSelection trackSelection = list.get(r9);
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
                y.c(new androidx.media3.common.Tracks.Group(trackGroup, z11, iArr, zArr));
                i9++;
                mappedTrackInfo2 = mappedTrackInfo;
                listArr = listArr;
                z10 = false;
            }
            i3++;
            z9 = false;
        }
        androidx.media3.exoplayer.source.TrackGroupArray unmappedTrackGroups = mappedTrackInfo.getUnmappedTrackGroups();
        for (int i13 = 0; i13 < unmappedTrackGroups.length; i13++) {
            androidx.media3.common.TrackGroup trackGroup2 = unmappedTrackGroups.get(i13);
            int[] iArr2 = new int[trackGroup2.length];
            java.util.Arrays.fill(iArr2, 0);
            y.c(new androidx.media3.common.Tracks.Group(trackGroup2, false, iArr2, new boolean[trackGroup2.length]));
        }
        return new androidx.media3.common.Tracks(y.f());
    }
}
