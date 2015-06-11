package com.ideamart.sms;


import com.ideamart.entity.Receive;
import com.ideamart.service.DataService;
import hms.kite.samples.api.sms.MoSmsListener;
import hms.kite.samples.api.sms.messages.MoSmsReq;
import org.springframework.beans.BeansException;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 * Created by chathura on 6/11/15.
 */
public class SampleClient implements MoSmsListener,ApplicationContextAware {
    private final static Logger LOGGER =Logger.getLogger(SampleClient.class.getName());

    private static ApplicationContext context;
    private DataService dataService;

    @Override
    public void init() {

    }

    @Override
    public void onReceivedSms(MoSmsReq moSmsReq) {
        LOGGER.info("Mo request received. Message:" + moSmsReq.getMessage() + " Sender:" + moSmsReq.getSourceAddress());
        dataService = (DataService) context.getBean("dataService");
        try{
        Receive receive = new Receive();
        receive.setApplicationId(moSmsReq.getApplicationId());
        receive.setSourceAddress(moSmsReq.getSourceAddress());
        receive.setMessage(moSmsReq.getMessage());
        receive.setRequestId(moSmsReq.getRequestId());
        receive.setEncoding(moSmsReq.getEncoding());
        receive.setVersion(moSmsReq.getVersion());
            LOGGER.info(""+receive.getMessage()+"-"+receive.getSourceAddress());
        dataService.insertRow(receive);

        }
        catch(Exception e){
            LOGGER.log(Level.INFO, "Unexpected error occurred", e);
        }
    }


    @Override
    public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
        System.out.println(" fucking reun.......................");
        this.context = applicationContext;
    }

    public DataService getDataService() {
        return dataService;
    }

    public void setDataService(DataService dataService) {
        this.dataService = dataService;
    }
}
