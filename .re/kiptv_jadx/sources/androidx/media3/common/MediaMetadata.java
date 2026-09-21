package androidx.media3.common;

/* JADX INFO: loaded from: classes.dex */
public final class MediaMetadata {

    @java.lang.Deprecated
    public static final int FOLDER_TYPE_ALBUMS = 2;

    @java.lang.Deprecated
    public static final int FOLDER_TYPE_ARTISTS = 3;

    @java.lang.Deprecated
    public static final int FOLDER_TYPE_GENRES = 4;

    @java.lang.Deprecated
    public static final int FOLDER_TYPE_MIXED = 0;

    @java.lang.Deprecated
    public static final int FOLDER_TYPE_NONE = -1;

    @java.lang.Deprecated
    public static final int FOLDER_TYPE_PLAYLISTS = 5;

    @java.lang.Deprecated
    public static final int FOLDER_TYPE_TITLES = 1;

    @java.lang.Deprecated
    public static final int FOLDER_TYPE_YEARS = 6;
    private static final int LEGACY_ARTWORK_DATA_ARRAY_SIZE_LIMIT = 500000;
    public static final int MEDIA_TYPE_ALBUM = 10;
    public static final int MEDIA_TYPE_ARTIST = 11;
    public static final int MEDIA_TYPE_AUDIO_BOOK = 15;
    public static final int MEDIA_TYPE_AUDIO_BOOK_CHAPTER = 2;
    public static final int MEDIA_TYPE_FOLDER_ALBUMS = 21;
    public static final int MEDIA_TYPE_FOLDER_ARTISTS = 22;
    public static final int MEDIA_TYPE_FOLDER_AUDIO_BOOKS = 26;
    public static final int MEDIA_TYPE_FOLDER_GENRES = 23;
    public static final int MEDIA_TYPE_FOLDER_MIXED = 20;
    public static final int MEDIA_TYPE_FOLDER_MOVIES = 35;
    public static final int MEDIA_TYPE_FOLDER_NEWS = 32;
    public static final int MEDIA_TYPE_FOLDER_PLAYLISTS = 24;
    public static final int MEDIA_TYPE_FOLDER_PODCASTS = 27;
    public static final int MEDIA_TYPE_FOLDER_RADIO_STATIONS = 31;
    public static final int MEDIA_TYPE_FOLDER_TRAILERS = 34;
    public static final int MEDIA_TYPE_FOLDER_TV_CHANNELS = 28;
    public static final int MEDIA_TYPE_FOLDER_TV_SERIES = 29;
    public static final int MEDIA_TYPE_FOLDER_TV_SHOWS = 30;
    public static final int MEDIA_TYPE_FOLDER_VIDEOS = 33;
    public static final int MEDIA_TYPE_FOLDER_YEARS = 25;
    public static final int MEDIA_TYPE_GENRE = 12;
    public static final int MEDIA_TYPE_MIXED = 0;
    public static final int MEDIA_TYPE_MOVIE = 8;
    public static final int MEDIA_TYPE_MUSIC = 1;
    public static final int MEDIA_TYPE_NEWS = 5;
    public static final int MEDIA_TYPE_PLAYLIST = 13;
    public static final int MEDIA_TYPE_PODCAST = 16;
    public static final int MEDIA_TYPE_PODCAST_EPISODE = 3;
    public static final int MEDIA_TYPE_RADIO_STATION = 4;
    public static final int MEDIA_TYPE_TRAILER = 7;
    public static final int MEDIA_TYPE_TV_CHANNEL = 17;
    public static final int MEDIA_TYPE_TV_SEASON = 19;
    public static final int MEDIA_TYPE_TV_SERIES = 18;
    public static final int MEDIA_TYPE_TV_SHOW = 9;
    public static final int MEDIA_TYPE_VIDEO = 6;
    public static final int MEDIA_TYPE_YEAR = 14;
    public static final int PICTURE_TYPE_ARTIST_PERFORMER = 8;
    public static final int PICTURE_TYPE_A_BRIGHT_COLORED_FISH = 17;
    public static final int PICTURE_TYPE_BACK_COVER = 4;
    public static final int PICTURE_TYPE_BAND_ARTIST_LOGO = 19;
    public static final int PICTURE_TYPE_BAND_ORCHESTRA = 10;
    public static final int PICTURE_TYPE_COMPOSER = 11;
    public static final int PICTURE_TYPE_CONDUCTOR = 9;
    public static final int PICTURE_TYPE_DURING_PERFORMANCE = 15;
    public static final int PICTURE_TYPE_DURING_RECORDING = 14;
    public static final int PICTURE_TYPE_FILE_ICON = 1;
    public static final int PICTURE_TYPE_FILE_ICON_OTHER = 2;
    public static final int PICTURE_TYPE_FRONT_COVER = 3;
    public static final int PICTURE_TYPE_ILLUSTRATION = 18;
    public static final int PICTURE_TYPE_LEAD_ARTIST_PERFORMER = 7;
    public static final int PICTURE_TYPE_LEAFLET_PAGE = 5;
    public static final int PICTURE_TYPE_LYRICIST = 12;
    public static final int PICTURE_TYPE_MEDIA = 6;
    public static final int PICTURE_TYPE_MOVIE_VIDEO_SCREEN_CAPTURE = 16;
    public static final int PICTURE_TYPE_OTHER = 0;
    public static final int PICTURE_TYPE_PUBLISHER_STUDIO_LOGO = 20;
    public static final int PICTURE_TYPE_RECORDING_LOCATION = 13;
    public final java.lang.CharSequence albumArtist;
    public final java.lang.CharSequence albumTitle;
    public final java.lang.CharSequence artist;
    public final byte[] artworkData;
    public final java.lang.Integer artworkDataType;
    public final android.net.Uri artworkUri;
    public final java.lang.CharSequence author;
    private androidx.media3.common.BundleableByteArray bundleableArtworkData;
    public final java.lang.CharSequence compilation;
    public final java.lang.CharSequence composer;
    public final java.lang.CharSequence conductor;
    public final java.lang.CharSequence description;
    public final java.lang.Integer discNumber;
    public final java.lang.CharSequence displayTitle;
    public final java.lang.Long durationMs;
    public final android.os.Bundle extras;

