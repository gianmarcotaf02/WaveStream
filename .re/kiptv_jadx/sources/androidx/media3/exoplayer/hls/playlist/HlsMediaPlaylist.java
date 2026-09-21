package androidx.media3.exoplayer.hls.playlist;

/* JADX INFO: loaded from: classes.dex */
public final class HlsMediaPlaylist extends androidx.media3.exoplayer.hls.playlist.HlsPlaylist {
    public static final int PLAYLIST_TYPE_EVENT = 2;
    public static final int PLAYLIST_TYPE_UNKNOWN = 0;
    public static final int PLAYLIST_TYPE_VOD = 1;
    public final int discontinuitySequence;
    public final long durationUs;
    public final boolean hasDiscontinuitySequence;
    public final boolean hasEndTag;
    public final boolean hasPositiveStartOffset;
    public final boolean hasProgramDateTime;
    public final p076i4.AbstractC2186b0 interstitials;
    public final androidx.media3.exoplayer.hls.playlist.HlsMediaPlaylist.Segment lastSeenInitSegment;
    public final long mediaSequence;
    public final long partTargetDurationUs;
    public final int playlistType;
    public final boolean preciseStart;
    public final androidx.media3.common.DrmInitData protectionSchemes;
    public final java.util.Map<android.net.Uri, androidx.media3.exoplayer.hls.playlist.HlsMediaPlaylist.RenditionReport> renditionReports;
    public final java.util.List<androidx.media3.exoplayer.hls.playlist.HlsMediaPlaylist.Segment> segments;
    public final androidx.media3.exoplayer.hls.playlist.HlsMediaPlaylist.ServerControl serverControl;
    public final long startOffsetUs;
    public final long startTimeUs;
    public final long targetDurationUs;
    public final java.util.List<androidx.media3.exoplayer.hls.playlist.HlsMediaPlaylist.Part> trailingParts;
    public final int version;

    public static final class Interstitial {
        public static final java.lang.String CUE_TRIGGER_ONCE = "ONCE";
        public static final java.lang.String CUE_TRIGGER_POST = "POST";
        public static final java.lang.String CUE_TRIGGER_PRE = "PRE";
        public static final java.lang.String NAVIGATION_RESTRICTION_JUMP = "JUMP";
        public static final java.lang.String NAVIGATION_RESTRICTION_SKIP = "SKIP";
        public static final java.lang.String SNAP_TYPE_IN = "IN";
        public static final java.lang.String SNAP_TYPE_OUT = "OUT";
        public static final java.lang.String TIMELINE_OCCUPIES_POINT = "POINT";
        public static final java.lang.String TIMELINE_OCCUPIES_RANGE = "RANGE";
        public static final java.lang.String TIMELINE_STYLE_HIGHLIGHT = "HIGHLIGHT";
        public static final java.lang.String TIMELINE_STYLE_PRIMARY = "PRIMARY";
        public final android.net.Uri assetListUri;
        public final android.net.Uri assetUri;
        public final p076i4.AbstractC2186b0 clientDefinedAttributes;
        public final boolean contentMayVary;
        public final java.util.List<java.lang.String> cue;
        public final long durationUs;
        public final long endDateUnixUs;
        public final boolean endOnNext;
        public final java.lang.String id;
        public final long plannedDurationUs;
        public final long playoutLimitUs;
        public final p076i4.AbstractC2186b0 restrictions;
        public final long resumeOffsetUs;
        public final long skipControlDurationUs;
        public final java.lang.String skipControlLabelId;
        public final long skipControlOffsetUs;
        public final p076i4.AbstractC2186b0 snapTypes;
        public final long startDateUnixUs;
        public final java.lang.String timelineOccupies;
        public final java.lang.String timelineStyle;

        public static final class Builder {
            private android.net.Uri assetListUri;
            private android.net.Uri assetUri;
            private java.lang.Boolean contentMayVary;
            private boolean endOnNext;
            private final java.lang.String id;
            private java.lang.String skipControlLabelId;
            private java.lang.String timelineOccupies;
            private java.lang.String timelineStyle;
            private final java.util.Map<java.lang.String, androidx.media3.exoplayer.hls.playlist.HlsMediaPlaylist.ClientDefinedAttribute> clientDefinedAttributes = new java.util.HashMap();
            private long startDateUnixUs = androidx.media3.common.C.TIME_UNSET;
            private long endDateUnixUs = androidx.media3.common.C.TIME_UNSET;
            private long durationUs = androidx.media3.common.C.TIME_UNSET;
            private long plannedDurationUs = androidx.media3.common.C.TIME_UNSET;
            private java.util.List<java.lang.String> cue = new java.util.ArrayList();
            private long resumeOffsetUs = androidx.media3.common.C.TIME_UNSET;
            private long playoutLimitUs = androidx.media3.common.C.TIME_UNSET;
            private java.util.List<java.lang.String> snapTypes = new java.util.ArrayList();
            private java.util.List<java.lang.String> restrictions = new java.util.ArrayList();
            private long skipControlOffsetUs = androidx.media3.common.C.TIME_UNSET;
            private long skipControlDurationUs = androidx.media3.common.C.TIME_UNSET;

            public Builder(java.lang.String str) {
                this.id = str;
            }

