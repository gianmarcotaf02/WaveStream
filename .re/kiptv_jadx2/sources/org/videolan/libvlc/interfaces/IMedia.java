package org.videolan.libvlc.interfaces;

import android.net.Uri;

public interface IMedia extends IVLCObject<Event> {

    public static class AudioTrack extends Track {
        public final int channels;
        public final int rate;

        public AudioTrack(String str, String str2, boolean z6, String str3, String str4, int i3, int i9, int i10, int i11, String str5, String str6, int i12, int i13) {
            super(0, str, str2, z6, str3, str4, i3, i9, i10, i11, str5, str6);
            this.channels = i12;
            this.rate = i13;
        }
    }

    public static class Event extends AbstractVLCEvent {
        public static final int DurationChanged = 2;
        public static final int MetaChanged = 0;
        public static final int ParsedChanged = 3;
        public static final int SubItemAdded = 1;
        public static final int SubItemTreeAdded = 6;

        public Event(int i3) {
            super(i3);
        }

        public int getMetaId() {
            return (int) this.arg1;
        }

        public int getParsedStatus() {
            return (int) this.arg1;
        }

        public Event(int i3, long j) {
            super(i3, j);
        }
    }

    public interface EventListener extends AbstractVLCEvent.Listener<Event> {
    }

    public static class Meta {
        public static final int Actors = 22;
        public static final int Album = 4;
        public static final int AlbumArtist = 23;
        public static final int Artist = 1;
        public static final int ArtworkURL = 15;
        public static final int Copyright = 3;
        public static final int Date = 8;
        public static final int Description = 6;
        public static final int Director = 18;
        public static final int DiscNumber = 24;
        public static final int EncodedBy = 14;
        public static final int Episode = 20;
        public static final int Genre = 2;
        public static final int Language = 11;
        public static final int MAX = 25;
        public static final int NowPlaying = 12;
        public static final int Publisher = 13;
        public static final int Rating = 7;
        public static final int Season = 19;
        public static final int Setting = 9;
        public static final int ShowName = 21;
        public static final int Title = 0;
        public static final int TrackID = 16;
        public static final int TrackNumber = 5;
        public static final int TrackTotal = 17;
        public static final int URL = 10;
    }

    public static class Parse {
        public static final int DoInteract = 32;
        public static final int FetchLocal = 8;
        public static final int FetchNetwork = 16;
        public static final int ParseForced = 4;
        public static final int ParseLocal = 1;
        public static final int ParseNetwork = 2;
    }

    public static class ParsedStatus {
        public static final int Done = 4;
        public static final int Failed = 2;
        public static final int Skipped = 1;
        public static final int Timeout = 3;
    }

    public static class Slave {
        public final int priority;
        public final int type;
        public final String uri;

        public static class Type {
            public static final int Audio = 1;
            public static final int Subtitle = 0;
        }

        public Slave(int i3, int i9, String str) {
            this.type = i3;
            this.priority = i9;
            this.uri = str;
        }
    }

    public static class State {
        public static final int Ended = 6;
        public static final int Error = 7;
        public static final int MAX = 8;
        public static final int NothingSpecial = 0;
        public static final int Opening = 1;
        public static final int Paused = 4;
        public static final int Playing = 3;
        public static final int Stopped = 5;
    }

    public static class Stats {
        public final long decodedAudio;
        public final long decodedVideo;
        public final float demuxBitrate;
        public final long demuxCorrupted;
        public final long demuxDiscontinuity;
        public final long demuxReadBytes;
        public final long displayedPictures;
        public final float inputBitrate;
        public final long lostAbuffers;
        public final long lostPictures;
        public final long playedAbuffers;
        public final long readBytes;
        public final float sendBitrate;
        public final long sentBytes;
        public final long sentPackets;

        public Stats(long j, float f9, long j9, float f10, long j10, long j11, long j12, long j13, long j14, long j15, long j16, long j17, long j18, long j19, float f11) {
            this.readBytes = j;
            this.inputBitrate = f9;
            this.demuxReadBytes = j9;
            this.demuxBitrate = f10;
            this.demuxCorrupted = j10;
            this.demuxDiscontinuity = j11;
            this.decodedVideo = j12;
            this.decodedAudio = j13;
            this.displayedPictures = j14;
            this.lostPictures = j15;
            this.playedAbuffers = j16;
            this.lostAbuffers = j17;
            this.sentPackets = j18;
            this.sentBytes = j19;
            this.sendBitrate = f11;
        }
    }