    @java.lang.Deprecated
    public final java.lang.Integer folderType;
    public final java.lang.CharSequence genre;
    public final java.lang.Boolean isBrowsable;
    public final java.lang.Boolean isPlayable;
    public final java.lang.Integer mediaType;
    public final androidx.media3.common.Rating overallRating;
    public final java.lang.Integer recordingDay;
    public final java.lang.Integer recordingMonth;
    public final java.lang.Integer recordingYear;
    public final java.lang.Integer releaseDay;
    public final java.lang.Integer releaseMonth;
    public final java.lang.Integer releaseYear;
    public final java.lang.CharSequence station;
    public final java.lang.CharSequence subtitle;
    public final p076i4.AbstractC2186b0 supportedCommands;
    public final java.lang.CharSequence title;
    public final java.lang.Integer totalDiscCount;
    public final java.lang.Integer totalTrackCount;
    public final java.lang.Integer trackNumber;
    public final androidx.media3.common.Rating userRating;
    public final java.lang.CharSequence writer;

    @java.lang.Deprecated
    public final java.lang.Integer year;
    public static final androidx.media3.common.MediaMetadata EMPTY = new androidx.media3.common.MediaMetadata.Builder().build();
    private static final java.lang.String FIELD_TITLE = androidx.media3.common.util.Util.intToStringMaxRadix(0);
    private static final java.lang.String FIELD_ARTIST = androidx.media3.common.util.Util.intToStringMaxRadix(1);
    private static final java.lang.String FIELD_ALBUM_TITLE = androidx.media3.common.util.Util.intToStringMaxRadix(2);
    private static final java.lang.String FIELD_ALBUM_ARTIST = androidx.media3.common.util.Util.intToStringMaxRadix(3);
    private static final java.lang.String FIELD_DISPLAY_TITLE = androidx.media3.common.util.Util.intToStringMaxRadix(4);
    private static final java.lang.String FIELD_SUBTITLE = androidx.media3.common.util.Util.intToStringMaxRadix(5);
    private static final java.lang.String FIELD_DESCRIPTION = androidx.media3.common.util.Util.intToStringMaxRadix(6);
    private static final java.lang.String FIELD_USER_RATING = androidx.media3.common.util.Util.intToStringMaxRadix(8);
    private static final java.lang.String FIELD_OVERALL_RATING = androidx.media3.common.util.Util.intToStringMaxRadix(9);
    private static final java.lang.String FIELD_ARTWORK_DATA = androidx.media3.common.util.Util.intToStringMaxRadix(10);
    private static final java.lang.String FIELD_ARTWORK_URI = androidx.media3.common.util.Util.intToStringMaxRadix(11);
    private static final java.lang.String FIELD_TRACK_NUMBER = androidx.media3.common.util.Util.intToStringMaxRadix(12);
    private static final java.lang.String FIELD_TOTAL_TRACK_COUNT = androidx.media3.common.util.Util.intToStringMaxRadix(13);
    private static final java.lang.String FIELD_FOLDER_TYPE = androidx.media3.common.util.Util.intToStringMaxRadix(14);
    private static final java.lang.String FIELD_IS_PLAYABLE = androidx.media3.common.util.Util.intToStringMaxRadix(15);
    private static final java.lang.String FIELD_RECORDING_YEAR = androidx.media3.common.util.Util.intToStringMaxRadix(16);
    private static final java.lang.String FIELD_RECORDING_MONTH = androidx.media3.common.util.Util.intToStringMaxRadix(17);
    private static final java.lang.String FIELD_RECORDING_DAY = androidx.media3.common.util.Util.intToStringMaxRadix(18);
    private static final java.lang.String FIELD_RELEASE_YEAR = androidx.media3.common.util.Util.intToStringMaxRadix(19);
    private static final java.lang.String FIELD_RELEASE_MONTH = androidx.media3.common.util.Util.intToStringMaxRadix(20);
    private static final java.lang.String FIELD_RELEASE_DAY = androidx.media3.common.util.Util.intToStringMaxRadix(21);
    private static final java.lang.String FIELD_WRITER = androidx.media3.common.util.Util.intToStringMaxRadix(22);
    private static final java.lang.String FIELD_COMPOSER = androidx.media3.common.util.Util.intToStringMaxRadix(23);
    private static final java.lang.String FIELD_CONDUCTOR = androidx.media3.common.util.Util.intToStringMaxRadix(24);
    private static final java.lang.String FIELD_DISC_NUMBER = androidx.media3.common.util.Util.intToStringMaxRadix(25);
    private static final java.lang.String FIELD_TOTAL_DISC_COUNT = androidx.media3.common.util.Util.intToStringMaxRadix(26);
    private static final java.lang.String FIELD_GENRE = androidx.media3.common.util.Util.intToStringMaxRadix(27);
    private static final java.lang.String FIELD_COMPILATION = androidx.media3.common.util.Util.intToStringMaxRadix(28);
    private static final java.lang.String FIELD_ARTWORK_DATA_TYPE = androidx.media3.common.util.Util.intToStringMaxRadix(29);
    private static final java.lang.String FIELD_STATION = androidx.media3.common.util.Util.intToStringMaxRadix(30);
    private static final java.lang.String FIELD_MEDIA_TYPE = androidx.media3.common.util.Util.intToStringMaxRadix(31);
    private static final java.lang.String FIELD_IS_BROWSABLE = androidx.media3.common.util.Util.intToStringMaxRadix(32);
    private static final java.lang.String FIELD_DURATION_MS = androidx.media3.common.util.Util.intToStringMaxRadix(33);
    private static final java.lang.String FIELD_SUPPORTED_COMMANDS = androidx.media3.common.util.Util.intToStringMaxRadix(34);
    private static final java.lang.String FIELD_EXTRAS = androidx.media3.common.util.Util.intToStringMaxRadix(1000);

