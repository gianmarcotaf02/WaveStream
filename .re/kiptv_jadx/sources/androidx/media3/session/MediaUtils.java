package androidx.media3.session;

/* JADX INFO: loaded from: classes.dex */
final class MediaUtils {
    public static final long POSITION_DIFF_TOLERANCE_MS = 100;
    private static final java.lang.String TAG = "MediaUtils";
    public static final int TRANSACTION_SIZE_LIMIT_IN_BYTES = 262144;
    public static final androidx.media3.session.legacy.MediaBrowserServiceCompat.BrowserRoot defaultBrowserRoot = new androidx.media3.session.legacy.MediaBrowserServiceCompat.BrowserRoot(androidx.media3.session.MediaLibraryService.SERVICE_INTERFACE, null);

    private MediaUtils() {
    }

    public static boolean areEqualError(androidx.media3.session.legacy.PlaybackStateCompat playbackStateCompat, androidx.media3.session.legacy.PlaybackStateCompat playbackStateCompat2) {
        boolean z6 = playbackStateCompat != null && playbackStateCompat.getState() == 7;
        boolean z9 = playbackStateCompat2 != null && playbackStateCompat2.getState() == 7;
        if (z6 && z9) {
            return ((androidx.media3.session.legacy.PlaybackStateCompat) androidx.media3.common.util.Util.castNonNull(playbackStateCompat)).getErrorCode() == ((androidx.media3.session.legacy.PlaybackStateCompat) androidx.media3.common.util.Util.castNonNull(playbackStateCompat2)).getErrorCode() && android.text.TextUtils.equals(((androidx.media3.session.legacy.PlaybackStateCompat) androidx.media3.common.util.Util.castNonNull(playbackStateCompat)).getErrorMessage(), ((androidx.media3.session.legacy.PlaybackStateCompat) androidx.media3.common.util.Util.castNonNull(playbackStateCompat2)).getErrorMessage());
        }
        return z6 == z9;
    }

    public static boolean areSessionPositionInfosInSamePeriodOrAd(androidx.media3.session.SessionPositionInfo sessionPositionInfo, androidx.media3.session.SessionPositionInfo sessionPositionInfo2) {
        androidx.media3.common.Player.PositionInfo positionInfo = sessionPositionInfo.positionInfo;
        int i3 = positionInfo.mediaItemIndex;
        androidx.media3.common.Player.PositionInfo positionInfo2 = sessionPositionInfo2.positionInfo;
        return i3 == positionInfo2.mediaItemIndex && positionInfo.periodIndex == positionInfo2.periodIndex && positionInfo.adGroupIndex == positionInfo2.adGroupIndex && positionInfo.adIndexInAdGroup == positionInfo2.adIndexInAdGroup;
    }

    public static int calculateBufferedPercentage(long j, long j9) {
        if (j == androidx.media3.common.C.TIME_UNSET || j9 == androidx.media3.common.C.TIME_UNSET) {
            return 0;
        }
        if (j9 == 0) {
            return 100;
        }
        return androidx.media3.common.util.Util.constrainValue(androidx.media3.common.util.Util.percentInt(j, j9), 0, 100);
    }

    public static androidx.media3.common.Player.Commands createPlayerCommandsWith(int i3) {
        return new androidx.media3.common.Player.Commands.Builder().add(i3).build();
    }

    public static androidx.media3.common.Player.Commands createPlayerCommandsWithout(int i3) {
        return new androidx.media3.common.Player.Commands.Builder().addAllCommands().remove(i3).build();
    }

    public static int[] generateUnshuffledIndices(int i3) {
        int[] iArr = new int[i3];
        for (int i9 = 0; i9 < i3; i9++) {
            iArr[i9] = i9;
        }
        return iArr;
    }

    public static long getUpdatedCurrentPositionMs(androidx.media3.session.PlayerInfo playerInfo, long j, long j9, long j10) {
        boolean z6 = playerInfo.sessionPositionInfo.equals(androidx.media3.session.SessionPositionInfo.DEFAULT) || j9 < playerInfo.sessionPositionInfo.eventTimeMs;
        if (playerInfo.isPlaying) {
            if (z6 || j == androidx.media3.common.C.TIME_UNSET) {
                if (j10 == androidx.media3.common.C.TIME_UNSET) {
                    j10 = android.os.SystemClock.elapsedRealtime() - playerInfo.sessionPositionInfo.eventTimeMs;
                }
                androidx.media3.session.SessionPositionInfo sessionPositionInfo = playerInfo.sessionPositionInfo;
                long j11 = sessionPositionInfo.positionInfo.positionMs + ((long) (j10 * playerInfo.playbackParameters.speed));
                long j12 = sessionPositionInfo.durationMs;
                return j12 != androidx.media3.common.C.TIME_UNSET ? java.lang.Math.min(j11, j12) : j11;
            }
        } else if (z6 || j == androidx.media3.common.C.TIME_UNSET) {
            return playerInfo.sessionPositionInfo.positionInfo.positionMs;
        }
        return j;
    }

