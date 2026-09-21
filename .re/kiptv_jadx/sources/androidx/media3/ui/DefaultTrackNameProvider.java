package androidx.media3.ui;

/* JADX INFO: loaded from: classes.dex */
public class DefaultTrackNameProvider implements androidx.media3.ui.TrackNameProvider {
    private final android.content.res.Resources resources;

    public DefaultTrackNameProvider(android.content.res.Resources resources) {
        resources.getClass();
        this.resources = resources;
    }

    private java.lang.String buildAudioChannelString(androidx.media3.common.Format format) {
        int i3 = format.channelCount;
        if (i3 == -1 || i3 < 1) {
            return "";
        }
        if (i3 == 1) {
            return this.resources.getString(androidx.media3.ui.R.string.exo_track_mono);
        }
        if (i3 == 2) {
            return this.resources.getString(androidx.media3.ui.R.string.exo_track_stereo);
        }
        if (i3 == 6 || i3 == 7) {
            return this.resources.getString(androidx.media3.ui.R.string.exo_track_surround_5_point_1);
        }
        return i3 != 8 ? this.resources.getString(androidx.media3.ui.R.string.exo_track_surround) : this.resources.getString(androidx.media3.ui.R.string.exo_track_surround_7_point_1);
    }

    private java.lang.String buildBitrateString(androidx.media3.common.Format format) {
        int i3 = format.bitrate;
        return i3 == -1 ? "" : this.resources.getString(androidx.media3.ui.R.string.exo_track_bitrate, java.lang.Float.valueOf(i3 / 1000000.0f));
    }

    private java.lang.String buildLabelString(androidx.media3.common.Format format) {
        return android.text.TextUtils.isEmpty(format.label) ? "" : format.label;
    }

    private java.lang.String buildLanguageOrLabelString(androidx.media3.common.Format format) {
        java.lang.String strJoinWithSeparator = joinWithSeparator(buildLanguageString(format), buildRoleString(format));
        return android.text.TextUtils.isEmpty(strJoinWithSeparator) ? buildLabelString(format) : strJoinWithSeparator;
    }

    private java.lang.String buildLanguageString(androidx.media3.common.Format format) {
        java.lang.String str = format.language;
        if (android.text.TextUtils.isEmpty(str) || androidx.media3.common.C.LANGUAGE_UNDETERMINED.equals(str)) {
            return "";
        }
        java.util.Locale localeForLanguageTag = java.util.Locale.forLanguageTag(str);
        java.util.Locale defaultDisplayLocale = androidx.media3.common.util.Util.getDefaultDisplayLocale();
        java.lang.String displayName = localeForLanguageTag.getDisplayName(defaultDisplayLocale);
        if (android.text.TextUtils.isEmpty(displayName)) {
            return "";
        }
        try {
            int iOffsetByCodePoints = displayName.offsetByCodePoints(0, 1);
            return displayName.substring(0, iOffsetByCodePoints).toUpperCase(defaultDisplayLocale) + displayName.substring(iOffsetByCodePoints);
        } catch (java.lang.IndexOutOfBoundsException unused) {
            return displayName;
        }
    }

    private java.lang.String buildResolutionString(androidx.media3.common.Format format) {
        int i3 = format.width;
        int i9 = format.height;
        return (i3 == -1 || i9 == -1) ? "" : this.resources.getString(androidx.media3.ui.R.string.exo_track_resolution, java.lang.Integer.valueOf(i3), java.lang.Integer.valueOf(i9));
    }

    private java.lang.String buildRoleString(androidx.media3.common.Format format) {
        java.lang.String string = (format.roleFlags & 2) != 0 ? this.resources.getString(androidx.media3.ui.R.string.exo_track_role_alternate) : "";
        if ((format.roleFlags & 4) != 0) {
            string = joinWithSeparator(string, this.resources.getString(androidx.media3.ui.R.string.exo_track_role_supplementary));
        }
        if ((format.roleFlags & 8) != 0) {
            string = joinWithSeparator(string, this.resources.getString(androidx.media3.ui.R.string.exo_track_role_commentary));
        }
        return (format.roleFlags & 1088) != 0 ? joinWithSeparator(string, this.resources.getString(androidx.media3.ui.R.string.exo_track_role_closed_captions)) : string;
    }

    private static int inferPrimaryTrackType(androidx.media3.common.Format format) {
        int trackType = androidx.media3.common.MimeTypes.getTrackType(format.sampleMimeType);
        if (trackType != -1) {
            return trackType;
        }
        if (androidx.media3.common.MimeTypes.getVideoMediaMimeType(format.codecs) != null) {
            return 2;
        }
        if (androidx.media3.common.MimeTypes.getAudioMediaMimeType(format.codecs) != null) {
            return 1;
        }
        if (format.width == -1 && format.height == -1) {
            return (format.channelCount == -1 && format.sampleRate == -1) ? -1 : 1;
        }
        return 2;
    }

    private java.lang.String joinWithSeparator(java.lang.String... strArr) {
        java.lang.String string = "";
        for (java.lang.String str : strArr) {
            if (!str.isEmpty()) {
                string = android.text.TextUtils.isEmpty(string) ? str : this.resources.getString(androidx.media3.ui.R.string.exo_item_list, string, str);
            }
        }
        return string;
    }

    @Override // androidx.media3.ui.TrackNameProvider
    public java.lang.String getTrackName(androidx.media3.common.Format format) {
        java.lang.String strJoinWithSeparator;
        int iInferPrimaryTrackType = inferPrimaryTrackType(format);
        if (iInferPrimaryTrackType == 2) {
            strJoinWithSeparator = joinWithSeparator(buildRoleString(format), buildResolutionString(format), buildBitrateString(format));
        } else {
            strJoinWithSeparator = iInferPrimaryTrackType == 1 ? joinWithSeparator(buildLanguageOrLabelString(format), buildAudioChannelString(format), buildBitrateString(format)) : buildLanguageOrLabelString(format);
        }
        if (!strJoinWithSeparator.isEmpty()) {
            return strJoinWithSeparator;
        }
        java.lang.String str = format.language;
        return (str == null || str.trim().isEmpty()) ? this.resources.getString(androidx.media3.ui.R.string.exo_track_unknown) : this.resources.getString(androidx.media3.ui.R.string.exo_track_unknown_name, str);
    }
}
