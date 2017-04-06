package song.mvc.ajax.controller;

import com.fasterxml.jackson.annotation.JsonView;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import song.mvc.ajax.domain.AjaxResponseBody;
import song.mvc.ajax.model.Address;
import song.mvc.ajax.model.SearchCriteria;
import song.mvc.ajax.model.User;
import song.mvc.ajax.view.InfoView;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by xinyu on 4/5/2017.
 */
@RestController
@RequestMapping("/api")
public class AjaxController {

    private static List<User> user_list = new ArrayList<User>() {{
        add(new User("haha", "1234", "song@hot.com", "3474201329",
                LocalDate.of(2000, 01, 29), new Address(123, "main st", "Tulsa", "OK", 74066)));
        add(new User("test1", "4567", "test@test.com", "9174201000",
                LocalDate.of(1999, 11, 20), new Address(893, "center rd", "Duluth", "GA", 30097)));
        add(new User("song", "9234", "song@hot.com", "6464201009",
                LocalDate.of(1980, 03, 9), new Address(3, "deal st", "Sapulpa", "NY", 11378)));
    }};

    @JsonView(InfoView.PublicView.class)
    @RequestMapping("/public-search")
    public AjaxResponseBody publicSearch(@RequestBody SearchCriteria search) {
        return search(search);
    }

    @JsonView(InfoView.DetailView.class)
    @RequestMapping("/public-detail")
    public AjaxResponseBody publicDetail(@RequestBody SearchCriteria search) {
        return search(search);
    }

    private AjaxResponseBody search(SearchCriteria search) {
        AjaxResponseBody result = new AjaxResponseBody();

        List<User> users = findUsers(search);
        if (users.size() > 0) {
            result.setCode("200");
            result.setMessage("");
            result.setResult(users);
        } else {
            result.setCode("204");
            result.setMessage("Found no user");
        }
        return result;
    }

    private List<User> findUsers(SearchCriteria search) {
        List<User> result = new ArrayList<User>();
        for (User user : user_list) {
            if (user.getUserName().equalsIgnoreCase(search.getUsername())) {
                result.add(user);
            } else if (user.getEmail().equalsIgnoreCase(search.getEmail())) {
                result.add(user);
            }
        }
        return result;
    }
}