    public static androidx.media3.common.Player.Commands intersect(androidx.media3.common.Player.Commands commands, androidx.media3.common.Player.Commands commands2) {
        if (commands == null || commands2 == null) {
            return androidx.media3.common.Player.Commands.EMPTY;
        }
        androidx.media3.common.Player.Commands.Builder builder = new androidx.media3.common.Player.Commands.Builder();
        for (int i3 = 0; i3 < commands.size(); i3++) {
            if (commands2.contains(commands.get(i3))) {
                builder.add(commands.get(i3));
            }
        }
        return builder.build();
    }

    public static androidx.media3.session.PlayerInfo mergePlayerInfo(androidx.media3.session.PlayerInfo playerInfo, androidx.media3.session.PlayerInfo playerInfo2, androidx.media3.session.PlayerInfo.BundlingExclusions bundlingExclusions, androidx.media3.common.Player.Commands commands, boolean z6, androidx.media3.session.SessionToken sessionToken) {
        androidx.media3.session.PlayerInfo playerInfoCopyWithCurrentTracks;
        if (bundlingExclusions.isTimelineExcluded && commands.contains(17)) {
            E8.d.L("Invalid PlayerInfo update, old index: " + playerInfo.sessionPositionInfo.positionInfo.mediaItemIndex + " (count=" + playerInfo.timeline.getWindowCount() + "), new index = " + playerInfo2.sessionPositionInfo.positionInfo.mediaItemIndex + ", sent from " + sessionToken.getPackageName() + ", interface version=" + sessionToken.getInterfaceVersion(), playerInfo.timeline.isEmpty() || playerInfo2.sessionPositionInfo.positionInfo.mediaItemIndex < playerInfo.timeline.getWindowCount());
            playerInfoCopyWithCurrentTracks = playerInfo2.copyWithTimeline(playerInfo.timeline);
        } else {
            playerInfoCopyWithCurrentTracks = playerInfo2;
        }
        if (bundlingExclusions.areCurrentTracksExcluded && commands.contains(30)) {
            playerInfoCopyWithCurrentTracks = playerInfoCopyWithCurrentTracks.copyWithCurrentTracks(playerInfo.currentTracks);
        }
        return (z6 && playerInfo2.volume == 0.0f) ? playerInfoCopyWithCurrentTracks.copyWithUnmuteVolume(playerInfo.unmuteVolume) : playerInfoCopyWithCurrentTracks;
    }

    public static <T> java.util.List<T> removeNullElements(java.util.List<T> list) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        for (T t9 : list) {
            if (t9 != null) {
                arrayList.add(t9);
            }
        }
        return arrayList;
    }

    public static void setMediaItemsWithStartIndexAndPosition(androidx.media3.common.Player player, androidx.media3.session.MediaSession.MediaItemsWithStartPosition mediaItemsWithStartPosition) {
        if (mediaItemsWithStartPosition.startIndex == -1) {
            if (player.isCommandAvailable(20)) {
                player.setMediaItems(mediaItemsWithStartPosition.mediaItems, true);
                return;
            } else {
                if (mediaItemsWithStartPosition.mediaItems.isEmpty()) {
                    return;
                }
                player.setMediaItem((androidx.media3.common.MediaItem) mediaItemsWithStartPosition.mediaItems.get(0), true);
                return;
            }
        }
        if (player.isCommandAvailable(20)) {
            player.setMediaItems(mediaItemsWithStartPosition.mediaItems, mediaItemsWithStartPosition.startIndex, mediaItemsWithStartPosition.startPositionMs);
        } else {
            if (mediaItemsWithStartPosition.mediaItems.isEmpty()) {
                return;
            }
            player.setMediaItem((androidx.media3.common.MediaItem) mediaItemsWithStartPosition.mediaItems.get(0), mediaItemsWithStartPosition.startPositionMs);
        }
    }

    public static <T extends android.os.Parcelable> java.util.List<T> truncateListBySize(java.util.List<T> list, int i3) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        android.os.Parcel parcelObtain = android.os.Parcel.obtain();
        for (int i9 = 0; i9 < list.size(); i9++) {
            try {
                T t9 = list.get(i9);
                parcelObtain.writeParcelable(t9, 0);
                if (parcelObtain.dataSize() >= i3) {
                    break;
                }
                arrayList.add(t9);
            } catch (java.lang.Throwable th) {
                parcelObtain.recycle();
                throw th;
            }
        }
        parcelObtain.recycle();
        return arrayList;
    }
}
