package services;

import models.Movie;
//*интерфейс Фильмотека реализует методы получения фильма, его добавление,редактирование и удаление*/
public interface IFilmService {
    Movie getMovie(String movieName);//возвращает обьект Фильм
    void addMovie(Movie movie);
    void editMovie(Movie movie);
    void deleteMovie(Movie movie);    
}
