package cl.com.ccla.bean;

import cl.com.ccla.type.InitMpeTbkVO;
import cl.com.ccla.type.InitVO;
import cl.com.ccla.type.TransactionResultOutput;
import cl.com.ccla.webservice.TbkWS;
import cl.com.ccla.webservice.TbkWS_Service;

import java.net.MalformedURLException;
import java.net.URL;

import javax.xml.namespace.QName;
import javax.xml.ws.WebServiceRef;

public class MpeServiceTbk {
    public MpeServiceTbk() {
        super();
    }
    @WebServiceRef
    private static TbkWS_Service tbkWS_Service;

    public InitVO InitService(InitMpeTbkVO initVo){
            String url = "http://172.29.206.197:8080/TbkAppv1/TbkWS";
            
            
            URL nuevaUrl=null;
              try {
                nuevaUrl = new URL(url);
                } catch (MalformedURLException e) {
                   e.printStackTrace();
                }
     
            tbkWS_Service = new TbkWS_Service(nuevaUrl,new QName("http://ws/", "TbkWS"));
            TbkWS tbkWS = tbkWS_Service.getTbkWSPort();
            InitVO initTbk = tbkWS.initTbk(initVo);
            System.out.println(initTbk.getToken());
            System.out.println(initTbk.getUrl());
                
            return initTbk;
        }  
    
    public TransactionResultOutput getResult(String token){
        
            String url = "http://172.29.206.197:8080/TbkAppv1/TbkWS";
            
            
            URL nuevaUrl=null;
              try {
                nuevaUrl = new URL(url);
                } catch (MalformedURLException e) {
                   e.printStackTrace();
                }
              
            TransactionResultOutput tr=new TransactionResultOutput();
            tbkWS_Service = new TbkWS_Service(nuevaUrl,new QName("http://ws/", "TbkWS"));
            TbkWS tbkWS = tbkWS_Service.getTbkWSPort();
               tr = tbkWS.getResultado(token);
                // Add your code to call the desired methods.
                  return tr;
        }  
}
