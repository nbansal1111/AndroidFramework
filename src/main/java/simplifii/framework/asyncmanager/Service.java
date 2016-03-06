package simplifii.framework.asyncmanager;


import simplifii.framework.exceptionhandler.RestException;

import org.json.JSONException;

import java.sql.SQLException;

public interface Service {

    public Object getData(Object... params) throws JSONException, SQLException, NullPointerException, RestException, ClassCastException;


}