    public static class SubtitleTrack extends Track {
        public final String encoding;

        public SubtitleTrack(String str, String str2, boolean z6, String str3, String str4, int i3, int i9, int i10, int i11, String str5, String str6, String str7) {
            super(2, str, str2, z6, str3, str4, i3, i9, i10, i11, str5, str6);
            this.encoding = str7;
        }
    }

    public static abstract class Track {
        public final int bitrate;
        public final String codec;
        public final String description;
        public final int fourcc;
        public final String id;
        public final String language;
        public final int level;
        public final String name;
        public final String originalCodec;
        public final int profile;
        public final boolean selected;
        public final int type;

        public static class Type {
            public static final int Audio = 0;
            public static final int Text = 2;
            public static final int Unknown = -1;
            public static final int Video = 1;
        }

        public Track(int i3, String str, String str2, boolean z6, String str3, String str4, int i9, int i10, int i11, int i12, String str5, String str6) {
            this.type = i3;
            this.id = str;
            this.name = str2;
            this.selected = z6;
            this.codec = str3;
            this.originalCodec = str4;
            this.fourcc = i9;
            this.profile = i10;
            this.level = i11;
            this.bitrate = i12;
            this.language = str5;
            this.description = str6;
        }
    }

    public static class Type {
        public static final int Directory = 2;
        public static final int Disc = 3;
        public static final int File = 1;
        public static final int Playlist = 5;
        public static final int Stream = 4;
        public static final int Unknown = 0;
    }

    public static class UnknownTrack extends Track {
        public UnknownTrack(String str, String str2, boolean z6, String str3, String str4, int i3, int i9, int i10, int i11, String str5, String str6) {
            super(-1, str, str2, z6, str3, str4, i3, i9, i10, i11, str5, str6);
        }
    }

    public static class VideoTrack extends Track {
        public final int frameRateDen;
        public final int frameRateNum;
        public final int height;
        public final int orientation;
        public final int projection;
        public final int sarDen;
        public final int sarNum;
        public final int width;

        public static final class Orientation {
            public static final int BottomLeft = 2;
            public static final int BottomRight = 3;
            public static final int LeftBottom = 5;
            public static final int LeftTop = 4;
            public static final int RightBottom = 7;
            public static final int RightTop = 6;
            public static final int TopLeft = 0;
            public static final int TopRight = 1;
        }

        public static final class Projection {
            public static final int CubemapLayoutStandard = 256;
            public static final int EquiRectangular = 1;
            public static final int Rectangular = 0;
        }

        public VideoTrack(String str, String str2, boolean z6, String str3, String str4, int i3, int i9, int i10, int i11, String str5, String str6, int i12, int i13, int i14, int i15, int i16, int i17, int i18, int i19) {
            super(1, str, str2, z6, str3, str4, i3, i9, i10, i11, str5, str6);
            this.height = i12;
            this.width = i13;
            this.sarNum = i14;
            this.sarDen = i15;
            this.frameRateNum = i16;
            this.frameRateDen = i17;
            this.orientation = i18;
            this.projection = i19;
        }
    }

    void addOption(String str);

    void addSlave(Slave slave);

    void clearSlaves();

    long getDuration();

    String getMeta(int i3);

    String getMeta(int i3, boolean z6);

    Slave[] getSlaves();

    Stats getStats();

    Track[] getTracks();

    Track[] getTracks(int i3);

    int getType();

    Uri getUri();

    boolean isParsed();

    boolean parse();

    boolean parse(int i3);

    boolean parseAsync();

    boolean parseAsync(int i3);

    boolean parseAsync(int i3, int i9);

    void setDefaultMediaPlayerOptions();

    void setEventListener(EventListener eventListener);

    void setHWDecoderEnabled(boolean z6, boolean z9);

    IMediaList subItems();
}
