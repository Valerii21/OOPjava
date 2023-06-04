package services;

import java.util.ArrayList;

import models.Movie;

//*интерф получения списка фильмов*/
public interface IDataService {
    ArrayList<Movie> GetAllMovies();
}
