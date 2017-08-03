package beans;

import model.User;

import javax.annotation.PostConstruct;
import javax.enterprise.context.SessionScoped;
import javax.inject.Named;
import java.io.Serializable;
import java.util.Date;

@Named
@SessionScoped
public class UserBean implements Serializable {
    private User user;

    @PostConstruct
    public void init() {
        user = new User();
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public void clear() {
        user = new User();
    }

    public String apply() {
        return "showuser";
    }

}
