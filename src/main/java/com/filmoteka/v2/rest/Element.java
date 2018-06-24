package com.filmoteka.v2.rest;

public class Element {
    private Long id;
    private String polishTitle;
    private String originalTitle;
    private String photoUrl;
    private String cast;
    private Integer year;
    private Integer duration;
    private String countries;
    private String genre;
    private String plot;
    private String description;
    private String episodes;
    private String seasons;
    private String type;

    public Element(){}

    public Element(Long id, String polishTitle, String originalTitle, String photoUrl,
                   String cast, Integer year, Integer duration, String countries,
                   String genre, String plot, String description, String episodes, String seasons, String type) {
        this.id = id;
        this.polishTitle = polishTitle;
        this.originalTitle = originalTitle;
        this.photoUrl = photoUrl;
        this.cast = cast;
        this.year = year;
        this.duration = duration;
        this.countries = countries;
        this.genre = genre;
        this.plot = plot;
        this.description = description;
        this.episodes = episodes;
        this.seasons = seasons;
        this.type = type;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getPolishTitle() {
        return polishTitle;
    }

    public void setPolishTitle(String polishTitle) {
        this.polishTitle = polishTitle;
    }

    public String getOriginalTitle() {
        return originalTitle;
    }

    public void setOriginalTitle(String originalTitle) {
        this.originalTitle = originalTitle;
    }

    public String getPhotoUrl() {
        return photoUrl;
    }

    public void setPhotoUrl(String photoUrl) {
        this.photoUrl = photoUrl;
    }

    public String getCast() {
        return cast;
    }

    public void setCast(String cast) {
        this.cast = cast;
    }

    public Integer getYear() {
        return year;
    }

    public void setYear(Integer year) {
        this.year = year;
    }

    public Integer getDuration() {
        return duration;
    }

    public void setDuration(Integer duration) {
        this.duration = duration;
    }

    public String getCountries() {
        return countries;
    }

    public void setCountries(String countries) {
        this.countries = countries;
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    public String getPlot() {
        return plot;
    }

    public void setPlot(String plot) {
        this.plot = plot;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getEpisodes() {
        return episodes;
    }

    public void setEpisodes(String episodes) {
        this.episodes = episodes;
    }

    public String getSeasons() {
        return seasons;
    }

    public void setSeasons(String seasons) {
        this.seasons = seasons;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }
}
