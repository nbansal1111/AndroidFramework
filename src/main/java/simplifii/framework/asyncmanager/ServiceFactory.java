package simplifii.framework.asyncmanager;

import android.content.Context;


public class ServiceFactory {

    public static Service getInstance(Context context, int taskCode) {
        Service service = null;
        switch (taskCode) {
            default:
                service = new HttpRestService();
                break;

        }
        return service;
    }

}
