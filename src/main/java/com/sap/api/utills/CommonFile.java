package com.sap.api.utills;

import com.sap.api.mode.Employee;
import com.sap.api.mode.LogIn;
import com.sap.api.mode.UserData;
import com.sap.api.mode.ResponseData;


public class CommonFile {

    public static Employee getEmp(){
       return new Employee(1, "Sap3", "0234455678");
    }

    public static ResponseData response(LogIn logIn) {
        UserData res = new UserData();
        ResponseData responseData = new ResponseData();

        if (logIn.getUserName().equals("bilal") && logIn.getPassword().equals("123")) {
            res.setToken("asfdsdhweqrtrwhadfdfhw");
            res.setUserName(logIn.getUserName());
            res.setToken_type("JSON");
            responseData.setCode("12345wert");
            responseData.setMessage("This is an API test for Java configuration:");
            responseData.setData(res);
            return responseData;
        }

        return responseData; // Returning the responseData, even if credentials are invalid
    }
}