    public static final class Builder {
        private java.lang.CharSequence albumArtist;
        private java.lang.CharSequence albumTitle;
        private java.lang.CharSequence artist;
        private byte[] artworkData;
        private java.lang.Integer artworkDataType;
        private android.net.Uri artworkUri;
        private java.lang.CharSequence author;
        private androidx.media3.common.BundleableByteArray bundleableArtworkData;
        private java.lang.CharSequence compilation;
        private java.lang.CharSequence composer;
        private java.lang.CharSequence conductor;
        private java.lang.CharSequence description;
        private java.lang.Integer discNumber;
        private java.lang.CharSequence displayTitle;
        private java.lang.Long durationMs;
        private android.os.Bundle extras;
        private java.lang.Integer folderType;
        private java.lang.CharSequence genre;
        private java.lang.Boolean isBrowsable;
        private java.lang.Boolean isPlayable;
        private java.lang.Integer mediaType;
        private androidx.media3.common.Rating overallRating;
        private java.lang.Integer recordingDay;
        private java.lang.Integer recordingMonth;
        private java.lang.Integer recordingYear;
        private java.lang.Integer releaseDay;
        private java.lang.Integer releaseMonth;
        private java.lang.Integer releaseYear;
        private java.lang.CharSequence station;
        private java.lang.CharSequence subtitle;
        private p076i4.AbstractC2186b0 supportedCommands;
        private java.lang.CharSequence title;
        private java.lang.Integer totalDiscCount;
        private java.lang.Integer totalTrackCount;
        private java.lang.Integer trackNumber;
        private androidx.media3.common.Rating userRating;
        private java.lang.CharSequence writer;

        public androidx.media3.common.MediaMetadata build() {
            return new androidx.media3.common.MediaMetadata(this);
        }

        public androidx.media3.common.MediaMetadata.Builder maybeSetArtworkData(byte[] bArr, int i3) {
            if (this.artworkData != null && i3 != 3 && java.util.Objects.equals(this.artworkDataType, 3)) {
                return this;
            }
            this.artworkData = (byte[]) bArr.clone();
            this.bundleableArtworkData = null;
            this.artworkDataType = java.lang.Integer.valueOf(i3);
            return this;
        }

        public androidx.media3.common.MediaMetadata.Builder populate(androidx.media3.common.MediaMetadata mediaMetadata) {
            if (mediaMetadata != null) {
                java.lang.CharSequence charSequence = mediaMetadata.title;
                if (charSequence != null) {
                    setTitle(charSequence);
                }
                java.lang.CharSequence charSequence2 = mediaMetadata.artist;
                if (charSequence2 != null) {
                    setArtist(charSequence2);
                }
                java.lang.CharSequence charSequence3 = mediaMetadata.albumTitle;
                if (charSequence3 != null) {
                    setAlbumTitle(charSequence3);
                }
                java.lang.CharSequence charSequence4 = mediaMetadata.albumArtist;
                if (charSequence4 != null) {
                    setAlbumArtist(charSequence4);
                }
                java.lang.CharSequence charSequence5 = mediaMetadata.displayTitle;
                if (charSequence5 != null) {
                    setDisplayTitle(charSequence5);
                }
                java.lang.CharSequence charSequence6 = mediaMetadata.subtitle;
                if (charSequence6 != null) {
                    setSubtitle(charSequence6);
                }
                java.lang.CharSequence charSequence7 = mediaMetadata.description;
                if (charSequence7 != null) {
                    setDescription(charSequence7);
                }
                java.lang.Long l2 = mediaMetadata.durationMs;
                if (l2 != null) {
                    setDurationMs(l2);
                }
                androidx.media3.common.Rating rating = mediaMetadata.userRating;
                if (rating != null) {
                    setUserRating(rating);
                }
                androidx.media3.common.Rating rating2 = mediaMetadata.overallRating;
                if (rating2 != null) {
                    setOverallRating(rating2);
                }
                android.net.Uri uri = mediaMetadata.artworkUri;
                if (uri != null || mediaMetadata.artworkData != null) {
                    setArtworkUri(uri);
                    setArtworkData(mediaMetadata.artworkData, mediaMetadata.artworkDataType);
                    this.bundleableArtworkData = mediaMetadata.bundleableArtworkData;
                }
                java.lang.Integer num = mediaMetadata.trackNumber;
                if (num != null) {
                    setTrackNumber(num);
                }
                java.lang.Integer num2 = mediaMetadata.totalTrackCount;
                if (num2 != null) {
                    setTotalTrackCount(num2);
                }
                java.lang.Integer num3 = mediaMetadata.folderType;
                if (num3 != null) {
                    setFolderType(num3);
                }
                java.lang.Boolean bool = mediaMetadata.isBrowsable;
                if (bool != null) {
                    setIsBrowsable(bool);
                }
                java.lang.Boolean bool2 = mediaMetadata.isPlayable;
                if (bool2 != null) {
                    setIsPlayable(bool2);
                }
                java.lang.Integer num4 = mediaMetadata.year;
                if (num4 != null) {
                    setRecordingYear(num4);
                }
                java.lang.Integer num5 = mediaMetadata.recordingYear;
                if (num5 != null) {
                    setRecordingYear(num5);
                }
                java.lang.Integer num6 = mediaMetadata.recordingMonth;
                if (num6 != null) {
                    setRecordingMonth(num6);
                }
                java.lang.Integer num7 = mediaMetadata.recordingDay;
                if (num7 != null) {
                    setRecordingDay(num7);
                }
                java.lang.Integer num8 = mediaMetadata.releaseYear;
                if (num8 != null) {
                    setReleaseYear(num8);
                }
                java.lang.Integer num9 = mediaMetadata.releaseMonth;
                if (num9 != null) {
                    setReleaseMonth(num9);
                }
                java.lang.Integer num10 = mediaMetadata.releaseDay;
                if (num10 != null) {
                    setReleaseDay(num10);
                }
                java.lang.CharSequence charSequence8 = mediaMetadata.writer;
                if (charSequence8 != null) {
                    setWriter(charSequence8);
                }
                java.lang.CharSequence charSequence9 = mediaMetadata.composer;
                if (charSequence9 != null) {
                    setComposer(charSequence9);
                }
                java.lang.CharSequence charSequence10 = mediaMetadata.conductor;
                if (charSequence10 != null) {
                    setConductor(charSequence10);
                }
                java.lang.Integer num11 = mediaMetadata.discNumber;
                if (num11 != null) {
                    setDiscNumber(num11);
                }
                java.lang.Integer num12 = mediaMetadata.totalDiscCount;
                if (num12 != null) {
                    setTotalDiscCount(num12);
                }
                java.lang.CharSequence charSequence11 = mediaMetadata.genre;
                if (charSequence11 != null) {
                    setGenre(charSequence11);
                }
                java.lang.CharSequence charSequence12 = mediaMetadata.compilation;
                if (charSequence12 != null) {
                    setCompilation(charSequence12);
                }
                java.lang.CharSequence charSequence13 = mediaMetadata.station;
                if (charSequence13 != null) {
                    setStation(charSequence13);
                }
                java.lang.Integer num13 = mediaMetadata.mediaType;
                if (num13 != null) {
                    setMediaType(num13);
                }
                android.os.Bundle bundle = mediaMetadata.extras;
                if (bundle != null) {
                    setExtras(bundle);
                }
                if (!mediaMetadata.supportedCommands.isEmpty()) {
                    setSupportedCommands(mediaMetadata.supportedCommands);
                }
            }
            return this;
        }