            public androidx.media3.exoplayer.hls.playlist.HlsMediaPlaylist.Interstitial build() {
                android.net.Uri uri = this.assetListUri;
                if ((uri != null || this.assetUri == null) && (uri == null || this.assetUri != null)) {
                    return null;
                }
                long j = this.startDateUnixUs;
                if (j == androidx.media3.common.C.TIME_UNSET) {
                    return null;
                }
                java.lang.String str = this.id;
                android.net.Uri uri2 = this.assetUri;
                long j9 = this.endDateUnixUs;
                long j10 = this.durationUs;
                long j11 = this.plannedDurationUs;
                java.util.List<java.lang.String> list = this.cue;
                boolean z6 = this.endOnNext;
                long j12 = this.resumeOffsetUs;
                long j13 = this.playoutLimitUs;
                java.util.List<java.lang.String> list2 = this.snapTypes;
                java.util.List<java.lang.String> list3 = this.restrictions;
                java.util.ArrayList arrayList = new java.util.ArrayList(this.clientDefinedAttributes.values());
                java.lang.Boolean bool = this.contentMayVary;
                boolean z9 = bool == null || bool.booleanValue();
                java.lang.String str2 = this.timelineOccupies;
                if (str2 == null) {
                    str2 = androidx.media3.exoplayer.hls.playlist.HlsMediaPlaylist.Interstitial.TIMELINE_OCCUPIES_POINT;
                }
                java.lang.String str3 = str2;
                java.lang.String str4 = this.timelineStyle;
                if (str4 == null) {
                    str4 = androidx.media3.exoplayer.hls.playlist.HlsMediaPlaylist.Interstitial.TIMELINE_STYLE_HIGHLIGHT;
                }
                return new androidx.media3.exoplayer.hls.playlist.HlsMediaPlaylist.Interstitial(str, uri2, uri, j, j9, j10, j11, list, z6, j12, j13, list2, list3, arrayList, z9, str3, str4, this.skipControlOffsetUs, this.skipControlDurationUs, this.skipControlLabelId);
            }

            public androidx.media3.exoplayer.hls.playlist.HlsMediaPlaylist.Interstitial.Builder setAssetListUri(android.net.Uri uri) {
                if (uri == null) {
                    return this;
                }
                android.net.Uri uri2 = this.assetListUri;
                if (uri2 != null) {
                    com.google.android.gms.internal.play_billing.AbstractC1864o0.Q(uri2.equals(uri), "Can't change assetListUri from %s to %s", this.assetListUri, uri);
                }
                this.assetListUri = uri;
                return this;
            }

            public androidx.media3.exoplayer.hls.playlist.HlsMediaPlaylist.Interstitial.Builder setAssetUri(android.net.Uri uri) {
                if (uri == null) {
                    return this;
                }
                android.net.Uri uri2 = this.assetUri;
                if (uri2 != null) {
                    com.google.android.gms.internal.play_billing.AbstractC1864o0.Q(uri2.equals(uri), "Can't change assetUri from %s to %s", this.assetUri, uri);
                }
                this.assetUri = uri;
                return this;
            }

            public androidx.media3.exoplayer.hls.playlist.HlsMediaPlaylist.Interstitial.Builder setClientDefinedAttributes(java.util.List<androidx.media3.exoplayer.hls.playlist.HlsMediaPlaylist.ClientDefinedAttribute> list) {
                if (!list.isEmpty()) {
                    for (int i3 = 0; i3 < list.size(); i3++) {
                        androidx.media3.exoplayer.hls.playlist.HlsMediaPlaylist.ClientDefinedAttribute clientDefinedAttribute = list.get(i3);
                        java.lang.String str = clientDefinedAttribute.name;
                        androidx.media3.exoplayer.hls.playlist.HlsMediaPlaylist.ClientDefinedAttribute clientDefinedAttribute2 = this.clientDefinedAttributes.get(str);
                        if (clientDefinedAttribute2 != null) {
                            boolean zEquals = clientDefinedAttribute2.equals(clientDefinedAttribute);
                            java.lang.Object[] objArr = {str, clientDefinedAttribute2.textValue, java.lang.Double.valueOf(clientDefinedAttribute2.doubleValue), clientDefinedAttribute.textValue, java.lang.Double.valueOf(clientDefinedAttribute.doubleValue)};
                            if (!zEquals) {
                                throw new java.lang.IllegalArgumentException(com.google.crypto.tink.shaded.protobuf.q0.D("Can't change %s from %s %s to %s %s", objArr));
                            }
                        }
                        this.clientDefinedAttributes.put(str, clientDefinedAttribute);
                    }
                }
                return this;
            }

            public androidx.media3.exoplayer.hls.playlist.HlsMediaPlaylist.Interstitial.Builder setContentMayVary(java.lang.Boolean bool) {
                if (bool == null) {
                    return this;
                }
                java.lang.Boolean bool2 = this.contentMayVary;
                if (bool2 != null) {
                    com.google.android.gms.internal.play_billing.AbstractC1864o0.Q(bool2.equals(bool), "Can't change contentMayVary from %s to %s", this.contentMayVary, bool);
                }
                this.contentMayVary = bool;
                return this;
            }

