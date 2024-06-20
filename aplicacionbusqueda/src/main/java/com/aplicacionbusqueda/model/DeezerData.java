package com.aplicacionbusqueda.model;

public class DeezerData {
    private String title;
    private String preview;
    private DeezerArtist artist;

    public DeezerData() {
    }

    public DeezerData(String title, String preview, DeezerArtist artist) {
        this.title = title;
        this.preview = preview;
        this.artist = artist;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getPreview() {
        return preview;
    }

    public void setPreview(String preview) {
        this.preview = preview;
    }

    public DeezerArtist getArtist() {
        return artist;
    }

    public void setArtist(DeezerArtist artist) {
        this.artist = artist;
    }

    @Override
    public String toString() {
        return "DeezerData{" +
                "title='" + title + '\'' +
                ", preview='" + preview + '\'' +
                ", artist=" + artist +
                '}';
    }
}