        public androidx.media3.common.MediaMetadata.Builder populateFromMetadata(androidx.media3.common.Metadata metadata) {
            for (int i3 = 0; i3 < metadata.length(); i3++) {
                metadata.get(i3).populateMediaMetadata(this);
            }
            return this;
        }

        public androidx.media3.common.MediaMetadata.Builder setAlbumArtist(java.lang.CharSequence charSequence) {
            this.albumArtist = charSequence;
            return this;
        }

        public androidx.media3.common.MediaMetadata.Builder setAlbumTitle(java.lang.CharSequence charSequence) {
            this.albumTitle = charSequence;
            return this;
        }

        public androidx.media3.common.MediaMetadata.Builder setArtist(java.lang.CharSequence charSequence) {
            this.artist = charSequence;
            return this;
        }

        @java.lang.Deprecated
        public androidx.media3.common.MediaMetadata.Builder setArtworkData(byte[] bArr) {
            return setArtworkData(bArr, null);
        }

        public androidx.media3.common.MediaMetadata.Builder setArtworkUri(android.net.Uri uri) {
            this.artworkUri = uri;
            return this;
        }

        public androidx.media3.common.MediaMetadata.Builder setAuthor(java.lang.CharSequence charSequence) {
            this.author = charSequence;
            return this;
        }

        public androidx.media3.common.MediaMetadata.Builder setCompilation(java.lang.CharSequence charSequence) {
            this.compilation = charSequence;
            return this;
        }

        public androidx.media3.common.MediaMetadata.Builder setComposer(java.lang.CharSequence charSequence) {
            this.composer = charSequence;
            return this;
        }

        public androidx.media3.common.MediaMetadata.Builder setConductor(java.lang.CharSequence charSequence) {
            this.conductor = charSequence;
            return this;
        }

        public androidx.media3.common.MediaMetadata.Builder setDescription(java.lang.CharSequence charSequence) {
            this.description = charSequence;
            return this;
        }

        public androidx.media3.common.MediaMetadata.Builder setDiscNumber(java.lang.Integer num) {
            this.discNumber = num;
            return this;
        }

        public androidx.media3.common.MediaMetadata.Builder setDisplayTitle(java.lang.CharSequence charSequence) {
            this.displayTitle = charSequence;
            return this;
        }

        public androidx.media3.common.MediaMetadata.Builder setDurationMs(java.lang.Long l2) {
            com.google.android.gms.internal.play_billing.AbstractC1864o0.L(l2 == null || l2.longValue() >= 0);
            this.durationMs = l2;
            return this;
        }

        public androidx.media3.common.MediaMetadata.Builder setExtras(android.os.Bundle bundle) {
            this.extras = bundle;
            return this;
        }

        @java.lang.Deprecated
        public androidx.media3.common.MediaMetadata.Builder setFolderType(java.lang.Integer num) {
            this.folderType = num;
            return this;
        }

        public androidx.media3.common.MediaMetadata.Builder setGenre(java.lang.CharSequence charSequence) {
            this.genre = charSequence;
            return this;
        }

        public androidx.media3.common.MediaMetadata.Builder setIsBrowsable(java.lang.Boolean bool) {
            this.isBrowsable = bool;
            return this;
        }

        public androidx.media3.common.MediaMetadata.Builder setIsPlayable(java.lang.Boolean bool) {
            this.isPlayable = bool;
            return this;
        }

        public androidx.media3.common.MediaMetadata.Builder setMediaType(java.lang.Integer num) {
            this.mediaType = num;
            return this;
        }

        public androidx.media3.common.MediaMetadata.Builder setOverallRating(androidx.media3.common.Rating rating) {
            this.overallRating = rating;
            return this;
        }

        public androidx.media3.common.MediaMetadata.Builder setRecordingDay(java.lang.Integer num) {
            this.recordingDay = num;
            return this;
        }

        public androidx.media3.common.MediaMetadata.Builder setRecordingMonth(java.lang.Integer num) {
            this.recordingMonth = num;
            return this;
        }

        public androidx.media3.common.MediaMetadata.Builder setRecordingYear(java.lang.Integer num) {
            this.recordingYear = num;
            return this;
        }

        public androidx.media3.common.MediaMetadata.Builder setReleaseDay(java.lang.Integer num) {
            this.releaseDay = num;
            return this;
        }

        public androidx.media3.common.MediaMetadata.Builder setReleaseMonth(java.lang.Integer num) {
            this.releaseMonth = num;
            return this;
        }

        public androidx.media3.common.MediaMetadata.Builder setReleaseYear(java.lang.Integer num) {
            this.releaseYear = num;
            return this;
        }

        public androidx.media3.common.MediaMetadata.Builder setStation(java.lang.CharSequence charSequence) {
            this.station = charSequence;
            return this;
        }

        public androidx.media3.common.MediaMetadata.Builder setSubtitle(java.lang.CharSequence charSequence) {
            this.subtitle = charSequence;
            return this;
        }

        public androidx.media3.common.MediaMetadata.Builder setSupportedCommands(java.util.List<java.lang.String> list) {
            this.supportedCommands = p076i4.AbstractC2186b0.u(list);
            return this;
        }

        public androidx.media3.common.MediaMetadata.Builder setTitle(java.lang.CharSequence charSequence) {
            this.title = charSequence;
            return this;
        }

        public androidx.media3.common.MediaMetadata.Builder setTotalDiscCount(java.lang.Integer num) {
            this.totalDiscCount = num;
            return this;
        }

        public androidx.media3.common.MediaMetadata.Builder setTotalTrackCount(java.lang.Integer num) {
            this.totalTrackCount = num;
            return this;
        }

        public androidx.media3.common.MediaMetadata.Builder setTrackNumber(java.lang.Integer num) {
            this.trackNumber = num;
            return this;
        }

        public androidx.media3.common.MediaMetadata.Builder setUserRating(androidx.media3.common.Rating rating) {
            this.userRating = rating;
            return this;
        }

