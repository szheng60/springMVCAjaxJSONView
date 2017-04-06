package song.mvc.ajax.domain;

import com.fasterxml.jackson.annotation.JsonView;
import song.mvc.ajax.model.User;
import song.mvc.ajax.view.InfoView;

import java.util.List;

/**
 * Created by xinyu on 4/5/2017.
 */
public class AjaxResponseBody {
    @JsonView(InfoView.PublicView.class)
    private String message;

    @JsonView(InfoView.PublicView.class)
    private String code;

    @JsonView(InfoView.PublicView.class)
    List<User> result;


    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public List<User> getResult() {
        return result;
    }

    public void setResult(List<User> result) {
        this.result = result;
    }

    @Override
    public String toString() {
        return "AjaxResponseBody{" +
                "message='" + message + '\'' +
                ", code='" + code + '\'' +
                ", result=" + result +
                '}';
    }
}
