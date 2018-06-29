/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package service;

import javax.jws.WebService;
import javax.jws.WebMethod;
import javax.jws.WebParam;

/**
 *
 * @author LisCL
 */
@WebService(serviceName = "service")
public class service {

    /**
     * Web service operation
     */
    @WebMethod(operationName = "elapas")
    public Integer elapas(@WebParam(name = "id") int id) {
        int deuda=0;
        //TODO write your implementation code here:
        if(id == 1)deuda=50;
        if(id == 2)deuda=25;
        if(id == 3)deuda=75;
        if(id == 4)deuda=100;
        if(id == 5)deuda=50;
        return deuda;
    }

    /**
     * Web service operation
     */
    @WebMethod(operationName = "cessa")
    public Integer cessa(@WebParam(name = "id") int id) {
        int deuda=0;
        //TODO write your implementation code here:
        if(id == 1)deuda=100;
        if(id == 2)deuda=0;
        if(id == 3)deuda=115;
        if(id == 4)deuda=50;
        if(id == 5)deuda=25;
        return deuda;
    }
}