            public androidx.media3.exoplayer.hls.playlist.HlsMediaPlaylist.Interstitial.Builder setCue(java.util.List<java.lang.String> list) {
                if (list.isEmpty()) {
                    return this;
                }
                if (!this.cue.isEmpty()) {
                    boolean zEquals = this.cue.equals(list);
                    java.lang.StringBuilder sb = new java.lang.StringBuilder("Can't change cue from ");
                    java.util.List<java.lang.String> list2 = this.cue;
                    java.lang.StringBuilder sb2 = new java.lang.StringBuilder();
                    java.util.Iterator<T> it = list2.iterator();
                    if (it.hasNext()) {
                        while (true) {
                            sb2.append((java.lang.CharSequence) it.next());
                            if (!it.hasNext()) {
                                break;
                            }
                            sb2.append((java.lang.CharSequence) ", ");
                        }
                    }
                    sb.append(sb2.toString());
                    sb.append(" to ");
                    java.lang.StringBuilder sb3 = new java.lang.StringBuilder();
                    java.util.Iterator<T> it2 = list.iterator();
                    if (it2.hasNext()) {
                        while (true) {
                            sb3.append((java.lang.CharSequence) it2.next());
                            if (!it2.hasNext()) {
                                break;
                            }
                            sb3.append((java.lang.CharSequence) ", ");
                        }
                    }
                    sb.append(sb3.toString());
                    com.google.android.gms.internal.play_billing.AbstractC1864o0.M(zEquals, sb.toString());
                }
                this.cue = list;
                return this;
            }

            public androidx.media3.exoplayer.hls.playlist.HlsMediaPlaylist.Interstitial.Builder setDurationUs(long j) {
                long j9;
                if (j == androidx.media3.common.C.TIME_UNSET) {
                    return this;
                }
                long j10 = this.durationUs;
                if (j10 != androidx.media3.common.C.TIME_UNSET) {
                    j9 = j;
                    com.google.android.gms.internal.play_billing.AbstractC1864o0.O(j10 == j, "Can't change durationUs from %s to %s", j10, j9);
                } else {
                    j9 = j;
                }
                this.durationUs = j9;
                return this;
            }

            public androidx.media3.exoplayer.hls.playlist.HlsMediaPlaylist.Interstitial.Builder setEndDateUnixUs(long j) {
                long j9;
                if (j == androidx.media3.common.C.TIME_UNSET) {
                    return this;
                }
                long j10 = this.endDateUnixUs;
                if (j10 != androidx.media3.common.C.TIME_UNSET) {
                    j9 = j;
                    com.google.android.gms.internal.play_billing.AbstractC1864o0.O(j10 == j, "Can't change endDateUnixUs from %s to %s", j10, j9);
                } else {
                    j9 = j;
                }
                this.endDateUnixUs = j9;
                return this;
            }

            public androidx.media3.exoplayer.hls.playlist.HlsMediaPlaylist.Interstitial.Builder setEndOnNext(boolean z6) {
                if (!z6) {
                    return this;
                }
                this.endOnNext = true;
                return this;
            }

            public androidx.media3.exoplayer.hls.playlist.HlsMediaPlaylist.Interstitial.Builder setPlannedDurationUs(long j) {
                long j9;
                if (j == androidx.media3.common.C.TIME_UNSET) {
                    return this;
                }
                long j10 = this.plannedDurationUs;
                if (j10 != androidx.media3.common.C.TIME_UNSET) {
                    j9 = j;
                    com.google.android.gms.internal.play_billing.AbstractC1864o0.O(j10 == j, "Can't change plannedDurationUs from %s to %s", j10, j9);
                } else {
                    j9 = j;
                }
                this.plannedDurationUs = j9;
                return this;
            }

            public androidx.media3.exoplayer.hls.playlist.HlsMediaPlaylist.Interstitial.Builder setPlayoutLimitUs(long j) {
                long j9;
                if (j == androidx.media3.common.C.TIME_UNSET) {
                    return this;
                }
                long j10 = this.playoutLimitUs;
                if (j10 != androidx.media3.common.C.TIME_UNSET) {
                    j9 = j;
                    com.google.android.gms.internal.play_billing.AbstractC1864o0.O(j10 == j, "Can't change playoutLimitUs from %s to %s", j10, j9);
                } else {
                    j9 = j;
                }
                this.playoutLimitUs = j9;
                return this;
            }

            public androidx.media3.exoplayer.hls.playlist.HlsMediaPlaylist.Interstitial.Builder setRestrictions(java.util.List<java.lang.String> list) {
                if (list.isEmpty()) {
                    return this;
                }
                if (!this.restrictions.isEmpty()) {
                    boolean zEquals = this.restrictions.equals(list);
                    java.lang.StringBuilder sb = new java.lang.StringBuilder("Can't change restrictions from ");
                    java.util.List<java.lang.String> list2 = this.restrictions;
                    java.lang.StringBuilder sb2 = new java.lang.StringBuilder();
                    java.util.Iterator<T> it = list2.iterator();
                    if (it.hasNext()) {
                        while (true) {
                            sb2.append((java.lang.CharSequence) it.next());
                            if (!it.hasNext()) {
                                break;
                            }
                            sb2.append((java.lang.CharSequence) ", ");
                        }
                    }
                    sb.append(sb2.toString());
                    sb.append(" to ");
                    java.lang.StringBuilder sb3 = new java.lang.StringBuilder();
                    java.util.Iterator<T> it2 = list.iterator();
                    if (it2.hasNext()) {
                        while (true) {
                            sb3.append((java.lang.CharSequence) it2.next());
                            if (!it2.hasNext()) {
                                break;
                            }
                            sb3.append((java.lang.CharSequence) ", ");
                        }
                    }
                    sb.append(sb3.toString());
                    com.google.android.gms.internal.play_billing.AbstractC1864o0.M(zEquals, sb.toString());
                }
                this.restrictions = list;
                return this;
            }

