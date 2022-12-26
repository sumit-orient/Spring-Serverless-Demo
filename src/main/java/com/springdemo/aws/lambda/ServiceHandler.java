package com.springdemo.aws.lambda;
import java.util.Map;
import com.amazonaws.services.lambda.runtime.Context;
import com.amazonaws.services.lambda.runtime.RequestHandler;

public class ServiceHandler implements RequestHandler<Map<String,Object>, Object> {

    @Override
    public Object handleRequest(Map<String,Object> input, Context context) {
    	System.out.println(input);
        return "This is Demo Hello World";
    }
}