package com.kiptv.core.model;

/* JADX INFO: renamed from: com.kiptv.core.model.d0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC1938d0 extends java.lang.Exception {
    public final java.lang.String a() {
        if (this instanceof com.kiptv.core.model.X) {
            return "player.openSubtitlesError.invalidCredentials";
        }
        if (this instanceof com.kiptv.core.model.W) {
            return "player.openSubtitlesError.forbidden";
        }
        if (this instanceof com.kiptv.core.model.C1932a0) {
            return "player.openSubtitles.quotaExceeded";
        }
        if (this instanceof com.kiptv.core.model.Y) {
            return "player.openSubtitlesError.invalidFile";
        }
        if (this instanceof com.kiptv.core.model.Z) {
            return "player.openSubtitlesError.invalidToken";
        }
        if (this instanceof com.kiptv.core.model.V) {
            return "player.openSubtitlesError.linkExpired";
        }
        if (this instanceof com.kiptv.core.model.C1934b0) {
            return "player.openSubtitlesError.rateLimit";
        }
        if (this instanceof com.kiptv.core.model.C1936c0) {
            return "player.openSubtitlesError.serverError";
        }
        throw new I3.b();
    }
}