            public androidx.media3.exoplayer.hls.playlist.HlsMediaPlaylist.Interstitial.Builder setResumeOffsetUs(long j) {
                long j9;
                if (j == androidx.media3.common.C.TIME_UNSET) {
                    return this;
                }
                long j10 = this.resumeOffsetUs;
                if (j10 != androidx.media3.common.C.TIME_UNSET) {
                    j9 = j;
                    com.google.android.gms.internal.play_billing.AbstractC1864o0.O(j10 == j, "Can't change resumeOffsetUs from %s to %s", j10, j9);
                } else {
                    j9 = j;
                }
                this.resumeOffsetUs = j9;
                return this;
            }

            public androidx.media3.exoplayer.hls.playlist.HlsMediaPlaylist.Interstitial.Builder setSkipControlDurationUs(long j) {
                long j9;
                if (j == androidx.media3.common.C.TIME_UNSET) {
                    return this;
                }
                long j10 = this.skipControlDurationUs;
                if (j10 != androidx.media3.common.C.TIME_UNSET) {
                    j9 = j;
                    com.google.android.gms.internal.play_billing.AbstractC1864o0.O(j10 == j, "Can't change skipControlDurationUs from %s to %s", j10, j9);
                } else {
                    j9 = j;
                }
                this.skipControlDurationUs = j9;
                return this;
            }

            public androidx.media3.exoplayer.hls.playlist.HlsMediaPlaylist.Interstitial.Builder setSkipControlLabelId(java.lang.String str) {
                if (str == null) {
                    return this;
                }
                java.lang.String str2 = this.skipControlLabelId;
                if (str2 != null) {
                    com.google.android.gms.internal.play_billing.AbstractC1864o0.Q(str2.equals(str), "Can't change skipControlLabelId from %s to %s", this.skipControlLabelId, str);
                }
                this.skipControlLabelId = str;
                return this;
            }

            public androidx.media3.exoplayer.hls.playlist.HlsMediaPlaylist.Interstitial.Builder setSkipControlOffsetUs(long j) {
                long j9;
                if (j == androidx.media3.common.C.TIME_UNSET) {
                    return this;
                }
                long j10 = this.skipControlOffsetUs;
                if (j10 != androidx.media3.common.C.TIME_UNSET) {
                    j9 = j;
                    com.google.android.gms.internal.play_billing.AbstractC1864o0.O(j10 == j, "Can't change skipControlOffsetUs from %s to %s", j10, j9);
                } else {
                    j9 = j;
                }
                this.skipControlOffsetUs = j9;
                return this;
            }

            public androidx.media3.exoplayer.hls.playlist.HlsMediaPlaylist.Interstitial.Builder setSnapTypes(java.util.List<java.lang.String> list) {
                if (list.isEmpty()) {
                    return this;
                }
                if (!this.snapTypes.isEmpty()) {
                    boolean zEquals = this.snapTypes.equals(list);
                    java.lang.StringBuilder sb = new java.lang.StringBuilder("Can't change snapTypes from ");
                    java.util.List<java.lang.String> list2 = this.snapTypes;
                    java.lang.StringBuilder sb2 = new java.lang.StringBuilder();
                    java.util.Iterator<T> it = list2.iterator();
                    if (it.hasNext()) {
                        while (true) {
                            sb2.append((java.lang.CharSequence) it.next());
                            if (!it.hasNext()) {
                                break;
                            }
                            sb2.append((java.lang.CharSequence) ", ");
                        }
                    }
                    sb.append(sb2.toString());
                    sb.append(" to ");
                    java.lang.StringBuilder sb3 = new java.lang.StringBuilder();
                    java.util.Iterator<T> it2 = list.iterator();
                    if (it2.hasNext()) {
                        while (true) {
                            sb3.append((java.lang.CharSequence) it2.next());
                            if (!it2.hasNext()) {
                                break;
                            }
                            sb3.append((java.lang.CharSequence) ", ");
                        }
                    }
                    sb.append(sb3.toString());
                    com.google.android.gms.internal.play_billing.AbstractC1864o0.M(zEquals, sb.toString());
                }
                this.snapTypes = list;
                return this;
            }

            public androidx.media3.exoplayer.hls.playlist.HlsMediaPlaylist.Interstitial.Builder setStartDateUnixUs(long j) {
                long j9;
                if (j == androidx.media3.common.C.TIME_UNSET) {
                    return this;
                }
                long j10 = this.startDateUnixUs;
                if (j10 != androidx.media3.common.C.TIME_UNSET) {
                    j9 = j;
                    com.google.android.gms.internal.play_billing.AbstractC1864o0.O(j10 == j, "Can't change startDateUnixUs from %s to %s", j10, j9);
                } else {
                    j9 = j;
                }
                this.startDateUnixUs = j9;
                return this;
            }

