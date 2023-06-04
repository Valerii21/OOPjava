package controllers;

import models.User;
import models.UserRequest;
import services.IFilmService;
import services.IRentService;
import views.UserView;
//*Контроллер реализующий подачу от пользователя заявки на фильм*/
public class UserController {
    
    private User user;
    private IRentService rentSrv;
    private UserView userView;

//*Конструктор формирует пользователя  */
    public UserController(User user, IRentService rentSrv) {
        this.user = user;
        this.rentSrv = rentSrv;
        userView = new UserView();
    }

//*метод точка входа, принимает выбор пользователя из 1 меню */
    public void Run(int choose){
        if(choose == 1)
            submitRequest();
        if(choose == 2)
            returnMovie();
    }
//*Подать заявку на фильм*/
    void submitRequest(){
        var movieName = userView.showSubmitMenu();
        rentSrv.ProcessRequest(createRequest(movieName));
    }

    void returnMovie(){
        var movieName = userView.showReturnMenu();
        rentSrv.returnMovie(createRequest(movieName));
    }

    private UserRequest createRequest(String movieName){
        UserRequest req = new UserRequest();
        req.setMovieName(movieName);
        req.setUser(user);
        return req;
    }
}
