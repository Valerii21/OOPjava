package controllers;

import java.util.ArrayList;

import models.Role;
import models.User;
import services.IFilmService;
import services.IRentService;
import services.RentService;
import views.MainView;

//*Компонента контроллер*/
public class NeflixController {
    IRentService rentSrv;//экземпляр 
    IFilmService filmSrv;//экземпляр 
    MainView view;//экземпляр 
    private User user;

//*Конструктор присваевает view новый конструктор*/
    public NeflixController() {
        view = new MainView();
    }    
//*метод точка входа, */
    public void Run(){
        var name = view.authorize();
        if(isAdmin(name))
            adminMenu();
        else
            userMenu();
    }
    //*метод реализует логику проверки пользователя*/
    private void userMenu() {
        var num = view.showUserMenu();
        var ctrl = new UserController(user, new RentService());
        ctrl.Run(num);
    }

    private void adminMenu(){
        var num = view.showAdminMenu();
    }
//*Метод проверки пользователя с таким именем и ролью*/
    private boolean isAdmin(String name){
        var list = getUsers();
        for (User user : list) {
            if(user.getName().equals(name))
            {
                this.user = user;
                return user.getRole().equals(Role.admin);
            }
        }
        throw new NullPointerException("Пользователь не найден");
    }
//*Метод получения всех пользователей*/
    private ArrayList<User> getUsers(){
        ArrayList<User> list = new ArrayList<>();
        list.add(new User("Admin", Role.admin, 9999999, (byte)0));
        list.add(new User("User", Role.user, 100, (byte)0));
        return list;
    }
}
