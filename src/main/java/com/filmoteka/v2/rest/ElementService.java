package com.filmoteka.v2.rest;

import info.talacha.filmweb.api.FilmwebApi;
import info.talacha.filmweb.models.Film;
import info.talacha.filmweb.models.Series;
import info.talacha.filmweb.search.models.FilmSearchResult;

import java.util.ArrayList;
import java.util.List;

public class ElementService {

    public static List<Element> getAllElements(String value) {
        List<Element> elementList = new ArrayList<>();
        FilmwebApi filmwebApi = new FilmwebApi();
        List<FilmSearchResult> filmInfoList = filmwebApi.findFilm(value);
        List<FilmSearchResult> seriesInfoList = filmwebApi.findSeries(value);
        Film movieInfo = new Film();
        Series seriesInfo = new Series();
        List<String> descriptions = new ArrayList<>();

        for(FilmSearchResult movie : filmInfoList) {
            try {
                movieInfo = filmwebApi.getFilmData(movie.getId());
                descriptions = filmwebApi.getDescriptions(movie.getId());
            } catch (Exception e) {
                e.printStackTrace();
            } finally {
                elementList.add(new Element(movie.getId(), movie.getPolishTitle(), movie.getTitle(), changePhoto(movie.getImageURL(), "6"),
                        movie.getCast(), movie.getYear(), movieInfo.getDuration(), movieInfo.getCountries(),
                        movieInfo.getGenre(), movieInfo.getPlot(), joinDescriptions(descriptions), null, null,
                        ElementType.MOVIE.toString()));
            }
        }

        for(FilmSearchResult series : seriesInfoList) {
            try {
                seriesInfo = filmwebApi.getSeriesData(series.getId());
                descriptions = filmwebApi.getDescriptions(series.getId());
            } catch (Exception e) {
                e.printStackTrace();
            } finally {
                elementList.add(new Element(series.getId(), series.getPolishTitle(), series.getTitle(), changePhoto(series.getImageURL(), "6"),
                        series.getCast(), series.getYear(), seriesInfo.getDuration(), seriesInfo.getCountries(),
                        seriesInfo.getGenre(), seriesInfo.getPlot(), joinDescriptions(descriptions), null, null,
                        ElementType.SERIES.toString()));
            }
        }
        return elementList;
    }

    private static String joinDescriptions(List<String> list) {
        StringBuilder stringBuilder = new StringBuilder();
        int i = 0;
        for(String description : list) {
            if(i++ == list.size() - 1) {
                stringBuilder.append(description);
            } else {
                stringBuilder.append(description);
                stringBuilder.append(" ");
            }
        }
        return stringBuilder.toString();
    }

    private static String changePhoto(String photo, String photoSize) {
        StringBuilder image = new StringBuilder();
        String[] imageParts;

        imageParts = photo.split("\\.");
        imageParts[imageParts.length - 2] = photoSize;
        image.append(imageParts[0]);

        for(int i = 0; i < imageParts.length - 1; i++){
            image.append(".").append(imageParts[i + 1]);
        }
        return image.toString();
    }
}
