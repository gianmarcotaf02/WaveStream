package org.videolan.libvlc.util;

/* JADX INFO: loaded from: classes4.dex */
public class Extensions {
    public static final java.util.HashSet<java.lang.String> AUDIO;
    public static final java.util.HashSet<java.lang.String> PLAYLIST;
    public static final java.util.HashSet<java.lang.String> SUBTITLES;
    public static final java.util.HashSet<java.lang.String> VIDEO;

    static {
        java.util.HashSet<java.lang.String> hashSet = new java.util.HashSet<>();
        VIDEO = hashSet;
        java.util.HashSet<java.lang.String> hashSet2 = new java.util.HashSet<>();
        AUDIO = hashSet2;
        java.util.HashSet<java.lang.String> hashSet3 = new java.util.HashSet<>();
        SUBTITLES = hashSet3;
        java.util.HashSet<java.lang.String> hashSet4 = new java.util.HashSet<>();
        PLAYLIST = hashSet4;
        hashSet.addAll(java.util.Arrays.asList(".3g2", ".3gp", ".3gp2", ".3gpp", ".amv", ".asf", ".avi", ".bik", ".divx", ".drc", ".dv", ".f4v", ".flv", ".gvi", ".gxf", ".h264", ".ismv", ".iso", ".m1v", ".m2v", ".m2t", ".m2ts", ".m4v", ".mkv", ".mov", ".mp2", ".mp2v", ".mp4", ".mp4v", ".mpe", ".mpeg", ".mpeg1", ".mpeg2", ".mpeg4", ".mpg", ".mpv2", ".mts", ".mtv", ".mxf", ".mxg", ".nsv", ".nut", ".nuv", ".ogm", ".ogv", ".ogx", ".ps", ".rec", ".rm", ".rmvb", ".rpl", ".thp", ".tod", ".ts", ".tts", ".vob", ".vro", ".webm", ".wm", ".wmv", ".wtv", ".xesc"));
        hashSet2.addAll(java.util.Arrays.asList(".3ga", ".669", ".a52", ".aac", ".ac3", ".adt", ".adts", ".aif", ".aifc", ".aiff", ".alac", ".amr", ".aob", ".ape", ".au", ".awb", ".caf", ".dts", ".flac", ".it", ".m4a", ".m4b", ".m4p", ".mid", ".mka", ".mlp", ".mod", ".mpa", ".mp1", ".mp2", ".mp3", ".mpc", ".mpga", ".oga", ".ogg", ".oma", ".opus", ".qcp", ".ra", ".ram", ".rmi", ".s3m", ".snd", ".spx", ".tta", ".voc", ".vqf", ".w64", ".wav", ".wma", ".wv", ".xa", ".xm"));
        hashSet3.addAll(java.util.Arrays.asList(".idx", ".sub", ".srt", ".ssa", ".ass", ".smi", ".utf", ".utf8", ".utf-8", ".rt", ".aqt", ".txt", ".usf", ".jss", ".cdg", ".psb", ".mpsub", ".mpl2", ".pjs", ".dks", ".stl", ".vtt", ".ttml", ".mks"));
        hashSet4.addAll(java.util.Arrays.asList(".m3u", ".asx", ".b4s", ".pls", ".xspf", ".wpl"));
    }
}
