package com.kiptv.core.model;

public final class P extends Q {

    public static final P f20013h = new P("Empty playlist");

    public final boolean equals(Object obj) {
        return this == obj || (obj instanceof P);
    }

    public final int hashCode() {
        return -981803560;
    }

    @Override
    public final String toString() {
        return "EmptyPlaylist";
    }
}