            public androidx.media3.exoplayer.hls.playlist.HlsMediaPlaylist.Interstitial.Builder setTimelineOccupies(java.lang.String str) {
                if (str == null) {
                    return this;
                }
                java.lang.String str2 = this.timelineOccupies;
                if (str2 != null) {
                    com.google.android.gms.internal.play_billing.AbstractC1864o0.Q(str2.equals(str), "Can't change timelineOccupies from %s to %s", this.timelineOccupies, str);
                }
                this.timelineOccupies = str;
                return this;
            }

            public androidx.media3.exoplayer.hls.playlist.HlsMediaPlaylist.Interstitial.Builder setTimelineStyle(java.lang.String str) {
                if (str == null) {
                    return this;
                }
                java.lang.String str2 = this.timelineStyle;
                if (str2 != null) {
                    com.google.android.gms.internal.play_billing.AbstractC1864o0.Q(str2.equals(str), "Can't change timelineStyle from %s to %s", this.timelineStyle, str);
                }
                this.timelineStyle = str;
                return this;
            }
        }

        @java.lang.annotation.Target({java.lang.annotation.ElementType.TYPE_USE})
        @java.lang.annotation.Documented
        @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
        public @interface CueTriggerType {
        }

        @java.lang.annotation.Target({java.lang.annotation.ElementType.TYPE_USE})
        @java.lang.annotation.Documented
        @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
        public @interface NavigationRestriction {
        }

        @java.lang.annotation.Target({java.lang.annotation.ElementType.TYPE_USE})
        @java.lang.annotation.Documented
        @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
        public @interface SnapType {
        }

        @java.lang.annotation.Target({java.lang.annotation.ElementType.TYPE_USE})
        @java.lang.annotation.Documented
        @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
        public @interface TimelineOccupiesType {
        }

        @java.lang.annotation.Target({java.lang.annotation.ElementType.TYPE_USE})
        @java.lang.annotation.Documented
        @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
        public @interface TimelineStyleType {
        }

        public Interstitial(java.lang.String str, android.net.Uri uri, android.net.Uri uri2, long j, long j9, long j10, long j11, java.util.List<java.lang.String> list, boolean z6, long j12, long j13, java.util.List<java.lang.String> list2, java.util.List<java.lang.String> list3, java.util.List<androidx.media3.exoplayer.hls.playlist.HlsMediaPlaylist.ClientDefinedAttribute> list4, boolean z9, java.lang.String str2, java.lang.String str3, long j14, long j15, java.lang.String str4) {
            com.google.android.gms.internal.play_billing.AbstractC1864o0.L((uri == null || uri2 == null) && !(uri == null && uri2 == null));
            this.id = str;
            this.assetUri = uri;
            this.assetListUri = uri2;
            this.startDateUnixUs = j;
            this.endDateUnixUs = j9;
            this.durationUs = j10;
            this.plannedDurationUs = j11;
            this.cue = list;
            this.endOnNext = z6;
            this.resumeOffsetUs = j12;
            this.playoutLimitUs = j13;
            this.snapTypes = p076i4.AbstractC2186b0.u(list2);
            this.restrictions = p076i4.AbstractC2186b0.u(list3);
            this.clientDefinedAttributes = p076i4.AbstractC2186b0.A(new A1.b(6), list4);
            this.contentMayVary = z9;
            this.timelineOccupies = str2;
            this.timelineStyle = str3;
            this.skipControlOffsetUs = j14;
            this.skipControlDurationUs = j15;
            this.skipControlLabelId = str4;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static /* synthetic */ int lambda$new$0(androidx.media3.exoplayer.hls.playlist.HlsMediaPlaylist.ClientDefinedAttribute clientDefinedAttribute, androidx.media3.exoplayer.hls.playlist.HlsMediaPlaylist.ClientDefinedAttribute clientDefinedAttribute2) {
            return clientDefinedAttribute.name.compareTo(clientDefinedAttribute2.name);
        }

        public boolean equals(java.lang.Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof androidx.media3.exoplayer.hls.playlist.HlsMediaPlaylist.Interstitial)) {
                return false;
            }
            androidx.media3.exoplayer.hls.playlist.HlsMediaPlaylist.Interstitial interstitial = (androidx.media3.exoplayer.hls.playlist.HlsMediaPlaylist.Interstitial) obj;
            return this.startDateUnixUs == interstitial.startDateUnixUs && this.endDateUnixUs == interstitial.endDateUnixUs && this.durationUs == interstitial.durationUs && this.plannedDurationUs == interstitial.plannedDurationUs && this.endOnNext == interstitial.endOnNext && this.resumeOffsetUs == interstitial.resumeOffsetUs && this.playoutLimitUs == interstitial.playoutLimitUs && this.contentMayVary == interstitial.contentMayVary && this.skipControlOffsetUs == interstitial.skipControlOffsetUs && this.skipControlDurationUs == interstitial.skipControlDurationUs && java.util.Objects.equals(this.id, interstitial.id) && java.util.Objects.equals(this.assetUri, interstitial.assetUri) && java.util.Objects.equals(this.assetListUri, interstitial.assetListUri) && java.util.Objects.equals(this.cue, interstitial.cue) && java.util.Objects.equals(this.snapTypes, interstitial.snapTypes) && java.util.Objects.equals(this.restrictions, interstitial.restrictions) && java.util.Objects.equals(this.clientDefinedAttributes, interstitial.clientDefinedAttributes) && java.util.Objects.equals(this.timelineOccupies, interstitial.timelineOccupies) && java.util.Objects.equals(this.timelineStyle, interstitial.timelineStyle) && java.util.Objects.equals(this.skipControlLabelId, interstitial.skipControlLabelId);
        }