        public androidx.media3.common.MediaMetadata.Builder setWriter(java.lang.CharSequence charSequence) {
            this.writer = charSequence;
            return this;
        }

        @java.lang.Deprecated
        public androidx.media3.common.MediaMetadata.Builder setYear(java.lang.Integer num) {
            return setRecordingYear(num);
        }

        public Builder() {
            p076i4.Z z6 = p076i4.AbstractC2186b0.f22868i;
            this.supportedCommands = p076i4.S0.f22832l;
        }

        public androidx.media3.common.MediaMetadata.Builder setArtworkData(byte[] bArr, java.lang.Integer num) {
            this.artworkData = bArr == null ? null : (byte[]) bArr.clone();
            this.bundleableArtworkData = null;
            this.artworkDataType = num;
            return this;
        }

        public androidx.media3.common.MediaMetadata.Builder populateFromMetadata(java.util.List<androidx.media3.common.Metadata> list) {
            for (int i3 = 0; i3 < list.size(); i3++) {
                androidx.media3.common.Metadata metadata = list.get(i3);
                for (int i9 = 0; i9 < metadata.length(); i9++) {
                    metadata.get(i9).populateMediaMetadata(this);
                }
            }
            return this;
        }

        private Builder(androidx.media3.common.MediaMetadata mediaMetadata) {
            this.title = mediaMetadata.title;
            this.artist = mediaMetadata.artist;
            this.albumTitle = mediaMetadata.albumTitle;
            this.albumArtist = mediaMetadata.albumArtist;
            this.displayTitle = mediaMetadata.displayTitle;
            this.subtitle = mediaMetadata.subtitle;
            this.description = mediaMetadata.description;
            this.durationMs = mediaMetadata.durationMs;
            this.userRating = mediaMetadata.userRating;
            this.overallRating = mediaMetadata.overallRating;
            this.artworkData = mediaMetadata.artworkData;
            this.bundleableArtworkData = mediaMetadata.bundleableArtworkData;
            this.artworkDataType = mediaMetadata.artworkDataType;
            this.artworkUri = mediaMetadata.artworkUri;
            this.trackNumber = mediaMetadata.trackNumber;
            this.totalTrackCount = mediaMetadata.totalTrackCount;
            this.folderType = mediaMetadata.folderType;
            this.isBrowsable = mediaMetadata.isBrowsable;
            this.isPlayable = mediaMetadata.isPlayable;
            this.recordingYear = mediaMetadata.recordingYear;
            this.recordingMonth = mediaMetadata.recordingMonth;
            this.recordingDay = mediaMetadata.recordingDay;
            this.releaseYear = mediaMetadata.releaseYear;
            this.releaseMonth = mediaMetadata.releaseMonth;
            this.releaseDay = mediaMetadata.releaseDay;
            this.writer = mediaMetadata.writer;
            this.author = mediaMetadata.author;
            this.composer = mediaMetadata.composer;
            this.conductor = mediaMetadata.conductor;
            this.discNumber = mediaMetadata.discNumber;
            this.totalDiscCount = mediaMetadata.totalDiscCount;
            this.genre = mediaMetadata.genre;
            this.compilation = mediaMetadata.compilation;
            this.station = mediaMetadata.station;
            this.mediaType = mediaMetadata.mediaType;
            this.supportedCommands = mediaMetadata.supportedCommands;
            this.extras = mediaMetadata.extras;
        }
    }

    @java.lang.annotation.Target({java.lang.annotation.ElementType.FIELD, java.lang.annotation.ElementType.METHOD, java.lang.annotation.ElementType.PARAMETER, java.lang.annotation.ElementType.LOCAL_VARIABLE, java.lang.annotation.ElementType.TYPE_USE})
    @java.lang.Deprecated
    @java.lang.annotation.Documented
    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public @interface FolderType {
    }

    @java.lang.annotation.Target({java.lang.annotation.ElementType.TYPE_USE})
    @java.lang.annotation.Documented
    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public @interface MediaType {
    }

    @java.lang.annotation.Target({java.lang.annotation.ElementType.FIELD, java.lang.annotation.ElementType.METHOD, java.lang.annotation.ElementType.PARAMETER, java.lang.annotation.ElementType.LOCAL_VARIABLE, java.lang.annotation.ElementType.TYPE_USE})
    @java.lang.annotation.Documented
    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public @interface PictureType {
    }

    @java.lang.Deprecated
    public static androidx.media3.common.MediaMetadata fromBundle(android.os.Bundle bundle) {
        return fromBundle(bundle, 9);
    }

    private static int getFolderTypeFromMediaType(int i3) {
        switch (i3) {
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
            case 7:
            case 8:
            case 9:
            case 10:
            case 11:
            case 12:
            case 13:
            case 14:
            case 15:
            case 16:
            case 17:
            case 18:
            case 19:
            case 31:
            case 32:
            case 33:
            case 34:
            case 35:
                return 1;
            case 20:
            case 26:
            case 27:
            case 28:
            case 29:
            case 30:
            default:
                return 0;
            case 21:
                return 2;
            case 22:
                return 3;
            case 23:
                return 4;
            case 24:
                return 5;
            case 25:
                return 6;
        }
    }

    private static int getMediaTypeFromFolderType(int i3) {
        switch (i3) {
            case 1:
                return 0;
            case 2:
                return 21;
            case 3:
                return 22;
            case 4:
                return 23;
            case 5:
                return 24;
            case 6:
                return 25;
            default:
                return 20;
        }
    }