        public int hashCode() {
            return java.util.Objects.hash(this.id, this.assetUri, this.assetListUri, java.lang.Long.valueOf(this.startDateUnixUs), java.lang.Long.valueOf(this.endDateUnixUs), java.lang.Long.valueOf(this.durationUs), java.lang.Long.valueOf(this.plannedDurationUs), this.cue, java.lang.Boolean.valueOf(this.endOnNext), java.lang.Long.valueOf(this.resumeOffsetUs), java.lang.Long.valueOf(this.playoutLimitUs), this.snapTypes, this.restrictions, this.clientDefinedAttributes, java.lang.Boolean.valueOf(this.contentMayVary), this.timelineOccupies, this.timelineStyle, java.lang.Long.valueOf(this.skipControlOffsetUs), java.lang.Long.valueOf(this.skipControlDurationUs), this.skipControlLabelId);
        }
    }

    public static final class Part extends androidx.media3.exoplayer.hls.playlist.HlsMediaPlaylist.SegmentBase {
        public final boolean isIndependent;
        public final boolean isPreload;

        public Part(java.lang.String str, androidx.media3.exoplayer.hls.playlist.HlsMediaPlaylist.Segment segment, long j, int i3, long j9, androidx.media3.common.DrmInitData drmInitData, java.lang.String str2, java.lang.String str3, long j10, long j11, boolean z6, boolean z9, boolean z10) {
            super(str, segment, j, i3, j9, drmInitData, str2, str3, j10, j11, z6);
            this.isIndependent = z9;
            this.isPreload = z10;
        }

        public androidx.media3.exoplayer.hls.playlist.HlsMediaPlaylist.Part copyWith(long j, int i3) {
            return new androidx.media3.exoplayer.hls.playlist.HlsMediaPlaylist.Part(this.url, this.initializationSegment, this.durationUs, i3, j, this.drmInitData, this.fullSegmentEncryptionKeyUri, this.encryptionIV, this.byteRangeOffset, this.byteRangeLength, this.hasGapTag, this.isIndependent, this.isPreload);
        }
    }

    @java.lang.annotation.Target({java.lang.annotation.ElementType.TYPE_USE})
    @java.lang.annotation.Documented
    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public @interface PlaylistType {
    }

    public static final class RenditionReport {
        public final long lastMediaSequence;
        public final int lastPartIndex;
        public final android.net.Uri playlistUri;

        public RenditionReport(android.net.Uri uri, long j, int i3) {
            this.playlistUri = uri;
            this.lastMediaSequence = j;
            this.lastPartIndex = i3;
        }
    }

    public static class SegmentBase implements java.lang.Comparable<java.lang.Long> {
        public final long byteRangeLength;
        public final long byteRangeOffset;
        public final androidx.media3.common.DrmInitData drmInitData;
        public final long durationUs;
        public final java.lang.String encryptionIV;
        public final java.lang.String fullSegmentEncryptionKeyUri;
        public final boolean hasGapTag;
        public final androidx.media3.exoplayer.hls.playlist.HlsMediaPlaylist.Segment initializationSegment;
        public final int relativeDiscontinuitySequence;
        public final long relativeStartTimeUs;
        public final java.lang.String url;

        private SegmentBase(java.lang.String str, androidx.media3.exoplayer.hls.playlist.HlsMediaPlaylist.Segment segment, long j, int i3, long j9, androidx.media3.common.DrmInitData drmInitData, java.lang.String str2, java.lang.String str3, long j10, long j11, boolean z6) {
            this.url = str;
            this.initializationSegment = segment;
            this.durationUs = j;
            this.relativeDiscontinuitySequence = i3;
            this.relativeStartTimeUs = j9;
            this.drmInitData = drmInitData;
            this.fullSegmentEncryptionKeyUri = str2;
            this.encryptionIV = str3;
            this.byteRangeOffset = j10;
            this.byteRangeLength = j11;
            this.hasGapTag = z6;
        }

        @Override // java.lang.Comparable
        public int compareTo(java.lang.Long l2) {
            if (this.relativeStartTimeUs > l2.longValue()) {
                return 1;
            }
            return this.relativeStartTimeUs < l2.longValue() ? -1 : 0;
        }
    }

    public static final class ServerControl {
        public final boolean canBlockReload;
        public final boolean canSkipDateRanges;
        public final long holdBackUs;
        public final long partHoldBackUs;
        public final long skipUntilUs;

        public ServerControl(long j, boolean z6, long j9, long j10, boolean z9) {
            this.skipUntilUs = j;
            this.canSkipDateRanges = z6;
            this.holdBackUs = j9;
            this.partHoldBackUs = j10;
            this.canBlockReload = z9;
        }
    }

    public HlsMediaPlaylist(int i3, java.lang.String str, java.util.List<java.lang.String> list, long j, boolean z6, long j9, boolean z9, int i9, long j10, int i10, long j11, long j12, boolean z10, boolean z11, boolean z12, androidx.media3.common.DrmInitData drmInitData, java.util.List<androidx.media3.exoplayer.hls.playlist.HlsMediaPlaylist.Segment> list2, java.util.List<androidx.media3.exoplayer.hls.playlist.HlsMediaPlaylist.Part> list3, androidx.media3.exoplayer.hls.playlist.HlsMediaPlaylist.ServerControl serverControl, java.util.Map<android.net.Uri, androidx.media3.exoplayer.hls.playlist.HlsMediaPlaylist.RenditionReport> map, java.util.List<androidx.media3.exoplayer.hls.playlist.HlsMediaPlaylist.Interstitial> list4, androidx.media3.exoplayer.hls.playlist.HlsMediaPlaylist.Segment segment) {
        super(str, list, z10);
        this.playlistType = i3;
        this.startTimeUs = j9;
        this.preciseStart = z6;
        this.hasDiscontinuitySequence = z9;
        this.discontinuitySequence = i9;
        this.mediaSequence = j10;
        this.version = i10;
        this.targetDurationUs = j11;
        this.partTargetDurationUs = j12;
        this.hasEndTag = z11;
        this.hasProgramDateTime = z12;
        this.protectionSchemes = drmInitData;
        this.segments = p076i4.AbstractC2186b0.u(list2);
        this.trailingParts = p076i4.AbstractC2186b0.u(list3);
        this.renditionReports = p076i4.AbstractC2194f0.a(map);
        this.interstitials = p076i4.AbstractC2186b0.u(list4);
        this.lastSeenInitSegment = segment;
        if (!list3.isEmpty()) {
            androidx.media3.exoplayer.hls.playlist.HlsMediaPlaylist.Part part = (androidx.media3.exoplayer.hls.playlist.HlsMediaPlaylist.Part) p076i4.AbstractC2230y.l(list3);
            this.durationUs = part.relativeStartTimeUs + part.durationUs;
        } else if (list2.isEmpty()) {
            this.durationUs = 0L;
        } else {
            androidx.media3.exoplayer.hls.playlist.HlsMediaPlaylist.Segment segment2 = (androidx.media3.exoplayer.hls.playlist.HlsMediaPlaylist.Segment) p076i4.AbstractC2230y.l(list2);
            this.durationUs = segment2.relativeStartTimeUs + segment2.durationUs;
        }
        this.startOffsetUs = j != androidx.media3.common.C.TIME_UNSET ? j >= 0 ? java.lang.Math.min(this.durationUs, j) : java.lang.Math.max(0L, this.durationUs + j) : androidx.media3.common.C.TIME_UNSET;
        this.hasPositiveStartOffset = j >= 0;
        this.serverControl = serverControl;
    }

    @Override // androidx.media3.exoplayer.offline.FilterableManifest
    public androidx.media3.exoplayer.hls.playlist.HlsPlaylist copy(java.util.List<androidx.media3.common.StreamKey> list) {
        return this;
    }

    public androidx.media3.exoplayer.hls.playlist.HlsMediaPlaylist copyWith(long j, int i3) {
        return new androidx.media3.exoplayer.hls.playlist.HlsMediaPlaylist(this.playlistType, this.baseUri, this.tags, this.startOffsetUs, this.preciseStart, j, true, i3, this.mediaSequence, this.version, this.targetDurationUs, this.partTargetDurationUs, this.hasIndependentSegments, this.hasEndTag, this.hasProgramDateTime, this.protectionSchemes, this.segments, this.trailingParts, this.serverControl, this.renditionReports, this.interstitials, this.lastSeenInitSegment);
    }

    public androidx.media3.exoplayer.hls.playlist.HlsMediaPlaylist copyWithEndTag() {
        return this.hasEndTag ? this : new androidx.media3.exoplayer.hls.playlist.HlsMediaPlaylist(this.playlistType, this.baseUri, this.tags, this.startOffsetUs, this.preciseStart, this.startTimeUs, this.hasDiscontinuitySequence, this.discontinuitySequence, this.mediaSequence, this.version, this.targetDurationUs, this.partTargetDurationUs, this.hasIndependentSegments, true, this.hasProgramDateTime, this.protectionSchemes, this.segments, this.trailingParts, this.serverControl, this.renditionReports, this.interstitials, this.lastSeenInitSegment);
    }

    public long getEndTimeUs() {
        return this.startTimeUs + this.durationUs;
    }

    public boolean isNewerThan(androidx.media3.exoplayer.hls.playlist.HlsMediaPlaylist hlsMediaPlaylist) {
        if (hlsMediaPlaylist != null) {
            long j = this.mediaSequence;
            long j9 = hlsMediaPlaylist.mediaSequence;
            if (j <= j9) {
                if (j < j9) {
                    return false;
                }
                int size = this.segments.size() - hlsMediaPlaylist.segments.size();
                if (size != 0) {
                    return size > 0;
                }
                int size2 = this.trailingParts.size();
                int size3 = hlsMediaPlaylist.trailingParts.size();
                if (size2 <= size3 && (size2 != size3 || !this.hasEndTag || hlsMediaPlaylist.hasEndTag)) {
                    return false;
                }
            }
        }
        return true;
    }

    @Override // androidx.media3.exoplayer.offline.FilterableManifest
    /* JADX INFO: renamed from: copy, reason: avoid collision after fix types in other method */
    public /* bridge */ /* synthetic */ androidx.media3.exoplayer.hls.playlist.HlsPlaylist copy2(java.util.List list) {
        return copy((java.util.List<androidx.media3.common.StreamKey>) list);
    }

    public static final class Segment extends androidx.media3.exoplayer.hls.playlist.HlsMediaPlaylist.SegmentBase {
        public final java.util.List<androidx.media3.exoplayer.hls.playlist.HlsMediaPlaylist.Part> parts;
        public final java.lang.String title;

        /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
        public Segment(java.lang.String str, long j, long j9, java.lang.String str2, java.lang.String str3) {
            this(str, null, "", 0L, -1, androidx.media3.common.C.TIME_UNSET, null, str2, str3, j, j9, false, p076i4.S0.f22832l);
            p076i4.Z z6 = p076i4.AbstractC2186b0.f22868i;
        }

        public androidx.media3.exoplayer.hls.playlist.HlsMediaPlaylist.Segment copyWith(long j, int i3) {
            java.util.ArrayList arrayList = new java.util.ArrayList();
            long j9 = j;
            for (int i9 = 0; i9 < this.parts.size(); i9++) {
                androidx.media3.exoplayer.hls.playlist.HlsMediaPlaylist.Part part = this.parts.get(i9);
                arrayList.add(part.copyWith(j9, i3));
                j9 += part.durationUs;
            }
            return new androidx.media3.exoplayer.hls.playlist.HlsMediaPlaylist.Segment(this.url, this.initializationSegment, this.title, this.durationUs, i3, j, this.drmInitData, this.fullSegmentEncryptionKeyUri, this.encryptionIV, this.byteRangeOffset, this.byteRangeLength, this.hasGapTag, arrayList);
        }

        public Segment(java.lang.String str, androidx.media3.exoplayer.hls.playlist.HlsMediaPlaylist.Segment segment, java.lang.String str2, long j, int i3, long j9, androidx.media3.common.DrmInitData drmInitData, java.lang.String str3, java.lang.String str4, long j10, long j11, boolean z6, java.util.List<androidx.media3.exoplayer.hls.playlist.HlsMediaPlaylist.Part> list) {
            super(str, segment, j, i3, j9, drmInitData, str3, str4, j10, j11, z6);
            this.title = str2;
            this.parts = p076i4.AbstractC2186b0.u(list);
        }
    }

    public static class ClientDefinedAttribute {
        public static final int TYPE_DOUBLE = 2;
        public static final int TYPE_HEX_TEXT = 1;
        public static final int TYPE_TEXT = 0;
        private final double doubleValue;
        public final java.lang.String name;
        private final java.lang.String textValue;
        public final int type;

        @java.lang.annotation.Target({java.lang.annotation.ElementType.TYPE_USE})
        @java.lang.annotation.Documented
        @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
        public @interface Type {
        }

        public ClientDefinedAttribute(java.lang.String str, double d4) {
            this.name = str;
            this.type = 2;
            this.doubleValue = d4;
            this.textValue = null;
        }

        public boolean equals(java.lang.Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof androidx.media3.exoplayer.hls.playlist.HlsMediaPlaylist.ClientDefinedAttribute)) {
                return false;
            }
            androidx.media3.exoplayer.hls.playlist.HlsMediaPlaylist.ClientDefinedAttribute clientDefinedAttribute = (androidx.media3.exoplayer.hls.playlist.HlsMediaPlaylist.ClientDefinedAttribute) obj;
            return this.type == clientDefinedAttribute.type && java.lang.Double.compare(this.doubleValue, clientDefinedAttribute.doubleValue) == 0 && java.util.Objects.equals(this.name, clientDefinedAttribute.name) && java.util.Objects.equals(this.textValue, clientDefinedAttribute.textValue);
        }

        public double getDoubleValue() {
            com.google.android.gms.internal.play_billing.AbstractC1864o0.Y(this.type == 2);
            return this.doubleValue;
        }

        public java.lang.String getTextValue() {
            com.google.android.gms.internal.play_billing.AbstractC1864o0.Y(this.type != 2);
            java.lang.String str = this.textValue;
            str.getClass();
            return str;
        }

        public int hashCode() {
            return java.util.Objects.hash(this.name, java.lang.Integer.valueOf(this.type), java.lang.Double.valueOf(this.doubleValue), this.textValue);
        }

        public ClientDefinedAttribute(java.lang.String str, java.lang.String str2, int i3) {
            boolean z6 = true;
            if (i3 == 1 && !str2.startsWith("0x") && !str2.startsWith("0X")) {
                z6 = false;
            }
            com.google.android.gms.internal.play_billing.AbstractC1864o0.Y(z6);
            this.name = str;
            this.type = i3;
            this.textValue = str2;
            this.doubleValue = 0.0d;
        }
    }
}