    public androidx.media3.common.MediaMetadata.Builder buildUpon() {
        return new androidx.media3.common.MediaMetadata.Builder();
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && androidx.media3.common.MediaMetadata.class == obj.getClass()) {
            androidx.media3.common.MediaMetadata mediaMetadata = (androidx.media3.common.MediaMetadata) obj;
            if (android.text.TextUtils.equals(this.title, mediaMetadata.title) && android.text.TextUtils.equals(this.artist, mediaMetadata.artist) && android.text.TextUtils.equals(this.albumTitle, mediaMetadata.albumTitle) && android.text.TextUtils.equals(this.albumArtist, mediaMetadata.albumArtist) && android.text.TextUtils.equals(this.displayTitle, mediaMetadata.displayTitle) && android.text.TextUtils.equals(this.subtitle, mediaMetadata.subtitle) && android.text.TextUtils.equals(this.description, mediaMetadata.description) && java.util.Objects.equals(this.durationMs, mediaMetadata.durationMs) && java.util.Objects.equals(this.userRating, mediaMetadata.userRating) && java.util.Objects.equals(this.overallRating, mediaMetadata.overallRating) && java.util.Arrays.equals(this.artworkData, mediaMetadata.artworkData) && java.util.Objects.equals(this.artworkDataType, mediaMetadata.artworkDataType) && java.util.Objects.equals(this.artworkUri, mediaMetadata.artworkUri) && java.util.Objects.equals(this.trackNumber, mediaMetadata.trackNumber) && java.util.Objects.equals(this.totalTrackCount, mediaMetadata.totalTrackCount) && java.util.Objects.equals(this.folderType, mediaMetadata.folderType) && java.util.Objects.equals(this.isBrowsable, mediaMetadata.isBrowsable) && java.util.Objects.equals(this.isPlayable, mediaMetadata.isPlayable) && java.util.Objects.equals(this.recordingYear, mediaMetadata.recordingYear) && java.util.Objects.equals(this.recordingMonth, mediaMetadata.recordingMonth) && java.util.Objects.equals(this.recordingDay, mediaMetadata.recordingDay) && java.util.Objects.equals(this.releaseYear, mediaMetadata.releaseYear) && java.util.Objects.equals(this.releaseMonth, mediaMetadata.releaseMonth) && java.util.Objects.equals(this.releaseDay, mediaMetadata.releaseDay) && android.text.TextUtils.equals(this.writer, mediaMetadata.writer) && android.text.TextUtils.equals(this.composer, mediaMetadata.composer) && android.text.TextUtils.equals(this.conductor, mediaMetadata.conductor) && java.util.Objects.equals(this.discNumber, mediaMetadata.discNumber) && java.util.Objects.equals(this.totalDiscCount, mediaMetadata.totalDiscCount) && android.text.TextUtils.equals(this.genre, mediaMetadata.genre) && android.text.TextUtils.equals(this.compilation, mediaMetadata.compilation) && android.text.TextUtils.equals(this.station, mediaMetadata.station) && java.util.Objects.equals(this.mediaType, mediaMetadata.mediaType) && java.util.Objects.equals(this.supportedCommands, mediaMetadata.supportedCommands)) {
                if ((this.extras == null) == (mediaMetadata.extras == null)) {
                    return true;
                }
            }
        }
        return false;
    }

    public int hashCode() {
        return java.util.Objects.hash(this.title, this.artist, this.albumTitle, this.albumArtist, this.displayTitle, this.subtitle, this.description, this.durationMs, this.userRating, this.overallRating, java.lang.Integer.valueOf(java.util.Arrays.hashCode(this.artworkData)), this.artworkDataType, this.artworkUri, this.trackNumber, this.totalTrackCount, this.folderType, this.isBrowsable, this.isPlayable, this.recordingYear, this.recordingMonth, this.recordingDay, this.releaseYear, this.releaseMonth, this.releaseDay, this.writer, this.composer, this.conductor, this.discNumber, this.totalDiscCount, this.genre, this.compilation, this.station, this.mediaType, java.lang.Boolean.valueOf(this.extras == null), this.supportedCommands);
    }

    @java.lang.Deprecated
    public android.os.Bundle toBundle() {
        return toBundle(9);
    }

    private MediaMetadata(androidx.media3.common.MediaMetadata.Builder builder) {
        java.lang.Boolean boolValueOf = builder.isBrowsable;
        java.lang.Integer numValueOf = builder.folderType;
        java.lang.Integer numValueOf2 = builder.mediaType;
        if (boolValueOf != null) {
            if (!boolValueOf.booleanValue()) {
                numValueOf = -1;
            } else if (numValueOf == null || numValueOf.intValue() == -1) {
                numValueOf = java.lang.Integer.valueOf(numValueOf2 != null ? getFolderTypeFromMediaType(numValueOf2.intValue()) : 0);
            }
        } else if (numValueOf != null) {
            boolean z6 = numValueOf.intValue() != -1;
            boolValueOf = java.lang.Boolean.valueOf(z6);
            if (z6 && numValueOf2 == null) {
                numValueOf2 = java.lang.Integer.valueOf(getMediaTypeFromFolderType(numValueOf.intValue()));
            }
        }
        this.title = builder.title;
        this.artist = builder.artist;
        this.albumTitle = builder.albumTitle;
        this.albumArtist = builder.albumArtist;
        this.displayTitle = builder.displayTitle;
        this.subtitle = builder.subtitle;
        this.description = builder.description;
        this.durationMs = builder.durationMs;
        this.userRating = builder.userRating;
        this.overallRating = builder.overallRating;
        this.artworkData = builder.artworkData;
        this.bundleableArtworkData = builder.bundleableArtworkData;
        this.artworkDataType = builder.artworkDataType;
        this.artworkUri = builder.artworkUri;
        this.trackNumber = builder.trackNumber;
        this.totalTrackCount = builder.totalTrackCount;
        this.folderType = numValueOf;
        this.isBrowsable = boolValueOf;
        this.isPlayable = builder.isPlayable;
        this.year = builder.recordingYear;
        this.recordingYear = builder.recordingYear;
        this.recordingMonth = builder.recordingMonth;
        this.recordingDay = builder.recordingDay;
        this.releaseYear = builder.releaseYear;
        this.releaseMonth = builder.releaseMonth;
        this.releaseDay = builder.releaseDay;
        this.writer = builder.writer;
        this.author = builder.author;
        this.composer = builder.composer;
        this.conductor = builder.conductor;
        this.discNumber = builder.discNumber;
        this.totalDiscCount = builder.totalDiscCount;
        this.genre = builder.genre;
        this.compilation = builder.compilation;
        this.station = builder.station;
        this.mediaType = numValueOf2;
        this.supportedCommands = builder.supportedCommands;
        this.extras = builder.extras;
    }

    public static androidx.media3.common.MediaMetadata fromBundle(android.os.Bundle bundle, int i3) {
        android.os.Bundle bundle2;
        android.os.Bundle bundle3;
        androidx.media3.common.MediaMetadata.Builder builder = new androidx.media3.common.MediaMetadata.Builder();
        builder.setTitle(bundle.getCharSequence(FIELD_TITLE)).setArtist(bundle.getCharSequence(FIELD_ARTIST)).setAlbumTitle(bundle.getCharSequence(FIELD_ALBUM_TITLE)).setAlbumArtist(bundle.getCharSequence(FIELD_ALBUM_ARTIST)).setDisplayTitle(bundle.getCharSequence(FIELD_DISPLAY_TITLE)).setSubtitle(bundle.getCharSequence(FIELD_SUBTITLE)).setDescription(bundle.getCharSequence(FIELD_DESCRIPTION)).setArtworkUri((android.net.Uri) bundle.getParcelable(FIELD_ARTWORK_URI)).setWriter(bundle.getCharSequence(FIELD_WRITER)).setComposer(bundle.getCharSequence(FIELD_COMPOSER)).setConductor(bundle.getCharSequence(FIELD_CONDUCTOR)).setGenre(bundle.getCharSequence(FIELD_GENRE)).setCompilation(bundle.getCharSequence(FIELD_COMPILATION)).setStation(bundle.getCharSequence(FIELD_STATION)).setExtras(androidx.media3.common.util.Util.convertToNullIfInvalid(bundle.getBundle(FIELD_EXTRAS)));
        java.lang.String str = FIELD_ARTWORK_DATA;
        if (bundle.containsKey(str)) {
            java.lang.String str2 = FIELD_ARTWORK_DATA_TYPE;
            java.lang.Integer numValueOf = bundle.containsKey(str2) ? java.lang.Integer.valueOf(bundle.getInt(str2)) : null;
            if (i3 >= 9) {
                android.os.Bundle bundle4 = bundle.getBundle(str);
                if (bundle4 != null) {
                    builder.setArtworkData(androidx.media3.common.BundleableByteArray.fromBundle(bundle4), numValueOf);
                }
            } else {
                builder.setArtworkData(bundle.getByteArray(str), numValueOf);
            }
        }
        java.lang.String str3 = FIELD_USER_RATING;
        if (bundle.containsKey(str3) && (bundle3 = bundle.getBundle(str3)) != null) {
            builder.setUserRating(androidx.media3.common.Rating.fromBundle(bundle3));
        }
        java.lang.String str4 = FIELD_OVERALL_RATING;
        if (bundle.containsKey(str4) && (bundle2 = bundle.getBundle(str4)) != null) {
            builder.setOverallRating(androidx.media3.common.Rating.fromBundle(bundle2));
        }
        java.lang.String str5 = FIELD_DURATION_MS;
        if (bundle.containsKey(str5)) {
            builder.setDurationMs(java.lang.Long.valueOf(bundle.getLong(str5)));
        }
        java.lang.String str6 = FIELD_TRACK_NUMBER;
        if (bundle.containsKey(str6)) {
            builder.setTrackNumber(java.lang.Integer.valueOf(bundle.getInt(str6)));
        }
        java.lang.String str7 = FIELD_TOTAL_TRACK_COUNT;
        if (bundle.containsKey(str7)) {
            builder.setTotalTrackCount(java.lang.Integer.valueOf(bundle.getInt(str7)));
        }
        java.lang.String str8 = FIELD_FOLDER_TYPE;
        if (bundle.containsKey(str8)) {
            builder.setFolderType(java.lang.Integer.valueOf(bundle.getInt(str8)));
        }
        java.lang.String str9 = FIELD_IS_BROWSABLE;
        if (bundle.containsKey(str9)) {
            builder.setIsBrowsable(java.lang.Boolean.valueOf(bundle.getBoolean(str9)));
        }
        java.lang.String str10 = FIELD_IS_PLAYABLE;
        if (bundle.containsKey(str10)) {
            builder.setIsPlayable(java.lang.Boolean.valueOf(bundle.getBoolean(str10)));
        }
        java.lang.String str11 = FIELD_RECORDING_YEAR;
        if (bundle.containsKey(str11)) {
            builder.setRecordingYear(java.lang.Integer.valueOf(bundle.getInt(str11)));
        }
        java.lang.String str12 = FIELD_RECORDING_MONTH;
        if (bundle.containsKey(str12)) {
            builder.setRecordingMonth(java.lang.Integer.valueOf(bundle.getInt(str12)));
        }
        java.lang.String str13 = FIELD_RECORDING_DAY;
        if (bundle.containsKey(str13)) {
            builder.setRecordingDay(java.lang.Integer.valueOf(bundle.getInt(str13)));
        }
        java.lang.String str14 = FIELD_RELEASE_YEAR;
        if (bundle.containsKey(str14)) {
            builder.setReleaseYear(java.lang.Integer.valueOf(bundle.getInt(str14)));
        }
        java.lang.String str15 = FIELD_RELEASE_MONTH;
        if (bundle.containsKey(str15)) {
            builder.setReleaseMonth(java.lang.Integer.valueOf(bundle.getInt(str15)));
        }
        java.lang.String str16 = FIELD_RELEASE_DAY;
        if (bundle.containsKey(str16)) {
            builder.setReleaseDay(java.lang.Integer.valueOf(bundle.getInt(str16)));
        }
        java.lang.String str17 = FIELD_DISC_NUMBER;
        if (bundle.containsKey(str17)) {
            builder.setDiscNumber(java.lang.Integer.valueOf(bundle.getInt(str17)));
        }
        java.lang.String str18 = FIELD_TOTAL_DISC_COUNT;
        if (bundle.containsKey(str18)) {
            builder.setTotalDiscCount(java.lang.Integer.valueOf(bundle.getInt(str18)));
        }
        java.lang.String str19 = FIELD_MEDIA_TYPE;
        if (bundle.containsKey(str19)) {
            builder.setMediaType(java.lang.Integer.valueOf(bundle.getInt(str19)));
        }
        java.util.ArrayList<java.lang.String> stringArrayList = bundle.getStringArrayList(FIELD_SUPPORTED_COMMANDS);
        if (stringArrayList != null) {
            builder.setSupportedCommands(stringArrayList);
        }
        return builder.build();
    }

    public android.os.Bundle toBundle(int i3) {
        android.os.Bundle bundle = new android.os.Bundle();
        java.lang.CharSequence charSequence = this.title;
        if (charSequence != null) {
            bundle.putCharSequence(FIELD_TITLE, charSequence);
        }
        java.lang.CharSequence charSequence2 = this.artist;
        if (charSequence2 != null) {
            bundle.putCharSequence(FIELD_ARTIST, charSequence2);
        }
        java.lang.CharSequence charSequence3 = this.albumTitle;
        if (charSequence3 != null) {
            bundle.putCharSequence(FIELD_ALBUM_TITLE, charSequence3);
        }
        java.lang.CharSequence charSequence4 = this.albumArtist;
        if (charSequence4 != null) {
            bundle.putCharSequence(FIELD_ALBUM_ARTIST, charSequence4);
        }
        java.lang.CharSequence charSequence5 = this.displayTitle;
        if (charSequence5 != null) {
            bundle.putCharSequence(FIELD_DISPLAY_TITLE, charSequence5);
        }
        java.lang.CharSequence charSequence6 = this.subtitle;
        if (charSequence6 != null) {
            bundle.putCharSequence(FIELD_SUBTITLE, charSequence6);
        }
        java.lang.CharSequence charSequence7 = this.description;
        if (charSequence7 != null) {
            bundle.putCharSequence(FIELD_DESCRIPTION, charSequence7);
        }
        java.lang.Long l2 = this.durationMs;
        if (l2 != null) {
            bundle.putLong(FIELD_DURATION_MS, l2.longValue());
        }
        byte[] bArr = this.artworkData;
        if (bArr != null) {
            if (i3 >= 9) {
                if (this.bundleableArtworkData == null) {
                    this.bundleableArtworkData = new androidx.media3.common.BundleableByteArray(this.artworkData);
                }
                bundle.putBundle(FIELD_ARTWORK_DATA, this.bundleableArtworkData.toBundle());
            } else if (bArr.length <= LEGACY_ARTWORK_DATA_ARRAY_SIZE_LIMIT) {
                bundle.putByteArray(FIELD_ARTWORK_DATA, bArr);
            }
        }
        android.net.Uri uri = this.artworkUri;
        if (uri != null) {
            bundle.putParcelable(FIELD_ARTWORK_URI, uri);
        }
        java.lang.CharSequence charSequence8 = this.writer;
        if (charSequence8 != null) {
            bundle.putCharSequence(FIELD_WRITER, charSequence8);
        }
        java.lang.CharSequence charSequence9 = this.composer;
        if (charSequence9 != null) {
            bundle.putCharSequence(FIELD_COMPOSER, charSequence9);
        }
        java.lang.CharSequence charSequence10 = this.conductor;
        if (charSequence10 != null) {
            bundle.putCharSequence(FIELD_CONDUCTOR, charSequence10);
        }
        java.lang.CharSequence charSequence11 = this.genre;
        if (charSequence11 != null) {
            bundle.putCharSequence(FIELD_GENRE, charSequence11);
        }
        java.lang.CharSequence charSequence12 = this.compilation;
        if (charSequence12 != null) {
            bundle.putCharSequence(FIELD_COMPILATION, charSequence12);
        }
        java.lang.CharSequence charSequence13 = this.station;
        if (charSequence13 != null) {
            bundle.putCharSequence(FIELD_STATION, charSequence13);
        }
        androidx.media3.common.Rating rating = this.userRating;
        if (rating != null) {
            bundle.putBundle(FIELD_USER_RATING, rating.toBundle());
        }
        androidx.media3.common.Rating rating2 = this.overallRating;
        if (rating2 != null) {
            bundle.putBundle(FIELD_OVERALL_RATING, rating2.toBundle());
        }
        java.lang.Integer num = this.trackNumber;
        if (num != null) {
            bundle.putInt(FIELD_TRACK_NUMBER, num.intValue());
        }
        java.lang.Integer num2 = this.totalTrackCount;
        if (num2 != null) {
            bundle.putInt(FIELD_TOTAL_TRACK_COUNT, num2.intValue());
        }
        java.lang.Integer num3 = this.folderType;
        if (num3 != null) {
            bundle.putInt(FIELD_FOLDER_TYPE, num3.intValue());
        }
        java.lang.Boolean bool = this.isBrowsable;
        if (bool != null) {
            bundle.putBoolean(FIELD_IS_BROWSABLE, bool.booleanValue());
        }
        java.lang.Boolean bool2 = this.isPlayable;
        if (bool2 != null) {
            bundle.putBoolean(FIELD_IS_PLAYABLE, bool2.booleanValue());
        }
        java.lang.Integer num4 = this.recordingYear;
        if (num4 != null) {
            bundle.putInt(FIELD_RECORDING_YEAR, num4.intValue());
        }
        java.lang.Integer num5 = this.recordingMonth;
        if (num5 != null) {
            bundle.putInt(FIELD_RECORDING_MONTH, num5.intValue());
        }
        java.lang.Integer num6 = this.recordingDay;
        if (num6 != null) {
            bundle.putInt(FIELD_RECORDING_DAY, num6.intValue());
        }
        java.lang.Integer num7 = this.releaseYear;
        if (num7 != null) {
            bundle.putInt(FIELD_RELEASE_YEAR, num7.intValue());
        }
        java.lang.Integer num8 = this.releaseMonth;
        if (num8 != null) {
            bundle.putInt(FIELD_RELEASE_MONTH, num8.intValue());
        }
        java.lang.Integer num9 = this.releaseDay;
        if (num9 != null) {
            bundle.putInt(FIELD_RELEASE_DAY, num9.intValue());
        }
        java.lang.Integer num10 = this.discNumber;
        if (num10 != null) {
            bundle.putInt(FIELD_DISC_NUMBER, num10.intValue());
        }
        java.lang.Integer num11 = this.totalDiscCount;
        if (num11 != null) {
            bundle.putInt(FIELD_TOTAL_DISC_COUNT, num11.intValue());
        }
        java.lang.Integer num12 = this.artworkDataType;
        if (num12 != null) {
            bundle.putInt(FIELD_ARTWORK_DATA_TYPE, num12.intValue());
        }
        java.lang.Integer num13 = this.mediaType;
        if (num13 != null) {
            bundle.putInt(FIELD_MEDIA_TYPE, num13.intValue());
        }
        if (!this.supportedCommands.isEmpty()) {
            bundle.putStringArrayList(FIELD_SUPPORTED_COMMANDS, new java.util.ArrayList<>(this.supportedCommands));
        }
        android.os.Bundle bundle2 = this.extras;
        if (bundle2 != null) {
            bundle.putBundle(FIELD_EXTRAS, bundle2);
        }
        return bundle;
    }
}
